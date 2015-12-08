// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.SignInDurationReporter;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFragment

public final class UnifiedSignInFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider signInDurationReporterProvider;

    public UnifiedSignInFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        navigationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        analyticsPersistentStorageProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new UnifiedSignInFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectAnalytics(UnifiedSignInFragment unifiedsigninfragment, Provider provider)
    {
        unifiedsigninfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(UnifiedSignInFragment unifiedsigninfragment, Provider provider)
    {
        unifiedsigninfragment.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectEcsConfiguration(UnifiedSignInFragment unifiedsigninfragment, Provider provider)
    {
        unifiedsigninfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectNavigation(UnifiedSignInFragment unifiedsigninfragment, Provider provider)
    {
        unifiedsigninfragment.navigation = (Navigation)provider.get();
    }

    public static void injectSignInDurationReporter(UnifiedSignInFragment unifiedsigninfragment, Provider provider)
    {
        unifiedsigninfragment.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public final void injectMembers(UnifiedSignInFragment unifiedsigninfragment)
    {
        if (unifiedsigninfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(unifiedsigninfragment, objectInterfaceFinderProvider);
            unifiedsigninfragment.navigation = (Navigation)navigationProvider.get();
            unifiedsigninfragment.analytics = (Analytics)analyticsProvider.get();
            unifiedsigninfragment.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            unifiedsigninfragment.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            unifiedsigninfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UnifiedSignInFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/UnifiedSignInFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
