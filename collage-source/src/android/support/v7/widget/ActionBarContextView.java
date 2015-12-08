// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.view.ActionMode;
import android.support.v7.view.menu.MenuBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//            AbsActionBarView, TintTypedArray, ActionMenuPresenter, ActionMenuView, 
//            ViewUtils

public class ActionBarContextView extends AbsActionBarView
{

    private static final String TAG = "ActionBarContextView";
    private View mClose;
    private int mCloseItemLayout;
    private View mCustomView;
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
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.ActionMode, i, 0);
        setBackgroundDrawable(context.getDrawable(android.support.v7.appcompat.R.styleable.ActionMode_background));
        mTitleStyleRes = context.getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_titleTextStyle, 0);
        mSubtitleStyleRes = context.getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_subtitleTextStyle, 0);
        mContentHeight = context.getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionMode_height, 0);
        mCloseItemLayout = context.getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_closeItemLayout, android.support.v7.appcompat.R.layout.abc_action_mode_close_item_material);
        context.recycle();
    }

    private void initTitle()
    {
label0:
        {
            byte byte1 = 8;
            boolean flag = true;
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
            int i;
            if (!TextUtils.isEmpty(mTitle))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (TextUtils.isEmpty(mSubtitle))
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

    public volatile boolean canShowOverflowMenu()
    {
        return super.canShowOverflowMenu();
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
        if (mClose != null) goto _L2; else goto _L1
_L1:
        mClose = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, this, false);
        addView(mClose);
_L4:
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
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        mode.addMenuPresenter(mActionMenuPresenter, mPopupContext);
        mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
        mMenuView.setBackgroundDrawable(null);
        addView(mMenuView, layoutparams);
        return;
_L2:
        if (mClose.getParent() == null)
        {
            addView(mClose);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean isOverflowMenuShowPending()
    {
        return super.isOverflowMenuShowPending();
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

    public volatile boolean onHoverEvent(MotionEvent motionevent)
    {
        return super.onHoverEvent(motionevent);
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
        if (mClose != null && mClose.getVisibility() != 8)
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
            j = next(positionChild(mClose, j, j1, k1, flag) + j, l, flag);
        } else
        {
            j = i1;
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
            obj = mMenuView;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            positionChild(((View) (obj)), i, j1, k1, flag);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1 = 0x40000000;
        boolean flag = false;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int k1 = android.view.View.MeasureSpec.getSize(i);
        int k;
        int l;
        int j1;
        int l1;
        if (mContentHeight > 0)
        {
            k = mContentHeight;
        } else
        {
            k = android.view.View.MeasureSpec.getSize(j);
        }
        l1 = getPaddingTop() + getPaddingBottom();
        i = k1 - getPaddingLeft() - getPaddingRight();
        j1 = k - l1;
        l = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
        j = i;
        if (mClose != null)
        {
            i = measureChildView(mClose, i, l, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
            j = marginlayoutparams.leftMargin;
            j = i - (marginlayoutparams.rightMargin + j);
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
                    int i2 = mTitleLayout.getMeasuredWidth();
                    Object obj;
                    if (i2 <= i)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    j = i;
                    if (l != 0)
                    {
                        j = i - i2;
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
            l = j;
            if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
            {
                l = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j);
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
            {
                j = i1;
            } else
            {
                j = 0x80000000;
            }
            if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
            {
                i1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j1);
            } else
            {
                i1 = j1;
            }
            mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, i), android.view.View.MeasureSpec.makeMeasureSpec(i1, j));
        }
        if (mContentHeight <= 0)
        {
            l = getChildCount();
            i = 0;
            for (j = ((flag) ? 1 : 0); j < l; j++)
            {
                k = getChildAt(j).getMeasuredHeight() + l1;
                if (k > i)
                {
                    i = k;
                }
            }

            setMeasuredDimension(k1, i);
            return;
        } else
        {
            setMeasuredDimension(k1, k);
            return;
        }
    }

    public volatile boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
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
        if (view != null && mTitleLayout != null)
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

    public volatile ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long l)
    {
        return super.setupAnimatorToVisibility(i, l);
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
