// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.app:
//            ShareCompat, ShareCompatICS

static class  extends 
{

    public void configureMenuItem(MenuItem menuitem,  )
    {
        ShareCompatICS.configureMenuItem(menuitem, .tivity(), .tent());
        if (shouldAddChooserIntent(menuitem))
        {
            menuitem.setIntent(.eChooserIntent());
        }
    }

    boolean shouldAddChooserIntent(MenuItem menuitem)
    {
        return !menuitem.hasSubMenu();
    }

    ()
    {
    }
}
