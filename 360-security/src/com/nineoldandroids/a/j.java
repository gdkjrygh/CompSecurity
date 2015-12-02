// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.nineoldandroids.a:
//            i, f, h, n

class j
{

    int a;
    i b;
    i c;
    Interpolator d;
    ArrayList e;
    n f;

    public transient j(i ai[])
    {
        a = ai.length;
        e = new ArrayList();
        e.addAll(Arrays.asList(ai));
        b = (i)e.get(0);
        c = (i)e.get(a - 1);
        d = c.d();
    }

    public static transient j a(float af[])
    {
        int k = 1;
        int l = af.length;
        i.a aa[] = new i.a[Math.max(l, 2)];
        if (l == 1)
        {
            aa[0] = (i.a)i.b(0.0F);
            aa[1] = (i.a)i.a(1.0F, af[0]);
        } else
        {
            aa[0] = (i.a)i.a(0.0F, af[0]);
            while (k < l) 
            {
                aa[k] = (i.a)i.a((float)k / (float)(l - 1), af[k]);
                k++;
            }
        }
        return new f(aa);
    }

    public static transient j a(int ai[])
    {
        int k = 1;
        int l = ai.length;
        i.b ab[] = new i.b[Math.max(l, 2)];
        if (l == 1)
        {
            ab[0] = (i.b)i.a(0.0F);
            ab[1] = (i.b)i.a(1.0F, ai[0]);
        } else
        {
            ab[0] = (i.b)i.a(0.0F, ai[0]);
            while (k < l) 
            {
                ab[k] = (i.b)i.a((float)k / (float)(l - 1), ai[k]);
                k++;
            }
        }
        return new h(ab);
    }

    public Object a(float f1)
    {
        if (a == 2)
        {
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            return f.a(f2, b.b(), c.b());
        }
        if (f1 <= 0.0F)
        {
            i k = (i)e.get(1);
            Interpolator interpolator = k.d();
            float f3 = f1;
            if (interpolator != null)
            {
                f3 = interpolator.getInterpolation(f1);
            }
            f1 = b.c();
            f1 = (f3 - f1) / (k.c() - f1);
            return f.a(f1, b.b(), k.b());
        }
        if (f1 >= 1.0F)
        {
            i l = (i)e.get(a - 2);
            Interpolator interpolator1 = c.d();
            float f4 = f1;
            if (interpolator1 != null)
            {
                f4 = interpolator1.getInterpolation(f1);
            }
            f1 = l.c();
            f1 = (f4 - f1) / (c.c() - f1);
            return f.a(f1, l.b(), c.b());
        }
        i i1 = b;
        int k1 = 1;
        do
        {
            if (k1 >= a)
            {
                return c.b();
            }
            i j1 = (i)e.get(k1);
            if (f1 < j1.c())
            {
                Interpolator interpolator2 = j1.d();
                float f5 = f1;
                if (interpolator2 != null)
                {
                    f5 = interpolator2.getInterpolation(f1);
                }
                f1 = i1.c();
                f1 = (f5 - f1) / (j1.c() - f1);
                return f.a(f1, i1.b(), j1.b());
            }
            k1++;
            i1 = j1;
        } while (true);
    }

    public void a(n n1)
    {
        f = n1;
    }

    public j b()
    {
        ArrayList arraylist = e;
        int l = e.size();
        i ai[] = new i[l];
        int k = 0;
        do
        {
            if (k >= l)
            {
                return new j(ai);
            }
            ai[k] = ((i)arraylist.get(k)).e();
            k++;
        } while (true);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return b();
    }

    public String toString()
    {
        String s = " ";
        int k = 0;
        do
        {
            if (k >= a)
            {
                return s;
            }
            s = (new StringBuilder(String.valueOf(s))).append(((i)e.get(k)).b()).append("  ").toString();
            k++;
        } while (true);
    }
}
