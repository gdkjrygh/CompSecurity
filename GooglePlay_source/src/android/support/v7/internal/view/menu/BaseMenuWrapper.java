// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuWrapperFactory, SubMenuWrapperICS

abstract class BaseMenuWrapper extends BaseWrapper
{

    final Context mContext;
    Map mMenuItems;
    Map mSubMenus;

    BaseMenuWrapper(Context context, Object obj)
    {
        super(obj);
        mContext = context;
    }

    final MenuItem getMenuItemWrapper(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            SupportMenuItem supportmenuitem = (SupportMenuItem)menuitem;
            if (mMenuItems == null)
            {
                mMenuItems = new ArrayMap();
            }
            MenuItem menuitem1 = (MenuItem)mMenuItems.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = MenuWrapperFactory.wrapSupportMenuItem(mContext, supportmenuitem);
                mMenuItems.put(supportmenuitem, menuitem);
            }
            return menuitem;
        } else
        {
            return menuitem;
        }
    }

    final SubMenu getSubMenuWrapper(SubMenu submenu)
    {
label0:
        {
label1:
            {
                if (!(submenu instanceof SupportSubMenu))
                {
                    break label0;
                }
                SupportSubMenu supportsubmenu = (SupportSubMenu)submenu;
                if (mSubMenus == null)
                {
                    mSubMenus = new ArrayMap();
                }
                SubMenu submenu1 = (SubMenu)mSubMenus.get(supportsubmenu);
                submenu = submenu1;
                if (submenu1 == null)
                {
                    submenu = mContext;
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    submenu = new SubMenuWrapperICS(submenu, supportsubmenu);
                    mSubMenus.put(supportsubmenu, submenu);
                }
                return submenu;
            }
            throw new UnsupportedOperationException();
        }
        return submenu;
    }
}
