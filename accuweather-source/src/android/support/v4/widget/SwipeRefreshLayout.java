// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            SwipeProgressBar

public class SwipeRefreshLayout extends ViewGroup
{
    private class BaseAnimationListener
        implements android.view.animation.Animation.AnimationListener
    {

        final SwipeRefreshLayout this$0;

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        private BaseAnimationListener()
        {
            this$0 = SwipeRefreshLayout.this;
            super();
        }

    }

    public static interface OnRefreshListener
    {

        public abstract void onRefresh();
    }


    private static final float ACCELERATE_INTERPOLATION_FACTOR = 1.5F;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2F;
    private static final int INVALID_POINTER = -1;
    private static final int LAYOUT_ATTRS[] = {
        0x101000e
    };
    private static final String LOG_TAG = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final float MAX_SWIPE_DISTANCE_FACTOR = 0.6F;
    private static final float PROGRESS_BAR_HEIGHT = 4F;
    private static final int REFRESH_TRIGGER_DISTANCE = 120;
    private static final long RETURN_TO_ORIGINAL_POSITION_TIMEOUT = 300L;
    private final AccelerateInterpolator mAccelerateInterpolator;
    private int mActivePointerId;
    private final Animation mAnimateToStartPosition;
    private final Runnable mCancel;
    private float mCurrPercentage;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private float mDistanceToTriggerSync;
    private int mFrom;
    private float mFromPercentage;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private float mLastMotionY;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private int mOriginalOffsetTop;
    private SwipeProgressBar mProgressBar;
    private int mProgressBarHeight;
    private boolean mRefreshing;
    private final Runnable mReturnToStartPosition;
    private final android.view.animation.Animation.AnimationListener mReturnToStartPositionListener;
    private boolean mReturningToStart;
    private final android.view.animation.Animation.AnimationListener mShrinkAnimationListener;
    private Animation mShrinkTrigger = new Animation() {

        final SwipeRefreshLayout this$0;

        public void applyTransformation(float f, Transformation transformation)
        {
            float f1 = mFromPercentage;
            float f2 = mFromPercentage;
            mProgressBar.setTriggerPercentage(f1 + (0.0F - f2) * f);
        }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
    };
    private View mTarget;
    private int mTouchSlop;

