// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedLandingPageActivity, SignInLandingPageActivity

public final class UnifiedLandingPageActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider asyncServiceProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider eventBusProvider;
    private final Provider httpUtilProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider viewStateManagerProvider;

    public UnifiedLandingPageActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17)
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
        accountProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        viewStateManagerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider17;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17)
    {
        return new UnifiedLandingPageActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccountProvider(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectAnalytics(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectAsyncService(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.asyncService = (AsyncService)provider.get();
    }

    public static void injectConfiguration(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectContactUtil(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectEventBus(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.eventBus = (EventBus)provider.get();
    }

    public static void injectHttpUtil(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.httpUtil = (HttpUtil)provider.get();
    }

    public static void injectLib(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.lib = (SkyLib)provider.get();
    }

    public static void injectViewStateManager(UnifiedLandingPageActivity unifiedlandingpageactivity, Provider provider)
    {
        unifiedlandingpageactivity.viewStateManager = (ViewStateManager)provider.get();
    }

    public final void injectMembers(UnifiedLandingPageActivity unifiedlandingpageactivity)
    {
        if (unifiedlandingpageactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(unifiedlandingpageactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(unifiedlandingpageactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(unifiedlandingpageactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(unifiedlandingpageactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(unifiedlandingpageactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(unifiedlandingpageactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(unifiedlandingpageactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(unifiedlandingpageactivity, activityAccountStateObserverProvider);
            unifiedlandingpageactivity.analytics = (Analytics)analyticsProvider.get();
            unifiedlandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            unifiedlandingpageactivity.accountProvider = (AccountProvider)accountProvider.get();
            unifiedlandingpageactivity.lib = (SkyLib)libProvider.get();
            unifiedlandingpageactivity.viewStateManager = (ViewStateManager)viewStateManagerProvider.get();
            unifiedlandingpageactivity.analytics = (Analytics)analyticsProvider.get();
            unifiedlandingpageactivity.httpUtil = (HttpUtil)httpUtilProvider.get();
            unifiedlandingpageactivity.asyncService = (AsyncService)asyncServiceProvider.get();
            unifiedlandingpageactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            unifiedlandingpageactivity.eventBus = (EventBus)eventBusProvider.get();
            unifiedlandingpageactivity.configuration = (EcsConfiguration)configurationProvider.get();
            unifiedlandingpageactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UnifiedLandingPageActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/UnifiedLandingPageActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
