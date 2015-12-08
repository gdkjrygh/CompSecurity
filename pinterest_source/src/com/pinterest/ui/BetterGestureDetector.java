// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class BetterGestureDetector
{

    private static final int DOUBLE_TAP_SLOP = 100;
    private static final int DOUBLE_TAP_TIMEOUT = 200;
    private static final int LARGE_TOUCH_SLOP = 18;
    private static final int LONG_PRESS = 2;
    private static final int SHOW_PRESS = 1;
    private static final int TAP = 3;
    private static final int TAP_TIMEOUT = 100;
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private OnDoubleTapListener mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private final Handler mHandler;
    private boolean mIgnoreMultitouch;
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private int mLargeTouchSlopSquare;
    private float mLastMotionX;
    private float mLastMotionY;
    private final OnGestureListener mListener;
    private int mLongpressTimeout;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;

    public BetterGestureDetector(Context context, OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, null);
    }

    public BetterGestureDetector(Context context, OnGestureListener ongesturelistener, Handler handler)
    {
        boolean flag;
        if (context != null && context.getApplicationInfo().targetSdkVersion >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(context, ongesturelistener, handler, flag);
    }

    public BetterGestureDetector(Context context, OnGestureListener ongesturelistener, Handler handler, boolean flag)
    {
        mLongpressTimeout = 100;
        if (handler != null)
        {
            mHandler = new GestureHandler(handler);
        } else
        {
            mHandler = new GestureHandler();
        }
        mListener = ongesturelistener;
        if (ongesturelistener instanceof OnDoubleTapListener)
        {
            setOnDoubleTapListener((OnDoubleTapListener)ongesturelistener);
        }
        init(context, flag);
    }

    private void cancel()
    {
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        mHandler.removeMessages(3);
        mAlwaysInTapRegion = false;
        mIsDoubleTapping = false;
        mStillDown = false;
        if (mInLongPress)
        {
            mInLongPress = false;
        }
    }

    private void dispatchLongPress()
    {
        mHandler.removeMessages(3);
        mInLongPress = true;
        mListener.onLongPress(mCurrentDownEvent);
    }

    private void init(Context context, boolean flag)
    {
        if (mListener == null)
        {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        mIsLongpressEnabled = true;
        mIgnoreMultitouch = flag;
        int i;
        int j;
        int k;
        if (context == null)
        {
            k = ViewConfiguration.getTouchSlop();
            j = k + 2;
            i = 100;
        } else
        {
            float f = context.getResources().getDisplayMetrics().density;
            context = ViewConfiguration.get(context);
            k = context.getScaledTouchSlop();
            j = (int)(f * 18F + 0.5F);
            i = context.getScaledDoubleTapSlop();
        }
        mTouchSlopSquare = k * k;
        mLargeTouchSlopSquare = j * j;
        mDoubleTapSlopSquare = i * i;
    }

    private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        if (mAlwaysInBiggerTapRegion && motionevent2.getEventTime() - motionevent1.getEventTime() <= 200L)
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
        int i;
        int k;
        i = 1;
        k = motionevent.getAction();
        f = motionevent.getY();
        f1 = motionevent.getX();
        k & 0xff;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 137
    //                   1 609
    //                   2 380
    //                   3 77
    //                   4 68
    //                   5 70
    //                   6 83;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return false;
_L6:
        if (!mIgnoreMultitouch)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        cancel();
        return false;
_L7:
        if (mIgnoreMultitouch && motionevent.getPointerCount() == 2)
        {
            if ((k & 0xff00) >> 8 != 0)
            {
                i = 0;
            }
            mLastMotionX = motionevent.getX(i);
            mLastMotionY = motionevent.getY(i);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mDoubleTapListener == null) goto _L9; else goto _L8
_L8:
        boolean flag;
        flag = mHandler.hasMessages(3);
        if (flag)
        {
            mHandler.removeMessages(3);
        }
        if (mCurrentDownEvent == null || mPreviousUpEvent == null || !flag || !isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent)) goto _L11; else goto _L10
_L10:
        mIsDoubleTapping = true;
        i = mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent);
