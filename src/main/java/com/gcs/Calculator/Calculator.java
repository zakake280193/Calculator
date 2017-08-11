package com.gcs.Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn7;
	private JButton btnAdd;
	private JButton btnMi;
	private JButton btnMult;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 317, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(6, 72, 66, 51);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(84, 72, 66, 51);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(160, 72, 81, 51);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.setBounds(6, 135, 66, 51);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(84, 135, 66, 51);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(160, 135, 81, 51);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(6, 198, 66, 51);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(84, 198, 66, 51);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(160, 198, 81, 51);
		frame.getContentPane().add(btn3);
		
		btnAdd = new JButton("+");
		btnAdd.setBounds(246, 72, 77, 51);
		frame.getContentPane().add(btnAdd);
		
		btnMi = new JButton("-");
		btnMi.setBounds(246, 135, 77, 51);
		frame.getContentPane().add(btnMi);
		
		btnMult = new JButton("*");
		btnMult.setBounds(246, 198, 77, 51);
		frame.getContentPane().add(btnMult);
		
		button = new JButton("=");
		button.setBounds(160, 261, 163, 70);
		frame.getContentPane().add(button);
	}
}
