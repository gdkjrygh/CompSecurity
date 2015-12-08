// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuView, ActionMenuItemView, MenuBuilder, ActionMenuPresenter, 
//            MenuItemImpl

public class ActionMenuView extends IcsLinearLayout
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
    private static final boolean IS_FROYO;
    static final int MIN_CELL_SIZE = 56;
    private boolean mFirst;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
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
        mFirst = true;
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        mMinCellSize = (int)(56F * f);
        mGeneratedItemPadding = (int)(4F * f);
    }

    static int measureChildForCells(View view, int i, int j, int k, int l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        l = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
        k = 0;
        if (j > 0)
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), l);
            int i1 = view.getMeasuredWidth();
            j = i1 / i;
            k = j;
            if (i1 % i != 0)
            {
                k = j + 1;
            }
        }
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (!layoutparams.isOverflowButton && actionmenuitemview != null && actionmenuitemview.hasText())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        layoutparams.expandable = flag;
        layoutparams.cellsUsed = k;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), l);
        return k;
    }

    private void onMeasureExactFormat(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        long l6;
        l4 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        j4 = android.view.View.MeasureSpec.getSize(j);
        k = getPaddingLeft();
        l = getPaddingRight();
        j5 = getPaddingTop() + getPaddingBottom();
        i5 = i - (k + l);
        i = i5 / mMinCellSize;
        k = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        k5 = mMinCellSize + (i5 % k) / i;
        k = 0;
        j1 = 0;
        i1 = 0;
        k1 = 0;
        l = 0;
        l6 = 0L;
        l5 = getChildCount();
        l1 = 0;
_L16:
        if (l1 < l5) goto _L2; else goto _L1
_L1:
        int i2;
        long l7;
        float f;
        float f1;
        float f2;
        View view;
        LayoutParams layoutparams;
        int j2;
        int l2;
        int j3;
        int l3;
        int k4;
        int i6;
        boolean flag;
        if (l != 0 && k1 == 2)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        j = 0;
        i2 = i;
_L20:
        l7 = l6;
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        if (i2 > 0) goto _L6; else goto _L5
_L5:
        l7 = l6;
_L4:
        Object obj;
        LayoutParams layoutparams1;
        int k2;
        int i3;
        int k3;
        int i4;
        long l8;
        if (l == 0 && k1 == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = j;
        if (i2 <= 0) goto _L8; else goto _L7
_L7:
        l = j;
        if (l7 == 0L) goto _L8; else goto _L9
_L9:
        if (i2 < k1 - 1 || i != 0) goto _L11; else goto _L10
_L10:
        l = j;
        if (j1 <= 1) goto _L8; else goto _L11
_L11:
        f2 = Long.bitCount(l7);
        f1 = f2;
        if (i == 0)
        {
            f = f2;
            if ((1L & l7) != 0L)
            {
                f = f2;
                if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
                {
                    f = f2 - 0.5F;
                }
            }
            f1 = f;
            if (((long)(1 << l5 - 1) & l7) != 0L)
            {
                f1 = f;
                if (!((LayoutParams)getChildAt(l5 - 1).getLayoutParams()).preventEdgeOffset)
                {
                    f1 = f - 0.5F;
                }
            }
        }
        if (f1 > 0.0F)
        {
            l = (int)((float)(i2 * k5) / f1);
        } else
        {
            l = 0;
        }
        i1 = 0;
_L23:
        if (i1 < l5) goto _L13; else goto _L12
_L12:
        l = j;
_L8:
        if (l == 0) goto _L15; else goto _L14
_L14:
        j = android.view.View.MeasureSpec.makeMeasureSpec(j4 - j5, l4);
        i = 0;
_L24:
        if (i < l5)
        {
            break MISSING_BLOCK_LABEL_1211;
        }
_L15:
        i = j4;
        if (l4 != 0x40000000)
        {
            i = k;
        }
        setMeasuredDimension(i5, i);
        return;
_L2:
        view = getChildAt(l1);
        if (view.getVisibility() == 8)
        {
            l7 = l6;
            i2 = j1;
            j2 = l;
        } else
        {
            flag = view instanceof ActionMenuItemView;
            l2 = k1 + 1;
            if (flag)
            {
                view.setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
            }
            layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.expanded = false;
            layoutparams.extraPixels = 0;
            layoutparams.cellsUsed = 0;
            layoutparams.expandable = false;
            layoutparams.leftMargin = 0;
            layoutparams.rightMargin = 0;
            if (flag && ((ActionMenuItemView)view).hasText())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            layoutparams.preventEdgeOffset = flag;
            if (layoutparams.isOverflowButton)
            {
                k1 = 1;
            } else
            {
                k1 = i;
            }
            i6 = measureChildForCells(view, k5, k1, j, j5);
            j3 = Math.max(j1, i6);
            j1 = i1;
            if (layoutparams.expandable)
            {
                j1 = i1 + 1;
            }
            if (layoutparams.isOverflowButton)
            {
                l = 1;
            }
            l3 = i - i6;
            k4 = Math.max(k, view.getMeasuredHeight());
            i = l3;
            i1 = j1;
            j2 = l;
            i2 = j3;
            k = k4;
            l7 = l6;
            k1 = l2;
            if (i6 == 1)
            {
                l7 = l6 | (long)(1 << l1);
                i = l3;
                i1 = j1;
                j2 = l;
                i2 = j3;
                k = k4;
                k1 = l2;
            }
        }
        l1++;
        l = j2;
        j1 = i2;
        l6 = l7;
          goto _L16
_L6:
        k2 = 0x7fffffff;
        l8 = 0L;
        i4 = 0;
        i3 = 0;
_L21:
        if (i3 < l5) goto _L18; else goto _L17
_L17:
        l6 |= l8;
        l7 = l6;
        if (i4 > i2) goto _L4; else goto _L19
_L19:
        i = 0;
_L22:
        if (i < l5)
        {
            break MISSING_BLOCK_LABEL_891;
        }
        j = 1;
          goto _L20
_L18:
        obj = (LayoutParams)getChildAt(i3).getLayoutParams();
        if (!((LayoutParams) (obj)).expandable)
        {
            i = i4;
            l7 = l8;
            k3 = k2;
        } else
        if (((LayoutParams) (obj)).cellsUsed < k2)
        {
            k3 = ((LayoutParams) (obj)).cellsUsed;
            l7 = 1 << i3;
            i = 1;
        } else
        {
            k3 = k2;
            l7 = l8;
            i = i4;
            if (((LayoutParams) (obj)).cellsUsed == k2)
            {
                l7 = l8 | (long)(1 << i3);
                i = i4 + 1;
                k3 = k2;
            }
        }
        i3++;
        k2 = k3;
        l8 = l7;
        i4 = i;
          goto _L21
        obj = getChildAt(i);
        layoutparams1 = (LayoutParams)((View) (obj)).getLayoutParams();
        if (((long)(1 << i) & l8) == 0L)
        {
            j = i2;
            l7 = l6;
            if (layoutparams1.cellsUsed == k2 + 1)
            {
                l7 = l6 | (long)(1 << i);
                j = i2;
            }
        } else
        {
            if (l1 != 0 && layoutparams1.preventEdgeOffset && i2 == 1)
            {
                ((View) (obj)).setPadding(mGeneratedItemPadding + k5, 0, mGeneratedItemPadding, 0);
            }
            layoutparams1.cellsUsed = layoutparams1.cellsUsed + 1;
            layoutparams1.expanded = true;
            j = i2 - 1;
            l7 = l6;
        }
        i++;
        i2 = j;
        l6 = l7;
          goto _L22
_L13:
        if (((long)(1 << i1) & l7) == 0L)
        {
            i = j;
        } else
        {
            View view1 = getChildAt(i1);
            LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
            if (view1 instanceof ActionMenuItemView)
            {
                layoutparams2.extraPixels = l;
                layoutparams2.expanded = true;
                if (i1 == 0 && !layoutparams2.preventEdgeOffset)
                {
                    layoutparams2.leftMargin = -l / 2;
                }
                i = 1;
            } else
            if (layoutparams2.isOverflowButton)
            {
                layoutparams2.extraPixels = l;
                layoutparams2.expanded = true;
                layoutparams2.rightMargin = -l / 2;
                i = 1;
            } else
            {
                if (i1 != 0)
                {
                    layoutparams2.leftMargin = l / 2;
                }
                i = j;
                if (i1 != l5 - 1)
                {
                    layoutparams2.rightMargin = l / 2;
                    i = j;
                }
            }
        }
        i1++;
        j = i;
          goto _L23
        View view2 = getChildAt(i);
        LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
        if (layoutparams3.expanded)
        {
            view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams3.cellsUsed * k5 + layoutparams3.extraPixels, 0x40000000), j);
        }
        i++;
          goto _L24
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
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

    protected boolean hasDividerBeforeChildAt(int i)
    {
        boolean flag1;
        if (i == 0)
        {
            flag1 = false;
        } else
        {
            View view = getChildAt(i - 1);
            View view1 = getChildAt(i);
            flag1 = false;
            boolean flag = flag1;
            if (i < getChildCount())
            {
                flag = flag1;
                if (view instanceof ActionMenuChildView)
                {
                    flag = false | ((ActionMenuChildView)view).needsDividerAfter();
                }
            }
            flag1 = flag;
            if (i > 0)
            {
                flag1 = flag;
                if (view1 instanceof ActionMenuChildView)
                {
                    return flag | ((ActionMenuChildView)view1).needsDividerBefore();
                }
            }
        }
        return flag1;
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
        if (IS_FROYO)
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

    protected void onDraw(Canvas canvas)
    {
        if (!IS_FROYO && mFirst)
        {
            mFirst = false;
            requestLayout();
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mFormatItems) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i, j, k, l);
_L8:
        return;
_L2:
        int i1;
        int k1;
        int j2;
        int k2;
        k2 = getChildCount();
        j2 = (j + l) / 2;
        l = 0;
        j = k - i - getPaddingRight() - getPaddingLeft();
        k1 = 0;
        i1 = 0;
_L4:
        View view1;
        if (i1 >= k2)
        {
            if (k2 == 1 && k1 == 0)
            {
                View view = getChildAt(0);
                j = view.getMeasuredWidth();
                l = view.getMeasuredHeight();
                i = (k - i) / 2 - j / 2;
                k = j2 - l / 2;
                view.layout(i, k, i + j, k + l);
                return;
            }
            break MISSING_BLOCK_LABEL_295;
        }
        view1 = getChildAt(i1);
        if (view1.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
        if (layoutparams.isOverflowButton)
        {
            int i2 = view1.getMeasuredWidth();
            k1 = i2;
            if (hasDividerBeforeChildAt(i1))
            {
                k1 = i2 + 0;
            }
            i2 = view1.getMeasuredHeight();
            int l2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
            int i3 = j2 - i2 / 2;
            view1.layout(l2 - k1, i3, l2, i3 + i2);
            j -= k1;
            k1 = 1;
        } else
        {
            j -= view1.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
            l++;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        if (k1 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = l - i;
        if (i > 0)
        {
            i = j / i;
        } else
        {
            i = 0;
        }
        l = Math.max(0, i);
        j = getPaddingLeft();
        i = 0;
        while (i < k2) 
        {
            View view2 = getChildAt(i);
            LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
            k = j;
            if (view2.getVisibility() != 8)
            {
                if (layoutparams1.isOverflowButton)
                {
                    k = j;
                } else
                {
                    j += layoutparams1.leftMargin;
                    k = view2.getMeasuredWidth();
                    int j1 = view2.getMeasuredHeight();
                    int l1 = j2 - j1 / 2;
                    view2.layout(j, l1, j + k, l1 + j1);
                    k = j + (layoutparams1.rightMargin + k + l);
                }
            }
            i++;
            j = k;
        }
        if (true) goto _L8; else goto _L7
_L7:
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
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setOverflowReserved(boolean flag)
    {
        mReserveOverflow = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_FROYO = flag;
    }
}
