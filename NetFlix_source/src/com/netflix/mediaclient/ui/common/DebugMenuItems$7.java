// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.MenuItem;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            DebugMenuItems

class this._cls0
    implements android.view.emClickListener
{

    final DebugMenuItems this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = DebugMenuItems.access$100(DebugMenuItems.this).getServiceManager();
        if (menuitem != null)
        {
            menuitem.flushCaches();
        }
        return true;
    }

    ivity()
    {
        this$0 = DebugMenuItems.this;
        super();
    }
}
