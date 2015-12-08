// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Base.r;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class m extends q
{

    private final y h = new y();

    public m()
    {
    }

    public void a(com.artfulbits.aiCharts.Base.m m1)
    {
        ChartAxisScale chartaxisscale = m1.e.a();
        ChartAxisScale chartaxisscale1 = m1.f.a();
        int i = m1.b.G().b;
        r r1 = m1.c();
        int k = m1.g.centerX();
        int l = m1.g.centerY();
        int i1 = Math.min(m1.g.width(), m1.g.height()) / 2;
        Rect rect = new Rect();
        Path path = new Path();
        for (Iterator iterator = m1.b.I().iterator(); iterator.hasNext(); h.a())
        {
            j j1 = (j)iterator.next();
            double d1 = chartaxisscale1.h(j1.a(i));
            double d2 = chartaxisscale.h(j1.a() + r1.a);
            double d3 = chartaxisscale.h(j1.a() + r1.b);
            int k1 = (int)(d1 * (double)i1);
            float f = (float)(360D * d2);
            float f1 = (float)(360D * d3);
            rect.set(k - k1, l - k1, k + k1, k1 + l);
            path.reset();
            path.moveTo(k, l);
            path.addArc(new RectF(rect), f, f1 - f);
            path.lineTo(k, l);
            path.close();
            if (m1.m)
            {
                m1.a(path, rect, j1);
            }
            h.a(m1);
            h.e(path, j1);
        }

    }

    public boolean a()
    {
        return true;
    }

    public boolean d()
    {
        return true;
    }

    public CoordinateSystem g()
    {
        return CoordinateSystem.b;
    }
}
