// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.List;
import java.util.Vector;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            f, ChartLegend

public static final class d extends f
{

    private final f d[];

    public final List a()
    {
        c.clear();
        f af[] = d;
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            f f1 = af[i];
            c.addAll(f1.a());
        }

        return c;
    }

    final void a(ChartLegend chartlegend)
    {
        super.a(chartlegend);
        f af[] = d;
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            af[i].a(chartlegend);
        }

    }

    public transient tLegend(f af[])
    {
        super(null);
        d = af;
    }
}
