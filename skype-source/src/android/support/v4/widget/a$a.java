// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//            a

private static final class h
{

    private int a;
    private int b;
    private float c;
    private float d;
    private long e;
    private long f;
    private int g;
    private int h;
    private long i;
    private float j;
    private int k;

    private float a(long l)
    {
        if (l < e)
        {
            return 0.0F;
        }
        if (i < 0L || l < i)
        {
            return 0.5F * android.support.v4.widget.a.a((float)(l - e) / (float)a);
        } else
        {
            long l1 = i;
            return (1.0F - j) + j * android.support.v4.widget.a.a((float)(l - l1) / (float)k);
        }
    }

    public final void a()
    {
        a = 500;
    }

    public final void a(float f1, float f2)
    {
        c = f1;
        d = f2;
    }

    public final void b()
    {
        b = 500;
    }

    public final void c()
    {
        e = AnimationUtils.currentAnimationTimeMillis();
        i = -1L;
        f = e;
        j = 0.5F;
        g = 0;
        h = 0;
    }

    public final void d()
    {
        long l = AnimationUtils.currentAnimationTimeMillis();
        k = android.support.v4.widget.a.a((int)(l - e), b);
        j = a(l);
        i = l;
    }

    public final boolean e()
    {
        return i > 0L && AnimationUtils.currentAnimationTimeMillis() > i + (long)k;
    }

    public final void f()
    {
        if (f == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f1 = a(l);
            f1 = -4F * f1 * f1 + f1 * 4F;
            long l1 = l - f;
            f = l;
            g = (int)((float)l1 * f1 * c);
            h = (int)((float)l1 * f1 * d);
            return;
        }
    }

    public final int g()
    {
        return (int)(c / Math.abs(c));
    }

    public final int h()
    {
        return (int)(d / Math.abs(d));
    }

    public final int i()
    {
        return h;
    }

    public onUtils()
    {
        e = 0x8000000000000000L;
        i = -1L;
        f = 0L;
        g = 0;
        h = 0;
    }
}
