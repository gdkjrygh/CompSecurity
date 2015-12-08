// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.TextView;
import b;
import dbf;
import dbg;

public class ThemeItemView extends TextView
{

    public static final Property a = new dbf(java/lang/Float, "lineAngle");
    public static final Property b = new dbg(java/lang/Float, "lineSeparation");
    public float c;
    public float d;
    private final Paint e;
    private final Paint f;
    private int g;
    private RectF h;

    public ThemeItemView(Context context)
    {
        this(context, null);
    }

    public ThemeItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThemeItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new Paint();
        f = new Paint();
        d = 1.0F;
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setAntiAlias(true);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        g = getResources().getDimensionPixelSize(b.dE);
        f.setStrokeWidth(g);
        f.setAntiAlias(true);
    }

    private void a()
    {
        float f1 = ((1.0F - d) * 1.8F + 1.0F) * (float)g;
        h = new RectF(f1, f1, (float)getWidth() - f1, (float)getHeight() - f1);
    }

    public final void a(float f1)
    {
        c = f1;
        invalidate();
    }

    public final void b(float f1)
    {
        d = f1;
        a();
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1 = (float)getWidth() / 2.0F;
        canvas.drawCircle(f1, (float)getHeight() / 2.0F, f1 - (float)g * 2.3F, e);
        if (c > 0.0F)
        {
            canvas.drawArc(h, -90F, c, false, f);
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a();
    }

    public void setBackgroundColor(int i)
    {
        e.setColor(i);
        e.setAlpha(230);
        f.setColor(i);
        invalidate();
    }

}
