// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.pandora.radio.util.d;

public class e extends Drawable
{

    private Paint a;
    private RectF b;
    private RectF c;
    private float d;

    public e(int i, float f, DisplayMetrics displaymetrics)
    {
        a = new Paint(1);
        a(f, displaymetrics);
        a(i);
    }

    private void a(float f, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        a.setStrokeWidth(f1 * f);
    }

    private void a(int i)
    {
        a.setColor(i);
    }

    public void draw(Canvas canvas)
    {
        canvas.rotate(-90F, getBounds().centerX(), getBounds().centerY());
        a.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawOval(b, a);
        a.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawArc(c, 0.0F, d, true, a);
    }

    public int getOpacity()
    {
        return a.getAlpha();
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        rect = new RectF(rect);
        c = rect;
        b = rect;
        int i = (int)(a.getStrokeWidth() / 2.0F + 0.5F);
        c.inset(i, i);
    }

    protected boolean onLevelChange(int i)
    {
        float f = (0.0F + (360F * (float)i) / 100F) * -1F;
        boolean flag;
        if (!com.pandora.radio.util.d.a(f, d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = f;
        return flag;
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }
}
