// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            AttributionsFragment

public final class AttributionsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider asyncServiceProvider;
    private final Provider configurationProvider;
    private final Provider objectInterfaceFinderProvider;

    public AttributionsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new AttributionsFragment_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAsyncService(AttributionsFragment attributionsfragment, Provider provider)
    {
        attributionsfragment.asyncService = (AsyncService)provider.get();
    }

    public static void injectConfiguration(AttributionsFragment attributionsfragment, Provider provider)
    {
        attributionsfragment.configuration = (EcsConfiguration)provider.get();
    }

    public final void injectMembers(AttributionsFragment attributionsfragment)
    {
        if (attributionsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(attributionsfragment, objectInterfaceFinderProvider);
            attributionsfragment.asyncService = (AsyncService)asyncServiceProvider.get();
            attributionsfragment.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AttributionsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/AttributionsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
