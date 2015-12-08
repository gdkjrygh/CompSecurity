// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.main;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class MainViewPager extends ViewPager
{

    public MainViewPager(Context context)
    {
        this(context, null);
    }

    public MainViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ViewCompat.setAccessibilityDelegate(this, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent);
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
        boolean flag = false;
        switch (keyevent.getKeyCode())
        {
        case 19: // '\023'
        case 20: // '\024'
        default:
            flag = super.executeKeyEvent(keyevent);
            // fall through

        case 21: // '\025'
        case 22: // '\026'
            return flag;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}
