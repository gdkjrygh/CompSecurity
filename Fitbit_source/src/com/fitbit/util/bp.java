// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;

public class bp
{

    private TransitionDrawable a;
    private boolean b;
    private int c;
    private Handler d;
    private Runnable e;
    private Runnable f;

    public bp(TransitionDrawable transitiondrawable)
    {
        c = 250;
        e = new Runnable() {

            final bp a;

            public void run()
            {
                bp bp1;
                boolean flag;
                if (!bp.a(a))
                {
                    bp.c(a).startTransition(bp.b(a));
                    bp.e(a).postDelayed(bp.d(a), bp.b(a));
                } else
                {
                    bp.c(a).reverseTransition(bp.b(a));
                    bp.e(a).postDelayed(bp.d(a), bp.b(a) * 10);
                }
                bp1 = a;
                if (!bp.a(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bp.a(bp1, flag);
            }

            
            {
                a = bp.this;
                super();
            }
        };
        f = new Runnable() {

            final bp a;

            public void run()
            {
                bp bp1;
                boolean flag;
                if (!bp.a(a))
                {
                    bp.c(a).startTransition(bp.b(a));
                    bp.e(a).postDelayed(bp.f(a), bp.b(a));
                } else
                {
                    bp.c(a).reverseTransition(bp.b(a));
                }
                bp1 = a;
                if (!bp.a(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bp.a(bp1, flag);
            }

            
            {
                a = bp.this;
                super();
            }
        };
        a = transitiondrawable;
        d = new Handler();
    }

    static boolean a(bp bp1)
    {
        return bp1.b;
    }

    static boolean a(bp bp1, boolean flag)
    {
        bp1.b = flag;
        return flag;
    }

    static int b(bp bp1)
    {
        return bp1.c;
    }

    static TransitionDrawable c(bp bp1)
    {
        return bp1.a;
    }

    static Runnable d(bp bp1)
    {
        return bp1.e;
    }

    static Handler e(bp bp1)
    {
        return bp1.d;
    }

    static Runnable f(bp bp1)
    {
        return bp1.f;
    }

    public TransitionDrawable a()
    {
        return a;
    }

    public void b()
    {
        c();
        d.postDelayed(e, c);
    }

    public void c()
    {
        d.removeCallbacks(e);
        d.removeCallbacks(f);
    }

    public void d()
    {
        c();
        d.postDelayed(f, c);
    }

    public void e()
    {
        a.resetTransition();
    }
}
