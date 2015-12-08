// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public class GifDrawable extends Drawable
    implements Runnable
{

    private Movie a;
    private Paint b;
    private long c;

    public void draw(Canvas canvas)
    {
        long l = SystemClock.uptimeMillis();
        if (c == 0L)
        {
            c = l;
        }
        int i = (int)((l - c) % (long)a.duration());
        a.setTime(i);
        Rect rect = getBounds();
        float f = Math.max(rect.width() / a.width(), rect.height() / a.height());
        canvas.scale(f, f);
        a.draw(canvas, 0.0F, 0.0F, b);
        canvas.translate((float)rect.width() / f - (float)a.width() / 2.0F, (float)rect.height() / f - (float)a.height() / 2.0F);
        canvas.restore();
        scheduleSelf(this, 100L);
    }

    public int getOpacity()
    {
        return -1;
    }

    public void run()
    {
        invalidateSelf();
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
