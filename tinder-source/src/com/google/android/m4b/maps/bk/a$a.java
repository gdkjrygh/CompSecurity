// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            a, l

public static final class c
    implements Comparator
{

    private final a a;
    private final double b;
    private final double c;

    public final int a(int ai[], int ai1[])
    {
        double d = a.a(ai[1]);
        double d1 = a.b(ai[1]);
        double d2 = a.a(ai1[1]);
        double d3 = a.b(ai1[1]);
        if (b == d && c == d1)
        {
            return -1;
        }
        if (b == d2 && c == d3)
        {
            return 1;
        }
        boolean flag;
        boolean flag1;
        if (l.a(d, d1, b, c) < 0 || l.a(d, d1, b, c) == 0 && d1 < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l.a(d2, d3, b, c) < 0 || l.a(d2, d3, b, c) < 0 && d3 < c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            double d4 = l.a(b, c, d2, d3, d, d1);
            if (d4 == 0.0D)
            {
                return l.a(d, d1, d2, d3) <= 0 ? -1 : 1;
            }
            return d4 <= 0.0D ? -1 : 1;
        }
        return !flag ? 1 : -1;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((int[])obj, (int[])obj1);
    }

    public (a a1, int i)
    {
        a = a1;
        b = a1.a(i);
        c = a1.b(i);
    }
}
