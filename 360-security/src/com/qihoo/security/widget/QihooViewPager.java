// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class QihooViewPager extends ViewPager
{

    protected android.support.v4.view.ViewPager.e a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private boolean f;

    public QihooViewPager(Context context)
    {
        super(context);
        b = true;
        c = false;
        d = false;
        e = 0;
        f = true;
    }

    public QihooViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = true;
        c = false;
        d = false;
        e = 0;
        f = true;
    }

    private void b(int i, boolean flag)
    {
        if (!c)
        {
            e = i;
            d = true;
        } else
        if (c && f && super.getCurrentItem() == 0 && i == 0)
        {
            f = false;
            super.a(i, flag);
            if (a != null)
            {
                a.a(i);
                return;
            }
        } else
        {
            super.a(i, flag);
            return;
        }
    }

    public void a(int i, boolean flag)
    {
        b(i, flag);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (b)
        {
            try
            {
                flag = super.onInterceptTouchEvent(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return false;
            }
        }
        return flag;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (d && !c && a != null)
        {
            if (e == 0)
            {
                a.a(e);
            }
            super.a(e, false);
        }
        c = true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (b)
        {
            try
            {
                flag = super.onTouchEvent(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return false;
            }
        }
        return flag;
    }

    public void setCanScroll(boolean flag)
    {
        b = flag;
    }

    public void setCurrentItem(int i)
    {
        b(i, true);
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.e e1)
    {
        super.setOnPageChangeListener(e1);
        a = e1;
    }
}
