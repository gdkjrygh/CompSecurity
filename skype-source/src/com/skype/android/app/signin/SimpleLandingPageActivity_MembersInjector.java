// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            SimpleLandingPageActivity, SignInNavigation, SignInLandingPageActivity

public final class SimpleLandingPageActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider adManagerProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider asyncServiceProvider;
    private final Provider configurationProvider;
    private final Provider crashReporterProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInNavigationProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public SimpleLandingPageActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        analyticsPersistentStorageProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        adManagerProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        signInNavigationProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new SimpleLandingPageActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccountProvider(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectAdManager(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.adManager = (AdManager)provider.get();
    }

    public static void injectAnalytics(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectAsyncService(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.asyncService = (AsyncService)provider.get();
    }

    public static void injectConfiguration(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectNavigation(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.navigation = (Navigation)provider.get();
    }

    public static void injectSignInNavigation(SimpleLandingPageActivity simplelandingpageactivity, Provider provider)
    {
        simplelandingpageactivity.signInNavigation = (SignInNavigation)provider.get();
    }

    public final void injectMembers(SimpleLandingPageActivity simplelandingpageactivity)
    {
        if (simplelandingpageactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(simplelandingpageactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(simplelandingpageactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(simplelandingpageactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(simplelandingpageactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(simplelandingpageactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(simplelandingpageactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(simplelandingpageactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(simplelandingpageactivity, activityAccountStateObserverProvider);
            simplelandingpageactivity.analytics = (Analytics)analyticsProvider.get();
            simplelandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            simplelandingpageactivity.navigation = (Navigation)navigationProvider.get();
            simplelandingpageactivity.accountProvider = (AccountProvider)accountProvider.get();
            simplelandingpageactivity.asyncService = (AsyncService)asyncServiceProvider.get();
            simplelandingpageactivity.adManager = (AdManager)adManagerProvider.get();
            simplelandingpageactivity.signInNavigation = (SignInNavigation)signInNavigationProvider.get();
            simplelandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            simplelandingpageactivity.analytics = (Analytics)analyticsProvider.get();
            simplelandingpageactivity.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SimpleLandingPageActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/SimpleLandingPageActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
