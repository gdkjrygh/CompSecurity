// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class RotateLayout extends ViewGroup
{

    private final Matrix a;
    private final Rect b;
    private int c;
    private boolean d;

    public RotateLayout(Context context)
    {
        this(context, null);
    }

    public RotateLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Matrix();
        b = new Rect();
        c = 0;
        d = true;
    }

    private View a()
    {
        if (getChildCount() == 1)
        {
            return getChildAt(0);
        } else
        {
            throw new RuntimeException("RotateView should just have one child.");
        }
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        canvas.save();
        canvas.rotate(-c, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float af[] = new float[2];
        af[0] = motionevent.getX();
        af[1] = motionevent.getY();
        float af1[] = new float[2];
        a.mapPoints(af1, af);
        motionevent.setLocation(af1[0], af1[1]);
        boolean flag = super.dispatchTouchEvent(motionevent);
        motionevent.setLocation(af[0], af[1]);
        return flag;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return super.onInterceptTouchEvent(motionevent);
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (d || flag)
        {
            RectF rectf = new RectF();
            rectf.set(0.0F, 0.0F, k - i, l - j);
            a.setRotate(c, rectf.centerX(), rectf.centerY());
            a.mapRect(rectf);
            rectf.round(b);
            d = false;
        }
        View view = a();
        if (view != null)
        {
            view.layout(b.left, b.top, b.right, b.bottom);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        View view = a();
        if (view != null)
        {
            if (Math.abs(c % 180) == 90)
            {
                measureChild(view, j, i);
            } else
            {
                measureChild(view, i, j);
            }
            setMeasuredDimension(i, j);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public void setAngle(int i)
    {
        if (c != i)
        {
            c = i;
            d = true;
            requestLayout();
        }
    }
}
