// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompat, VelocityTrackerCompat

public class GestureDetectorCompat
{
    static interface GestureDetectorCompatImpl
    {

        public abstract boolean isLongpressEnabled();

        public abstract boolean onTouchEvent(MotionEvent motionevent);

        public abstract void setIsLongpressEnabled(boolean flag);

        public abstract void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener);
    }

    static class GestureDetectorCompatImplBase
        implements GestureDetectorCompatImpl
    {

        private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
        private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        private MotionEvent mCurrentDownEvent;
        private boolean mDeferConfirmSingleTap;
        private android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        private final android.view.GestureDetector.OnGestureListener mListener;
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
            mListener.onLongPress(mCurrentDownEvent);
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

        public boolean isLongpressEnabled()
        {
            return mIsLongpressEnabled;
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            float f;
            float f1;
            int i2;
            int j2 = motionevent.getAction();
            if (mVelocityTracker == null)
            {
                mVelocityTracker = VelocityTracker.obtain();
            }
            mVelocityTracker.addMovement(motionevent);
            boolean flag;
            int l;
            int k1;
            if ((j2 & 0xff) == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                l = MotionEventCompat.getActionIndex(motionevent);
            } else
            {
                l = -1;
            }
            i2 = MotionEventCompat.getPointerCount(motionevent);
            k1 = 0;
            f = 0.0F;
            float f2;
            for (f1 = 0.0F; k1 < i2; f1 = f2)
            {
                float f5 = f;
                f2 = f1;
                if (l != k1)
                {
                    f2 = f1 + MotionEventCompat.getX(motionevent, k1);
                    f5 = f + MotionEventCompat.getY(motionevent, k1);
                }
                k1++;
                f = f5;
            }

            int i;
            if (flag)
            {
                i = i2 - 1;
            } else
            {
                i = i2;
            }
            f1 /= i;
            f /= i;
            j2 & 0xff;
            JVM INSTR tableswitch 0 6: default 204
        //                       0 383
        //                       1 862
        //                       2 643
        //                       3 1136
        //                       4 204
        //                       5 213
        //                       6 239;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
            return false;
_L6:
            mLastFocusX = f1;
            mDownFocusX = f1;
            mLastFocusY = f;
            mDownFocusY = f;
            cancelTaps();
            return false;
_L7:
            mLastFocusX = f1;
            mDownFocusX = f1;
            mLastFocusY = f;
            mDownFocusY = f;
            mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
            int i1 = MotionEventCompat.getActionIndex(motionevent);
            int j = MotionEventCompat.getPointerId(motionevent, i1);
            f = VelocityTrackerCompat.getXVelocity(mVelocityTracker, j);
            f1 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, j);
            j = 0;
            while (j < i2) 
            {
                if (j != i1)
                {
                    int l1 = MotionEventCompat.getPointerId(motionevent, j);
                    float f3 = VelocityTrackerCompat.getXVelocity(mVelocityTracker, l1);
                    if (VelocityTrackerCompat.getYVelocity(mVelocityTracker, l1) * f1 + f3 * f < 0.0F)
                    {
                        mVelocityTracker.clear();
                        return false;
                    }
                }
                j++;
            }
              goto _L8
_L2:
            if (mDoubleTapListener == null) goto _L10; else goto _L9
_L9:
            boolean flag2;
            flag2 = mHandler.hasMessages(3);
            if (flag2)
            {
                mHandler.removeMessages(3);
            }
            if (mCurrentDownEvent == null || mPreviousUpEvent == null || !flag2 || !isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent)) goto _L12; else goto _L11
_L11:
            boolean flag1;
            mIsDoubleTapping = true;
            flag1 = mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent);
_L13:
            mLastFocusX = f1;
            mDownFocusX = f1;
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
            return flag1 | mListener.onDown(motionevent);
_L12:
            mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
_L10:
            flag1 = false;
            if (true) goto _L13; else goto _L4
_L4:
            if (!mInLongPress)
            {
                float f4 = mLastFocusX - f1;
                float f6 = mLastFocusY - f;
                if (mIsDoubleTapping)
                {
                    return mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
                }
                if (mAlwaysInTapRegion)
                {
                    int k = (int)(f1 - mDownFocusX);
                    int j1 = (int)(f - mDownFocusY);
                    k = k * k + j1 * j1;
                    MotionEvent motionevent1;
                    VelocityTracker velocitytracker;
                    boolean flag3;
                    boolean flag4;
                    if (k > mTouchSlopSquare)
                    {
                        flag3 = mListener.onScroll(mCurrentDownEvent, motionevent, f4, f6);
                        mLastFocusX = f1;
                        mLastFocusY = f;
                        mAlwaysInTapRegion = false;
                        mHandler.removeMessages(3);
                        mHandler.removeMessages(1);
                        mHandler.removeMessages(2);
                    } else
                    {
                        flag3 = false;
                    }
                    if (k > mTouchSlopSquare)
                    {
                        mAlwaysInBiggerTapRegion = false;
                    }
                    return flag3;
                }
                if (Math.abs(f4) >= 1.0F || Math.abs(f6) >= 1.0F)
                {
                    flag3 = mListener.onScroll(mCurrentDownEvent, motionevent, f4, f6);
                    mLastFocusX = f1;
                    mLastFocusY = f;
                    return flag3;
                }
            }
