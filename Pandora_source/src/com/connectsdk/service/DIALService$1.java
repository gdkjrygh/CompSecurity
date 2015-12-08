// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.core.AppInfo;
import com.connectsdk.core.Util;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.sessions.LaunchSession;

// Referenced classes of package com.connectsdk.service:
//            DIALService

class val.appInfo
    implements ResponseListener
{

    final DIALService this$0;
    final AppInfo val$appInfo;
    final com.connectsdk.service.capability.unchListener val$listener;

    public void onError(ServiceCommandError servicecommanderror)
    {
        Util.postError(val$listener, new ServiceCommandError(0, "Problem Launching app", null));
    }

    public void onSuccess(Object obj)
    {
        LaunchSession launchsession = LaunchSession.launchSessionForAppId(val$appInfo.getId());
        launchsession.setAppName(val$appInfo.getName());
        launchsession.setRawData(obj);
        launchsession.setService(DIALService.this);
        launchsession.setSessionType(com.connectsdk.service.sessions.LaunchSessionType.App);
        Util.postSuccess(val$listener, launchsession);
    }

    hListener()
    {
        this$0 = final_dialservice;
        val$listener = unchlistener;
        val$appInfo = AppInfo.this;
        super();
    }
}
