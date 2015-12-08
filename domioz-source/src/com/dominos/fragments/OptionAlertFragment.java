// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.m;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.utils.ViewUtil;

public class OptionAlertFragment extends m
{

    private OnOptionClickListener mClickListener;
    String mMessage;
    String mNegativeButtonText;
    String mNeutralButtonText;
    String mPositiveButtonText;
    String mTitle;

    public OptionAlertFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreateDialog(bundle);
        setRetainInstance(true);
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(mTitle).setIcon(0x7f020144);
        if (StringHelper.isNotEmpty(mMessage))
        {
            bundle.setMessage(mMessage);
        }
        bundle.setPositiveButton(mPositiveButtonText, new _cls1());
        if (!StringHelper.isEmpty(mNegativeButtonText))
        {
            bundle.setNegativeButton(mNegativeButtonText, new _cls2());
        }
        if (!StringHelper.isEmpty(mNeutralButtonText))
        {
            bundle.setNeutralButton(mNeutralButtonText, new _cls3());
        }
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
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

    public void onStart()
    {
        super.onStart();
        ViewUtil.setDialogStyle(getActivity(), getDialog());
    }

    public void setOptionClickListener(OnOptionClickListener onoptionclicklistener)
    {
        mClickListener = onoptionclicklistener;
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final OptionAlertFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (mClickListener != null)
            {
                mClickListener.onPositiveClick();
            }
            dialoginterface.dismiss();
        }

        _cls1()
        {
            this$0 = OptionAlertFragment.this;
            super();
        }

        private class OnOptionClickListener
        {

            public abstract void onNegativeClick();

            public abstract void onNeutralClick();

            public abstract void onPositiveClick();
        }

    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final OptionAlertFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (mClickListener != null)
            {
                mClickListener.onNegativeClick();
            }
            dialoginterface.dismiss();
        }

        _cls2()
        {
            this$0 = OptionAlertFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final OptionAlertFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (mClickListener != null)
            {
                mClickListener.onNeutralClick();
            }
            dialoginterface.dismiss();
        }

        _cls3()
        {
            this$0 = OptionAlertFragment.this;
            super();
        }
    }

}
