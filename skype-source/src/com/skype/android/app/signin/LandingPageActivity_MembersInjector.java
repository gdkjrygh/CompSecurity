// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.AccountProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LandingPageActivity, AccountStatusNotifier

public final class LandingPageActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider accountStatusNotifierProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider asyncServiceProvider;
    private final Provider crashReporterProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPrefsProvider;

    public LandingPageActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14)
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
        navigationProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        accountStatusNotifierProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider14;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14)
    {
        return new LandingPageActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectAccountProvider(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectAccountStatusNotifier(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.accountStatusNotifier = (AccountStatusNotifier)provider.get();
    }

    public static void injectAnalytics(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectAsyncService(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.asyncService = (AsyncService)provider.get();
    }

    public static void injectNavigation(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.navigation = (Navigation)provider.get();
    }

    public static void injectUserPrefs(LandingPageActivity landingpageactivity, Provider provider)
    {
        landingpageactivity.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(LandingPageActivity landingpageactivity)
    {
        if (landingpageactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(landingpageactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(landingpageactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(landingpageactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(landingpageactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(landingpageactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(landingpageactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(landingpageactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(landingpageactivity, activityAccountStateObserverProvider);
            landingpageactivity.navigation = (Navigation)navigationProvider.get();
            landingpageactivity.accountProvider = (AccountProvider)accountProvider.get();
            landingpageactivity.asyncService = (AsyncService)asyncServiceProvider.get();
            landingpageactivity.analytics = (Analytics)analyticsProvider.get();
            landingpageactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            landingpageactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            landingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LandingPageActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LandingPageActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
