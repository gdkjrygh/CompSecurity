// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class LinearSmoothScroller extends RecyclerView.SmoothScroller
{

    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25F;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final String TAG = "LinearSmoothScroller";
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2F;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final float MILLISECONDS_PER_PX;
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected PointF mTargetVector;

    public LinearSmoothScroller(Context context)
    {
        mInterimTargetDx = 0;
        mInterimTargetDy = 0;
        MILLISECONDS_PER_PX = calculateSpeedPerPixel(context.getResources().getDisplayMetrics());
    }

    private int clampApplyScroll(int i, int j)
    {
        int k = i - j;
        j = k;
        if (i * k <= 0)
        {
            j = 0;
        }
        return j;
    }

    public int calculateDtToFit(int i, int j, int k, int l, int i1)
    {
        i1;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 38
    //                   0 49
    //                   1 44;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
_L2:
        i = k - i;
_L6:
        return i;
_L4:
        return l - j;
_L3:
        k -= i;
        i = k;
        if (k <= 0)
        {
            j = l - j;
            i = j;
            if (j >= 0)
            {
                return 0;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int calculateDxToMakeVisible(View view, int i)
    {
        RecyclerView.LayoutManager layoutmanager = getLayoutManager();
        if (!layoutmanager.canScrollHorizontally())
        {
            return 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return calculateDtToFit(layoutmanager.getDecoratedLeft(view) - layoutparams.leftMargin, layoutmanager.getDecoratedRight(view) + layoutparams.rightMargin, layoutmanager.getPaddingLeft(), layoutmanager.getWidth() - layoutmanager.getPaddingRight(), i);
        }
    }

    public int calculateDyToMakeVisible(View view, int i)
    {
        RecyclerView.LayoutManager layoutmanager = getLayoutManager();
        if (!layoutmanager.canScrollVertically())
        {
            return 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return calculateDtToFit(layoutmanager.getDecoratedTop(view) - layoutparams.topMargin, layoutmanager.getDecoratedBottom(view) + layoutparams.bottomMargin, layoutmanager.getPaddingTop(), layoutmanager.getHeight() - layoutmanager.getPaddingBottom(), i);
        }
    }

    protected float calculateSpeedPerPixel(DisplayMetrics displaymetrics)
    {
        return 25F / (float)displaymetrics.densityDpi;
    }

    protected int calculateTimeForDeceleration(int i)
    {
        return (int)Math.ceil((double)calculateTimeForScrolling(i) / 0.33560000000000001D);
    }

    protected int calculateTimeForScrolling(int i)
    {
        return (int)Math.ceil((float)Math.abs(i) * MILLISECONDS_PER_PX);
    }

    public abstract PointF computeScrollVectorForPosition(int i);

    protected int getHorizontalSnapPreference()
    {
        if (mTargetVector == null || mTargetVector.x == 0.0F)
        {
            return 0;
        }
        return mTargetVector.x <= 0.0F ? -1 : 1;
    }

    protected int getVerticalSnapPreference()
    {
        if (mTargetVector == null || mTargetVector.y == 0.0F)
        {
            return 0;
        }
        return mTargetVector.y <= 0.0F ? -1 : 1;
    }

    protected void onSeekTargetStep(int i, int j, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
    {
        if (getChildCount() == 0)
        {
            stop();
        } else
        {
            mInterimTargetDx = clampApplyScroll(mInterimTargetDx, i);
            mInterimTargetDy = clampApplyScroll(mInterimTargetDy, j);
            if (mInterimTargetDx == 0 && mInterimTargetDy == 0)
            {
                updateActionForInterimTarget(action);
                return;
            }
        }
    }

    protected void onStart()
    {
    }

    protected void onStop()
    {
        mInterimTargetDy = 0;
        mInterimTargetDx = 0;
        mTargetVector = null;
    }

    protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
    {
        int i = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int j = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int k = calculateTimeForDeceleration((int)Math.sqrt(i * i + j * j));
        if (k > 0)
        {
            action.update(-i, -j, k, mDecelerateInterpolator);
        }
    }

    protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action)
    {
        PointF pointf = computeScrollVectorForPosition(getTargetPosition());
        if (pointf == null || pointf.x == 0.0F && pointf.y == 0.0F)
        {
            Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
            int i = getTargetPosition();
            stop();
            instantScrollToPosition(i);
            return;
        } else
        {
            normalize(pointf);
            mTargetVector = pointf;
            mInterimTargetDx = (int)(pointf.x * 10000F);
            mInterimTargetDy = (int)(pointf.y * 10000F);
            int j = calculateTimeForScrolling(10000);
            action.update((int)((float)mInterimTargetDx * 1.2F), (int)((float)mInterimTargetDy * 1.2F), (int)((float)j * 1.2F), mLinearInterpolator);
            return;
        }
    }
}
