// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.facebook.a:
//            f, b, g

public final class e
{
    private static final class a
    {

        public double a;
        double b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static int m = 0;
    f a;
    public boolean b;
    final String c;
    public final a d = new a((byte)0);
    final a e = new a((byte)0);
    final a f = new a((byte)0);
    double g;
    double h;
    boolean i;
    public double j;
    public CopyOnWriteArraySet k;
    double l;
    private double n;
    private final b o;

    e(b b1)
    {
        i = true;
        n = 0.0050000000000000001D;
        j = 0.0050000000000000001D;
        k = new CopyOnWriteArraySet();
        l = 0.0D;
        if (b1 == null)
        {
            throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
        } else
        {
            o = b1;
            b1 = new StringBuilder("spring:");
            int i1 = m;
            m = i1 + 1;
            c = b1.append(i1).toString();
            a(f.c);
            return;
        }
    }

    public final e a(double d1)
    {
        g = d1;
        d.a = d1;
        o.a(c);
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((g)iterator.next()).onSpringUpdate(this)) { }
        h = d.a;
        f.a = d.a;
        d.b = 0.0D;
        return this;
    }

    public final e a(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("springConfig is required");
        } else
        {
            a = f1;
            return this;
        }
    }

    public final e a(g g1)
    {
        k.add(g1);
        return this;
    }

    public final boolean a()
    {
        return a.b > 0.0D && (g < h && d.a > h || g > h && d.a < h);
    }

    public final e b(double d1)
    {
        if (h != d1 || !b())
        {
            g = d.a;
            h = d1;
            o.a(c);
            Iterator iterator = k.iterator();
            while (iterator.hasNext()) 
            {
                ((g)iterator.next()).onSpringEndStateChange(this);
            }
        }
        return this;
    }

    public final boolean b()
    {
        if (Math.abs(d.b) <= n)
        {
            a a1 = d;
            if (Math.abs(h - a1.a) <= j || a.b == 0.0D)
            {
                return true;
            }
        }
        return false;
    }

    public final e c(double d1)
    {
        if (d1 == d.b)
        {
            return this;
        } else
        {
            d.b = d1;
            o.a(c);
            return this;
        }
    }

}
