// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
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

public class d extends q
{

    public static final com.artfulbits.aiCharts.Base.d h = com.artfulbits.aiCharts.Base.d.a("candle-price_up", com/artfulbits/aiCharts/Types/d, java/lang/Integer, Integer.valueOf(-1));
    public static final com.artfulbits.aiCharts.Base.d i = com.artfulbits.aiCharts.Base.d.a("candle-price_down", com/artfulbits/aiCharts/Types/d, java/lang/Integer, Integer.valueOf(0xff000000));
    private final y j = new y();

    public d()
    {
    }

    public void a(m m1)
    {
        Object obj = m1.b;
        r r1 = m1.c();
        Object obj1 = ((ChartSeries) (obj)).G();
        List list = ((ChartSeries) (obj)).I();
        int l = ((ChartPointDeclaration) (obj1)).d;
        int i1 = ((ChartPointDeclaration) (obj1)).e;
        int k1 = ((ChartPointDeclaration) (obj1)).f;
        int l1 = ((ChartPointDeclaration) (obj1)).g;
        int i2 = ((Integer)((ChartSeries) (obj)).a(h)).intValue();
        int j2 = ((Integer)((ChartSeries) (obj)).a(i)).intValue();
        int k2 = list.size() - 1;
        double d1 = m1.c.a().f();
        double d2 = m1.c.a().g();
        int k = a(list, d1, d2, 0, k2);
        k2 = b(list, d1, d2, k, k2);
        obj = new PointF();
        obj1 = new PointF();
        RectF rectf = new RectF();
        j.a(m1);
        while (k <= k2) 
        {
            j j1 = (j)list.get(k);
            m1.a(j1.a() + r1.a(), j1.a(l), ((PointF) (obj)));
            m1.a(j1.a() + r1.a(), j1.a(i1), ((PointF) (obj1)));
            m1.a(j1.a() + r1.a, j1.a(k1), j1.a() + r1.b, j1.a(l1), rectf);
            j.a(((PointF) (obj)), ((PointF) (obj1)), j1);
            Paint paint = j.a;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            if (j1.a(k1) > j1.a(l1))
            {
                paint.setColor(j2);
            } else
            {
                paint.setColor(i2);
            }
            m1.a.drawRect(rectf, paint);
            j.b(rectf, j1);
            k++;
        }
        j.a();
    }

    public boolean a()
    {
        return true;
    }

    public r b(ChartSeries chartseries)
    {
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        return a(this, chartseries, new int[] {
            chartpointdeclaration.d, chartpointdeclaration.e, chartpointdeclaration.f, chartpointdeclaration.g
        });
    }

    public boolean d()
    {
        return false;
    }

    public com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] h()
    {
        return (new com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] {
            com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.c, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.d, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.e, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.f
        });
    }

}
