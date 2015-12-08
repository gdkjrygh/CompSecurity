// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationPollingSubscriber

public final class ConfigurationPollingSubscriber_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider gsonProvider;
    private final MembersInjector membersInjector;

    public ConfigurationPollingSubscriber_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
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

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new ConfigurationPollingSubscriber_Factory(membersinjector, provider, provider1);
    }

    public ConfigurationPollingSubscriber get()
    {
        ConfigurationPollingSubscriber configurationpollingsubscriber = new ConfigurationPollingSubscriber((OkHttpClient)clientProvider.get(), (Gson)gsonProvider.get());
        membersInjector.injectMembers(configurationpollingsubscriber);
        return configurationpollingsubscriber;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/ConfigurationPollingSubscriber_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
