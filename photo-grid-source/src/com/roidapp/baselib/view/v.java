// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.util.DisplayMetrics;

public final class v extends Drawable
{

    Bitmap a;
    final Rect b = new Rect();
    final RectF c = new RectF();
    private int d;
    private int e;
    private Paint f;
    private BitmapShader g;
    private float h;
    private boolean i;
    private int j;
    private int k;

    public v(Resources resources, Bitmap bitmap)
    {
        d = 160;
        e = 119;
        f = new Paint(6);
        i = true;
        if (resources != null)
        {
            d = resources.getDisplayMetrics().densityDpi;
        }
        a = bitmap;
        if (a != null)
        {
            j = a.getScaledWidth(d);
            k = a.getScaledHeight(d);
            g = new BitmapShader(a, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            return;
        } else
        {
            k = -1;
            j = -1;
            return;
        }
    }

    private static boolean b(float f1)
    {
        return Float.compare(f1, 0.0F) > 0;
    }

    public final void a()
    {
        f.setAntiAlias(true);
        invalidateSelf();
    }

    public final void a(float f1)
    {
        if (b(f1))
        {
            f.setShader(g);
        } else
        {
            f.setShader(null);
        }
        h = f1;
    }

    public final void draw(Canvas canvas)
    {
        Bitmap bitmap = a;
        if (bitmap == null)
        {
            return;
        }
        if (i)
        {
            GravityCompat.apply(e, j, k, getBounds(), b, 0);
            c.set(b);
            i = false;
        }
        Paint paint = f;
        if (paint.getShader() == null)
        {
            canvas.drawBitmap(bitmap, null, b, paint);
            return;
        } else
        {
            canvas.drawRoundRect(c, h, h, paint);
            return;
        }
    }

    public final int getAlpha()
    {
        return f.getAlpha();
    }

    public final ColorFilter getColorFilter()
    {
        return f.getColorFilter();
    }

    public final int getIntrinsicHeight()
    {
        return k;
    }

    public final int getIntrinsicWidth()
    {
        return j;
    }

    public final int getOpacity()
    {
        Bitmap bitmap;
        if (e == 119)
        {
            if ((bitmap = a) != null && !bitmap.hasAlpha() && f.getAlpha() >= 255 && !b(h))
            {
                return -1;
            }
        }
        return -3;
    }

    public final void setAlpha(int l)
    {
        if (l != f.getAlpha())
        {
            f.setAlpha(l);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        f.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final void setDither(boolean flag)
    {
        f.setDither(flag);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean flag)
    {
        f.setFilterBitmap(flag);
        invalidateSelf();
    }
}
