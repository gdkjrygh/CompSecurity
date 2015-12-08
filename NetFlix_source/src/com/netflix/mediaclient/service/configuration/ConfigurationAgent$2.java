// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.drm.DrmManagerRegistry;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationAgent

class this._cls0
    implements com.netflix.mediaclient.service.configuration.drm.llback
{

    final ConfigurationAgent this$0;

    public void drmError(int i)
    {
        if (Log.isLoggable("nf_configurationagent", 6))
        {
            Log.d("nf_configurationagent", (new StringBuilder()).append("DRM failed to initialize, Error code: ").append(i).toString());
        }
        ConfigurationAgent.access$200(ConfigurationAgent.this, i);
    }

    public void drmReady()
    {
        Log.d("nf_configurationagent", "DRM manager is ready");
        if (DrmManagerRegistry.isDrmSystemChanged())
        {
            ConfigurationAgent.access$002(ConfigurationAgent.this, true);
        }
        ConfigurationAgent.access$100(ConfigurationAgent.this, 0);
    }

    y()
    {
        this$0 = ConfigurationAgent.this;
        super();
    }
}
