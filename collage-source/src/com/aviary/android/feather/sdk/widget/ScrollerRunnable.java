// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public class ScrollerRunnable
    implements Runnable
{
    public static interface a
    {

        public abstract void b(int j);

        public abstract int getMaxX();

        public abstract int getMinX();

        public abstract void k();

        public abstract boolean post(Runnable runnable);

        public abstract boolean removeCallbacks(Runnable runnable);
    }


    protected int a;
    protected boolean b;
    protected a c;
    protected int d;
    protected int e;
    protected boolean f;
    private OverScroller g;
    private int h;

    public ScrollerRunnable(a a1, int j, int k, Interpolator interpolator)
    {
        if (interpolator == null)
        {
            g = new OverScroller(((View)a1).getContext());
        } else
        {
            g = new OverScroller(((View)a1).getContext(), interpolator);
        }
        h = k;
        c = a1;
        d = j;
    }

    public int a()
    {
        return a;
    }

    public void a(int j, int k)
    {
        if (k == 0)
        {
            return;
        } else
        {
            b();
            a = j;
            g.startScroll(j, 0, k, 0, d);
            c.post(this);
            return;
        }
    }

    public void a(boolean flag)
    {
        c.removeCallbacks(this);
        b(flag);
    }

    protected void b()
    {
        c.removeCallbacks(this);
    }

    public void b(int j, int k)
    {
        if (k == 0)
        {
            return;
        } else
        {
            b();
            a = j;
            g.fling(j, 0, k, 0, c.getMinX(), c.getMaxX(), 0, 0x7fffffff, h, 0);
            c.post(this);
            return;
        }
    }

    public void b(boolean flag)
    {
        i();
        a = 0;
        f = false;
        if (flag)
        {
            c.k();
        }
    }

    public int c()
    {
        return e;
    }

    public boolean d()
    {
        return f;
    }

    public float e()
    {
        return g.getCurrVelocity();
    }

    public boolean f()
    {
        return g.isFinished();
    }

    public boolean g()
    {
        return g.computeScrollOffset();
    }

    public int h()
    {
        return g.getCurrX();
    }

    protected void i()
    {
        g.abortAnimation();
    }

    public void run()
    {
        b = false;
        e = h();
        f = g();
        int j = h();
        c.b(j);
        if (f && !b)
        {
            a = j;
            c.post(this);
            return;
        } else
        {
            b(true);
            return;
        }
    }
}
