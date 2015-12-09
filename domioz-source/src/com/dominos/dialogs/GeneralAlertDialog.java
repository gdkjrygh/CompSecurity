// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.m;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package com.dominos.dialogs:
//            GeneralAlertDialog_

public class GeneralAlertDialog extends m
{

    private GeneralAlertDialogClickListener mListener;
    String mMessage;
    Button mNeutralButton;
    String mPositiveButtonText;
    LinearLayout mRootLayout;
    ScrollView mScrollView;
    TextView mSummaryTextView;
    String mTitle;
    TextView mTitleTextView;

    public GeneralAlertDialog()
    {
    }

    public static GeneralAlertDialog newInstance(String s, String s1, String s2)
    {
        return GeneralAlertDialog_.builder().mTitle(s).mMessage(s1).mPositiveButtonText(s2).build();
    }

    protected void alertDialogGotItButtonClicked()
    {
        dismiss();
        if (mListener != null)
        {
            mListener.onPositiveButtonClicked();
        }
    }

    protected void onAfterViews()
    {
        mTitleTextView.setText(mTitle);
        mSummaryTextView.setText(mMessage);
        mNeutralButton.setText(mPositiveButtonText);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (mListener != null)
        {
            mListener.onDialogCanceled();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        setRetainInstance(true);
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0e009e);
        return bundle;
    }

    public void onDestroyView()
    {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance())
        {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void setGeneralAlertDialogClickListener(GeneralAlertDialogClickListener generalalertdialogclicklistener)
    {
        mListener = generalalertdialogclicklistener;
    }

    private class GeneralAlertDialogClickListener
    {

        public abstract void onDialogCanceled();

        public abstract void onPositiveButtonClicked();
    }

}
