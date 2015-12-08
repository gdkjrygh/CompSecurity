// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

public class SafeViewPager extends ViewPager
{

    public SafeViewPager(Context context)
    {
        super(context);
    }

    public SafeViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        return super.canScroll(view, flag, i, j, k) || flag && customCanScroll(view);
    }

    protected boolean customCanScroll(View view)
    {
        return view instanceof HorizontalScrollView;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }
}
