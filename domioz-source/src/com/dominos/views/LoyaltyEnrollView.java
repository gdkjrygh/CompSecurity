// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;

public class LoyaltyEnrollView extends LinearLayout
{

    private String mCopyText;
    private String mCopyTitle;
    CheckBox mEnrollCheckBox;
    private EventListener mEventListener;
    private boolean mIsAnon;
    TextView mLoyaltySummary;
    TextView mLoyaltyTerms;
    private boolean mPreSelectCheckbox;
    TextView mTitle;

    public LoyaltyEnrollView(Context context, String s, String s1, boolean flag)
    {
        super(context);
        mCopyText = s;
        mCopyTitle = s1;
        mIsAnon = flag;
    }

    public LoyaltyEnrollView(Context context, String s, boolean flag)
    {
        super(context);
        mCopyText = s;
        mIsAnon = flag;
    }

    public LoyaltyEnrollView(Context context, String s, boolean flag, boolean flag1)
    {
        super(context);
        mCopyText = s;
        mPreSelectCheckbox = flag1;
        mIsAnon = flag;
    }

    void afterViews()
    {
        FontManager.applyDominosFont(this);
        mLoyaltyTerms.setVisibility(8);
        if (mIsAnon)
        {
            mLoyaltyTerms.setText(Html.fromHtml(getResources().getString(0x7f0802f6)));
        } else
        {
            mLoyaltyTerms.setText(Html.fromHtml(getResources().getString(0x7f08004a)));
        }
        mLoyaltyTerms.setVisibility(0);
        if (StringHelper.isNotEmpty(mCopyText))
        {
            mLoyaltySummary.setText(mCopyText);
        }
        if (StringHelper.isNotEmpty(mCopyTitle))
        {
            mTitle.setText(mCopyTitle);
        }
        if (mPreSelectCheckbox)
        {
            mEnrollCheckBox.setChecked(true);
        }
        mEnrollCheckBox.setOnCheckedChangeListener(new _cls1());
    }

    public CheckBox getCheckBox()
    {
        return mEnrollCheckBox;
    }

    public boolean isEnrollChecked()
    {
        return mEnrollCheckBox.isChecked();
    }

    public void loyaltyInfoClick()
    {
        if (mEventListener != null)
        {
            mEventListener.onLoyaltyInfoClick();
        }
    }

    public void onTermsClick()
    {
        if (mEventListener != null)
        {
            mEventListener.onLoyaltyTermsClick();
        }
    }

    public void setEventListener(EventListener eventlistener)
    {
        mEventListener = eventlistener;
    }


    private class _cls1
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final LoyaltyEnrollView this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (flag && mEventListener != null)
            {
                mEventListener.onLoyaltyCheckBoxClick();
            }
        }

        _cls1()
        {
            this$0 = LoyaltyEnrollView.this;
            super();
        }
    }


    private class EventListener
    {

        public abstract void onLoyaltyCheckBoxClick();

        public abstract void onLoyaltyInfoClick();

        public abstract void onLoyaltyTermsClick();
    }

}
