// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoDragViewPager extends ViewPager
{

    private boolean a;

    public NoDragViewPager(Context context)
    {
        super(context);
        a = false;
    }

    public NoDragViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public boolean g()
    {
        return a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (g())
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if ((motionevent.getAction() & 0xff) == 0)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setCanDrag(boolean flag)
    {
        a = flag;
    }
}
