// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v7.app.ActionBarDrawerToggle;

// Referenced classes of package org.xbmc.kore.ui:
//            NavigationDrawerFragment

class this._cls0
    implements Runnable
{

    final NavigationDrawerFragment this$0;

    public void run()
    {
        NavigationDrawerFragment.access$200(NavigationDrawerFragment.this).syncState();
    }

    ()
    {
        this$0 = NavigationDrawerFragment.this;
        super();
    }
}
