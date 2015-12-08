// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxis, ChartAxisScale

public class b
{

    private final ChartAxis a;
    private boolean b;
    private Drawable c;
    private Drawable d;
    private final Rect e = new Rect();

    b(ChartAxis chartaxis)
    {
        a = chartaxis;
    }

    final void a(float f, float f1, float f2, float f3, boolean flag)
    {
        double d2 = a.a().c();
        double d3 = a.a().e();
        double d1 = (a.a().f() - d2) / d3;
        d2 = (a.a().g() - d2) / d3;
        float f7 = f;
        float f6 = f1;
        float f5 = f2;
        float f4 = f3;
        if (c != null)
        {
            c.setBounds((int)f, (int)f1, (int)f2, (int)f3);
            f7 = f + (float)e.left;
            f6 = f1 + (float)e.top;
            f5 = f2 - (float)e.right;
            f4 = f3 - (float)e.bottom;
        }
        if (flag)
        {
            int i1 = (int)((double)f4 - d1 * (double)(f4 - f6));
            int k1 = (int)((double)f4 - d2 * (double)(f4 - f6));
            int i2 = d.getMinimumHeight();
            int k = k1;
            int i = i1;
            if (i2 > Math.abs(k1 - i1))
            {
                i = ((k1 + i1) - i2) / 2;
                k = i + i2;
            }
            d.setBounds((int)f7, k, (int)f5, i);
            return;
        }
        int j1 = (int)((double)f7 + d1 * (double)(f5 - f7));
        d1 = f7;
        int l1 = (int)(d2 * (double)(f5 - f7) + d1);
        int j2 = d.getMinimumWidth();
        int l = l1;
        int j = j1;
        if (j2 > Math.abs(l1 - j1))
        {
            j = ((l1 + j1) - j2) / 2;
            l = j + j2;
        }
        d.setBounds(j, (int)f6, l, (int)f4);
    }

    final void a(Canvas canvas)
    {
        if (c != null)
        {
            c.draw(canvas);
        }
        d.draw(canvas);
    }

    public void a(Drawable drawable)
    {
        if (d != drawable)
        {
            d = drawable;
            a.e(1);
        }
    }

    public void a(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            if (b && d == null)
            {
                ShapeDrawable shapedrawable = new ShapeDrawable();
                shapedrawable.setShape(new RoundRectShape(new float[] {
                    2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F
                }, null, null));
                shapedrawable.setIntrinsicWidth(5);
                shapedrawable.setIntrinsicHeight(5);
                shapedrawable.getPaint().setColor(-1);
                d = shapedrawable;
            }
            a.e(1);
        }
    }

    public boolean a()
    {
        return b;
    }

    final float b(boolean flag)
    {
        if (flag)
        {
            return (float)(d.getIntrinsicWidth() + e.right + e.left);
        } else
        {
            return (float)(d.getIntrinsicHeight() + e.top + e.bottom);
        }
    }

    public Drawable b()
    {
        return d;
    }

    public void b(Drawable drawable)
    {
        if (c != drawable)
        {
            c = drawable;
            if (c != null)
            {
                c.getPadding(e);
            } else
            {
                e.setEmpty();
            }
            a.e(1);
        }
    }

    public Drawable c()
    {
        return c;
    }
}
