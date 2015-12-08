// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class mkk
{

    double a;
    double b;
    final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double j;
    boolean k;
    public boolean l;
    double m;
    private double n;
    private double o;

    public mkk(double d1, double d2)
    {
        k = true;
        n = 0.0050000000000000001D;
        o = 0.0050000000000000001D;
        l = false;
        m = 0.0D;
        a = 100D;
        b = 18D;
    }

    static boolean a(double d1, double d2, double d3, double d4)
    {
        return d2 > 0.0D && (d3 >= d4 ? d1 < d4 : d1 > d4);
    }

    public final mkk a(double d1)
    {
        if (d1 != f)
        {
            f = d1;
            i = f;
            mkl mkl1;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); mkl1.a(d1))
            {
                mkl1 = (mkl)iterator.next();
                mkl1.a(this);
            }

        }
        return this;
    }

    public final mkk a(mkl mkl1)
    {
        c.add(mkl1);
        return this;
    }

    public final boolean a()
    {
        return Math.abs(g) <= n && (Math.abs(j - f) <= o || a == 0.0D);
    }

    public final mkk b(double d1)
    {
        if (d1 != j)
        {
            j = d1;
            i = f;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mkl)iterator.next()).a(this)) { }
        }
        return this;
    }
}
