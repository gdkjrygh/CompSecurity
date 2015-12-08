// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;

public final class w extends Drawable
{

    final Rect a;
    final RectF b;
    private int c;
    private Paint d;
    private float e;
    private int f;
    private int g;
    private boolean h;

    public w(int i)
    {
        this(i, (byte)0);
    }

    private w(int i, byte byte0)
    {
        c = 119;
        d = new Paint(6);
        a = new Rect();
        b = new RectF();
        h = true;
        d.setColor(i);
        f = -1;
        g = -1;
    }

    public final void a()
    {
        d.setAntiAlias(true);
        invalidateSelf();
    }

    public final void a(float f1)
    {
        e = f1;
    }

    public final void draw(Canvas canvas)
    {
        if (h)
        {
            GravityCompat.apply(c, f, g, getBounds(), a, 0);
            b.set(a);
            h = false;
        }
        canvas.drawRoundRect(b, e, e, d);
    }

    public final int getAlpha()
    {
        return d.getAlpha();
    }

    public final ColorFilter getColorFilter()
    {
        return d.getColorFilter();
    }

    public final int getIntrinsicHeight()
    {
        return g;
    }

    public final int getIntrinsicWidth()
    {
        return f;
    }

    public final int getOpacity()
    {
        while (c != 119 || d.getAlpha() < 255) 
        {
            return -3;
        }
        return -1;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final void setDither(boolean flag)
    {
        d.setDither(flag);
        invalidateSelf();
    }
}
