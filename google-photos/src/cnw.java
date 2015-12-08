// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public class cnw
{

    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cnw(float f, float f1, float f2, float f3, float f4)
    {
        boolean flag1 = true;
        super();
        a = f;
        b = f1;
        c = f2;
        d = f3;
        e = f4;
        boolean flag;
        if (f + f1 < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "(cropLeft + cropRight) must be less than 1");
        if (f2 + f3 < 1.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag, "(cropTop + cropBottom) must be less than 1");
    }

    public static cnw a(pxs pxs1, float f)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        if (pxs1.b != null)
        {
            f1 = pxs1.b.floatValue();
        } else
        {
            f1 = 0.0F;
        }
        if (pxs1.c != null)
        {
            f2 = pxs1.c.floatValue();
        } else
        {
            f2 = 0.0F;
        }
        if (pxs1.d != null)
        {
            f3 = pxs1.d.floatValue();
        } else
        {
            f3 = 0.0F;
        }
        if (pxs1.e != null)
        {
            f4 = pxs1.e.floatValue();
        } else
        {
            f4 = 0.0F;
        }
        return new cnw(f1, f2, f3, f4, f);
    }

    public cnw a()
    {
        return null;
    }

    public final void a(Matrix matrix)
    {
        float f = 1.0F - a - b;
        float f1 = 1.0F - c - d;
        if (e == 0.0F)
        {
            matrix.postScale(f, f1, 0.0F, 0.0F);
            matrix.postTranslate(a, d);
            return;
        } else
        {
            matrix.postTranslate(-0.5F, -0.5F);
            matrix.postScale(f, f1, 0.0F, 0.0F);
            matrix.postRotate((float)((double)(-e * 180F) / 3.1415926535897931D));
            matrix.postTranslate(f * 0.5F + a, f1 * 0.5F + d);
            return;
        }
    }

    public String toString()
    {
        float f = a;
        float f1 = b;
        float f2 = c;
        float f3 = d;
        return (new StringBuilder(84)).append("CroppingParameters:[").append(f).append(",").append(f1).append(",").append(f2).append(",").append(f3).append("]").toString();
    }
}
