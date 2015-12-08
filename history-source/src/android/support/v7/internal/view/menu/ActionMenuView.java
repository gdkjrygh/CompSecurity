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
        mGeneratedItemPadding = (int)(4F * f);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        mMaxItemHeight = context.getDimensionPixelSize(0, 0);
        context.recycle();
    }

    static int measureChildForCells(View view, int i, int j, int k, int l)
    {
        boolean flag;
label0:
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
            ActionMenuItemView actionmenuitemview;
            int i1;
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
            i1 = 0;
            k = i1;
            if (j <= 0)
            {
                break label0;
            }
            if (l != 0)
            {
                k = i1;
                if (j < 2)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), j1);
            i1 = view.getMeasuredWidth();
            k = i1 / i;
            j = k;
            if (i1 % i != 0)
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
        }
        if (!layoutparams.isOverflowButton && l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        layoutparams.expandable = flag;
        layoutparams.cellsUsed = k;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), j1);
        return k;
    }

    private void onMeasureExactFormat(int i, int j)
    {
        int i5 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        int l4 = android.view.View.MeasureSpec.getSize(j);
        j = getPaddingLeft();
        int k = getPaddingRight();
        int i6 = getPaddingTop() + getPaddingBottom();
        int i2;
        int j5;
        if (i5 == 0x40000000)
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - i6, 0x40000000);
        } else
        {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mMaxItemHeight, l4 - i6), 0x80000000);
        }
        j5 = i - (j + k);
        j = j5 / mMinCellSize;
        i = mMinCellSize;
        if (j == 0)
        {
            setMeasuredDimension(j5, 0);
            return;
        }
        int k5 = mMinCellSize + (j5 % i) / j;
        k = 0;
        int j2 = 0;
        int i1 = 0;
        int k2 = 0;
        boolean flag = false;
        long l6 = 0L;
        int l5 = getChildCount();
        int j1 = 0;
        while (j1 < l5) 
        {
            View view = getChildAt(j1);
            boolean flag1;
            long l7;
            if (view.getVisibility() == 8)
            {
                l7 = l6;
                flag1 = flag;
            } else
            {
                boolean flag3 = view instanceof ActionMenuItemView;
                int l2 = k2 + 1;
                if (flag3)
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
                int j3;
                int l3;
                int j4;
                int j6;
                if (flag3 && ((ActionMenuItemView)view).hasText())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                layoutparams1.preventEdgeOffset = flag3;
                if (layoutparams1.isOverflowButton)
                {
                    i = 1;
                } else
                {
                    i = j;
                }
                j6 = measureChildForCells(view, k5, i, i2, i6);
                j3 = Math.max(j2, j6);
                i = i1;
                if (layoutparams1.expandable)
                {
                    i = i1 + 1;
                }
                if (layoutparams1.isOverflowButton)
                {
                    flag = true;
                }
                l3 = j - j6;
                j4 = Math.max(k, view.getMeasuredHeight());
                j = l3;
                i1 = i;
                flag1 = flag;
                j2 = j3;
                k = j4;
                l7 = l6;
                k2 = l2;
                if (j6 == 1)
                {
                    l7 = l6 | (long)(1 << j1);
                    j = l3;
                    i1 = i;
                    flag1 = flag;
                    j2 = j3;
                    k = j4;
                    k2 = l2;
                }
            }
            j1++;
            flag = flag1;
            l6 = l7;
        }
        boolean flag2;
        if (flag && k2 == 2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = 0;
        do
        {
            int l;
label0:
            {
label1:
                {
label2:
                    {
                        long l8 = l6;
                        int i3;
                        long l9;
                        if (i1 > 0)
                        {
                            l8 = l6;
                            if (j > 0)
                            {
                                i3 = 0x7fffffff;
                                l9 = 0L;
                                int k4 = 0;
                                int k3 = 0;
                                while (k3 < l5) 
                                {
                                    LayoutParams layoutparams = (LayoutParams)getChildAt(k3).getLayoutParams();
                                    int k1;
                                    int i4;
                                    if (!layoutparams.expandable)
                                    {
                                        k1 = k4;
                                        l8 = l9;
                                        i4 = i3;
                                    } else
                                    if (layoutparams.cellsUsed < i3)
                                    {
                                        i4 = layoutparams.cellsUsed;
                                        l8 = 1 << k3;
                                        k1 = 1;
                                    } else
                                    {
                                        i4 = i3;
                                        l8 = l9;
                                        k1 = k4;
                                        if (layoutparams.cellsUsed == i3)
                                        {
                                            l8 = l9 | (long)(1 << k3);
                                            k1 = k4 + 1;
                                            i4 = i3;
                                        }
                                    }
                                    k3++;
                                    i3 = i4;
                                    l9 = l8;
                                    k4 = k1;
                                }
                                l6 |= l9;
                                if (k4 <= j)
                                {
                                    break label2;
                                }
                                l8 = l6;
                            }
                        }
                        float f1;
                        float f2;
                        int l1;
                        if (!flag && k2 == 1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        l = j;
                        i1 = i;
                        if (j <= 0)
                        {
                            break label0;
                        }
                        l = j;
                        i1 = i;
                        if (l8 == 0L)
                        {
                            break label0;
                        }
                        if (j >= k2 - 1 && l1 == 0)
                        {
                            l = j;
                            i1 = i;
                            if (j2 <= 1)
                            {
                                break label0;
                            }
                        }
                        f2 = Long.bitCount(l8);
                        f1 = f2;
                        if (l1 == 0)
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
                            if (((long)(1 << l5 - 1) & l8) != 0L)
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
                            l = (int)((float)(j * k5) / f1);
                        } else
                        {
                            l = 0;
                        }
                        i1 = 0;
                        while (i1 < l5) 
                        {
                            View view1;
                            LayoutParams layoutparams2;
                            if (((long)(1 << i1) & l8) == 0L)
                            {
                                j = i;
                            } else
                            {
                                View view2 = getChildAt(i1);
                                LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
                                if (view2 instanceof ActionMenuItemView)
                                {
                                    layoutparams3.extraPixels = l;
                                    layoutparams3.expanded = true;
                                    if (i1 == 0 && !layoutparams3.preventEdgeOffset)
                                    {
                                        layoutparams3.leftMargin = -l / 2;
                                    }
                                    j = 1;
                                } else
                                if (layoutparams3.isOverflowButton)
                                {
                                    layoutparams3.extraPixels = l;
                                    layoutparams3.expanded = true;
                                    layoutparams3.rightMargin = -l / 2;
                                    j = 1;
                                } else
                                {
                                    if (i1 != 0)
                                    {
                                        layoutparams3.leftMargin = l / 2;
                                    }
                                    j = i;
                                    if (i1 != l5 - 1)
                                    {
                                        layoutparams3.rightMargin = l / 2;
                                        j = i;
                                    }
                                }
                            }
                            i1++;
                            i = j;
                        }
                        break label1;
                    }
                    i = 0;
                    while (i < l5) 
                    {
                        view1 = getChildAt(i);
                        layoutparams2 = (LayoutParams)view1.getLayoutParams();
                        if (((long)(1 << i) & l9) == 0L)
                        {
                            l1 = j;
                            l8 = l6;
                            if (layoutparams2.cellsUsed == i3 + 1)
                            {
                                l8 = l6 | (long)(1 << i);
                                l1 = j;
                            }
                        } else
                        {
                            if (flag2 && layoutparams2.preventEdgeOffset && j == 1)
                            {
                                view1.setPadding(mGeneratedItemPadding + k5, 0, mGeneratedItemPadding, 0);
                            }
                            layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
                            layoutparams2.expanded = true;
                            l1 = j - 1;
                            l8 = l6;
                        }
                        i++;
                        j = l1;
                        l6 = l8;
                    }
                    i = 1;
                    continue;
                }
                l = 0;
                i1 = i;
            }
            if (i1 != 0)
            {
                i = 0;
                while (i < l5) 
                {
                    View view3 = getChildAt(i);
                    LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
                    if (layoutparams4.expanded)
                    {
                        view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * k5 + layoutparams4.extraPixels, 0x40000000), i2);
                    }
                    i++;
                }
            }
            i = l4;
            if (i5 != 0x40000000)
            {
                i = k;
            }
            setMeasuredDimension(j5, i);
            mMeasuredExtraWidth = l * k5;
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
        flag1 = flag;
        if (i > 0)
        {
            flag1 = flag;
            if (view1 instanceof ActionMenuChildView)
            {
                flag1 = flag | ((ActionMenuChildView)view1).needsDividerBefore();
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
            int i3 = getChildCount();
            int l2 = (j + l) / 2;
            int j3 = getSupportDividerWidth();
            int k1 = 0;
            l = 0;
            j = k - i - getPaddingRight() - getPaddingLeft();
            int i2 = 0;
            int i1 = 0;
            while (i1 < i3) 
            {
                View view = getChildAt(i1);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (layoutparams.isOverflowButton)
                    {
                        int j2 = view.getMeasuredWidth();
                        i2 = j2;
                        if (hasSupportDividerBeforeChildAt(i1))
                        {
                            i2 = j2 + j3;
                        }
                        j2 = view.getMeasuredHeight();
                        int k3 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        int l3 = l2 - j2 / 2;
                        view.layout(k3 - i2, l3, k3, l3 + j2);
                        j -= i2;
                        i2 = 1;
                    } else
                    {
                        int k2 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                        k1 += k2;
                        k2 = j - k2;
                        j = k1;
                        if (hasSupportDividerBeforeChildAt(i1))
                        {
                            j = k1 + j3;
                        }
                        l++;
                        k1 = j;
                        j = k2;
                    }
                }
                i1++;
            }
            if (i3 == 1 && i2 == 0)
            {
                View view1 = getChildAt(0);
                j = view1.getMeasuredWidth();
                l = view1.getMeasuredHeight();
                i = (k - i) / 2 - j / 2;
                k = l2 - l / 2;
                view1.layout(i, k, i + j, k + l);
                return;
            }
            if (i2 != 0)
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
            while (i < i3) 
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
                        int l1 = l2 - j1 / 2;
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
