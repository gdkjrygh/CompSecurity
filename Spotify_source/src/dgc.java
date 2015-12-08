// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class dgc extends Drawable
    implements Animatable, Runnable
{

    private static final int d[] = {
        50, 100, 150, 200, 250
    };
    private final Paint a;
    private int b;
    private long c;

    public dgc()
    {
        this(-1);
    }

    public dgc(int i)
    {
        a = new Paint();
        a.setAntiAlias(true);
        a.setStyle(android.graphics.Paint.Style.FILL);
        b = i;
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int k = canvas.save();
        canvas.translate(rect.centerX(), rect.centerY());
        float f = (float)getLevel() / 10000F;
        int l = Math.min(rect.width(), rect.height()) / 2;
        int i1 = (l * 2 * 6) / 64;
        int i = 0;
        while (i < 8) 
        {
            canvas.save();
            canvas.translate(0.0F, -(l - i1));
            Paint paint = a;
            float f1 = 4F - (12F * f - (float)i);
            int j;
            if (0.0F < f1 && f1 < 4F)
            {
                float f2 = (float)Math.floor(f1);
                j = d[(int)f1];
                int j1 = d[(int)(f1 + 1.0F)];
                float f3 = j;
                j = Color.argb((int)((float)(j1 - j) * (f1 - f2) + f3), 255, 255, 255);
            } else
            {
                j = Color.argb(d[0], 255, 255, 255);
            }
            paint.setColor(j);
            canvas.drawCircle(0.0F, 0.0F, i1, a);
            canvas.restore();
            canvas.rotate(45F);
            i++;
        }
        canvas.restoreToCount(k);
    }

    public final int getIntrinsicHeight()
    {
        return b;
    }

    public final int getIntrinsicWidth()
    {
        return b;
    }

    public final int getOpacity()
    {
        Paint paint = a;
        if (paint.getXfermode() == null)
        {
            int i = paint.getAlpha();
            if (i == 0)
            {
                return -2;
            }
            if (i == 255)
            {
                return -1;
            }
        }
        return -3;
    }

    public final boolean isRunning()
    {
        return c > 0L;
    }

    protected final boolean onLevelChange(int i)
    {
        return true;
    }

    public final void run()
    {
        long l = SystemClock.uptimeMillis();
        setLevel((int)((((l - c) % 1500L) * 10000L) / 1500L));
        invalidateSelf();
        scheduleSelf(this, l + 16L);
    }

    public final void setAlpha(int i)
    {
        a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (flag)
        {
            if (flag2 || flag1)
            {
                c = 0L;
                scheduleSelf(this, SystemClock.uptimeMillis());
            }
            return flag2;
        } else
        {
            unscheduleSelf(this);
            return flag2;
        }
    }

    public final void start()
    {
        if (!isRunning())
        {
            c = SystemClock.uptimeMillis();
            scheduleSelf(this, c);
        }
    }

    public final void stop()
    {
        if (isRunning())
        {
            c = 0L;
            unscheduleSelf(this);
        }
    }

}
