// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            SimpleConfigurationAgentWebCallback, ConfigurationAgent, ConfigurationAgentWebCallback

class > extends SimpleConfigurationAgentWebCallback
{

    final is._cls0 this$1;

    public void onConfigDataFetched(ConfigData configdata, int i)
    {
        Log.d("nf_configurationagent", String.format("onConfigDataFetched statusCode=%d", new Object[] {
            Integer.valueOf(i)
        }));
        ConfigurationAgent.access$502(_fld0, -7);
        if (i == 0 && configdata != null)
        {
            ConfigurationAgent.access$700(_fld0, configdata);
            ConfigurationAgent.access$502(_fld0, 0);
        }
        ConfigurationAgent.access$302(_fld0, false);
        ConfigurationAgent.access$900(_fld0).postDelayed(ConfigurationAgent.access$800(_fld0), 0x1b77400L);
        ConfigurationAgent.access$1000(_fld0);
        if (tCallback() != null)
        {
            tCallback().onConfigDataFetched(configdata, ConfigurationAgent.access$500(_fld0));
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
