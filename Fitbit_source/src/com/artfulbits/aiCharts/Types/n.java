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
import com.artfulbits.aiCharts.Enums.ChartBorderStyle;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            o, a, y

public class n extends o
{

    public static final d h;

    public n()
    {
    }

    public void a(m m1)
    {
        ChartSeries chartseries = m1.b;
        List list = chartseries.I();
        if (list.size() > 0)
        {
            int i = list.size() - 1;
            int k1 = chartseries.G().b;
            double d = m1.e.a().f();
            double d1 = m1.e.a().g();
            float af[];
            PointF pointf;
            boolean flag;
            int k;
            int i1;
            int l1;
            if (chartseries.a(h) == ChartBorderStyle.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = a(list, d, d1, 0, i);
            i = b(list, d, d1, k, i);
            i1 = Math.max(k - 1, 0);
            l1 = Math.min(i + 1, list.size() - 1);
            pointf = new PointF();
            af = new float[((l1 - i1) + 1) * 2];
            i = i1;
            int i2;
            for (int l = 0; i <= l1; l = i2 + 1)
            {
                j j1 = (j)list.get(i);
                m1.a(j1.a(), j1.a(k1), pointf);
                i2 = l + 1;
                af[l] = pointf.x;
                af[i2] = pointf.y;
                i++;
            }

            j.rewind();
            a(af, ((Float)m1.b.a(l)).floatValue(), j);
            Path path;
            if (flag)
            {
                path = new Path(j);
            } else
            {
                path = null;
            }
            m1.a(((j)list.get(l1)).a(), m1.f.t(), pointf);
            j.lineTo(pointf.x, pointf.y);
            m1.a(((j)list.get(i1)).a(), m1.f.t(), pointf);
            j.lineTo(pointf.x, pointf.y);
            j.close();
            this.i.a(m1);
            if (path == null)
            {
                this.i.e(j, chartseries);
            } else
            {
                this.i.c(j, chartseries);
                this.i.b(path, chartseries);
            }
            this.i.a();
        }
    }

    static 
    {
        h = a.h;
    }
}
