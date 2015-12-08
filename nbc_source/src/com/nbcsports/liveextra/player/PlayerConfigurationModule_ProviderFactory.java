// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.player;

import com.nbcsports.liveextra.ads.NbcAuditudeConfiguration;
import com.nbcsports.liveextra.library.player.AuditudeConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.player:
//            PlayerConfigurationModule

public final class PlayerConfigurationModule_ProviderFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final PlayerConfigurationModule module;
    private final Provider providerProvider;

    public PlayerConfigurationModule_ProviderFactory(PlayerConfigurationModule playerconfigurationmodule, Provider provider)
    {
        if (!$assertionsDisabled && playerconfigurationmodule == null)
        {
            throw new AssertionError();
        }
        module = playerconfigurationmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            providerProvider = provider;
            return;
        }
    }

    public static Factory create(PlayerConfigurationModule playerconfigurationmodule, Provider provider)
    {
        return new PlayerConfigurationModule_ProviderFactory(playerconfigurationmodule, provider);
    }

    public AuditudeConfiguration get()
    {
        AuditudeConfiguration auditudeconfiguration = module.provider((NbcAuditudeConfiguration)providerProvider.get());
        if (auditudeconfiguration == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return auditudeconfiguration;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/player/PlayerConfigurationModule_ProviderFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
