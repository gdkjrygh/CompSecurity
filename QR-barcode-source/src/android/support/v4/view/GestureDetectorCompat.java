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
            boolean flag;
            int l1;
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
            f1 = 0.0F;
            f = 0.0F;
            j2 = MotionEventCompat.getPointerCount(motionevent);
            l1 = 0;
            while (l1 < j2) 
            {
                if (j1 != l1)
                {
                    f1 += MotionEventCompat.getX(motionevent, l1);
                    f += MotionEventCompat.getY(motionevent, l1);
                }
                l1++;
            }
            int i;
            if (flag)
            {
                i = j2 - 1;
            } else
            {
                i = j2;
            }
            f1 /= i;
            f /= i;
            j1 = 0;
            flag4 = false;
            flag5 = false;
            flag1 = false;
            flag2 = flag1;
            k2 & 0xff;
            JVM INSTR tableswitch 0 6: default 208
        //                       0 392
        //                       1 892
        //                       2 657
        //                       3 1171
        //                       4 212
        //                       5 222
        //                       6 248;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            flag2 = flag1;
_L6:
            return flag2;
_L7:
            mLastFocusX = f1;
            mDownFocusX = f1;
            mLastFocusY = f;
            mDownFocusY = f;
            cancelTaps();
            return false;
_L8:
            int j;
            mLastFocusX = f1;
            mDownFocusX = f1;
            mLastFocusY = f;
            mDownFocusY = f;
            mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
            j1 = MotionEventCompat.getActionIndex(motionevent);
            j = MotionEventCompat.getPointerId(motionevent, j1);
            f = VelocityTrackerCompat.getXVelocity(mVelocityTracker, j);
            f1 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, j);
            j = 0;
_L10:
            flag2 = flag1;
            if (j >= j2)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j != j1)
            {
                break; /* Loop/switch isn't completed */
            }
_L12:
            j++;
            int i2;
            if (true) goto _L10; else goto _L9
_L9:
            if (f * VelocityTrackerCompat.getXVelocity(mVelocityTracker, i2 = MotionEventCompat.getPointerId(motionevent, j)) + f1 * VelocityTrackerCompat.getYVelocity(mVelocityTracker, i2) >= 0.0F) goto _L12; else goto _L11
_L11:
            mVelocityTracker.clear();
            return false;
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
                    k = false | mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | mDoubleTapListener.onDoubleTapEvent(motionevent);
                } else
                {
                    mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
                    k = j1;
                }
            }
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
            return k | mListener.onDown(motionevent);
_L4:
            float f2;
            float f3;
            flag2 = flag1;
            if (mInLongPress)
            {
                continue; /* Loop/switch isn't completed */
            }
            f2 = mLastFocusX - f1;
            f3 = mLastFocusY - f;
            if (mIsDoubleTapping)
            {
                return false | mDoubleTapListener.onDoubleTapEvent(motionevent);
            }
            if (!mAlwaysInTapRegion)
            {
                break; /* Loop/switch isn't completed */
            }
            int l = (int)(f1 - mDownFocusX);
            int k1 = (int)(f - mDownFocusY);
            l = l * l + k1 * k1;
            flag1 = flag4;
            if (l > mTouchSlopSquare)
            {
                flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
                mLastFocusX = f1;
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
            if (true) goto _L6; else goto _L13
_L13:
            if (Math.abs(f2) >= 1.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            flag2 = flag1;
            if (Math.abs(f3) < 1.0F) goto _L6; else goto _L14
_L14:
            flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
            mLastFocusX = f1;
            mLastFocusY = f;
            return flag1;
_L3:
            MotionEvent motionevent1;
            mStillDown = false;
            motionevent1 = MotionEvent.obtain(motionevent);
            if (!mIsDoubleTapping) goto _L16; else goto _L15
_L15:
            flag1 = false | mDoubleTapListener.onDoubleTapEvent(motionevent);
_L19:
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
_L16:
            if (!mInLongPress) goto _L18; else goto _L17
_L17:
            mHandler.removeMessages(3);
            mInLongPress = false;
            flag1 = flag5;
              goto _L19
_L18:
            if (!mAlwaysInTapRegion) goto _L21; else goto _L20
_L20:
            boolean flag3 = mListener.onSingleTapUp(motionevent);
            flag1 = flag3;
            if (mDeferConfirmSingleTap)
            {
                flag1 = flag3;
                if (mDoubleTapListener != null)
                {
                    mDoubleTapListener.onSingleTapConfirmed(motionevent);
                    flag1 = flag3;
                }
            }
              goto _L19
_L21:
            VelocityTracker velocitytracker = mVelocityTracker;
            int i1 = MotionEventCompat.getPointerId(motionevent, 0);
            velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
            f = VelocityTrackerCompat.getYVelocity(velocitytracker, i1);
            f1 = VelocityTrackerCompat.getXVelocity(velocitytracker, i1);
            if (Math.abs(f) > (float)mMinimumFlingVelocity) goto _L23; else goto _L22
_L22:
            flag1 = flag5;
            if (Math.abs(f1) <= (float)mMinimumFlingVelocity) goto _L19; else goto _L23
_L23:
            flag1 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
              goto _L19
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
        //                       1 59
        //                       2 79
        //                       3 87;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(message).toString());
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
