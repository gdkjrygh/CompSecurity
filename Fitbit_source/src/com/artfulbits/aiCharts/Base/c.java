// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            aa, y, ChartAxis, ChartAxisScale

public final class c
{

    private static final Drawable a;
    private double b;
    private double c;
    private double d;
    private double e;
    private Drawable f;
    private final aa g;

    public c()
    {
        b = (0.0D / 0.0D);
        c = (0.0D / 0.0D);
        d = (1.0D / 0.0D);
        e = 0.0D;
        f = a;
        g = new aa();
        g.c = new Paint();
        g.e = com.artfulbits.aiCharts.Base.a._cls1.a(Alignment.b, Alignment.b);
    }

    public c(double d1, double d2)
    {
        this();
        d = d1;
        e = d2;
    }

    public final double a()
    {
        return b;
    }

    public final void a(double d1)
    {
        b = d1;
    }

    public final void a(float f1)
    {
        g.d = new y(f1);
    }

    public final void a(int l)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable();
        shapedrawable.getPaint().setColor(l);
        f = shapedrawable;
    }

    protected final void a(Canvas canvas, Rect rect, ChartAxis chartaxis)
    {
        Rect rect1 = new Rect();
        ChartAxisScale chartaxisscale = chartaxis.a();
        boolean flag1 = chartaxis.d().IsVertical;
        double d1;
        double d2;
        double d3;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        if (!TextUtils.isEmpty(g.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Double.isNaN(b))
        {
            d1 = chartaxisscale.f();
        } else
        {
            d1 = b;
        }
        if (Double.isNaN(c))
        {
            d2 = chartaxisscale.g();
        } else
        {
            d2 = c;
        }
        if (Double.isInfinite(d))
        {
            d3 = d2 - d1;
        } else
        {
            d3 = d;
        }
        if (flag)
        {
            g.a(null);
        }
        if (f != null)
        {
            f.getPadding(rect1);
        }
        l = rect.left;
        i1 = rect.top;
        j1 = rect.right;
        k1 = rect.bottom;
        do
        {
            if (d1 < d2)
            {
                double d4 = chartaxisscale.h(d1);
                double d5 = chartaxisscale.h(d1 + d3);
                if (flag1)
                {
                    if (chartaxis.y())
                    {
                        double d6 = rect.top;
                        k1 = (int)(d4 * (double)rect.height() + d6);
                        int l1 = (int)((double)rect.top + d5 * (double)rect.height());
                        i1 = j1;
                        j1 = k1;
                        k1 = l;
                        l = l1;
                    } else
                    {
                        i1 = (int)((double)rect.bottom - d4 * (double)rect.height());
                        k1 = (int)((double)rect.bottom - d5 * (double)rect.height());
                        int j2 = l;
                        l = i1;
                        i1 = j1;
                        j1 = k1;
                        k1 = j2;
                    }
                } else
                if (chartaxis.y())
                {
                    j1 = (int)((double)rect.right - d4 * (double)rect.width());
                    int k2 = (int)((double)rect.right - d5 * (double)rect.width());
                    l = k1;
                    k1 = i1;
                    i1 = j1;
                    j1 = k1;
                    k1 = k2;
                } else
                {
                    double d7 = rect.left;
                    int l2 = (int)(d4 * (double)rect.width() + d7);
                    j1 = (int)((double)rect.left + d5 * (double)rect.width());
                    l = k1;
                    k1 = i1;
                    i1 = j1;
                    j1 = k1;
                    k1 = l2;
                }
                if (f != null)
                {
                    f.setBounds(k1, j1, i1, l);
                    f.draw(canvas);
                }
                if (flag)
                {
                    g.a(rect1.left + k1, rect1.top + j1, i1 - rect1.right, l - rect1.bottom, null);
                    g.a(canvas, null);
                }
                if (e != 0.0D)
                {
                    d1 = e + d1;
                    int i2 = j1;
                    int i3 = k1;
                    k1 = l;
                    j1 = i1;
                    i1 = i2;
                    l = i3;
                    continue;
                }
            }
            return;
        } while (true);
    }

    public final void a(Drawable drawable)
    {
        if (drawable == null)
        {
            f = a;
            return;
        } else
        {
            f = drawable;
            return;
        }
    }

    public final void a(Alignment alignment)
    {
        g.e = g.e & 0xf | alignment.ordinal() << 4;
    }

    public final void a(Alignment alignment, Alignment alignment1)
    {
        g.e = com.artfulbits.aiCharts.Base.a._cls1.a(alignment, alignment1);
    }

    public final void a(String s)
    {
        g.a = s;
    }

    public final double b()
    {
        return c;
    }

    public final void b(double d1)
    {
        c = d1;
    }

    public final void b(Alignment alignment)
    {
        g.e = g.e & 0xf0 | alignment.ordinal();
    }

    public final double c()
    {
        return d;
    }

    public final void c(double d1)
    {
        d = d1;
    }

    public final double d()
    {
        return e;
    }

    public final void d(double d1)
    {
        e = d1;
    }

    public final int e()
    {
        return Color.argb(100, 255, 255, 255);
    }

    public final Drawable f()
    {
        if (f == a)
        {
            return null;
        } else
        {
            return f;
        }
    }

    public final String g()
    {
        return g.a;
    }

    public final Paint h()
    {
        return g.c;
    }

    public final Alignment i()
    {
        return com.artfulbits.aiCharts.Base.a._cls1.c(g.e);
    }

    public final Alignment j()
    {
        return com.artfulbits.aiCharts.Base.a._cls1.b(g.e);
    }

    public final float k()
    {
        if (g.d == null)
        {
            return 0.0F;
        } else
        {
            return g.d.d;
        }
    }

    static 
    {
        ShapeDrawable shapedrawable = new ShapeDrawable();
        shapedrawable.getPaint().setColor(Color.argb(100, 255, 255, 255));
        a = shapedrawable;
    }
}
