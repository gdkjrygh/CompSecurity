// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class SimpleSwipeDismissTouchListener
    implements android.view.View.OnTouchListener
{

    private final GestureDetector mSwipeGestureListener;

    public SimpleSwipeDismissTouchListener(Context context)
    {
        mSwipeGestureListener = new GestureDetector(context, new SwipeGestureListener());
    }

    public void onSwipeLeft()
    {
    }

    public void onSwipeRight()
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return mSwipeGestureListener.onTouchEvent(motionevent);
    }

    private class SwipeGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private static final int SWIPE_DISTANCE_THRESHOLD = 120;
        private static final int SWIPE_VELOCITY_THRESHOLD = 90;
        final SimpleSwipeDismissTouchListener this$0;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            f1 = motionevent1.getX() - motionevent.getX();
            float f2 = motionevent1.getY();
            float f3 = motionevent.getY();
            if (Math.abs(f1) > Math.abs(f2 - f3) && Math.abs(f1) > 120F && Math.abs(f) > 90F)
            {
                if (f1 > 0.0F)
                {
                    onSwipeRight();
                } else
                {
                    onSwipeLeft();
                }
                return true;
            } else
            {
                return false;
            }
        }

        private SwipeGestureListener()
        {
            this$0 = SimpleSwipeDismissTouchListener.this;
            super();
        }

    }

}
