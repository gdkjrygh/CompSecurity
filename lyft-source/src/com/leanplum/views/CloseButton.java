// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.leanplum.utils.SizeUtil;

public class CloseButton extends View
{

    private Paint a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;

    public CloseButton(Context context)
    {
        super(context);
        a = new Paint();
        b = new Paint();
        c = new Paint();
        i = false;
        a();
    }

    public CloseButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        b = new Paint();
        c = new Paint();
        i = false;
        a();
    }

    private final void a()
    {
        a.setAntiAlias(true);
        a.setColor(0xffdddddd);
        a.setStrokeWidth(2.0F);
        a.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        b.setAntiAlias(true);
        b.setColor(0xff999999);
        b.setStrokeWidth(2.0F);
        b.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        c.setAntiAlias(true);
        c.setColor(0xff000000);
        c.setStrokeWidth(3F);
        c.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        d = SizeUtil.dp30;
        e = d * 0.3333333F;
        g = d * 0.6666667F;
        f = d * 0.3333333F;
        h = d * 0.6666667F;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint paint;
        if (i)
        {
            paint = b;
        } else
        {
            paint = a;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 1, paint);
        canvas.drawLine(e, f, g, h, c);
        canvas.drawLine(g, f, e, h, c);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, j);
        setMeasuredDimension((int)d, (int)d);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            i = true;
            invalidate();
            return true;
        }
        if (motionevent.getAction() == 1)
        {
            i = false;
            invalidate();
            performClick();
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean performClick()
    {
        return super.performClick();
    }
}
