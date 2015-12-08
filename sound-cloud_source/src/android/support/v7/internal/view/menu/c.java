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
//            d, o, r

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
        if (menuitem instanceof SupportMenuItem)
        {
            SupportMenuItem supportmenuitem = (SupportMenuItem)menuitem;
            if (b == null)
            {
                b = new ArrayMap();
            }
            MenuItem menuitem1 = (MenuItem)b.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = o.a(a, supportmenuitem);
                b.put(supportmenuitem, menuitem);
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
                if (!(submenu instanceof SupportSubMenu))
                {
                    break label0;
                }
                SupportSubMenu supportsubmenu = (SupportSubMenu)submenu;
                if (c == null)
                {
                    c = new ArrayMap();
                }
                SubMenu submenu1 = (SubMenu)c.get(supportsubmenu);
                submenu = submenu1;
                if (submenu1 == null)
                {
                    submenu = a;
                    if (android.os.Build.VERSION.SDK_INT < 14)
                    {
                        break label1;
                    }
                    submenu = new r(submenu, supportsubmenu);
                    c.put(supportsubmenu, submenu);
                }
                return submenu;
            }
            throw new UnsupportedOperationException();
        }
        return submenu;
    }
}
