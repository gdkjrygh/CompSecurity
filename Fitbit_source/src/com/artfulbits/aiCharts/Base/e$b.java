// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            e, ChartLegend

final class <init>
    implements tCollection.a
{

    private e a;

    public final void a(Object obj, Object obj1, int i)
    {
        obj = (ChartLegend)obj;
        obj1 = (ChartLegend)obj1;
        if (obj != null)
        {
            ((ChartLegend) (obj)).a(a);
        }
        if (obj1 != null)
        {
            ((ChartLegend) (obj1)).a(null);
        }
        a.b(257);
    }

    private tLegend(e e1)
    {
        a = e1;
        super();
    }

    a(e e1, byte byte0)
    {
        this(e1);
    }
}
