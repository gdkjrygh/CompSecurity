// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.c.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            av, au, at, aw, 
//            n

public class as
{

    static final aw a;

    public static MenuItem a(MenuItem menuitem, n n)
    {
        if (menuitem instanceof b)
        {
            return ((b)menuitem).a(n);
        } else
        {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            return menuitem;
        }
    }

    public static MenuItem a(MenuItem menuitem, View view)
    {
        if (menuitem instanceof b)
        {
            return ((b)menuitem).setActionView(view);
        } else
        {
            return a.a(menuitem, view);
        }
    }

    public static void a(MenuItem menuitem, int i)
    {
        if (menuitem instanceof b)
        {
            ((b)menuitem).setShowAsAction(i);
            return;
        } else
        {
            a.a(menuitem, i);
            return;
        }
    }

    public static boolean a(MenuItem menuitem)
    {
        if (menuitem instanceof b)
        {
            return ((b)menuitem).expandActionView();
        } else
        {
            return a.a(menuitem);
        }
    }

    public static MenuItem b(MenuItem menuitem, int i)
    {
        if (menuitem instanceof b)
        {
            return ((b)menuitem).setActionView(i);
        } else
        {
            return a.b(menuitem, i);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            a = new av();
        } else
        if (i >= 11)
        {
            a = new au();
        } else
        {
            a = new at();
        }
    }
}
