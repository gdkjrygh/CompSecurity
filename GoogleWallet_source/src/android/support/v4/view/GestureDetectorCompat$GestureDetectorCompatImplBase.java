// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            GestureDetectorCompat, MotionEventCompat, VelocityTrackerCompat

static final class init
    implements init
{
    final class GestureHandler extends Handler
    {

        final GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 3: default 32
        //                       1 56
        //                       2 76
        //                       3 84;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
            mListener.onShowPress(mCurrentDownEvent);
_L6:
            return;
_L3:
            dispatchLongPress();
            return;
_L4:
            if (mDoubleTapListener != null)
            {
                if (!mStillDown)
                {
                    mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
                    return;
                } else
                {
                    mDeferConfirmSingleTap = true;
                    return;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        GestureHandler()
        {
            this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
            super();
        }

        GestureHandler(Handler handler)
        {
            this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
            super(handler.getLooper());
        }
    }


    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
    private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private android.view.atImplBase.cancel mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final Handler mHandler;
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final android.view.atImplBase.cancel mListener;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;

    private void cancel()
    {
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        mHandler.removeMessages(3);
        mVelocityTracker.recycle();
        mVelocityTracker = null;
        mIsDoubleTapping = false;
        mStillDown = false;
        mAlwaysInTapRegion = false;
        mAlwaysInBiggerTapRegion = false;
        mDeferConfirmSingleTap = false;
        if (mInLongPress)
        {
            mInLongPress = false;
        }
    }

    private void cancelTaps()
    {
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        mHandler.removeMessages(3);
        mIsDoubleTapping = false;
        mAlwaysInTapRegion = false;
        mAlwaysInBiggerTapRegion = false;
        mDeferConfirmSingleTap = false;
        if (mInLongPress)
        {
            mInLongPress = false;
        }
    }

    private void dispatchLongPress()
    {
        mHandler.removeMessages(3);
        mDeferConfirmSingleTap = false;
        mInLongPress = true;
        mListener.mListener(mCurrentDownEvent);
    }

    private void init(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (mListener == null)
        {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else
        {
            mIsLongpressEnabled = true;
            context = ViewConfiguration.get(context);
            int i = context.getScaledTouchSlop();
            int j = context.getScaledDoubleTapSlop();
            mMinimumFlingVelocity = context.getScaledMinimumFlingVelocity();
            mMaximumFlingVelocity = context.getScaledMaximumFlingVelocity();
            mTouchSlopSquare = i * i;
            mDoubleTapSlopSquare = j * j;
            return;
        }
    }

    private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        if (mAlwaysInBiggerTapRegion && motionevent2.getEventTime() - motionevent1.getEventTime() <= (long)DOUBLE_TAP_TIMEOUT)
        {
            int i = (int)motionevent.getX() - (int)motionevent2.getX();
            int j = (int)motionevent.getY() - (int)motionevent2.getY();
            if (i * i + j * j < mDoubleTapSlopSquare)
            {
                return true;
            }
        }
        return false;
    }

    private void setOnDoubleTapListener(android.view.atImplBase atimplbase)
    {
        mDoubleTapListener = atimplbase;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f2;
        int j1;
        int j2;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        boolean flag5;
        int k2 = motionevent.getAction();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        float f3;
        boolean flag;
        if ((k2 & 0xff) == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j1 = MotionEventCompat.getActionIndex(motionevent);
        } else
        {
            j1 = -1;
        }
        f3 = 0.0F;
        f = 0.0F;
        j2 = MotionEventCompat.getPointerCount(motionevent);
        for (int l1 = 0; l1 < j2;)
        {
            float f5 = f3;
            float f1 = f;
            if (j1 != l1)
            {
                f5 = f3 + MotionEventCompat.getX(motionevent, l1);
                f1 = f + MotionEventCompat.getY(motionevent, l1);
            }
            l1++;
            f3 = f5;
            f = f1;
        }

        int i;
        if (flag)
        {
            i = j2 - 1;
        } else
        {
            i = j2;
        }
        f2 = f3 / (float)i;
        f /= i;
        j1 = 0;
        flag4 = false;
        flag5 = false;
        flag1 = false;
        flag2 = flag1;
        k2 & 0xff;
        JVM INSTR tableswitch 0 6: default 224
    //                   0 408
    //                   1 908
    //                   2 673
    //                   3 1187
    //                   4 228
    //                   5 238
    //                   6 264;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        flag2 = flag1;
_L6:
        return flag2;
_L7:
        mLastFocusX = f2;
        mDownFocusX = f2;
        mLastFocusY = f;
        mDownFocusY = f;
        cancelTaps();
        return false;
_L8:
        mLastFocusX = f2;
        mDownFocusX = f2;
        mLastFocusY = f;
        mDownFocusY = f;
        mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        j1 = MotionEventCompat.getActionIndex(motionevent);
        int j = MotionEventCompat.getPointerId(motionevent, j1);
        f = VelocityTrackerCompat.getXVelocity(mVelocityTracker, j);
        f2 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, j);
        j = 0;
        do
        {
            flag2 = flag1;
            if (j >= j2)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j != j1)
            {
                int i2 = MotionEventCompat.getPointerId(motionevent, j);
                if (f * VelocityTrackerCompat.getXVelocity(mVelocityTracker, i2) + f2 * VelocityTrackerCompat.getYVelocity(mVelocityTracker, i2) < 0.0F)
                {
                    mVelocityTracker.clear();
                    return false;
                }
            }
            j++;
        } while (true);
_L2:
        int k = j1;
        if (mDoubleTapListener != null)
        {
            flag1 = mHandler.hasMessages(3);
            if (flag1)
            {
                mHandler.removeMessages(3);
            }
            if (mCurrentDownEvent != null && mPreviousUpEvent != null && flag1 && isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent))
            {
                mIsDoubleTapping = true;
                k = mDoubleTapListener.mDoubleTapListener(mCurrentDownEvent) | false | mDoubleTapListener.(motionevent);
            } else
            {
                mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
                k = j1;
            }
        }
        mLastFocusX = f2;
        mDownFocusX = f2;
        mLastFocusY = f;
        mDownFocusY = f;
        if (mCurrentDownEvent != null)
        {
            mCurrentDownEvent.recycle();
        }
        mCurrentDownEvent = MotionEvent.obtain(motionevent);
        mAlwaysInTapRegion = true;
        mAlwaysInBiggerTapRegion = true;
        mStillDown = true;
        mInLongPress = false;
        mDeferConfirmSingleTap = false;
        if (mIsLongpressEnabled)
        {
            mHandler.removeMessages(2);
            mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
        }
        mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
        return k | mListener.mListener(motionevent);
_L4:
        float f4;
        float f6;
        flag2 = flag1;
        if (mInLongPress)
        {
            continue; /* Loop/switch isn't completed */
        }
        f4 = mLastFocusX - f2;
        f6 = mLastFocusY - f;
        if (mIsDoubleTapping)
        {
            return mDoubleTapListener.(motionevent) | false;
        }
        if (!mAlwaysInTapRegion)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = (int)(f2 - mDownFocusX);
        int k1 = (int)(f - mDownFocusY);
        l = l * l + k1 * k1;
        flag1 = flag4;
        if (l > mTouchSlopSquare)
        {
            flag1 = mListener.mListener(mCurrentDownEvent, motionevent, f4, f6);
            mLastFocusX = f2;
            mLastFocusY = f;
            mAlwaysInTapRegion = false;
            mHandler.removeMessages(3);
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
        }
        flag2 = flag1;
        if (l > mTouchSlopSquare)
        {
            mAlwaysInBiggerTapRegion = false;
            return flag1;
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (Math.abs(f4) >= 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag1;
        if (Math.abs(f6) < 1.0F) goto _L6; else goto _L10
_L10:
        flag1 = mListener.mListener(mCurrentDownEvent, motionevent, f4, f6);
        mLastFocusX = f2;
        mLastFocusY = f;
        return flag1;
_L3:
        MotionEvent motionevent1;
        mStillDown = false;
        motionevent1 = MotionEvent.obtain(motionevent);
        if (!mIsDoubleTapping) goto _L12; else goto _L11
_L11:
        flag1 = mDoubleTapListener.(motionevent) | false;
_L15:
        if (mPreviousUpEvent != null)
        {
            mPreviousUpEvent.recycle();
        }
        mPreviousUpEvent = motionevent1;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
        mIsDoubleTapping = false;
        mDeferConfirmSingleTap = false;
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        return flag1;
_L12:
        if (!mInLongPress) goto _L14; else goto _L13
_L13:
        mHandler.removeMessages(3);
        mInLongPress = false;
        flag1 = flag5;
          goto _L15
_L14:
        if (!mAlwaysInTapRegion) goto _L17; else goto _L16
_L16:
        boolean flag3 = mListener.mListener(motionevent);
        flag1 = flag3;
        if (mDeferConfirmSingleTap)
        {
            flag1 = flag3;
            if (mDoubleTapListener != null)
            {
                mDoubleTapListener.rmed(motionevent);
                flag1 = flag3;
            }
        }
          goto _L15
_L17:
        VelocityTracker velocitytracker = mVelocityTracker;
        int i1 = MotionEventCompat.getPointerId(motionevent, 0);
        velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        f = VelocityTrackerCompat.getYVelocity(velocitytracker, i1);
        f2 = VelocityTrackerCompat.getXVelocity(velocitytracker, i1);
        if (Math.abs(f) > (float)mMinimumFlingVelocity) goto _L19; else goto _L18
_L18:
        flag1 = flag5;
        if (Math.abs(f2) <= (float)mMinimumFlingVelocity) goto _L15; else goto _L19
_L19:
        flag1 = mListener.mListener(mCurrentDownEvent, motionevent, f2, f);
          goto _L15
_L5:
        cancel();
        return false;
    }








/*
    static boolean access$502(GestureHandler gesturehandler, boolean flag)
    {
        gesturehandler.mDeferConfirmSingleTap = flag;
        return flag;
    }

*/

    public GestureHandler.this._cls0(Context context, android.view.atImplBase atimplbase, Handler handler)
    {
        if (handler != null)
        {
            mHandler = new GestureHandler(handler);
        } else
        {
            mHandler = new GestureHandler();
        }
        mListener = atimplbase;
        if (atimplbase instanceof android.view.atImplBase.mListener)
        {
            setOnDoubleTapListener((android.view.atImplBase.setOnDoubleTapListener)atimplbase);
        }
        init(context);
    }
}
