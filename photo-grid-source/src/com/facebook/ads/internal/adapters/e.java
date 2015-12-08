// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.View;

public class e
{

    private int a;
    private int b;
    private final Context c;
    private final View d;
    private final int e;
    private final a f;
    private final Handler g = new Handler();
    private final Runnable h = new _cls1();
    private volatile boolean i;

    public e(Context context, View view, int j, a a1)
    {
        a = 0;
        b = 1000;
        c = context;
        d = view;
        e = j;
        f = a1;
    }

    static boolean a(e e1)
    {
        return e1.i;
    }

    static boolean a(e e1, boolean flag)
    {
        e1.i = flag;
        return flag;
    }

    static Context b(e e1)
    {
        return e1.c;
    }

    static View c(e e1)
    {
        return e1.d;
    }

    static int d(e e1)
    {
        return e1.e;
    }

    static a e(e e1)
    {
        return e1.f;
    }

    static Runnable f(e e1)
    {
        return e1.h;
    }

    static int g(e e1)
    {
        return e1.b;
    }

    static Handler h(e e1)
    {
        return e1.g;
    }

    public void a()
    {
        if (!i)
        {
            g.postDelayed(h, a);
        }
    }

    public void a(int j)
    {
        a = j;
    }

    public void b()
    {
        g.removeCallbacks(h);
    }

    public void b(int j)
    {
        b = j;
    }

    private class _cls1
        implements Runnable
    {

        final e a;

        public void run()
        {
            if (e.a(a))
            {
                return;
            }
            if (com.facebook.ads.internal.util.g.a(e.b(a), e.c(a), e.d(a)))
            {
                e.e(a).a();
                e.a(a, true);
                return;
            } else
            {
                e.h(a).postDelayed(e.f(a), com.facebook.ads.internal.adapters.e.g(a));
                return;
            }
        }

        _cls1()
        {
            a = e.this;
            super();
        }

        private class a
        {

            public abstract void a();

            public a()
            {
            }
        }

    }

}
