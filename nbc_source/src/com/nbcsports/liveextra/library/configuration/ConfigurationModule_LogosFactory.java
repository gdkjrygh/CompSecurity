// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import com.nbcsports.liveextra.library.tve.MvpdLookups;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationModule

public final class ConfigurationModule_LogosFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ConfigurationModule module;
    private final Provider mvpdLookupsProvider;

    public ConfigurationModule_LogosFactory(ConfigurationModule configurationmodule, Provider provider)
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
            mvpdLookupsProvider = provider;
            return;
        }
    }

    public static Factory create(ConfigurationModule configurationmodule, Provider provider)
    {
        return new ConfigurationModule_LogosFactory(configurationmodule, provider);
    }

    public volatile Object get()
    {
        return get();
    }

    public Map get()
    {
        Map map = module.logos((MvpdLookups)mvpdLookupsProvider.get());
        if (map == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return map;
        }
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/ConfigurationModule_LogosFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
