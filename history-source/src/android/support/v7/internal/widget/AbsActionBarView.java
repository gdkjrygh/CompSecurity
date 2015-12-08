// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer

abstract class AbsActionBarView extends ViewGroup
{

    private static final int FADE_DURATION = 200;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected boolean mSplitActionBar;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;

    AbsActionBarView(Context context)
    {
        super(context);
    }

    AbsActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    AbsActionBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void animateToVisibility(int i)
    {
        clearAnimation();
        if (i != getVisibility())
        {
            Object obj = getContext();
            int j;
            if (i == 0)
            {
                j = android.support.v7.appcompat.R.anim.abc_fade_in;
            } else
            {
                j = android.support.v7.appcompat.R.anim.abc_fade_out;
            }
            obj = AnimationUtils.loadAnimation(((Context) (obj)), j);
            startAnimation(((android.view.animation.Animation) (obj)));
            setVisibility(i);
            if (mSplitView != null && mMenuView != null)
            {
                mMenuView.startAnimation(((android.view.animation.Animation) (obj)));
                mMenuView.setVisibility(i);
            }
        }
    }

    public void dismissPopupMenus()
    {
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.dismissPopupMenus();
        }
    }

    public int getAnimatedVisibility()
    {
        return getVisibility();
    }

    public int getContentHeight()
    {
        return mContentHeight;
    }

    public boolean hideOverflowMenu()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.hideOverflowMenu();
        } else
        {
            return false;
        }
    }

    public boolean isOverflowMenuShowing()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.isOverflowMenuShowing();
        } else
        {
            return false;
        }
    }

    public boolean isOverflowReserved()
    {
        return mActionMenuPresenter != null && mActionMenuPresenter.isOverflowReserved();
    }

    protected int measureChildView(View view, int i, int j, int k)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth() - k);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(0, 0));
        typedarray.recycle();
        if (mSplitWhenNarrow)
        {
            setSplitActionBar(getContext().getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_split_action_bar_is_narrow));
        }
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    protected int positionChild(View view, int i, int j, int k)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j += (k - i1) / 2;
        view.layout(i, j, i + l, j + i1);
        return l;
    }

    protected int positionChildInverse(View view, int i, int j, int k)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j += (k - i1) / 2;
        view.layout(i - l, j, i, j + i1);
        return l;
    }

    public void postShowOverflowMenu()
    {
        post(new Runnable() {

            final AbsActionBarView this$0;

            public void run()
            {
                showOverflowMenu();
            }

            
            {
                this$0 = AbsActionBarView.this;
                super();
            }
        });
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        mSplitActionBar = flag;
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
        mSplitView = actionbarcontainer;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        mSplitWhenNarrow = flag;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            super.setVisibility(i);
        }
    }

    public boolean showOverflowMenu()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.showOverflowMenu();
        } else
        {
            return false;
        }
    }
}
