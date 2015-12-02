// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

static class c
{

    private final RectF a = new RectF();
    private final Paint b = new Paint();
    private final Paint c = new Paint();
    private final android.graphics.drawable.d d;
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

    private void a(Canvas canvas, float f1, float f2, Rect rect)
    {
        if (o)
        {
            float f3;
            float f4;
            float f5;
            float f6;
            if (p == null)
            {
                p = new Path();
                p.setFillType(android.graphics.awable.a.p);
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
    }

    private int n()
    {
        return (k + 1) % j.length;
    }

    private void o()
    {
        d.eDrawable(null);
    }

    public int a()
    {
        return j[n()];
    }

    public void a(double d1)
    {
        r = d1;
    }

    public void a(float f1)
    {
        h = f1;
        b.setStrokeWidth(f1);
        o();
    }

    public void a(float f1, float f2)
    {
        s = (int)f1;
        t = (int)f2;
    }

    public void a(int i1)
    {
        w = i1;
    }

    public void a(int i1, int j1)
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

    public void a(Canvas canvas, Rect rect)
    {
        RectF rectf = a;
        rectf.set(rect);
        rectf.inset(i, i);
        float f1 = (e + g) * 360F;
        float f2 = (f + g) * 360F - f1;
        b.setColor(x);
        canvas.drawArc(rectf, f1, f2, false, b);
        a(canvas, f1, f2, rect);
        if (u < 255)
        {
            v.setColor(w);
            v.setAlpha(255 - u);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, v);
        }
    }

    public void a(ColorFilter colorfilter)
    {
        b.setColorFilter(colorfilter);
        o();
    }

    public void a(boolean flag)
    {
        if (o != flag)
        {
            o = flag;
            o();
        }
    }

    public void a(int ai[])
    {
        j = ai;
        c(0);
    }

    public void b()
    {
        c(n());
    }

    public void b(float f1)
    {
        e = f1;
        o();
    }

    public void b(int i1)
    {
        x = i1;
    }

    public int c()
    {
        return u;
    }

    public void c(float f1)
    {
        f = f1;
        o();
    }

    public void c(int i1)
    {
        k = i1;
        x = j[k];
    }

    public float d()
    {
        return h;
    }

    public void d(float f1)
    {
        g = f1;
        o();
    }

    public void d(int i1)
    {
        u = i1;
    }

    public float e()
    {
        return e;
    }

    public void e(float f1)
    {
        if (f1 != q)
        {
            q = f1;
            o();
        }
    }

    public float f()
    {
        return l;
    }

    public float g()
    {
        return m;
    }

    public int h()
    {
        return j[k];
    }

    public float i()
    {
        return f;
    }

    public double j()
    {
        return r;
    }

    public float k()
    {
        return n;
    }

    public void l()
    {
        l = e;
        m = f;
        n = g;
    }

    public void m()
    {
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        b(0.0F);
        c(0.0F);
        d(0.0F);
    }

    public (android.graphics.drawable. )
    {
        e = 0.0F;
        f = 0.0F;
        g = 0.0F;
        h = 5F;
        i = 2.5F;
        d = ;
        b.setStrokeCap(android.graphics.awable.a.b);
        b.setAntiAlias(true);
        b.setStyle(android.graphics.awable.a.b);
        c.setStyle(android.graphics.awable.a.c);
        c.setAntiAlias(true);
    }
}
