// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            a, ChartSeries, q

static final class tSeries.a
{

    private Class a;
    private String b;
    private ChartSeries c;

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof tSeries.a)) goto _L2; else goto _L1
_L1:
        obj = (tSeries.a)obj;
        if (c == null) goto _L4; else goto _L3
_L3:
        if (c != ((c) (obj)).c) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        if (a != ((a) (obj)).a)
        {
            return false;
        }
        if (b != ((b) (obj)).b)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj instanceof ChartSeries)
        {
            obj = (ChartSeries)obj;
            if (c != null)
            {
                if (c != obj)
                {
                    return false;
                }
            } else
            {
                if (a != ((ChartSeries) (obj)).H().getClass())
                {
                    return false;
                }
                if (b != ((ChartSeries) (obj)).a(q.a))
                {
                    return false;
                }
            }
        } else
        {
            return false;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public tSeries(ChartSeries chartseries)
    {
        q q1 = chartseries.H();
        ChartSeries chartseries1;
        if (q1.b())
        {
            chartseries1 = null;
        } else
        {
            chartseries1 = chartseries;
        }
        c = chartseries1;
        a = q1.getClass();
        b = (String)chartseries.a(q.a);
    }
}
