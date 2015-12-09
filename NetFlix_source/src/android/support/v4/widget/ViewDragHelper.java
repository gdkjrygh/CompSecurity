// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
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

public class ViewDragHelper
{
    public static abstract class Callback
    {

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
            return 0;
        }

        public int getOrderedChildIndex(int i)
        {
            return i;
        }

        public int getViewHorizontalDragRange(View view)
        {
            return 0;
        }

        public int getViewVerticalDragRange(View view)
        {
            return 0;
        }

        public void onEdgeDragStarted(int i, int j)
        {
        }

        public boolean onEdgeLock(int i)
        {
            return false;
        }

        public void onEdgeTouched(int i, int j)
        {
        }

        public void onViewCaptured(View view, int i)
        {
        }

        public void onViewDragStateChanged(int i)
        {
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
        }

        public void onViewReleased(View view, float f, float f1)
        {
        }

        public abstract boolean tryCaptureView(View view, int i);

        public Callback()
        {
        }
    }


    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() {

        public float getInterpolation(float f)
        {
            f--;
            return f * f * f * f * f + 1.0F;
        }

    };
    private int mActivePointerId;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int mEdgeDragsInProgress[];
    private int mEdgeDragsLocked[];
    private int mEdgeSize;
    private int mInitialEdgesTouched[];
    private float mInitialMotionX[];
    private float mInitialMotionY[];
    private float mLastMotionX[];
    private float mLastMotionY[];
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {

        final ViewDragHelper this$0;

        public void run()
        {
            setDragState(0);
        }

            
            {
                this$0 = ViewDragHelper.this;
                super();
            }
    };
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

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
        f1 = Math.abs(f1);
        if ((mInitialEdgesTouched[i] & j) == j && (mTrackingEdges & j) != 0 && (mEdgeDragsLocked[i] & j) != j && (mEdgeDragsInProgress[i] & j) != j && (f > (float)mTouchSlop || f1 > (float)mTouchSlop))
        {
            if (f < 0.5F * f1 && mCallback.onEdgeLock(j))
            {
                int ai[] = mEdgeDragsLocked;
                ai[i] = ai[i] | j;
                return false;
            }
            if ((mEdgeDragsInProgress[i] & j) == 0 && f > (float)mTouchSlop)
            {
                return true;
            }
        }
        return false;
    }

    private boolean checkTouchSlop(View view, float f, float f1)
    {
        boolean flag2 = true;
        if (view != null) goto _L2; else goto _L1
_L1:
        flag2 = false;
_L4:
        return flag2;
_L2:
        boolean flag;
        boolean flag1;
        if (mCallback.getViewHorizontalDragRange(view) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mCallback.getViewVerticalDragRange(view) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f * f + f1 * f1 <= (float)(mTouchSlop * mTouchSlop))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(f) <= (float)mTouchSlop)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (flag1)
        {
            if (Math.abs(f1) <= (float)mTouchSlop)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private float clampMag(float f, float f1, float f2)
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

    private int clampMag(int i, int j, int k)
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

    private void clearMotionHistory()
    {
        if (mInitialMotionX == null)
        {
            return;
        } else
        {
            Arrays.fill(mInitialMotionX, 0.0F);
            Arrays.fill(mInitialMotionY, 0.0F);
            Arrays.fill(mLastMotionX, 0.0F);
            Arrays.fill(mLastMotionY, 0.0F);
            Arrays.fill(mInitialEdgesTouched, 0);
            Arrays.fill(mEdgeDragsInProgress, 0);
            Arrays.fill(mEdgeDragsLocked, 0);
            mPointersDown = 0;
            return;
        }
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
        f2 = distanceInfluenceForSnapDuration(f2);
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

    private int computeSettleDuration(View view, int i, int j, int k, int l)
    {
        k = clampMag(k, (int)mMinVelocity, (int)mMaxVelocity);
        l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
        int i1 = Math.abs(i);
        int j1 = Math.abs(j);
        int k1 = Math.abs(k);
        int l1 = Math.abs(l);
        int i2 = k1 + l1;
        int j2 = i1 + j1;
        float f;
        float f1;
        if (k != 0)
        {
            f = (float)k1 / (float)i2;
        } else
        {
            f = (float)i1 / (float)j2;
        }
        if (l != 0)
        {
            f1 = (float)l1 / (float)i2;
        } else
        {
            f1 = (float)j1 / (float)j2;
        }
        i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
        j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
        return (int)((float)i * f + (float)j * f1);
    }

    public static ViewDragHelper create(ViewGroup viewgroup, float f, Callback callback)
    {
        viewgroup = create(viewgroup, callback);
        viewgroup.mTouchSlop = (int)((float)((ViewDragHelper) (viewgroup)).mTouchSlop * (1.0F / f));
        return viewgroup;
    }

    public static ViewDragHelper create(ViewGroup viewgroup, Callback callback)
    {
        return new ViewDragHelper(viewgroup.getContext(), viewgroup, callback);
    }

    private void dispatchViewReleased(float f, float f1)
    {
        mReleaseInProgress = true;
        mCallback.onViewReleased(mCapturedView, f, f1);
        mReleaseInProgress = false;
        if (mDragState == 1)
        {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f)
    {
        return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
    }

    private void dragTo(int i, int j, int k, int l)
    {
        int j1 = i;
        int i1 = j;
        int k1 = mCapturedView.getLeft();
        int l1 = mCapturedView.getTop();
        if (k != 0)
        {
            j1 = mCallback.clampViewPositionHorizontal(mCapturedView, i, k);
            mCapturedView.offsetLeftAndRight(j1 - k1);
        }
        if (l != 0)
        {
            i1 = mCallback.clampViewPositionVertical(mCapturedView, j, l);
            mCapturedView.offsetTopAndBottom(i1 - l1);
        }
        if (k != 0 || l != 0)
        {
            mCallback.onViewPositionChanged(mCapturedView, j1, i1, j1 - k1, i1 - l1);
        }
    }

    private void ensureMotionHistorySizeForId(int i)
    {
        if (mInitialMotionX == null || mInitialMotionX.length <= i)
        {
            float af[] = new float[i + 1];
            float af1[] = new float[i + 1];
            float af2[] = new float[i + 1];
            float af3[] = new float[i + 1];
            int ai[] = new int[i + 1];
            int ai1[] = new int[i + 1];
            int ai2[] = new int[i + 1];
            if (mInitialMotionX != null)
            {
                System.arraycopy(mInitialMotionX, 0, af, 0, mInitialMotionX.length);
                System.arraycopy(mInitialMotionY, 0, af1, 0, mInitialMotionY.length);
                System.arraycopy(mLastMotionX, 0, af2, 0, mLastMotionX.length);
                System.arraycopy(mLastMotionY, 0, af3, 0, mLastMotionY.length);
                System.arraycopy(mInitialEdgesTouched, 0, ai, 0, mInitialEdgesTouched.length);
                System.arraycopy(mEdgeDragsInProgress, 0, ai1, 0, mEdgeDragsInProgress.length);
                System.arraycopy(mEdgeDragsLocked, 0, ai2, 0, mEdgeDragsLocked.length);
            }
            mInitialMotionX = af;
            mInitialMotionY = af1;
            mLastMotionX = af2;
            mLastMotionY = af3;
            mInitialEdgesTouched = ai;
            mEdgeDragsInProgress = ai1;
            mEdgeDragsLocked = ai2;
        }
    }

    private boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
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
        } else
        {
            k = computeSettleDuration(mCapturedView, i, j, k, l);
            mScroller.startScroll(i1, j1, i, j, k);
            setDragState(2);
            return true;
        }
    }

    private int getEdgesTouched(int i, int j)
    {
        int l = 0;
        if (i < mParentView.getLeft() + mEdgeSize)
        {
            l = false | true;
        }
        int k = l;
        if (j < mParentView.getTop() + mEdgeSize)
        {
            k = l | 4;
        }
        l = k;
        if (i > mParentView.getRight() - mEdgeSize)
        {
            l = k | 2;
        }
        i = l;
        if (j > mParentView.getBottom() - mEdgeSize)
        {
            i = l | 8;
        }
        return i;
    }

    private void releaseViewForPointerUp()
    {
        mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
        dispatchViewReleased(clampMag(VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId), mMinVelocity, mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f, float f1, int i)
    {
        int k = 0;
        if (checkNewEdgeDrag(f, f1, i, 1))
        {
            k = false | true;
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
        ensureMotionHistorySizeForId(i);
        float af[] = mInitialMotionX;
        mLastMotionX[i] = f;
        af[i] = f;
        af = mInitialMotionY;
        mLastMotionY[i] = f1;
        af[i] = f1;
        mInitialEdgesTouched[i] = getEdgesTouched((int)f, (int)f1);
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

    public void abort()
    {
        cancel();
        if (mDragState == 2)
        {
            int i = mScroller.getCurrX();
            int j = mScroller.getCurrY();
            mScroller.abortAnimation();
            int k = mScroller.getCurrX();
            int l = mScroller.getCurrY();
            mCallback.onViewPositionChanged(mCapturedView, k, l, k - i, l - j);
        }
        setDragState(0);
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k, int l)
    {
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int j1 = view.getScrollX();
            int k1 = view.getScrollY();
            for (int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
            {
                View view1 = viewgroup.getChildAt(i1);
                if (k + j1 >= view1.getLeft() && k + j1 < view1.getRight() && l + k1 >= view1.getTop() && l + k1 < view1.getBottom() && canScroll(view1, true, i, j, (k + j1) - view1.getLeft(), (l + k1) - view1.getTop()))
                {
                    return true;
                }
            }

        }
        return flag && (ViewCompat.canScrollHorizontally(view, -i) || ViewCompat.canScrollVertically(view, -j));
    }

    public void cancel()
    {
        mActivePointerId = -1;
        clearMotionHistory();
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    public void captureChildView(View view, int i)
    {
        if (view.getParent() != mParentView)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (").append(mParentView).append(")").toString());
        } else
        {
            mCapturedView = view;
            mActivePointerId = i;
            mCallback.onViewCaptured(view, i);
            setDragState(1);
            return;
        }
    }

    public boolean checkTouchSlop(int i)
    {
        int k = mInitialMotionX.length;
        for (int j = 0; j < k; j++)
        {
            if (checkTouchSlop(i, j))
            {
                return true;
            }
        }

        return false;
    }

    public boolean checkTouchSlop(int i, int j)
    {
        boolean flag1 = true;
        if (isPointerDown(j)) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        float f;
        float f1;
        boolean flag;
        if ((i & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        f = mLastMotionX[j] - mInitialMotionX[j];
        f1 = mLastMotionY[j] - mInitialMotionY[j];
        if (!flag || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f * f + f1 * f1 <= (float)(mTouchSlop * mTouchSlop))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(f) <= (float)mTouchSlop)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i != 0)
        {
            if (Math.abs(f1) <= (float)mTouchSlop)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean continueSettling(boolean flag)
    {
        if (mDragState == 2)
        {
            boolean flag2 = mScroller.computeScrollOffset();
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
                mCallback.onViewPositionChanged(mCapturedView, i, j, k, l);
            }
            boolean flag1 = flag2;
            if (flag2)
            {
                flag1 = flag2;
                if (i == mScroller.getFinalX())
                {
                    flag1 = flag2;
                    if (j == mScroller.getFinalY())
                    {
                        mScroller.abortAnimation();
                        flag1 = mScroller.isFinished();
                    }
                }
            }
            if (!flag1)
            {
                if (flag)
                {
                    mParentView.post(mSetIdleRunnable);
                } else
                {
                    setDragState(0);
                }
            }
        }
        return mDragState == 2;
    }

    public View findTopChildUnder(int i, int j)
    {
        for (int k = mParentView.getChildCount() - 1; k >= 0; k--)
        {
            View view = mParentView.getChildAt(mCallback.getOrderedChildIndex(k));
            if (i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom())
            {
                return view;
            }
        }

        return null;
    }

    public void flingCapturedView(int i, int j, int k, int l)
    {
        if (!mReleaseInProgress)
        {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        } else
        {
            mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), (int)VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId), i, k, j, l);
            setDragState(2);
            return;
        }
    }

    public int getActivePointerId()
    {
        return mActivePointerId;
    }

    public View getCapturedView()
    {
        return mCapturedView;
    }

    public int getEdgeSize()
    {
        return mEdgeSize;
    }

    public float getMinVelocity()
    {
        return mMinVelocity;
    }

    public int getTouchSlop()
    {
        return mTouchSlop;
    }

    public int getViewDragState()
    {
        return mDragState;
    }

    public boolean isCapturedViewUnder(int i, int j)
    {
        return isViewUnder(mCapturedView, i, j);
    }

    public boolean isEdgeTouched(int i)
    {
        int k = mInitialEdgesTouched.length;
        for (int j = 0; j < k; j++)
        {
            if (isEdgeTouched(i, j))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isEdgeTouched(int i, int j)
    {
        return isPointerDown(j) && (mInitialEdgesTouched[j] & i) != 0;
    }

    public boolean isPointerDown(int i)
    {
        return (mPointersDown & 1 << i) != 0;
    }

    public boolean isViewUnder(View view, int i, int j)
    {
        while (view == null || i < view.getLeft() || i >= view.getRight() || j < view.getTop() || j >= view.getBottom()) 
        {
            return false;
        }
        return true;
    }

    public void processTouchEvent(MotionEvent motionevent)
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
    //                   0 89
    //                   1 638
    //                   2 278
    //                   3 655
    //                   4 88
    //                   5 167
    //                   6 499;
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
        j = mInitialEdgesTouched[i];
        if ((mTrackingEdges & j) != 0)
        {
            mCallback.onEdgeTouched(mTrackingEdges & j, i);
            return;
        }
          goto _L1
_L6:
        float f1;
        float f3;
        j = MotionEventCompat.getPointerId(motionevent, i);
        f1 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        saveInitialMotion(f1, f3, j);
        if (mDragState != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f3), j);
        i = mInitialEdgesTouched[j];
        if ((mTrackingEdges & i) == 0) goto _L1; else goto _L8
_L8:
        mCallback.onEdgeTouched(mTrackingEdges & i, j);
        return;
        if (!isCapturedViewUnder((int)f1, (int)f3)) goto _L1; else goto _L9
_L9:
        tryCaptureViewForDrag(mCapturedView, j);
        return;
_L4:
        if (mDragState == 1)
        {
            i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            f1 = MotionEventCompat.getX(motionevent, i);
            f3 = MotionEventCompat.getY(motionevent, i);
            i = (int)(f1 - mLastMotionX[mActivePointerId]);
            j = (int)(f3 - mLastMotionY[mActivePointerId]);
            dragTo(mCapturedView.getLeft() + i, mCapturedView.getTop() + j, i, j);
            saveLastMotion(motionevent);
            return;
        }
        j = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
_L14:
        if (i >= j) goto _L11; else goto _L10
_L10:
        float f4;
        float f5;
        int k;
        k = MotionEventCompat.getPointerId(motionevent, i);
        f1 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        f4 = f1 - mInitialMotionX[k];
        f5 = f3 - mInitialMotionY[k];
        reportNewEdgeDrags(f4, f5, k);
        if (mDragState != 1) goto _L12; else goto _L11
_L11:
        View view;
        saveLastMotion(motionevent);
        return;
_L12:
        if (checkTouchSlop(view = findTopChildUnder((int)f1, (int)f3), f4, f5) && tryCaptureViewForDrag(view, k)) goto _L11; else goto _L13
_L13:
        i++;
          goto _L14
_L7:
        int l = MotionEventCompat.getPointerId(motionevent, i);
        if (mDragState != 1 || l != mActivePointerId) goto _L16; else goto _L15
_L15:
        int i1;
        k = -1;
        i1 = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
_L21:
        j = k;
        if (i >= i1) goto _L18; else goto _L17
_L17:
        j = MotionEventCompat.getPointerId(motionevent, i);
        if (j != mActivePointerId) goto _L20; else goto _L19
_L19:
        i++;
          goto _L21
_L20:
        f1 = MotionEventCompat.getX(motionevent, i);
        f3 = MotionEventCompat.getY(motionevent, i);
        if (findTopChildUnder((int)f1, (int)f3) != mCapturedView || !tryCaptureViewForDrag(mCapturedView, j)) goto _L19; else goto _L22
_L22:
        j = mActivePointerId;
_L18:
        if (j == -1)
        {
            releaseViewForPointerUp();
        }
_L16:
        clearMotionHistory(l);
        return;
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
            dispatchViewReleased(0.0F, 0.0F);
        }
        cancel();
        return;
    }

    void setDragState(int i)
    {
        if (mDragState != i)
        {
            mDragState = i;
            mCallback.onViewDragStateChanged(i);
            if (i == 0)
            {
                mCapturedView = null;
            }
        }
    }

    public void setEdgeTrackingEnabled(int i)
    {
        mTrackingEdges = i;
    }

    public void setMinVelocity(float f)
    {
        mMinVelocity = f;
    }

    public boolean settleCapturedViewAt(int i, int j)
    {
        if (!mReleaseInProgress)
        {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else
        {
            return forceSettleCapturedViewAt(i, j, (int)VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId), (int)VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId));
        }
    }

    public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
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
    //                   1 452
    //                   2 305
    //                   3 452
    //                   4 88
    //                   5 194
    //                   6 439;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_452;
