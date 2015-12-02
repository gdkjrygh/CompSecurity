// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.n;

import com.facebook.common.b.d;
import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.facebook.n:
//            e, i, g, j

public class c
{

    private static int a = 0;
    private g b;
    private boolean c;
    private final String d;
    private final e e = new e(null);
    private final e f = new e(null);
    private final e g = new e(null);
    private double h;
    private double i;
    private boolean j;
    private double k;
    private double l;
    private d m;
    private double n;
    private final j o;

    c(j j1)
    {
        j = true;
        k = 0.0001D;
        l = 0.0001D;
        m = new d();
        n = 0.0D;
        Preconditions.checkNotNull(j1, "Spring cannot be created outside of a SpringSystem");
        o = j1;
        j1 = (new StringBuilder()).append("spring:");
        int i1 = a;
        a = i1 + 1;
        d = j1.append(i1).toString();
    }

    private double a(e e1)
    {
        return Math.abs(i - e1.a);
    }

    private void f(double d1)
    {
        e.a = e.a * d1 + f.a * (1.0D - d1);
        e.b = e.b * d1 + f.b * (1.0D - d1);
    }

    public c a(double d1)
    {
        h = d1;
        e.a = d1;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((i)iterator.next()).b(this)) { }
        return this;
    }

    public c a(g g1)
    {
        b = (g)Preconditions.checkNotNull(g1);
        return this;
    }

    public c a(i i1)
    {
        Preconditions.checkNotNull(i1);
        m.a(i1);
        return this;
    }

    public c a(boolean flag)
    {
        c = flag;
        return this;
    }

    public void a()
    {
        m.a();
        o.b(this);
    }

    void a(double d1, double d2)
    {
        boolean flag2 = h();
        if (!flag2 || !j)
        {
            d1 = d2;
            if (d2 > 0.064000000000000001D)
            {
                d1 = 0.064000000000000001D;
            }
            n = n + d1;
            double d5 = b.b;
            double d6 = b.a;
            d2 = e.a;
            d1 = e.b;
            double d4 = g.a;
            double d3 = g.b;
            while (n >= 0.001D) 
            {
                n = n - 0.001D;
                if (n < 0.001D)
                {
                    f.a = d2;
                    f.b = d1;
                }
                double d7 = (i - d4) * d5 - d6 * d1;
                double d11 = d1 + 0.001D * d7 * 0.5D;
                double d8 = (i - (0.001D * d1 * 0.5D + d2)) * d5 - d6 * d11;
                double d12 = d1 + 0.001D * d8 * 0.5D;
                double d9 = (i - (0.001D * d11 * 0.5D + d2)) * d5 - d6 * d12;
                d4 = d2 + 0.001D * d12;
                d3 = 0.001D * d9 + d1;
                double d10 = i;
                d2 += ((d11 + d12) * 2D + d1 + d3) * 0.16666666666666666D * 0.001D;
                d1 += (d7 + (d8 + d9) * 2D + ((d10 - d4) * d5 - d6 * d3)) * 0.16666666666666666D * 0.001D;
            }
            g.a = d4;
            g.b = d3;
            e.a = d2;
            e.b = d1;
            if (n > 0.0D)
            {
                f(n / 0.001D);
            }
            if (h() || c && e())
            {
                h = i;
                e.a = i;
                c(0.0D);
                flag2 = true;
            }
            Iterator iterator;
            boolean flag;
            boolean flag1;
            if (j)
            {
                j = false;
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = false;
            if (flag2)
            {
                j = true;
                flag1 = true;
            }
            iterator = m.iterator();
            while (iterator.hasNext()) 
            {
                i i1 = (i)iterator.next();
                if (flag)
                {
                    i1.a(this);
                }
                i1.b(this);
                if (flag1)
                {
                    i1.c(this);
                }
            }
        }
    }

    public c b(double d1)
    {
        if (i != d1 || !h())
        {
            h = c();
            i = d1;
            o.a(b());
            Iterator iterator = m.iterator();
            while (iterator.hasNext()) 
            {
                ((i)iterator.next()).d(this);
            }
        }
        return this;
    }

    public String b()
    {
        return d;
    }

    public double c()
    {
        return e.a;
    }

    public c c(double d1)
    {
        e.b = d1;
        return this;
    }

    public double d()
    {
        return i;
    }

    public c d(double d1)
    {
        k = d1;
        return this;
    }

    public c e(double d1)
    {
        l = d1;
        return this;
    }

    public boolean e()
    {
        return h < i && c() > i || h > i && c() < i;
    }

    public boolean f()
    {
        return !h() || !g();
    }

    public boolean g()
    {
        return j;
    }

    public boolean h()
    {
        return Math.abs(e.b) <= k && a(e) <= l;
    }

    public c i()
    {
        i = e.a;
        g.a = e.a;
        e.b = 0.0D;
        return this;
    }

    public c j()
    {
        m.a();
        return this;
    }

}
