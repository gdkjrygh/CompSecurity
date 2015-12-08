// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class RelativeLayoutInterceptor extends RelativeLayout
{
    public static interface MotionEventListener
    {

        public abstract boolean onMotionEventIntercepted(MotionEvent motionevent);
    }


    private MotionEventListener mMotionEventListener;

    public RelativeLayoutInterceptor(Context context)
    {
        super(context);
        mMotionEventListener = null;
    }

    public RelativeLayoutInterceptor(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMotionEventListener = null;
    }

    public RelativeLayoutInterceptor(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMotionEventListener = null;
    }

    public RelativeLayoutInterceptor(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mMotionEventListener = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (mMotionEventListener != null)
        {
            return mMotionEventListener.onMotionEventIntercepted(motionevent);
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public void setMotionEventListener(MotionEventListener motioneventlistener)
    {
        mMotionEventListener = motioneventlistener;
    }
}
