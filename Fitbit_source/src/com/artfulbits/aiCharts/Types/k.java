// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
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

public class k extends q
{

    private final y h = new y();

    public k()
    {
    }

    public void a(m m1)
    {
        Object obj = m1.b.I();
        if (((List) (obj)).size() > 1)
        {
            int l1 = m1.b.G().d;
            int i2 = m1.b.G().e;
            int i1 = ((List) (obj)).size() - 1;
            double d = m1.e.a().f();
            double d1 = m1.e.a().g();
            int i = a(((List) (obj)), d, d1, 0, i1);
            int j2 = b(((List) (obj)), d, d1, i, i1);
            PointF pointf = new PointF();
            float af[] = new float[((j2 - i) + 1) * 4];
            i1 = 0;
            for (; i <= j2; i++)
            {
                j j1 = (j)((List) (obj)).get(i);
                m1.a(j1.a(), j1.a(l1), pointf);
                int k2 = i1 + 1;
                af[i1] = pointf.x;
                i1 = k2 + 1;
                af[k2] = pointf.y;
                m1.a(j1.a(), j1.a(i2), pointf);
                k2 = i1 + 1;
                af[i1] = pointf.x;
                af[k2] = pointf.y;
                i1 = k2 + 1;
            }

            obj = new Path();
            ((Path) (obj)).moveTo(af[0], af[1]);
            i = 1;
            for (int k1 = af.length / 4; i < k1; i++)
            {
                ((Path) (obj)).lineTo(af[i * 4], af[i * 4 + 1]);
            }

            for (int l = af.length / 4 - 1; l >= 0; l--)
            {
                ((Path) (obj)).lineTo(af[l * 4 + 2], af[l * 4 + 3]);
            }

            ((Path) (obj)).close();
            if (m1.m)
            {
                m1.a(((Path) (obj)), m1.g, m1.b);
            }
            h.a(m1);
            h.e(((Path) (obj)), m1.b);
            h.a();
        }
    }

    public boolean a()
    {
        return true;
    }

    public r b(ChartSeries chartseries)
    {
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        return q.a(this, chartseries, new int[] {
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
