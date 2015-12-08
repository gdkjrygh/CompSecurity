// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

private class <init>
    implements MenuPresenter
{

    MenuItemImpl mCurrentExpandedItem;
    MenuBuilder mMenu;
    final Toolbar this$0;

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        if (mExpandedActionView instanceof CollapsibleActionView)
        {
            ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
        }
        removeView(mExpandedActionView);
        removeView(Toolbar.access$300(Toolbar.this));
        mExpandedActionView = null;
        addChildrenForExpandedActionView();
        mCurrentExpandedItem = null;
        requestLayout();
        menuitemimpl.setActionViewExpanded(false);
        return true;
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        Toolbar.access$200(Toolbar.this);
        if (Toolbar.access$300(Toolbar.this).getParent() != Toolbar.this)
        {
            addView(Toolbar.access$300(Toolbar.this));
        }
        mExpandedActionView = menuitemimpl.getActionView();
        mCurrentExpandedItem = menuitemimpl;
        if (mExpandedActionView.getParent() != Toolbar.this)
        {
            menubuilder = generateDefaultLayoutParams();
            menubuilder._fld0 = 0x800003 | Toolbar.access$400(Toolbar.this) & 0x70;
            menubuilder._fld0 = 2;
            mExpandedActionView.setLayoutParams(menubuilder);
            addView(mExpandedActionView);
        }
        removeChildrenForExpandedActionView();
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

    public void setCallback(android.support.v7.view.menu.nu nu)
    {
    }

    public void updateMenuView(boolean flag)
    {
        boolean flag2 = false;
        if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (mMenu == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = mMenu.size();
        i = 0;
_L9:
        flag1 = flag2;
        if (i >= j) goto _L4; else goto _L5
_L5:
        if (mMenu.getItem(i) != mCurrentExpandedItem) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            collapseItemActionView(mMenu, mCurrentExpandedItem);
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private ()
    {
        this$0 = Toolbar.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
