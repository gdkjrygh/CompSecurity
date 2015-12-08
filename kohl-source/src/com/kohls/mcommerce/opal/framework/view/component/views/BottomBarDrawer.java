// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.component.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.component.views.iface.BottomBarDrawerListener;

public class BottomBarDrawer extends ViewGroup
{

    private static final int ANIM_DURATION = 500;
    private int mChangeHeightBy;
    private int mDrawerAnimDownOffset;
    private int mDrawerAnimUpOffset;
    private int mDrawerCollapsedHeight;
    private int mDrawerExpandedHeight;
    private int mDrawerHeight;
    private View mDrawerView;
    private float mFirstTouchDownY;
    private boolean mHideDrawer;
    private boolean mIsDrawerAnimating;
    private boolean mIsDrawerCollapsed;
    private boolean mIsDrawerMoving;
    private boolean mIsDrawerMovingUp;
    private boolean mIsTouchStarted;
    private int mLastY;
    private BottomBarDrawerListener mListener;
    private int mOffsetY;

    public BottomBarDrawer(Context context)
    {
        super(context, null, 0);
        mIsDrawerCollapsed = true;
        mIsDrawerAnimating = false;
    }

    public BottomBarDrawer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BottomBarDrawer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mIsDrawerCollapsed = true;
        mIsDrawerAnimating = false;
        mDrawerHeight = context.obtainStyledAttributes(attributeset, com.kohls.mcommerce.opal.R.styleable.BottomBarDrawer, i, 0).getDimensionPixelSize(0, -1);
        mDrawerCollapsedHeight = mDrawerHeight;
        mOffsetY = (int)UtilityMethods.convertDpToPixel(10F, getContext());
    }

    private int getChangedHeight()
    {
        return getExpandedHeightofDrawer() / 12;
    }

    private void moveDrawer(int i)
    {
        if (mLastY == 0)
        {
            mLastY = i;
        }
        int j;
        if (mIsDrawerMovingUp)
        {
            j = mDrawerHeight + (mLastY - i);
        } else
        {
            j = mDrawerHeight - (i - mLastY);
        }
        if (mDrawerView != null)
        {
            mLastY = i;
            if (j < mDrawerCollapsedHeight)
            {
                mDrawerHeight = mDrawerCollapsedHeight;
            } else
            if (j > getExpandedHeightofDrawer())
            {
                mDrawerHeight = getExpandedHeightofDrawer();
            } else
            {
                mDrawerHeight = j;
            }
            mDrawerView.requestLayout();
            if (mListener != null)
            {
                mListener.onMoving(mDrawerHeight);
            }
        }
    }

    private void setDrawerClickListener()
    {
        if (mDrawerView != null)
        {
            mDrawerView.setOnClickListener(new _cls1());
        }
    }

    private void setDrawerTouchListener()
    {
        if (mDrawerView != null)
        {
            mDrawerView.setOnTouchListener(new _cls2());
        }
    }

    private void startCollapseAnimation()
    {
        _cls5 _lcls5 = new _cls5();
        if (mDrawerView != null)
        {
            _lcls5.setDuration(500L);
            mDrawerView.startAnimation(_lcls5);
            _lcls5.setAnimationListener(new _cls6());
        }
    }

    private void startExpandingAnimation()
    {
        _cls3 _lcls3 = new _cls3();
        if (mDrawerView != null)
        {
            _lcls3.setDuration(500L);
            mDrawerView.startAnimation(_lcls3);
            _lcls3.setAnimationListener(new _cls4());
        }
    }

    private void toggleDrawerAnimation()
    {
label0:
        {
            if (!mIsDrawerAnimating)
            {
                if (!mIsDrawerCollapsed)
                {
                    break label0;
                }
                startExpandingAnimation();
            }
            return;
        }
        startCollapseAnimation();
    }

    public void collapse()
    {
        if (!mIsDrawerCollapsed)
        {
            startCollapseAnimation();
        }
    }

    public void expand()
    {
        if (mIsDrawerCollapsed)
        {
            startExpandingAnimation();
        }
    }

    public int getCollapsedHeightofDrawer()
    {
        return mDrawerCollapsedHeight;
    }

    public int getExpandedHeightofDrawer()
    {
        if (mDrawerExpandedHeight == 0)
        {
            return getMeasuredHeight();
        } else
        {
            return mDrawerExpandedHeight;
        }
    }

    public void hide()
    {
        if (mDrawerView != null)
        {
            mIsDrawerCollapsed = true;
            mDrawerView.setVisibility(8);
            requestLayout();
            if (mListener != null)
            {
                mListener.onHidden();
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        k = getChildCount();
        if (k == 2)
        {
            i = 0;
            while (i < k) 
            {
                View view = getChildAt(i);
                if (i == 1)
                {
                    mDrawerView = view;
                }
                if (view.getVisibility() != 8)
                {
                    j = getPaddingTop();
                    if (i == 1)
                    {
                        j = getMeasuredHeight() - getPaddingBottom() - view.getMeasuredHeight();
                        if (mDrawerAnimUpOffset == 0)
                        {
                            mDrawerAnimUpOffset = mDrawerCollapsedHeight;
                        }
                        if (mDrawerAnimDownOffset == 0)
                        {
                            mDrawerAnimDownOffset = getExpandedHeightofDrawer();
                        }
                        setDrawerTouchListener();
                        setDrawerClickListener();
                    }
                    l = getPaddingLeft();
                    int i1 = view.getMeasuredHeight();
                    view.layout(l, j, l + view.getMeasuredWidth(), j + i1);
                }
                i++;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        i1 = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getSize(j);
        j1 = getChildCount();
        if (j1 != 2)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        k = 0;
_L2:
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = getChildAt(k);
        if (view.getVisibility() != 8)
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            if (layoutparams.width == -2)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
            } else
            if (layoutparams.width == -1)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
            }
            j = layoutparams.height;
            if (k == 1)
            {
                j = mDrawerHeight;
            } else
            {
                j = l;
            }
            if (layoutparams.height == -2)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
            } else
            if (layoutparams.height == -1)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            } else
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            }
            view.measure(i, j);
        }
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        setMeasuredDimension(i1, l);
          goto _L3
    }

    public void setDrawerListener(BottomBarDrawerListener bottombardrawerlistener)
    {
        mListener = bottombardrawerlistener;
    }

    public void setExpandedHeightOfDrawer(int i)
    {
        mDrawerExpandedHeight = i;
    }

    public void show()
    {
        if (mDrawerView != null)
        {
            mDrawerView.setVisibility(0);
            requestLayout();
            if (!mIsDrawerCollapsed)
            {
                startCollapseAnimation();
            }
        }
    }





