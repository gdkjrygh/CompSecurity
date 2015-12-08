// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompatIcs

static class mWrapped
    implements android.view.nerWrapper
{

    private uItemActionExpand mWrapped;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return mWrapped.uItemActionCollapse(menuitem);
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return mWrapped.uItemActionExpand(menuitem);
    }

    public ( )
    {
        mWrapped = ;
    }
}
