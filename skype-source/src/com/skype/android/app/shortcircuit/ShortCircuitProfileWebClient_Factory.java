// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.HttpUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ShortCircuitProfileWebClient, ProfileServiceTokenRequest

public final class ShortCircuitProfileWebClient_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider ecsConfigurationProvider;
    private final Provider eventBusProvider;
    private final Provider httpUtilProvider;
    private final Provider profileServiceTokenRequestProvider;

    public ShortCircuitProfileWebClient_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        profileServiceTokenRequestProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ShortCircuitProfileWebClient_Factory(provider, provider1, provider2, provider3);
    }

    public final ShortCircuitProfileWebClient get()
    {
        return new ShortCircuitProfileWebClient((ProfileServiceTokenRequest)profileServiceTokenRequestProvider.get(), (HttpUtil)httpUtilProvider.get(), (EventBus)eventBusProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/shortcircuit/ShortCircuitProfileWebClient_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
