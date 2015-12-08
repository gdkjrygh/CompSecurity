// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.swipeview:
//            SwipeView

private class <init>
    implements android.view.Listener
{

    private int mDistanceX;
    private boolean mFirstMotionEvent;
    private int mPreviousDirection;
    private boolean mSendingDummyMotionEvent;
    final SwipeView this$0;

    private boolean actionDown(MotionEvent motionevent)
    {
        SwipeView.access$2(SwipeView.this, (int)motionevent.getX());
        SwipeView.access$3(SwipeView.this, (int)motionevent.getY());
        mFirstMotionEvent = false;
        return false;
    }

    private boolean actionMove(MotionEvent motionevent)
    {
        int j = SwipeView.access$4(SwipeView.this) - (int)motionevent.getX();
        int i;
        if (j < 0)
        {
            if (mDistanceX + 4 <= j)
            {
                i = 1;
            } else
            {
                i = -1;
            }
        } else
        if (mDistanceX - 4 <= j)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        if (i != mPreviousDirection && !mFirstMotionEvent)
        {
            SwipeView.access$2(SwipeView.this, (int)motionevent.getX());
            mDistanceX = SwipeView.access$4(SwipeView.this) - (int)motionevent.getX();
        } else
        {
            mDistanceX = j;
        }
        mPreviousDirection = i;
        if (SwipeView.access$1(SwipeView.this))
        {
            mSendingDummyMotionEvent = true;
            dispatchTouchEvent(MotionEvent.obtain(motionevent.getDownTime(), motionevent.getEventTime(), 0, SwipeView.access$4(SwipeView.this), SwipeView.access$5(SwipeView.this), motionevent.getPressure(), motionevent.getSize(), motionevent.getMetaState(), motionevent.getXPrecision(), motionevent.getYPrecision(), motionevent.getDeviceId(), motionevent.getEdgeFlags()));
            SwipeView.access$6(SwipeView.this, false);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean actionUp(MotionEvent motionevent)
    {
        float f1 = getScrollX();
        float f = SwipeView.access$7(SwipeView.this).getMeasuredWidth() / SwipeView.access$8(SwipeView.this);
        f1 /= SwipeView.access$8(SwipeView.this);
        if (mPreviousDirection == 1)
        {
            if (mDistanceX > SwipeView.access$9())
            {
                if ((float)SwipeView.access$10(SwipeView.this) < f - 1.0F)
                {
                    f = (int)(f1 + 1.0F) * SwipeView.access$8(SwipeView.this);
                } else
                {
                    f = SwipeView.access$10(SwipeView.this) * SwipeView.access$8(SwipeView.this);
                }
            } else
            if ((float)Math.round(f1) == f - 1.0F)
            {
                f = (int)(f1 + 1.0F) * SwipeView.access$8(SwipeView.this);
            } else
            {
                f = SwipeView.access$10(SwipeView.this) * SwipeView.access$8(SwipeView.this);
            }
        } else
        if (mDistanceX < -SwipeView.access$9())
        {
            f = (int)f1 * SwipeView.access$8(SwipeView.this);
        } else
        if (Math.round(f1) == 0)
        {
            f = (int)f1 * SwipeView.access$8(SwipeView.this);
        } else
        {
            f = SwipeView.access$10(SwipeView.this) * SwipeView.access$8(SwipeView.this);
        }
        smoothScrollToPage((int)f / SwipeView.access$8(SwipeView.this));
        mFirstMotionEvent = true;
        mDistanceX = 0;
        SwipeView.access$11(SwipeView.this, false);
        SwipeView.access$12(SwipeView.this, false);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if ((SwipeView.access$0(SwipeView.this) != null && !SwipeView.access$1(SwipeView.this) || SwipeView.access$0(SwipeView.this) != null && mSendingDummyMotionEvent) && SwipeView.access$0(SwipeView.this)._mth0(view, motionevent))
        {
            if (motionevent.getAction() == 1)
            {
                actionUp(motionevent);
            }
            return true;
        }
        if (mSendingDummyMotionEvent)
        {
            mSendingDummyMotionEvent = false;
            return false;
        }
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            return actionDown(motionevent);

        case 2: // '\002'
            return actionMove(motionevent);

        case 1: // '\001'
            return actionUp(motionevent);
        }
    }

    private ()
    {
        this$0 = SwipeView.this;
        super();
        mSendingDummyMotionEvent = false;
        mFirstMotionEvent = true;
    }

    mFirstMotionEvent(mFirstMotionEvent mfirstmotionevent)
    {
        this();
    }
}
