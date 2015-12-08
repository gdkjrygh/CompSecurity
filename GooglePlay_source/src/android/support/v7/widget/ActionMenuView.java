// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.BaseMenuPresenter;
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

    private final class ActionMenuPresenterCallback
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

        ActionMenuPresenterCallback(byte byte0)
        {
            this();
        }
    }

    public static final class LayoutParams extends LinearLayoutCompat.LayoutParams
    {

        public int cellsUsed;
        public boolean expandable;
        boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;

        public LayoutParams()
        {
            super(-2, -2);
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

    private final class MenuBuilderCallback
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

        MenuBuilderCallback(byte byte0)
        {
            this();
        }
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    android.support.v7.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private Context mContext;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    public MenuBuilder mMenu;
    android.support.v7.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    public ActionMenuPresenter mPresenter;
    public boolean mReserveOverflow;

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
        LayoutParams layoutparams = new LayoutParams();
        layoutparams.gravity = 16;
        return layoutparams;
    }

    private LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected static LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

    public static LayoutParams generateOverflowButtonLayoutParams()
    {
        LayoutParams layoutparams = generateDefaultLayoutParams();
        layoutparams.isOverflowButton = true;
        return layoutparams;
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

    public volatile LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeset)
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

    public final Menu getMenu()
    {
        if (mMenu == null)
        {
            Object obj = getContext();
            mMenu = new MenuBuilder(((Context) (obj)));
            mMenu.setCallback(new MenuBuilderCallback((byte)0));
            mPresenter = new ActionMenuPresenter(((Context) (obj)));
            mPresenter.setReserveOverflow$1385ff();
            ActionMenuPresenter actionmenupresenter = mPresenter;
            if (mActionMenuPresenterCallback != null)
            {
                obj = mActionMenuPresenterCallback;
            } else
            {
                obj = new ActionMenuPresenterCallback((byte)0);
            }
            actionmenupresenter.mCallback = ((android.support.v7.internal.view.menu.MenuPresenter.Callback) (obj));
            mMenu.addMenuPresenter(mPresenter, mPopupContext);
            mPresenter.setMenuView(this);
        }
        return mMenu;
    }

    public final void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public final boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, null, 0);
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
        int i1;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        boolean flag2 = mFormatItems;
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
        if (flag2 != mFormatItems)
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
        if (!mFormatItems || i1 <= 0) goto _L2; else goto _L1
_L1:
        int l;
        int k1;
        int l1;
        int i2;
        int j2;
        int l4;
        int i5;
        long l5;
        i4 = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        l3 = android.view.View.MeasureSpec.getSize(j);
        k = getPaddingLeft();
        i1 = getPaddingRight();
        k3 = getPaddingTop() + getPaddingBottom();
        j4 = getChildMeasureSpec(j, k3, -2);
        k4 = i - (k + i1);
        i = k4 / mMinCellSize;
        j = mMinCellSize;
        if (i == 0)
        {
            setMeasuredDimension(k4, 0);
            return;
        }
        l4 = mMinCellSize + (k4 % j) / i;
        j = 0;
        l1 = 0;
        k1 = 0;
        i2 = 0;
        l = 0;
        l5 = 0L;
        i5 = getChildCount();
        j2 = 0;
_L4:
        int j1;
        int k2;
        boolean flag1;
label0:
        {
            if (j2 >= i5)
            {
                break; /* Loop/switch isn't completed */
            }
            View view = getChildAt(j2);
            if (view.getVisibility() == 8)
            {
                break MISSING_BLOCK_LABEL_1642;
            }
            flag1 = view instanceof ActionMenuItemView;
            k2 = i2 + 1;
            if (flag1)
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
            ActionMenuItemView actionmenuitemview;
            LayoutParams layoutparams2;
            int i3;
            int j5;
            long l6;
            if (flag1 && ((ActionMenuItemView)view).hasText())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            layoutparams1.preventEdgeOffset = flag1;
            if (layoutparams1.isOverflowButton)
            {
                i1 = 1;
            } else
            {
                i1 = i;
            }
            layoutparams2 = (LayoutParams)view.getLayoutParams();
            j5 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j4) - k3, android.view.View.MeasureSpec.getMode(j4));
            if (view instanceof ActionMenuItemView)
            {
                actionmenuitemview = (ActionMenuItemView)view;
            } else
            {
                actionmenuitemview = null;
            }
            if (actionmenuitemview != null && actionmenuitemview.hasText())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i3 = 0;
            i2 = i3;
            if (i1 <= 0)
            {
                break label0;
            }
            if (j1 != 0)
            {
                i2 = i3;
                if (i1 < 2)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l4 * i1, 0x80000000), j5);
            i3 = view.getMeasuredWidth();
            i2 = i3 / l4;
            i1 = i2;
            if (i3 % l4 != 0)
            {
                i1 = i2 + 1;
            }
            i2 = i1;
            if (j1 != 0)
            {
                i2 = i1;
                if (i1 < 2)
                {
                    i2 = 2;
                }
            }
        }
        if (!layoutparams2.isOverflowButton && j1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams2.expandable = flag1;
        layoutparams2.cellsUsed = i2;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 * l4, 0x40000000), j5);
        l1 = Math.max(l1, i2);
        float f;
        float f1;
        float f2;
        Object obj;
        LayoutParams layoutparams;
        int j3;
        long l7;
        long l8;
        if (layoutparams1.expandable)
        {
            i1 = k1 + 1;
        } else
        {
            i1 = k1;
        }
        if (layoutparams1.isOverflowButton)
        {
            j1 = 1;
        } else
        {
            j1 = l;
        }
        l = i - i2;
        i = Math.max(j, view.getMeasuredHeight());
        if (i2 == 1)
        {
            l6 = 1 << j2;
            k1 = i1;
            l5 = l6 | l5;
            j = l1;
            i1 = l;
            l = i;
            i = k2;
        } else
        {
            j = l1;
            l1 = l;
            l = i;
            i = k2;
            k1 = i1;
            i1 = l1;
        }
