// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration

class val.hostInfo
    implements ApiCallback
{

    final HostFragmentManualConfiguration this$0;
    final HostConnection val$hostConnection;
    final HostInfo val$hostInfo;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(HostFragmentManualConfiguration.access$300(), (new StringBuilder()).append("Couldn't connect to host through TCP. Message: ").append(s).toString());
        val$hostConnection.disconnect();
        val$hostInfo.setProtocol(1);
        HostFragmentManualConfiguration.access$500(HostFragmentManualConfiguration.this, val$hostInfo);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LogUtils.LOGD(HostFragmentManualConfiguration.access$300(), "Successfully connected to new host through TCP.");
        val$hostConnection.disconnect();
        HostFragmentManualConfiguration.access$500(HostFragmentManualConfiguration.this, val$hostInfo);
    }

    ()
    {
        this$0 = final_hostfragmentmanualconfiguration;
        val$hostConnection = hostconnection;
        val$hostInfo = HostInfo.this;
        super();
    }
}
