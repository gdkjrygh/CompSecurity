// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat, MenuItemCompatIcs

static class nImpl extends nImpl
{

    public boolean expandActionView(MenuItem menuitem)
    {
        return MenuItemCompatIcs.expandActionView(menuitem);
    }

    public boolean isActionViewExpanded(MenuItem menuitem)
    {
        return MenuItemCompatIcs.isActionViewExpanded(menuitem);
    }

    nImpl()
    {
    }
}
