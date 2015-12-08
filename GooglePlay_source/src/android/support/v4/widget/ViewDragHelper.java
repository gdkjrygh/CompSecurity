// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat

public final class ViewDragHelper
{
    public static abstract class Callback
    {

        public int clampViewPositionHorizontal$17e143b0(View view, int i)
        {
            return 0;
        }

        public int clampViewPositionVertical$17e143b0(View view)
        {
            return 0;
        }

        public int getViewHorizontalDragRange(View view)
        {
            return 0;
        }

        public void onEdgeDragStarted(int i, int j)
        {
        }

        public void onEdgeTouched$255f295()
        {
        }

        public void onViewCaptured$5359dc9a(View view)
        {
        }

        public void onViewDragStateChanged(int i)
        {
        }

        public void onViewPositionChanged$5b6f797d(View view, int i)
        {
        }

        public void onViewReleased$17e2ac03(View view, float f)
        {
        }

        public abstract boolean tryCaptureView$5359dc96(View view);

        public Callback()
        {
        }
    }


    private static final Interpolator sInterpolator = new Interpolator() {

        public final float getInterpolation(float f)
        {
            f--;
            return f * f * f * f * f + 1.0F;
        }

    };
    int mActivePointerId;
    private final Callback mCallback;
    View mCapturedView;
    int mDragState;
    private int mEdgeDragsInProgress[];
    private int mEdgeDragsLocked[];
    int mEdgeSize;
    private int mInitialEdgesTouched[];
    float mInitialMotionX[];
    float mInitialMotionY[];
    float mLastMotionX[];
    float mLastMotionY[];
    private float mMaxVelocity;
    float mMinVelocity;
    private final ViewGroup mParentView;
    int mPointersDown;
    boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {

        final ViewDragHelper this$0;

        public final void run()
        {
            setDragState(0);
        }

            
            {
                this$0 = ViewDragHelper.this;
                super();
            }
    };
    int mTouchSlop;
    int mTrackingEdges;
    VelocityTracker mVelocityTracker;

    private ViewDragHelper(Context context, ViewGroup viewgroup, Callback callback)
    {
        mActivePointerId = -1;
        if (viewgroup == null)
        {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null)
        {
            throw new IllegalArgumentException("Callback may not be null");
        } else
        {
            mParentView = viewgroup;
            mCallback = callback;
            viewgroup = ViewConfiguration.get(context);
            mEdgeSize = (int)(20F * context.getResources().getDisplayMetrics().density + 0.5F);
            mTouchSlop = viewgroup.getScaledTouchSlop();
            mMaxVelocity = viewgroup.getScaledMaximumFlingVelocity();
            mMinVelocity = viewgroup.getScaledMinimumFlingVelocity();
            mScroller = ScrollerCompat.create(context, sInterpolator);
            return;
        }
    }

    private boolean checkNewEdgeDrag(float f, float f1, int i, int j)
    {
        f = Math.abs(f);
        for (f1 = Math.abs(f1); (mInitialEdgesTouched[i] & j) != j || (mTrackingEdges & j) == 0 || (mEdgeDragsLocked[i] & j) == j || (mEdgeDragsInProgress[i] & j) == j || f <= (float)mTouchSlop && f1 <= (float)mTouchSlop || (mEdgeDragsInProgress[i] & j) != 0 || f <= (float)mTouchSlop;)
        {
            return false;
        }

        return true;
    }

    private boolean checkTouchSlop$17e2abff(View view, float f)
    {
        if (view != null)
        {
            boolean flag;
            if (mCallback.getViewHorizontalDragRange(view) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && Math.abs(f) > (float)mTouchSlop)
            {
                return true;
            }
        }
        return false;
    }

    private static float clampMag(float f, float f1, float f2)
    {
        float f3 = Math.abs(f);
        if (f3 < f1)
        {
            f1 = 0.0F;
        } else
        if (f3 > f2)
        {
            f1 = f2;
            if (f <= 0.0F)
            {
                return -f2;
            }
        } else
        {
            return f;
        }
        return f1;
    }

    private static int clampMag(int i, int j, int k)
    {
        int l = Math.abs(i);
        if (l < j)
        {
            j = 0;
        } else
        if (l > k)
        {
            j = k;
            if (i <= 0)
            {
                return -k;
            }
        } else
        {
            return i;
        }
        return j;
    }

