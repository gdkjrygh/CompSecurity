// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import PB;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.TextView;

public abstract class AbstractSnapTimerView extends TextView
    implements Runnable
{

    protected boolean a;
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    private long g;
    private long h;
    private long i;
    private long j;

    public AbstractSnapTimerView(Context context)
    {
        super(context);
        a = false;
        b = 0L;
        g = 0L;
        c = 0L;
        d = 0L;
        h = 0L;
        e = 0L;
        f = 0L;
        i = 0x7fffffffffffffffL;
        j = 0x7fffffffffffffffL;
        new PB();
    }

    protected AbstractSnapTimerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        b = 0L;
        g = 0L;
        c = 0L;
        d = 0L;
        h = 0L;
        e = 0L;
        f = 0L;
        i = 0x7fffffffffffffffL;
        j = 0x7fffffffffffffffL;
        new PB();
    }

    static void a(AbstractSnapTimerView abstractsnaptimerview, int k)
    {
        abstractsnaptimerview.TextView.setVisibility(k);
    }

    public final void a()
    {
        a = false;
    }

    public abstract void a(int k, int l);

    public final void a(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        g = l1;
        d = l4 + l;
        c = d - l1;
        h = l3;
        f = l4 + l2;
        e = f - l3;
        a = true;
        postDelayed(this, 16L);
    }

    public final void a(boolean flag)
    {
        boolean flag1;
        if (i != 0x7fffffffffffffffL && j != 0x7fffffffffffffffL)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            return;
        }
        if (flag)
        {
            long l = SystemClock.elapsedRealtime();
            i = d - l;
            j = f - l;
            a = false;
            return;
        } else
        {
            a(i, g, j, h);
            i = 0x7fffffffffffffffL;
            j = 0x7fffffffffffffffL;
            return;
        }
    }

    public void run()
    {
        boolean flag1 = true;
        if (a)
        {
            b = SystemClock.elapsedRealtime();
        }
        if (getVisibility() == 0)
        {
            postInvalidate();
            long l = d;
            long l1 = c;
            long l2 = b - c;
            boolean flag;
            if (l2 >= 0L && l2 < l - l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = f;
            l1 = e;
            l2 = b - e;
            if (0L > l2 || l2 >= l - l1)
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                removeCallbacks(this);
                postDelayed(this, 16L);
            }
        }
    }

    public void setVisibility(int k)
    {
        postDelayed(new Runnable(k) {

            private int a;
            private AbstractSnapTimerView b;

            public final void run()
            {
                AbstractSnapTimerView.a(b, a);
                if (a == 0)
                {
                    b.run();
                }
            }

            
            {
                b = AbstractSnapTimerView.this;
                a = k;
                super();
            }
        }, 16L);
    }
}
