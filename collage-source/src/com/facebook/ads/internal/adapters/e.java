// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.util.g;
import java.lang.ref.WeakReference;

public class e
{
    public static abstract class a
    {

        public abstract void a();

        public void b()
        {
        }

        public a()
        {
        }
    }


    private int a;
    private int b;
    private final Context c;
    private final WeakReference d;
    private final int e;
    private final WeakReference f;
    private final Handler g = new Handler();
    private final Runnable h = new Runnable() {

        final e a;

        public void run()
        {
            if (!e.a(a))
            {
                View view1 = (View)e.b(a).get();
                a a2 = (a)e.c(a).get();
                if (view1 != null && a2 != null)
                {
                    if (com.facebook.ads.internal.util.g.a(e.d(a), view1, e.e(a)))
                    {
                        a2.a();
                        e.a(a, true);
                        return;
                    } else
                    {
                        a2.b();
                        e.h(a).postDelayed(e.f(a), com.facebook.ads.internal.adapters.e.g(a));
                        return;
                    }
                }
            }
        }

            
            {
                a = e.this;
                super();
            }
    };
    private volatile boolean i;

    public e(Context context, View view, int j, a a1)
    {
        a = 0;
        b = 1000;
        c = context;
        d = new WeakReference(view);
        e = j;
        f = new WeakReference(a1);
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

    static WeakReference b(e e1)
    {
        return e1.d;
    }

    static WeakReference c(e e1)
    {
        return e1.f;
    }

    static Context d(e e1)
    {
        return e1.c;
    }

    static int e(e e1)
    {
        return e1.e;
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
}
