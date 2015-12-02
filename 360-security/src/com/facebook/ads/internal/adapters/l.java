// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.util.h;

public class l
{
    public static interface a
    {

        public abstract void a();
    }


    private final Context a;
    private final View b;
    private final int c;
    private final a d;
    private final Handler e = new Handler();
    private final Runnable f = new Runnable() {

        final l a;

        public void run()
        {
            if (l.a(a))
            {
                return;
            }
            if (h.a(l.b(a), l.c(a), l.d(a)))
            {
                l.e(a).a();
                l.a(a, true);
                return;
            } else
            {
                l.g(a).postDelayed(l.f(a), 1000L);
                return;
            }
        }

            
            {
                a = l.this;
                super();
            }
    };
    private volatile boolean g;

    public l(Context context, View view, int i, a a1)
    {
        a = context;
        b = view;
        c = i;
        d = a1;
    }

    static boolean a(l l1)
    {
        return l1.g;
    }

    static boolean a(l l1, boolean flag)
    {
        l1.g = flag;
        return flag;
    }

    static Context b(l l1)
    {
        return l1.a;
    }

    static View c(l l1)
    {
        return l1.b;
    }

    static int d(l l1)
    {
        return l1.c;
    }

    static a e(l l1)
    {
        return l1.d;
    }

    static Runnable f(l l1)
    {
        return l1.f;
    }

    static Handler g(l l1)
    {
        return l1.e;
    }

    public void a()
    {
        if (!g)
        {
            e.postDelayed(f, 1000L);
        }
    }

    public void b()
    {
        e.removeCallbacks(f);
    }
}
