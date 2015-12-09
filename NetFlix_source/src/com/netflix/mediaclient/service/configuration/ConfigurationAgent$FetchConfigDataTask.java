// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationAgent, ConfigurationWebClient, ConfigurationAgentWebCallback, SimpleConfigurationAgentWebCallback

private class this._cls0 extends this._cls0
{

    final ConfigurationAgent this$0;
    private final ConfigurationAgentWebCallback webClientCallback = new SimpleConfigurationAgentWebCallback() {

        final ConfigurationAgent.FetchConfigDataTask this$1;

        public void onConfigDataFetched(ConfigData configdata, int i)
        {
            Log.d("nf_configurationagent", String.format("onConfigDataFetched statusCode=%d", new Object[] {
                Integer.valueOf(i)
            }));
            ConfigurationAgent.access$502(this$0, -7);
            if (i == 0 && configdata != null)
            {
                ConfigurationAgent.access$700(this$0, configdata);
                ConfigurationAgent.access$502(this$0, 0);
            }
            ConfigurationAgent.access$302(this$0, false);
            ConfigurationAgent.access$900(this$0).postDelayed(ConfigurationAgent.access$800(this$0), 0x1b77400L);
            ConfigurationAgent.access$1000(this$0);
            if (getCallback() != null)
            {
                getCallback().onConfigDataFetched(configdata, ConfigurationAgent.access$500(this$0));
            }
        }

            
            {
                this$1 = ConfigurationAgent.FetchConfigDataTask.this;
                super();
            }
    };

    public void run()
    {
        ConfigurationAgent.access$600(ConfigurationAgent.this).fetchConfigData(webClientCallback);
    }

    public it>(ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        this$0 = ConfigurationAgent.this;
        super(configurationagentwebcallback);
    }
}
