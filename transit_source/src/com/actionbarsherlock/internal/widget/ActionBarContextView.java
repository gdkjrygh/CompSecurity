// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.view.ActionMode;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, ActionBarContainer

public class ActionBarContextView extends AbsActionBarView
    implements com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener
{

    private static final int ANIMATE_IDLE = 0;
    private static final int ANIMATE_IN = 1;
    private static final int ANIMATE_OUT = 2;
    private boolean mAnimateInOnLayout;
    private int mAnimationMode;
    private NineLinearLayout mClose;
    private Animator mCurrentAnimation;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.actionbarsherlock.R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActionMode, i, 0);
        setBackgroundDrawable(context.getDrawable(2));
        mTitleStyleRes = context.getResourceId(0, 0);
        mSubtitleStyleRes = context.getResourceId(1, 0);
        mContentHeight = context.getLayoutDimension(4, 0);
        mSplitBackground = context.getDrawable(3);
        context.recycle();
    }

    private void finishAnimation()
    {
        Animator animator = mCurrentAnimation;
        if (animator != null)
        {
            mCurrentAnimation = null;
            animator.end();
        }
    }

    private void initTitle()
    {
label0:
        {
            byte byte1 = 8;
            if (mTitleLayout == null)
            {
                LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__action_bar_title_item, this);
                mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
                mTitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_title);
                mSubtitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_subtitle);
                if (mTitleStyleRes != 0)
                {
                    mTitleView.setTextAppearance(mContext, mTitleStyleRes);
                }
                if (mSubtitleStyleRes != 0)
                {
                    mSubtitleView.setTextAppearance(mContext, mSubtitleStyleRes);
                }
            }
            mTitleView.setText(mTitle);
            mSubtitleView.setText(mSubtitle);
            Object obj;
            byte byte0;
            boolean flag;
            int i;
            if (TextUtils.isEmpty(mTitle))
            {
                byte0 = 0;
            } else
            {
                byte0 = 1;
            }
            if (TextUtils.isEmpty(mSubtitle))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            obj = mSubtitleView;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            obj = mTitleLayout;
            if (byte0 == 0)
            {
                byte0 = byte1;
                if (!flag)
                {
                    break label0;
                }
            }
            byte0 = 0;
        }
        ((LinearLayout) (obj)).setVisibility(byte0);
        if (mTitleLayout.getParent() == null)
        {
            addView(mTitleLayout);
        }
    }

    private Animator makeInAnimation()
    {
        AnimatorSet animatorset;
        Object obj;
        mClose.setTranslationX(-mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin);
        obj = ObjectAnimator.ofFloat(mClose, "translationX", new float[] {
            0.0F
        });
        ((ObjectAnimator) (obj)).setDuration(200L);
        ((ObjectAnimator) (obj)).addListener(this);
        ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator());
        animatorset = new AnimatorSet();
        obj = animatorset.play(((Animator) (obj)));
        if (mMenuView == null) goto _L2; else goto _L1
_L1:
        int i = mMenuView.getChildCount();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        int j;
        j = i - 1;
        i = 0;
_L6:
        if (j >= 0) goto _L4; else goto _L2
_L2:
        return animatorset;
_L4:
        Object obj1 = AnimatorProxy.wrap(mMenuView.getChildAt(j));
        ((AnimatorProxy) (obj1)).setScaleY(0.0F);
        obj1 = ObjectAnimator.ofFloat(obj1, "scaleY", new float[] {
            0.0F, 1.0F
        });
        ((ObjectAnimator) (obj1)).setDuration(100L);
        ((ObjectAnimator) (obj1)).setStartDelay(i * 70);
        ((com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder) (obj)).with(((Animator) (obj1)));
        j--;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private Animator makeOutAnimation()
    {
        AnimatorSet animatorset;
        Object obj;
        obj = ObjectAnimator.ofFloat(mClose, "translationX", new float[] {
            (float)(-mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin)
        });
        ((ObjectAnimator) (obj)).setDuration(200L);
        ((ObjectAnimator) (obj)).addListener(this);
        ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator());
        animatorset = new AnimatorSet();
        obj = animatorset.play(((Animator) (obj)));
        if (mMenuView == null || mMenuView.getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < 0) goto _L3; else goto _L2
