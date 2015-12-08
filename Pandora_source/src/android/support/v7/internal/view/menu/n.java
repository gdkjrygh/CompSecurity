// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p.c.b;
import p.c.c;

// Referenced classes of package android.support.v7.internal.view.menu:
//            o, j, i, q

public final class n
{

    public static Menu a(Menu menu)
    {
        Object obj = menu;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new o(menu);
        }
        return ((Menu) (obj));
    }

    public static MenuItem a(MenuItem menuitem)
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = new j(menuitem);
        } else
        {
            obj = menuitem;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                return new i(menuitem);
            }
        }
        return ((MenuItem) (obj));
    }

    public static c a(SubMenu submenu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new q(submenu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static b b(MenuItem menuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new j(menuitem);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new i(menuitem);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
