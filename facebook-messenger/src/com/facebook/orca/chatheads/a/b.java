// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.a;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.actionbarsherlock.a.a;
import com.actionbarsherlock.a.d;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.orca.chatheads.a:
//            c, a

public class b
    implements Menu
{

    private final a a;
    private final WeakHashMap b = new WeakHashMap();

    public b(a a1)
    {
        a = a1;
    }

    private SubMenu a(d d1)
    {
        c c1 = new c(d1);
        d1 = d1.q();
        MenuItem menuitem = c1.getItem();
        b.put(d1, menuitem);
        return c1;
    }

    private MenuItem b(com.actionbarsherlock.a.b b1)
    {
        com.facebook.orca.chatheads.a.a a1 = new com.facebook.orca.chatheads.a.a(b1);
        b.put(b1, a1);
        return a1;
    }

    public MenuItem a(com.actionbarsherlock.a.b b1)
    {
        MenuItem menuitem;
        if (b1 == null)
        {
            menuitem = null;
        } else
        {
            MenuItem menuitem1 = (MenuItem)b.get(b1);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                return b(b1);
            }
        }
        return menuitem;
    }

    public MenuItem add(int i)
    {
        return b(a.a(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return b(a.a(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return b(a.a(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return b(a.a(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        if (amenuitem != null)
        {
            com.actionbarsherlock.a.b ab[] = new com.actionbarsherlock.a.b[amenuitem.length];
            k = a.a(i, j, k, componentname, aintent, intent, l, ab);
            i = 0;
            l = amenuitem.length;
            do
            {
                j = k;
                if (i >= l)
                {
                    break;
                }
                amenuitem[i] = new com.facebook.orca.chatheads.a.a(ab[i]);
                i++;
            } while (true);
        } else
        {
            j = a.a(i, j, k, componentname, aintent, intent, l, null);
        }
        return j;
    }

    public SubMenu addSubMenu(int i)
    {
        return a(a.b(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return a(a.b(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return a(a.b(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return a(a.b(charsequence));
    }

    public void clear()
    {
        b.clear();
        a.a();
    }

    public void close()
    {
        a.h();
    }

    public MenuItem findItem(int i)
    {
        return a(a.e(i));
    }

    public MenuItem getItem(int i)
    {
        return a(a.h(i));
    }

    public boolean hasVisibleItems()
    {
        return a.b();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return a.a(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return a.b(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return a.a(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        a.d(i);
    }

    public void removeItem(int i)
    {
        a.c(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        a.a(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        a.b(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        a.a(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        a.a(flag);
    }

    public int size()
    {
        return a.c();
    }
}
