// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import dagger.internal.DoubleCheckLazy;
import dagger.internal.Factory;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalyticsModule

public final class PlayerAnalyticsModule_AkamaiFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final PlayerAnalyticsModule module;

    public PlayerAnalyticsModule_AkamaiFactory(PlayerAnalyticsModule playeranalyticsmodule, Provider provider)
    {
        if (!$assertionsDisabled && playeranalyticsmodule == null)
        {
            throw new AssertionError();
        }
        module = playeranalyticsmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider;
            return;
        }
    }

    public static Factory create(PlayerAnalyticsModule playeranalyticsmodule, Provider provider)
    {
        return new PlayerAnalyticsModule_AkamaiFactory(playeranalyticsmodule, provider);
    }

    public volatile Object get()
    {
        return get();
    }

    public Set get()
    {
        return Collections.singleton(module.akamai(DoubleCheckLazy.create(analyticsProvider)));
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/PlayerAnalyticsModule_AkamaiFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
