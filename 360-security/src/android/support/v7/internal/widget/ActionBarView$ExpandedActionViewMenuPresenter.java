// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.b.b;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView, SpinnerICS

private class <init>
    implements MenuPresenter
{

    MenuItemImpl mCurrentExpandedItem;
    MenuBuilder mMenu;
    final ActionBarView this$0;

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        if (mExpandedActionView instanceof b)
        {
            ((b)mExpandedActionView).b();
        }
        removeView(mExpandedActionView);
        removeView(ActionBarView.access$600(ActionBarView.this));
        mExpandedActionView = null;
        if ((ActionBarView.access$1200(ActionBarView.this) & 2) != 0)
        {
            ActionBarView.access$700(ActionBarView.this)._mth0(0);
        }
        if ((ActionBarView.access$1200(ActionBarView.this) & 8) != 0)
        {
            if (ActionBarView.access$800(ActionBarView.this) == null)
            {
                ActionBarView.access$1300(ActionBarView.this);
            } else
            {
                ActionBarView.access$800(ActionBarView.this).setVisibility(0);
            }
        }
        if (ActionBarView.access$900(ActionBarView.this) != null && ActionBarView.access$1400(ActionBarView.this) == 2)
        {
            ActionBarView.access$900(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$1000(ActionBarView.this) != null && ActionBarView.access$1400(ActionBarView.this) == 1)
        {
            ActionBarView.access$1000(ActionBarView.this).setVisibility(0);
        }
        if (ActionBarView.access$1100(ActionBarView.this) != null && (ActionBarView.access$1200(ActionBarView.this) & 0x10) != 0)
        {
            ActionBarView.access$1100(ActionBarView.this).setVisibility(0);
        }
        ActionBarView.access$600(ActionBarView.this)._mth0(null);
        mCurrentExpandedItem = null;
        requestLayout();
        menuitemimpl.setActionViewExpanded(false);
        return true;
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        mExpandedActionView = menuitemimpl.getActionView();
        ActionBarView.access$600(ActionBarView.this)._mth0(ActionBarView.access$500(ActionBarView.this).getConstantState()._mth0(getResources()));
        mCurrentExpandedItem = menuitemimpl;
        if (mExpandedActionView.getParent() != ActionBarView.this)
        {
            addView(mExpandedActionView);
        }
        if (ActionBarView.access$600(ActionBarView.this)._mth0() != ActionBarView.this)
        {
            addView(ActionBarView.access$600(ActionBarView.this));
        }
        ActionBarView.access$700(ActionBarView.this)._mth0(8);
        if (ActionBarView.access$800(ActionBarView.this) != null)
        {
            ActionBarView.access$800(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$900(ActionBarView.this) != null)
        {
            ActionBarView.access$900(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$1000(ActionBarView.this) != null)
        {
            ActionBarView.access$1000(ActionBarView.this).setVisibility(8);
        }
        if (ActionBarView.access$1100(ActionBarView.this) != null)
        {
            ActionBarView.access$1100(ActionBarView.this).setVisibility(8);
        }
        requestLayout();
        menuitemimpl.setActionViewExpanded(true);
        if (mExpandedActionView instanceof b)
        {
            ((b)mExpandedActionView).a();
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

    public void setCallback(android.support.v7.internal.view.menu.nu nu)
    {
    }

    public void updateMenuView(boolean flag)
    {
        if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        if (mMenu == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        j = mMenu.size();
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if ((android.support.v4.a.a.b)mMenu.getItem(i) != mCurrentExpandedItem) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        if (i == 0)
        {
            collapseItemActionView(mMenu, mCurrentExpandedItem);
        }
_L2:
        return;
_L4:
        i++;
          goto _L5
        i = 0;
          goto _L6
    }

    private ()
    {
        this$0 = ActionBarView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
