// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ActionProvider, MenuItemCompatHoneycomb, MenuItemCompatIcs

public class MenuItemCompat
{
    static class BaseMenuVersionImpl
        implements MenuVersionImpl
    {

        public boolean expandActionView(MenuItem menuitem)
        {
            return false;
        }

        public View getActionView(MenuItem menuitem)
        {
            return null;
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return false;
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
            return menuitem;
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return menuitem;
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
        }

        BaseMenuVersionImpl()
        {
        }
    }

    static class HoneycombMenuVersionImpl
        implements MenuVersionImpl
    {

        public boolean expandActionView(MenuItem menuitem)
        {
            return false;
        }

        public View getActionView(MenuItem menuitem)
        {
            return MenuItemCompatHoneycomb.getActionView(menuitem);
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return false;
        }

        public MenuItem setActionView(MenuItem menuitem, int i)
        {
            return MenuItemCompatHoneycomb.setActionView(menuitem, i);
        }

        public MenuItem setActionView(MenuItem menuitem, View view)
        {
            return MenuItemCompatHoneycomb.setActionView(menuitem, view);
        }

        public void setShowAsAction(MenuItem menuitem, int i)
        {
            MenuItemCompatHoneycomb.setShowAsAction(menuitem, i);
        }

        HoneycombMenuVersionImpl()
        {
        }
    }

    static class IcsMenuVersionImpl extends HoneycombMenuVersionImpl
    {

        public boolean expandActionView(MenuItem menuitem)
        {
            return MenuItemCompatIcs.expandActionView(menuitem);
        }

        public boolean isActionViewExpanded(MenuItem menuitem)
        {
            return MenuItemCompatIcs.isActionViewExpanded(menuitem);
        }

        IcsMenuVersionImpl()
        {
        }
    }

    static interface MenuVersionImpl
    {

        public abstract boolean expandActionView(MenuItem menuitem);

        public abstract View getActionView(MenuItem menuitem);

        public abstract boolean isActionViewExpanded(MenuItem menuitem);

        public abstract MenuItem setActionView(MenuItem menuitem, int i);

        public abstract MenuItem setActionView(MenuItem menuitem, View view);

        public abstract void setShowAsAction(MenuItem menuitem, int i);
    }

    public static interface OnActionExpandListener
    {

        public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

        public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
    }


    static final MenuVersionImpl IMPL;

    public static boolean expandActionView(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).expandActionView();
        } else
        {
            return IMPL.expandActionView(menuitem);
        }
    }

    public static View getActionView(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).getActionView();
        } else
        {
            return IMPL.getActionView(menuitem);
        }
    }

    public static boolean isActionViewExpanded(MenuItem menuitem)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).isActionViewExpanded();
        } else
        {
            return IMPL.isActionViewExpanded(menuitem);
        }
    }

    public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setSupportActionProvider(actionprovider);
        } else
        {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            return menuitem;
        }
    }

    public static MenuItem setActionView(MenuItem menuitem, int i)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setActionView(i);
        } else
        {
            return IMPL.setActionView(menuitem, i);
        }
    }

    public static MenuItem setActionView(MenuItem menuitem, View view)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            return ((SupportMenuItem)menuitem).setActionView(view);
        } else
        {
            return IMPL.setActionView(menuitem, view);
        }
    }

    public static void setShowAsAction(MenuItem menuitem, int i)
    {
        if (menuitem instanceof SupportMenuItem)
        {
            ((SupportMenuItem)menuitem).setShowAsAction(i);
            return;
        } else
        {
            IMPL.setShowAsAction(menuitem, i);
            return;
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            IMPL = new IcsMenuVersionImpl();
        } else
        if (i >= 11)
        {
            IMPL = new HoneycombMenuVersionImpl();
        } else
        {
            IMPL = new BaseMenuVersionImpl();
        }
    }
}
