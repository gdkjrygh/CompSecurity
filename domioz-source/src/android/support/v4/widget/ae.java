// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            ai, af, ah, ag

public final class ae
{

    Object a;
    af b;

    private ae(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new ai();
        } else
        if (i >= 9)
        {
            b = new ah();
        } else
        {
            b = new ag();
        }
        a = b.a(context, interpolator);
    }

    private ae(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static ae a(Context context)
    {
        return a(context, null);
    }

    public static ae a(Context context, Interpolator interpolator)
    {
        return new ae(context, interpolator);
    }

    public final void a(int i, int j, int k, int l)
    {
        b.a(a, i, j, k, l);
    }

    public final void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public final boolean a()
    {
        return b.a(a);
    }

    public final int b()
    {
        return b.b(a);
    }

    public final int c()
    {
        return b.c(a);
    }

    public final int d()
    {
        return b.g(a);
    }

    public final int e()
    {
        return b.h(a);
    }

    public final float f()
    {
        return b.d(a);
    }

    public final boolean g()
    {
        return b.e(a);
    }

    public final void h()
    {
        b.f(a);
    }
}
