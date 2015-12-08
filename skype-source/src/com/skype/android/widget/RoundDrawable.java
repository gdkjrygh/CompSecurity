// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class RoundDrawable extends Drawable
{

    private float a;
    private RectF b;
    private Paint c;
    private int d;
    private boolean e;
    private int f;
    private int g;

    private int a()
    {
        return Math.min(f, g);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRoundRect(b, a, a, c);
    }

    public int getIntrinsicHeight()
    {
        if (e)
        {
            return a();
        } else
        {
            return g;
        }
    }

    public int getIntrinsicWidth()
    {
        if (e)
        {
            return a();
        } else
        {
            return f;
        }
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        if (e)
        {
            a = (float)rect.width() / 2.0F;
        }
        b.set(d, d, rect.width() - d, rect.height() - d);
    }

    public void setAlpha(int i)
    {
        c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        c.setColorFilter(colorfilter);
    }
}
