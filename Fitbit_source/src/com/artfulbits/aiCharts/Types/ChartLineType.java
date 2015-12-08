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
//            y

public class ChartLineType extends q
{
    public static final class BreakMode extends Enum
    {

        public static final BreakMode a;
        public static final BreakMode b;
        public static final BreakMode c;
        private static final BreakMode d[];

        public static BreakMode valueOf(String s)
        {
            return (BreakMode)Enum.valueOf(com/artfulbits/aiCharts/Types/ChartLineType$BreakMode, s);
        }

        public static BreakMode[] values()
        {
            return (BreakMode[])d.clone();
        }

        static 
        {
            a = new BreakMode("None", 0);
            b = new BreakMode("Auto", 1);
            c = new BreakMode("Manual", 2);
            d = (new BreakMode[] {
                a, b, c
            });
        }

        private BreakMode(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static final d h;
    public static final d i = d.a("line-break_delta", com/artfulbits/aiCharts/Types/ChartLineType, java/lang/Double, Double.valueOf((1.0D / 0.0D)));
    public static final d j = d.a("line-break_point", com/artfulbits/aiCharts/Types/ChartLineType, java/lang/Boolean, Boolean.valueOf(false));
    public static final d k = d.a("points-hit_radius", com/artfulbits/aiCharts/Types/ChartLineType, java/lang/Integer, Integer.valueOf(15));
    public static final d l = d.a("line-sorted_points", com/artfulbits/aiCharts/Types/ChartLineType, java/lang/Boolean, Boolean.valueOf(true));
    private final y m = new y();

    public ChartLineType()
    {
    }

    protected void a(Canvas canvas, Rect rect, k k1)
    {
        a(canvas, rect, k1, e, false);
    }

    public void a(m m1)
    {
        Object obj1 = m1.b;
        int j2 = ((ChartSeries) (obj1)).G().b;
        boolean flag1 = ((Boolean)((ChartSeries) (obj1)).a(l)).booleanValue();
        double d1;
        Object obj;
        BreakMode breakmode;
        Path path;
        int i1;
        boolean flag;
        int k1;
        int k2;
        if (flag1)
        {
            obj = ((ChartSeries) (obj1)).I();
        } else
        {
            obj = ((ChartSeries) (obj1)).F();
        }
        breakmode = (BreakMode)((ChartSeries) (obj1)).a(h);
        if (breakmode != BreakMode.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (breakmode == BreakMode.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1 = ((Double)((ChartSeries) (obj1)).a(i)).doubleValue();
        k2 = ((Integer)((ChartSeries) (obj1)).a(k)).intValue();
        path = new Path();
        if (flag)
        {
            double d2;
            double d3;
            j j1;
            PointF pointf;
            PointF pointf1;
            int l1;
            int i2;
            if (!Double.isInfinite(d1))
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
        m.a(m1);
        if (((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        i1 = 0;
        l1 = ((List) (obj)).size() - 1;
        if (flag1)
        {
            d2 = m1.e.a().f();
            d3 = m1.e.a().g();
            i1 = a(((List) (obj)), d2, d3, 0, l1);
            l1 = b(((List) (obj)), d2, d3, i1, l1);
        }
        pointf = new PointF();
        pointf1 = new PointF();
        obj1 = null;
        i2 = i1;
_L4:
        while (i2 <= l1) 
        {
            j1 = (j)((List) (obj)).get(i2);
            m1.a(j1.a(), j1.a(j2), pointf1);
            if (obj1 != null)
            {
                if (k1 != 0)
                {
                    if (flag)
                    {
                        if (j1.a() - ((j) (obj1)).a() <= d1)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                    } else
                    if (!((Boolean)((j) (obj1)).a(j)).booleanValue())
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
                    m.a(pointf, pointf1, ((k) (obj1)));
                }
            }
            if (m1.m)
            {
                path.reset();
                path.addCircle(pointf1.x, pointf1.y, k2, android.graphics.Path.Direction.CW);
                path.close();
                m1.a(path, m1.g, j1);
            }
            pointf.set(pointf1);
            obj1 = j1;
            i2++;
        }
_L2:
        m.a();
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        h = d.a("line-break_mode", com/artfulbits/aiCharts/Types/ChartLineType, com/artfulbits/aiCharts/Types/ChartLineType$BreakMode, BreakMode.a);
    }
}
