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

final class q extends p.e
{

    private static final Handler a = new Handler(Looper.getMainLooper());
    private long b;
    private boolean c;
    private final int d[] = new int[2];
    private final float e[] = new float[2];
    private int f;
    private Interpolator g;
    private p.e.a h;
    private p.e.b i;
    private float j;
    private final Runnable k = new Runnable() {

        final q a;

        public final void run()
        {
            q.a(a);
        }

            
            {
                a = q.this;
                super();
            }
    };

    q()
    {
        f = 200;
    }

    static void a(q q1)
    {
        if (q1.c)
        {
            float f2 = (float)(SystemClock.uptimeMillis() - q1.b) / (float)q1.f;
            float f1 = f2;
            if (q1.g != null)
            {
                f1 = q1.g.getInterpolation(f2);
            }
            q1.j = f1;
            if (q1.i != null)
            {
                q1.i.a();
            }
            if (SystemClock.uptimeMillis() >= q1.b + (long)q1.f)
            {
                q1.c = false;
                if (q1.h != null)
                {
                    q1.h.a();
                }
            }
        }
        if (q1.c)
        {
            a.postDelayed(q1.k, 10L);
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

    public final void a(float f1, float f2)
    {
        e[0] = f1;
        e[1] = f2;
    }

    public final void a(int l)
    {
        f = l;
    }

    public final void a(int l, int i1)
    {
        d[0] = l;
        d[1] = i1;
    }

    public final void a(p.e.a a1)
    {
        h = a1;
    }

    public final void a(p.e.b b1)
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

    public final float d()
    {
        return android.support.design.widget.a.a(e[0], e[1], j);
    }

    public final void e()
    {
        c = false;
        a.removeCallbacks(k);
        if (h != null)
        {
            h.b();
        }
    }

    public final float f()
    {
        return j;
    }

}
