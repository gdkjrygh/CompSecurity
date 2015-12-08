// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class LeftSwipeViewPager extends ViewPager
{

    private boolean a;

    public LeftSwipeViewPager(Context context)
    {
        super(context);
        a = true;
    }

    public LeftSwipeViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!a)
        {
            return false;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!a)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setLeftSwipeEnable(boolean flag)
    {
        a = flag;
    }
}
