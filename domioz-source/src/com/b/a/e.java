// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.b.a:
//            h, g, f, aa

final class e extends h
{

    private int g;
    private int h;
    private int i;
    private boolean j;

    public transient e(g ag[])
    {
        super(ag);
        j = true;
    }

    private e b()
    {
        ArrayList arraylist = e;
        int l = e.size();
        g ag[] = new g[l];
        for (int k = 0; k < l; k++)
        {
            ag[k] = (g)((f)arraylist.get(k)).c();
        }

        return new e(ag);
    }

    public final h a()
    {
        return b();
    }

    public final Object a(float f1)
    {
        return Integer.valueOf(b(f1));
    }

    public final int b(float f1)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((g)e.get(0)).d;
                h = ((g)e.get(1)).d;
                i = h - g;
            }
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            if (f == null)
            {
                return g + (int)((float)i * f2);
            } else
            {
                return ((Number)f.a(f2, Integer.valueOf(g), Integer.valueOf(h))).intValue();
            }
        }
        if (f1 <= 0.0F)
        {
            Object obj = (g)e.get(0);
            g g2 = (g)e.get(1);
            k = ((g) (obj)).d;
            int l = g2.d;
            float f6 = ((f) (obj)).a;
            float f8 = ((f) (g2)).a;
            obj = g2.b();
            float f3 = f1;
            if (obj != null)
            {
                f3 = ((Interpolator) (obj)).getInterpolation(f1);
            }
            f1 = (f3 - f6) / (f8 - f6);
            if (f == null)
            {
                return (int)(f1 * (float)(l - k)) + k;
            } else
            {
                return ((Number)f.a(f1, Integer.valueOf(k), Integer.valueOf(l))).intValue();
            }
        }
        if (f1 >= 1.0F)
        {
            Object obj1 = (g)e.get(a - 2);
            g g3 = (g)e.get(a - 1);
            k = ((g) (obj1)).d;
            int i1 = g3.d;
            float f7 = ((f) (obj1)).a;
            float f9 = ((f) (g3)).a;
            obj1 = g3.b();
            float f4 = f1;
            if (obj1 != null)
            {
                f4 = ((Interpolator) (obj1)).getInterpolation(f1);
            }
            f1 = (f4 - f7) / (f9 - f7);
            if (f == null)
            {
                return (int)(f1 * (float)(i1 - k)) + k;
            } else
            {
                return ((Number)f.a(f1, Integer.valueOf(k), Integer.valueOf(i1))).intValue();
            }
        }
        g g4;
        for (g g1 = (g)e.get(0); k < a; g1 = g4)
        {
            g4 = (g)e.get(k);
            if (f1 < ((f) (g4)).a)
            {
                Interpolator interpolator = g4.b();
                float f5 = f1;
                if (interpolator != null)
                {
                    f5 = interpolator.getInterpolation(f1);
                }
                f1 = (f5 - ((f) (g1)).a) / (((f) (g4)).a - ((f) (g1)).a);
                k = g1.d;
                int j1 = g4.d;
                if (f == null)
                {
                    return (int)((float)(j1 - k) * f1) + k;
                } else
                {
                    return ((Number)f.a(f1, Integer.valueOf(k), Integer.valueOf(j1))).intValue();
                }
            }
            k++;
        }

        return ((Number)((f)e.get(a - 1)).a()).intValue();
    }

    public final Object clone()
    {
        return b();
    }
}
