// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            e, ChartSeries

final class <init>
    implements tCollection.a
{

    private e a;

    public final void a(Object obj, Object obj1, int i)
    {
        obj = (ChartSeries)obj;
        obj1 = (ChartSeries)obj1;
        if (obj != null)
        {
            ((ChartSeries) (obj)).a(a);
            ((ChartSeries) (obj)).a(e.c(a));
        }
        if (obj1 != null)
        {
            ((ChartSeries) (obj1)).a(null);
            ((ChartSeries) (obj1)).a(null);
        }
        a.c(16);
    }

    private tSeries(e e1)
    {
        a = e1;
        super();
    }

    a(e e1, byte byte0)
    {
        this(e1);
    }
}
