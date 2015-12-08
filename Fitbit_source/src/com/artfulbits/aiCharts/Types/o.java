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

public class o extends q
{

    public static final d k;
    public static final d l = d.a("spline_tension", com/artfulbits/aiCharts/Types/o, java/lang/Float, Float.valueOf(1.0F));
    protected y i;
    protected final Path j = new Path();

    public o()
    {
        i = new y();
    }

    protected static void a(float af[], float f, Path path)
    {
        float f1 = 6F * f;
        int i1;
        int j2;
        if (f == 0.0F)
        {
            f = 1.0F;
        } else
        {
            f = 1.0F / f1;
        }
        i1 = af.length / 2;
        path.moveTo(af[0], af[1]);
        j2 = i1 - 1;
        i1 = 1;
        while (i1 <= j2) 
        {
            int l1 = (i1 - 1) * 2;
            int i2 = i1 * 2;
            float f2;
            float f3;
            float f4;
            float f5;
            int j1;
            int k1;
            if (i1 == 1)
            {
                j1 = l1;
            } else
            {
                j1 = (i1 - 2) * 2;
            }
            if (i1 == j2)
            {
                k1 = i2;
            } else
            {
                k1 = (i1 + 1) * 2;
            }
            f2 = af[l1];
            f3 = af[i2];
            f4 = af[j1];
            f5 = af[l1 + 1];
            path.cubicTo((f2 * f1 + 1.0F * (f3 - f4)) * f, ((af[i2 + 1] - af[j1 + 1]) * 1.0F + f5 * f1) * f, (af[i2] * f1 - 1.0F * (af[k1] - af[l1])) * f, f * (af[i2 + 1] * f1 - (af[k1 + 1] - af[l1 + 1]) * 1.0F), af[i2], af[i2 + 1]);
            i1++;
        }
    }

    protected void a(Canvas canvas, Rect rect, k k1)
    {
        a(canvas, rect, k1, e, false);
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        int l1 = chartseries.G().b;
        List list = chartseries.I();
        if (list.size() > 0)
        {
            int i2 = ((Integer)chartseries.a(k)).intValue();
            Path path = new Path();
            int k1 = list.size() - 1;
            double d1 = m1.e.a().f();
            double d2 = m1.e.a().g();
            int i1 = a(list, d1, d2, 0, k1);
            k1 = b(list, d1, d2, i1, k1);
            i1 = Math.max(i1 - 1, 0);
            int j2 = Math.min(k1 + 1, list.size() - 1);
            PointF pointf = new PointF();
            float af[] = new float[((j2 - i1) + 1) * 2];
            k1 = 0;
            for (; i1 <= j2; i1++)
            {
                j j1 = (j)list.get(i1);
                m1.a(j1.a(), j1.a(l1), pointf);
                int k2 = k1 + 1;
                af[k1] = pointf.x;
                k1 = k2 + 1;
                af[k2] = pointf.y;
                if (m1.m)
                {
                    path.reset();
                    path.addCircle(pointf.x, pointf.y, i2, android.graphics.Path.Direction.CW);
                    path.close();
                    m1.a(path, m1.g, j1);
                }
            }

            j.rewind();
            a(af, ((Float)m1.b.a(l)).floatValue(), j);
            i.a(m1);
            i.a(j, chartseries);
            i.a();
        }
    }

    static 
    {
        k = com.artfulbits.aiCharts.Types.ChartLineType.k;
    }
}
