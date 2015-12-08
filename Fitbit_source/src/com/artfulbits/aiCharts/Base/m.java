// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartSeries, q, e, p, 
//            j, a, l, ChartAxis, 
//            r

public final class m
{

    public final Canvas a;
    public final ChartSeries b;
    public final ChartAxis c;
    public final ChartAxis d;
    public final ChartAxis e;
    public final ChartAxis f;
    public final Rect g;
    public final boolean h;
    public final CoordinateSystem i;
    public final q j;
    public final a k;
    public final e l;
    public final boolean m;
    private r n;
    private final p o;
    private final PointF p = new PointF();

    private m(Canvas canvas, ChartSeries chartseries, Rect rect)
    {
        n = null;
        a = canvas;
        b = chartseries;
        j = chartseries.H();
        h = j.e();
        i = j.g();
        c = chartseries.b();
        d = chartseries.C();
        k = chartseries.O();
        l = chartseries.l();
        g = rect;
        boolean flag;
        if (l != null && l.h() && b.J())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (i != CoordinateSystem.c && (c == null || d == null))
        {
            throw new IllegalArgumentException("Current type requires axes");
        }
        if (h)
        {
            e = d;
            f = c;
        } else
        {
            e = c;
            f = d;
        }
        o = com.artfulbits.aiCharts.Base.p.b(i, g, c, d);
    }

    public static double a(a a1, ChartSeries chartseries, j j1, int i1, boolean flag)
    {
        double d4 = j1.a();
        double d3 = 0.0D;
        double d1;
        double d2;
        boolean flag1;
        if (flag)
        {
            d1 = 0.0D + j1.a(i1);
        } else
        {
            d1 = 0.0D;
        }
        if (!chartseries.H().c())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j1 = (String)chartseries.a(q.a);
        a1 = a1.f.iterator();
label0:
        do
        {
label1:
            {
                d2 = d1;
                if (!a1.hasNext())
                {
                    break label0;
                }
                Object obj = (ChartSeries)a1.next();
                d2 = d1;
                if (chartseries == obj)
                {
                    d1 += d3;
                    d2 = d1;
                    if (flag1)
                    {
                        break label0;
                    }
                    d2 = d1;
                }
                if (chartseries == obj && flag1)
                {
                    break label1;
                }
                Object obj1 = (String)((ChartSeries) (obj)).a(q.a);
                if (!((ChartSeries) (obj)).H().b() || !((String) (obj1)).equals(j1))
                {
                    break label1;
                }
                obj = ((ChartSeries) (obj)).F().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label1;
                    }
                    obj1 = (j)((Iterator) (obj)).next();
                } while (((j) (obj1)).b != d4);
                d3 = ((j) (obj1)).a(i1) + d3;
                d1 = d2;
                continue;
            }
            d1 = d2;
        } while (true);
        if (flag1)
        {
            return chartseries.E().t() + d2;
        } else
        {
            return (100D * d2) / d3;
        }
    }

    public static m a(Canvas canvas, ChartSeries chartseries, Rect rect)
    {
        return new m(canvas, chartseries, rect);
    }

    public static r a(ChartSeries chartseries, q q1, a a1)
    {
        float f1 = ((Float)chartseries.a(q.b)).floatValue();
        float f2 = ((Float)chartseries.a(q.d)).floatValue();
        double d2 = -f1 / 2.0F;
        double d1 = f1 / 2.0F;
        if (q1.a())
        {
            q1 = a1.n();
            int i1 = q1.size();
            if (i1 > 1)
            {
                int j1 = q1.indexOf(new a.a(chartseries));
                double d5 = f2 / (float)(i1 - 1);
                double d3 = (d1 - d2 - (double)f2) / (double)i1;
                d1 = d2 + (double)j1 * (d3 + d5);
                d2 = d1;
                d1 = d3 + d1;
            }
        }
        double d6 = a1.m();
        double d4 = d6;
        if (d6 == 1.7976931348623157E+308D)
        {
            d4 = ((Float)chartseries.a(q.c)).floatValue();
        }
        return new r(d2 * d4, d4 * d1);
    }

    public final double a(j j1, int i1, boolean flag)
    {
        return a(k, b, j1, i1, flag);
    }

    public final PointF a(double d1, double d2)
    {
        PointF pointf = new PointF();
        if (h)
        {
            o.a(d2, d1, pointf);
            return pointf;
        } else
        {
            o.a(d1, d2, pointf);
            return pointf;
        }
    }

    public final RectF a(double d1, double d2, double d3, double d4)
    {
        RectF rectf = new RectF();
        a(d1, d2, d3, d4, rectf);
        return rectf;
    }

    protected final void a()
    {
        j.a(this);
    }

    public final void a(double d1, double d2, double d3, double d4, RectF rectf)
    {
        a(d1, d2, p);
        rectf.left = p.x;
        rectf.top = p.y;
        a(d3, d4, p);
        rectf.right = p.x;
        rectf.bottom = p.y;
        rectf.sort();
    }

    public final void a(double d1, double d2, PointF pointf)
    {
        if (h)
        {
            o.a(d2, d1, pointf);
            return;
        } else
        {
            o.a(d1, d2, pointf);
            return;
        }
    }

    public final void a(Path path, Rect rect, Object obj)
    {
        rect = new Region(rect);
        rect.setPath(path, rect);
        k.g.put(rect, obj);
    }

    public final void a(Rect rect, Object obj)
    {
        k.g.put(new Region(rect), obj);
    }

    public final void a(RectF rectf, Object obj)
    {
        Rect rect = new Rect();
        rectf.round(rect);
        k.g.put(new Region(rect), obj);
    }

    public final boolean a(float f1, float f2)
    {
        return g.contains((int)f1, (int)f2);
    }

    public final boolean a(float f1, float f2, float f3, float f4)
    {
        return (Math.min(f1, f3) < (float)g.right || Math.max(f1, f3) > (float)g.left) && (Math.min(f2, f4) < (float)g.bottom || Math.max(f2, f4) > (float)g.top);
    }

    protected final void b()
    {
        j.b(this);
    }

    public final r c()
    {
        if (n == null)
        {
            n = a(b, j, k);
        }
        return n;
    }

    final void d()
    {
        com.artfulbits.aiCharts.Base.p.a(o);
    }
}
