// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SendTextDialogFragment extends DialogFragment
{
    public static interface SendTextDialogListener
    {

        public abstract void onSendTextCancel();

        public abstract void onSendTextFinished(String s, boolean flag);
    }


    private CheckBox finishAfterSend;
    private SendTextDialogListener mListener;
    private EditText textToSend;

    public SendTextDialogFragment()
    {
    }

    public static SendTextDialogFragment newInstance(String s)
    {
        SendTextDialogFragment sendtextdialogfragment = new SendTextDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", s);
        sendtextdialogfragment.setArguments(bundle);
        return sendtextdialogfragment;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mListener = (SendTextDialogListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement SendTextDialogListener").toString());
        }
    }

    public Dialog onCreateDialog(final Bundle dialog)
    {
        super.onCreate(dialog);
        dialog = new android.app.AlertDialog.Builder(getActivity());
        String s = getArguments().getString("TITLE", getString(0x7f070087));
        View view = getActivity().getLayoutInflater().inflate(0x7f03001f, null);
        textToSend = (EditText)view.findViewById(0x7f0e0059);
        finishAfterSend = (CheckBox)view.findViewById(0x7f0e005a);
        dialog.setTitle(s).setView(view).setPositiveButton(0x7f070086, new android.content.DialogInterface.OnClickListener() {

            final SendTextDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mListener.onSendTextFinished(textToSend.getText().toString(), finishAfterSend.isChecked());
            }

            
            {
                this$0 = SendTextDialogFragment.this;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final SendTextDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mListener.onSendTextCancel();
            }

            
            {
                this$0 = SendTextDialogFragment.this;
                super();
            }
        });
        dialog = dialog.create();
        textToSend.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SendTextDialogFragment this$0;
            final Dialog val$dialog;

            public void onFocusChange(View view1, boolean flag)
            {
                if (flag)
                {
                    dialog.getWindow().setSoftInputMode(5);
                }
            }

            
            {
                this$0 = SendTextDialogFragment.this;
                dialog = dialog1;
                super();
            }
        });
        textToSend.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SendTextDialogFragment this$0;
            final Dialog val$dialog;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    mListener.onSendTextFinished(textToSend.getText().toString(), finishAfterSend.isChecked());
                }
                dialog.dismiss();
                return false;
            }

            
            {
                this$0 = SendTextDialogFragment.this;
                dialog = dialog1;
                super();
            }
        });
        return dialog;
    }



}
