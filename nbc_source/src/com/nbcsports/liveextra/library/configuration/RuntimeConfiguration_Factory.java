// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            RuntimeConfiguration, ConfigurationProvider

public final class RuntimeConfiguration_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider subscriberProvider;

    public RuntimeConfiguration_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            subscriberProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new RuntimeConfiguration_Factory(provider);
    }

    public RuntimeConfiguration get()
    {
        return new RuntimeConfiguration((ConfigurationProvider)subscriberProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/configuration/RuntimeConfiguration_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
