package main;

import javax.swing.*;
import java.awt.*;
import java.util.logging.*;

public class PlayGame {
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.getLogger(PlayGame.class.getName()).log(Level.SEVERE, null, e);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniGame().setVisible(true);
            }
        });
    }
}
