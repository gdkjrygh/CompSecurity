// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.PointF;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Base.r;
import com.artfulbits.aiCharts.Enums.Alignment;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            e, y

public class l extends q
{

    public static final d h;
    private final y i = new y();

    public l()
    {
    }

    public void a(m m1)
    {
        r r1 = m1.c();
        List list = m1.b.I();
        int i1 = m1.b.G().d;
        int k1 = m1.b.G().e;
        int l1 = list.size() - 1;
        double d = m1.e.a().f();
        double d1 = m1.e.a().g();
        int k = a(list, d, d1, 0, l1);
        l1 = b(list, d, d1, k, l1);
        RectF rectf = new RectF();
        for (; k <= l1; k++)
        {
            j j1 = (j)list.get(k);
            m1.a(j1.a() + r1.a, j1.a(i1), j1.a() + r1.b, j1.a(k1), rectf);
            rectf.sort();
            if (m1.m)
            {
                m1.a(rectf, j1);
            }
            if (m1.a(rectf.left, rectf.top, rectf.right, rectf.bottom))
            {
                i.a(m1);
                i.a(rectf, j1);
                i.a();
            }
        }

    }

    protected void a(m m1, j j1, int k, PointF pointf)
    {
        double d;
        double d2;
        int i1;
        k = m1.b.G().d;
        i1 = m1.b.G().e;
        d2 = j1.a();
        d = 0.0D;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Alignment.values().length];
                try
                {
                    a[Alignment.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Alignment.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Alignment.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((Alignment)j1.a(h)).ordinal()];
        JVM INSTR tableswitch 1 3: default 76
    //                   1 110
    //                   2 120
    //                   3 141;
           goto _L1 _L2 _L3 _L4
_L1:
        double d1 = d2;
        if (a())
        {
            d1 = d2 + m1.c().a();
        }
        m1.a(d1, d, pointf);
        return;
_L2:
        d = j1.a(k);
        continue; /* Loop/switch isn't completed */
_L3:
        d = 0.5D * (j1.a(k) + j1.a(i1));
        continue; /* Loop/switch isn't completed */
_L4:
        d = j1.a(i1);
        if (true) goto _L1; else goto _L5
_L5:
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

    static 
    {
        h = e.h;
    }
}
