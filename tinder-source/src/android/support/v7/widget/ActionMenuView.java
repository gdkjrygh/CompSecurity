// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.ViewUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, ActionMenuPresenter

public class ActionMenuView extends LinearLayoutCompat
    implements android.support.v7.internal.view.menu.f.b, m
{
    public static interface ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

    private class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.l.a
    {

        final ActionMenuView this$0;

        public void onCloseMenu(f f1, boolean flag)
        {
        }

        public boolean onOpenSubMenu(f f1)
        {
            return false;
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = ActionMenuView.this;
            super();
        }

    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams
    {

        public int cellsUsed;
        public boolean expandable;
        boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            isOverflowButton = false;
        }

        LayoutParams(int i, int j, boolean flag)
        {
            super(i, j);
            isOverflowButton = flag;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            isOverflowButton = layoutparams.isOverflowButton;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

    private class MenuBuilderCallback
        implements android.support.v7.internal.view.menu.f.a
    {

        final ActionMenuView this$0;

        public boolean onMenuItemSelected(f f1, MenuItem menuitem)
        {
            return mOnMenuItemClickListener != null && mOnMenuItemClickListener.onMenuItemClick(menuitem);
        }

        public void onMenuModeChange(f f1)
        {
            if (mMenuBuilderCallback != null)
            {
                mMenuBuilderCallback.onMenuModeChange(f1);
            }
        }

        private MenuBuilderCallback()
        {
            this$0 = ActionMenuView.this;
            super();
        }

    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private android.support.v7.internal.view.menu.l.a mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private f mMenu;
    private android.support.v7.internal.view.menu.f.a mMenuBuilderCallback;
    private int mMinCellSize;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        mMinCellSize = (int)(56F * f1);
        mGeneratedItemPadding = (int)(f1 * 4F);
        mPopupContext = context;
        mPopupTheme = 0;
    }

    static int measureChildForCells(View view, int i, int j, int k, int l)
    {
        boolean flag1 = false;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.b())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (j > 0 && (l == 0 || j >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), i1);
            int j1 = view.getMeasuredWidth();
            k = j1 / i;
            j = k;
            if (j1 % i != 0)
            {
                j = k + 1;
            }
            k = j;
            if (l != 0)
            {
                k = j;
                if (j < 2)
                {
                    k = 2;
                }
            }
        } else
        {
            k = 0;
        }
        flag = flag1;
        if (!layoutparams.isOverflowButton)
        {
            flag = flag1;
            if (l != 0)
            {
                flag = true;
            }
        }
        layoutparams.expandable = flag;
        layoutparams.cellsUsed = k;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), i1);
        return k;
    }

    private void onMeasureExactFormat(int i, int j)
    {
        int l3 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        int k3 = android.view.View.MeasureSpec.getSize(j);
        int k = getPaddingLeft();
        int i1 = getPaddingRight();
        int i3 = getPaddingTop() + getPaddingBottom();
        int i4 = getChildMeasureSpec(j, i3, -2);
        int j4 = i - (k + i1);
        i = j4 / mMinCellSize;
        j = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(j4, 0);
            return;
        }
        int k4 = mMinCellSize + (j4 % j) / i;
        j = 0;
        int i2 = 0;
        int l1 = 0;
        int j2 = 0;
        int k1 = 0;
        long l5 = 0L;
        int l4 = getChildCount();
        int k2 = 0;
        while (k2 < l4) 
        {
            Object obj = getChildAt(k2);
            int l;
            int j1;
            if (((View) (obj)).getVisibility() != 8)
            {
                boolean flag = obj instanceof ActionMenuItemView;
                j2++;
                if (flag)
                {
                    ((View) (obj)).setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
                }
                LayoutParams layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                layoutparams.expanded = false;
                layoutparams.extraPixels = 0;
                layoutparams.cellsUsed = 0;
                layoutparams.expandable = false;
                layoutparams.leftMargin = 0;
                layoutparams.rightMargin = 0;
                int l2;
                if (flag && ((ActionMenuItemView)obj).b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                layoutparams.preventEdgeOffset = flag;
                if (layoutparams.isOverflowButton)
                {
                    l = 1;
                } else
                {
                    l = i;
                }
                l2 = measureChildForCells(((View) (obj)), k4, l, i4, i3);
                i2 = Math.max(i2, l2);
                float f1;
                float f2;
                float f3;
                int j3;
                long l7;
                long l8;
                if (layoutparams.expandable)
                {
                    l = l1 + 1;
                } else
                {
                    l = l1;
                }
                if (layoutparams.isOverflowButton)
                {
                    j1 = 1;
                } else
                {
                    j1 = k1;
                }
                i -= l2;
                l1 = Math.max(j, ((View) (obj)).getMeasuredHeight());
                if (l2 == 1)
                {
                    long l6 = 1 << k2;
                    j = l1;
                    k1 = i;
                    l1 = l;
                    l2 = j1;
                    l5 = l6 | l5;
                    i = j2;
                    j1 = k1;
                    l = j;
                    k1 = l2;
                    j = i2;
                } else
                {
                    j = j2;
                    k1 = i2;
                    i2 = l1;
                    j2 = i;
                    i = j;
                    j = k1;
                    l1 = l;
                    k1 = j1;
                    l = i2;
                    j1 = j2;
                }
            } else
            {
                l = j;
                j1 = i;
                j = i2;
                i = j2;
            }
            k2++;
            j2 = i;
            i = j1;
            i2 = j;
            j = l;
        }
        if (k1 != 0 && j2 == 2)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        l = 0;
        k2 = i;
        i = l;
        l8 = l5;
        if (l1 <= 0) goto _L2; else goto _L1
_L1:
        l8 = l5;
        if (k2 <= 0) goto _L2; else goto _L3
_L3:
        l = 0x7fffffff;
        l7 = 0L;
        j1 = 0;
        i3 = 0;
_L10:
        if (i3 >= l4) goto _L5; else goto _L4
_L4:
        obj = (LayoutParams)getChildAt(i3).getLayoutParams();
        if (!((LayoutParams) (obj)).expandable) goto _L7; else goto _L6
_L6:
        if (((LayoutParams) (obj)).cellsUsed >= l) goto _L9; else goto _L8
_L8:
        j1 = ((LayoutParams) (obj)).cellsUsed;
        l7 = 1 << i3;
        l = 1;
_L12:
        j3 = i3 + 1;
        i3 = j1;
        j1 = l;
        l = i3;
        i3 = j3;
          goto _L10
_L9:
        if (((LayoutParams) (obj)).cellsUsed != l) goto _L7; else goto _L11
_L11:
        l7 |= 1 << i3;
        j3 = j1 + 1;
        j1 = l;
        l = j3;
          goto _L12
_L5:
        l5 |= l7;
        l8 = l5;
        if (j1 <= k2)
        {
            j1 = 0;
            i = k2;
            while (j1 < l4) 
            {
                obj = getChildAt(j1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (((long)(1 << j1) & l7) == 0L)
                {
                    if (layoutparams.cellsUsed == l + 1)
                    {
                        l5 |= 1 << j1;
                    }
                } else
                {
                    if (l2 && layoutparams.preventEdgeOffset && i == 1)
                    {
                        ((View) (obj)).setPadding(mGeneratedItemPadding + k4, 0, mGeneratedItemPadding, 0);
                    }
                    layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
                    layoutparams.expanded = true;
                    i--;
                }
                j1++;
            }
            l = 1;
            k2 = i;
            i = l;
            break MISSING_BLOCK_LABEL_436;
        }
_L2:
        if (k1 == 0 && j2 == 1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (k2 <= 0 || l8 == 0L || k2 >= j2 - 1 && l == 0 && i2 <= 1) goto _L14; else goto _L13
_L13:
        f3 = Long.bitCount(l8);
        f2 = f3;
        if (l != 0) goto _L16; else goto _L15
_L15:
        f1 = f3;
        if ((1L & l8) != 0L)
        {
            f1 = f3;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << l4 - 1) & l8) == 0L) goto _L16; else goto _L17
_L17:
        f2 = f1;
        if (((LayoutParams)getChildAt(l4 - 1).getLayoutParams()).preventEdgeOffset) goto _L16; else goto _L18
_L18:
        f1 -= 0.5F;
_L20:
        if (f1 > 0.0F)
        {
            l = (int)((float)(k2 * k4) / f1);
        } else
        {
            l = 0;
        }
        j1 = 0;
        do
        {
            k1 = i;
            if (j1 >= l4)
            {
                break;
            }
            if (((long)(1 << j1) & l8) != 0L)
            {
                obj = getChildAt(j1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.extraPixels = l;
                    layoutparams.expanded = true;
                    if (j1 == 0 && !layoutparams.preventEdgeOffset)
                    {
                        layoutparams.leftMargin = -l / 2;
                    }
                    i = 1;
                } else
                if (layoutparams.isOverflowButton)
                {
                    layoutparams.extraPixels = l;
                    layoutparams.expanded = true;
                    layoutparams.rightMargin = -l / 2;
                    i = 1;
                } else
                {
                    if (j1 != 0)
                    {
                        layoutparams.leftMargin = l / 2;
                    }
                    if (j1 != l4 - 1)
                    {
                        layoutparams.rightMargin = l / 2;
                    }
                }
            }
            j1++;
        } while (true);
          goto _L19
_L14:
        k1 = i;
_L19:
        if (k1 != 0)
        {
            for (i = 0; i < l4; i++)
            {
                obj = getChildAt(i);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.expanded)
                {
                    l = layoutparams.cellsUsed;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + l * k4, 0x40000000), i4);
                }
            }

        }
        if (l3 == 0x40000000)
        {
            j = k3;
        }
        setMeasuredDimension(j4, j);
        return;
