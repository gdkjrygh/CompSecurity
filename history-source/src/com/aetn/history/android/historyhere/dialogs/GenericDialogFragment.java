// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenericDialogFragment extends DialogFragment
{

    String mOKBtnText;
    String mText;
    String mTitle;

    public GenericDialogFragment()
    {
        mTitle = null;
        mText = "";
        mOKBtnText = "";
    }

    public Dialog onCreateDialog(final Bundle dialog)
    {
        dialog = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030022, null);
        Object obj = (TextView)view.findViewById(0x7f0a0074);
        TextView textview = (TextView)view.findViewById(0x7f0a0075);
        if (mTitle != null)
        {
            ((TextView) (obj)).setText(mTitle);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        textview.setText(mText);
        obj = (Button)view.findViewById(0x7f0a0071);
        if (!mOKBtnText.isEmpty())
        {
            ((Button) (obj)).setText(mOKBtnText);
        }
        dialog.setView(view);
        dialog = dialog.create();
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final GenericDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                dialog.cancel();
            }

            
            {
                this$0 = GenericDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        return dialog;
    }

    public void setOKBtnText(String s)
    {
        mOKBtnText = s;
    }

    public void setTitleText(String s, String s1)
    {
        mTitle = s;
        mText = s1;
    }
}
