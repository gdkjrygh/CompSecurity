// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Matrix;
import android.view.animation.AnticipateOvershootInterpolator;

public final class cch extends cat
{

    private Matrix b;
    private Matrix c;
    private Matrix d;
    private Matrix e;
    private Matrix f;
    private TimeInterpolator g;

    public cch(cay cay)
    {
        super(cay);
        b = new Matrix();
        c = new Matrix();
        d = new Matrix();
        e = new Matrix();
        f = new Matrix();
        g = new AnticipateOvershootInterpolator(1.2F);
    }

    private static cnw a(cnw cnw1, float f1, float f2)
    {
        float f9 = cnw1.a;
        float f8 = cnw1.b;
        f1 = cnw1.c;
        f2 = cnw1.d;
        float f3 = 0.3339695F * (1.0F - f1 - f2);
        float f5;
        float f7;
        if (f1 < f2)
        {
            float f4 = Math.min(f1, f3 / 2.0F);
            f1 -= f4;
            f3 -= f4;
            f4 = Math.min(f2, f3);
            f2 -= f4;
            f3 -= f4;
        } else
        {
            float f6 = Math.min(f2, f3 / 2.0F);
            f2 -= f6;
            f3 -= f6;
            f6 = Math.min(f1, f3);
            f1 -= f6;
            f3 -= f6;
        }
        f7 = f9;
        f5 = f8;
        if (f3 > 0.0F)
        {
            f3 = ((1.0F - f9 - f8) * 0.5F * f3) / (f3 + 1.0F);
            f7 = f9 + f3;
            f5 = f8 + f3;
        }
        return new cnw(f7, f5, f1, f2, 0.0F);
    }

    private static void a(Matrix matrix, cnw cnw1)
    {
        cnw1 = a(cnw1, 0.7038627F, 0.9389313F);
        float f1 = 1.0F / (1.0F - cnw1.a - cnw1.b);
        float f2 = 1.0F / (1.0F - cnw1.c - cnw1.d);
        float f3 = cnw1.a;
        float f4 = cnw1.d;
        matrix.setTranslate(-f3, -f4);
        matrix.postScale(0.7038627F * f1, 0.9389313F * f2);
        matrix.postTranslate(0.1459228F, 0.02748092F);
        matrix.invert(matrix);
    }

    private static void b(Matrix matrix, cnw cnw1)
    {
        cnw1 = a(cnw1, 0.7038627F, 0.9389313F);
        matrix.reset();
        cnw1.a(matrix);
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        a(c, cba1.s);
        if (b.a(cba1))
        {
            c.preTranslate(0.0F, g.getInterpolation(cba1.m));
        }
        return c;
    }

    public final Matrix b(cba cba1)
    {
        a(d, cba1.t);
        if (b.a(cba1))
        {
            d.preTranslate(0.0F, g.getInterpolation(cba1.m) - 1.0F);
        }
        return d;
    }

    public final int f(cba cba1)
    {
        return b.dY;
    }

    public final Matrix g(cba cba1)
    {
        b.setScale(1.0F, 0.5F);
        if (b.a(cba1))
        {
            b.postTranslate(0.0F, g.getInterpolation(cba1.m) / 2.0F);
        }
        return b;
    }

    public final float h(cba cba1)
    {
        return 1.0F;
    }

    public final int i(cba cba1)
    {
        return caz.d;
    }

    public final float w(cba cba1)
    {
        return 1.0F;
    }

    public final Matrix x(cba cba1)
    {
        b(e, cba1.s);
        return e;
    }

    public final Matrix y(cba cba1)
    {
        b(f, cba1.t);
        return f;
    }
}
