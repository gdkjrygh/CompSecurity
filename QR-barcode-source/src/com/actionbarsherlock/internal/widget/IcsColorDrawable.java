// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class IcsColorDrawable extends Drawable
{

    private int color;
    private final Paint paint;

    public IcsColorDrawable(int i)
    {
        paint = new Paint();
        color = i;
    }

    public IcsColorDrawable(ColorDrawable colordrawable)
    {
        paint = new Paint();
        Bitmap bitmap = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        colordrawable.draw(new Canvas(bitmap));
        color = bitmap.getPixel(0, 0);
        bitmap.recycle();
    }

    public void draw(Canvas canvas)
    {
        if (color >>> 24 != 0)
        {
            paint.setColor(color);
            canvas.drawRect(getBounds(), paint);
        }
    }

    public int getOpacity()
    {
        return color >>> 24;
    }

    public void setAlpha(int i)
    {
        if (i != color >>> 24)
        {
            color = color & 0xffffff | i << 24;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
