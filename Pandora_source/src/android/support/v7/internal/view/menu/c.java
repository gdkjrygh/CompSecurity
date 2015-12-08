// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p.c.b;

// Referenced classes of package android.support.v7.internal.view.menu:
//            d, n

abstract class c extends d
{

    private HashMap b;
    private HashMap c;

    c(Object obj)
    {
        super(obj);
    }

    final SubMenu a(SubMenu submenu)
    {
        if (submenu != null)
        {
            if (c == null)
            {
                c = new HashMap();
            }
            SubMenu submenu1 = (SubMenu)c.get(submenu);
            Object obj = submenu1;
            if (submenu1 == null)
            {
                obj = n.a(submenu);
                c.put(submenu, obj);
            }
            return ((SubMenu) (obj));
        } else
        {
            return null;
        }
    }

    final b a(MenuItem menuitem)
    {
        if (menuitem != null)
        {
            if (b == null)
            {
                b = new HashMap();
            }
            b b2 = (b)b.get(menuitem);
            b b1 = b2;
            if (b2 == null)
            {
                b1 = android.support.v7.internal.view.menu.n.b(menuitem);
                b.put(menuitem, b1);
            }
            return b1;
        } else
        {
            return null;
        }
    }

    final void a()
    {
        if (b != null)
        {
            b.clear();
        }
        if (c != null)
        {
            c.clear();
        }
    }

    final void a(int i)
    {
        if (b != null)
        {
            Iterator iterator = b.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getGroupId())
                {
                    iterator.remove();
                }
            }
        }
    }

    final void b(int i)
    {
        if (b != null)
        {
            Iterator iterator = b.keySet().iterator();
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