    private void clearMotionHistory(int i)
    {
        if (mInitialMotionX == null)
        {
            return;
        } else
        {
            mInitialMotionX[i] = 0.0F;
            mInitialMotionY[i] = 0.0F;
            mLastMotionX[i] = 0.0F;
            mLastMotionY[i] = 0.0F;
            mInitialEdgesTouched[i] = 0;
            mEdgeDragsInProgress[i] = 0;
            mEdgeDragsLocked[i] = 0;
            mPointersDown = mPointersDown & ~(1 << i);
            return;
        }
    }

    private int computeAxisDuration(int i, int j, int k)
    {
        if (i == 0)
        {
            return 0;
        }
        int l = mParentView.getWidth();
        int i1 = l / 2;
        float f2 = Math.min(1.0F, (float)Math.abs(i) / (float)l);
        float f = i1;
        float f1 = i1;
        f2 = (float)Math.sin((float)((double)(f2 - 0.5F) * 0.4712389167638204D));
        j = Math.abs(j);
        if (j > 0)
        {
            i = Math.round(1000F * Math.abs((f + f1 * f2) / (float)j)) * 4;
        } else
        {
            i = (int)(((float)Math.abs(i) / (float)k + 1.0F) * 256F);
        }
        return Math.min(i, 600);
    }

    public static ViewDragHelper create$3459e5c9(ViewGroup viewgroup, Callback callback)
    {
        viewgroup = new ViewDragHelper(viewgroup.getContext(), viewgroup, callback);
        viewgroup.mTouchSlop = (int)((float)((ViewDragHelper) (viewgroup)).mTouchSlop * 1.0F);
        return viewgroup;
    }

    private void dispatchViewReleased$2548a35(float f)
    {
        mReleaseInProgress = true;
        mCallback._mth17e2ac03(mCapturedView, f);
        mReleaseInProgress = false;
        if (mDragState == 1)
        {
            setDragState(0);
        }
    }

    public static boolean isViewUnder(View view, int i, int j)
    {
        while (view == null || i < view.getLeft() || i >= view.getRight() || j < view.getTop() || j >= view.getBottom()) 
        {
            return false;
        }
        return true;
    }

    private void releaseViewForPointerUp()
    {
        mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
        float f = clampMag(VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity);
        clampMag(VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity);
        dispatchViewReleased$2548a35(f);
    }

    private void reportNewEdgeDrags(float f, float f1, int i)
    {
        int k = 0;
        if (checkNewEdgeDrag(f, f1, i, 1))
        {
            k = 1;
        }
        int j = k;
        if (checkNewEdgeDrag(f1, f, i, 4))
        {
            j = k | 4;
        }
        k = j;
        if (checkNewEdgeDrag(f, f1, i, 2))
        {
            k = j | 2;
        }
        j = k;
        if (checkNewEdgeDrag(f1, f, i, 8))
        {
            j = k | 8;
        }
        if (j != 0)
        {
            int ai[] = mEdgeDragsInProgress;
            ai[i] = ai[i] | j;
            mCallback.onEdgeDragStarted(j, i);
        }
    }

    private void saveInitialMotion(float f, float f1, int i)
    {
        int k = 0;
        if (mInitialMotionX == null || mInitialMotionX.length <= i)
        {
            float af[] = new float[i + 1];
            float af2[] = new float[i + 1];
            float af3[] = new float[i + 1];
            float af4[] = new float[i + 1];
            int ai[] = new int[i + 1];
            int ai1[] = new int[i + 1];
            int ai2[] = new int[i + 1];
            if (mInitialMotionX != null)
            {
                System.arraycopy(mInitialMotionX, 0, af, 0, mInitialMotionX.length);
                System.arraycopy(mInitialMotionY, 0, af2, 0, mInitialMotionY.length);
                System.arraycopy(mLastMotionX, 0, af3, 0, mLastMotionX.length);
                System.arraycopy(mLastMotionY, 0, af4, 0, mLastMotionY.length);
                System.arraycopy(mInitialEdgesTouched, 0, ai, 0, mInitialEdgesTouched.length);
                System.arraycopy(mEdgeDragsInProgress, 0, ai1, 0, mEdgeDragsInProgress.length);
                System.arraycopy(mEdgeDragsLocked, 0, ai2, 0, mEdgeDragsLocked.length);
            }
            mInitialMotionX = af;
            mInitialMotionY = af2;
            mLastMotionX = af3;
            mLastMotionY = af4;
            mInitialEdgesTouched = ai;
            mEdgeDragsInProgress = ai1;
            mEdgeDragsLocked = ai2;
        }
        float af1[] = mInitialMotionX;
        mLastMotionX[i] = f;
        af1[i] = f;
        af1 = mInitialMotionY;
        mLastMotionY[i] = f1;
        af1[i] = f1;
        af1 = mInitialEdgesTouched;
        int i1 = (int)f;
        int l = (int)f1;
        if (i1 < mParentView.getLeft() + mEdgeSize)
        {
            k = 1;
        }
        int j = k;
        if (l < mParentView.getTop() + mEdgeSize)
        {
            j = k | 4;
        }
        k = j;
        if (i1 > mParentView.getRight() - mEdgeSize)
        {
            k = j | 2;
        }
        j = k;
        if (l > mParentView.getBottom() - mEdgeSize)
        {
            j = k | 8;
        }
        af1[i] = j;
        mPointersDown = mPointersDown | 1 << i;
    }

