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
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.res.Sounds;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingSkypeNamesFoundActivity, LinkingUtil, AbstractSignInActivity, AccountStatusNotifier

public final class LinkingSkypeNamesFoundActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
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
    private final Provider userPrefsProvider;

    public LinkingSkypeNamesFoundActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25)
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
        linkingUtilProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider24;
        if (!$assertionsDisabled && provider25 == null)
        {
            throw new AssertionError();
        } else
        {
            signInDurationReporterProvider = provider25;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24, Provider provider25)
    {
        return new LinkingSkypeNamesFoundActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25);
    }

    public static void injectAccessibilityUtil(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity, Provider provider)
    {
        linkingskypenamesfoundactivity.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectLayoutExperience(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity, Provider provider)
    {
        linkingskypenamesfoundactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLinkingUtil(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity, Provider provider)
    {
        linkingskypenamesfoundactivity.linkingUtil = (LinkingUtil)provider.get();
    }

    public static void injectSignInDurationReporter(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity, Provider provider)
    {
        linkingskypenamesfoundactivity.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public static void injectUserPrefs(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity, Provider provider)
    {
        linkingskypenamesfoundactivity.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity)
    {
        if (linkingskypenamesfoundactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(linkingskypenamesfoundactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(linkingskypenamesfoundactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(linkingskypenamesfoundactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(linkingskypenamesfoundactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(linkingskypenamesfoundactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(linkingskypenamesfoundactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(linkingskypenamesfoundactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(linkingskypenamesfoundactivity, activityAccountStateObserverProvider);
            linkingskypenamesfoundactivity.navigation = (Navigation)navigationProvider.get();
            linkingskypenamesfoundactivity.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            linkingskypenamesfoundactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            linkingskypenamesfoundactivity.lib = (SkyLib)libProvider.get();
            linkingskypenamesfoundactivity.accountProvider = (AccountProvider)accountProvider.get();
            linkingskypenamesfoundactivity.analytics = (Analytics)analyticsProvider.get();
            linkingskypenamesfoundactivity.sounds = (Sounds)soundsProvider.get();
            linkingskypenamesfoundactivity.mnvManager = (MnvManager)mnvManagerProvider.get();
            linkingskypenamesfoundactivity.autoBuddyManager = (AutoBuddyManager)autoBuddyManagerProvider.get();
            linkingskypenamesfoundactivity.stateManager = (ViewStateManager)stateManagerProvider.get();
            linkingskypenamesfoundactivity.configuration = (EcsConfiguration)configurationProvider.get();
            linkingskypenamesfoundactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            linkingskypenamesfoundactivity.intentHandler = (SkypeIntentHandler)intentHandlerProvider.get();
            linkingskypenamesfoundactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            linkingskypenamesfoundactivity.linkingUtil = (LinkingUtil)linkingUtilProvider.get();
            linkingskypenamesfoundactivity.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            linkingskypenamesfoundactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            linkingskypenamesfoundactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            linkingskypenamesfoundactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LinkingSkypeNamesFoundActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LinkingSkypeNamesFoundActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
