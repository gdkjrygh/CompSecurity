// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, TintTypedArray, ViewUtils

public class ActionBarContextView extends AbsActionBarView
    implements ViewPropertyAnimatorListener
{

    private boolean mAnimateInOnLayout;
    public int mAnimationMode;
    public View mClose;
    private int mCloseItemLayout;
    public ViewPropertyAnimatorCompatSet mCurrentAnimation;
    private View mCustomView;
    private Drawable mSplitBackground;
    public CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    public CharSequence mTitle;
    private LinearLayout mTitleLayout;
    public boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010106);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes$1a6c1917(context, attributeset, android.support.v7.appcompat.R.styleable.ActionMode, i);
        setBackgroundDrawable(context.getDrawable(3));
        mTitleStyleRes = context.getResourceId(1, 0);
        mSubtitleStyleRes = context.getResourceId(2, 0);
        mContentHeight = context.getLayoutDimension(0, 0);
        mSplitBackground = context.getDrawable(4);
        mCloseItemLayout = context.getResourceId(5, 0x7f040006);
        ((TintTypedArray) (context)).mWrapped.recycle();
    }

    private void initTitle()
    {
label0:
        {
            byte byte1 = 8;
            if (mTitleLayout == null)
            {
                LayoutInflater.from(getContext()).inflate(0x7f040000, this);
                mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
                mTitleView = (TextView)mTitleLayout.findViewById(0x7f0d00b1);
                mSubtitleView = (TextView)mTitleLayout.findViewById(0x7f0d00b2);
                if (mTitleStyleRes != 0)
                {
                    mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
                }
                if (mSubtitleStyleRes != 0)
                {
                    mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
                }
            }
            mTitleView.setText(mTitle);
            mSubtitleView.setText(mSubtitle);
            Object obj;
            byte byte0;
            boolean flag;
            int i;
            if (!TextUtils.isEmpty(mTitle))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (!TextUtils.isEmpty(mSubtitle))
            {
                flag = true;
            } else
            {
                flag = false;
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

    public final volatile void animateToVisibility(int i)
    {
        super.animateToVisibility(i);
    }

    public final void finishAnimation()
    {
        ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentAnimation;
        if (viewpropertyanimatorcompatset != null)
        {
            mCurrentAnimation = null;
            viewpropertyanimatorcompatset.cancel();
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

    public final void initForMode(final ActionMode mode)
    {
        if (mClose != null) goto _L2; else goto _L1
_L1:
        mClose = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, this, false);
        addView(mClose);
_L4:
        mClose.findViewById(0x7f0d00b3).setOnClickListener(new android.view.View.OnClickListener() {

            final ActionBarContextView this$0;
            final ActionMode val$mode;

            public final void onClick(View view)
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
        mActionMenuPresenter = new ActionMenuPresenter(getContext());
        mActionMenuPresenter.setReserveOverflow$1385ff();
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        mode.addMenuPresenter(mActionMenuPresenter, mPopupContext);
        mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
        mMenuView.setBackgroundDrawable(null);
        addView(mMenuView, layoutparams);
        mAnimateInOnLayout = true;
        return;
_L2:
        if (mClose.getParent() == null)
        {
            addView(mClose);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void killMode()
    {
        finishAnimation();
        removeAllViews();
        mCustomView = null;
        mMenuView = null;
        mAnimateInOnLayout = false;
    }

    public final ViewPropertyAnimatorCompatSet makeOutAnimation()
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(mClose).translationX(-mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin);
        viewpropertyanimatorcompat.setDuration(200L);
        viewpropertyanimatorcompat.setListener(this);
        viewpropertyanimatorcompat.setInterpolator(new DecelerateInterpolator());
        ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
        viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
        if (mMenuView != null)
        {
            mMenuView.getChildCount();
        }
        return viewpropertyanimatorcompatset;
    }

    public final void onAnimationCancel(View view)
    {
    }

    public final void onAnimationEnd(View view)
    {
        if (mAnimationMode == 2)
        {
            killMode();
        }
        mAnimationMode = 0;
    }

    public final void onAnimationStart(View view)
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
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (accessibilityevent.getEventType() != 32)
                {
                    break label0;
                }
                accessibilityevent.setSource(this);
                accessibilityevent.setClassName(getClass().getName());
                accessibilityevent.setPackageName(getContext().getPackageName());
                accessibilityevent.setContentDescription(mTitle);
            }
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        flag = ViewUtils.isLayoutRtl(this);
        int i1;
        int j1;
        int k1;
        if (flag)
        {
            i1 = k - i - getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        j1 = getPaddingTop();
        k1 = l - j - getPaddingTop() - getPaddingBottom();
        j = i1;
        if (mClose != null)
        {
            j = i1;
            if (mClose.getVisibility() != 8)
            {
                Object obj = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
                if (flag)
                {
                    j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                } else
                {
                    j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                if (flag)
                {
                    l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                } else
                {
                    l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                }
                j = next(i1, j, flag);
                l = next(positionChild(mClose, j, j1, k1, flag) + j, l, flag);
                j = l;
                if (mAnimateInOnLayout)
                {
                    mAnimationMode = 1;
                    ViewCompat.setTranslationX(mClose, -mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin);
                    ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(mClose).translationX(0.0F);
                    viewpropertyanimatorcompat.setDuration(200L);
                    viewpropertyanimatorcompat.setListener(this);
                    viewpropertyanimatorcompat.setInterpolator(new DecelerateInterpolator());
                    obj = new ViewPropertyAnimatorCompatSet();
                    ((ViewPropertyAnimatorCompatSet) (obj)).play(viewpropertyanimatorcompat);
                    if (mMenuView != null)
                    {
                        j = mMenuView.getChildCount();
                        if (j > 0)
                        {
                            for (j--; j >= 0; j--)
                            {
                                Object obj1 = mMenuView.getChildAt(j);
                                ViewCompat.setScaleY(((View) (obj1)), 0.0F);
                                obj1 = ViewCompat.animate(((View) (obj1)));
                                View view = (View)((ViewPropertyAnimatorCompat) (obj1)).mView.get();
                                if (view != null)
                                {
                                    ViewPropertyAnimatorCompat.IMPL.scaleY(((ViewPropertyAnimatorCompat) (obj1)), view, 1.0F);
                                }
                                ((ViewPropertyAnimatorCompat) (obj1)).setDuration(300L);
                                ((ViewPropertyAnimatorCompatSet) (obj)).play(((ViewPropertyAnimatorCompat) (obj1)));
                            }

                        }
                    }
                    mCurrentAnimation = ((ViewPropertyAnimatorCompatSet) (obj));
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
                l = j;
                if (mTitleLayout.getVisibility() != 8)
                {
                    l = j + positionChild(mTitleLayout, j, j1, k1, flag);
                }
            }
        }
        if (mCustomView != null)
        {
            positionChild(mCustomView, l, j1, k1, flag);
        }
        if (flag)
        {
            i = getPaddingLeft();
        } else
        {
            i = k - i - getPaddingRight();
        }
        if (mMenuView != null)
        {
            ActionMenuView actionmenuview = mMenuView;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            positionChild(actionmenuview, i, j1, k1, flag);
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with android:layout_height=\"wrap_content\"").toString());
        }
        int j1 = android.view.View.MeasureSpec.getSize(i);
        int k;
        int l;
        int i1;
        int k1;
        if (mContentHeight > 0)
        {
            k = mContentHeight;
        } else
        {
            k = android.view.View.MeasureSpec.getSize(j);
        }
        k1 = getPaddingTop() + getPaddingBottom();
        i = j1 - getPaddingLeft() - getPaddingRight();
        i1 = k - k1;
        l = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
        j = i;
        if (mClose != null)
        {
            i = measureChildView$1bb94239(mClose, i, l);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
            j = i - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
        }
        i = j;
        if (mMenuView != null)
        {
            i = j;
            if (mMenuView.getParent() == this)
            {
                i = measureChildView$1bb94239(mMenuView, j, l);
            }
        }
        j = i;
        if (mTitleLayout != null)
        {
            j = i;
            if (mCustomView == null)
            {
                if (mTitleOptional)
                {
                    j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    mTitleLayout.measure(j, l);
                    int l1 = mTitleLayout.getMeasuredWidth();
                    Object obj;
                    if (l1 <= i)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    j = i;
                    if (l != 0)
                    {
                        j = i - l1;
                    }
                    obj = mTitleLayout;
                    if (l != 0)
                    {
                        i = 0;
                    } else
                    {
                        i = 8;
                    }
                    ((LinearLayout) (obj)).setVisibility(i);
                } else
                {
                    j = measureChildView$1bb94239(mTitleLayout, i, l);
                }
            }
        }
        if (mCustomView != null)
        {
            obj = mCustomView.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
            {
                i = 0x40000000;
            } else
            {
                i = 0x80000000;
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
            {
                j = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j);
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
            {
                l = 0x40000000;
            } else
            {
                l = 0x80000000;
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
            {
                i1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, i1);
            }
            mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, i), android.view.View.MeasureSpec.makeMeasureSpec(i1, l));
        }
        if (mContentHeight <= 0)
        {
            j = 0;
            i1 = getChildCount();
            for (i = 0; i < i1;)
            {
                l = getChildAt(i).getMeasuredHeight() + k1;
                k = j;
                if (l > j)
                {
                    k = l;
                }
                i++;
                j = k;
            }

            setMeasuredDimension(j1, j);
            return;
        } else
        {
            setMeasuredDimension(j1, k);
            return;
        }
    }

    public final void setContentHeight(int i)
    {
        mContentHeight = i;
    }

    public final void setCustomView(View view)
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

    public final void setSubtitle(CharSequence charsequence)
    {
        mSubtitle = charsequence;
        initTitle();
    }

    public final void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        initTitle();
    }

    public final void setTitleOptional(boolean flag)
    {
        if (flag != mTitleOptional)
        {
            requestLayout();
        }
        mTitleOptional = flag;
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    public final boolean showOverflowMenu()
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
