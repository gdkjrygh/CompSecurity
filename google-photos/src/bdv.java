// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class bdv extends Drawable
{

    public int a;
    public int b;
    private final TimeInterpolator c;
    private final TimeInterpolator d;
    private final Paint e = new Paint();
    private final int f;
    private long g;
    private long h;
    private boolean i;

    public bdv(int j, TimeInterpolator timeinterpolator, TimeInterpolator timeinterpolator1)
    {
        c = timeinterpolator;
        d = timeinterpolator1;
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setColor(0xffffff & j);
        f = j >> 24 & 0xff;
    }

    public final void a(long l, boolean flag)
    {
        i = false;
        g = System.currentTimeMillis();
        h = g + l;
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        float f2 = (float)(System.currentTimeMillis() - g) / (float)(h - g);
        float f1;
        float f3;
        TimeInterpolator timeinterpolator;
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        timeinterpolator = c;
        if (i)
        {
            f2 = 1.0F - f1;
        } else
        {
            f2 = f1;
        }
        f3 = timeinterpolator.getInterpolation(f2);
        timeinterpolator = d;
        if (i)
        {
            f2 = 1.0F - f1;
        } else
        {
            f2 = f1;
        }
        f2 = timeinterpolator.getInterpolation(f2);
        e.setAlpha((int)(f2 * (float)f));
        canvas.drawCircle(a / 2, b / 2, (f3 * (float)b) / 2.0F, e);
        if (f1 > 0.0F && f1 < 1.0F)
        {
            invalidateSelf();
        }
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int j)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
