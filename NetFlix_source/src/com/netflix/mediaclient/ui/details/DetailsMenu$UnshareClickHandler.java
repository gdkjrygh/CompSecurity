// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.MenuItem;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsMenu

private class videoId
    implements android.view.
{

    private final ServiceManager serviceMan;
    final DetailsMenu this$0;
    private final String videoId;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem.setEnabled(false);
        if (serviceMan != null)
        {
            serviceMan.hideVideo(videoId, new <init>(DetailsMenu.this));
        }
        return true;
    }

    public (ServiceManager servicemanager, String s)
    {
        this$0 = DetailsMenu.this;
        super();
        serviceMan = servicemanager;
        videoId = s;
    }
}