_L7:
        float f;
        float f1;
        float f2;
        float f3;
        View view;
        int k;
        return mDragState == 1;
_L2:
        f = motionevent.getX();
        f1 = motionevent.getY();
        i = MotionEventCompat.getPointerId(motionevent, 0);
        saveInitialMotion(f, f1, i);
        motionevent = findTopChildUnder((int)f, (int)f1);
        if (motionevent == mCapturedView && mDragState == 2)
        {
            tryCaptureViewForDrag(motionevent, i);
        }
        j = mInitialEdgesTouched[i];
        if ((mTrackingEdges & j) != 0)
        {
            mCallback.onEdgeTouched(mTrackingEdges & j, i);
        }
          goto _L7
_L5:
        j = MotionEventCompat.getPointerId(motionevent, i);
        f = MotionEventCompat.getX(motionevent, i);
        f1 = MotionEventCompat.getY(motionevent, i);
        saveInitialMotion(f, f1, j);
        if (mDragState == 0)
        {
            i = mInitialEdgesTouched[j];
            if ((mTrackingEdges & i) != 0)
            {
                mCallback.onEdgeTouched(mTrackingEdges & i, j);
            }
        } else
        if (mDragState == 2)
        {
            motionevent = findTopChildUnder((int)f, (int)f1);
            if (motionevent == mCapturedView)
            {
                tryCaptureViewForDrag(motionevent, j);
            }
        }
          goto _L7
