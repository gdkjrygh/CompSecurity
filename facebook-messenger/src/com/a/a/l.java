// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            p, o, n, aj

class l extends p
{

    private float g;
    private float h;
    private float i;
    private boolean j;

    public transient l(o ao[])
    {
        super(ao);
        j = true;
    }

    public l a()
    {
        ArrayList arraylist = e;
        int i1 = e.size();
        o ao[] = new o[i1];
        for (int k = 0; k < i1; k++)
        {
            ao[k] = (o)((n)arraylist.get(k)).e();
        }

        return new l(ao);
    }

    public Object a(float f)
    {
        return Float.valueOf(b(f));
    }

    public float b(float f)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((o)e.get(0)).f();
                h = ((o)e.get(1)).f();
                i = h - g;
            }
            float f1 = f;
            if (d != null)
            {
                f1 = d.getInterpolation(f);
            }
            if (this.f == null)
            {
                return g + i * f1;
            } else
            {
                return ((Number)this.f.a(f1, Float.valueOf(g), Float.valueOf(h))).floatValue();
            }
        }
        if (f <= 0.0F)
        {
            Object obj = (o)e.get(0);
            o o2 = (o)e.get(1);
            float f5 = ((o) (obj)).f();
            float f8 = o2.f();
            float f10 = ((o) (obj)).c();
            float f12 = o2.c();
            obj = o2.d();
            float f2 = f;
            if (obj != null)
            {
                f2 = ((Interpolator) (obj)).getInterpolation(f);
            }
            f = (f2 - f10) / (f12 - f10);
            if (this.f == null)
            {
                return f * (f8 - f5) + f5;
            } else
            {
                return ((Number)this.f.a(f, Float.valueOf(f5), Float.valueOf(f8))).floatValue();
            }
        }
        if (f >= 1.0F)
        {
            Object obj1 = (o)e.get(a - 2);
            o o3 = (o)e.get(a - 1);
            float f6 = ((o) (obj1)).f();
            float f9 = o3.f();
            float f11 = ((o) (obj1)).c();
            float f13 = o3.c();
            obj1 = o3.d();
            float f3 = f;
            if (obj1 != null)
            {
                f3 = ((Interpolator) (obj1)).getInterpolation(f);
            }
            f = (f3 - f11) / (f13 - f11);
            if (this.f == null)
            {
                return f * (f9 - f6) + f6;
            } else
            {
                return ((Number)this.f.a(f, Float.valueOf(f6), Float.valueOf(f9))).floatValue();
            }
        }
        o o4;
        for (o o1 = (o)e.get(0); k < a; o1 = o4)
        {
            o4 = (o)e.get(k);
            if (f < o4.c())
            {
                Interpolator interpolator = o4.d();
                float f4 = f;
                if (interpolator != null)
                {
                    f4 = interpolator.getInterpolation(f);
                }
                f = (f4 - o1.c()) / (o4.c() - o1.c());
                f4 = o1.f();
                float f7 = o4.f();
                if (this.f == null)
                {
                    return (f7 - f4) * f + f4;
                } else
                {
                    return ((Number)this.f.a(f, Float.valueOf(f4), Float.valueOf(f7))).floatValue();
                }
            }
            k++;
        }

        return ((Number)((n)e.get(a - 1)).b()).floatValue();
    }

    public p b()
    {
        return a();
    }

    public Object clone()
    {
        return a();
    }
}
