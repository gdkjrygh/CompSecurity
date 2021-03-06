// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarBackgroundDrawableV21, ActionBarBackgroundDrawable, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    public View mActionBarView;
    public Drawable mBackground;
    private View mContextView;
    private int mHeight;
    public boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    public Drawable mSplitBackground;
    public Drawable mStackedBackground;
    View mTabContainer;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        boolean flag1;
        flag1 = true;
        super(context, attributeset);
        Object obj;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new ActionBarBackgroundDrawableV21(this);
        } else
        {
            obj = new ActionBarBackgroundDrawable(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar);
        mBackground = context.getDrawable(10);
        mStackedBackground = context.getDrawable(11);
        mHeight = context.getDimensionPixelSize(0, -1);
        if (getId() == 0x7f0d0065)
        {
            mIsSplit = true;
            mSplitBackground = context.getDrawable(12);
        }
        context.recycle();
        if (!mIsSplit) goto _L2; else goto _L1
_L1:
        if (mSplitBackground != null)
        {
            flag1 = false;
        }
_L4:
        setWillNotDraw(flag1);
        return;
_L2:
        if (mBackground != null || mStackedBackground != null)
        {
            flag1 = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int getMeasuredHeightWithMargins(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
    }

    private static boolean isCollapsed(View view)
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
        mActionBarView = findViewById(0x7f0d00cb);
        mContextView = findViewById(0x7f0d00cc);
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

    public final void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (mTabContainer != null)
        {
            removeView(mTabContainer);
        }
        mTabContainer = null;
    }

    public final void setTransitioning(boolean flag)
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
