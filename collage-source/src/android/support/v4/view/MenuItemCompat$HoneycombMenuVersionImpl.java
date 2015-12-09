// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat, MenuItemCompatHoneycomb

static class 
    implements 
{

    public boolean collapseActionView(MenuItem menuitem)
    {
        return false;
    }

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

    public MenuItem setOnActionExpandListener(MenuItem menuitem,  )
    {
        return menuitem;
    }

    public void setShowAsAction(MenuItem menuitem, int i)
    {
        MenuItemCompatHoneycomb.setShowAsAction(menuitem, i);
    }

    ()
    {
    }
}
