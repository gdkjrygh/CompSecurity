// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.FloatMath;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            p, ChartAxisScale

static final class tAxisScale extends p
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

    tAxisScale()
    {
    }
}
