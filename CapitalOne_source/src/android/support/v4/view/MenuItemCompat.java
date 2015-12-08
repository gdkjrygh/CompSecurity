// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompatHoneycomb

public class MenuItemCompat
{
    static class BaseMenuVersionImpl
        implements MenuVersionImpl
    {

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return menuitem;
        }

        public boolean setShowAsAction(MenuItem menuitem, int i)
        {
            return false;
        }

        BaseMenuVersionImpl()
        {
        }
    }

    static class HoneycombMenuVersionImpl
        implements MenuVersionImpl
    {

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return MenuItemCompatHoneycomb.setActionView(menuitem, view);
        }

        public boolean setShowAsAction(MenuItem menuitem, int i)
        {
            MenuItemCompatHoneycomb.setShowAsAction(menuitem, i);
            return true;
        }

        HoneycombMenuVersionImpl()
        {
        }
    }

    static interface MenuVersionImpl
    {

        public abstract MenuItem setActionView(MenuItem menuitem, View view);

        public abstract boolean setShowAsAction(MenuItem menuitem, int i);
    }


    static final MenuVersionImpl IMPL;
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;

    public MenuItemCompat()
    {
    }

    public static MenuItem setActionView(MenuItem menuitem, View view)
    {
        return IMPL.setActionView(menuitem, view);
    }

    public static boolean setShowAsAction(MenuItem menuitem, int i)
    {
        return IMPL.setShowAsAction(menuitem, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombMenuVersionImpl();
        } else
        {
            IMPL = new BaseMenuVersionImpl();
        }
    }
}
