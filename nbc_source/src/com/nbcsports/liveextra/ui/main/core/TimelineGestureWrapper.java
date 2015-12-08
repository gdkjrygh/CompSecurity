// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.nbcsports.liveextra.ui.core.TouchHelper;

public class TimelineGestureWrapper extends FrameLayout
{
    public static interface Listener
    {

        public abstract void onHideTimeline();

        public abstract void onShowTimeline();
    }


    private static final int MIN_DISTANCE = 5;
    private GestureDetectorCompat gestureDetector;
    private android.view.GestureDetector.OnGestureListener gestureListener;
    private boolean isScrolling;
    private Listener listener;
    private com.nbcsports.liveextra.ui.core.TouchHelper.Action scrollDirection;
    private TouchHelper touchHelper;

    public TimelineGestureWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        listener = new Listener() {

            final TimelineGestureWrapper this$0;

            public void onHideTimeline()
            {
            }

            public void onShowTimeline()
            {
            }

            
            {
                this$0 = TimelineGestureWrapper.this;
                super();
            }
        };
        gestureListener = new android.view.GestureDetector.SimpleOnGestureListener() {

            final TimelineGestureWrapper this$0;

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                if (Math.abs(touchHelper.getDeltaY()) > 125F && Math.abs(f1) > (float)touchHelper.minFlingVelocity)
                {
                    if (scrollDirection.equals(com.nbcsports.liveextra.ui.core.TouchHelper.Action.TB))
                    {
                        listener.onHideTimeline();
                        return true;
                    }
                    if (!scrollDirection.equals(com.nbcsports.liveextra.ui.core.TouchHelper.Action.BT));
                }
                return false;
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                if (Math.abs(touchHelper.getDeltaY()) <= 250F) goto _L2; else goto _L1
_L1:
                if (!touchHelper.getAction().equals(com.nbcsports.liveextra.ui.core.TouchHelper.Action.TB)) goto _L4; else goto _L3
_L3:
                if (listener != null) goto _L5; else goto _L2
_L2:
                return false;
_L5:
                listener.onHideTimeline();
                return true;
_L4:
                if (touchHelper.getAction().equals(com.nbcsports.liveextra.ui.core.TouchHelper.Action.BT))
                {
                    return true;
                }
                if (true) goto _L2; else goto _L6
_L6:
            }

            
            {
                this$0 = TimelineGestureWrapper.this;
                super();
            }
        };
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        touchHelper = new TouchHelper(this);
        gestureDetector = new GestureDetectorCompat(getContext(), gestureListener);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        touchHelper.recordTouchEvent(motionevent);
        i = MotionEventCompat.getActionMasked(motionevent);
        if (i != 3 && i != 1) goto _L2; else goto _L1
_L1:
        isScrolling = false;
        scrollDirection = com.nbcsports.liveextra.ui.core.TouchHelper.Action.None;
_L4:
        return false;
_L2:
        switch (i)
        {
        case 1: // '\001'
        default:
            return super.onInterceptTouchEvent(motionevent);

        case 0: // '\0'
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (isScrolling)
        {
            return true;
        }
        if (touchHelper.isVerticalScroll())
        {
            isScrolling = true;
            scrollDirection = touchHelper.getAction();
            return true;
        }
        if (touchHelper.isHorizontalScroll())
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        touchHelper.recordTouchEvent(motionevent);
        if (gestureDetector.onTouchEvent(motionevent))
        {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 3 || i == 1)
        {
            isScrolling = false;
            scrollDirection = com.nbcsports.liveextra.ui.core.TouchHelper.Action.None;
            return false;
        }
        switch (i)
        {
        case 1: // '\001'
        default:
            return false;

        case 0: // '\0'
            return false;

        case 2: // '\002'
            break;
        }
        if (isScrolling)
        {
            return false;
        }
        if (touchHelper.isVerticalScroll())
        {
            isScrolling = true;
            scrollDirection = touchHelper.getAction();
            return false;
        }
        if (touchHelper.isHorizontalScroll())
        {
            isScrolling = true;
            scrollDirection = touchHelper.getAction();
            return false;
        } else
        {
            return false;
        }
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }



}
