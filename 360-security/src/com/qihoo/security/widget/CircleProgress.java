// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;

public class CircleProgress extends View
{

    private Paint a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private RectF g;
    private Scroller h;
    private boolean i;

    public CircleProgress(Context context)
    {
        this(context, null);
    }

    public CircleProgress(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircleProgress(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = null;
        h = new Scroller(getContext(), new LinearInterpolator());
        a = new Paint();
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.CircleProgressBar);
        b = context.getColor(0, 0xffff0000);
        c = context.getColor(1, 0xff00ff00);
        d = context.getDimensionPixelOffset(2, 5);
        e = context.getInteger(3, 100);
        context.recycle();
        g = new RectF();
    }

    public void computeScroll()
    {
        if (h.computeScrollOffset())
        {
            setProgress((float)h.getCurrX() / 100F);
            postInvalidate();
        } else
        if (i)
        {
            i = false;
            postInvalidate();
            return;
        }
    }

    public int getCricleColor()
    {
        return b;
    }

    public int getCricleProgressColor()
    {
        return c;
    }

    public int getMax()
    {
        this;
        JVM INSTR monitorenter ;
        int j = e;
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public float getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = f;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public float getRoundWidth()
    {
        return (float)d;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j = getWidth() / 2;
        int k = j - d / 2;
        a.setColor(b);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setStrokeWidth(d);
        a.setAntiAlias(true);
        canvas.drawCircle(j, j, k, a);
        a.setStrokeWidth(d);
        a.setColor(c);
        g.set(j - k, j - k, j + k, j + k);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawArc(g, -90F, (360F * f) / (float)e, false, a);
    }

    public void setCricleColor(int j)
    {
        b = j;
    }

    public void setCricleProgressColor(int j)
    {
        c = j;
        postInvalidate();
    }

    public void setMax(int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("max not less than 0");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        e = j;
        this;
        JVM INSTR monitorexit ;
    }

    public void setProgress(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f1 >= 0.0F)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("progress not less than 0");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        float f2 = f1;
        if (f1 > (float)e)
        {
            f2 = e;
        }
        if (f2 <= (float)e)
        {
            f = f2;
            postInvalidate();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void setRealProgress(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f1 >= 0.0F)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("progress not less than 0");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!h.isFinished())
        {
            i = false;
            h.abortAnimation();
        }
        float f2 = f1;
        if (f1 > (float)e)
        {
            f2 = e;
        }
        if (f2 <= (float)e)
        {
            f = f2;
            postInvalidate();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void setRoundWidth(int j)
    {
        d = j;
    }
}
