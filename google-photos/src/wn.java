// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class wn extends vq
    implements Menu
{

    public wn(Context context, fq fq1)
    {
        super(context, fq1);
    }

    public MenuItem add(int i)
    {
        return a(((fq)d).add(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return a(((fq)d).add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return a(((fq)d).add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return a(((fq)d).add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        MenuItem amenuitem1[] = null;
        if (amenuitem != null)
        {
            amenuitem1 = new MenuItem[amenuitem.length];
        }
        j = ((fq)d).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
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
        return a(((fq)d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return a(((fq)d).addSubMenu(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return a(((fq)d).addSubMenu(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return a(((fq)d).addSubMenu(charsequence));
    }

    public void clear()
    {
        if (super.b != null)
        {
            super.b.clear();
        }
        if (super.c != null)
        {
            super.c.clear();
        }
        ((fq)d).clear();
    }

    public void close()
    {
        ((fq)d).close();
    }

    public MenuItem findItem(int i)
    {
        return a(((fq)d).findItem(i));
    }

    public MenuItem getItem(int i)
    {
        return a(((fq)d).getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return ((fq)d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return ((fq)d).isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return ((fq)d).performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return ((fq)d).performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        if (super.b != null)
        {
            Iterator iterator = super.b.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (i == ((MenuItem)iterator.next()).getGroupId())
                {
                    iterator.remove();
                }
            } while (true);
        }
        ((fq)d).removeGroup(i);
    }

    public void removeItem(int i)
    {
label0:
        {
            if (super.b == null)
            {
                break label0;
            }
            Iterator iterator = super.b.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (i != ((MenuItem)iterator.next()).getItemId());
            iterator.remove();
        }
        ((fq)d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        ((fq)d).setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        ((fq)d).setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        ((fq)d).setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        ((fq)d).setQwertyMode(flag);
    }

    public int size()
    {
        return ((fq)d).size();
    }
}
