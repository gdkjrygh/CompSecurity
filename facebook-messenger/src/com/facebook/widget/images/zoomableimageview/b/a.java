// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class a extends Drawable
{

    protected Bitmap a;
    protected Paint b;

    public a(Bitmap bitmap)
    {
        a = bitmap;
        b = new Paint();
        b.setDither(true);
        b.setFilterBitmap(true);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(a, 0.0F, 0.0F, b);
    }

    public int getIntrinsicHeight()
    {
        return a.getHeight();
    }

    public int getIntrinsicWidth()
    {
        return a.getWidth();
    }

    public int getMinimumHeight()
    {
        return a.getHeight();
    }

    public int getMinimumWidth()
    {
        return a.getWidth();
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
        b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        b.setColorFilter(colorfilter);
    }
}