    public SwipeRefreshLayout(Context context)
    {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mRefreshing = false;
        mDistanceToTriggerSync = -1F;
        mFromPercentage = 0.0F;
        mCurrPercentage = 0.0F;
        mActivePointerId = -1;
        mAnimateToStartPosition = new Animation() {

            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation)
            {
                int i = 0;
                if (mFrom != mOriginalOffsetTop)
                {
                    i = mFrom + (int)((float)(mOriginalOffsetTop - mFrom) * f);
                }
                int j = i - mTarget.getTop();
                int k = mTarget.getTop();
                i = j;
                if (j + k < 0)
                {
                    i = 0 - k;
                }
                setTargetOffsetTopAndBottom(i);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mReturnToStartPositionListener = new BaseAnimationListener() {

            final SwipeRefreshLayout this$0;

            public void onAnimationEnd(Animation animation)
            {
                mCurrentTargetOffsetTop = 0;
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mShrinkAnimationListener = new BaseAnimationListener() {

            final SwipeRefreshLayout this$0;

            public void onAnimationEnd(Animation animation)
            {
                mCurrPercentage = 0.0F;
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mReturnToStartPosition = new Runnable() {

            final SwipeRefreshLayout this$0;

            public void run()
            {
                mReturningToStart = true;
                animateOffsetToStartPosition(mCurrentTargetOffsetTop + getPaddingTop(), mReturnToStartPositionListener);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mCancel = new Runnable() {

            final SwipeRefreshLayout this$0;

            public void run()
            {
                mReturningToStart = true;
                if (mProgressBar != null)
                {
                    mFromPercentage = mCurrPercentage;
                    mShrinkTrigger.setDuration(mMediumAnimationDuration);
                    mShrinkTrigger.setAnimationListener(mShrinkAnimationListener);
                    mShrinkTrigger.reset();
                    mShrinkTrigger.setInterpolator(mDecelerateInterpolator);
                    startAnimation(mShrinkTrigger);
                }
                animateOffsetToStartPosition(mCurrentTargetOffsetTop + getPaddingTop(), mReturnToStartPositionListener);
            }

            
            {
                this$0 = SwipeRefreshLayout.this;
                super();
            }
        };
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        mMediumAnimationDuration = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        mProgressBar = new SwipeProgressBar(this);
        mProgressBarHeight = (int)(getResources().getDisplayMetrics().density * 4F);
        mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
        mAccelerateInterpolator = new AccelerateInterpolator(1.5F);
        context = context.obtainStyledAttributes(attributeset, LAYOUT_ATTRS);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    private void animateOffsetToStartPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        mFrom = i;
        mAnimateToStartPosition.reset();
        mAnimateToStartPosition.setDuration(mMediumAnimationDuration);
        mAnimateToStartPosition.setAnimationListener(animationlistener);
        mAnimateToStartPosition.setInterpolator(mDecelerateInterpolator);
        mTarget.startAnimation(mAnimateToStartPosition);
    }

    private void ensureTarget()
    {
        if (mTarget == null)
        {
            if (getChildCount() > 1 && !isInEditMode())
            {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
            mTarget = getChildAt(0);
            mOriginalOffsetTop = mTarget.getTop() + getPaddingTop();
        }
        if (mDistanceToTriggerSync == -1F && getParent() != null && ((View)getParent()).getHeight() > 0)
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            mDistanceToTriggerSync = (int)Math.min((float)((View)getParent()).getHeight() * 0.6F, 120F * displaymetrics.density);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mLastMotionY = MotionEventCompat.getY(motionevent, i);
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        }
    }

    private void setTargetOffsetTopAndBottom(int i)
    {
        mTarget.offsetTopAndBottom(i);
        mCurrentTargetOffsetTop = mTarget.getTop();
    }

    private void setTriggerPercentage(float f)
    {
        if (f == 0.0F)
        {
            mCurrPercentage = 0.0F;
            return;
        } else
        {
            mCurrPercentage = f;
            mProgressBar.setTriggerPercentage(f);
            return;
        }
    }

    private void startRefresh()
    {
        removeCallbacks(mCancel);
        mReturnToStartPosition.run();
        setRefreshing(true);
        mListener.onRefresh();
    }

    private void updateContentOffsetTop(int i)
    {
        int k = mTarget.getTop();
        if ((float)i <= mDistanceToTriggerSync) goto _L2; else goto _L1
_L1:
        int j = (int)mDistanceToTriggerSync;
_L4:
        setTargetOffsetTopAndBottom(j - k);
        return;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updatePositionTimeout()
    {
        removeCallbacks(mCancel);
        postDelayed(mCancel, 300L);
    }

    public boolean canChildScrollUp()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (!(mTarget instanceof AbsListView)) goto _L2; else goto _L1
_L1:
        AbsListView abslistview = (AbsListView)mTarget;
        if (abslistview.getChildCount() <= 0 || abslistview.getFirstVisiblePosition() <= 0 && abslistview.getChildAt(0).getTop() >= abslistview.getPaddingTop()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (mTarget.getScrollY() > 0) goto _L3; else goto _L5
_L5:
        return false;
        return ViewCompat.canScrollVertically(mTarget, -1);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        mProgressBar.draw(canvas);
    }

    public boolean isRefreshing()
    {
        return mRefreshing;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks(mCancel);
        removeCallbacks(mReturnToStartPosition);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mReturnToStartPosition);
        removeCallbacks(mCancel);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        ensureTarget();
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && i == 0)
        {
            mReturningToStart = false;
        }
        if (!isEnabled() || mReturningToStart || canChildScrollUp())
        {
            return false;
        }
        i;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 97
    //                   1 221
    //                   2 134
    //                   3 221
    //                   4 92
    //                   5 92
    //                   6 213;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return mIsBeingDragged;
_L2:
        float f = motionevent.getY();
        mInitialMotionY = f;
        mLastMotionY = f;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        mCurrPercentage = 0.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        if (mActivePointerId == -1)
        {
            Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        int j = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (j < 0)
        {
            Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f1 = MotionEventCompat.getY(motionevent, j);
        if (f1 - mInitialMotionY > (float)mTouchSlop)
        {
            mLastMotionY = f1;
            mIsBeingDragged = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        onSecondaryPointerUp(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        mIsBeingDragged = false;
        mCurrPercentage = 0.0F;
        mActivePointerId = -1;
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        mProgressBar.setBounds(0, 0, i, mProgressBarHeight);
        if (getChildCount() == 0)
        {
            return;
        } else
        {
            View view = getChildAt(0);
            k = getPaddingLeft();
            l = mCurrentTargetOffsetTop + getPaddingTop();
            view.layout(k, l, k + (i - getPaddingLeft() - getPaddingRight()), l + (j - getPaddingTop() - getPaddingBottom()));
            return;
        }
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (getChildCount() > 1 && !isInEditMode())
        {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        }
        if (getChildCount() > 0)
        {
            getChildAt(0).measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mReturningToStart && i == 0)
        {
            mReturningToStart = false;
        }
        if (!isEnabled() || mReturningToStart || canChildScrollUp())
        {
            return false;
        }
        i;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 324
    //                   2 131
    //                   3 324
    //                   4 92
    //                   5 287
    //                   6 316;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        float f = motionevent.getY();
        mInitialMotionY = f;
        mLastMotionY = f;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsBeingDragged = false;
        mCurrPercentage = 0.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (j < 0)
        {
            Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f1 = MotionEventCompat.getY(motionevent, j);
        float f2 = f1 - mInitialMotionY;
        if (!mIsBeingDragged && f2 > (float)mTouchSlop)
        {
            mIsBeingDragged = true;
        }
        if (mIsBeingDragged)
        {
            if (f2 > mDistanceToTriggerSync)
            {
                startRefresh();
            } else
            {
                setTriggerPercentage(mAccelerateInterpolator.getInterpolation(f2 / mDistanceToTriggerSync));
                updateContentOffsetTop((int)f2);
                if (mLastMotionY > f1 && mTarget.getTop() == getPaddingTop())
                {
                    removeCallbacks(mCancel);
                } else
                {
                    updatePositionTimeout();
                }
            }
            mLastMotionY = f1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionY = MotionEventCompat.getY(motionevent, k);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, k);
        continue; /* Loop/switch isn't completed */
_L6:
        onSecondaryPointerUp(motionevent);
        if (true) goto _L1; else goto _L3
_L3:
        mIsBeingDragged = false;
        mCurrPercentage = 0.0F;
        mActivePointerId = -1;
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public void setColorScheme(int i, int j, int k, int l)
    {
        setColorSchemeResources(i, j, k, l);
    }

    public void setColorSchemeColors(int i, int j, int k, int l)
    {
        ensureTarget();
        mProgressBar.setColorScheme(i, j, k, l);
    }

    public void setColorSchemeResources(int i, int j, int k, int l)
    {
        Resources resources = getResources();
        setColorSchemeColors(resources.getColor(i), resources.getColor(j), resources.getColor(k), resources.getColor(l));
    }

    public void setOnRefreshListener(OnRefreshListener onrefreshlistener)
    {
        mListener = onrefreshlistener;
    }

    public void setRefreshing(boolean flag)
    {
label0:
        {
            if (mRefreshing != flag)
            {
                ensureTarget();
                mCurrPercentage = 0.0F;
                mRefreshing = flag;
                if (!mRefreshing)
                {
                    break label0;
                }
                mProgressBar.start();
            }
            return;
        }
        mProgressBar.stop();
    }














/*
    static float access$402(SwipeRefreshLayout swiperefreshlayout, float f)
    {
        swiperefreshlayout.mFromPercentage = f;
        return f;
    }

*/




/*
    static int access$702(SwipeRefreshLayout swiperefreshlayout, int i)
    {
        swiperefreshlayout.mCurrentTargetOffsetTop = i;
        return i;
    }

*/



/*
    static float access$802(SwipeRefreshLayout swiperefreshlayout, float f)
    {
        swiperefreshlayout.mCurrPercentage = f;
        return f;
    }

*/


/*
    static boolean access$902(SwipeRefreshLayout swiperefreshlayout, boolean flag)
    {
        swiperefreshlayout.mReturningToStart = flag;
        return flag;
    }

*/
}
