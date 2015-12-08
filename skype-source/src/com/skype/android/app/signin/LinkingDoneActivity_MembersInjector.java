// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.SkypeIntentHandler;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.mnv.MnvManager;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.res.Sounds;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingDoneActivity, LinkingUtil, AbstractSignInActivity, AccountStatusNotifier

public final class LinkingDoneActivity_MembersInjector
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
    private final Provider autoBuddyManagerProvider;
    private final Provider configurationProvider;
    private final Provider crashReporterProvider;
    private final Provider httpUtilProvider;
    private final Provider intentHandlerProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider linkingUtilProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider soundsProvider;
    private final Provider stateManagerProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public LinkingDoneActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24)
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
        navigationUrlProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        soundsProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        mnvManagerProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        autoBuddyManagerProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        analyticsPersistentStorageProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        intentHandlerProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        accountStatusNotifierProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        linkingUtilProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        } else
        {
            signInDurationReporterProvider = provider24;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24)
    {
        return new LinkingDoneActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    public static void injectHttpUtil(LinkingDoneActivity linkingdoneactivity, Provider provider)
    {
        linkingdoneactivity.httpUtil = (HttpUtil)provider.get();
    }

    public static void injectLinkingUtil(LinkingDoneActivity linkingdoneactivity, Provider provider)
    {
        linkingdoneactivity.linkingUtil = (LinkingUtil)provider.get();
    }

    public static void injectSignInDurationReporter(LinkingDoneActivity linkingdoneactivity, Provider provider)
    {
        linkingdoneactivity.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public final void injectMembers(LinkingDoneActivity linkingdoneactivity)
    {
        if (linkingdoneactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(linkingdoneactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(linkingdoneactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(linkingdoneactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(linkingdoneactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(linkingdoneactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(linkingdoneactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(linkingdoneactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(linkingdoneactivity, activityAccountStateObserverProvider);
            linkingdoneactivity.navigation = (Navigation)navigationProvider.get();
            linkingdoneactivity.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            linkingdoneactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            linkingdoneactivity.lib = (SkyLib)libProvider.get();
            linkingdoneactivity.accountProvider = (AccountProvider)accountProvider.get();
            linkingdoneactivity.analytics = (Analytics)analyticsProvider.get();
            linkingdoneactivity.sounds = (Sounds)soundsProvider.get();
            linkingdoneactivity.mnvManager = (MnvManager)mnvManagerProvider.get();
            linkingdoneactivity.autoBuddyManager = (AutoBuddyManager)autoBuddyManagerProvider.get();
            linkingdoneactivity.stateManager = (ViewStateManager)stateManagerProvider.get();
            linkingdoneactivity.configuration = (EcsConfiguration)configurationProvider.get();
            linkingdoneactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            linkingdoneactivity.intentHandler = (SkypeIntentHandler)intentHandlerProvider.get();
            linkingdoneactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            linkingdoneactivity.httpUtil = (HttpUtil)httpUtilProvider.get();
            linkingdoneactivity.linkingUtil = (LinkingUtil)linkingUtilProvider.get();
            linkingdoneactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LinkingDoneActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LinkingDoneActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
