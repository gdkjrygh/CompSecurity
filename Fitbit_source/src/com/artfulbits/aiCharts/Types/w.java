// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.k;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartLineType, y

public class w extends q
{

    public static final d h = d.a("step_line-inverted", com/artfulbits/aiCharts/Types/w, java/lang/Boolean, Boolean.valueOf(false));
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    private final y m = new y();

    public w()
    {
    }

    protected void a(Canvas canvas, Rect rect, k k1)
    {
        a(canvas, rect, k1, e, false);
    }

    public void a(m m1)
    {
        Object obj = m1.b;
        ChartPointDeclaration chartpointdeclaration = ((ChartSeries) (obj)).G();
        List list = m1.b.I();
        if (list.size() > 0)
        {
            Boolean boolean1 = (Boolean)m1.b.a(h);
            int l1 = list.size() - 1;
            double d1 = m1.c.a().f();
            double d2 = m1.c.a().g();
            ChartLineType.BreakMode breakmode = (ChartLineType.BreakMode)((ChartSeries) (obj)).a(ChartLineType.h);
            double d3;
            Path path;
            PointF pointf2;
            int i1;
            boolean flag;
            int k1;
            int i2;
            if (breakmode != ChartLineType.BreakMode.a)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (breakmode == ChartLineType.BreakMode.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d3 = ((Double)((ChartSeries) (obj)).a(ChartLineType.i)).doubleValue();
            i2 = ((Integer)((ChartSeries) (obj)).a(l)).intValue();
            path = new Path();
            if (flag)
            {
                PointF pointf;
                PointF pointf1;
                int j2;
                if (!Double.isInfinite(d3))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                k1 = i1;
            } else
            {
                k1 = i1;
            }
            i1 = a(list, d1, d2, 0, l1);
            j2 = b(list, d1, d2, i1, l1);
            obj = (j)list.get(i1);
            pointf = m1.a(((j) (obj)).a(), ((j) (obj)).a(chartpointdeclaration.b));
            pointf1 = new PointF();
            pointf2 = new PointF();
            m.a(m1);
            l1 = i1 + 1;
            while (l1 <= j2) 
            {
                j j1 = (j)list.get(l1);
                m1.a(j1.a(), j1.a(chartpointdeclaration.b), pointf1);
                if (boolean1.booleanValue())
                {
                    m1.a(((j) (obj)).a(), j1.a(chartpointdeclaration.b), pointf2);
                } else
                {
                    m1.a(j1.a(), ((j) (obj)).a(chartpointdeclaration.b), pointf2);
                }
                if (k1 != 0)
                {
                    if (flag)
                    {
                        if (j1.a() - ((j) (obj)).a() <= d3)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                    } else
                    if (!((Boolean)((j) (obj)).a(com.artfulbits.aiCharts.Types.ChartLineType.j)).booleanValue())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                } else
                {
                    i1 = 1;
                }
                if (i1 != 0)
                {
                    m.a(pointf, pointf2, ((k) (obj)));
                    m.a(pointf2, pointf1, ((k) (obj)));
                }
                if (m1.m)
                {
                    path.reset();
                    path.addCircle(pointf1.x, pointf1.y, i2, android.graphics.Path.Direction.CW);
                    path.close();
                    m1.a(path, m1.g, j1);
                }
                pointf.set(pointf1);
                obj = j1;
                l1++;
            }
            m.a();
        }
    }

    static 
    {
        i = ChartLineType.h;
        j = ChartLineType.i;
        k = com.artfulbits.aiCharts.Types.ChartLineType.j;
        l = com.artfulbits.aiCharts.Types.ChartLineType.k;
    }
}
