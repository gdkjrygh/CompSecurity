// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.text.Html;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.utils.ViewUtil;

public class AlertDialogFragment extends m
{

    private static final int MESSAGE_VIEW_PADDING = 15;
    private android.app.AlertDialog.Builder mBuilder;
    boolean mCancelable;
    String mMessage;
    boolean mMessageScrollable;
    private OnAlertDialogListener mOnAlertDialogListener;
    String mTitle;

    public AlertDialogFragment()
    {
    }

    protected android.app.AlertDialog.Builder getBuilder()
    {
        return mBuilder;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (mOnAlertDialogListener != null)
        {
            mOnAlertDialogListener.onAlertDismiss();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        setRetainInstance(true);
        mBuilder = (new android.app.AlertDialog.Builder(getActivity())).setTitle(mTitle).setCancelable(mCancelable).setIcon(0x7f020144).setNeutralButton(getActivity().getString(0x7f0801c4), new _cls1());
        if (!mMessageScrollable) goto _L2; else goto _L1
_L1:
        bundle = new TextView(getActivity());
        bundle.setPadding(15, 15, 15, 15);
        bundle.setText(Html.fromHtml(mMessage));
        ScrollView scrollview = new ScrollView(getActivity());
        scrollview.addView(bundle);
        mBuilder.setView(scrollview);
_L4:
        return mBuilder.create();
_L2:
        if (StringHelper.isNotEmpty(mMessage))
        {
            mBuilder.setMessage(mMessage);
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        ViewUtil.setDialogStyle(getActivity(), getDialog());
    }

    public void setOnAlertDismissListener(OnAlertDialogListener onalertdialoglistener)
    {
        mOnAlertDialogListener = onalertdialoglistener;
    }


    private class OnAlertDialogListener
    {

        public abstract void onAlertDismiss();
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final AlertDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (mOnAlertDialogListener != null)
            {
                mOnAlertDialogListener.onAlertDismiss();
            }
            dialoginterface.dismiss();
        }

        _cls1()
        {
            this$0 = AlertDialogFragment.this;
            super();
        }
    }

}
