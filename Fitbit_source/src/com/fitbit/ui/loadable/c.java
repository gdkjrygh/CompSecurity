// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class c extends Drawable
{

    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final Paint c = new Paint();
    private final BitmapShader d;
    private final Matrix e = new Matrix();

    public c(Bitmap bitmap)
    {
        b.set(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        d = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        c.setAntiAlias(true);
        c.setShader(d);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRoundRect(a, a.width() / 2.0F, a.height() / 2.0F, c);
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.set(0.0F, 0.0F, rect.width(), rect.height());
        e.setRectToRect(b, a, android.graphics.Matrix.ScaleToFit.FILL);
        d.setLocalMatrix(e);
    }

    public void setAlpha(int i)
    {
        c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        c.setColorFilter(colorfilter);
    }
}
