// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.m;
import android.text.Html;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ItemUnavailableFragment extends m
{

    LinearLayout mItemUnavailableRootLayout;
    ScrollView mItemUnavailableScrollView;
    private OnItemUnavailableClickListener mListener;
    TextView mMoreInfoActionView;
    String mMoreInfoContent;
    TextView mMoreInfoContentView;
    String mSummary;
    TextView mSummaryView;

    public ItemUnavailableFragment()
    {
    }

    protected void onAfterViews()
    {
        mSummaryView.setText(mSummary);
        mMoreInfoContentView.setText(Html.fromHtml(mMoreInfoContent));
        mMoreInfoActionView.setText(0x7f08017d);
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
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0e009e);
        return bundle;
    }

    protected void onItemUnavailableMoreInfoActionClicked()
    {
        android.view.ViewGroup.LayoutParams layoutparams = mItemUnavailableRootLayout.getLayoutParams();
        int i;
        if (getResources().getConfiguration().orientation == 1)
        {
            i = getResources().getDimensionPixelOffset(0x7f0a00a1);
        } else
        {
            i = 0;
        }
        if (mMoreInfoContentView.getVisibility() == 0)
        {
            mMoreInfoActionView.setText(0x7f08017d);
            mMoreInfoContentView.setVisibility(8);
            layoutparams.height = mItemUnavailableRootLayout.getHeight() - i;
            return;
        } else
        {
            mMoreInfoActionView.setText(0x7f08017c);
            mMoreInfoContentView.setVisibility(0);
            layoutparams.height = i + mItemUnavailableRootLayout.getHeight();
            mItemUnavailableScrollView.post(new _cls1());
            return;
        }
    }

    protected void onItemUnavailableOkButtonClicked()
    {
        dismiss();
        if (mListener != null)
        {
            mListener.onDialogContinueClicked();
        }
    }

    public void setItemUnavailableClickListener(OnItemUnavailableClickListener onitemunavailableclicklistener)
    {
        mListener = onitemunavailableclicklistener;
    }

    private class OnItemUnavailableClickListener
    {

        public abstract void onDialogCanceled();

        public abstract void onDialogContinueClicked();
    }


    private class _cls1
        implements Runnable
    {

        final ItemUnavailableFragment this$0;

        public void run()
        {
            mItemUnavailableScrollView.scrollTo(0, mMoreInfoContentView.getTop());
        }

        _cls1()
        {
            this$0 = ItemUnavailableFragment.this;
            super();
        }
    }

}
