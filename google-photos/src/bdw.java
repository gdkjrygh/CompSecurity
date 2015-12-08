// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class bdw extends Drawable
{

    public int a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    private final TimeInterpolator f;
    private final Paint g = new Paint();

    public bdw(int i, TimeInterpolator timeinterpolator)
    {
        f = timeinterpolator;
        g.setStyle(android.graphics.Paint.Style.FILL);
        g.setColor(i);
    }

    public final void draw(Canvas canvas)
    {
        float f2 = (float)(System.currentTimeMillis() - c) / (float)(d - c);
        float f1;
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
        timeinterpolator = f;
        if (!e)
        {
            f1 = 1.0F - f1;
        }
        f2 = timeinterpolator.getInterpolation(f1);
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
        f2 = (float)Math.sqrt((a * a) / 4 + b * b);
        canvas.drawCircle(a / 2, b, f2 * f1, g);
        if (f1 > 0.0F && f1 < 1.0F)
        {
            invalidateSelf();
        }
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