_L8:
            if (true) goto _L1; else goto _L3
_L3:
            mStillDown = false;
            motionevent1 = MotionEvent.obtain(motionevent);
            if (mIsDoubleTapping)
            {
                flag3 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
            } else
            if (mInLongPress)
            {
                mHandler.removeMessages(3);
                mInLongPress = false;
                flag3 = false;
            } else
            if (mAlwaysInTapRegion)
            {
                flag4 = mListener.onSingleTapUp(motionevent);
                flag3 = flag4;
                if (mDeferConfirmSingleTap)
                {
                    flag3 = flag4;
                    if (mDoubleTapListener != null)
                    {
                        mDoubleTapListener.onSingleTapConfirmed(motionevent);
                        flag3 = flag4;
                    }
                }
            } else
            {
                velocitytracker = mVelocityTracker;
                k = MotionEventCompat.getPointerId(motionevent, 0);
                velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
                f = VelocityTrackerCompat.getYVelocity(velocitytracker, k);
                f1 = VelocityTrackerCompat.getXVelocity(velocitytracker, k);
                if (Math.abs(f) > (float)mMinimumFlingVelocity || Math.abs(f1) > (float)mMinimumFlingVelocity)
                {
                    flag3 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
                } else
                {
                    flag3 = false;
                }
            }
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
            return flag3;
_L5:
            cancel();
            return false;
        }

        public void setIsLongpressEnabled(boolean flag)
        {
            mIsLongpressEnabled = flag;
        }

        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
        {
            mDoubleTapListener = ondoubletaplistener;
        }








/*
        static boolean access$502(GestureDetectorCompatImplBase gesturedetectorcompatimplbase, boolean flag)
        {
            gesturedetectorcompatimplbase.mDeferConfirmSingleTap = flag;
            return flag;
        }

*/

        public GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
        {
            if (handler != null)
            {
                mHandler = new GestureHandler(handler);
            } else
            {
                mHandler = new GestureHandler();
            }
            mListener = ongesturelistener;
            if (ongesturelistener instanceof android.view.GestureDetector.OnDoubleTapListener)
            {
                setOnDoubleTapListener((android.view.GestureDetector.OnDoubleTapListener)ongesturelistener);
            }
            init(context);
        }
    }

    private class GestureDetectorCompatImplBase.GestureHandler extends Handler
    {

        final GestureDetectorCompatImplBase this$0;

        public void handleMessage(Message message)
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

        GestureDetectorCompatImplBase.GestureHandler()
        {
            this$0 = GestureDetectorCompatImplBase.this;
            super();
        }

        GestureDetectorCompatImplBase.GestureHandler(Handler handler)
        {
            this$0 = GestureDetectorCompatImplBase.this;
            super(handler.getLooper());
        }
    }

    static class GestureDetectorCompatImplJellybeanMr2
        implements GestureDetectorCompatImpl
    {

        private final GestureDetector mDetector;

        public boolean isLongpressEnabled()
        {
            return mDetector.isLongpressEnabled();
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            return mDetector.onTouchEvent(motionevent);
        }

        public void setIsLongpressEnabled(boolean flag)
        {
            mDetector.setIsLongpressEnabled(flag);
        }

        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
        {
            mDetector.setOnDoubleTapListener(ondoubletaplistener);
        }

        public GestureDetectorCompatImplJellybeanMr2(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
        {
            mDetector = new GestureDetector(context, ongesturelistener, handler);
        }
    }


    private final GestureDetectorCompatImpl mImpl;

    public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, null);
    }

    public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            mImpl = new GestureDetectorCompatImplJellybeanMr2(context, ongesturelistener, handler);
            return;
        } else
        {
            mImpl = new GestureDetectorCompatImplBase(context, ongesturelistener, handler);
            return;
        }
    }

    public boolean isLongpressEnabled()
    {
        return mImpl.isLongpressEnabled();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return mImpl.onTouchEvent(motionevent);
    }

    public void setIsLongpressEnabled(boolean flag)
    {
        mImpl.setIsLongpressEnabled(flag);
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        mImpl.setOnDoubleTapListener(ondoubletaplistener);
    }
}
