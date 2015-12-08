// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class gp
{
    public static final class a
    {

        public final String a;
        public final double b;
        public final double c;
        public final double d;
        public final int e;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (x.a(a, ((a) (obj = (a)obj)).a) && b == ((a) (obj)).b && c == ((a) (obj)).c && e == ((a) (obj)).e && Double.compare(d, ((a) (obj)).d) == 0)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                a, Double.valueOf(b), Double.valueOf(c), Double.valueOf(d), Integer.valueOf(e)
            });
        }

        public final String toString()
        {
            return x.a(this).a("name", a).a("minBound", Double.valueOf(c)).a("maxBound", Double.valueOf(b)).a("percent", Double.valueOf(d)).a("count", Integer.valueOf(e)).toString();
        }

        public a(String s, double d1, double d2, double d3, 
                int i)
        {
            a = s;
            c = d1;
            b = d2;
            d = d3;
            e = i;
        }
    }

    public static final class b
    {

        private final List a = new ArrayList();
        private final List b = new ArrayList();
        private final List c = new ArrayList();

        static List a(b b1)
        {
            return b1.b;
        }

        static List b(b b1)
        {
            return b1.a;
        }

        static List c(b b1)
        {
            return b1.c;
        }

        public final b a(String s, double d1, double d2)
        {
            int i = 0;
            do
            {
                if (i >= a.size())
                {
                    break;
                }
                double d3 = ((Double)c.get(i)).doubleValue();
                double d4 = ((Double)b.get(i)).doubleValue();
                if (d1 < d3 || d3 == d1 && d2 < d4)
                {
                    break;
                }
                i++;
            } while (true);
            a.add(i, s);
            c.add(i, Double.valueOf(d1));
            b.add(i, Double.valueOf(d2));
            return this;
        }

        public final gp a()
        {
            return new gp(this, (byte)0);
        }

        public b()
        {
        }
    }


    private final String a[];
    private final double b[];
    private final double c[];
    private final int d[];
    private int e;

    private gp(b b1)
    {
        int i = b.a(b1).size();
        a = (String[])b.b(b1).toArray(new String[i]);
        b = a(b.a(b1));
        c = a(b.c(b1));
        d = new int[i];
        e = 0;
    }

    gp(b b1, byte byte0)
    {
        this(b1);
    }

    private static double[] a(List list)
    {
        double ad[] = new double[list.size()];
        for (int i = 0; i < ad.length; i++)
        {
            ad[i] = ((Double)list.get(i)).doubleValue();
        }

        return ad;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList(a.length);
        for (int i = 0; i < a.length; i++)
        {
            arraylist.add(new a(a[i], c[i], b[i], (double)d[i] / (double)e, d[i]));
        }

        return arraylist;
    }

    public final void a(double d1)
    {
        e = e + 1;
        int i = 0;
        do
        {
            if (i >= c.length)
            {
                break;
            }
            if (c[i] <= d1 && d1 < b[i])
            {
                int ai[] = d;
                ai[i] = ai[i] + 1;
            }
            if (d1 < c[i])
            {
                break;
            }
            i++;
        } while (true);
    }
}
