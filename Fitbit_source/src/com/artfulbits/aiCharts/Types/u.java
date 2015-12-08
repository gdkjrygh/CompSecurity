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

public class u extends q
{

    public static final d h;
    public static final d i;
    private final y j = new y();

    public u()
    {
    }

    public void a(m m1)
    {
        Object obj = m1.b;
        r r1 = m1.c();
        int l = ((ChartSeries) (obj)).G().b;
        obj = m1.b.I();
        int i1 = ((List) (obj)).size() - 1;
        double d1 = m1.e.a().f();
        double d3 = m1.e.a().g();
        int k = a(((List) (obj)), d1, d3, 0, i1);
        i1 = b(((List) (obj)), d1, d3, k, i1);
        RectF rectf = new RectF();
        j.a(m1);
        for (; k <= i1; k++)
        {
            j j1 = (j)((List) (obj)).get(k);
            double d2 = j1.a();
            double d4 = m1.a(j1, l, false);
            double d5 = m1.a(j1, l, true);
            m1.a(r1.a + d2, d4, d2 + r1.b, d5, rectf);
            if (m1.m)
            {
                m1.a(rectf, j1);
            }
            j.a(rectf, j1);
        }

        j.a();
    }

    protected void a(m m1, j j1, int k, PointF pointf)
    {
        double d1;
        double d3;
        d3 = j1.a();
        d1 = 0.0D;
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

        _cls1.a[((Alignment)j1.a(i)).ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 86
    //                   2 98
    //                   3 122;
           goto _L1 _L2 _L3 _L4
_L1:
        double d2 = d3;
        if (a())
        {
            d2 = d3 + m1.c().a();
        }
        m1.a(d2, d1, pointf);
        return;
_L2:
        d1 = m1.a(j1, k, true);
        continue; /* Loop/switch isn't completed */
_L3:
        d1 = (m1.a(j1, k, true) + m1.a(j1, k, false)) * 0.5D;
        continue; /* Loop/switch isn't completed */
_L4:
        d1 = m1.a(j1, k, false);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return true;
    }

    public boolean d()
    {
        return true;
    }

    static 
    {
        h = a;
        i = e.h;
    }
}
