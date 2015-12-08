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
//            y

public class e extends q
{

    public static final d h;
    public static final d i = com.artfulbits.aiCharts.Base.d.a("column-fixed_width", com/artfulbits/aiCharts/Types/e, java/lang/Float, Float.valueOf(0.0F));
    private final y j = new y();

    public e()
    {
    }

    public void a(m m1)
    {
        r r1 = m1.c();
        int l = m1.b.G().b;
        List list = m1.b.I();
        int i1 = list.size() - 1;
        double d1 = m1.f.t();
        double d2 = m1.e.a().f();
        double d3 = m1.e.a().g();
        float f = ((Float)m1.b.a(i)).floatValue() / 2.0F;
        int k = a(list, d2, d3, 0, i1);
        i1 = b(list, d2, d3, k, i1);
        RectF rectf = g;
        j.a(m1);
        while (k <= i1) 
        {
            j j1 = (j)list.get(k);
            if (f == 0.0F)
            {
                m1.a(j1.a() + r1.a, j1.a(l), j1.a() + r1.b, d1, rectf);
            } else
            {
                m1.a(j1.a(), j1.a(l), j1.a(), d1, rectf);
                if (m1.h)
                {
                    rectf.inset(0.0F, -f);
                } else
                {
                    rectf.inset(-f, 0.0F);
                }
            }
            if (m1.m)
            {
                m1.a(rectf, j1);
            }
            if (m1.a(rectf.left, rectf.top, rectf.right, rectf.bottom))
            {
                j.a(rectf, j1);
            }
            k++;
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

        _cls1.a[((Alignment)j1.a(h)).ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 86
    //                   2 96
    //                   3 118;
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
        d1 = j1.a(k);
        continue; /* Loop/switch isn't completed */
_L3:
        d1 = (m1.f.t() + j1.a(k)) * 0.5D;
        continue; /* Loop/switch isn't completed */
_L4:
        d1 = m1.f.t();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean a()
    {
        return true;
    }

    public boolean d()
    {
        return true;
    }

    static 
    {
        h = com.artfulbits.aiCharts.Base.d.a("column-label_align", com/artfulbits/aiCharts/Types/e, com/artfulbits/aiCharts/Enums/Alignment, Alignment.a);
    }
}
