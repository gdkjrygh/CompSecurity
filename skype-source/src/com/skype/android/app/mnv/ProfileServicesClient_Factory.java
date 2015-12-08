// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesClient, MnvUtil, MnvCases, MnvAnalytics, 
//            ProfileServicesResponse

public final class ProfileServicesClient_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider httpUtilProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider mnvCasesProvider;
    private final Provider mnvUtilProvider;
    private final Provider networkUtilProvider;
    private final Provider profileServicesResponseProvider;

    public ProfileServicesClient_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mnvUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        mnvCasesProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        profileServicesResponseProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider8;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new ProfileServicesClient_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public final ProfileServicesClient get()
    {
        return new ProfileServicesClient((MnvUtil)mnvUtilProvider.get(), (MnvCases)mnvCasesProvider.get(), (HttpUtil)httpUtilProvider.get(), (MnvAnalytics)mnvAnalyticsProvider.get(), (NetworkUtil)networkUtilProvider.get(), (ContactUtil)contactUtilProvider.get(), (AccountProvider)accountProvider.get(), (ProfileServicesResponse)profileServicesResponseProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/ProfileServicesClient_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
