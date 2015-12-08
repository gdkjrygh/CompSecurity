// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.internal.view.menu.MenuPresenter;
import com.actionbarsherlock.internal.view.menu.MenuView;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.view.CollapsibleActionView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarView, ScrollingTabContainerView, IcsSpinner

private class <init>
    implements MenuPresenter
{

    MenuItemImpl mCurrentExpandedItem;
    MenuBuilder mMenu;
    final ActionBarView this$0;

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        if (mExpandedActionView instanceof CollapsibleActionView)
        {
            ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
        }
        removeView(mExpandedActionView);
        removeView(ActionBarView.access$3(ActionBarView.this));
        mExpandedActionView = null;
        if ((ActionBarView.access$10(ActionBarView.this) & 2) != 0)
        {
            ActionBarView.access$5(ActionBarView.this)._mth0(0);
        }
        if ((ActionBarView.access$10(ActionBarView.this) & 8) != 0)
        {
            if (ActionBarView.access$6(ActionBarView.this) == null)
            {
                ActionBarView.access$11(ActionBarView.this);
            } else
            {
                ActionBarView.access$6(ActionBarView.this).setVisibility(0);
            }
        }
        if (ActionBarView.access$7(ActionBarView.this) != null && ActionBarView.access$12(ActionBarView.this) == 2)
        {
            ActionBarView.access$7(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$8(ActionBarView.this) != null && ActionBarView.access$12(ActionBarView.this) == 1)
        {
            ActionBarView.access$8(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$9(ActionBarView.this) != null && (ActionBarView.access$10(ActionBarView.this) & 0x10) != 0)
        {
            ActionBarView.access$9(ActionBarView.this).setVisibility(0);
        }
        ActionBarView.access$3(ActionBarView.this)._mth0(null);
        mCurrentExpandedItem = null;
        requestLayout();
        menuitemimpl.setActionViewExpanded(false);
        return true;
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        mExpandedActionView = menuitemimpl.getActionView();
        ActionBarView.access$3(ActionBarView.this)._mth0(ActionBarView.access$4(ActionBarView.this).getConstantState()._mth0());
        mCurrentExpandedItem = menuitemimpl;
        if (mExpandedActionView.getParent() != ActionBarView.this)
        {
            addView(mExpandedActionView);
        }
        if (ActionBarView.access$3(ActionBarView.this)._mth0() != ActionBarView.this)
        {
            addView(ActionBarView.access$3(ActionBarView.this));
        }
        ActionBarView.access$5(ActionBarView.this)._mth0(8);
        if (ActionBarView.access$6(ActionBarView.this) != null)
        {
            ActionBarView.access$6(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$7(ActionBarView.this) != null)
        {
            ActionBarView.access$7(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$8(ActionBarView.this) != null)
        {
            ActionBarView.access$8(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$9(ActionBarView.this) != null)
        {
            ActionBarView.access$9(ActionBarView.this).setVisibility(8);
        }
        requestLayout();
        menuitemimpl.setActionViewExpanded(true);
        if (mExpandedActionView instanceof CollapsibleActionView)
        {
            ((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
        }
        return true;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public int getId()
    {
        return 0;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        return null;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        if (mMenu != null && mCurrentExpandedItem != null)
        {
            mMenu.collapseItemActionView(mCurrentExpandedItem);
        }
        mMenu = menubuilder;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    }

    public Parcelable onSaveInstanceState()
    {
        return null;
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        return false;
    }

    public void setCallback(com.actionbarsherlock.internal.view.menu.nu nu)
    {
    }

    public void updateMenuView(boolean flag)
    {
        if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag1;
        flag1 = false;
        i = ((flag1) ? 1 : 0);
        if (mMenu == null) goto _L4; else goto _L3
_L3:
        int j;
        j = mMenu.size();
        i = 0;
_L9:
        if (i < j) goto _L6; else goto _L5
_L5:
        i = ((flag1) ? 1 : 0);
_L4:
        if (i == 0)
        {
            collapseItemActionView(mMenu, mCurrentExpandedItem);
        }
_L2:
        return;
_L6:
        if (mMenu.getItem(i) != mCurrentExpandedItem)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1;
        if (true) goto _L4; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Y()
    {
        this$0 = ActionBarView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
