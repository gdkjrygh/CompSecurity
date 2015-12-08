// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cju
{

    public final double a[];
    public final double b[];
    public final int c[];
    public int d;
    private final String e[];

    private cju(cjw cjw1)
    {
        int i = cjw1.b.size();
        e = (String[])cjw1.a.toArray(new String[i]);
        a = a(cjw1.b);
        b = a(cjw1.c);
        c = new int[i];
        d = 0;
    }

    public cju(cjw cjw1, byte byte0)
    {
        this(cjw1);
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
        ArrayList arraylist = new ArrayList(e.length);
        for (int i = 0; i < e.length; i++)
        {
            arraylist.add(new cjv(e[i], b[i], a[i], (double)c[i] / (double)d, c[i]));
        }

        return arraylist;
    }
}
