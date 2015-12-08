// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.FloatMath;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.ChartLineType;
import java.util.List;

public class a extends ChartLineType
{

    private Paint m;
    private Paint n;
    private int o;
    private double p;

    public a(int i)
    {
        m = null;
        n = null;
        o = -1;
        p = 1.7976931348623157E+308D;
        o = i;
    }

    public a(Paint paint, Paint paint1)
    {
        m = null;
        n = null;
        o = -1;
        p = 1.7976931348623157E+308D;
        m = paint;
        n = paint;
    }

    private float a(ChartAxis chartaxis, double d)
    {
        RectF rectf = chartaxis.B();
        d = chartaxis.a().h(d);
        double d1 = rectf.width();
        return (float)((double)rectf.left + d * d1);
    }

    private float b(ChartAxis chartaxis, double d)
    {
        RectF rectf = chartaxis.B();
        d = chartaxis.a().h(d);
        return (float)((double)rectf.bottom - (double)rectf.height() * d);
    }

    public void a(double d)
    {
        p = d;
    }

    public void a(m m1)
    {
        Object obj = m1.b.I();
        if (((List) (obj)).size() > 0)
        {
            if (m == null)
            {
                m = new Paint();
                m.setStrokeWidth(m1.b.u());
                m.setPathEffect(new DashPathEffect(new float[] {
                    10F, 5F
                }, 1.0F));
                m.setColor(m1.b.t());
            }
            if (n == null)
            {
                n = new Paint();
                Paint paint = n;
                float f;
                float f1;
                float f2;
                float f3;
                int i;
                if (o == -1)
                {
                    i = m1.b.g();
                } else
                {
                    i = o;
                }
                paint.setColor(i);
            }
            obj = (j)((List) (obj)).get(((List) (obj)).size() - 1);
            f = FloatMath.floor(a(m1.e, ((j) (obj)).a()));
            f2 = FloatMath.floor(b(m1.f, ((j) (obj)).a(0)));
            f3 = Math.max(m1.k.f().left, f);
            f1 = m1.k.f().right;
            f = f1;
            if (p != 1.7976931348623157E+308D)
            {
                f = Math.min(f1, FloatMath.floor(a(m1.e, p)));
            }
            f1 = m1.k.f().bottom;
            m1.a.drawRect(f3, f2, f, f1, n);
            m1.a.drawLine(f3, f2, f, f2, m);
        }
        super.a(m1);
    }

    protected void a(m m1, j j1, PointF pointf)
    {
        super.a(m1, j1, pointf);
    }

    public double j()
    {
        return p;
    }
}
