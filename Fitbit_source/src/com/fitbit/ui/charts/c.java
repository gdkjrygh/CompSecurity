// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class c extends Drawable
{

    private final float a;
    private final float b;
    private final float c;
    private final Paint d = new Paint();

    public c(float f, int i, float f1, float f2)
    {
        a = f;
        b = f1;
        c = f2;
        d.setStyle(android.graphics.Paint.Style.FILL);
        d.setColor(i);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawCircle(-b, -c, a, d);
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
