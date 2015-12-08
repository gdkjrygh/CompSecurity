// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

public final class cby extends cbg
{

    private final cbz c[];
    private final long d[];
    private final long e;
    private final Matrix f = new Matrix();
    private final float g;
    private int h;

    public transient cby(int i1, long l1, float f1, cbz acbz[])
    {
        c = acbz;
        d = new long[c.length];
        int j1 = 0;
        while (j1 < c.length) 
        {
            d[j1] = (long)c[j1].d * 40000L;
            boolean flag;
            if (j1 > 0 && d[j1 - 1] >= d[j1])
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b.a(flag, "The animation phases must be sorted according to their start time");
            j1++;
        }
        e = (long)i1 * 40000L;
        g = f1;
    }

    private float A(cba cba1)
    {
        if (!B(cba1))
        {
            return 1.0F;
        } else
        {
            long l1 = cba1.a;
            long l2 = e;
            int i1 = C(cba1);
            long l3 = d[i1];
            long l4 = b(i1);
            return (float)Math.sin(((double)((1.0F * (float)(l1 % l2) - (float)l3) / (float)(l4 - l3)) * 3.1415926535897931D) / 2D);
        }
    }

    private boolean B(cba cba1)
    {
        return c[C(cba1)].c;
    }

    private int C(cba cba1)
    {
        long l1 = cba1.a % e;
        do
        {
            if (b(h) > l1)
            {
                int i1 = h;
                if (d[i1] <= l1)
                {
                    break;
                }
            }
            h = a(h);
        } while (true);
        return h;
    }

    private int D(cba cba1)
    {
        return a(C(cba1));
    }

    private int a(int i1)
    {
        return (i1 + 1) % d.length;
    }

    private long b(int i1)
    {
        if (i1 < d.length - 1)
        {
            return d[i1 + 1];
        } else
        {
            return e;
        }
    }

    public final List D_()
    {
        ArrayList arraylist = new ArrayList();
        cbz acbz[] = c;
        int j1 = acbz.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = acbz[i1].a;
            if (k1 != 0)
            {
                arraylist.add(Integer.valueOf(k1));
            }
        }

        return arraylist;
    }

    public final int f(cba cba1)
    {
        return c[C(cba1)].a;
    }

    public final Matrix g(cba cba1)
    {
        return f;
    }

    public final float h(cba cba1)
    {
        return A(cba1) * g;
    }

    public final int i(cba cba1)
    {
        return c[C(cba1)].b;
    }

    public final int j(cba cba1)
    {
        if (!B(cba1))
        {
            return 0;
        } else
        {
            return c[D(cba1)].a;
        }
    }

    public final Matrix k(cba cba1)
    {
        return f;
    }

    public final float l(cba cba1)
    {
        return (1.0F - A(cba1)) * g;
    }

    public final int m(cba cba1)
    {
        return c[D(cba1)].b;
    }
}
