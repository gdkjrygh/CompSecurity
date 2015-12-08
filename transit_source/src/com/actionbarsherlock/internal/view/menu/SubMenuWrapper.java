// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuWrapper, MenuItemWrapper

public class SubMenuWrapper extends MenuWrapper
    implements SubMenu
{

    private MenuItem mItem;
    private final android.view.SubMenu mNativeSubMenu;

    public SubMenuWrapper(android.view.SubMenu submenu)
    {
        super(submenu);
        mItem = null;
        mNativeSubMenu = submenu;
    }

    public void clearHeader()
    {
        mNativeSubMenu.clearHeader();
    }

    public MenuItem getItem()
    {
        if (mItem == null)
        {
            mItem = new MenuItemWrapper(mNativeSubMenu.getItem());
        }
        return mItem;
    }

    public SubMenu setHeaderIcon(int i)
    {
        mNativeSubMenu.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        mNativeSubMenu.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        mNativeSubMenu.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        mNativeSubMenu.setHeaderTitle(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        mNativeSubMenu.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        mNativeSubMenu.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        mNativeSubMenu.setIcon(drawable);
        return this;
    }
}
