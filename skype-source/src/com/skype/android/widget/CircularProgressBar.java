// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar
{

    private Path a;
    private int b;
    private RectF c;
    private Paint d;
    private Paint e;
    private Paint f;
    private int g;
    private int h;

    public CircularProgressBar(Context context)
    {
        super(context);
        a();
    }

    public CircularProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public CircularProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        b = 0;
        a = new Path();
        d = new Paint();
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        h = 0;
        f = new Paint();
        f.setAntiAlias(true);
        f.setStyle(android.graphics.Paint.Style.FILL);
        f.setColor(0);
        e = new Paint();
        e.setAntiAlias(true);
        e.setColor(-65281);
        e.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setIndeterminate(false);
    }

    private void a(int i)
    {
        c = new RectF(0.0F, 0.0F, i, i);
        c.inset(b / 2, b / 2);
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        int i = getMax();
        if (i != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j = (int)(360F * ((float)getProgress() / (float)getMax()));
        a.reset();
        a.addOval(c, android.graphics.Path.Direction.CW);
        d.setColor(h);
        canvas.drawPath(a, f);
        canvas.drawPath(a, d);
        a.reset();
        a.addArc(c, -90F, j);
        d.setColor(g);
        canvas.drawPath(a, d);
        if (true) goto _L1; else goto _L3
_L3:
        canvas;
        throw canvas;
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i == k)
        {
            return;
        } else
        {
            a(i);
            return;
        }
    }

    public void setCenterColor(int i)
    {
        f.setColor(i);
    }

    public void setProgressBackgroundColor(int i)
    {
        h = i;
    }

    public void setProgressColor(int i)
    {
        g = i;
    }

    public void setProgressWidth(float f1)
    {
        d.setStrokeWidth(f1);
        b = (int)f1;
        a(getWidth());
        invalidate();
    }
}
