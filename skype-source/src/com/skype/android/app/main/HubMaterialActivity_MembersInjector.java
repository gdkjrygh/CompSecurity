// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.view.inputmethod.InputMethodManager;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.contacts.ConversationAdapter;
import com.skype.android.app.search.AgentProvisioningServiceClient;
import com.skype.android.app.search.AgentSyncWaiter;
import com.skype.android.app.search.ContactSearchResultAdapter;
import com.skype.android.app.search.ConversationsSearchResultAdapter;
import com.skype.android.app.search.MessagesSearchResultAdapter;
import com.skype.android.app.search.SearchMultipleSourceAdapter;
import com.skype.android.app.search.SuggestedAgentsAdapter;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.app.signin.AbstractSignInActivity_MembersInjector;
import com.skype.android.app.signin.AccountStatusNotifier;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
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
//            HubMaterialActivity, AbstractHubActivity

public final class HubMaterialActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider accountStatusNotifierProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider adPlacerProvider;
    private final Provider agentProvisioningServiceClientProvider;
    private final Provider agentSyncWaiterProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider appConfigProvider;
    private final Provider asyncProvider;
    private final Provider autoBuddyManagerProvider;
    private final Provider chatServiceMonitorProvider;
    private final Provider configurationAndEcsConfigurationProvider;
    private final Provider contactSearchResultAdapterProvider;
    private final Provider contactUtilProvider;
    private final Provider contactsManagerProvider;
    private final Provider conversationAdapterProvider;
    private final Provider conversationsSearchResultAdapterProvider;
    private final Provider crashReporterProvider;
    private final Provider eventBusProvider;
    private final Provider imageCacheProvider;
    private final Provider immProvider;
    private final Provider intentHandlerProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider messagesSearchResultAdapterProvider;
    private final Provider mnvManagerProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider searchMultipleSourceAdapterProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider soundsProvider;
    private final Provider spannedProvider;
    private final Provider stateManagerProvider;
    private final Provider suggestedAgentsAdapterProvider;
    private final Provider telemetryHelperProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider updateManagerProvider;
    private final Provider userPrefsProvider;

    public HubMaterialActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, 
            Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34, 
            Provider provider35, Provider provider36, Provider provider37, Provider provider38, Provider provider39, Provider provider40, Provider provider41, 
            Provider provider42, Provider provider43, Provider provider44, Provider provider45, Provider provider46)
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
        }
        permissionRequestProvider = provider32;
        if (!$assertionsDisabled && provider33 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider33;
        if (!$assertionsDisabled && provider34 == null)
        {
            throw new AssertionError();
        }
        conversationAdapterProvider = provider34;
        if (!$assertionsDisabled && provider35 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider35;
        if (!$assertionsDisabled && provider36 == null)
        {
            throw new AssertionError();
        }
        immProvider = provider36;
        if (!$assertionsDisabled && provider37 == null)
        {
            throw new AssertionError();
        }
        contactsManagerProvider = provider37;
        if (!$assertionsDisabled && provider38 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider38;
        if (!$assertionsDisabled && provider39 == null)
        {
            throw new AssertionError();
        }
        chatServiceMonitorProvider = provider39;
        if (!$assertionsDisabled && provider40 == null)
        {
            throw new AssertionError();
        }
        searchMultipleSourceAdapterProvider = provider40;
        if (!$assertionsDisabled && provider41 == null)
        {
            throw new AssertionError();
        }
        conversationsSearchResultAdapterProvider = provider41;
        if (!$assertionsDisabled && provider42 == null)
        {
            throw new AssertionError();
        }
        contactSearchResultAdapterProvider = provider42;
        if (!$assertionsDisabled && provider43 == null)
        {
            throw new AssertionError();
        }
        messagesSearchResultAdapterProvider = provider43;
        if (!$assertionsDisabled && provider44 == null)
        {
            throw new AssertionError();
        }
        agentProvisioningServiceClientProvider = provider44;
        if (!$assertionsDisabled && provider45 == null)
        {
            throw new AssertionError();
        }
        suggestedAgentsAdapterProvider = provider45;
        if (!$assertionsDisabled && provider46 == null)
        {
            throw new AssertionError();
        } else
        {
            agentSyncWaiterProvider = provider46;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, 
            Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34, Provider provider35, 
            Provider provider36, Provider provider37, Provider provider38, Provider provider39, Provider provider40, Provider provider41, Provider provider42, 
            Provider provider43, Provider provider44, Provider provider45, Provider provider46)
    {
        return new HubMaterialActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41, provider42, provider43, provider44, provider45, provider46);
    }

    public static void injectAgentProvisioningServiceClient(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.agentProvisioningServiceClient = (AgentProvisioningServiceClient)provider.get();
    }

    public static void injectAgentSyncWaiter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.agentSyncWaiter = (AgentSyncWaiter)provider.get();
    }

    public static void injectAsync(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.async = (AsyncService)provider.get();
    }

    public static void injectChatServiceMonitor(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.chatServiceMonitor = (ChatServiceMonitor)provider.get();
    }

    public static void injectContactSearchResultAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.contactSearchResultAdapter = (ContactSearchResultAdapter)provider.get();
    }

    public static void injectContactsManager(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.contactsManager = (PromotedSCDContactsManager)provider.get();
    }

    public static void injectConversationAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.conversationAdapter = (ConversationAdapter)provider.get();
    }

    public static void injectConversationsSearchResultAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.conversationsSearchResultAdapter = (ConversationsSearchResultAdapter)provider.get();
    }

    public static void injectEcsConfiguration(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectEventBus(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.eventBus = (EventBus)provider.get();
    }

    public static void injectImm(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.imm = (InputMethodManager)provider.get();
    }

    public static void injectMap(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectMessagesSearchResultAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.messagesSearchResultAdapter = (MessagesSearchResultAdapter)provider.get();
    }

    public static void injectSearchMultipleSourceAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.searchMultipleSourceAdapter = (SearchMultipleSourceAdapter)provider.get();
    }

    public static void injectSuggestedAgentsAdapter(HubMaterialActivity hubmaterialactivity, Provider provider)
    {
        hubmaterialactivity.suggestedAgentsAdapter = (SuggestedAgentsAdapter)provider.get();
    }

    public final void injectMembers(HubMaterialActivity hubmaterialactivity)
    {
        if (hubmaterialactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(hubmaterialactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(hubmaterialactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(hubmaterialactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(hubmaterialactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(hubmaterialactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(hubmaterialactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(hubmaterialactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(hubmaterialactivity, activityAccountStateObserverProvider);
            AbstractSignInActivity_MembersInjector.injectNavigation(hubmaterialactivity, navigationProvider);
            AbstractSignInActivity_MembersInjector.injectNavigationUrl(hubmaterialactivity, navigationUrlProvider);
            AbstractSignInActivity_MembersInjector.injectLayoutExperience(hubmaterialactivity, layoutExperienceProvider);
            AbstractSignInActivity_MembersInjector.injectLib(hubmaterialactivity, libProvider);
            AbstractSignInActivity_MembersInjector.injectAccountProvider(hubmaterialactivity, accountProvider);
            AbstractSignInActivity_MembersInjector.injectAnalytics(hubmaterialactivity, analyticsProvider);
            AbstractSignInActivity_MembersInjector.injectSounds(hubmaterialactivity, soundsProvider);
            AbstractSignInActivity_MembersInjector.injectMnvManager(hubmaterialactivity, mnvManagerProvider);
            AbstractSignInActivity_MembersInjector.injectAutoBuddyManager(hubmaterialactivity, autoBuddyManagerProvider);
            AbstractSignInActivity_MembersInjector.injectStateManager(hubmaterialactivity, stateManagerProvider);
            AbstractSignInActivity_MembersInjector.injectConfiguration(hubmaterialactivity, configurationAndEcsConfigurationProvider);
            AbstractSignInActivity_MembersInjector.injectAnalyticsPersistentStorage(hubmaterialactivity, analyticsPersistentStorageProvider);
            AbstractSignInActivity_MembersInjector.injectIntentHandler(hubmaterialactivity, intentHandlerProvider);
            AbstractSignInActivity_MembersInjector.injectAccountStatusNotifier(hubmaterialactivity, accountStatusNotifierProvider);
            hubmaterialactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            hubmaterialactivity.imageCache = (ImageCache)imageCacheProvider.get();
            hubmaterialactivity.spanned = (ContactMoodCache)spannedProvider.get();
            hubmaterialactivity.navigation = (Navigation)navigationProvider.get();
            hubmaterialactivity.adPlacer = (AdPlacer)adPlacerProvider.get();
            hubmaterialactivity.updateManager = (UpdateManager)updateManagerProvider.get();
            hubmaterialactivity.analytics = (Analytics)analyticsProvider.get();
            hubmaterialactivity.appConfig = (ApplicationConfig)appConfigProvider.get();
            hubmaterialactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            hubmaterialactivity.lib = (SkyLib)libProvider.get();
            hubmaterialactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            hubmaterialactivity.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            hubmaterialactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            hubmaterialactivity.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            hubmaterialactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            hubmaterialactivity.map = (ObjectIdMap)mapProvider.get();
            hubmaterialactivity.conversationAdapter = (ConversationAdapter)conversationAdapterProvider.get();
            hubmaterialactivity.async = (AsyncService)asyncProvider.get();
            hubmaterialactivity.ecsConfiguration = (EcsConfiguration)configurationAndEcsConfigurationProvider.get();
            hubmaterialactivity.imm = (InputMethodManager)immProvider.get();
            hubmaterialactivity.contactsManager = (PromotedSCDContactsManager)contactsManagerProvider.get();
            hubmaterialactivity.eventBus = (EventBus)eventBusProvider.get();
            hubmaterialactivity.chatServiceMonitor = (ChatServiceMonitor)chatServiceMonitorProvider.get();
            hubmaterialactivity.searchMultipleSourceAdapter = (SearchMultipleSourceAdapter)searchMultipleSourceAdapterProvider.get();
            hubmaterialactivity.conversationsSearchResultAdapter = (ConversationsSearchResultAdapter)conversationsSearchResultAdapterProvider.get();
            hubmaterialactivity.contactSearchResultAdapter = (ContactSearchResultAdapter)contactSearchResultAdapterProvider.get();
            hubmaterialactivity.messagesSearchResultAdapter = (MessagesSearchResultAdapter)messagesSearchResultAdapterProvider.get();
            hubmaterialactivity.agentProvisioningServiceClient = (AgentProvisioningServiceClient)agentProvisioningServiceClientProvider.get();
            hubmaterialactivity.suggestedAgentsAdapter = (SuggestedAgentsAdapter)suggestedAgentsAdapterProvider.get();
            hubmaterialactivity.agentSyncWaiter = (AgentSyncWaiter)agentSyncWaiterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HubMaterialActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/main/HubMaterialActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
