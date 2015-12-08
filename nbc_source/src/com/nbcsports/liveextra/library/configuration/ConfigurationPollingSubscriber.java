// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import com.google.gson.Gson;
import com.nbcsports.liveextra.library.core.PollingSubscriber;
import com.squareup.okhttp.OkHttpClient;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Configuration

public class ConfigurationPollingSubscriber extends PollingSubscriber
{

    public ConfigurationPollingSubscriber(OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson);
    }

    public void setListener(com.nbcsports.liveextra.library.core.PollingSubscriber.PollingCallback pollingcallback)
    {
        super.setListener(pollingcallback, com/nbcsports/liveextra/library/configuration/Configuration);
    }
}
