// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

abstract class AbsActionBarView extends ViewGroup
{
    protected class VisibilityAnimListener
        implements ViewPropertyAnimatorListener
    {

        private boolean mCanceled;
        int mFinalVisibility;
        final AbsActionBarView this$0;

        public void onAnimationCancel(View view)
        {
            mCanceled = true;
        }

        public void onAnimationEnd(View view)
        {
            if (!mCanceled)
            {
                mVisibilityAnim = null;
                setVisibility(mFinalVisibility);
                if (mSplitView != null && mMenuView != null)
                {
                    mMenuView.setVisibility(mFinalVisibility);
                    return;
                }
            }
        }

        public void onAnimationStart(View view)
        {
            setVisibility(0);
            mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
        {
            mVisibilityAnim = viewpropertyanimatorcompat;
            mFinalVisibility = i;
            return this;
        }

        protected VisibilityAnimListener()
        {
            this$0 = AbsActionBarView.this;
            super();
            mCanceled = false;
        }
    }


    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected boolean mSplitActionBar;
    protected ViewGroup mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    AbsActionBarView(Context context)
    {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mVisAnimListener = new VisibilityAnimListener();
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
        {
            mPopupContext = new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId);
            return;
        } else
        {
            mPopupContext = context;
            return;
        }
    }

    protected static int next(int i, int j, boolean flag)
    {
        if (flag)
        {
            return i - j;
        } else
        {
            return i + j;
        }
    }

    public void animateToVisibility(int i)
    {
        if (mVisibilityAnim != null)
        {
            mVisibilityAnim.cancel();
        }
        if (i == 0)
        {
            if (getVisibility() != 0)
            {
                ViewCompat.setAlpha(this, 0.0F);
                if (mSplitView != null && mMenuView != null)
                {
                    ViewCompat.setAlpha(mMenuView, 0.0F);
                }
            }
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(this).alpha(1.0F);
            viewpropertyanimatorcompat.setDuration(200L);
            viewpropertyanimatorcompat.setInterpolator(sAlphaInterpolator);
            if (mSplitView != null && mMenuView != null)
            {
                ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
                ViewPropertyAnimatorCompat viewpropertyanimatorcompat2 = ViewCompat.animate(mMenuView).alpha(1.0F);
                viewpropertyanimatorcompat2.setDuration(200L);
                viewpropertyanimatorcompatset.setListener(mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat, i));
                viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat).play(viewpropertyanimatorcompat2);
                viewpropertyanimatorcompatset.start();
                return;
            } else
            {
                viewpropertyanimatorcompat.setListener(mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat, i));
                viewpropertyanimatorcompat.start();
                return;
            }
        }
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = ViewCompat.animate(this).alpha(0.0F);
        viewpropertyanimatorcompat1.setDuration(200L);
        viewpropertyanimatorcompat1.setInterpolator(sAlphaInterpolator);
        if (mSplitView != null && mMenuView != null)
        {
            ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset1 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat3 = ViewCompat.animate(mMenuView).alpha(0.0F);
            viewpropertyanimatorcompat3.setDuration(200L);
            viewpropertyanimatorcompatset1.setListener(mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat1, i));
            viewpropertyanimatorcompatset1.play(viewpropertyanimatorcompat1).play(viewpropertyanimatorcompat3);
            viewpropertyanimatorcompatset1.start();
            return;
        } else
        {
            viewpropertyanimatorcompat1.setListener(mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat1, i));
            viewpropertyanimatorcompat1.start();
            return;
        }
    }

    public int getAnimatedVisibility()
    {
        if (mVisibilityAnim != null)
        {
            return mVisAnimListener.mFinalVisibility;
        } else
        {
            return getVisibility();
        }
    }

    public int getContentHeight()
    {
        return mContentHeight;
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
        setContentHeight(typedarray.getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0));
        typedarray.recycle();
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    protected int positionChild(View view, int i, int j, int k, boolean flag)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j += (k - i1) / 2;
        if (flag)
        {
            view.layout(i - l, j, i, j + i1);
        } else
        {
            view.layout(i, j, i + l, j + i1);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
        requestLayout();
    }

    public void setSplitToolbar(boolean flag)
    {
        mSplitActionBar = flag;
    }

    public void setSplitView(ViewGroup viewgroup)
    {
        mSplitView = viewgroup;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        mSplitWhenNarrow = flag;
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
