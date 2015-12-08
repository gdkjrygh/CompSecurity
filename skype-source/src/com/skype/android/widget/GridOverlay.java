// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;

public class GridOverlay extends View
{

    private Paint a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public GridOverlay(Context context)
    {
        super(context);
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 10;
        i = 0;
        a = new Paint();
    }

    private int a(float f1)
    {
        return (int)TypedValue.applyDimension(1, f1, getResources().getDisplayMetrics());
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setColor(0);
        canvas.drawPaint(a);
        b = getWidth();
        c = getHeight();
        if (h != 0)
        {
            f = b / a(h);
            g = c / a(h);
            d = b / f;
            e = c / g;
            canvas.translate(i, i);
            a.setColor(getResources().getColor(0x7f0f011f));
            a.setAlpha(128);
            for (int j = 0; j < f; j++)
            {
                int l = d * j;
                canvas.drawLine(l, 0.0F, l, c, a);
            }

            a.setStyle(android.graphics.Paint.Style.STROKE);
            int k = 0;
            while (k < g) 
            {
                int i1 = e * k;
                canvas.drawLine(0.0F, i1, b, i1, a);
                k++;
            }
        }
    }

    public void setBlockSize(int j)
    {
        h = j;
    }

    public void setOffsetSize(int j)
    {
        i = j;
    }
}
