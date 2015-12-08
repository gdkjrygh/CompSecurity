// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class ln
{

    private static lr a;

    public static MenuItem a(MenuItem menuitem, View view)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).setActionView(view);
        } else
        {
            return a.a(menuitem, view);
        }
    }

    public static MenuItem a(MenuItem menuitem, km km)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).a(km);
        } else
        {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            return menuitem;
        }
    }

    public static View a(MenuItem menuitem)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).getActionView();
        } else
        {
            return a.a(menuitem);
        }
    }

    public static void a(MenuItem menuitem, int i)
    {
        if (menuitem instanceof fr)
        {
            ((fr)menuitem).setShowAsAction(i);
            return;
        } else
        {
            a.a(menuitem, i);
            return;
        }
    }

    public static MenuItem b(MenuItem menuitem, int i)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).setActionView(i);
        } else
        {
            return a.b(menuitem, i);
        }
    }

    public static boolean b(MenuItem menuitem)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).expandActionView();
        } else
        {
            return a.b(menuitem);
        }
    }

    public static boolean c(MenuItem menuitem)
    {
        if (menuitem instanceof fr)
        {
            return ((fr)menuitem).isActionViewExpanded();
        } else
        {
            return a.c(menuitem);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            a = new lq();
        } else
        if (i >= 11)
        {
            a = new lp();
        } else
        {
            a = new lo();
        }
    }
}
