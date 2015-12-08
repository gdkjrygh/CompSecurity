// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            qq, qp

public final class qo
{

    private final String a[];
    private final double b[];
    private final double c[];
    private final int d[];
    private int e;

    private qo(qq qq1)
    {
        int i = qq.a(qq1).size();
        a = (String[])qq.b(qq1).toArray(new String[i]);
        b = a(qq.a(qq1));
        c = a(qq.c(qq1));
        d = new int[i];
        e = 0;
    }

    qo(qq qq1, byte byte0)
    {
        this(qq1);
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
            arraylist.add(new qp(a[i], c[i], b[i], (double)d[i] / (double)e, d[i]));
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
