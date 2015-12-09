// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            LogoutActivity

class this._cls0
    implements ManagerStatusListener
{

    final LogoutActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        servicemanager.logoutUser(new goutHandler(LogoutActivity.this));
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
    }

    goutHandler()
    {
        this$0 = LogoutActivity.this;
        super();
    }
}
