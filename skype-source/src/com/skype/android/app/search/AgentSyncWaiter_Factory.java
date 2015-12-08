// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.search:
//            AgentSyncWaiter, AgentProvisioningServiceClient

public final class AgentSyncWaiter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider agentProvisioningServiceClientProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;

    public AgentSyncWaiter_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        agentProvisioningServiceClientProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            navigationProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new AgentSyncWaiter_Factory(provider, provider1, provider2, provider3);
    }

    public final AgentSyncWaiter get()
    {
        return new AgentSyncWaiter((EventBus)eventBusProvider.get(), (AgentProvisioningServiceClient)agentProvisioningServiceClientProvider.get(), (SkyLib)libProvider.get(), (Navigation)navigationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/search/AgentSyncWaiter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
