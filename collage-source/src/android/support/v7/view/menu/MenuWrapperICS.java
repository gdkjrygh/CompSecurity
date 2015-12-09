// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.internal.view.SupportMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.view.menu:
//            BaseMenuWrapper

class MenuWrapperICS extends BaseMenuWrapper
    implements Menu
{

    MenuWrapperICS(Context context, SupportMenu supportmenu)
    {
        super(context, supportmenu);
    }

    public MenuItem add(int i)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        MenuItem amenuitem1[] = null;
        if (amenuitem != null)
        {
            amenuitem1 = new MenuItem[amenuitem.length];
        }
        j = ((SupportMenu)mWrappedObject).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
        if (amenuitem1 != null)
        {
            i = 0;
            for (k = amenuitem1.length; i < k; i++)
            {
                amenuitem[i] = getMenuItemWrapper(amenuitem1[i]);
            }

        }
        return j;
    }

    public SubMenu addSubMenu(int i)
    {
        return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(charsequence));
    }

    public void clear()
    {
        internalClear();
        ((SupportMenu)mWrappedObject).clear();
    }

    public void close()
    {
        ((SupportMenu)mWrappedObject).close();
    }

    public MenuItem findItem(int i)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).findItem(i));
    }

    public MenuItem getItem(int i)
    {
        return getMenuItemWrapper(((SupportMenu)mWrappedObject).getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return ((SupportMenu)mWrappedObject).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return ((SupportMenu)mWrappedObject).isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return ((SupportMenu)mWrappedObject).performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return ((SupportMenu)mWrappedObject).performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        internalRemoveGroup(i);
        ((SupportMenu)mWrappedObject).removeGroup(i);
    }

    public void removeItem(int i)
    {
        internalRemoveItem(i);
        ((SupportMenu)mWrappedObject).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        ((SupportMenu)mWrappedObject).setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        ((SupportMenu)mWrappedObject).setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        ((SupportMenu)mWrappedObject).setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        ((SupportMenu)mWrappedObject).setQwertyMode(flag);
    }

    public int size()
    {
        return ((SupportMenu)mWrappedObject).size();
    }
}
