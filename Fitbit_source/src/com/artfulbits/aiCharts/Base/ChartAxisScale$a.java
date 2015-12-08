// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.Calendar;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxisScale

static final class d
    implements d
{

    private final Calendar a;
    private final Calendar b = Calendar.getInstance();
    private final int c;
    private final int d;

    public final double a()
    {
        return (double)a.getTimeInMillis();
    }

    public final boolean b()
    {
        a.add(d, c);
        return a.before(b);
    }

    public (double d1, double d2, int i, int j)
    {
        a = ChartAxisScale.a(d1, j);
        b.setTimeInMillis((long)d2);
        c = i;
        d = j;
    }
}
