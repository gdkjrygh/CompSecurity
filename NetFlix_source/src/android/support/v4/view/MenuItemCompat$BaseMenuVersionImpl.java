// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat

static class er
    implements er
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

    public MenuItem setOnActionExpandListener(MenuItem menuitem, er er)
    {
        return menuitem;
    }

    public void setShowAsAction(MenuItem menuitem, int i)
    {
    }

    er()
    {
    }
}
