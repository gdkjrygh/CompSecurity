// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ac, ChartLegend, f, e

final class a
    implements ac
{

    private ChartLegend a;

    public final void a(int i)
    {
        if (ChartLegend.a(a).a(i))
        {
            ChartLegend.a(a, null);
            a.f.b(1);
        }
    }

    (ChartLegend chartlegend)
    {
        a = chartlegend;
        super();
    }
}
