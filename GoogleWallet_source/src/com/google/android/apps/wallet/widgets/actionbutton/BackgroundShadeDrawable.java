// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

final class BackgroundShadeDrawable extends Drawable
{

    private final int colors[];
    private final Paint paint = new Paint();
    private final float positions[] = {
        0.0F, 0.0F, 1.0F
    };

    public BackgroundShadeDrawable(int i, float f, float f1)
    {
        colors = (new int[] {
            colorWithAlpha((int)(255F * f), i), colorWithAlpha((int)(255F * f), i), colorWithAlpha((int)(255F * f1), i)
        });
        paint.setAntiAlias(true);
        paint.setDither(true);
    }

    private static int colorWithAlpha(int i, int j)
    {
        return Color.argb(i, Color.red(j), Color.green(j), Color.blue(j));
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        if (rect.isEmpty() || paint.getAlpha() == 0)
        {
            return;
        } else
        {
            canvas.drawRect(rect, paint);
            return;
        }
    }

    public final int getOpacity()
    {
        return -2;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        float f = (float)Math.sqrt(Math.pow((float)rect.width() * 0.7F, 2D) + Math.pow((float)rect.height() * 0.7F, 2D));
        float f1 = rect.width();
        positions[1] = (0.5F * f1) / f;
        rect = new RadialGradient((float)rect.width() * 0.8F, (float)rect.height() * 0.75F, f, colors, positions, android.graphics.Shader.TileMode.CLAMP);
        paint.setShader(rect);
    }

    public final void setAlpha(int i)
    {
        if (i != paint.getAlpha())
        {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        paint.setColorFilter(colorfilter);
        invalidateSelf();
    }
}
