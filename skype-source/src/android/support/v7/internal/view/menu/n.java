// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.internal.view.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            c

class n extends c
    implements Menu
{

    n(Context context, a a1)
    {
        super(context, a1);
    }

    public MenuItem add(int i)
    {
        return a(((a)b).add(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return a(((a)b).add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return a(((a)b).add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(((a)b).add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        MenuItem amenuitem1[] = null;
        if (amenuitem != null)
        {
            amenuitem1 = new MenuItem[amenuitem.length];
        }
        j = ((a)b).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
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
        return a(((a)b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return a(((a)b).addSubMenu(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return a(((a)b).addSubMenu(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return a(((a)b).addSubMenu(charsequence));
    }

    public void clear()
    {
        a();
        ((a)b).clear();
    }

    public void close()
    {
        ((a)b).close();
    }

    public MenuItem findItem(int i)
    {
        return a(((a)b).findItem(i));
    }

    public MenuItem getItem(int i)
    {
        return a(((a)b).getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return ((a)b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return ((a)b).isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return ((a)b).performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return ((a)b).performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        a(i);
        ((a)b).removeGroup(i);
    }

    public void removeItem(int i)
    {
        b(i);
        ((a)b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        ((a)b).setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        ((a)b).setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        ((a)b).setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        ((a)b).setQwertyMode(flag);
    }

    public int size()
    {
        return ((a)b).size();
    }
}
