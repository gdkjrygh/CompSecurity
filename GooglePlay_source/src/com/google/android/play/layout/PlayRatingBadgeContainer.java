// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class PlayRatingBadgeContainer extends FrameLayout
{

    private View mBadge;
    private View mRatingBar;

    public PlayRatingBadgeContainer(Context context)
    {
        this(context, null);
    }

    public PlayRatingBadgeContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public int getBaseline()
    {
        if (mBadge.getVisibility() != 8)
        {
            return mBadge.getBaseline();
        }
        if (mRatingBar.getVisibility() != 8)
        {
            return mRatingBar.getBaseline();
        } else
        {
            return getMeasuredHeight();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mRatingBar = findViewById(0x7f0d02f8);
        mBadge = findViewById(0x7f0d0300);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mRatingBar.getVisibility() != 8)
        {
            mRatingBar.layout(0, 0, mRatingBar.getMeasuredWidth(), mRatingBar.getMeasuredHeight());
        }
        if (mBadge.getVisibility() != 8)
        {
            mBadge.layout(0, 0, mBadge.getMeasuredWidth(), mBadge.getMeasuredHeight());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1 = android.view.View.MeasureSpec.getSize(i);
        j = 0;
        i = 0;
        if (mRatingBar.getVisibility() != 8)
        {
            mRatingBar.measure(0, 0);
            if (mRatingBar.getMeasuredWidth() > i1)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0x40000000);
                mRatingBar.measure(i, i);
            }
            j = mRatingBar.getMeasuredWidth();
            i = mRatingBar.getMeasuredHeight();
        }
        int l = i;
        int k = j;
        if (mBadge.getVisibility() != 8)
        {
            mBadge.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), 0);
            k = Math.max(j, mBadge.getMeasuredWidth());
            l = Math.max(i, mBadge.getMeasuredHeight());
        }
        setMeasuredDimension(k, l);
    }
}