    private void saveLastMotion(MotionEvent motionevent)
    {
        int j = MotionEventCompat.getPointerCount(motionevent);
        for (int i = 0; i < j; i++)
        {
            int k = MotionEventCompat.getPointerId(motionevent, i);
            float f = MotionEventCompat.getX(motionevent, i);
            float f1 = MotionEventCompat.getY(motionevent, i);
            mLastMotionX[k] = f;
            mLastMotionY[k] = f1;
        }

    }

    private boolean tryCaptureViewForDrag(View view, int i)
    {
        if (view == mCapturedView && mActivePointerId == i)
        {
            return true;
        }
        if (view != null && mCallback._mth5359dc96(view))
        {
            mActivePointerId = i;
            captureChildView(view, i);
            return true;
        } else
        {
            return false;
        }
    }

    public final void abort()
    {
        cancel();
        if (mDragState == 2)
        {
            mScroller.getCurrX();
            mScroller.getCurrY();
            mScroller.abortAnimation();
            int i = mScroller.getCurrX();
            mScroller.getCurrY();
            mCallback._mth5b6f797d(mCapturedView, i);
        }
        setDragState(0);
    }

    public final void cancel()
    {
        mActivePointerId = -1;
        if (mInitialMotionX != null)
        {
            Arrays.fill(mInitialMotionX, 0.0F);
            Arrays.fill(mInitialMotionY, 0.0F);
            Arrays.fill(mLastMotionX, 0.0F);
            Arrays.fill(mLastMotionY, 0.0F);
            Arrays.fill(mInitialEdgesTouched, 0);
            Arrays.fill(mEdgeDragsInProgress, 0);
            Arrays.fill(mEdgeDragsLocked, 0);
            mPointersDown = 0;
        }
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    public final void captureChildView(View view, int i)
    {
        if (view.getParent() != mParentView)
        {
            throw new IllegalArgumentException((new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (")).append(mParentView).append(")").toString());
        } else
        {
            mCapturedView = view;
            mActivePointerId = i;
            mCallback._mth5359dc9a(view);
            setDragState(1);
            return;
        }
    }

    public final boolean continueSettling$138603()
    {
        if (mDragState == 2)
        {
            boolean flag1 = mScroller.computeScrollOffset();
            int i = mScroller.getCurrX();
            int j = mScroller.getCurrY();
            int k = i - mCapturedView.getLeft();
            int l = j - mCapturedView.getTop();
            if (k != 0)
            {
                mCapturedView.offsetLeftAndRight(k);
            }
            if (l != 0)
            {
                mCapturedView.offsetTopAndBottom(l);
            }
            if (k != 0 || l != 0)
            {
                mCallback._mth5b6f797d(mCapturedView, i);
            }
            boolean flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (i == mScroller.getFinalX())
                {
                    flag = flag1;
                    if (j == mScroller.getFinalY())
                    {
                        mScroller.abortAnimation();
                        flag = false;
                    }
                }
            }
            if (!flag)
            {
                mParentView.post(mSetIdleRunnable);
            }
        }
        return mDragState == 2;
    }

    public final View findTopChildUnder(int i, int j)
    {
        for (int k = mParentView.getChildCount() - 1; k >= 0; k--)
        {
            View view = mParentView.getChildAt(k);
            if (i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom())
            {
                return view;
            }
        }

        return null;
    }

    final boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
    {
        int i1 = mCapturedView.getLeft();
        int j1 = mCapturedView.getTop();
        i -= i1;
        j -= j1;
        if (i == 0 && j == 0)
        {
            mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        View view = mCapturedView;
        k = clampMag(k, (int)mMinVelocity, (int)mMaxVelocity);
        l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
        int k1 = Math.abs(i);
        int l1 = Math.abs(j);
        int i2 = Math.abs(k);
        int j2 = Math.abs(l);
        int k2 = i2 + j2;
        int l2 = k1 + l1;
        float f;
        float f1;
        float f2;
        if (k != 0)
        {
            f = (float)i2 / (float)k2;
        } else
        {
            f = (float)k1 / (float)l2;
        }
        if (l != 0)
        {
            f1 = (float)j2 / (float)k2;
        } else
        {
            f1 = (float)l1 / (float)l2;
        }
        k = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
        l = computeAxisDuration(j, l, 0);
        f2 = k;
        k = (int)(f1 * (float)l + f * f2);
        mScroller.startScroll(i1, j1, i, j, k);
        setDragState(2);
        return true;
    }

    public final void processTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        i = MotionEventCompat.getActionMasked(motionevent);
        j = MotionEventCompat.getActionIndex(motionevent);
        if (i == 0)
        {
            cancel();
        }
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        i;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 89
    //                   1 716
    //                   2 263
    //                   3 733
    //                   4 88
    //                   5 154
    //                   6 577;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return;
_L2:
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        i = MotionEventCompat.getPointerId(motionevent, 0);
        motionevent = findTopChildUnder((int)f, (int)f2);
        saveInitialMotion(f, f2, i);
        tryCaptureViewForDrag(motionevent, i);
        if ((mInitialEdgesTouched[i] & mTrackingEdges) != 0)
        {
            mCallback._mth255f295();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        float f1;
        float f3;
        i = MotionEventCompat.getPointerId(motionevent, j);
        f1 = MotionEventCompat.getX(motionevent, j);
        f3 = MotionEventCompat.getY(motionevent, j);
        saveInitialMotion(f1, f3, i);
        if (mDragState != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f3), i);
        if ((mInitialEdgesTouched[i] & mTrackingEdges) != 0)
        {
            mCallback._mth255f295();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        j = (int)f1;
        int k = (int)f3;
        if (isViewUnder(mCapturedView, j, k))
        {
            tryCaptureViewForDrag(mCapturedView, i);
            return;
        }
          goto _L1
_L4:
        if (mDragState == 1)
        {
            i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            f1 = MotionEventCompat.getX(motionevent, i);
            f3 = MotionEventCompat.getY(motionevent, i);
            int l = (int)(f1 - mLastMotionX[mActivePointerId]);
            int j1 = (int)(f3 - mLastMotionY[mActivePointerId]);
            j = mCapturedView.getLeft() + l;
            mCapturedView.getTop();
            int j2 = mCapturedView.getLeft();
            int l1 = mCapturedView.getTop();
            i = j;
            if (l != 0)
            {
                i = mCallback._mth17e143b0(mCapturedView, j);
                mCapturedView.offsetLeftAndRight(i - j2);
            }
            if (j1 != 0)
            {
                j = mCallback._mth17e143b0(mCapturedView);
                mCapturedView.offsetTopAndBottom(j - l1);
            }
            if (l != 0 || j1 != 0)
            {
                mCallback._mth5b6f797d(mCapturedView, i);
            }
            saveLastMotion(motionevent);
            return;
        }
        j = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            int i1 = MotionEventCompat.getPointerId(motionevent, i);
            f1 = MotionEventCompat.getX(motionevent, i);
            f3 = MotionEventCompat.getY(motionevent, i);
            float f4 = f1 - mInitialMotionX[i1];
            reportNewEdgeDrags(f4, f3 - mInitialMotionY[i1], i1);
            if (mDragState == 1)
            {
                break;
            }
            View view = findTopChildUnder((int)f1, (int)f3);
            if (checkTouchSlop$17e2abff(view, f4) && tryCaptureViewForDrag(view, i1))
            {
                break;
            }
            i++;
        } while (true);
        saveLastMotion(motionevent);
        return;
_L7:
        int k1 = MotionEventCompat.getPointerId(motionevent, j);
        if (mDragState != 1 || k1 != mActivePointerId) goto _L10; else goto _L9
_L9:
        byte byte0;
        int i2;
        byte0 = -1;
        i2 = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
_L16:
        j = byte0;
        if (i >= i2) goto _L12; else goto _L11
_L11:
        j = MotionEventCompat.getPointerId(motionevent, i);
        if (j == mActivePointerId) goto _L14; else goto _L13
_L13:
        f1 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        if (findTopChildUnder((int)f1, (int)f3) != mCapturedView || !tryCaptureViewForDrag(mCapturedView, j)) goto _L14; else goto _L15
_L15:
        j = mActivePointerId;
_L12:
        if (j == -1)
        {
            releaseViewForPointerUp();
        }
_L10:
        clearMotionHistory(k1);
        return;
_L14:
        i++;
          goto _L16
_L3:
        if (mDragState == 1)
        {
            releaseViewForPointerUp();
        }
        cancel();
        return;
_L5:
        if (mDragState == 1)
        {
            dispatchViewReleased$2548a35(0.0F);
        }
        cancel();
        return;
    }

    final void setDragState(int i)
    {
        mParentView.removeCallbacks(mSetIdleRunnable);
        if (mDragState != i)
        {
            mDragState = i;
            mCallback.onViewDragStateChanged(i);
            if (mDragState == 0)
            {
                mCapturedView = null;
            }
        }
    }

    public final boolean shouldInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        j = MotionEventCompat.getActionMasked(motionevent);
        i = MotionEventCompat.getActionIndex(motionevent);
        if (j == 0)
        {
            cancel();
        }
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        j;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 98
    //                   1 529
    //                   2 279
    //                   3 529
    //                   4 88
    //                   5 181
    //                   6 516;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_529;
_L7:
        float f;
        float f3;
        float f4;
        float f5;
        View view;
        int k;
        int l;
        return mDragState == 1;
_L2:
        f = motionevent.getX();
        f3 = motionevent.getY();
        i = MotionEventCompat.getPointerId(motionevent, 0);
        saveInitialMotion(f, f3, i);
        motionevent = findTopChildUnder((int)f, (int)f3);
        if (motionevent == mCapturedView && mDragState == 2)
        {
            tryCaptureViewForDrag(motionevent, i);
        }
        if ((mInitialEdgesTouched[i] & mTrackingEdges) != 0)
        {
            mCallback._mth255f295();
        }
          goto _L7
_L5:
        j = MotionEventCompat.getPointerId(motionevent, i);
        float f1 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        saveInitialMotion(f1, f3, j);
        if (mDragState == 0)
        {
            if ((mInitialEdgesTouched[j] & mTrackingEdges) != 0)
            {
                mCallback._mth255f295();
            }
        } else
        if (mDragState == 2)
        {
            motionevent = findTopChildUnder((int)f1, (int)f3);
            if (motionevent == mCapturedView)
            {
                tryCaptureViewForDrag(motionevent, j);
            }
        }
          goto _L7
_L4:
        if (mInitialMotionX == null || mInitialMotionY == null) goto _L7; else goto _L8
_L8:
        k = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
_L14:
        if (i >= k) goto _L10; else goto _L9
_L9:
        l = MotionEventCompat.getPointerId(motionevent, i);
        float f2 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        f4 = f2 - mInitialMotionX[l];
        f5 = mInitialMotionY[l];
        view = findTopChildUnder((int)f2, (int)f3);
        int i1;
        int j1;
        int k1;
        if (view != null && checkTouchSlop$17e2abff(view, f4))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!j) goto _L12; else goto _L11
_L11:
        i1 = view.getLeft();
        j1 = (int)f4;
        j1 = mCallback._mth17e143b0(view, i1 + j1);
        view.getTop();
        mCallback._mth17e143b0(view);
        k1 = mCallback.getViewHorizontalDragRange(view);
        if (k1 != 0 && (k1 <= 0 || j1 != i1)) goto _L12; else goto _L10
_L10:
        saveLastMotion(motionevent);
          goto _L7
_L12:
        reportNewEdgeDrags(f4, f3 - f5, l);
        if (mDragState == 1 || j && tryCaptureViewForDrag(view, l)) goto _L10; else goto _L13
_L13:
        i++;
          goto _L14
_L6:
        clearMotionHistory(MotionEventCompat.getPointerId(motionevent, i));
          goto _L7
        cancel();
          goto _L7
    }

    public final boolean smoothSlideViewTo(View view, int i, int j)
    {
        mCapturedView = view;
        mActivePointerId = -1;
        boolean flag = forceSettleCapturedViewAt(i, j, 0, 0);
        if (!flag && mDragState == 0 && mCapturedView != null)
        {
            mCapturedView = null;
        }
        return flag;
    }

}
