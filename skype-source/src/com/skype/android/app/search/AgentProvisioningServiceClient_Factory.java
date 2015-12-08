// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.HttpUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient

public final class AgentProvisioningServiceClient_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncServiceProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider httpUtilProvider;
    private final Provider skypeTokenAccessProvider;

    public AgentProvisioningServiceClient_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        skypeTokenAccessProvider = provider2;
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
        return new AgentProvisioningServiceClient_Factory(provider, provider1, provider2, provider3);
    }

    public final AgentProvisioningServiceClient get()
    {
        return new AgentProvisioningServiceClient((HttpUtil)httpUtilProvider.get(), (AsyncService)asyncServiceProvider.get(), (SkypeTokenAccess)skypeTokenAccessProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/search/AgentProvisioningServiceClient_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
