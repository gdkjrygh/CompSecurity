// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.AdvertiserIdLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationAgent

class this._cls0
    implements Runnable
{

    final ConfigurationAgent this$0;

    public void run()
    {
        Log.i("nf_configurationagent", "Refreshing config via runnable");
        fetchAccountConfigData(null);
        Log.i("nf_configurationagent", "Check if we should report ad id via runnable");
        Object obj = ConfigurationAgent.access$1100(ConfigurationAgent.this).getClientLogging();
        if (obj == null)
        {
            Log.e("nf_configurationagent", "CL is not available!");
            return;
        }
        obj = ((IClientLogging) (obj)).getAdvertiserIdLogging();
        if (obj == null)
        {
            Log.e("nf_configurationagent", "AD logger is not available!");
            return;
        } else
        {
            ((AdvertiserIdLogging) (obj)).sendAdvertiserId(com.netflix.mediaclient.servicemgr.ventType.check_in);
            return;
        }
    }

    ()
    {
        this$0 = ConfigurationAgent.this;
        super();
    }
}
