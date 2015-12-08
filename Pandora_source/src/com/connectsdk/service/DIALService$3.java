// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.core.Util;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;

// Referenced classes of package com.connectsdk.service:
//            DIALService

class Listener
    implements ResponseListener
{

    final DIALService this$0;
    final com.connectsdk.service.capability.ateListener val$listener;

    public void onError(ServiceCommandError servicecommanderror)
    {
        Util.postError(val$listener, servicecommanderror);
    }

    public void onSuccess(Object obj)
    {
        obj = DIALService.access$100((String)obj);
        if (((com.connectsdk.service.capability.ate) (obj)).state != null)
        {
            Util.postSuccess(val$listener, obj);
            return;
        } else
        {
            Util.postError(val$listener, new ServiceCommandError(0, "Malformed response for app state", null));
            return;
        }
    }

    Listener()
    {
        this$0 = final_dialservice;
        val$listener = com.connectsdk.service.capability.ateListener.this;
        super();
    }
}
