// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarContainer

public abstract class AbsActionBarView extends NineViewGroup
{
    protected class VisibilityAnimListener
        implements com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener
    {

        private boolean mCanceled;
        int mFinalVisibility;
        final AbsActionBarView this$0;

        public void onAnimationCancel(Animator animator)
        {
            mCanceled = true;
        }

        public void onAnimationEnd(Animator animator)
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

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            setVisibility(0);
            mVisibilityAnim = animator;
            mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(int i)
        {
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
    final Context mContext;
    protected ActionMenuView mMenuView;
    protected boolean mSplitActionBar;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected Animator mVisibilityAnim;

    public AbsActionBarView(Context context)
    {
        super(context);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
    }

    public AbsActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
    }

    public AbsActionBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
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
                setAlpha(0.0F);
                if (mSplitView != null && mMenuView != null)
                {
                    mMenuView.setAlpha(0.0F);
                }
            }
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                1.0F
            });
            objectanimator.setDuration(200L);
            objectanimator.setInterpolator(sAlphaInterpolator);
            if (mSplitView != null && mMenuView != null)
            {
                AnimatorSet animatorset = new AnimatorSet();
                ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mMenuView, "alpha", new float[] {
                    1.0F
                });
                objectanimator2.setDuration(200L);
                animatorset.addListener(mVisAnimListener.withFinalVisibility(i));
                animatorset.play(objectanimator).with(objectanimator2);
                animatorset.start();
                return;
            } else
            {
                objectanimator.addListener(mVisAnimListener.withFinalVisibility(i));
                objectanimator.start();
                return;
            }
        }
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
            0.0F
        });
        objectanimator1.setDuration(200L);
        objectanimator1.setInterpolator(sAlphaInterpolator);
        if (mSplitView != null && mMenuView != null)
        {
            AnimatorSet animatorset1 = new AnimatorSet();
            ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mMenuView, "alpha", new float[] {
                0.0F
            });
            objectanimator3.setDuration(200L);
            animatorset1.addListener(mVisAnimListener.withFinalVisibility(i));
            animatorset1.play(objectanimator1).with(objectanimator3);
            animatorset1.start();
            return;
        } else
        {
            objectanimator1.addListener(mVisAnimListener.withFinalVisibility(i));
            objectanimator1.start();
            return;
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

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L2; else goto _L1
_L1:
        super.onConfigurationChanged(configuration);
_L4:
        TypedArray typedarray = getContext().obtainStyledAttributes(null, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(4, 0));
        typedarray.recycle();
        if (mSplitWhenNarrow)
        {
            setSplitActionBar(ResourcesCompat.getResources_getBoolean(getContext(), com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow));
        }
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.onConfigurationChanged(configuration);
        }
        return;
_L2:
        if (mMenuView != null)
        {
            mMenuView.onConfigurationChanged(configuration);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        if (mVisibilityAnim != null)
        {
            mVisibilityAnim.end();
        }
        super.setVisibility(i);
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
