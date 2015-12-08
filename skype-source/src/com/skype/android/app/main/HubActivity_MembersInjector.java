// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.AbstractSignInActivity_MembersInjector;
import com.skype.android.app.signin.AccountStatusNotifier;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.main:
//            AbstractHubActivity, HubActivity

public final class HubActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider accountStatusNotifierProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider adPlacerProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider appConfigProvider;
    private final Provider autoBuddyManagerProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider imageCacheProvider;
    private final Provider intentHandlerProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider soundsProvider;
    private final Provider spannedProvider;
    private final Provider stateManagerProvider;
    private final Provider telemetryHelperProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider updateManagerProvider;
    private final Provider userPrefsProvider;

    public HubActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, 
            Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32)
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
        contactUtilProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        }
        spannedProvider = provider24;
        if (!$assertionsDisabled && provider25 == null)
        {
            throw new AssertionError();
        }
        adPlacerProvider = provider25;
        if (!$assertionsDisabled && provider26 == null)
        {
            throw new AssertionError();
        }
        updateManagerProvider = provider26;
        if (!$assertionsDisabled && provider27 == null)
        {
            throw new AssertionError();
        }
        appConfigProvider = provider27;
        if (!$assertionsDisabled && provider28 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider28;
        if (!$assertionsDisabled && provider29 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider29;
        if (!$assertionsDisabled && provider30 == null)
        {
            throw new AssertionError();
        }
        telemetryHelperProvider = provider30;
        if (!$assertionsDisabled && provider31 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider31;
        if (!$assertionsDisabled && provider32 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider32;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, 
            Provider provider29, Provider provider30, Provider provider31, Provider provider32)
    {
        return new HubActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32);
    }

    public final void injectMembers(HubActivity hubactivity)
    {
        if (hubactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(hubactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(hubactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(hubactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(hubactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(hubactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(hubactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(hubactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(hubactivity, activityAccountStateObserverProvider);
            AbstractSignInActivity_MembersInjector.injectNavigation(hubactivity, navigationProvider);
            AbstractSignInActivity_MembersInjector.injectNavigationUrl(hubactivity, navigationUrlProvider);
            AbstractSignInActivity_MembersInjector.injectLayoutExperience(hubactivity, layoutExperienceProvider);
            AbstractSignInActivity_MembersInjector.injectLib(hubactivity, libProvider);
            AbstractSignInActivity_MembersInjector.injectAccountProvider(hubactivity, accountProvider);
            AbstractSignInActivity_MembersInjector.injectAnalytics(hubactivity, analyticsProvider);
            AbstractSignInActivity_MembersInjector.injectSounds(hubactivity, soundsProvider);
            AbstractSignInActivity_MembersInjector.injectMnvManager(hubactivity, mnvManagerProvider);
            AbstractSignInActivity_MembersInjector.injectAutoBuddyManager(hubactivity, autoBuddyManagerProvider);
            AbstractSignInActivity_MembersInjector.injectStateManager(hubactivity, stateManagerProvider);
            AbstractSignInActivity_MembersInjector.injectConfiguration(hubactivity, configurationProvider);
            AbstractSignInActivity_MembersInjector.injectAnalyticsPersistentStorage(hubactivity, analyticsPersistentStorageProvider);
            AbstractSignInActivity_MembersInjector.injectIntentHandler(hubactivity, intentHandlerProvider);
            AbstractSignInActivity_MembersInjector.injectAccountStatusNotifier(hubactivity, accountStatusNotifierProvider);
            hubactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            hubactivity.imageCache = (ImageCache)imageCacheProvider.get();
            hubactivity.spanned = (ContactMoodCache)spannedProvider.get();
            hubactivity.navigation = (Navigation)navigationProvider.get();
            hubactivity.adPlacer = (AdPlacer)adPlacerProvider.get();
            hubactivity.updateManager = (UpdateManager)updateManagerProvider.get();
            hubactivity.analytics = (Analytics)analyticsProvider.get();
            hubactivity.appConfig = (ApplicationConfig)appConfigProvider.get();
            hubactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            hubactivity.lib = (SkyLib)libProvider.get();
            hubactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            hubactivity.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            hubactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            hubactivity.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            hubactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HubActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/main/HubActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
