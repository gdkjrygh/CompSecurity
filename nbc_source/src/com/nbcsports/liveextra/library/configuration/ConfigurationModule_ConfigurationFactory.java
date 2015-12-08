// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            RuntimeConfiguration, ConfigurationModule, Configuration

public final class ConfigurationModule_ConfigurationFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ConfigurationModule module;
    private final Provider runtimeConfigurationProvider;

    public ConfigurationModule_ConfigurationFactory(ConfigurationModule configurationmodule, Provider provider)
    {
        if (!$assertionsDisabled && configurationmodule == null)
        {
            throw new AssertionError();
        }
        module = configurationmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            runtimeConfigurationProvider = provider;
            return;
        }
    }

    public static Factory create(ConfigurationModule configurationmodule, Provider provider)
    {
        return new ConfigurationModule_ConfigurationFactory(configurationmodule, provider);
    }

    public Configuration get()
    {
        Configuration configuration = module.configuration((RuntimeConfiguration)runtimeConfigurationProvider.get());
        if (configuration == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return configuration;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/ConfigurationModule_ConfigurationFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
