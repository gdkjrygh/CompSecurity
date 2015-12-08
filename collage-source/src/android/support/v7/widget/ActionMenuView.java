// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, ActionMenuPresenter, ViewUtils

public class ActionMenuView extends LinearLayoutCompat
    implements android.support.v7.view.menu.MenuBuilder.ItemInvoker, MenuView
{
    public static interface ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

    private class ActionMenuPresenterCallback
        implements android.support.v7.view.menu.MenuPresenter.Callback
    {

        final ActionMenuView this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
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
        implements android.support.v7.view.menu.MenuBuilder.Callback
    {

        final ActionMenuView this$0;

        public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            return mOnMenuItemClickListener != null && mOnMenuItemClickListener.onMenuItemClick(menuitem);
        }

        public void onMenuModeChange(MenuBuilder menubuilder)
        {
            if (mMenuBuilderCallback != null)
            {
                mMenuBuilderCallback.onMenuModeChange(menubuilder);
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
    private android.support.v7.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private android.support.v7.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
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
        float f = context.getResources().getDisplayMetrics().density;
        mMinCellSize = (int)(56F * f);
        mGeneratedItemPadding = (int)(f * 4F);
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
        if (actionmenuitemview != null && actionmenuitemview.hasText())
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
        int k3 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        int j3 = android.view.View.MeasureSpec.getSize(j);
        int k = getPaddingLeft();
        int l = getPaddingRight();
        int l2 = getPaddingTop() + getPaddingBottom();
        int l3 = getChildMeasureSpec(j, l2, -2);
        int i4 = i - (k + l);
        i = i4 / mMinCellSize;
        j = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(i4, 0);
            return;
        }
        int j4 = mMinCellSize + (i4 % j) / i;
        k = 0;
        int l1 = 0;
        int k1 = 0;
        int i2 = 0;
        int j1 = 0;
        long l4 = 0L;
        int k4 = getChildCount();
        int j2 = 0;
        while (j2 < k4) 
        {
            Object obj = getChildAt(j2);
            int i1;
            if (((View) (obj)).getVisibility() == 8)
            {
                j = l1;
                i1 = i;
                i = i2;
            } else
            {
                boolean flag = obj instanceof ActionMenuItemView;
                i2++;
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
                int k2;
                int i3;
                if (flag && ((ActionMenuItemView)obj).hasText())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                layoutparams.preventEdgeOffset = flag;
                if (layoutparams.isOverflowButton)
                {
                    j = 1;
                } else
                {
                    j = i;
                }
                i3 = measureChildForCells(((View) (obj)), j4, j, l3, l2);
                l1 = Math.max(l1, i3);
                float f;
                float f1;
                float f2;
                long l6;
                if (layoutparams.expandable)
                {
                    j = k1 + 1;
                } else
                {
                    j = k1;
                }
                if (layoutparams.isOverflowButton)
                {
                    i1 = 1;
                } else
                {
                    i1 = j1;
                }
                k2 = i - i3;
                k = Math.max(k, ((View) (obj)).getMeasuredHeight());
                if (i3 == 1)
                {
                    long l5 = 1 << j2;
                    k1 = j;
                    l4 = l5 | l4;
                    j = l1;
                    i = i2;
                    j1 = i1;
                    i1 = k2;
                } else
                {
                    i = i2;
                    j1 = l1;
                    l1 = k2;
                    k1 = j;
                    j = j1;
                    j1 = i1;
                    i1 = l1;
                }
            }
            j2++;
            i2 = i;
            i = i1;
            l1 = j;
        }
        if (j1 != 0 && i2 == 2)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        i1 = 0;
        j2 = i;
        if (k1 <= 0 || j2 <= 0) goto _L2; else goto _L1
_L1:
        i = 0x7fffffff;
        l6 = 0L;
        j = 0;
        l2 = 0;
        while (l2 < k4) 
        {
            obj = (LayoutParams)getChildAt(l2).getLayoutParams();
            if (!((LayoutParams) (obj)).expandable)
            {
                i3 = j;
                j = i;
                i = i3;
            } else
            if (((LayoutParams) (obj)).cellsUsed < i)
            {
                j = ((LayoutParams) (obj)).cellsUsed;
                l6 = 1 << l2;
                i = 1;
            } else
            if (((LayoutParams) (obj)).cellsUsed == i)
            {
                l6 |= 1 << l2;
                i3 = j + 1;
                j = i;
                i = i3;
            } else
            {
                i3 = i;
                i = j;
                j = i3;
            }
            i3 = l2 + 1;
            l2 = j;
            j = i;
            i = l2;
            l2 = i3;
        }
        l4 |= l6;
        if (j <= j2) goto _L3; else goto _L2
_L2:
        if (j1 == 0 && i2 == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (j2 <= 0 || l4 == 0L || j2 >= i2 - 1 && i == 0 && l1 <= 1) goto _L5; else goto _L4
_L4:
        f2 = Long.bitCount(l4);
        f1 = f2;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f = f2;
        if ((1L & l4) != 0L)
        {
            f = f2;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
            {
                f = f2 - 0.5F;
            }
        }
        f1 = f;
        if (((long)(1 << k4 - 1) & l4) == 0L)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f1 = f;
        if (((LayoutParams)getChildAt(k4 - 1).getLayoutParams()).preventEdgeOffset)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        f -= 0.5F;
_L8:
        if (f > 0.0F)
        {
            j = (int)((float)(j2 * j4) / f);
        } else
        {
            j = 0;
        }
        j1 = 0;
        i = i1;
        i1 = j1;
        do
        {
            j1 = i;
            if (i1 >= k4)
            {
                break;
            }
            if (((long)(1 << i1) & l4) != 0L)
            {
                obj = getChildAt(i1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.extraPixels = j;
                    layoutparams.expanded = true;
                    if (i1 == 0 && !layoutparams.preventEdgeOffset)
                    {
                        layoutparams.leftMargin = -j / 2;
                    }
                    i = 1;
                } else
                if (layoutparams.isOverflowButton)
                {
                    layoutparams.extraPixels = j;
                    layoutparams.expanded = true;
                    layoutparams.rightMargin = -j / 2;
                    i = 1;
                } else
                {
                    if (i1 != 0)
                    {
                        layoutparams.leftMargin = j / 2;
                    }
                    if (i1 != k4 - 1)
                    {
                        layoutparams.rightMargin = j / 2;
                    }
                }
            }
            i1++;
        } while (true);
          goto _L6
_L3:
        i1 = 0;
        j = j2;
        while (i1 < k4) 
        {
            obj = getChildAt(i1);
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            if (((long)(1 << i1) & l6) == 0L)
            {
                if (layoutparams.cellsUsed == i + 1)
                {
                    l4 |= 1 << i1;
                }
            } else
            {
                if (k2 != 0 && layoutparams.preventEdgeOffset && j == 1)
                {
                    ((View) (obj)).setPadding(mGeneratedItemPadding + j4, 0, mGeneratedItemPadding, 0);
                }
                layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
                layoutparams.expanded = true;
                j--;
            }
            i1++;
        }
        i1 = 1;
        j2 = j;
        break MISSING_BLOCK_LABEL_427;
_L5:
        j1 = i1;
_L6:
        if (j1 != 0)
        {
            i = 0;
            while (i < k4) 
            {
                obj = getChildAt(i);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.expanded)
                {
                    j = layoutparams.cellsUsed;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + j * j4, 0x40000000), l3);
                }
                i++;
            }
        }
        if (k3 == 0x40000000)
        {
            k = j3;
        }
        setMeasuredDimension(i4, k);
        return;
        f = f1;
        if (true) goto _L8; else goto _L7
_L7:
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
            mMenu = new MenuBuilder(((Context) (obj)));
            mMenu.setCallback(new MenuBuilderCallback());
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
            actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
            mMenu.addMenuPresenter(mPresenter, mPopupContext);
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
                flag = false | ((ActionMenuChildView)view).needsDividerAfter();
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

    public void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, 0);
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
        int l4;
        int i5;
        i5 = getChildCount();
        l4 = (l - j) / 2;
        int j5 = getDividerWidth();
        l = 0;
        j = 0;
        int l1 = k - i - getPaddingRight() - getPaddingLeft();
        int i1 = 0;
        flag = ViewUtils.isLayoutRtl(this);
        int k2 = 0;
        while (k2 < i5) 
        {
            View view = getChildAt(k2);
            int i3;
            int i4;
            if (view.getVisibility() == 8)
            {
                int l2 = i1;
                int l3 = l1;
                l1 = l;
                i1 = j;
                l = l3;
                j = l2;
            } else
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.isOverflowButton)
                {
                    int j3 = view.getMeasuredWidth();
                    i1 = j3;
                    if (hasSupportDividerBeforeChildAt(k2))
                    {
                        i1 = j3 + j5;
                    }
                    int k5 = view.getMeasuredHeight();
                    int j4;
                    int l5;
                    if (flag)
                    {
                        j3 = getPaddingLeft();
                        j3 = layoutparams.leftMargin + j3;
                        j4 = j3 + i1;
                    } else
                    {
                        j4 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        j3 = j4 - i1;
                    }
                    l5 = l4 - k5 / 2;
                    view.layout(j3, l5, j4, k5 + l5);
                    j3 = l1 - i1;
                    j4 = 1;
                    i1 = j;
                    l1 = l;
                    j = j4;
                    l = j3;
                } else
                {
                    int k4 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                    int k3 = l + k4;
                    l = k3;
                    if (hasSupportDividerBeforeChildAt(k2))
                    {
                        l = k3 + j5;
                    }
                    k3 = l1 - k4;
                    k4 = j + 1;
                    l1 = l;
                    j = i1;
                    l = k3;
                    i1 = k4;
                }
            }
            i4 = k2 + 1;
            k2 = l1;
            i3 = i1;
            i1 = j;
            l1 = l;
            j = i3;
            l = k2;
            k2 = i4;
        }
        if (i5 == 1 && i1 == 0)
        {
            View view1 = getChildAt(0);
            j = view1.getMeasuredWidth();
            l = view1.getMeasuredHeight();
            i = (k - i) / 2 - j / 2;
            k = l4 - l / 2;
            view1.layout(i, k, j + i, l + k);
            return;
        }
        if (i1 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = j - i;
        if (i > 0)
        {
            i = l1 / i;
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
        while (j < i5) 
        {
            View view2 = getChildAt(j);
            LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
            if (view2.getVisibility() != 8 && !layoutparams1.isOverflowButton)
            {
                i -= layoutparams1.rightMargin;
                l = view2.getMeasuredWidth();
                int j1 = view2.getMeasuredHeight();
                int i2 = l4 - j1 / 2;
                view2.layout(i - l, i2, i, j1 + i2);
                i -= layoutparams1.leftMargin + l + k;
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = getPaddingLeft();
        j = 0;
        while (j < i5) 
        {
            View view3 = getChildAt(j);
            LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
            if (view3.getVisibility() != 8 && !layoutparams2.isOverflowButton)
            {
                i += layoutparams2.leftMargin;
                l = view3.getMeasuredWidth();
                int k1 = view3.getMeasuredHeight();
                int j2 = l4 - k1 / 2;
                view3.layout(i, j2, i + l, k1 + j2);
                i = layoutparams2.rightMargin + l + k + i;
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
            mMenu.onItemsChanged(true);
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

    public MenuBuilder peekMenu()
    {
        return mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        mPresenter.setExpandedActionViewsExclusive(flag);
    }

    public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
    {
        mActionMenuPresenterCallback = callback;
        mMenuBuilderCallback = callback1;
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
