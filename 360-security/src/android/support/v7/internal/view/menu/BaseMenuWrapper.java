// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.a.a.b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuWrapperFactory

abstract class BaseMenuWrapper extends BaseWrapper
{

    private HashMap mMenuItems;
    private HashMap mSubMenus;

    BaseMenuWrapper(Object obj)
    {
        super(obj);
    }

    final b getMenuItemWrapper(MenuItem menuitem)
    {
        if (menuitem != null)
        {
            if (mMenuItems == null)
            {
                mMenuItems = new HashMap();
            }
            b b2 = (b)mMenuItems.get(menuitem);
            b b1 = b2;
            if (b2 == null)
            {
                b1 = MenuWrapperFactory.createSupportMenuItemWrapper(menuitem);
                mMenuItems.put(menuitem, b1);
            }
            return b1;
        } else
        {
            return null;
        }
    }

    final SubMenu getSubMenuWrapper(SubMenu submenu)
    {
        if (submenu != null)
        {
            if (mSubMenus == null)
            {
                mSubMenus = new HashMap();
            }
            SubMenu submenu1 = (SubMenu)mSubMenus.get(submenu);
            Object obj = submenu1;
            if (submenu1 == null)
            {
                obj = MenuWrapperFactory.createSupportSubMenuWrapper(submenu);
                mSubMenus.put(submenu, obj);
            }
            return ((SubMenu) (obj));
        } else
        {
            return null;
        }
    }

    final void internalClear()
    {
        if (mMenuItems != null)
        {
            mMenuItems.clear();
        }
        if (mSubMenus != null)
        {
            mSubMenus.clear();
        }
    }

    final void internalRemoveGroup(int i)
    {
        if (mMenuItems != null)
        {
            Iterator iterator = mMenuItems.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getGroupId())
                {
                    iterator.remove();
                }
            }
        }
    }

    final void internalRemoveItem(int i)
    {
        if (mMenuItems != null)
        {
            Iterator iterator = mMenuItems.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getItemId())
                {
                    iterator.remove();
                    return;
                }
            }
        }
    }
}
