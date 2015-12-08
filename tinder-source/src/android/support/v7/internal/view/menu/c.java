// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.g.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

// Referenced classes of package android.support.v7.internal.view.menu:
//            d, n, q

abstract class c extends d
{

    final Context a;
    Map b;
    Map c;

    c(Context context, Object obj)
    {
        super(obj);
        a = context;
    }

    final MenuItem a(MenuItem menuitem)
    {
        if (menuitem instanceof b)
        {
            b b1 = (b)menuitem;
            if (b == null)
            {
                b = new a();
            }
            MenuItem menuitem1 = (MenuItem)b.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = android.support.v7.internal.view.menu.n.a(a, b1);
                b.put(b1, menuitem);
            }
            return menuitem;
        } else
        {
            return menuitem;
        }
    }

    final SubMenu a(SubMenu submenu)
    {
label0:
        {
label1:
            {
                if (!(submenu instanceof android.support.v4.d.a.c))
                {
                    break label0;
                }
                android.support.v4.d.a.c c1 = (android.support.v4.d.a.c)submenu;
                if (c == null)
                {
                    c = new a();
                }
                SubMenu submenu1 = (SubMenu)c.get(c1);
                submenu = submenu1;
                if (submenu1 == null)
                {
                    submenu = a;
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    submenu = new q(submenu, c1);
                    c.put(c1, submenu);
                }
                return submenu;
            }
            throw new UnsupportedOperationException();
        }
        return submenu;
    }
}
