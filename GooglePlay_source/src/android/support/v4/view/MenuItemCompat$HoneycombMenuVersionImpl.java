// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat

static class 
    implements 
{

    public boolean expandActionView(MenuItem menuitem)
    {
        return false;
    }

    public final View getActionView(MenuItem menuitem)
    {
        return menuitem.getActionView();
    }

    public boolean isActionViewExpanded(MenuItem menuitem)
    {
        return false;
    }

    public final MenuItem setActionView(MenuItem menuitem, int i)
    {
        return menuitem.setActionView(i);
    }

    public final MenuItem setActionView(MenuItem menuitem, View view)
    {
        return menuitem.setActionView(view);
    }

    public final void setShowAsAction(MenuItem menuitem, int i)
    {
        menuitem.setShowAsAction(i);
    }

    ()
    {
    }
}
