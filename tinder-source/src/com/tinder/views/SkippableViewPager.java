// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.t;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class SkippableViewPager extends ViewPager
{

    private boolean isPagingEnabled;
    private t mPagerAdapter;

    public SkippableViewPager(Context context)
    {
        super(context);
        isPagingEnabled = Boolean.TRUE.booleanValue();
    }

    public SkippableViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isPagingEnabled = Boolean.TRUE.booleanValue();
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (view != this && (view instanceof ViewPager))
        {
            mPagerAdapter = ((ViewPager)view).getAdapter();
            int i1 = ((ViewPager)view).getCurrentItem();
            int l;
            if (mPagerAdapter == null)
            {
                l = 0;
            } else
            {
                l = mPagerAdapter.getCount();
            }
            if (i1 == l - 1 && i < 0 || i1 == 0 && i > 0)
            {
                return super.canScroll(view, flag, i, j, k);
            } else
            {
                return true;
            }
        } else
        {
            return super.canScroll(view, flag, i, j, k);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return isPagingEnabled && super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return isPagingEnabled && super.onTouchEvent(motionevent);
    }

    public void setPagingEnabled(boolean flag)
    {
        isPagingEnabled = flag;
    }
}