_L2:
        return animatorset;
_L3:
        Object obj1 = AnimatorProxy.wrap(mMenuView.getChildAt(i));
        ((AnimatorProxy) (obj1)).setScaleY(0.0F);
        obj1 = ObjectAnimator.ofFloat(obj1, "scaleY", new float[] {
            0.0F
        });
        ((ObjectAnimator) (obj1)).setDuration(100L);
        ((ObjectAnimator) (obj1)).setStartDelay(i * 70);
        ((com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder) (obj)).with(((Animator) (obj1)));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void closeMode()
    {
        if (mAnimationMode == 2)
        {
            return;
        }
        if (mClose == null)
        {
            killMode();
            return;
        } else
        {
            finishAnimation();
            mAnimationMode = 2;
            mCurrentAnimation = makeOutAnimation();
            mCurrentAnimation.start();
            return;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public CharSequence getSubtitle()
    {
        return mSubtitle;
    }

    public CharSequence getTitle()
    {
        return mTitle;
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

    public void initForMode(final ActionMode mode)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        if (mClose == null)
        {
            mClose = (NineLinearLayout)LayoutInflater.from(mContext).inflate(com.actionbarsherlock.R.layout.abs__action_mode_close_item, this, false);
            addView(mClose);
        } else
        if (mClose.getParent() == null)
        {
            addView(mClose);
        }
        mClose.findViewById(com.actionbarsherlock.R.id.abs__action_mode_close_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ActionBarContextView this$0;
            private final ActionMode val$mode;

            public void onClick(View view)
            {
                mode.finish();
            }

            
            {
                this$0 = ActionBarContextView.this;
                mode = actionmode;
                super();
            }
        });
        mode = (MenuBuilder)mode.getMenu();
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.dismissPopupMenus();
        }
        mActionMenuPresenter = new ActionMenuPresenter(mContext);
        mActionMenuPresenter.setReserveOverflow(true);
        layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!mSplitActionBar)
        {
            mode.addMenuPresenter(mActionMenuPresenter);
            mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            mMenuView.setBackgroundDrawable(null);
            addView(mMenuView, layoutparams);
        } else
        {
            mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
            mActionMenuPresenter.setItemLimit(0x7fffffff);
            layoutparams.width = -1;
            layoutparams.height = mContentHeight;
            mode.addMenuPresenter(mActionMenuPresenter);
            mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            mMenuView.setBackgroundDrawable(mSplitBackground);
            mSplitView.addView(mMenuView, layoutparams);
        }
        mAnimateInOnLayout = true;
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

    public void killMode()
    {
        finishAnimation();
        removeAllViews();
        if (mSplitView != null)
        {
            mSplitView.removeView(mMenuView);
        }
        mCustomView = null;
        mMenuView = null;
        mAnimateInOnLayout = false;
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (mAnimationMode == 2)
        {
            killMode();
        }
        mAnimationMode = 0;
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.hideOverflowMenu();
            mActionMenuPresenter.hideSubMenus();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            accessibilityevent.setClassName(getClass().getName());
            accessibilityevent.setPackageName(getContext().getPackageName());
            accessibilityevent.setContentDescription(mTitle);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = getPaddingLeft();
        int j1 = getPaddingTop();
        int k1 = l - j - getPaddingTop() - getPaddingBottom();
        j = i1;
        if (mClose != null)
        {
            j = i1;
            if (mClose.getVisibility() != 8)
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
                j = i1 + marginlayoutparams.leftMargin;
                l = j + positionChild(mClose, j, j1, k1) + marginlayoutparams.rightMargin;
                j = l;
                if (mAnimateInOnLayout)
                {
                    mAnimationMode = 1;
                    mCurrentAnimation = makeInAnimation();
                    mCurrentAnimation.start();
                    mAnimateInOnLayout = false;
                    j = l;
                }
            }
        }
        l = j;
        if (mTitleLayout != null)
        {
            l = j;
            if (mCustomView == null)
            {
                l = j + positionChild(mTitleLayout, j, j1, k1);
            }
        }
        if (mCustomView != null)
        {
            positionChild(mCustomView, l, j1, k1);
        }
        i = k - i - getPaddingRight();
        if (mMenuView != null)
        {
            positionChildInverse(mMenuView, i, j1, k1);
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int l1 = android.view.View.MeasureSpec.getSize(i);
        int k;
        int l;
        int k1;
        int i2;
        if (mContentHeight > 0)
        {
            k = mContentHeight;
        } else
        {
            k = android.view.View.MeasureSpec.getSize(j);
        }
        i2 = getPaddingTop() + getPaddingBottom();
        j = l1 - getPaddingLeft() - getPaddingRight();
        k1 = k - i2;
        l = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x80000000);
        i = j;
        if (mClose != null)
        {
            i = measureChildView(mClose, j, l, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
            i -= marginlayoutparams.leftMargin + marginlayoutparams.rightMargin;
        }
        j = i;
        if (mMenuView != null)
        {
            j = i;
            if (mMenuView.getParent() == this)
            {
                j = measureChildView(mMenuView, i, l, 0);
            }
        }
        i = j;
        if (mTitleLayout != null)
        {
            i = j;
            if (mCustomView == null)
            {
                i = measureChildView(mTitleLayout, j, l, 0);
            }
        }
        if (mCustomView != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = mCustomView.getLayoutParams();
            int i1;
            if (layoutparams.width != -2)
            {
                j = 0x40000000;
            } else
            {
                j = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                i = Math.min(layoutparams.width, i);
            }
            if (layoutparams.height != -2)
            {
                i1 = 0x40000000;
            } else
            {
                i1 = 0x80000000;
            }
            if (layoutparams.height >= 0)
            {
                k1 = Math.min(layoutparams.height, k1);
            }
            mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, j), android.view.View.MeasureSpec.makeMeasureSpec(k1, i1));
        }
        if (mContentHeight <= 0)
        {
            j = 0;
            k1 = getChildCount();
            i = 0;
            do
            {
                if (i >= k1)
                {
                    setMeasuredDimension(l1, j);
                    return;
                }
                int j1 = getChildAt(i).getMeasuredHeight() + i2;
                k = j;
                if (j1 > j)
                {
                    k = j1;
                }
                i++;
                j = k;
            } while (true);
        } else
        {
            setMeasuredDimension(l1, k);
            return;
        }
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
    }

    public void setCustomView(View view)
    {
        if (mCustomView != null)
        {
            removeView(mCustomView);
        }
        mCustomView = view;
        if (mTitleLayout != null)
        {
            removeView(mTitleLayout);
            mTitleLayout = null;
        }
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        if (mSplitActionBar != flag)
        {
            if (mActionMenuPresenter != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
                if (!flag)
                {
                    mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
                    mMenuView.setBackgroundDrawable(null);
                    ViewGroup viewgroup = (ViewGroup)mMenuView.getParent();
                    if (viewgroup != null)
                    {
                        viewgroup.removeView(mMenuView);
                    }
                    addView(mMenuView, layoutparams);
                } else
                {
                    mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    mActionMenuPresenter.setItemLimit(0x7fffffff);
                    layoutparams.width = -1;
                    layoutparams.height = mContentHeight;
                    mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
                    mMenuView.setBackgroundDrawable(mSplitBackground);
                    ViewGroup viewgroup1 = (ViewGroup)mMenuView.getParent();
                    if (viewgroup1 != null)
                    {
                        viewgroup1.removeView(mMenuView);
                    }
                    mSplitView.addView(mMenuView, layoutparams);
                }
            }
            super.setSplitActionBar(flag);
        }
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mSubtitle = charsequence;
        initTitle();
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        initTitle();
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
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
