// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p.c.a;

// Referenced classes of package android.support.v7.internal.view.menu:
//            c

class o extends c
    implements a
{

    o(Menu menu)
    {
        super(menu);
    }

    public MenuItem add(int i)
    {
        return a(((Menu)a).add(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return a(((Menu)a).add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return a(((Menu)a).add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(((Menu)a).add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        MenuItem amenuitem1[] = null;
        if (amenuitem != null)
        {
            amenuitem1 = new MenuItem[amenuitem.length];
        }
        j = ((Menu)a).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
        if (amenuitem1 != null)
        {
            i = 0;
            for (k = amenuitem1.length; i < k; i++)
            {
                amenuitem[i] = a(amenuitem1[i]);
            }

        }
        return j;
    }

    public SubMenu addSubMenu(int i)
    {
        return a(((Menu)a).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return a(((Menu)a).addSubMenu(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return a(((Menu)a).addSubMenu(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return a(((Menu)a).addSubMenu(charsequence));
    }

    public void clear()
    {
        a();
        ((Menu)a).clear();
    }

    public void close()
    {
        ((Menu)a).close();
    }

    public MenuItem findItem(int i)
    {
        return a(((Menu)a).findItem(i));
    }

    public MenuItem getItem(int i)
    {
        return a(((Menu)a).getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return ((Menu)a).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return ((Menu)a).isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return ((Menu)a).performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return ((Menu)a).performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        a(i);
        ((Menu)a).removeGroup(i);
    }

    public void removeItem(int i)
    {
        b(i);
        ((Menu)a).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        ((Menu)a).setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        ((Menu)a).setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        ((Menu)a).setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        ((Menu)a).setQwertyMode(flag);
    }

    public int size()
    {
        return ((Menu)a).size();
    }
}
