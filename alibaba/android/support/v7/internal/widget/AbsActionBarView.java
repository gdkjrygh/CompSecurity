// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
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
import ds;
import ei;
import em;

abstract class AbsActionBarView extends ViewGroup
{
    public class VisibilityAnimListener
        implements em
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

        public VisibilityAnimListener withFinalVisibility(ei ei1, int i)
        {
            mVisibilityAnim = ei1;
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


    private static final int FADE_DURATION = 200;
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected boolean mSplitActionBar;
    protected ViewGroup mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ei mVisibilityAnim;

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
            mVisibilityAnim.a();
        }
        if (i == 0)
        {
            if (getVisibility() != 0)
            {
                ds.c(this, 0.0F);
                if (mSplitView != null && mMenuView != null)
                {
                    ds.c(mMenuView, 0.0F);
                }
            }
            ei ei1 = ds.s(this).a(1.0F);
            ei1.a(200L);
            ei1.a(sAlphaInterpolator);
            if (mSplitView != null && mMenuView != null)
            {
                ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
                ei ei3 = ds.s(mMenuView).a(1.0F);
                ei3.a(200L);
                viewpropertyanimatorcompatset.setListener(mVisAnimListener.withFinalVisibility(ei1, i));
                viewpropertyanimatorcompatset.play(ei1).play(ei3);
                viewpropertyanimatorcompatset.start();
                return;
            } else
            {
                ei1.a(mVisAnimListener.withFinalVisibility(ei1, i));
                ei1.b();
                return;
            }
        }
        ei ei2 = ds.s(this).a(0.0F);
        ei2.a(200L);
        ei2.a(sAlphaInterpolator);
        if (mSplitView != null && mMenuView != null)
        {
            ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset1 = new ViewPropertyAnimatorCompatSet();
            ei ei4 = ds.s(mMenuView).a(0.0F);
            ei4.a(200L);
            viewpropertyanimatorcompatset1.setListener(mVisAnimListener.withFinalVisibility(ei2, i));
            viewpropertyanimatorcompatset1.play(ei2).play(ei4);
            viewpropertyanimatorcompatset1.start();
            return;
        } else
        {
            ei2.a(mVisAnimListener.withFinalVisibility(ei2, i));
            ei2.b();
            return;
        }
    }

    public boolean canShowOverflowMenu()
    {
        return isOverflowReserved() && getVisibility() == 0;
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

    public boolean isOverflowMenuShowPending()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.isOverflowMenuShowPending();
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
        j = (k - i1) / 2 + j;
        if (flag)
        {
            view.layout(i - l, j, i, i1 + j);
        } else
        {
            view.layout(i, j, i + l, i1 + j);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
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
