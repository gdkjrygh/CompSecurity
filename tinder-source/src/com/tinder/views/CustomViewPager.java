// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Field;

public class CustomViewPager extends ViewPager
{
    private class FixedSpeedScroller extends Scroller
    {

        private int mDuration;
        final CustomViewPager this$0;

        public void setScrollDuration(int i)
        {
            mDuration = i;
        }

        public void startScroll(int i, int j, int k, int l)
        {
            super.startScroll(i, j, k, l, mDuration);
        }

        public void startScroll(int i, int j, int k, int l, int i1)
        {
            super.startScroll(i, j, k, l, mDuration);
        }

        public FixedSpeedScroller(Context context)
        {
            this$0 = CustomViewPager.this;
            super(context);
            mDuration = 350;
        }

        public FixedSpeedScroller(Context context, Interpolator interpolator)
        {
            this$0 = CustomViewPager.this;
            super(context, interpolator);
            mDuration = 350;
        }

        public FixedSpeedScroller(Context context, Interpolator interpolator, boolean flag)
        {
            this$0 = CustomViewPager.this;
            super(context, interpolator, flag);
            mDuration = 350;
        }
    }


    private FixedSpeedScroller mScroller;

    public CustomViewPager(Context context)
    {
        super(context);
        mScroller = null;
        init();
    }

    public CustomViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mScroller = null;
        init();
    }

    private void init()
    {
        try
        {
            Field field = android/support/v4/view/ViewPager.getDeclaredField("mScroller");
            field.setAccessible(true);
            mScroller = new FixedSpeedScroller(getContext(), new DecelerateInterpolator());
            field.set(this, mScroller);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void setScrollDuration(int i)
    {
        mScroller.setScrollDuration(i);
    }
}
