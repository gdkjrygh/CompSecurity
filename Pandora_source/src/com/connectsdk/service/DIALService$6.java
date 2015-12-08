// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;

// Referenced classes of package com.connectsdk.service:
//            DIALService

class val.appID
    implements ResponseListener
{

    final DIALService this$0;
    final String val$appID;

    public void onError(ServiceCommandError servicecommanderror)
    {
    }

    public void onSuccess(Object obj)
    {
        com.connectsdk.service.capability.ate _tmp = DIALService.access$100((String)obj);
        addCapability((new StringBuilder()).append("Launcher.").append(val$appID).toString());
    }

    eCommandError()
    {
        this$0 = final_dialservice;
        val$appID = String.this;
        super();
    }
}
