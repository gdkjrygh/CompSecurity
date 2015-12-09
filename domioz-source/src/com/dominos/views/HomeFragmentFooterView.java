// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeFragmentFooterView extends LinearLayout
{

    private OnLandingFragmentFooterClickListener mListener;
    TextView mLoginSeparator;
    TextView mLoginText;
    TextView mNewsFeedText;
    TextView mTrackerSeparator;
    TextView mTrackerText;

    public HomeFragmentFooterView(Context context)
    {
        super(context);
    }

    public HomeFragmentFooterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HomeFragmentFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onLoginClick()
    {
        if (mListener != null)
        {
            mListener.onLoginButtonClick();
        }
    }

    protected void onNewsClick()
    {
        if (mListener != null)
        {
            mListener.onNewsButtonClick();
        }
    }

    protected void onTrackerClick()
    {
        if (mListener != null)
        {
            mListener.onTrackerButtonClick();
        }
    }

    public void setLoginText(String s)
    {
        mLoginText.setText(s);
    }

    public void setOnClickListener(OnLandingFragmentFooterClickListener onlandingfragmentfooterclicklistener)
    {
        mListener = onlandingfragmentfooterclicklistener;
    }

    public void showNewsfeed(boolean flag)
    {
        if (!flag)
        {
            mNewsFeedText.setVisibility(4);
            mTrackerSeparator.setVisibility(4);
            mLoginSeparator.setVisibility(4);
            return;
        } else
        {
            mNewsFeedText.setVisibility(0);
            mTrackerSeparator.setVisibility(0);
            mLoginSeparator.setVisibility(0);
            return;
        }
    }

    private class OnLandingFragmentFooterClickListener
    {

        public abstract void onLoginButtonClick();

        public abstract void onNewsButtonClick();

        public abstract void onTrackerButtonClick();
    }

}
