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

class val.hostConnection
    implements ApiCallback
{

    final HostFragmentManualConfiguration this$0;
    final HostConnection val$hostConnection;
    final HostInfo val$hostInfo;

    public void onError(int i, String s)
    {
        val$hostConnection.disconnect();
        HostFragmentManualConfiguration.access$600(HostFragmentManualConfiguration.this, i, s);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LogUtils.LOGD(HostFragmentManualConfiguration.access$300(), "Successfully connected to new host through HTTP.");
        if (val$hostInfo.getProtocol() == 0)
        {
            HostFragmentManualConfiguration.access$400(HostFragmentManualConfiguration.this, val$hostConnection, val$hostInfo);
            return;
        } else
        {
            val$hostConnection.disconnect();
            HostFragmentManualConfiguration.access$500(HostFragmentManualConfiguration.this, val$hostInfo);
            return;
        }
    }

    ()
    {
        this$0 = final_hostfragmentmanualconfiguration;
        val$hostInfo = hostinfo;
        val$hostConnection = HostConnection.this;
        super();
    }
}
