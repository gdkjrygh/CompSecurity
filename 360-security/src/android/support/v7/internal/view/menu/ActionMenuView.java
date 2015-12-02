// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuView, ActionMenuItemView, MenuBuilder, ActionMenuPresenter, 
//            MenuItemImpl

public class ActionMenuView extends LinearLayoutICS
    implements MenuBuilder.ItemInvoker, MenuView
{
    public static interface ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        public int cellsUsed;
        public boolean expandable;
        public boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            isOverflowButton = false;
        }

        public LayoutParams(int i, int j, boolean flag)
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
    }


    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private int mMaxItemHeight;
    private int mMeasuredExtraWidth;
    private MenuBuilder mMenu;
    private int mMinCellSize;
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
        context = context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActionBar, android.support.v7.a.a.b.actionBarStyle, 0);
        mMaxItemHeight = context.getDimensionPixelSize(1, 0);
        context.recycle();
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
        j = getPaddingLeft();
        int k = getPaddingRight();
        int l2 = getPaddingTop() + getPaddingBottom();
        int j2;
        int l3;
        if (k3 == 0x40000000)
        {
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(j3 - l2, 0x40000000);
        } else
        {
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mMaxItemHeight, j3 - l2), 0x80000000);
        }
        l3 = i - (k + j);
        i = l3 / mMinCellSize;
        j = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(l3, 0);
            return;
        }
        int i4 = mMinCellSize + (l3 % j) / i;
        k = 0;
        int l1 = 0;
        int k1 = 0;
        int i2 = 0;
        int j1 = 0;
        long l4 = 0L;
        int j4 = getChildCount();
        int i1 = 0;
        while (i1 < j4) 
        {
            Object obj = getChildAt(i1);
            int l;
            if (((View) (obj)).getVisibility() == 8)
            {
                j = l1;
                l = i;
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
                i3 = measureChildForCells(((View) (obj)), i4, j, j2, l2);
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
                    l = 1;
                } else
                {
                    l = j1;
                }
                k2 = i - i3;
                k = Math.max(k, ((View) (obj)).getMeasuredHeight());
                if (i3 == 1)
                {
                    long l5 = 1 << i1;
                    i = i2;
                    l4 = l5 | l4;
                    k1 = j;
                    j = l1;
                    j1 = l;
                    l = k2;
                } else
                {
                    k1 = j;
                    j = l1;
                    i = i2;
                    j1 = l;
                    l = k2;
                }
            }
            i1++;
            i2 = i;
            i = l;
            l1 = j;
        }
        if (j1 != 0 && i2 == 2)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        l = 0;
        i1 = i;
        if (k1 <= 0 || i1 <= 0) goto _L2; else goto _L1
_L1:
        i = 0x7fffffff;
        l6 = 0L;
        j = 0;
        l2 = 0;
        while (l2 < j4) 
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
        if (j <= i1) goto _L3; else goto _L2
_L3:
        l = 0;
        j = i1;
        while (l < j4) 
        {
            obj = getChildAt(l);
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            if (((long)(1 << l) & l6) == 0L)
            {
                if (layoutparams.cellsUsed == i + 1)
                {
                    l4 |= 1 << l;
                }
            } else
            {
                if (k2 != 0 && layoutparams.preventEdgeOffset && j == 1)
                {
                    ((View) (obj)).setPadding(mGeneratedItemPadding + i4, 0, mGeneratedItemPadding, 0);
                }
                layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
                layoutparams.expanded = true;
                j--;
            }
            l++;
        }
        l = 1;
        i1 = j;
        break MISSING_BLOCK_LABEL_456;
_L2:
        if (j1 == 0 && i2 == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i1 <= 0 || l4 == 0L || i1 >= i2 - 1 && i == 0 && l1 <= 1)
        {
            break MISSING_BLOCK_LABEL_1214;
        }
        f2 = Long.bitCount(l4);
        f1 = f2;
        if (i == 0)
        {
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
            if (((long)(1 << j4 - 1) & l4) != 0L)
            {
label0:
                {
                    f1 = f;
                    if (!((LayoutParams)getChildAt(j4 - 1).getLayoutParams()).preventEdgeOffset)
                    {
                        f -= 0.5F;
                        break label0;
                    }
                }
            }
        }
        f = f1;
        if (f > 0.0F)
        {
            j = (int)((float)(i1 * i4) / f);
        } else
        {
            j = 0;
        }
        i1 = 0;
        i = l;
        l = i1;
        while (l < j4) 
        {
            if (((long)(1 << l) & l4) != 0L)
            {
                obj = getChildAt(l);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.extraPixels = j;
                    layoutparams.expanded = true;
                    if (l == 0 && !layoutparams.preventEdgeOffset)
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
                    if (l != 0)
                    {
                        layoutparams.leftMargin = j / 2;
                    }
                    if (l != j4 - 1)
                    {
                        layoutparams.rightMargin = j / 2;
                    }
                }
            }
            l++;
        }
        j = 0;
