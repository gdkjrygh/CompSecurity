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
//            w, a, y

public class v extends q
{

    public static final d h;
    public static final d i;
    private final y j = new y();

    public v()
    {
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        List list = m1.b.I();
        if (list.size() > 0)
        {
            boolean flag1 = ((Boolean)m1.b.a(h)).booleanValue();
            int i1 = chartseries.G().b;
            int k = list.size() - 1;
            double d1 = m1.e.a().f();
            double d2 = m1.e.a().g();
            double d3 = m1.f.t();
            int k1 = a(list, d1, d2, 0, k);
            int l1 = b(list, d1, d2, k1, k);
            Object obj;
            Path path;
            PointF pointf;
            boolean flag;
            int l;
            if (chartseries.a(i) == ChartBorderStyle.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            path = new Path();
            pointf = new PointF();
            obj = (j)list.get(k1);
            m1.a(((j) (obj)).a(), ((j) (obj)).a(i1), pointf);
            path.moveTo(pointf.x, pointf.y);
            l = k1 + 1;
            while (l <= l1) 
            {
                j j1 = (j)list.get(l);
                if (flag1)
                {
                    m1.a(((j) (obj)).a(), j1.a(i1), pointf);
                    path.lineTo(pointf.x, pointf.y);
                } else
                {
                    m1.a(j1.a(), ((j) (obj)).a(i1), pointf);
                    path.lineTo(pointf.x, pointf.y);
                }
                m1.a(j1.a(), j1.a(i1), pointf);
                path.lineTo(pointf.x, pointf.y);
                l++;
                obj = j1;
            }
            if (flag)
            {
                obj = new Path(path);
            } else
            {
                obj = null;
            }
            m1.a(((j)list.get(l1)).a(), d3, pointf);
            path.lineTo(pointf.x, pointf.y);
            m1.a(((j)list.get(k1)).a(), d3, pointf);
            path.lineTo(pointf.x, pointf.y);
            path.close();
            if (m1.m)
            {
                m1.a(path, m1.g, m1.b);
            }
            j.a(m1);
            if (obj == null)
            {
                j.e(path, chartseries);
            } else
            {
                j.c(path, chartseries);
                j.b(((Path) (obj)), chartseries);
            }
            j.a();
        }
    }

    public boolean d()
    {
        return true;
    }

    static 
    {
        h = w.h;
        i = a.h;
    }
}
