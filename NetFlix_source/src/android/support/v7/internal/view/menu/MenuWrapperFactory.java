// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperJB, MenuItemWrapperICS, MenuWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

    private MenuWrapperFactory()
    {
    }

    public static MenuItem createMenuItemWrapper(MenuItem menuitem)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = new MenuItemWrapperJB(menuitem);
        } else
        {
            obj = menuitem;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                return new MenuItemWrapperICS(menuitem);
            }
        }
        return ((MenuItem) (obj));
    }

    public static Menu createMenuWrapper(Menu menu)
    {
        Object obj = menu;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new MenuWrapperICS(menu);
        }
        return ((Menu) (obj));
    }

    public static SupportMenuItem createSupportMenuItemWrapper(MenuItem menuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new MenuItemWrapperJB(menuitem);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuItemWrapperICS(menuitem);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SupportMenu createSupportMenuWrapper(Menu menu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuWrapperICS(menu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SupportSubMenu createSupportSubMenuWrapper(SubMenu submenu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new SubMenuWrapperICS(submenu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
