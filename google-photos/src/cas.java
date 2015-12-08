// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Matrix;

public class cas extends cat
{

    private final int b;
    private final float c;
    private final float d;
    private final TimeInterpolator e;
    private final Matrix f = new Matrix();
    private final Matrix g = new Matrix();
    private final Matrix h = new Matrix();
    private final Matrix i = new Matrix();

    public cas(cay cay, float f1, float f2, TimeInterpolator timeinterpolator, int j)
    {
        super(cay);
        boolean flag;
        if (j == -1 || j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "rotationStyledValueIndex should be NO_ROTATION or >= 0");
        b = j;
        c = f1;
        d = f2;
        e = timeinterpolator;
    }

    private float a(cba cba1, boolean flag)
    {
        if (b == -1)
        {
            return 0.0F;
        }
        if (flag)
        {
            return a(cba1.x);
        } else
        {
            return a(cba1.y);
        }
    }

    private float a(pyg pyg1)
    {
        b.a(pyg1, "clipParams", null);
        b.a(pyg1.e, "clipParams.styledValue", null);
        b.a(b, "mRotationStyledValueIndex", 0, pyg1.e.length - 1, null);
        return (float)pyg1.e[b];
    }

    public Matrix a(cba cba1, cpy cpy)
    {
        a(f, cba1, true);
        return f;
    }

    protected final void a(Matrix matrix, cba cba1, boolean flag)
    {
        float f3 = 1.0F;
        matrix.reset();
        if (Math.abs(a(cba1, flag)) >= 1E-04F)
        {
            b.a(matrix, a(cba1, flag), cba1.u);
        }
        float f1;
        float f2;
        if (flag)
        {
            f1 = b.b(cba1);
        } else
        {
            f1 = b.c(cba1);
        }
        f2 = f1;
        if (e != null)
        {
            f2 = e.getInterpolation(f1);
        }
        f1 = c;
        f1 = f2 * (d - f1) + f1;
        matrix.postScale(f1, f1, 0.5F, 0.5F);
        if (flag)
        {
            f1 = b.a(cba1.s);
        } else
        {
            f1 = b.a(cba1.t);
        }
        if (f1 < 1.0F)
        {
            f2 = 1.0F / f1;
            f1 = 1.0F;
        } else
        {
            f1 *= 1.0F;
            f2 = f3;
        }
        matrix.postScale(f2, f1, 0.5F, 0.5F);
    }

    public final boolean a(cba cba1)
    {
        return true;
    }

    public Matrix b(cba cba1)
    {
        a(g, cba1, false);
        return g;
    }

    public Matrix c(cba cba1)
    {
        h.reset();
        cba1.s.a(h);
        return h;
    }

    public final Matrix d(cba cba1)
    {
        i.reset();
        cba1.t.a(i);
        return i;
    }
}
