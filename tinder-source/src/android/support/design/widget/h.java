// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            a

final class h extends g.e
{

    private static final Handler a = new Handler(Looper.getMainLooper());
    private long b;
    private boolean c;
    private final int d[] = new int[2];
    private final float e[] = new float[2];
    private int f;
    private Interpolator g;
    private g.e.a h;
    private g.e.b i;
    private float j;
    private final Runnable k = new Runnable() {

        final h a;

        public final void run()
        {
            h.a(a);
        }

            
            {
                a = h.this;
                super();
            }
    };

    h()
    {
        f = 200;
    }

    static void a(h h1)
    {
        if (h1.c)
        {
            float f2 = (float)(SystemClock.uptimeMillis() - h1.b) / (float)h1.f;
            float f1 = f2;
            if (h1.g != null)
            {
                f1 = h1.g.getInterpolation(f2);
            }
            h1.j = f1;
            if (h1.i != null)
            {
                h1.i.a();
            }
            if (SystemClock.uptimeMillis() >= h1.b + (long)h1.f)
            {
                h1.c = false;
                if (h1.h != null)
                {
                    h1.h.a();
                }
            }
        }
        if (h1.c)
        {
            a.postDelayed(h1.k, 10L);
        }
    }

    public final void a()
    {
        if (c)
        {
            return;
        }
        if (g == null)
        {
            g = new AccelerateDecelerateInterpolator();
        }
        b = SystemClock.uptimeMillis();
        c = true;
        a.postDelayed(k, 10L);
    }

    public final void a(int l, int i1)
    {
        d[0] = l;
        d[1] = i1;
    }

    public final void a(g.e.a a1)
    {
        h = a1;
    }

    public final void a(g.e.b b1)
    {
        i = b1;
    }

    public final void a(Interpolator interpolator)
    {
        g = interpolator;
    }

    public final boolean b()
    {
        return c;
    }

    public final int c()
    {
        return android.support.design.widget.a.a(d[0], d[1], j);
    }

    public final void d()
    {
        e[0] = 0.0F;
        e[1] = 1.0F;
    }

    public final void e()
    {
        f = 300;
    }

    public final void f()
    {
        c = false;
        a.removeCallbacks(k);
        if (h != null)
        {
            h.b();
        }
    }

    public final float g()
    {
        return j;
    }

}
