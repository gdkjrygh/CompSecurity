// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            j, i, n

class f extends j
{

    private float g;
    private float h;
    private float i;
    private boolean j;

    public transient f(i.a aa[])
    {
        super(aa);
        j = true;
    }

    public f a()
    {
        ArrayList arraylist = e;
        int l = e.size();
        i.a aa[] = new i.a[l];
        int k = 0;
        do
        {
            if (k >= l)
            {
                return new f(aa);
            }
            aa[k] = (i.a)((i)arraylist.get(k)).e();
            k++;
        } while (true);
    }

    public Object a(float f1)
    {
        return Float.valueOf(b(f1));
    }

    public float b(float f1)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((i.a)e.get(0)).f();
                h = ((i.a)e.get(1)).f();
                i = h - g;
            }
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            if (f == null)
            {
                return g + i * f2;
            } else
            {
                return ((Number)f.a(f2, Float.valueOf(g), Float.valueOf(h))).floatValue();
            }
        }
        if (f1 <= 0.0F)
        {
            Object obj = (i.a)e.get(0);
            i.a a2 = (i.a)e.get(1);
            float f6 = ((i.a) (obj)).f();
            float f9 = a2.f();
            float f11 = ((i.a) (obj)).c();
            float f13 = a2.c();
            obj = a2.d();
            float f3 = f1;
            if (obj != null)
            {
                f3 = ((Interpolator) (obj)).getInterpolation(f1);
            }
            f1 = (f3 - f11) / (f13 - f11);
            if (f == null)
            {
                return f1 * (f9 - f6) + f6;
            } else
            {
                return ((Number)f.a(f1, Float.valueOf(f6), Float.valueOf(f9))).floatValue();
            }
        }
        if (f1 >= 1.0F)
        {
            Object obj1 = (i.a)e.get(a - 2);
            i.a a3 = (i.a)e.get(a - 1);
            float f7 = ((i.a) (obj1)).f();
            float f10 = a3.f();
            float f12 = ((i.a) (obj1)).c();
            float f14 = a3.c();
            obj1 = a3.d();
            float f4 = f1;
            if (obj1 != null)
            {
                f4 = ((Interpolator) (obj1)).getInterpolation(f1);
            }
            f1 = (f4 - f12) / (f14 - f12);
            if (f == null)
            {
                return f1 * (f10 - f7) + f7;
            } else
            {
                return ((Number)f.a(f1, Float.valueOf(f7), Float.valueOf(f10))).floatValue();
            }
        }
        i.a a1 = (i.a)e.get(0);
        do
        {
            if (k >= a)
            {
                return ((Number)((i)e.get(a - 1)).b()).floatValue();
            }
            i.a a4 = (i.a)e.get(k);
            if (f1 < a4.c())
            {
                Interpolator interpolator = a4.d();
                float f5 = f1;
                if (interpolator != null)
                {
                    f5 = interpolator.getInterpolation(f1);
                }
                f1 = (f5 - a1.c()) / (a4.c() - a1.c());
                f5 = a1.f();
                float f8 = a4.f();
                if (f == null)
                {
                    return (f8 - f5) * f1 + f5;
                } else
                {
                    return ((Number)f.a(f1, Float.valueOf(f5), Float.valueOf(f8))).floatValue();
                }
            }
            k++;
            a1 = a4;
        } while (true);
    }

    public j b()
    {
        return a();
    }
}
