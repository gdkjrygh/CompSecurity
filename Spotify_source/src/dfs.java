// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class dfs extends Drawable
    implements Animatable, Runnable
{

    private long a;
    private Drawable b;
    private Drawable c;
    private ColorFilter d;

    public dfs()
    {
    }

    private void a(Canvas canvas, Drawable drawable)
    {
        Rect rect = getBounds();
        int i = drawable.getIntrinsicWidth();
        int j = drawable.getIntrinsicHeight();
        int k = canvas.save();
        if (i <= 0 || j <= 0)
        {
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            return;
        }
        float f;
        if ((float)i / (float)j < (float)rect.width() / (float)rect.height())
        {
            f = (float)rect.width() / (float)i;
        } else
        {
            f = (float)rect.height() / (float)j;
        }
        canvas.translate(rect.centerX(), rect.centerY());
        canvas.scale(f, f);
        canvas.translate((float)(-i) / 2.0F, (float)(-j) / 2.0F);
        drawable.draw(canvas);
        canvas.restoreToCount(k);
    }

    public final void a(Drawable drawable, boolean flag)
    {
        stop();
        b = c;
        c = drawable;
        if (b != null)
        {
            b.setAlpha(255);
        }
        if (c != null)
        {
            int i = c.getIntrinsicWidth();
            int j = c.getIntrinsicHeight();
            c.setBounds(0, 0, i, j);
            c.setColorFilter(d);
        }
        if (flag)
        {
            start();
            return;
        } else
        {
            setLevel(255);
            invalidateSelf();
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        int i = canvas.save();
        int j = getLevel();
        if (isRunning() && b != null)
        {
            if (c == null)
            {
                b.setAlpha(255 - j);
            }
            a(canvas, b);
        }
        if (c != null)
        {
            c.setAlpha(j);
            a(canvas, c);
        }
        canvas.restoreToCount(i);
        if (j == 255)
        {
            stop();
        }
    }

    public final int getOpacity()
    {
        int j = -2;
        int i;
        if (b != null)
        {
            i = b.getOpacity();
        } else
        {
            i = -2;
        }
        if (c != null)
        {
            j = c.getOpacity();
        }
        return resolveOpacity(i, j);
    }

    public final boolean isRunning()
    {
        return a > 0L;
    }

    protected final boolean onLevelChange(int i)
    {
        return true;
    }

    public final void run()
    {
        long l = SystemClock.uptimeMillis();
        setLevel((int)((Math.min(l - a, 500L) * 255L) / 500L));
        invalidateSelf();
        scheduleSelf(this, l + 16L);
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d = colorfilter;
        if (b != null)
        {
            b.setColorFilter(colorfilter);
        }
        if (c != null)
        {
            c.setColorFilter(colorfilter);
        }
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (flag)
        {
            if (flag2 || flag1)
            {
                a = 0L;
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
            a = SystemClock.uptimeMillis();
            if (b != null)
            {
                b.setAlpha(255);
            }
            scheduleSelf(this, a);
        }
    }

    public final void stop()
    {
        if (isRunning())
        {
            a = 0L;
            unscheduleSelf(this);
        }
    }
}