_L4:
        j = MotionEventCompat.getPointerCount(motionevent);
        i = 0;
_L12:
        if (i >= j) goto _L9; else goto _L8
_L8:
        k = MotionEventCompat.getPointerId(motionevent, i);
        f = MotionEventCompat.getX(motionevent, i);
        f1 = MotionEventCompat.getY(motionevent, i);
        f2 = f - mInitialMotionX[k];
        f3 = f1 - mInitialMotionY[k];
        reportNewEdgeDrags(f2, f3, k);
        if (mDragState != 1) goto _L10; else goto _L9
_L9:
        saveLastMotion(motionevent);
          goto _L7
_L10:
        if ((view = findTopChildUnder((int)f, (int)f1)) != null && checkTouchSlop(view, f2, f3) && tryCaptureViewForDrag(view, k)) goto _L9; else goto _L11
_L11:
        i++;
          goto _L12
_L6:
        clearMotionHistory(MotionEventCompat.getPointerId(motionevent, i));
          goto _L7
        cancel();
          goto _L7
    }

    public boolean smoothSlideViewTo(View view, int i, int j)
    {
        mCapturedView = view;
        mActivePointerId = -1;
        return forceSettleCapturedViewAt(i, j, 0, 0);
    }

    boolean tryCaptureViewForDrag(View view, int i)
    {
        if (view == mCapturedView && mActivePointerId == i)
        {
            return true;
        }
        if (view != null && mCallback.tryCaptureView(view, i))
        {
            mActivePointerId = i;
            captureChildView(view, i);
            return true;
        } else
        {
            return false;
        }
    }

}
