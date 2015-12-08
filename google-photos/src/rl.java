// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.animation.Interpolator;

public final class rl
{

    public Object a;
    public rm b;

    private rl(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new rp();
        } else
        if (i >= 9)
        {
            b = new ro();
        } else
        {
            b = new rn();
        }
        a = b.a(context, interpolator);
    }

    private rl(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static rl a(Context context, Interpolator interpolator)
    {
        return new rl(context, interpolator);
    }

    public final int a()
    {
        return b.b(a);
    }

    public final void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public final void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        b.a(a, 0, 0, k, l, i1, j1, 0x80000000, 0x7fffffff);
    }

    public final int b()
    {
        return b.c(a);
    }

    public final int c()
    {
        return b.g(a);
    }

    public final int d()
    {
        return b.h(a);
    }

    public final boolean e()
    {
        return b.e(a);
    }

    public final void f()
    {
        b.f(a);
    }
}
