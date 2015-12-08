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
//            ProgressCircle

public class SeekCircle extends ProgressCircle
{
    public static interface OnSeekCircleChangeListener
    {

        public abstract void onProgressChanged(SeekCircle seekcircle, int i, boolean flag);

        public abstract void onStartTrackingTouch(SeekCircle seekcircle);

        public abstract void onStopTrackingTouch(SeekCircle seekcircle);
    }


    private float mOldX;
    private OnSeekCircleChangeListener mOnSeekCircleChangeListener;
    private int mRevolutions;
    private boolean mTrackingTouch;

    public SeekCircle(Context context)
    {
        super(context);
        mTrackingTouch = false;
        mRevolutions = 0;
    }

    public SeekCircle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTrackingTouch = false;
        mRevolutions = 0;
    }

    public SeekCircle(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTrackingTouch = false;
        mRevolutions = 0;
    }

    private boolean isPointInCircle(float f, float f1, double d, float f2, float f3)
    {
        return Math.pow(f - f2, 2D) + Math.pow(f1 - f3, 2D) < Math.pow(d, 2D);
    }

    private void updateRevolutions(float f, float f1)
    {
        boolean flag1;
        boolean flag2 = false;
        boolean flag;
        if (f1 > 0.0F && mOldX >= 0.0F && f < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (f1 > 0.0F)
        {
            flag1 = flag2;
            if (mOldX <= 0.0F)
            {
                flag1 = flag2;
                if (f > 0.0F)
                {
                    flag1 = true;
                }
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        mRevolutions = (int)((float)mRevolutions - 1.0F);
_L4:
        mRevolutions = Math.max(-1, Math.min(1, mRevolutions));
        return;
_L2:
        if (flag1)
        {
            mRevolutions = (int)((float)mRevolutions + 1.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateTouchProgress(int i)
    {
        if (super.updateProgress(i) && mOnSeekCircleChangeListener != null)
        {
            mOnSeekCircleChangeListener.onProgressChanged(this, i, true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        int j;
        boolean flag;
        f = motionevent.getX() - mCenterX;
        f1 = mCenterY - motionevent.getY();
        float f2;
        if ((float)Math.sqrt(f * f + f1 * f1) <= mRadius * 0.5F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
        j = 0;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 88
    //                   0 195
    //                   1 321
    //                   2 304
    //                   3 377;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = j;
_L14:
        if (i == 0) goto _L7; else goto _L6
_L6:
        f2 = (float)((Math.atan2(-f, -f1) + 3.1415926535897931D) / 6.2831853071795862D);
        j = Math.round((float)mMaxProgress * f2);
        i = j;
        if (motionevent.getAction() == 0) goto _L9; else goto _L8
_L8:
        updateRevolutions(f, f1);
        f1 = (float)mRevolutions + f2;
        i = j;
        if (!shouldClampProgress()) goto _L9; else goto _L10
_L10:
        if (f1 >= 0.0F) goto _L12; else goto _L11
_L11:
        i = 0;
_L9:
        mOldX = f;
        updateTouchProgress(i);
        return true;
_L2:
        AccuAnalytics.logStateEvent(getContext(), "Interaction on MinuteCast circle");
        i = j;
        if (!flag)
        {
            float f3 = mRadius;
            float f4 = getCircleThickness();
            i = j;
            if (isPointInCircle(motionevent.getX(), motionevent.getY(), f3 + f4, mCenterX, mCenterY))
            {
                mTrackingTouch = true;
                mOldX = f;
                mRevolutions = 0;
                j = 1;
                i = j;
                if (getParent() != null)
                {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i = j;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = j;
        if (mTrackingTouch)
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j = i;
        if (mTrackingTouch)
        {
            j = i;
            if (!flag)
            {
                j = 1;
            }
        }
        mTrackingTouch = false;
        i = j;
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(false);
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        mTrackingTouch = false;
        i = j;
        continue; /* Loop/switch isn't completed */
_L12:
        i = j;
        if (f1 > 1.0F)
        {
            i = mMaxProgress;
        }
        if (true) goto _L9; else goto _L7
_L7:
        return super.onTouchEvent(motionevent);
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void setOnSeekCircleChangeListener(OnSeekCircleChangeListener onseekcirclechangelistener)
    {
        mOnSeekCircleChangeListener = onseekcirclechangelistener;
    }

    protected boolean shouldClampProgress()
    {
        return true;
    }

    protected boolean updateProgress(int i)
    {
        boolean flag = super.updateProgress(i);
        if (flag && mOnSeekCircleChangeListener != null)
        {
            mOnSeekCircleChangeListener.onProgressChanged(this, i, false);
        }
        return flag;
    }
}
