// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuBuilder, MenuItemImpl

public final class SubMenuBuilder extends MenuBuilder
    implements SubMenu
{

    private MenuItemImpl mItem;
    private MenuBuilder mParentMenu;

    public SubMenuBuilder(Context context, MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        super(context);
        mParentMenu = menubuilder;
        mItem = menuitemimpl;
    }

    public final boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
        return mParentMenu.collapseItemActionView(menuitemimpl);
    }

    final boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return super.dispatchMenuItemSelected(menubuilder, menuitem) || mParentMenu.dispatchMenuItemSelected(menubuilder, menuitem);
    }

    public final boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        return mParentMenu.expandItemActionView(menuitemimpl);
    }

    public final String getActionViewStatesKey()
    {
        int i;
        if (mItem != null)
        {
            i = mItem.getItemId();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.getActionViewStatesKey()).append(":").append(i).toString();
        }
    }

    public final MenuItem getItem()
    {
        return mItem;
    }

    public final Menu getParentMenu()
    {
        return mParentMenu;
    }

    public final MenuBuilder getRootMenu()
    {
        return mParentMenu;
    }

    public final boolean isQwertyMode()
    {
        return mParentMenu.isQwertyMode();
    }

    public final boolean isShortcutsVisible()
    {
        return mParentMenu.isShortcutsVisible();
    }

    public final void setCallback(MenuBuilder.Callback callback)
    {
        mParentMenu.setCallback(callback);
    }

    public final SubMenu setHeaderIcon(int i)
    {
        super.setHeaderIconInt(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        super.setHeaderIconInt(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        super.setHeaderTitleInt(getContext().getResources().getString(i));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.setHeaderTitleInt(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        super.setHeaderViewInt(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        mItem.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        mItem.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        mParentMenu.setQwertyMode(flag);
    }
}
