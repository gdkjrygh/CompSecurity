// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class GenericAlertDialogFragment extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{
    public static interface AlertDialogFragmentListener
    {

        public abstract void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment);

        public abstract void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment);
    }


    public static final String INVALID_MESSAGE_TEXT = "";
    public static final int INVALID_RESOURCE_ID = 0;
    private View mContentView;
    private AlertDialogFragmentListener mListener;
    private String mMessage;
    private int mMessageResourceId;
    private int mNegativeButtonResourceId;
    private int mPositiveButtonResourceId;
    private int mTitleIconResourceId;
    private int mTitleResourceId;

    public GenericAlertDialogFragment()
    {
        mPositiveButtonResourceId = 0;
        mNegativeButtonResourceId = com.accuweather.android.R.string.Dismiss;
        mTitleResourceId = 0;
        mMessage = "";
        mMessageResourceId = 0;
        mContentView = null;
        mTitleIconResourceId = 0x1080027;
    }

    private void makeButtonHeightsEqual(DialogInterface dialoginterface)
    {
        Object obj = (AlertDialog)dialoginterface;
        dialoginterface = ((AlertDialog) (obj)).getButton(-1);
        obj = ((AlertDialog) (obj)).getButton(-2);
        int i = dialoginterface.getHeight();
        int j = ((Button) (obj)).getHeight();
        dialoginterface.setHeight(Math.max(i, j));
        ((Button) (obj)).setHeight(Math.max(i, j));
    }

    public void hideNegativeButton()
    {
        setNegativeButtonResourceId(0);
    }

    public void hidePositiveButton()
    {
        setPositiveButtonResourceId(0);
    }

    public void hideTitleIcon()
    {
        setTitleIconResourceId(0);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof AlertDialogFragmentListener)
        {
            mListener = (AlertDialogFragmentListener)activity;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (mListener != null)
        {
            mListener.onNegativeClick(this);
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            if (mListener != null)
            {
                switch (i)
                {
                default:
                    mListener.onNegativeClick(this);
                    break;

                case -1: 
                    break label0;
                }
            }
            return;
        }
        mListener.onPositiveClick(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        if (mTitleIconResourceId != 0)
        {
            bundle.setIcon(mTitleIconResourceId);
        }
        if (mTitleResourceId != 0)
        {
            bundle.setTitle(mTitleResourceId);
        }
        if (mPositiveButtonResourceId != 0)
        {
            bundle.setPositiveButton(mPositiveButtonResourceId, this);
        }
        if (mNegativeButtonResourceId != 0)
        {
            bundle.setNegativeButton(mNegativeButtonResourceId, this);
        }
        if (mMessageResourceId == 0) goto _L2; else goto _L1
_L1:
        bundle.setMessage(mMessageResourceId);
_L4:
        if (mContentView != null)
        {
            bundle.setView(mContentView);
        }
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
        if (mPositiveButtonResourceId != 0 && mNegativeButtonResourceId != 0)
        {
            bundle.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

                final GenericAlertDialogFragment this$0;

                public void onShow(DialogInterface dialoginterface)
                {
                    makeButtonHeightsEqual(dialoginterface);
                }

            
            {
                this$0 = GenericAlertDialogFragment.this;
                super();
            }
            });
        }
        return bundle;
_L2:
        if (!mMessage.equals(""))
        {
            bundle.setMessage(mMessage);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setContentView(View view)
    {
        mContentView = view;
    }

    public void setMessage(String s)
    {
        mMessage = s;
    }

    public void setMessageResourceId(int i)
    {
        mMessageResourceId = i;
    }

    public void setNegativeButtonResourceId(int i)
    {
        mNegativeButtonResourceId = i;
    }

    public void setPositiveButtonResourceId(int i)
    {
        mPositiveButtonResourceId = i;
    }

    public void setTitleIconResourceId(int i)
    {
        mTitleIconResourceId = i;
    }

    public void setTitleResourceId(int i)
    {
        mTitleResourceId = i;
    }

    public int show(FragmentTransaction fragmenttransaction, String s)
    {
        int i;
        try
        {
            i = super.show(fragmenttransaction, s);
        }
        // Misplaced declaration of an exception variable
        catch (FragmentTransaction fragmenttransaction)
        {
            return -1;
        }
        return i;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        try
        {
            super.show(fragmentmanager, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManager fragmentmanager)
        {
            return;
        }
    }

}
