// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Base.r;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class ChartHiLoOpenCloseType extends q
{
    public static final class Style extends Enum
    {

        public static final Style a;
        public static final Style b;
        public static final Style c;
        public static final Style d;
        private static final Style e[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/artfulbits/aiCharts/Types/ChartHiLoOpenCloseType$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])e.clone();
        }

        static 
        {
            a = new Style("None", 0);
            b = new Style("OpenOnly", 1);
            c = new Style("CloseOnly", 2);
            d = new Style("All", 3);
            e = (new Style[] {
                a, b, c, d
            });
        }

        private Style(String s, int k)
        {
            super(s, k);
        }
    }


    public static final d h;
    private final y i = new y();

    public ChartHiLoOpenCloseType()
    {
    }

    public void a(m m1)
    {
        Object obj = m1.b;
        r r1 = m1.c();
        double d1 = r1.a();
        List list = ((ChartSeries) (obj)).I();
        Object obj1 = (Style)((ChartSeries) (obj)).a(h);
        double d2;
        double d3;
        PointF pointf;
        PointF pointf1;
        PointF pointf2;
        PointF pointf3;
        boolean flag;
        boolean flag1;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int i2;
        if (obj1 == com.artfulbits.aiCharts.Types.Style.d || obj1 == Style.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj1 == com.artfulbits.aiCharts.Types.Style.d || obj1 == Style.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = ((ChartSeries) (obj)).G().e;
        i1 = ((ChartSeries) (obj)).G().d;
        k1 = ((ChartSeries) (obj)).G().g;
        l1 = ((ChartSeries) (obj)).G().f;
        i2 = list.size() - 1;
        d2 = m1.e.a().f();
        d3 = m1.e.a().g();
        k = a(list, d2, d3, 0, i2);
        i2 = b(list, d2, d3, k, i2);
        obj = new PointF();
        obj1 = new PointF();
        pointf = new PointF();
        pointf1 = new PointF();
        pointf2 = new PointF();
        pointf3 = new PointF();
        i.a(m1);
        for (; k <= i2; k++)
        {
            j j1 = (j)list.get(k);
            m1.a(j1.a() + d1, j1.a(i1), ((PointF) (obj)));
            m1.a(j1.a() + d1, j1.a(l), ((PointF) (obj1)));
            i.a(((PointF) (obj)), ((PointF) (obj1)), j1);
            if (flag)
            {
                m1.a(j1.a() + r1.a, j1.a(l1), pointf2);
                m1.a(j1.a() + d1, j1.a(l1), pointf3);
                i.a(pointf2, pointf3, j1);
            }
            if (flag1)
            {
                m1.a(j1.a() + r1.b, j1.a(k1), pointf);
                m1.a(j1.a() + d1, j1.a(k1), pointf1);
                i.a(pointf, pointf1, j1);
            }
        }

        i.a();
    }

    public boolean a()
    {
        return true;
    }

    public r b(ChartSeries chartseries)
    {
        ChartPointDeclaration chartpointdeclaration = chartseries.G();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Style.values().length];
                try
                {
                    a[Style.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Style.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Style.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.artfulbits.aiCharts.Types.Style.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((Style)chartseries.a(h)).ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 61
    //                   2 82
    //                   3 110
    //                   4 138;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int ai[] = null;
_L7:
        return a(this, chartseries, ai);
_L2:
        ai = new int[2];
        ai[0] = chartpointdeclaration.d;
        ai[1] = chartpointdeclaration.e;
        continue; /* Loop/switch isn't completed */
_L3:
        ai = new int[3];
        ai[0] = chartpointdeclaration.d;
        ai[1] = chartpointdeclaration.e;
        ai[2] = chartpointdeclaration.f;
        continue; /* Loop/switch isn't completed */
_L4:
        ai = new int[3];
        ai[0] = chartpointdeclaration.d;
        ai[1] = chartpointdeclaration.e;
        ai[2] = chartpointdeclaration.g;
        continue; /* Loop/switch isn't completed */
_L5:
        ai = new int[4];
        ai[0] = chartpointdeclaration.d;
        ai[1] = chartpointdeclaration.e;
        ai[2] = chartpointdeclaration.f;
        ai[3] = chartpointdeclaration.g;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] h()
    {
        return (new com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage[] {
            com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.c, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.d, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.e, com.artfulbits.aiCharts.Base.ChartPointDeclaration.Usage.f
        });
    }

    static 
    {
        h = d.a("hiloopenclose-style", com/artfulbits/aiCharts/Types/ChartHiLoOpenCloseType, com/artfulbits/aiCharts/Types/ChartHiLoOpenCloseType$Style, com.artfulbits.aiCharts.Types.Style.d);
    }
}