_L16:
        f1 = f2;
        if (true) goto _L20; else goto _L7
_L7:
        j3 = l;
        l = j1;
        j1 = j3;
          goto _L12
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public void dismissPopupMenus()
    {
        if (mPresenter != null)
        {
            mPresenter.dismissPopupMenus();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    protected volatile LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof LayoutParams)
            {
                layoutparams = new LayoutParams((LayoutParams)layoutparams);
            } else
            {
                layoutparams = new LayoutParams(layoutparams);
            }
            if (((LayoutParams) (layoutparams)).gravity <= 0)
            {
                layoutparams.gravity = 16;
            }
            return layoutparams;
        } else
        {
            return generateDefaultLayoutParams();
        }
    }

    public volatile LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public LayoutParams generateOverflowButtonLayoutParams()
    {
        LayoutParams layoutparams = generateDefaultLayoutParams();
        layoutparams.isOverflowButton = true;
        return layoutparams;
    }

    public Menu getMenu()
    {
        if (mMenu == null)
        {
            Object obj = getContext();
            mMenu = new f(((Context) (obj)));
            mMenu.a(new MenuBuilderCallback());
            mPresenter = new ActionMenuPresenter(((Context) (obj)));
            mPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionmenupresenter = mPresenter;
            if (mActionMenuPresenterCallback != null)
            {
                obj = mActionMenuPresenterCallback;
            } else
            {
                obj = new ActionMenuPresenterCallback();
            }
            actionmenupresenter.setCallback(((android.support.v7.internal.view.menu.l.a) (obj)));
            mMenu.a(mPresenter, mPopupContext);
            mPresenter.setMenuView(this);
        }
        return mMenu;
    }

    public Drawable getOverflowIcon()
    {
        getMenu();
        return mPresenter.getOverflowIcon();
    }

    public int getPopupTheme()
    {
        return mPopupTheme;
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    protected boolean hasSupportDividerBeforeChildAt(int i)
    {
        boolean flag1 = false;
        if (i == 0)
        {
            return false;
        }
        View view = getChildAt(i - 1);
        View view1 = getChildAt(i);
        boolean flag = flag1;
        if (i < getChildCount())
        {
            flag = flag1;
            if (view instanceof ActionMenuChildView)
            {
                flag = ((ActionMenuChildView)view).needsDividerAfter() | false;
            }
        }
        if (i > 0 && (view1 instanceof ActionMenuChildView))
        {
            return ((ActionMenuChildView)view1).needsDividerBefore() | flag;
        } else
        {
            return flag;
        }
    }

    public boolean hideOverflowMenu()
    {
        return mPresenter != null && mPresenter.hideOverflowMenu();
    }

    public void initialize(f f1)
    {
        mMenu = f1;
    }

    public boolean invokeItem(h h)
    {
        return mMenu.a(h, null, 0);
    }

    public boolean isOverflowMenuShowPending()
    {
        return mPresenter != null && mPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing()
    {
        return mPresenter != null && mPresenter.isOverflowMenuShowing();
    }

    public boolean isOverflowReserved()
    {
        return mReserveOverflow;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (mPresenter != null)
        {
            mPresenter.updateMenuView(false);
            if (mPresenter.isOverflowMenuShowing())
            {
                mPresenter.hideOverflowMenu();
                mPresenter.showOverflowMenu();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mFormatItems) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i, j, k, l);
_L4:
        return;
_L2:
        int i3 = getChildCount();
        int l2 = (l - j) / 2;
        int j3 = getDividerWidth();
        j = 0;
        l = k - i - getPaddingRight() - getPaddingLeft();
        int j1 = 0;
        flag = ViewUtils.isLayoutRtl(this);
        int i1 = 0;
        while (i1 < i3) 
        {
            View view = getChildAt(i1);
            LayoutParams layoutparams1;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.isOverflowButton)
                {
                    int k1 = view.getMeasuredWidth();
                    j1 = k1;
                    if (hasSupportDividerBeforeChildAt(i1))
                    {
                        j1 = k1 + j3;
                    }
                    int k3 = view.getMeasuredHeight();
                    int j2;
                    int l3;
                    if (flag)
                    {
                        k1 = getPaddingLeft();
                        k1 = layoutparams.leftMargin + k1;
                        j2 = k1 + j1;
                    } else
                    {
                        j2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        k1 = j2 - j1;
                    }
                    l3 = l2 - k3 / 2;
                    view.layout(k1, l3, j2, k3 + l3);
                    k1 = l - j1;
                    j1 = 1;
                    l = j;
                    j = k1;
                } else
                {
                    int l1 = view.getMeasuredWidth();
                    int k2 = layoutparams.leftMargin;
                    l -= layoutparams.rightMargin + (l1 + k2);
                    hasSupportDividerBeforeChildAt(i1);
                    l1 = j + 1;
                    j = l;
                    l = l1;
                }
            } else
            {
                int i2 = j;
                j = l;
                l = i2;
            }
            k1 = i1 + 1;
            i1 = l;
            l = j;
            j = i1;
            i1 = k1;
        }
        if (i3 == 1 && j1 == 0)
        {
            view = getChildAt(0);
            j = view.getMeasuredWidth();
            l = view.getMeasuredHeight();
            i = (k - i) / 2 - j / 2;
            k = l2 - l / 2;
            view.layout(i, k, j + i, l + k);
            return;
        }
        if (j1 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = j - i;
        if (i > 0)
        {
            i = l / i;
        } else
        {
            i = 0;
        }
        k = Math.max(0, i);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = getWidth() - getPaddingRight();
        j = 0;
        while (j < i3) 
        {
            view = getChildAt(j);
            layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (view.getVisibility() != 8 && !layoutparams1.isOverflowButton)
            {
                i -= layoutparams1.rightMargin;
                l = view.getMeasuredWidth();
                i1 = view.getMeasuredHeight();
                j1 = l2 - i1 / 2;
                view.layout(i - l, j1, i, i1 + j1);
                i -= layoutparams1.leftMargin + l + k;
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = getPaddingLeft();
        j = 0;
        while (j < i3) 
        {
            view = getChildAt(j);
            layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (view.getVisibility() != 8 && !layoutparams1.isOverflowButton)
            {
                i += layoutparams1.leftMargin;
                l = view.getMeasuredWidth();
                i1 = view.getMeasuredHeight();
                j1 = l2 - i1 / 2;
                view.layout(i, j1, i + l, i1 + j1);
                i = layoutparams1.rightMargin + l + k + i;
            }
            j++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag1 = mFormatItems;
        int k;
        int i1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mFormatItems = flag;
        if (flag1 != mFormatItems)
        {
            mFormatItemsWidth = 0;
        }
        k = android.view.View.MeasureSpec.getSize(i);
        if (mFormatItems && mMenu != null && k != mFormatItemsWidth)
        {
            mFormatItemsWidth = k;
            mMenu.b(true);
        }
        i1 = getChildCount();
        if (mFormatItems && i1 > 0)
        {
            onMeasureExactFormat(i, j);
            return;
        }
        for (int l = 0; l < i1; l++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(l).getLayoutParams();
            layoutparams.rightMargin = 0;
            layoutparams.leftMargin = 0;
        }

        super.onMeasure(i, j);
    }

    public f peekMenu()
    {
        return mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        mPresenter.setExpandedActionViewsExclusive(flag);
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.l.a a, android.support.v7.internal.view.menu.f.a a1)
    {
        mActionMenuPresenterCallback = a;
        mMenuBuilderCallback = a1;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
        mOnMenuItemClickListener = onmenuitemclicklistener;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        getMenu();
        mPresenter.setOverflowIcon(drawable);
    }

    public void setOverflowReserved(boolean flag)
    {
        mReserveOverflow = flag;
    }

    public void setPopupTheme(int i)
    {
label0:
        {
            if (mPopupTheme != i)
            {
                mPopupTheme = i;
                if (i != 0)
                {
                    break label0;
                }
                mPopupContext = getContext();
            }
            return;
        }
        mPopupContext = new ContextThemeWrapper(getContext(), i);
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
        mPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu()
    {
        return mPresenter != null && mPresenter.showOverflowMenu();
    }


}
