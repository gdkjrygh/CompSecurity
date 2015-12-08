// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.FloatMath;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.Stack;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartSeries, a, ChartAxis, ChartAxisScale

public abstract class p
{
    static final class b extends p
    {

        private float a;
        private float b;
        private float c;
        private ChartAxisScale d;
        private ChartAxisScale e;

        public static float a(ChartAxisScale chartaxisscale, double d1)
        {
            return (float)(-1.5707963267948966D + 6.2831853071795862D * chartaxisscale.h(d1));
        }

        public final double a(float f, float f1)
        {
            double d1 = Math.atan2(f - a, f1 - b);
            return d.i(d1);
        }

        public final void a(double d1, double d2, PointF pointf)
        {
            float f = (float)(-1.5707963267948966D + 6.2831853071795862D * d.h(d1));
            float f1 = (float)e.h(d2);
            pointf.x = a + FloatMath.cos(f) * f1 * c;
            float f2 = b;
            pointf.y = FloatMath.sin(f) * f1 * c + f2;
        }

        final void a(Rect rect, ChartAxisScale chartaxisscale, ChartAxisScale chartaxisscale1)
        {
            a = rect.centerX();
            b = rect.centerY();
            c = 0.5F * (float)Math.min(rect.width(), rect.height());
            d = chartaxisscale;
            e = chartaxisscale1;
        }

        public final double b(float f, float f1)
        {
            double d1 = f - a;
            double d2 = f1 - b;
            return Math.sqrt(d1 * d1 + d2 * d2);
        }

        b()
        {
        }
    }


    private static c a = new c();
    private static Stack b = new Stack();
    private static Stack c = new Stack();

    public p()
    {
    }

    public static p a(ChartSeries chartseries)
    {
        a a1 = chartseries.O();
        return a(a1.i(), a1.g(), chartseries.D(), chartseries.E());
    }

    public static p a(a a1)
    {
        return a(a1.i(), a1.g(), a1.d(), a1.e());
    }

    public static p a(CoordinateSystem coordinatesystem, Rect rect, ChartAxis chartaxis, ChartAxis chartaxis1)
    {
    /* anonymous class not found */
    class _anm1 {}

    /* block-local class not found */
    class a {}

    /* block-local class not found */
    class c {}

        switch (_cls1.a[coordinatesystem.ordinal()])
        {
        default:
            return new c();

        case 1: // '\001'
            coordinatesystem = new b();
            coordinatesystem.a(rect, chartaxis.a(), chartaxis1.a());
            return coordinatesystem;

        case 2: // '\002'
            coordinatesystem = new a();
            break;
        }
        coordinatesystem.a(rect, chartaxis.a(), chartaxis1.a());
        return coordinatesystem;
    }

    public static void a(p p1)
    {
        if (p1 instanceof a)
        {
            c.push((a)p1);
        } else
        if (p1 instanceof b)
        {
            b.push((b)p1);
            return;
        }
    }

    public static p b(CoordinateSystem coordinatesystem, Rect rect, ChartAxis chartaxis, ChartAxis chartaxis1)
    {
        switch (_cls1.a[coordinatesystem.ordinal()])
        {
        default:
            return a;

        case 1: // '\001'
            if (b.isEmpty())
            {
                coordinatesystem = new b();
            } else
            {
                coordinatesystem = (b)b.pop();
            }
            coordinatesystem.a(rect, chartaxis.a(), chartaxis1.a());
            return coordinatesystem;

        case 2: // '\002'
            break;
        }
        if (c.isEmpty())
        {
            coordinatesystem = new a();
        } else
        {
            coordinatesystem = (a)c.pop();
        }
        coordinatesystem.a(rect, chartaxis.a(), chartaxis1.a());
        return coordinatesystem;
    }

    public abstract double a(float f, float f1);

    public abstract void a(double d, double d1, PointF pointf);

    public abstract double b(float f, float f1);

}
