// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

final class g
{

    private final RectF a = new RectF();
    private final Paint b = new Paint();
    private final Paint c = new Paint();
    private final android.graphics.drawable.Drawable.Callback d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j[];
    private int k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private Path p;
    private float q;
    private double r;
    private int s;
    private int t;
    private int u;
    private final Paint v = new Paint(1);
    private int w;
    private int x;

    public g(android.graphics.drawable.Drawable.Callback callback)
    {
        e = 0.0F;
        f = 0.0F;
        g = 0.0F;
        h = 5F;
        i = 2.5F;
        d = callback;
        b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStyle(android.graphics.Paint.Style.FILL);
        c.setAntiAlias(true);
    }

    private int o()
    {
        return (k + 1) % j.length;
    }

    private void p()
    {
        d.invalidateDrawable(null);
    }

    public final void a()
    {
        w = 0xfffafafa;
    }

    public final void a(double d1)
    {
        r = d1;
    }

    public final void a(float f1)
    {
        h = f1;
        b.setStrokeWidth(f1);
        p();
    }

    public final void a(float f1, float f2)
    {
        s = (int)f1;
        t = (int)f2;
    }

    public final void a(int i1)
    {
        x = i1;
    }

    public final void a(int i1, int j1)
    {
        float f1 = Math.min(i1, j1);
        if (r <= 0.0D || f1 < 0.0F)
        {
            f1 = (float)Math.ceil(h / 2.0F);
        } else
        {
            f1 = (float)((double)(f1 / 2.0F) - r);
        }
        i = f1;
    }

    public final void a(Canvas canvas, Rect rect)
    {
        RectF rectf = a;
        rectf.set(rect);
        rectf.inset(i, i);
        float f1 = (e + g) * 360F;
        float f2 = (f + g) * 360F - f1;
        b.setColor(x);
        canvas.drawArc(rectf, f1, f2, false, b);
        if (o)
        {
            float f3;
            float f4;
            float f5;
            float f6;
            if (p == null)
            {
                p = new Path();
                p.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else
            {
                p.reset();
            }
            f3 = (int)i / 2;
            f4 = q;
            f5 = (float)(r * Math.cos(0.0D) + (double)rect.exactCenterX());
            f6 = (float)(r * Math.sin(0.0D) + (double)rect.exactCenterY());
            p.moveTo(0.0F, 0.0F);
            p.lineTo((float)s * q, 0.0F);
            p.lineTo(((float)s * q) / 2.0F, (float)t * q);
            p.offset(f5 - f3 * f4, f6);
            p.close();
            c.setColor(x);
            canvas.rotate((f1 + f2) - 5F, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawPath(p, c);
        }
        if (u < 255)
        {
            v.setColor(w);
            v.setAlpha(255 - u);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, v);
        }
    }

    public final void a(ColorFilter colorfilter)
    {
        b.setColorFilter(colorfilter);
        p();
    }

    public final void a(boolean flag)
    {
        if (o != flag)
        {
            o = flag;
            p();
        }
    }

    public final void a(int ai[])
    {
        j = ai;
        b(0);
    }

    public final int b()
    {
        return j[o()];
    }

    public final void b(float f1)
    {
        e = f1;
        p();
    }

    public final void b(int i1)
    {
        k = i1;
        x = j[k];
    }

    public final void c()
    {
        b(o());
    }

    public final void c(float f1)
    {
        f = f1;
        p();
    }

    public final void c(int i1)
    {
        u = i1;
    }

    public final int d()
    {
        return u;
    }

    public final void d(float f1)
    {
        g = f1;
        p();
    }

    public final float e()
    {
        return h;
    }

    public final void e(float f1)
    {
        if (f1 != q)
        {
            q = f1;
            p();
        }
    }

    public final float f()
    {
        return e;
    }

    public final float g()
    {
        return l;
    }

    public final float h()
    {
        return m;
    }

    public final int i()
    {
        return j[k];
    }

    public final float j()
    {
        return f;
    }

    public final double k()
    {
        return r;
    }

    public final float l()
    {
        return n;
    }

    public final void m()
    {
        l = e;
        m = f;
        n = g;
    }

    public final void n()
    {
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        b(0.0F);
        c(0.0F);
        d(0.0F);
    }
}