/*
    static boolean access$102(BottomBarDrawer bottombardrawer, boolean flag)
    {
        bottombardrawer.mIsTouchStarted = flag;
        return flag;
    }

*/





/*
    static int access$1302(BottomBarDrawer bottombardrawer, int i)
    {
        bottombardrawer.mChangeHeightBy = i;
        return i;
    }

*/






/*
    static boolean access$1802(BottomBarDrawer bottombardrawer, boolean flag)
    {
        bottombardrawer.mIsDrawerAnimating = flag;
        return flag;
    }

*/


/*
    static boolean access$1902(BottomBarDrawer bottombardrawer, boolean flag)
    {
        bottombardrawer.mIsDrawerCollapsed = flag;
        return flag;
    }

*/



/*
    static float access$202(BottomBarDrawer bottombardrawer, float f)
    {
        bottombardrawer.mFirstTouchDownY = f;
        return f;
    }

*/



/*
    static boolean access$302(BottomBarDrawer bottombardrawer, boolean flag)
    {
        bottombardrawer.mIsDrawerMoving = flag;
        return flag;
    }

*/


/*
    static int access$402(BottomBarDrawer bottombardrawer, int i)
    {
        bottombardrawer.mLastY = i;
        return i;
    }

*/




/*
    static boolean access$602(BottomBarDrawer bottombardrawer, boolean flag)
    {
        bottombardrawer.mIsDrawerMovingUp = flag;
        return flag;
    }

*/




/*
    static int access$802(BottomBarDrawer bottombardrawer, int i)
    {
        bottombardrawer.mDrawerHeight = i;
        return i;
    }

*/


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
