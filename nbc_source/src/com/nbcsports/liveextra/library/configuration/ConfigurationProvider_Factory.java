// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationProvider, ConfigurationPollingSubscriber

public final class ConfigurationProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationUrlProvider;
    private final Provider pollingSubscriberProvider;

    public ConfigurationProvider_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        pollingSubscriberProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationUrlProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new ConfigurationProvider_Factory(provider, provider1);
    }

    public ConfigurationProvider get()
    {
        return new ConfigurationProvider((ConfigurationPollingSubscriber)pollingSubscriberProvider.get(), (String)configurationUrlProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/ConfigurationProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
