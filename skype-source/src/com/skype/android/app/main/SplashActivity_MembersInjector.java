// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.SkypeIntentHandler;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.main:
//            SplashActivity

public final class SplashActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider configuratonProvider;
    private final Provider crashReporterProvider;
    private final Provider intentHandlerProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider stateManagerProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPreferencesProvider;

    public SplashActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16)
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
        accountProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        analyticsPersistentStorageProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        configuratonProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        intentHandlerProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        } else
        {
            userPreferencesProvider = provider16;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16)
    {
        return new SplashActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static void injectAccount(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.account = (Account)provider.get();
    }

    public static void injectAnalytics(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectConfiguraton(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.configuraton = (EcsConfiguration)provider.get();
    }

    public static void injectIntentHandler(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.intentHandler = (SkypeIntentHandler)provider.get();
    }

    public static void injectLib(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.lib = (SkyLib)provider.get();
    }

    public static void injectNavigation(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.navigation = (Navigation)provider.get();
    }

    public static void injectStateManager(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.stateManager = (ViewStateManager)provider.get();
    }

    public static void injectUserPreferences(SplashActivity splashactivity, Provider provider)
    {
        splashactivity.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(SplashActivity splashactivity)
    {
        if (splashactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(splashactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(splashactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(splashactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(splashactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(splashactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(splashactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(splashactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(splashactivity, activityAccountStateObserverProvider);
            splashactivity.account = (Account)accountProvider.get();
            splashactivity.analytics = (Analytics)analyticsProvider.get();
            splashactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            splashactivity.lib = (SkyLib)libProvider.get();
            splashactivity.stateManager = (ViewStateManager)stateManagerProvider.get();
            splashactivity.navigation = (Navigation)navigationProvider.get();
            splashactivity.configuraton = (EcsConfiguration)configuratonProvider.get();
            splashactivity.intentHandler = (SkypeIntentHandler)intentHandlerProvider.get();
            splashactivity.userPreferences = (UserPreferences)userPreferencesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SplashActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/main/SplashActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