_L12:
        mLastMotionX = f1;
        mLastMotionY = f;
        if (mCurrentDownEvent != null)
        {
            mCurrentDownEvent.recycle();
        }
        mCurrentDownEvent = MotionEvent.obtain(motionevent);
        mAlwaysInTapRegion = true;
        mAlwaysInBiggerTapRegion = true;
        mStillDown = true;
        mInLongPress = false;
        if (mIsLongpressEnabled)
        {
            mHandler.removeMessages(2);
            mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + 100L + (long)mLongpressTimeout);
        }
        mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + 100L);
        return i | mListener.onDown(motionevent);
_L11:
        mHandler.sendEmptyMessageDelayed(3, 200L);
_L9:
        i = 0;
        if (true) goto _L12; else goto _L4
_L4:
        if (!mIgnoreMultitouch || motionevent.getPointerCount() <= 1)
        {
            float f2 = mLastMotionX - f1;
            float f3 = mLastMotionY - f;
            if (mIsDoubleTapping)
            {
                return mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
            }
            if (mAlwaysInTapRegion)
            {
                int j = (int)(f1 - mCurrentDownEvent.getX());
                int l = (int)(f - mCurrentDownEvent.getY());
                j = j * j + l * l;
                if (j > mTouchSlopSquare)
                {
                    mLastMotionX = f1;
                    mLastMotionY = f;
                    mAlwaysInTapRegion = false;
                    mHandler.removeMessages(3);
                    mHandler.removeMessages(1);
                    mHandler.removeMessages(2);
                }
                if (j > mLargeTouchSlopSquare)
                {
                    mAlwaysInBiggerTapRegion = false;
                }
                return mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
            }
            if (Math.abs(f2) >= 1.0F || Math.abs(f3) >= 1.0F)
            {
                boolean flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
                mLastMotionX = f1;
                mLastMotionY = f;
                return flag1;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        mStillDown = false;
        MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
        boolean flag2;
        if (mIsDoubleTapping)
        {
            flag2 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
        } else
        if (mInLongPress)
        {
            mHandler.removeMessages(3);
            mListener.onLongPressUp(motionevent);
            mInLongPress = false;
            flag2 = false;
        } else
        if (mAlwaysInTapRegion)
        {
            flag2 = mListener.onSingleTapUp(mCurrentDownEvent);
        } else
        {
            flag2 = false;
        }
        if (mPreviousUpEvent != null)
        {
            mPreviousUpEvent.recycle();
        }
        mPreviousUpEvent = motionevent1;
        mIsDoubleTapping = false;
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
        return flag2 | mListener.onUp(motionevent);
    }

    public void setIsLongpressEnabled(boolean flag)
    {
        mIsLongpressEnabled = flag;
    }

    public void setLongPressTimeout(int i)
    {
        mLongpressTimeout = i;
    }

    public void setOnDoubleTapListener(OnDoubleTapListener ondoubletaplistener)
    {
        mDoubleTapListener = ondoubletaplistener;
    }






    private class GestureHandler extends Handler
    {

        final BetterGestureDetector this$0;

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
            if (mDoubleTapListener != null && !mStillDown)
            {
                mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        GestureHandler()
        {
            this$0 = BetterGestureDetector.this;
            super();
        }

        GestureHandler(Handler handler)
        {
            this$0 = BetterGestureDetector.this;
            super(handler.getLooper());
        }
    }


    private class OnDoubleTapListener
    {

        public abstract boolean onDoubleTap(MotionEvent motionevent);

        public abstract boolean onDoubleTapEvent(MotionEvent motionevent);

        public abstract boolean onSingleTapConfirmed(MotionEvent motionevent);
    }


    private class OnGestureListener
    {

        public abstract boolean onDown(MotionEvent motionevent);

        public abstract void onLongPress(MotionEvent motionevent);

        public abstract void onLongPressUp(MotionEvent motionevent);

        public abstract boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1);

        public abstract void onShowPress(MotionEvent motionevent);

        public abstract boolean onSingleTapUp(MotionEvent motionevent);

        public abstract boolean onUp(MotionEvent motionevent);
    }

}
