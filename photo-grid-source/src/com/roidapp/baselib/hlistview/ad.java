// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.content.Context;
import android.util.FloatMath;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            ae

public final class ad
{

    private static float f = 8F;
    private static float g = 1.0F;
    private int a;
    private final ae b;
    private final ae c;
    private Interpolator d;
    private final boolean e;

    public ad(Context context)
    {
        this(context, (byte)0);
    }

    private ad(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private ad(Context context, char c1)
    {
        d = null;
        e = true;
        b = new ae(context);
        c = new ae(context);
    }

    private static float b(float f1)
    {
        f1 = f * f1;
        if (f1 < 1.0F)
        {
            f1 -= 1.0F - (float)Math.exp(-f1);
        } else
        {
            f1 = (1.0F - (float)Math.exp(1.0F - f1)) * 0.6321205F + 0.3678795F;
        }
        return f1 * g;
    }

    public final void a(int i, int j)
    {
        b.a(i, j);
    }

    public final void a(int i, int j, int k, int l)
    {
        a = 0;
        b.a(i, k, l);
        c.a(j, 0, l);
    }

    public final void a(int i, int j, int k, int l, int i1, int j1)
    {
        if (e && !a())
        {
            float f1 = ae.c(b);
            float f2 = ae.c(c);
            if (Math.signum(j) == Math.signum(f1) && Math.signum(0.0F) == Math.signum(f2))
            {
                j = (int)(f1 + (float)j);
                k = (int)(0.0F + f2);
            }
        }
        a = 1;
        b.a(i, j, l, 0x7fffffff, j1);
        c.a(0, k, 0, i1, 0);
    }

    final void a(Interpolator interpolator)
    {
        d = interpolator;
    }

    public final boolean a()
    {
        return ae.a(b) && ae.a(c);
    }

    public final boolean a(float f1)
    {
        int i = ae.e(b);
        int j = ae.d(b);
        int k = ae.e(c);
        int l = ae.d(c);
        return !a() && Math.signum(f1) == Math.signum(i - j) && Math.signum(0.0F) == Math.signum(k - l);
    }

    public final boolean a(int i)
    {
        boolean flag = false;
        a = 1;
        boolean flag2 = b.a(i);
        boolean flag1 = c.a(0);
        if (flag2 || flag1)
        {
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        ae.a(b, ae.a(c, true));
    }

    public final int c()
    {
        return ae.b(b);
    }

    public final float d()
    {
        return FloatMath.sqrt(ae.c(b) * ae.c(b) + ae.c(c) * ae.c(c));
    }

    public final boolean e()
    {
        if (a())
        {
            return false;
        }
        a;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 38
    //                   1 123;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        long l = AnimationUtils.currentAnimationTimeMillis() - ae.g(b);
        int i = ae.f(b);
        if (l < (long)i)
        {
            float f1 = (float)l / (float)i;
            if (d == null)
            {
                f1 = b(f1);
            } else
            {
                f1 = d.getInterpolation(f1);
            }
            b.a(f1);
            c.a(f1);
        } else
        {
            f();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!ae.a(b) && !b.c() && !b.b())
        {
            b.a();
        }
        if (!ae.a(c) && !c.c() && !c.b())
        {
            c.a();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void f()
    {
        b.a();
        c.a();
    }

    static 
    {
        g = 1.0F / b(1.0F);
    }
}
