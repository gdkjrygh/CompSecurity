// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Matrix;

public class cbd extends cas
{

    private final boolean b;
    private final Matrix c = new Matrix();
    private final Matrix d = new Matrix();

    public cbd(cay cay1, float f1, float f2, TimeInterpolator timeinterpolator, int i1, boolean flag)
    {
        super(cay1, f1, f2, timeinterpolator, 0);
        b = flag;
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        cba1 = super.a(cba1, cpy);
        cba1.postScale(1.15F, 1.15F, 0.5F, 0.5F);
        return cba1;
    }

    public final Matrix b(cba cba1)
    {
        if (cba1.k != cnt.c)
        {
            return super.a.b(cba1);
        } else
        {
            cba1 = super.b(cba1);
            cba1.postScale(1.15F, 1.15F, 0.5F, 0.5F);
            return cba1;
        }
    }

    public final int f(cba cba1)
    {
        return b.dW;
    }

    public final Matrix g(cba cba1)
    {
        a(c, cba1, true);
        return c;
    }

    public final float h(cba cba1)
    {
        return 1.0F - cba1.m;
    }

    public final int i(cba cba1)
    {
        return caz.d;
    }

    public int j(cba cba1)
    {
        if (!b || cba1.k != cnt.c)
        {
            return super.a.j(cba1);
        } else
        {
            return b.dW;
        }
    }

    public final Matrix k(cba cba1)
    {
        if (!b || cba1.k != cnt.c)
        {
            return super.a.k(cba1);
        } else
        {
            a(d, cba1, false);
            return d;
        }
    }

    public final float l(cba cba1)
    {
        if (!b || cba1.k != cnt.c)
        {
            return super.a.l(cba1);
        } else
        {
            return cba1.m;
        }
    }

    public final int m(cba cba1)
    {
        if (!b || cba1.k != cnt.c)
        {
            return super.a.m(cba1);
        } else
        {
            return caz.d;
        }
    }
}
