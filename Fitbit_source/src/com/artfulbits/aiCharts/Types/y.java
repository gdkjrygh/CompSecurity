// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.k;
import com.artfulbits.aiCharts.Base.m;

final class y
{

    public final Paint a = new Paint();
    private final Rect b = new Rect();
    private m c;
    private Canvas d;

    y()
    {
    }

    public final void a()
    {
        c = null;
        d = null;
    }

    public final void a(Path path, k k1)
    {
        int i = k1.g();
        if (i != 0)
        {
            Paint paint = k1.n();
            if (paint != null)
            {
                a.set(paint);
            }
            a.setColor(i);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawPath(path, a);
        }
    }

    public final void a(Path path, k k1, Rect rect)
    {
        Drawable drawable;
        int i;
        int j;
        i = k1.g();
        j = k1.t();
        drawable = k1.i();
        if (drawable == null) goto _L2; else goto _L1
_L1:
        d.save(2);
        d.clipPath(path);
        drawable.setBounds(rect);
        if (k1.A())
        {
            drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        } else
        {
            drawable.clearColorFilter();
        }
        drawable.draw(d);
        d.restore();
_L4:
        if (j != 0)
        {
            rect = k1.n();
            if (rect != null)
            {
                a.set(rect);
            }
            a.setColor(j);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawPath(path, a);
        }
        return;
_L2:
        if (i != 0)
        {
            rect = k1.n();
            if (rect != null)
            {
                a.set(rect);
            }
            a.setColor(i);
            a.setStyle(android.graphics.Paint.Style.FILL);
            d.drawPath(path, a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(PointF pointf, PointF pointf1, k k1)
    {
        int i = k1.g();
        if (i != 0)
        {
            Paint paint = k1.n();
            if (paint != null)
            {
                a.set(paint);
            }
            a.setColor(i);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawLine(pointf.x, pointf.y, pointf1.x, pointf1.y, a);
        }
    }

    public final void a(RectF rectf, k k1)
    {
        Object obj;
        int i;
        int j;
        i = k1.g();
        j = k1.t();
        obj = k1.i();
        if (obj == null) goto _L2; else goto _L1
_L1:
        rectf.roundOut(b);
        ((Drawable) (obj)).setBounds(b);
        if (k1.A())
        {
            ((Drawable) (obj)).setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        } else
        {
            ((Drawable) (obj)).clearColorFilter();
        }
        ((Drawable) (obj)).draw(d);
_L4:
        if (j != 0)
        {
            obj = k1.n();
            if (obj != null)
            {
                a.set(((Paint) (obj)));
            }
            a.setColor(j);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawRect(rectf, a);
        }
        return;
_L2:
        if (i != 0)
        {
            Paint paint = k1.n();
            if (paint != null)
            {
                a.set(paint);
            }
            a.setColor(i);
            a.setStyle(android.graphics.Paint.Style.FILL);
            d.drawRect(rectf, a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(m m1)
    {
        c = m1;
        a.setAntiAlias(m1.l.a());
        a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        d = m1.a;
    }

    public final void b(Path path, k k1)
    {
        int i = k1.t();
        if (i != 0)
        {
            Paint paint = k1.n();
            if (paint != null)
            {
                a.set(paint);
            }
            a.setColor(i);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawPath(path, a);
        }
    }

    public final void b(RectF rectf, k k1)
    {
        int i = k1.t();
        if (i != 0)
        {
            Paint paint = k1.n();
            if (paint != null)
            {
                a.set(paint);
            }
            a.setColor(i);
            a.setStrokeWidth(k1.u());
            a.setStyle(android.graphics.Paint.Style.STROKE);
            d.drawRect(rectf, a);
        }
    }

    public final void c(Path path, k k1)
    {
        Rect rect = c.g;
        d(path, k1);
    }

    public final void d(Path path, k k1)
    {
        int i = k1.g();
        Drawable drawable = k1.i();
        if (drawable != null)
        {
            d.save(2);
            d.clipPath(path);
            drawable.setBounds(c.g);
            if (k1.A())
            {
                drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            } else
            {
                drawable.clearColorFilter();
            }
            drawable.draw(d);
            d.restore();
        } else
        if (i != 0)
        {
            k1 = k1.n();
            if (k1 != null)
            {
                a.set(k1);
            }
            a.setColor(i);
            a.setStyle(android.graphics.Paint.Style.FILL);
            d.drawPath(path, a);
            return;
        }
    }

    public final void e(Path path, k k1)
    {
        a(path, k1, c.g);
    }
}
