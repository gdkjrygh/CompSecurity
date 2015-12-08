// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
    private BitmapShader c;
    private Paint d;
    private int e;
    private boolean f;
    private int g;
    private int h;

    public RoundDrawable(Bitmap bitmap)
    {
        a = 0.0F;
        e = 0;
        b = new RectF();
        g = bitmap.getWidth();
        h = bitmap.getHeight();
        c = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        d = new Paint();
        d.setAntiAlias(true);
        d.setShader(c);
        f = true;
    }

    private int a()
    {
        return Math.min(g, h);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRoundRect(b, a, a, d);
    }

    public int getIntrinsicHeight()
    {
        if (f)
        {
            return a();
        } else
        {
            return h;
        }
    }

    public int getIntrinsicWidth()
    {
        if (f)
        {
            return a();
        } else
        {
            return g;
        }
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        if (f)
        {
            a = (float)rect.width() / 2.0F;
        }
        b.set(e, e, rect.width() - e, rect.height() - e);
    }

    public void setAlpha(int i)
    {
        d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
    }
}
