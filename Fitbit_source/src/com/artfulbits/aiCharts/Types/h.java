// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Base.r;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class h extends q
{

    private final y h = new y();

    public h()
    {
    }

    public void a(m m1)
    {
        Object obj = m1.b;
        double d = m1.c().a();
        List list = ((ChartSeries) (obj)).I();
        int k = ((ChartSeries) (obj)).G().e;
        int l = ((ChartSeries) (obj)).G().d;
        int i1 = list.size() - 1;
        double d1 = m1.c.a().f();
        double d2 = m1.c.a().g();
        int i = a(list, d1, d2, 0, i1);
        i1 = b(list, d1, d2, i, i1);
        obj = new PointF();
        PointF pointf = new PointF();
        h.a(m1);
        for (; i <= i1; i++)
        {
            j j1 = (j)list.get(i);
            m1.a(j1.a() + d, j1.a(l), ((PointF) (obj)));
            m1.a(j1.a() + d, j1.a(k), pointf);
            h.a(((PointF) (obj)), pointf, j1);
        }

        h.a();
    }

    public boolean a()
    {
        return true;
    }

    public r b(ChartSeries chartseries)
    {
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        return a(this, chartseries, new int[] {
            chartpointdeclaration.d, chartpointdeclaration.e
        });
    }

    public com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] h()
    {
        return (new com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] {
            com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.c, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.d
        });
    }
}
