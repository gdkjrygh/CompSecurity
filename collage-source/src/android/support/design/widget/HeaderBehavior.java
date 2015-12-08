// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.design.widget:
//            ViewOffsetBehavior, CoordinatorLayout, MathUtils

abstract class HeaderBehavior extends ViewOffsetBehavior
{
    private class FlingRunnable
        implements Runnable
    {

        private final View mLayout;
        private final CoordinatorLayout mParent;
        final HeaderBehavior this$0;

        public void run()
        {
            if (mLayout != null && mScroller != null && mScroller.computeScrollOffset())
            {
                setHeaderTopBottomOffset(mParent, mLayout, mScroller.getCurrY());
                ViewCompat.postOnAnimation(mLayout, this);
            }
        }

        FlingRunnable(CoordinatorLayout coordinatorlayout, View view)
        {
            this$0 = HeaderBehavior.this;
            super();
            mParent = coordinatorlayout;
            mLayout = view;
        }
    }


    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private Runnable mFlingRunnable;
    private boolean mIsBeingDragged;
    private int mLastMotionY;
    private ScrollerCompat mScroller;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public HeaderBehavior()
    {
        mActivePointerId = -1;
        mTouchSlop = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mActivePointerId = -1;
        mTouchSlop = -1;
    }

    private void ensureVelocityTracker()
    {
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
    }

    boolean canDragView(View view)
    {
        return false;
    }

    final boolean fling(CoordinatorLayout coordinatorlayout, View view, int i, int j, float f)
    {
        boolean flag = false;
        if (mFlingRunnable != null)
        {
            view.removeCallbacks(mFlingRunnable);
            mFlingRunnable = null;
        }
        if (mScroller == null)
        {
            mScroller = ScrollerCompat.create(view.getContext());
        }
        mScroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, j);
        if (mScroller.computeScrollOffset())
        {
            mFlingRunnable = new FlingRunnable(coordinatorlayout, view);
            ViewCompat.postOnAnimation(view, mFlingRunnable);
            flag = true;
        }
        return flag;
    }

    int getMaxDragOffset(View view)
    {
        return -view.getHeight();
    }

    int getScrollRangeForDragFling(View view)
    {
        return view.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling()
    {
        return getTopAndBottomOffset();
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        if (mTouchSlop < 0)
        {
            mTouchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
        }
        if (motionevent.getAction() == 2 && mIsBeingDragged)
        {
            return true;
        }
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 3: default 72
    //                   0 92
    //                   1 219
    //                   2 153
    //                   3 219;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent);
        }
        return mIsBeingDragged;
_L2:
        mIsBeingDragged = false;
        int i = (int)motionevent.getX();
        int k = (int)motionevent.getY();
        if (canDragView(view) && coordinatorlayout.isPointInChildBounds(view, i, k))
        {
            mLastMotionY = k;
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
            ensureVelocityTracker();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j = mActivePointerId;
        if (j != -1)
        {
            j = MotionEventCompat.findPointerIndex(motionevent, j);
            if (j != -1)
            {
                j = (int)MotionEventCompat.getY(motionevent, j);
                if (Math.abs(j - mLastMotionY) > mTouchSlop)
                {
                    mIsBeingDragged = true;
                    mLastMotionY = j;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mIsBeingDragged = false;
        mActivePointerId = -1;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        boolean flag1;
        flag1 = false;
        if (mTouchSlop < 0)
        {
            mTouchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
        }
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 3: default 60
    //                   0 81
    //                   1 272
    //                   2 145
    //                   3 326;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent);
        }
        flag = true;
_L7:
        return flag;
_L2:
        int i;
        int j;
        i = (int)motionevent.getX();
        j = (int)motionevent.getY();
        flag = flag1;
        if (!coordinatorlayout.isPointInChildBounds(view, i, j)) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (!canDragView(view)) goto _L7; else goto _L8
_L8:
        mLastMotionY = j;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        ensureVelocityTracker();
        continue; /* Loop/switch isn't completed */
_L4:
        i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        flag = flag1;
        if (i == -1) goto _L7; else goto _L9
_L9:
        int l = (int)MotionEventCompat.getY(motionevent, i);
        int k = mLastMotionY - l;
        i = k;
        if (!mIsBeingDragged)
        {
            i = k;
            if (Math.abs(k) > mTouchSlop)
            {
                mIsBeingDragged = true;
                if (k > 0)
                {
                    i = k - mTouchSlop;
                } else
                {
                    i = k + mTouchSlop;
                }
            }
        }
        if (mIsBeingDragged)
        {
            mLastMotionY = l;
            scroll(coordinatorlayout, view, i, getMaxDragOffset(view), 0);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent);
            mVelocityTracker.computeCurrentVelocity(1000);
            float f = VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId);
            fling(coordinatorlayout, view, -getScrollRangeForDragFling(view), 0, f);
        }
_L5:
        mIsBeingDragged = false;
        mActivePointerId = -1;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
        if (true) goto _L1; else goto _L10
_L10:
    }

    final int scroll(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
    {
        return setHeaderTopBottomOffset(coordinatorlayout, view, getTopBottomOffsetForScrollingSibling() - i, j, k);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        return setHeaderTopBottomOffset(coordinatorlayout, view, i, 0x80000000, 0x7fffffff);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
    {
        int i1 = getTopAndBottomOffset();
        boolean flag = false;
        int l = ((flag) ? 1 : 0);
        if (j != 0)
        {
            l = ((flag) ? 1 : 0);
            if (i1 >= j)
            {
                l = ((flag) ? 1 : 0);
                if (i1 <= k)
                {
                    i = MathUtils.constrain(i, j, k);
                    l = ((flag) ? 1 : 0);
                    if (i1 != i)
                    {
                        setTopAndBottomOffset(i);
                        l = i1 - i;
                    }
                }
            }
        }
        return l;
    }

}
