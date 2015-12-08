// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import com.google.gson.Gson;
import com.nbcsports.liveextra.library.core.PollingSubscriber;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationModule

public final class ConfigurationModule_ConfigurationSubscriberFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider gsonProvider;
    private final ConfigurationModule module;

    public ConfigurationModule_ConfigurationSubscriberFactory(ConfigurationModule configurationmodule, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && configurationmodule == null)
        {
            throw new AssertionError();
        }
        module = configurationmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        clientProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            gsonProvider = provider1;
            return;
        }
    }

    public static Factory create(ConfigurationModule configurationmodule, Provider provider, Provider provider1)
    {
        return new ConfigurationModule_ConfigurationSubscriberFactory(configurationmodule, provider, provider1);
    }

    public PollingSubscriber get()
    {
        PollingSubscriber pollingsubscriber = module.configurationSubscriber((OkHttpClient)clientProvider.get(), (Gson)gsonProvider.get());
        if (pollingsubscriber == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return pollingsubscriber;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/ConfigurationModule_ConfigurationSubscriberFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
