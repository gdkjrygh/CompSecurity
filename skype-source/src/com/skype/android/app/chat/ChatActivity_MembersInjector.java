// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.AudioManager;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity

public final class ChatActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider audioManagerProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider cqfManagerProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider layoutExperienceProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider telemetryHelperProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPreferencesProvider;

    public ChatActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21)
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
        actionBarCustomizerProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        cqfManagerProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        telemetryHelperProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        permissionRequestProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        } else
        {
            userPreferencesProvider = provider21;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21)
    {
        return new ChatActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21);
    }

    public static void injectAccessibility(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectActionBarCustomizer(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAudioManager(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.audioManager = (AudioManager)provider.get();
    }

    public static void injectContactUtil(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectCqfManager(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.cqfManager = (CallQualityFeedbackManager)provider.get();
    }

    public static void injectEcsConfiguration(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLayoutExperience(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectMap(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.navigation = (Navigation)provider.get();
    }

    public static void injectPermissionRequest(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.permissionRequest = (PermissionRequest)provider.get();
    }

    public static void injectTelemetryHelper(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.telemetryHelper = (TelemetryHelper)provider.get();
    }

    public static void injectUserPreferences(ChatActivity chatactivity, Provider provider)
    {
        chatactivity.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(ChatActivity chatactivity)
    {
        if (chatactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(chatactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(chatactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(chatactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(chatactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(chatactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(chatactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(chatactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(chatactivity, activityAccountStateObserverProvider);
            chatactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            chatactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            chatactivity.map = (ObjectIdMap)mapProvider.get();
            chatactivity.navigation = (Navigation)navigationProvider.get();
            chatactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            chatactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            chatactivity.analytics = (Analytics)analyticsProvider.get();
            chatactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            chatactivity.audioManager = (AudioManager)audioManagerProvider.get();
            chatactivity.cqfManager = (CallQualityFeedbackManager)cqfManagerProvider.get();
            chatactivity.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            chatactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            chatactivity.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            chatactivity.userPreferences = (UserPreferences)userPreferencesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChatActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ChatActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
