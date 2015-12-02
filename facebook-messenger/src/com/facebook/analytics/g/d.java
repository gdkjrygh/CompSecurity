// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.g;

import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.analytics.g:
//            a

class d
{

    private long a;
    private double b;
    private double c;

    d(long l)
    {
        this(l, 0.083333333333333329D);
    }

    d(long l, double d1)
    {
        b = 0.0D;
        a = l;
        c = d1;
    }

    private void c(long l)
    {
        if (l < a)
        {
            a = l;
            com.facebook.debug.log.b.b(com.facebook.analytics.g.a.a(), "Time went backwards.");
        }
        double d1 = (double)(l - a) / 1000D;
        b = Math.max(0.0D, b - d1 * c);
        a = l;
    }

    double a(long l)
    {
        c(l);
        double d1 = b + 1.0D;
        b = d1;
        return d1;
    }

    double b(long l)
    {
        c(l);
        return b;
    }
}
