// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import com.google.gson.Gson;
import com.nbcsports.liveextra.library.core.PollingSubscriber;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.squareup.okhttp.OkHttpClient;
import java.util.Map;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            RuntimeConfiguration, Configuration

public class ConfigurationModule
{

    public ConfigurationModule()
    {
    }

    Map channels(MvpdLookups mvpdlookups)
    {
        return mvpdlookups.getChannels();
    }

    Configuration configuration(RuntimeConfiguration runtimeconfiguration)
    {
        return runtimeconfiguration.get();
    }

    PollingSubscriber configurationSubscriber(OkHttpClient okhttpclient, Gson gson)
    {
        return new PollingSubscriber(okhttpclient, gson);
    }

    Map logos(MvpdLookups mvpdlookups)
    {
        return mvpdlookups.getLogos();
    }
}
