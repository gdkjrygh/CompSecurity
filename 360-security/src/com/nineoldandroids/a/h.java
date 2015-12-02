// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            j, i, n

class h extends j
{

    private int g;
    private int h;
    private int i;
    private boolean j;

    public transient h(i.b ab[])
    {
        super(ab);
        j = true;
    }

    public h a()
    {
        ArrayList arraylist = e;
        int l = e.size();
        i.b ab[] = new i.b[l];
        int k = 0;
        do
        {
            if (k >= l)
            {
                return new h(ab);
            }
            ab[k] = (i.b)((i)arraylist.get(k)).e();
            k++;
        } while (true);
    }

    public Object a(float f)
    {
        return Integer.valueOf(b(f));
    }

    public int b(float f)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((i.b)e.get(0)).f();
                h = ((i.b)e.get(1)).f();
                i = h - g;
            }
            float f1 = f;
            if (d != null)
            {
                f1 = d.getInterpolation(f);
            }
            if (this.f == null)
            {
                return g + (int)((float)i * f1);
            } else
            {
                return ((Number)this.f.a(f1, Integer.valueOf(g), Integer.valueOf(h))).intValue();
            }
        }
        if (f <= 0.0F)
        {
            Object obj = (i.b)e.get(0);
            i.b b2 = (i.b)e.get(1);
            k = ((i.b) (obj)).f();
            int l = b2.f();
            float f5 = ((i.b) (obj)).c();
            float f7 = b2.c();
            obj = b2.d();
            float f2 = f;
            if (obj != null)
            {
                f2 = ((Interpolator) (obj)).getInterpolation(f);
            }
            f = (f2 - f5) / (f7 - f5);
            if (this.f == null)
            {
                return (int)(f * (float)(l - k)) + k;
            } else
            {
                return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(l))).intValue();
            }
        }
        if (f >= 1.0F)
        {
            Object obj1 = (i.b)e.get(a - 2);
            i.b b3 = (i.b)e.get(a - 1);
            k = ((i.b) (obj1)).f();
            int i1 = b3.f();
            float f6 = ((i.b) (obj1)).c();
            float f8 = b3.c();
            obj1 = b3.d();
            float f3 = f;
            if (obj1 != null)
            {
                f3 = ((Interpolator) (obj1)).getInterpolation(f);
            }
            f = (f3 - f6) / (f8 - f6);
            if (this.f == null)
            {
                return (int)(f * (float)(i1 - k)) + k;
            } else
            {
                return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(i1))).intValue();
            }
        }
        i.b b1 = (i.b)e.get(0);
        do
        {
            if (k >= a)
            {
                return ((Number)((i)e.get(a - 1)).b()).intValue();
            }
            i.b b4 = (i.b)e.get(k);
            if (f < b4.c())
            {
                Interpolator interpolator = b4.d();
                float f4 = f;
                if (interpolator != null)
                {
                    f4 = interpolator.getInterpolation(f);
                }
                f = (f4 - b1.c()) / (b4.c() - b1.c());
                k = b1.f();
                int j1 = b4.f();
                if (this.f == null)
                {
                    return (int)((float)(j1 - k) * f) + k;
                } else
                {
                    return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(j1))).intValue();
                }
            }
            k++;
            b1 = b4;
        } while (true);
    }

    public j b()
    {
        return a();
    }
}
