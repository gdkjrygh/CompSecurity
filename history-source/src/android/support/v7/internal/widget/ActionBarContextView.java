// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.view.ActionMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsActionBarView, ActionBarContainer

public class ActionBarContextView extends AbsActionBarView
{

    private static final String TAG = "ActionBarContextView";
    private View mClose;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionMode, i, 0);
        setBackgroundDrawable(context.getDrawable(3));
        mTitleStyleRes = context.getResourceId(1, 0);
        mSubtitleStyleRes = context.getResourceId(2, 0);
        mContentHeight = context.getLayoutDimension(0, 0);
        mSplitBackground = context.getDrawable(4);
        context.recycle();
    }

    private void initTitle()
    {
label0:
        {
            byte byte1 = 8;
            if (mTitleLayout == null)
            {
                LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, this);
                mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
                mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
                mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
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

    public volatile void animateToVisibility(int i)
    {
        super.animateToVisibility(i);
    }

    public void closeMode()
    {
        if (mClose == null)
        {
            killMode();
        }
    }

    public volatile void dismissPopupMenus()
    {
        super.dismissPopupMenus();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
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
            mClose = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_mode_close_item, this, false);
            addView(mClose);
        } else
        if (mClose.getParent() == null)
        {
            addView(mClose);
        }
        mClose.findViewById(android.support.v7.appcompat.R.id.action_mode_close_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ActionBarContextView this$0;
            final ActionMode val$mode;

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
        mActionMenuPresenter = new ActionMenuPresenter(getContext());
        mActionMenuPresenter.setReserveOverflow(true);
        layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!mSplitActionBar)
        {
            mode.addMenuPresenter(mActionMenuPresenter);
            mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            mMenuView.setBackgroundDrawable(null);
            addView(mMenuView, layoutparams);
            return;
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
            return;
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

    public volatile boolean isOverflowReserved()
    {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional()
    {
        return mTitleOptional;
    }

    public void killMode()
    {
        removeAllViews();
        if (mSplitView != null)
        {
            mSplitView.removeView(mMenuView);
        }
        mCustomView = null;
        mMenuView = null;
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
                j = j + positionChild(mClose, j, j1, k1) + marginlayoutparams.rightMargin;
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
                    l = j + positionChild(mTitleLayout, j, j1, k1);
                }
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
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"FILL_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
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
            i = measureChildView(mClose, i, l, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
            j = i - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
        }
        i = j;
        if (mMenuView != null)
        {
            i = j;
            if (mMenuView.getParent() == this)
            {
                i = measureChildView(mMenuView, j, l, 0);
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
                    j = measureChildView(mTitleLayout, i, l, 0);
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

    public volatile void postShowOverflowMenu()
    {
        super.postShowOverflowMenu();
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

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
        super.setSplitView(actionbarcontainer);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
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

    public void setTitleOptional(boolean flag)
    {
        if (flag != mTitleOptional)
        {
            requestLayout();
        }
        mTitleOptional = flag;
    }

    public volatile void setVisibility(int i)
    {
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
