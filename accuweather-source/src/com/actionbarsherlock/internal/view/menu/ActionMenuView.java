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
        int i5 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        int k4 = android.view.View.MeasureSpec.getSize(j);
        int k = getPaddingLeft();
        int l = getPaddingRight();
        int k5 = getPaddingTop() + getPaddingBottom();
        int j5 = i - (k + l);
        i = j5 / mMinCellSize;
        k = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(j5, 0);
            return;
        }
        int l5 = mMinCellSize + (j5 % k) / i;
        k = 0;
        int k1 = 0;
        int j1 = 0;
        int l1 = 0;
        boolean flag = false;
        long l6 = 0L;
        int i6 = getChildCount();
        int i2 = 0;
        while (i2 < i6) 
        {
            View view = getChildAt(i2);
            int j2;
            boolean flag1;
            long l7;
            if (view.getVisibility() == 8)
            {
                l7 = l6;
                j2 = k1;
                flag1 = flag;
            } else
            {
                boolean flag2 = view instanceof ActionMenuItemView;
                int i3 = l1 + 1;
                if (flag2)
                {
                    view.setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
                }
                LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
                layoutparams1.expanded = false;
                layoutparams1.extraPixels = 0;
                layoutparams1.cellsUsed = 0;
                layoutparams1.expandable = false;
                layoutparams1.leftMargin = 0;
                layoutparams1.rightMargin = 0;
                int k3;
                int i4;
                int l4;
                int j6;
                if (flag2 && ((ActionMenuItemView)view).hasText())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                layoutparams1.preventEdgeOffset = flag2;
                if (layoutparams1.isOverflowButton)
                {
                    l1 = 1;
                } else
                {
                    l1 = i;
                }
                j6 = measureChildForCells(view, l5, l1, j, k5);
                k3 = Math.max(k1, j6);
                k1 = j1;
                if (layoutparams1.expandable)
                {
                    k1 = j1 + 1;
                }
                if (layoutparams1.isOverflowButton)
                {
                    flag = true;
                }
                i4 = i - j6;
                l4 = Math.max(k, view.getMeasuredHeight());
                i = i4;
                j1 = k1;
                flag1 = flag;
                j2 = k3;
                k = l4;
                l7 = l6;
                l1 = i3;
                if (j6 == 1)
                {
                    l7 = l6 | (long)(1 << i2);
                    i = i4;
                    j1 = k1;
                    flag1 = flag;
                    j2 = k3;
                    k = l4;
                    l1 = i3;
                }
            }
            i2++;
            flag = flag1;
            k1 = j2;
            l6 = l7;
        }
        int k2;
        if (flag && l1 == 2)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        j = 0;
        k2 = i;
        do
        {
            int i1;
label0:
            {
label1:
                {
label2:
                    {
                        long l8 = l6;
                        int l2;
                        long l9;
                        if (j1 > 0)
                        {
                            l8 = l6;
                            if (k2 > 0)
                            {
                                l2 = 0x7fffffff;
                                l9 = 0L;
                                int j4 = 0;
                                int j3 = 0;
                                while (j3 < i6) 
                                {
                                    LayoutParams layoutparams = (LayoutParams)getChildAt(j3).getLayoutParams();
                                    int l3;
                                    if (!layoutparams.expandable)
                                    {
                                        i = j4;
                                        l8 = l9;
                                        l3 = l2;
                                    } else
                                    if (layoutparams.cellsUsed < l2)
                                    {
                                        l3 = layoutparams.cellsUsed;
                                        l8 = 1 << j3;
                                        i = 1;
                                    } else
                                    {
                                        l3 = l2;
                                        l8 = l9;
                                        i = j4;
                                        if (layoutparams.cellsUsed == l2)
                                        {
                                            l8 = l9 | (long)(1 << j3);
                                            i = j4 + 1;
                                            l3 = l2;
                                        }
                                    }
                                    j3++;
                                    l2 = l3;
                                    l9 = l8;
                                    j4 = i;
                                }
                                l6 |= l9;
                                if (j4 <= k2)
                                {
                                    break label2;
                                }
                                l8 = l6;
                            }
                        }
                        float f1;
                        float f2;
                        if (!flag && l1 == 1)
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        i1 = j;
                        if (k2 <= 0)
                        {
                            break label0;
                        }
                        i1 = j;
                        if (l8 == 0L)
                        {
                            break label0;
                        }
                        if (k2 >= l1 - 1 && i == 0)
                        {
                            i1 = j;
                            if (k1 <= 1)
                            {
                                break label0;
                            }
                        }
                        f2 = Long.bitCount(l8);
                        f1 = f2;
                        if (i == 0)
                        {
                            float f = f2;
                            if ((1L & l8) != 0L)
                            {
                                f = f2;
                                if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
                                {
                                    f = f2 - 0.5F;
                                }
                            }
                            f1 = f;
                            if (((long)(1 << i6 - 1) & l8) != 0L)
                            {
                                f1 = f;
                                if (!((LayoutParams)getChildAt(i6 - 1).getLayoutParams()).preventEdgeOffset)
                                {
                                    f1 = f - 0.5F;
                                }
                            }
                        }
                        if (f1 > 0.0F)
                        {
                            i1 = (int)((float)(k2 * l5) / f1);
                        } else
                        {
                            i1 = 0;
                        }
                        j1 = 0;
                        while (j1 < i6) 
                        {
                            View view1;
                            LayoutParams layoutparams2;
                            if (((long)(1 << j1) & l8) == 0L)
                            {
                                i = j;
                            } else
                            {
                                View view2 = getChildAt(j1);
                                LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
                                if (view2 instanceof ActionMenuItemView)
                                {
                                    layoutparams3.extraPixels = i1;
                                    layoutparams3.expanded = true;
                                    if (j1 == 0 && !layoutparams3.preventEdgeOffset)
                                    {
                                        layoutparams3.leftMargin = -i1 / 2;
                                    }
                                    i = 1;
                                } else
                                if (layoutparams3.isOverflowButton)
                                {
                                    layoutparams3.extraPixels = i1;
                                    layoutparams3.expanded = true;
                                    layoutparams3.rightMargin = -i1 / 2;
                                    i = 1;
                                } else
                                {
                                    if (j1 != 0)
                                    {
                                        layoutparams3.leftMargin = i1 / 2;
                                    }
                                    i = j;
                                    if (j1 != i6 - 1)
                                    {
                                        layoutparams3.rightMargin = i1 / 2;
                                        i = j;
                                    }
                                }
                            }
                            j1++;
                            j = i;
                        }
                        break label1;
                    }
                    i = 0;
                    while (i < i6) 
                    {
                        view1 = getChildAt(i);
                        layoutparams2 = (LayoutParams)view1.getLayoutParams();
                        if (((long)(1 << i) & l9) == 0L)
                        {
                            j = k2;
                            l8 = l6;
                            if (layoutparams2.cellsUsed == l2 + 1)
                            {
                                l8 = l6 | (long)(1 << i);
                                j = k2;
                            }
                        } else
                        {
                            if (i2 && layoutparams2.preventEdgeOffset && k2 == 1)
                            {
                                view1.setPadding(mGeneratedItemPadding + l5, 0, mGeneratedItemPadding, 0);
                            }
                            layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
                            layoutparams2.expanded = true;
                            j = k2 - 1;
                            l8 = l6;
                        }
                        i++;
                        k2 = j;
                        l6 = l8;
                    }
                    j = 1;
                    continue;
                }
                i1 = j;
            }
            if (i1 != 0)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(k4 - k5, i5);
                i = 0;
                while (i < i6) 
                {
                    View view3 = getChildAt(i);
                    LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
                    if (layoutparams4.expanded)
                    {
                        view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * l5 + layoutparams4.extraPixels, 0x40000000), j);
                    }
                    i++;
                }
            }
            i = k4;
            if (i5 != 0x40000000)
            {
                i = k;
            }
            setMeasuredDimension(j5, i);
            return;
        } while (true);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
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
        if (!mFormatItems)
        {
            super.onLayout(flag, i, j, k, l);
        } else
        {
            int k2 = getChildCount();
            int j2 = (j + l) / 2;
            l = 0;
            j = k - i - getPaddingRight() - getPaddingLeft();
            int k1 = 0;
            int i1 = 0;
            while (i1 < k2) 
            {
                View view = getChildAt(i1);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (layoutparams.isOverflowButton)
                    {
                        int i2 = view.getMeasuredWidth();
                        k1 = i2;
                        if (hasDividerBeforeChildAt(i1))
                        {
                            k1 = i2 + 0;
                        }
                        i2 = view.getMeasuredHeight();
                        int l2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        int i3 = j2 - i2 / 2;
                        view.layout(l2 - k1, i3, l2, i3 + i2);
                        j -= k1;
                        k1 = 1;
                    } else
                    {
                        j -= view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                        l++;
                    }
                }
                i1++;
            }
            if (k2 == 1 && k1 == 0)
            {
                View view1 = getChildAt(0);
                j = view1.getMeasuredWidth();
                l = view1.getMeasuredHeight();
                i = (k - i) / 2 - j / 2;
                k = j2 - l / 2;
                view1.layout(i, k, i + j, k + l);
                return;
            }
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
