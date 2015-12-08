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
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartLineType, y

public class g extends q
{

    public static final d h;
    public static final d i;
    public static final d j;
    private final y k = new y();
    private final Path l = new Path();

    public g()
    {
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        List list = chartseries.I();
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        if (list.size() > 0)
        {
            int i1 = list.size() - 1;
            double d = m1.c.a().f();
            double d1 = m1.c.a().g();
            Object obj = (ChartLineType.BreakMode)chartseries.a(ChartLineType.h);
            double d2;
            PointF pointf;
            Path path;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (obj != ChartLineType.BreakMode.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj == ChartLineType.BreakMode.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            d2 = ((Double)chartseries.a(ChartLineType.i)).doubleValue();
            if (flag1)
            {
                j j1;
                int k1;
                int l1;
                if (!Double.isInfinite(d2))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag2 = flag;
            } else
            {
                flag2 = flag;
            }
            k1 = a(list, d, d1, 0, i1);
            l1 = b(list, d, d1, k1, i1);
            k.a(m1);
            obj = (j)list.get(k1);
            pointf = f;
            path = l;
            path.reset();
            i1 = 1;
            while (k1 <= l1) 
            {
                j1 = (j)list.get(k1);
                m1.a(j1.a(), j1.a(chartpointdeclaration.b), pointf);
                if (flag2)
                {
                    if (flag1)
                    {
                        if (j1.a() - ((j) (obj)).a() <= d2)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    if (!((Boolean)((j) (obj)).a(com.artfulbits.aiCharts.Types.ChartLineType.j)).booleanValue())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = true;
                }
                if (!flag)
                {
                    k.a(path, chartseries);
                    flag = true;
                    path.reset();
                } else
                {
                    flag = i1;
                }
                if (flag)
                {
                    path.moveTo(pointf.x, pointf.y);
                    flag = false;
                } else
                {
                    path.lineTo(pointf.x, pointf.y);
                }
                k1++;
                obj = j1;
                i1 = ((flag) ? 1 : 0);
            }
            k.a(path, chartseries);
        }
        k.a();
    }

    public void b(m m1)
    {
    }

    static 
    {
        h = ChartLineType.h;
        i = ChartLineType.i;
        j = com.artfulbits.aiCharts.Types.ChartLineType.j;
    }
}
