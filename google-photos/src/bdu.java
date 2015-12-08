// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;

public final class bdu extends GradientDrawable
{

    public final int a[];
    public final int b[];
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    private TimeInterpolator g;
    private TimeInterpolator h;

    public bdu(android.graphics.drawable.GradientDrawable.Orientation orientation, int ai[], int ai1[])
    {
        super(orientation, ai);
        g = null;
        h = null;
        a = (int[])ai.clone();
        b = (int[])ai1.clone();
    }

    private static final int a(int i, int j, float f1)
    {
        return b(i >> 24 & 0xff, j >> 24 & 0xff, f1) << 24 | b(i >> 16 & 0xff, j >> 16 & 0xff, f1) << 16 | b(i >> 8 & 0xff, j >> 8 & 0xff, f1) << 8 | b(i & 0xff, j & 0xff, f1);
    }

    private static final int b(int i, int j, float f1)
    {
        return (int)((1.0F - f1) * (float)i + (float)j * f1);
    }

    public final void a(boolean flag, TimeInterpolator timeinterpolator)
    {
        if (flag)
        {
            h = timeinterpolator;
            return;
        } else
        {
            g = timeinterpolator;
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        float f1 = (float)(SystemClock.uptimeMillis() - c) / (float)(d - c);
        int ai[];
        if (e)
        {
            ai = a;
        } else
        {
            ai = b;
        }
        if (f1 >= 1.0F)
        {
            if (f)
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    setColors(ai);
                }
                f = false;
            }
            super.draw(canvas);
            return;
        }
        Object obj;
        int i;
        int j;
        if (e)
        {
            obj = h;
        } else
        {
            obj = g;
        }
        if (obj != null)
        {
            f1 = ((TimeInterpolator) (obj)).getInterpolation(f1);
        }
        if (e)
        {
            obj = b;
        } else
        {
            obj = a;
        }
        i = a(obj[0], ai[0], f1);
        j = a(obj[1], ai[1], f1);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setColors(new int[] {
                i, j
            });
        }
        super.draw(canvas);
    }
}
