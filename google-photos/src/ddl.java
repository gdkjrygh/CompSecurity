// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

public final class ddl
{

    public static final Matrix a = new Matrix();
    public static final Matrix b;
    public static final Matrix c;
    private static final ThreadLocal d = a(9);
    private static final ThreadLocal e = a(9);
    private static final ThreadLocal f = a(9);

    public static double a(double d1, double d2, double d3)
    {
        if (d1 < d2)
        {
            return d2;
        }
        if (d1 > d3)
        {
            return d3;
        } else
        {
            return d1;
        }
    }

    public static double a(List list)
    {
        b.a(list.size(), "values.size()");
        Iterator iterator = list.iterator();
        double d1;
        for (d1 = 0.0D; iterator.hasNext(); d1 = (double)((Long)iterator.next()).longValue() + d1) { }
        return d1 / (double)list.size();
    }

    public static double a(List list, double d1)
    {
        b.a(list.size(), "values.size()");
        Iterator iterator = list.iterator();
        double d2;
        double d3;
        for (d2 = 0.0D; iterator.hasNext(); d2 = d3 * d3 + d2)
        {
            d3 = (double)((Long)iterator.next()).longValue() - d1;
        }

        return Math.sqrt(d2 / (double)list.size());
    }

    public static float a(float f1)
    {
        return a(f1, 0.0F, 1.0F);
    }

    public static float a(float f1, float f2)
    {
        return (float)Math.sqrt(f1 * f1 + f2 * f2);
    }

    public static float a(float f1, float f2, float f3)
    {
        if (f1 < f2)
        {
            return f2;
        }
        if (f1 > f3)
        {
            return f3;
        } else
        {
            return f1;
        }
    }

    public static int a(int i, int j)
    {
        if (i > 0 && j > 0)
        {
            return ((i + j) - 1) / j;
        }
        if (i < 0 && j < 0)
        {
            return (i + j + 1) / j;
        } else
        {
            return i / j;
        }
    }

    public static int a(int i, int j, float f1)
    {
        return (int)((float)(j - i) * f1) + i;
    }

    public static int a(int i, int j, int k)
    {
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = k;
            if (i <= k)
            {
                return i;
            }
        }
        return j;
    }

    public static long a(long l, long l1, long l2)
    {
        if (l < l1)
        {
            return l1;
        }
        if (l > l2)
        {
            return l2;
        } else
        {
            return l;
        }
    }

    private static ThreadLocal a(int i)
    {
        return new ddm(9);
    }

    public static void a(Matrix matrix, Matrix matrix1, float f1, Matrix matrix2)
    {
        float af[] = (float[])d.get();
        float af1[] = (float[])e.get();
        float af2[] = (float[])f.get();
        matrix.getValues(af);
        matrix1.getValues(af1);
        for (int i = 0; i < 9; i++)
        {
            af2[i] = af[i] + (af1[i] - af[i]) * f1;
        }

        matrix2.setValues(af2);
    }

    public static void a(Matrix matrix, float af[])
    {
        matrix.setValues(new float[] {
            af[0], af[4], af[12], af[1], af[5], af[13], af[3], af[7], af[15]
        });
    }

    public static float b(float f1, float f2, float f3)
    {
        if (f1 != f2)
        {
            return (f3 - f1) / (f2 - f1);
        } else
        {
            return 0.0F;
        }
    }

    public static float c(float f1, float f2, float f3)
    {
        return a(b(f1, f2, f3), 0.0F, 1.0F);
    }

    static 
    {
        b = new Matrix();
        c = new Matrix();
        b.setScale(1.0F, -1F, 0.5F, 0.5F);
        c.setRotate(270F, 0.5F, 0.5F);
    }
}
