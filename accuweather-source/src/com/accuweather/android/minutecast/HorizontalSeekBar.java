// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.accuweather.android.utilities.AccuAnalytics;

// Referenced classes of package com.accuweather.android.minutecast:
//            BaseSeekBar

public class HorizontalSeekBar extends BaseSeekBar
{

    private static final int NUMBER_OF_MINUTES = 120;
    private boolean mTrackingTouch;

    public HorizontalSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTrackingTouch = false;
        setMax(119);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, j);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
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
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        if (!isEnabled())
        {
            return false;
        }
        flag = false;
        i = 0;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 48
    //                   0 114
    //                   1 166
    //                   2 154
    //                   3 204;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (i != 0)
        {
            i = getMax() - (int)(((float)getMax() * motionevent.getX()) / (float)getWidth());
            if (getMax() - i != getProgress())
            {
                setProgress(getMax() - i);
                onSizeChanged(getWidth(), getHeight(), 0, 0);
            }
        }
        return true;
_L2:
        AccuAnalytics.logStateEvent(getContext(), "Interaction on the MinuteCast List view using scroll bar");
        mTrackingTouch = true;
        flag = true;
        i = ((flag) ? 1 : 0);
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            i = ((flag) ? 1 : 0);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mTrackingTouch)
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mTrackingTouch)
        {
            flag = true;
        }
        mTrackingTouch = false;
        i = ((flag) ? 1 : 0);
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(false);
            i = ((flag) ? 1 : 0);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        mTrackingTouch = false;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void updateThumb()
    {
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }
}
