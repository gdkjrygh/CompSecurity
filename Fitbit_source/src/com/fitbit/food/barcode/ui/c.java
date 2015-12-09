// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class c extends Drawable
{

    private Paint a;
    private float b;
    private float c;

    public c()
    {
        b = -1F;
        c = -1F;
        a = new Paint();
    }

    public c(float f)
    {
        this();
        b = f;
        c = f;
    }

    public c(float f, float f1)
    {
        this();
        b = f;
        c = f1;
    }

    private int c()
    {
        Rect rect = getBounds();
        if (rect.width() < rect.height())
        {
            return rect.width();
        } else
        {
            return rect.height();
        }
    }

    public float a()
    {
        if (b < 0.0F)
        {
            b = c() / 4;
        }
        return b;
    }

    public void a(float f)
    {
        a.setStrokeWidth(f);
    }

    public void a(int i)
    {
        a.setColor(i);
    }

    public float b()
    {
        if (c < 0.0F)
        {
            c = c() / 4;
        }
        return c;
    }

    public void draw(Canvas canvas)
    {
        Rect rect = canvas.getClipBounds();
        setBounds(rect);
        int i = rect.width();
        int j = rect.height();
        float f = a();
        float f1 = b();
        canvas.drawLine(0.0F, 0.0F, f, 0.0F, a);
        canvas.drawLine(0.0F, 0.0F, 0.0F, f1, a);
        canvas.drawLine((float)i - f, 0.0F, i, 0.0F, a);
        canvas.drawLine(i, 0.0F, i, f1, a);
        canvas.drawLine(0.0F, j, f, j, a);
        canvas.drawLine(0.0F, (float)j - f1, 0.0F, j, a);
        canvas.drawLine((float)i - f, j, i, j, a);
        canvas.drawLine(i, (float)j - f1, i, j, a);
    }

    public int getOpacity()
    {
        return 0;
    }

    protected void onBoundsChange(Rect rect)
    {
        b = -1F;
        c = -1F;
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
