// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui:
//            LaunchActivity, ServiceErrorsHandler

class this._cls0
    implements ManagerStatusListener
{

    final LaunchActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        LaunchActivity.access$002(LaunchActivity.this, false);
        if (ServiceErrorsHandler.handleManagerResponse(LaunchActivity.this, i))
        {
            return;
        } else
        {
            LaunchActivity.access$100(LaunchActivity.this, servicemanager);
            return;
        }
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        LaunchActivity.access$002(LaunchActivity.this, false);
        ServiceErrorsHandler.handleManagerResponse(LaunchActivity.this, i);
    }

    nager()
    {
        this$0 = LaunchActivity.this;
        super();
    }
}
