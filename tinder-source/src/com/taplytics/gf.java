// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;

public final class gf extends ShapeDrawable
{

    int a;
    int b;
    int c;
    int d;
    private final Paint e = new Paint(getPaint());
    private final Paint f;
    private final Paint g = new Paint(getPaint());
    private boolean h;

    public gf(int i, int j, int k, int l, int i1, boolean flag)
    {
        super(new RectShape());
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        a = k;
        b = j;
        c = l;
        d = i1;
        h = flag;
        e.setColor(0);
        g.setColor(Color.parseColor("#44e75f68"));
        f = new Paint(e);
        f.setColor(i);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStrokeWidth(9F);
    }

    protected final void onDraw(Shape shape, Canvas canvas, Paint paint)
    {
        paint = new Rect(b, a, c, d);
        shape.draw(canvas, e);
        if (h)
        {
            canvas.drawRect(paint, g);
        }
        canvas.drawRect(paint, f);
    }
}
