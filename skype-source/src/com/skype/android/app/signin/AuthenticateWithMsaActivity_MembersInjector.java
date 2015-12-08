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
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            AuthenticateWithMsaActivity, LinkingGetAccounts, AbstractSignInActivity, AccountStatusNotifier

public final class AuthenticateWithMsaActivity_MembersInjector
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
    private final Provider configurationAndEcsConfigurationProvider;
    private final Provider crashReporterProvider;
    private final Provider intentHandlerProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider linkingGetAccountsProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider soundsProvider;
    private final Provider stateManagerProvider;
    private final Provider telemetryHelperProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public AuthenticateWithMsaActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        configurationAndEcsConfigurationProvider = provider18;
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
        linkingGetAccountsProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        } else
        {
            telemetryHelperProvider = provider24;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24)
    {
        return new AuthenticateWithMsaActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    public static void injectAnalytics(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLib(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.lib = (SkyLib)provider.get();
    }

    public static void injectLinkingGetAccounts(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.linkingGetAccounts = (LinkingGetAccounts)provider.get();
    }

    public static void injectSignInDurationReporter(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public static void injectTelemetryHelper(AuthenticateWithMsaActivity authenticatewithmsaactivity, Provider provider)
    {
        authenticatewithmsaactivity.telemetryHelper = (TelemetryHelper)provider.get();
    }

    public final void injectMembers(AuthenticateWithMsaActivity authenticatewithmsaactivity)
    {
        if (authenticatewithmsaactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(authenticatewithmsaactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(authenticatewithmsaactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(authenticatewithmsaactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(authenticatewithmsaactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(authenticatewithmsaactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(authenticatewithmsaactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(authenticatewithmsaactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(authenticatewithmsaactivity, activityAccountStateObserverProvider);
            authenticatewithmsaactivity.navigation = (Navigation)navigationProvider.get();
            authenticatewithmsaactivity.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            authenticatewithmsaactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            authenticatewithmsaactivity.lib = (SkyLib)libProvider.get();
            authenticatewithmsaactivity.accountProvider = (AccountProvider)accountProvider.get();
            authenticatewithmsaactivity.analytics = (Analytics)analyticsProvider.get();
            authenticatewithmsaactivity.sounds = (Sounds)soundsProvider.get();
            authenticatewithmsaactivity.mnvManager = (MnvManager)mnvManagerProvider.get();
            authenticatewithmsaactivity.autoBuddyManager = (AutoBuddyManager)autoBuddyManagerProvider.get();
            authenticatewithmsaactivity.stateManager = (ViewStateManager)stateManagerProvider.get();
            authenticatewithmsaactivity.configuration = (EcsConfiguration)configurationAndEcsConfigurationProvider.get();
            authenticatewithmsaactivity.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            authenticatewithmsaactivity.intentHandler = (SkypeIntentHandler)intentHandlerProvider.get();
            authenticatewithmsaactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            authenticatewithmsaactivity.lib = (SkyLib)libProvider.get();
            authenticatewithmsaactivity.linkingGetAccounts = (LinkingGetAccounts)linkingGetAccountsProvider.get();
            authenticatewithmsaactivity.analytics = (Analytics)analyticsProvider.get();
            authenticatewithmsaactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            authenticatewithmsaactivity.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            authenticatewithmsaactivity.ecsConfiguration = (EcsConfiguration)configurationAndEcsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AuthenticateWithMsaActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/AuthenticateWithMsaActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
