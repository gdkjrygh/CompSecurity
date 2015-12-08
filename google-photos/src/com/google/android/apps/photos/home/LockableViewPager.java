// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.home;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class LockableViewPager extends ViewPager
{

    public boolean u;

    public LockableViewPager(Context context)
    {
        super(context);
    }

    public LockableViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (u)
        {
            return false;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (u)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