_L27:
        k2 = j2 + 1;
        j2 = l;
        l = j1;
        i2 = i;
        i = i1;
        l1 = j;
        j = j2;
        j2 = k2;
        if (true) goto _L4; else goto _L3
_L3:
        if (l != 0 && i2 == 2)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        i1 = 0;
        l7 = l5;
        j2 = i;
        i = i1;
_L18:
        l8 = l7;
        if (k1 <= 0) goto _L6; else goto _L5
_L5:
        l8 = l7;
        if (j2 <= 0) goto _L6; else goto _L7
_L7:
        i1 = 0x7fffffff;
        l5 = 0L;
        j1 = 0;
        j3 = 0;
_L14:
        if (j3 >= i5) goto _L9; else goto _L8
_L8:
        obj = (LayoutParams)getChildAt(j3).getLayoutParams();
        if (!((LayoutParams) (obj)).expandable) goto _L11; else goto _L10
_L10:
        if (((LayoutParams) (obj)).cellsUsed >= i1) goto _L13; else goto _L12
_L12:
        j1 = ((LayoutParams) (obj)).cellsUsed;
        l5 = 1 << j3;
        i1 = 1;
_L16:
        k3 = j3 + 1;
        j3 = j1;
        j1 = i1;
        i1 = j3;
        j3 = k3;
          goto _L14
_L13:
        if (((LayoutParams) (obj)).cellsUsed != i1) goto _L11; else goto _L15
_L15:
        l8 = 1 << j3;
        k3 = j1 + 1;
        j1 = i1;
        l5 |= l8;
        i1 = k3;
          goto _L16
_L9:
        l7 |= l5;
        l8 = l7;
        if (j1 > j2) goto _L6; else goto _L17
_L17:
        j1 = 0;
        i = j2;
        while (j1 < i5) 
        {
            obj = getChildAt(j1);
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            if (((long)(1 << j1) & l5) == 0L)
            {
                if (layoutparams.cellsUsed == i1 + 1)
                {
                    l7 |= 1 << j1;
                }
            } else
            {
                if (k2 != 0 && layoutparams.preventEdgeOffset && i == 1)
                {
                    ((View) (obj)).setPadding(mGeneratedItemPadding + l4, 0, mGeneratedItemPadding, 0);
                }
                layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
                layoutparams.expanded = true;
                i--;
            }
            j1++;
        }
        i1 = 1;
        j2 = i;
        i = i1;
          goto _L18
_L6:
        if (l == 0 && i2 == 1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (j2 <= 0 || l8 == 0L || j2 >= i2 - 1 && l == 0 && l1 <= 1) goto _L20; else goto _L19
_L19:
        f2 = Long.bitCount(l8);
        f1 = f2;
        if (l != 0) goto _L22; else goto _L21
_L21:
        f = f2;
        if ((1L & l8) != 0L)
        {
            f = f2;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
            {
                f = f2 - 0.5F;
            }
        }
        f1 = f;
        if (((long)(1 << i5 - 1) & l8) == 0L) goto _L22; else goto _L23
_L23:
        f1 = f;
        if (((LayoutParams)getChildAt(i5 - 1).getLayoutParams()).preventEdgeOffset) goto _L22; else goto _L24
_L24:
        f -= 0.5F;
_L26:
        if (f > 0.0F)
        {
            l = (int)((float)(j2 * l4) / f);
        } else
        {
            l = 0;
        }
        i1 = 0;
        do
        {
            j1 = i;
            if (i1 >= i5)
            {
                break;
            }
            if (((long)(1 << i1) & l8) != 0L)
            {
                obj = getChildAt(i1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.extraPixels = l;
                    layoutparams.expanded = true;
                    if (i1 == 0 && !layoutparams.preventEdgeOffset)
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
                    if (i1 != 0)
                    {
                        layoutparams.leftMargin = l / 2;
                    }
                    if (i1 != i5 - 1)
                    {
                        layoutparams.rightMargin = l / 2;
                    }
                }
            }
            i1++;
        } while (true);
          goto _L25
_L20:
        j1 = i;
_L25:
        if (j1 != 0)
        {
            for (i = 0; i < i5; i++)
            {
                obj = getChildAt(i);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.expanded)
                {
                    l = layoutparams.cellsUsed;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + l * l4, 0x40000000), j4);
                }
            }

        }
        if (i4 == 0x40000000)
        {
            j = l3;
        }
        setMeasuredDimension(k4, j);
        return;
_L2:
        for (l = 0; l < i1; l++)
        {
            obj = (LayoutParams)getChildAt(l).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i, j);
        return;
_L22:
        f = f1;
        if (true) goto _L26; else goto _L11
_L11:
        k3 = i1;
        i1 = j1;
        j1 = k3;
          goto _L16
        i1 = i;
        int l2 = j;
        j1 = l;
        i = i2;
        j = l1;
        l = l2;
          goto _L27
    }

    public final void setPopupTheme(int i)
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

    public final void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        mPresenter = actionmenupresenter;
        mPresenter.setMenuView(this);
    }


}
