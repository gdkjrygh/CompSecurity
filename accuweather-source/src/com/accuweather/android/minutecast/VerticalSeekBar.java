// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.accuweather.android.utilities.AccuAnalytics;

// Referenced classes of package com.accuweather.android.minutecast:
//            BaseSeekBar

public class VerticalSeekBar extends BaseSeekBar
{

    private static final int NUMBER_OF_MINUTES = 120;

    public VerticalSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setMax(119);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.rotate(90F);
        canvas.translate(0.0F, -getWidth());
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(j, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(j, i, l, k);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 51
    //                   2 51;
           goto _L1 _L2 _L3 _L3
_L1:
        return true;
_L2:
        AccuAnalytics.logStateEvent(getContext(), "Interaction on the MinuteCast List view using scroll bar");
_L3:
        int i = getMax() - (int)(((float)getMax() * motionevent.getY()) / (float)getHeight());
        if (getMax() - i != getProgress())
        {
            setProgress(getMax() - i);
            onSizeChanged(getWidth(), getHeight(), 0, 0);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void updateMaxValue(int i)
    {
        setMax(120 - i);
    }

    public void updateThumb()
    {
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }
}
