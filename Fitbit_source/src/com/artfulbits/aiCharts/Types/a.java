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
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Enums.ChartBorderStyle;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class a extends q
{

    public static final d h;
    private final y i = new y();

    public a()
    {
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        int k1 = chartseries.G().b;
        Object obj = chartseries.I();
        if (((List) (obj)).size() > 1)
        {
            int k = ((List) (obj)).size() - 1;
            double d1 = m1.e.a().f();
            double d2 = m1.e.a().g();
            double d3 = m1.f.t();
            int i1 = a(((List) (obj)), d1, d2, 0, k);
            int l1 = b(((List) (obj)), d1, d2, i1, k);
            Path path;
            PointF pointf;
            j j1;
            j j2;
            boolean flag;
            int l;
            if (chartseries.a(h) == ChartBorderStyle.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            path = new Path();
            pointf = new PointF();
            j1 = (j)((List) (obj)).get(i1);
            j2 = (j)((List) (obj)).get(l1);
            l = i1;
            while (l <= l1) 
            {
                j j3 = (j)((List) (obj)).get(l);
                m1.a(j3.a(), j3.a(k1), pointf);
                if (l == i1)
                {
                    path.moveTo(pointf.x, pointf.y);
                } else
                {
                    path.lineTo(pointf.x, pointf.y);
                }
                l++;
            }
            if (flag)
            {
                obj = new Path(path);
            } else
            {
                obj = null;
            }
            m1.a(j2.a(), d3, pointf);
            path.lineTo(pointf.x, pointf.y);
            m1.a(j1.a(), d3, pointf);
            path.lineTo(pointf.x, pointf.y);
            path.close();
            if (m1.m)
            {
                m1.a(path, m1.g, chartseries);
            }
            i.a(m1);
            if (obj == null)
            {
                i.e(path, chartseries);
            } else
            {
                i.c(path, chartseries);
                i.b(((Path) (obj)), chartseries);
            }
            i.a();
        }
    }

    public boolean d()
    {
        return true;
    }

    static 
    {
        h = com.artfulbits.aiCharts.Base.d.a("border-style", com/artfulbits/aiCharts/Types/a, com/artfulbits/aiCharts/Enums/ChartBorderStyle, ChartBorderStyle.b);
    }
}
