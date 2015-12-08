// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            OutlookNotInstalledActivity, AppNotInstalledActivity

public final class OutlookNotInstalledActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public OutlookNotInstalledActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10)
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
        ecsConfigurationProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        } else
        {
            navigationProvider = provider10;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10)
    {
        return new OutlookNotInstalledActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectAnalytics(OutlookNotInstalledActivity outlooknotinstalledactivity, Provider provider)
    {
        outlooknotinstalledactivity.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(OutlookNotInstalledActivity outlooknotinstalledactivity, Provider provider)
    {
        outlooknotinstalledactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectNavigation(OutlookNotInstalledActivity outlooknotinstalledactivity, Provider provider)
    {
        outlooknotinstalledactivity.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(OutlookNotInstalledActivity outlooknotinstalledactivity)
    {
        if (outlooknotinstalledactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(outlooknotinstalledactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(outlooknotinstalledactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(outlooknotinstalledactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(outlooknotinstalledactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(outlooknotinstalledactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(outlooknotinstalledactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(outlooknotinstalledactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(outlooknotinstalledactivity, activityAccountStateObserverProvider);
            outlooknotinstalledactivity.analytics = (Analytics)analyticsProvider.get();
            outlooknotinstalledactivity.analytics = (Analytics)analyticsProvider.get();
            outlooknotinstalledactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            outlooknotinstalledactivity.navigation = (Navigation)navigationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OutlookNotInstalledActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/OutlookNotInstalledActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
