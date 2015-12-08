// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuView;
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
    implements android.support.v7.internal.view.menu.MenuBuilder.ItemInvoker, MenuView
{
    public static interface ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

    final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ActionMenuView this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
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

    final class MenuBuilderCallback
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        final ActionMenuView this$0;

        public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            return mOnMenuItemClickListener != null && mOnMenuItemClickListener.onMenuItemClick(menuitem);
        }

        public final void onMenuModeChange(MenuBuilder menubuilder)
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


    private android.support.v7.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private Context mContext;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private android.support.v7.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
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
        mContext = context;
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        mMinCellSize = (int)(56F * f);
        mGeneratedItemPadding = (int)(4F * f);
        mPopupContext = context;
        mPopupTheme = 0;
    }

    private static LayoutParams generateDefaultLayoutParams()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    private LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    private boolean hasSupportDividerBeforeChildAt(int i)
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
                    flag = ((ActionMenuChildView)view).needsDividerAfter() | false;
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
        int k;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
label0:
        {
            l4 = android.view.View.MeasureSpec.getMode(j);
            i = android.view.View.MeasureSpec.getSize(i);
            k4 = android.view.View.MeasureSpec.getSize(j);
            k = getPaddingLeft();
            int l = getPaddingRight();
            int i6 = getPaddingTop() + getPaddingBottom();
            i5 = getChildMeasureSpec(j, i6, -2);
            j5 = i - (k + l);
            i = j5 / mMinCellSize;
            j = mMinCellSize;
            if (i == 0)
            {
                setMeasuredDimension(j5, 0);
                return;
            }
            k5 = mMinCellSize + (j5 % j) / i;
            k = 0;
            int j1 = 0;
            int i1 = 0;
            int k1 = 0;
            boolean flag = false;
            long l6 = 0L;
            l5 = getChildCount();
            int l1 = 0;
            while (l1 < l5) 
            {
                View view = getChildAt(l1);
                int i2 = i;
                int k2 = i1;
                boolean flag1 = flag;
                int j3 = j1;
                int l3 = k;
                long l7 = l6;
                int j4 = k1;
                if (view.getVisibility() != 8)
                {
                    boolean flag2 = view instanceof ActionMenuItemView;
                    k1++;
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
                        j = 1;
                    } else
                    {
                        j = i;
                    }
                    j6 = measureChildForCells(view, k5, j, i5, i6);
                    j1 = Math.max(j1, j6);
                    j = i1;
                    if (layoutparams1.expandable)
                    {
                        j = i1 + 1;
                    }
                    if (layoutparams1.isOverflowButton)
                    {
                        flag = true;
                    }
                    i -= j6;
                    k = Math.max(k, view.getMeasuredHeight());
                    i2 = i;
                    k2 = j;
                    flag1 = flag;
                    j3 = j1;
                    l3 = k;
                    l7 = l6;
                    j4 = k1;
                    if (j6 == 1)
                    {
                        l7 = l6 | (long)(1 << l1);
                        j4 = k1;
                        l3 = k;
                        j3 = j1;
                        flag1 = flag;
                        k2 = j;
                        i2 = i;
                    }
                }
                l1++;
                i = i2;
                i1 = k2;
                flag = flag1;
                j1 = j3;
                k = l3;
                l6 = l7;
                k1 = j4;
            }
            int j2;
            long l8;
            if (flag && k1 == 2)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            j = 0;
            j2 = i;
            do
            {
                l8 = l6;
                if (i1 <= 0)
                {
                    break;
                }
                l8 = l6;
                if (j2 <= 0)
                {
                    break;
                }
                int l2 = 0x7fffffff;
                long l9 = 0L;
                int k3 = 0;
                int i3 = 0;
                while (i3 < l5) 
                {
                    LayoutParams layoutparams = (LayoutParams)getChildAt(i3).getLayoutParams();
                    int i4 = l2;
                    i = k3;
                    l8 = l9;
                    if (layoutparams.expandable)
                    {
                        if (layoutparams.cellsUsed < l2)
                        {
                            i4 = layoutparams.cellsUsed;
                            l8 = 1 << i3;
                            i = 1;
                        } else
                        {
                            i4 = l2;
                            i = k3;
                            l8 = l9;
                            if (layoutparams.cellsUsed == l2)
                            {
                                l8 = l9 | (long)(1 << i3);
                                i = k3 + 1;
                                i4 = l2;
                            }
                        }
                    }
                    i3++;
                    l2 = i4;
                    k3 = i;
                    l9 = l8;
                }
                l6 |= l9;
                l8 = l6;
                if (k3 > j2)
                {
                    break;
                }
                i = 0;
                while (i < l5) 
                {
                    View view1 = getChildAt(i);
                    LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
                    if (((long)(1 << i) & l9) == 0L)
                    {
                        j = j2;
                        l8 = l6;
                        if (layoutparams2.cellsUsed == l2 + 1)
                        {
                            l8 = l6 | (long)(1 << i);
                            j = j2;
                        }
                    } else
                    {
                        if (l1 && layoutparams2.preventEdgeOffset && j2 == 1)
                        {
                            view1.setPadding(mGeneratedItemPadding + k5, 0, mGeneratedItemPadding, 0);
                        }
                        layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
                        layoutparams2.expanded = true;
                        j = j2 - 1;
                        l8 = l6;
                    }
                    i++;
                    j2 = j;
                    l6 = l8;
                }
                j = 1;
            } while (true);
            float f1;
            float f2;
            if (!flag && k1 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = j;
            if (j2 <= 0)
            {
                break label0;
            }
            i = j;
            if (l8 == 0L)
            {
                break label0;
            }
            if (j2 >= k1 - 1 && flag == 0)
            {
                i = j;
                if (j1 <= 1)
                {
                    break label0;
                }
            }
            f2 = Long.bitCount(l8);
            f1 = f2;
            if (flag == 0)
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
                flag = (int)((float)(j2 * k5) / f1);
            } else
            {
                flag = false;
            }
            i1 = 0;
            do
            {
                i = j;
                if (i1 >= l5)
                {
                    break;
                }
                i = j;
                if (((long)(1 << i1) & l8) != 0L)
                {
                    View view2 = getChildAt(i1);
                    LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
                    if (view2 instanceof ActionMenuItemView)
                    {
                        layoutparams3.extraPixels = ((flag) ? 1 : 0);
                        layoutparams3.expanded = true;
                        if (i1 == 0 && !layoutparams3.preventEdgeOffset)
                        {
                            layoutparams3.leftMargin = -flag / 2;
                        }
                        i = 1;
                    } else
                    if (layoutparams3.isOverflowButton)
                    {
                        layoutparams3.extraPixels = ((flag) ? 1 : 0);
                        layoutparams3.expanded = true;
                        layoutparams3.rightMargin = -flag / 2;
                        i = 1;
                    } else
                    {
                        if (i1 != 0)
                        {
                            layoutparams3.leftMargin = flag / 2;
                        }
                        i = j;
                        if (i1 != l5 - 1)
                        {
                            layoutparams3.rightMargin = flag / 2;
                            i = j;
                        }
                    }
                }
                i1++;
                j = i;
            } while (true);
        }
        if (i != 0)
        {
            for (i = 0; i < l5; i++)
            {
                View view3 = getChildAt(i);
                LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
                if (layoutparams4.expanded)
                {
                    view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * k5 + layoutparams4.extraPixels, 0x40000000), i5);
                }
            }

        }
        i = k4;
        if (l4 != 0x40000000)
        {
            i = k;
        }
        setMeasuredDimension(j5, i);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public final void dismissPopupMenus()
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

    protected final volatile LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected final LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

    public final volatile LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected final volatile LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

    public final LayoutParams generateOverflowButtonLayoutParams()
    {
        LayoutParams layoutparams = generateDefaultLayoutParams();
        layoutparams.isOverflowButton = true;
        return layoutparams;
    }

    public final Menu getMenu()
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
            actionmenupresenter.setCallback(((android.support.v7.internal.view.menu.MenuPresenter.Callback) (obj)));
            mMenu.addMenuPresenter(mPresenter, mPopupContext);
            mPresenter.setMenuView(this);
        }
        return mMenu;
    }

    public final boolean hideOverflowMenu()
    {
        return mPresenter != null && mPresenter.hideOverflowMenu();
    }

    public final void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public final boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, 0);
    }

    public final boolean isOverflowMenuShowPending()
    {
        return mPresenter != null && mPresenter.isOverflowMenuShowPending();
    }

    public final boolean isOverflowMenuShowing()
    {
        return mPresenter != null && mPresenter.isOverflowMenuShowing();
    }

    public final boolean isOverflowReserved()
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
        int j3;
        int k3;
        k3 = getChildCount();
        j3 = (l - j) / 2;
        int l3 = getDividerWidth();
        l = 0;
        int i1 = k - i - getPaddingRight() - getPaddingLeft();
        int k2 = 0;
        flag = ViewUtils.isLayoutRtl(this);
        int l1 = 0;
        while (l1 < k3) 
        {
            View view = getChildAt(l1);
            int l2 = k2;
            int i3 = l;
            j = i1;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.isOverflowButton)
                {
                    k2 = view.getMeasuredWidth();
                    j = k2;
                    if (hasSupportDividerBeforeChildAt(l1))
                    {
                        j = k2 + l3;
                    }
                    i3 = view.getMeasuredHeight();
                    int i4;
                    if (flag)
                    {
                        k2 = getPaddingLeft() + layoutparams.leftMargin;
                        l2 = k2 + j;
                    } else
                    {
                        l2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        k2 = l2 - j;
                    }
                    i4 = j3 - i3 / 2;
                    view.layout(k2, i4, l2, i4 + i3);
                    j = i1 - j;
                    l2 = 1;
                    i3 = l;
                } else
                {
                    j = i1 - (view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin);
                    hasSupportDividerBeforeChildAt(l1);
                    i3 = l + 1;
                    l2 = k2;
                }
            }
            l1++;
            k2 = l2;
            l = i3;
            i1 = j;
        }
        if (k3 == 1 && k2 == 0)
        {
            View view1 = getChildAt(0);
            j = view1.getMeasuredWidth();
            l = view1.getMeasuredHeight();
            i = (k - i) / 2 - j / 2;
            k = j3 - l / 2;
            view1.layout(i, k, i + j, k + l);
            return;
        }
        if (k2 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = l - i;
        if (i > 0)
        {
            i = i1 / i;
        } else
        {
            i = 0;
        }
        l = Math.max(0, i);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = getWidth() - getPaddingRight();
        i = 0;
        while (i < k3) 
        {
            View view2 = getChildAt(i);
            LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
            k = j;
            if (view2.getVisibility() != 8)
            {
                k = j;
                if (!layoutparams1.isOverflowButton)
                {
                    j -= layoutparams1.rightMargin;
                    k = view2.getMeasuredWidth();
                    int j1 = view2.getMeasuredHeight();
                    int i2 = j3 - j1 / 2;
                    view2.layout(j - k, i2, j, i2 + j1);
                    k = j - (layoutparams1.leftMargin + k + l);
                }
            }
            i++;
            j = k;
        }
        if (true) goto _L4; else goto _L3
_L3:
        j = getPaddingLeft();
        i = 0;
        while (i < k3) 
        {
            View view3 = getChildAt(i);
            LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
            k = j;
            if (view3.getVisibility() != 8)
            {
                k = j;
                if (!layoutparams2.isOverflowButton)
                {
                    j += layoutparams2.leftMargin;
                    k = view3.getMeasuredWidth();
                    int k1 = view3.getMeasuredHeight();
                    int j2 = j3 - k1 / 2;
                    view3.layout(j, j2, j + k, j2 + k1);
                    k = j + (layoutparams2.rightMargin + k + l);
                }
            }
            i++;
            j = k;
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

    public final MenuBuilder peekMenu()
    {
        return mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        mPresenter.setExpandedActionViewsExclusive(flag);
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.MenuPresenter.Callback callback, android.support.v7.internal.view.menu.MenuBuilder.Callback callback1)
    {
        mActionMenuPresenterCallback = callback;
        mMenuBuilderCallback = callback1;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
        mOnMenuItemClickListener = onmenuitemclicklistener;
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
                mPopupContext = mContext;
            }
            return;
        }
        mPopupContext = new ContextThemeWrapper(mContext, i);
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
        mPresenter.setMenuView(this);
    }

    public final boolean showOverflowMenu()
    {
        return mPresenter != null && mPresenter.showOverflowMenu();
    }


}