_L5:
        if (i != 0)
        {
            i = 0;
            while (i < j4) 
            {
                obj = getChildAt(i);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.expanded)
                {
                    l = layoutparams.cellsUsed;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + l * i4, 0x40000000), j2);
                }
                i++;
            }
        }
        if (k3 == 0x40000000)
        {
            k = j3;
        }
        setMeasuredDimension(l3, k);
        mMeasuredExtraWidth = j * i4;
        return;
        i = l;
        j = i1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
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

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            layoutparams = new LayoutParams((LayoutParams)layoutparams);
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

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public LayoutParams generateOverflowButtonLayoutParams()
    {
        LayoutParams layoutparams = generateDefaultLayoutParams();
        layoutparams.isOverflowButton = true;
        return layoutparams;
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    protected boolean hasSupportDividerBeforeChildAt(int i)
    {
        View view = getChildAt(i - 1);
        View view1 = getChildAt(i);
        boolean flag1 = false;
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

    public void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, 0);
    }

    public boolean isExpandedFormat()
    {
        return mFormatItems;
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
        mPresenter.updateMenuView(false);
        if (mPresenter != null && mPresenter.isOverflowMenuShowing())
        {
            mPresenter.hideOverflowMenu();
            mPresenter.showOverflowMenu();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mPresenter.dismissPopupMenus();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (!mFormatItems)
        {
            super.onLayout(flag, i, j, k, l);
        } else
        {
            int k4 = getChildCount();
            int j4 = (j + l) / 2;
            int l4 = getSupportDividerWidth();
            l = 0;
            j = 0;
            int k1 = k - i - getPaddingRight() - getPaddingLeft();
            int i1 = 0;
            int i2 = 0;
            while (i2 < k4) 
            {
                View view = getChildAt(i2);
                int k2;
                int k3;
                if (view.getVisibility() == 8)
                {
                    int j2 = i1;
                    int j3 = k1;
                    k1 = l;
                    i1 = j;
                    l = j3;
                    j = j2;
                } else
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (layoutparams.isOverflowButton)
                    {
                        int l2 = view.getMeasuredWidth();
                        i1 = l2;
                        if (hasSupportDividerBeforeChildAt(i2))
                        {
                            i1 = l2 + l4;
                        }
                        l2 = view.getMeasuredHeight();
                        int l3 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        int i5 = j4 - l2 / 2;
                        view.layout(l3 - i1, i5, l3, l2 + i5);
                        l2 = k1 - i1;
                        l3 = 1;
                        i1 = j;
                        k1 = l;
                        j = l3;
                        l = l2;
                    } else
                    {
                        int i4 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                        int i3 = l + i4;
                        l = i3;
                        if (hasSupportDividerBeforeChildAt(i2))
                        {
                            l = i3 + l4;
                        }
                        i3 = k1 - i4;
                        i4 = j + 1;
                        k1 = l;
                        j = i1;
                        l = i3;
                        i1 = i4;
                    }
                }
                k3 = i2 + 1;
                i2 = k1;
                k2 = i1;
                i1 = j;
                k1 = l;
                j = k2;
                l = i2;
                i2 = k3;
            }
            if (k4 == 1 && i1 == 0)
            {
                View view1 = getChildAt(0);
                j = view1.getMeasuredWidth();
                l = view1.getMeasuredHeight();
                i = (k - i) / 2 - j / 2;
                k = j4 - l / 2;
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
                i = k1 / i;
            } else
            {
                i = 0;
            }
            k = Math.max(0, i);
            i = getPaddingLeft();
            j = 0;
            while (j < k4) 
            {
                View view2 = getChildAt(j);
                LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
                if (view2.getVisibility() != 8 && !layoutparams1.isOverflowButton)
                {
                    i += layoutparams1.leftMargin;
                    l = view2.getMeasuredWidth();
                    int j1 = view2.getMeasuredHeight();
                    int l1 = j4 - j1 / 2;
                    view2.layout(i, l1, i + l, j1 + l1);
                    i = layoutparams1.rightMargin + l + k + i;
                }
                j++;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag1 = mFormatItems;
        int k;
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
        k = android.view.View.MeasureSpec.getMode(i);
        if (mFormatItems && mMenu != null && k != mFormatItemsWidth)
        {
            mFormatItemsWidth = k;
            mMenu.onItemsChanged(true);
        }
        if (mFormatItems)
        {
            onMeasureExactFormat(i, j);
            return;
        }
        int i1 = getChildCount();
        for (int l = 0; l < i1; l++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(l).getLayoutParams();
            layoutparams.rightMargin = 0;
            layoutparams.leftMargin = 0;
        }

        super.onMeasure(i, j);
    }

    public void setOverflowReserved(boolean flag)
    {
        mReserveOverflow = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
    }
}
