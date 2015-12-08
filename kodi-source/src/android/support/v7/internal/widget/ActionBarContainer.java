// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.VersionUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarBackgroundDrawableV21, ActionBarBackgroundDrawable, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    private View mActionBarView;
    Drawable mBackground;
    private View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    Drawable mSplitBackground;
    Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        boolean flag;
        flag = true;
        super(context, attributeset);
        Object obj;
        if (VersionUtils.isAtLeastL())
        {
            obj = new ActionBarBackgroundDrawableV21(this);
        } else
        {
            obj = new ActionBarBackgroundDrawable(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar);
        mBackground = context.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_background);
        mStackedBackground = context.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundStacked);
        mHeight = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_height, -1);
        if (getId() == android.support.v7.appcompat.R.id.split_action_bar)
        {
            mIsSplit = true;
            mSplitBackground = context.getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundSplit);
        }
        context.recycle();
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        return;
_L2:
        if (mBackground != null || mStackedBackground != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getMeasuredHeightWithMargins(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
    }

    private boolean isCollapsed(View view)
    {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mBackground != null && mBackground.isStateful())
        {
            mBackground.setState(getDrawableState());
        }
        if (mStackedBackground != null && mStackedBackground.isStateful())
        {
            mStackedBackground.setState(getDrawableState());
        }
        if (mSplitBackground != null && mSplitBackground.isStateful())
        {
            mSplitBackground.setState(getDrawableState());
        }
    }

    public View getTabContainer()
    {
        return mTabContainer;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (mBackground != null)
            {
                mBackground.jumpToCurrentState();
            }
            if (mStackedBackground != null)
            {
                mStackedBackground.jumpToCurrentState();
            }
            if (mSplitBackground != null)
            {
                mSplitBackground.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mActionBarView = findViewById(android.support.v7.appcompat.R.id.action_bar);
        mContextView = findViewById(android.support.v7.appcompat.R.id.action_context_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return mIsTransitioning || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view;
        super.onLayout(flag, i, j, k, l);
        view = mTabContainer;
        if (view != null && view.getVisibility() != 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (view != null && view.getVisibility() != 8)
        {
            j = getMeasuredHeight();
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
            view.layout(i, j - view.getMeasuredHeight() - layoutparams.bottomMargin, k, j - layoutparams.bottomMargin);
        }
        j = 0;
        i = 0;
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i = 1;
        }
_L4:
        if (i != 0)
        {
            invalidate();
        }
        return;
_L2:
        if (mBackground != null)
        {
            if (mActionBarView.getVisibility() == 0)
            {
                mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
            } else
            if (mContextView != null && mContextView.getVisibility() == 0)
            {
                mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
            } else
            {
                mBackground.setBounds(0, 0, 0, 0);
            }
            j = 1;
        }
        mIsStacked = flag;
        i = j;
        if (flag)
        {
            i = j;
            if (mStackedBackground != null)
            {
                mStackedBackground.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                i = 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onMeasure(int i, int j)
    {
        int k = j;
        if (mActionBarView == null)
        {
            k = j;
            if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
            {
                k = j;
                if (mHeight >= 0)
                {
                    k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mHeight, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
                }
            }
        }
        super.onMeasure(i, k);
        if (mActionBarView != null)
        {
            j = android.view.View.MeasureSpec.getMode(k);
            if (mTabContainer != null && mTabContainer.getVisibility() != 8 && j != 0x40000000)
            {
                if (!isCollapsed(mActionBarView))
                {
                    i = getMeasuredHeightWithMargins(mActionBarView);
                } else
                if (!isCollapsed(mContextView))
                {
                    i = getMeasuredHeightWithMargins(mContextView);
                } else
                {
                    i = 0;
                }
                if (j == 0x80000000)
                {
                    j = android.view.View.MeasureSpec.getSize(k);
                } else
                {
                    j = 0x7fffffff;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeightWithMargins(mTabContainer) + i, j));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (mBackground != null)
        {
            mBackground.setCallback(null);
            unscheduleDrawable(mBackground);
        }
        mBackground = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (mActionBarView != null)
            {
                mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
            }
        }
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (mBackground != null || mStackedBackground != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSplitBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (mSplitBackground != null)
        {
            mSplitBackground.setCallback(null);
            unscheduleDrawable(mSplitBackground);
        }
        mSplitBackground = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (mIsSplit && mSplitBackground != null)
            {
                mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (mBackground != null || mStackedBackground != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setStackedBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (mStackedBackground != null)
        {
            mStackedBackground.setCallback(null);
            unscheduleDrawable(mStackedBackground);
        }
        mStackedBackground = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (mIsStacked && mStackedBackground != null)
            {
                mStackedBackground.setBounds(mTabContainer.getLeft(), mTabContainer.getTop(), mTabContainer.getRight(), mTabContainer.getBottom());
            }
        }
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (mBackground != null || mStackedBackground != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (mTabContainer != null)
        {
            removeView(mTabContainer);
        }
        mTabContainer = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null)
        {
            addView(scrollingtabcontainerview);
            android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            scrollingtabcontainerview.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean flag)
    {
        mIsTransitioning = flag;
        int i;
        if (flag)
        {
            i = 0x60000;
        } else
        {
            i = 0x40000;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mBackground != null)
        {
            mBackground.setVisible(flag, false);
        }
        if (mStackedBackground != null)
        {
            mStackedBackground.setVisible(flag, false);
        }
        if (mSplitBackground != null)
        {
            mSplitBackground.setVisible(flag, false);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == mBackground && !mIsSplit || drawable == mStackedBackground && mIsStacked || drawable == mSplitBackground && mIsSplit || super.verifyDrawable(drawable);
    }
}
