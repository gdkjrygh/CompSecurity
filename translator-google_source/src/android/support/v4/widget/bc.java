// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            bg, bd, bf, be

public final class bc
{

    public Object a;
    public bd b;

    private bc(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new bg();
        } else
        if (i >= 9)
        {
            b = new bf();
        } else
        {
            b = new be();
        }
        a = b.a(context, interpolator);
    }

    bc(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static bc a(Context context, Interpolator interpolator)
    {
        return new bc(context, interpolator);
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
        return b.h(a);
    }

    public final float e()
    {
        return b.d(a);
    }

    public final boolean f()
    {
        return b.e(a);
    }

    public final void g()
    {
        b.f(a);
    }
}
