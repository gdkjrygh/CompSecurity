// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import com.actionbarsherlock.view.Menu;
import java.util.WeakHashMap;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemWrapper, SubMenuWrapper

public class MenuWrapper
    implements Menu
{

    private final WeakHashMap mNativeMap = new WeakHashMap();
    private final android.view.Menu mNativeMenu;

    public MenuWrapper(android.view.Menu menu)
    {
        mNativeMenu = menu;
    }

    private com.actionbarsherlock.view.MenuItem addInternal(MenuItem menuitem)
    {
        MenuItemWrapper menuitemwrapper = new MenuItemWrapper(menuitem);
        mNativeMap.put(menuitem, menuitemwrapper);
        return menuitemwrapper;
    }

    private com.actionbarsherlock.view.SubMenu addInternal(SubMenu submenu)
    {
        SubMenuWrapper submenuwrapper = new SubMenuWrapper(submenu);
        submenu = submenu.getItem();
        com.actionbarsherlock.view.MenuItem menuitem = submenuwrapper.getItem();
        mNativeMap.put(submenu, menuitem);
        return submenuwrapper;
    }

    public com.actionbarsherlock.view.MenuItem add(int i)
    {
        return addInternal(mNativeMenu.add(i));
    }

    public com.actionbarsherlock.view.MenuItem add(int i, int j, int k, int l)
    {
        return addInternal(mNativeMenu.add(i, j, k, l));
    }

    public com.actionbarsherlock.view.MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(mNativeMenu.add(i, j, k, charsequence));
    }

    public com.actionbarsherlock.view.MenuItem add(CharSequence charsequence)
    {
        return addInternal(mNativeMenu.add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            com.actionbarsherlock.view.MenuItem amenuitem[])
    {
        if (amenuitem != null)
        {
            MenuItem amenuitem1[] = new MenuItem[amenuitem.length];
            k = mNativeMenu.addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
            i = 0;
            l = amenuitem.length;
            do
            {
                j = k;
                if (i >= l)
                {
                    break;
                }
                amenuitem[i] = new MenuItemWrapper(amenuitem1[i]);
                i++;
            } while (true);
        } else
        {
            j = mNativeMenu.addIntentOptions(i, j, k, componentname, aintent, intent, l, null);
        }
        return j;
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i)
    {
        return addInternal(mNativeMenu.addSubMenu(i));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return addInternal(mNativeMenu.addSubMenu(i, j, k, l));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(mNativeMenu.addSubMenu(i, j, k, charsequence));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(CharSequence charsequence)
    {
        return addInternal(mNativeMenu.addSubMenu(charsequence));
    }

    public void clear()
    {
        mNativeMap.clear();
        mNativeMenu.clear();
    }

    public void close()
    {
        mNativeMenu.close();
    }

    public com.actionbarsherlock.view.MenuItem findItem(int i)
    {
        return findItem(mNativeMenu.findItem(i));
    }

    public com.actionbarsherlock.view.MenuItem findItem(MenuItem menuitem)
    {
        com.actionbarsherlock.view.MenuItem menuitem1;
        if (menuitem == null)
        {
            menuitem1 = null;
        } else
        {
            com.actionbarsherlock.view.MenuItem menuitem2 = (com.actionbarsherlock.view.MenuItem)mNativeMap.get(menuitem);
            menuitem1 = menuitem2;
            if (menuitem2 == null)
            {
                return addInternal(menuitem);
            }
        }
        return menuitem1;
    }

    public com.actionbarsherlock.view.MenuItem getItem(int i)
    {
        return findItem(mNativeMenu.getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return mNativeMenu.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return mNativeMenu.isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return mNativeMenu.performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return mNativeMenu.performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        mNativeMenu.removeGroup(i);
    }

    public void removeItem(int i)
    {
        mNativeMenu.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        mNativeMenu.setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        mNativeMenu.setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        mNativeMenu.setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        mNativeMenu.setQwertyMode(flag);
    }

    public int size()
    {
        return mNativeMenu.size();
    }

    public android.view.Menu unwrap()
    {
        return mNativeMenu;
    }
}
