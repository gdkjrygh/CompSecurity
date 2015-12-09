// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class q extends com.artfulbits.aiCharts.Base.q
{

    public static final d h;
    private final y i = new y();

    public q()
    {
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        List list = chartseries.I();
        int k1 = chartpointdeclaration.b;
        if (list.size() > 1)
        {
            Path path = new Path();
            PointF apointf[] = new PointF[list.size()];
            PointF apointf1[] = new PointF[list.size()];
            for (int k = 0; k < list.size(); k++)
            {
                j j1 = (j)list.get(k);
                apointf[k] = m1.a(j1.a(), m1.a(j1, k1, false));
                apointf1[k] = m1.a(j1.a(), m1.a(j1, k1, true));
            }

            path.moveTo(apointf[0].x, apointf[0].y);
            for (int l = 1; l < apointf.length; l++)
            {
                path.lineTo(apointf[l].x, apointf[l].y);
            }

            for (int i1 = apointf.length - 1; i1 >= 0; i1--)
            {
                path.lineTo(apointf1[i1].x, apointf1[i1].y);
            }

            path.close();
            i.a(m1);
            i.e(path, chartseries);
            i.a();
        }
    }

    public boolean b()
    {
        return true;
    }

    public boolean d()
    {
        return true;
    }

    static 
    {
        h = a;
    }
}
