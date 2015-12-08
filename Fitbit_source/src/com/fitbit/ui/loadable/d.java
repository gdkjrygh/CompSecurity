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

public class d extends Drawable
{

    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final RectF c;
    private final Paint d = new Paint();
    private final Paint e = new Paint();
    private final BitmapShader f;
    private final Matrix g = new Matrix();
    private final float h;

    public d(Bitmap bitmap, float f1, int i)
    {
        h = f1;
        c = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        f = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        d.setAntiAlias(true);
        d.setShader(f);
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setColor(i);
        e.setStrokeWidth(f1);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRoundRect(a, a.width() / 2.0F, a.height() / 2.0F, d);
        if (h > 0.0F)
        {
            canvas.drawOval(b, e);
        }
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.set(h, h, (float)rect.width() - h, (float)rect.height() - h);
        g.setRectToRect(c, a, android.graphics.Matrix.ScaleToFit.FILL);
        f.setLocalMatrix(g);
        float f1 = h / 2.0F;
        b.set(f1, f1, (float)rect.width() - f1, (float)rect.height() - f1);
    }

    public void setAlpha(int i)
    {
        d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
    }
}
