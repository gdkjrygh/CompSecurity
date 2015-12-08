// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            n

public class o
    implements Iterable
{

    private List a;
    private double b;
    private double c;
    private double d;
    private double e;

    public o()
    {
        a = new ArrayList();
        b = 9.2233720368547758E+18D;
        c = -9.2233720368547758E+18D;
        d = (1.0D / 0.0D);
        e = (-1.0D / 0.0D);
    }

    public double a()
    {
        return c;
    }

    public n a(int i)
    {
        return (n)a.get(i);
    }

    public boolean a(n n1)
    {
        b(n1);
        return a.add(n1);
    }

    public double b()
    {
        return d;
    }

    protected void b(n n1)
    {
        c = Math.max(c, n1.a());
        b = Math.min(b, n1.a());
        e = Math.max(e, n1.b());
        d = Math.min(d, n1.b());
    }

    public double c()
    {
        return e;
    }

    public int d()
    {
        return a.size();
    }

    public Iterator iterator()
    {
        return a.iterator();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" timeMinimum: ").append((new Date((long)b)).toString());
        stringbuilder.append(" timeMaximum: ").append((new Date((long)c)).toString());
        stringbuilder.append(" valueMinimum: ").append(String.valueOf(d));
        stringbuilder.append(" valueMaximum: ").append(String.valueOf(e));
        stringbuilder.append(" List: ").append(a.toString());
        return stringbuilder.toString();
    }
}
