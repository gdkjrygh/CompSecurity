// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration

class val.hostInfo
    implements org.xbmc.kore.eventclient.onnectionCallback
{

    final HostFragmentManualConfiguration this$0;
    final HostInfo val$hostInfo;

    public void OnConnectResult(boolean flag)
    {
        LogUtils.LOGD(HostFragmentManualConfiguration.access$300(), (new StringBuilder()).append("Check ES connection: ").append(flag).toString());
        if (flag)
        {
            HostFragmentManualConfiguration.access$700(HostFragmentManualConfiguration.this, val$hostInfo);
            return;
        } else
        {
            val$hostInfo.setUseEventServer(false);
            HostFragmentManualConfiguration.access$700(HostFragmentManualConfiguration.this, val$hostInfo);
            return;
        }
    }

    erConnectionCallback()
    {
        this$0 = final_hostfragmentmanualconfiguration;
        val$hostInfo = HostInfo.this;
        super();
    }
}
