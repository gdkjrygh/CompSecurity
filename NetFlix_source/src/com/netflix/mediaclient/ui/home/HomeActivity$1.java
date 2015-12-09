// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.view.MenuItem;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            HomeActivity

class this._cls0
    implements android.view.ItemClickListener
{

    final HomeActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        ServiceManager servicemanager = HomeActivity.access$200(HomeActivity.this);
        String s = HomeActivity.access$000(HomeActivity.this);
        if (HomeActivity.access$100(HomeActivity.this) == null)
        {
            menuitem = "lolomo";
        } else
        {
            menuitem = HomeActivity.access$100(HomeActivity.this).getTitle();
        }
        servicemanager.dumpHomeLoLoMosAndVideos(s, menuitem);
        return false;
    }

    er()
    {
        this$0 = HomeActivity.this;
        super();
    }
}
