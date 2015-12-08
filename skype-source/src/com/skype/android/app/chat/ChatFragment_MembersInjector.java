// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.NotificationManager;
import android.view.inputmethod.InputMethodManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment, AnnotationUtil, MessageHolderUtil

public final class ChatFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider asyncProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider eventBusProvider;
    private final Provider imageCacheProvider;
    private final Provider imeProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider mediaDocumentDownloadUtilProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider messageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider mruManagerProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider networkUtilProvider;
    private final Provider notificationManagerProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider pushMessageRepositoryProvider;
    private final Provider skypeCreditProvider;
    private final Provider stateManagerProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider transferUtilProvider;
    private final Provider translatorProvider;
    private final Provider userPreferencesProvider;

    public ChatFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, 
            Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34, 
            Provider provider35)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        skypeCreditProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        imeProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        messageCacheProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        pushMessageRepositoryProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider21;
        if (!$assertionsDisabled && provider22 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentUploadUtilProvider = provider22;
        if (!$assertionsDisabled && provider23 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentDownloadUtilProvider = provider23;
        if (!$assertionsDisabled && provider24 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider24;
        if (!$assertionsDisabled && provider25 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider25;
        if (!$assertionsDisabled && provider26 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider26;
        if (!$assertionsDisabled && provider27 == null)
        {
            throw new AssertionError();
        }
        mruManagerProvider = provider27;
        if (!$assertionsDisabled && provider28 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider28;
        if (!$assertionsDisabled && provider29 == null)
        {
            throw new AssertionError();
        }
        permissionRequestProvider = provider29;
        if (!$assertionsDisabled && provider30 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider30;
        if (!$assertionsDisabled && provider31 == null)
        {
            throw new AssertionError();
        }
        translatorProvider = provider31;
        if (!$assertionsDisabled && provider32 == null)
        {
            throw new AssertionError();
        }
        mediaContentRosterProvider = provider32;
        if (!$assertionsDisabled && provider33 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider33;
        if (!$assertionsDisabled && provider34 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider34;
        if (!$assertionsDisabled && provider35 == null)
        {
            throw new AssertionError();
        } else
        {
            annotationUtilProvider = provider35;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, 
            Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, 
            Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34, Provider provider35)
    {
        return new ChatFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35);
    }

    public static void injectAccessibility(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.account = (Account)provider.get();
    }

    public static void injectActionBarCustomizer(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAnnotationUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.annotationUtil = (AnnotationUtil)provider.get();
    }

    public static void injectAsync(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.async = (AsyncService)provider.get();
    }

    public static void injectChatText(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.chatText = (ChatText)provider.get();
    }

    public static void injectContactUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEcsConfiguration(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectEventBus(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.eventBus = (EventBus)provider.get();
    }

    public static void injectImageCache(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectIme(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.ime = (InputMethodManager)provider.get();
    }

    public static void injectLayoutExperience(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaContentRoster(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectMediaDocumentDownloadUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectMessageCache(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.messageCache = (FormattedMessageCache)provider.get();
    }

    public static void injectMessageHolderUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.messageHolderUtil = (MessageHolderUtil)provider.get();
    }

    public static void injectMruManager(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.mruManager = (MRUManager)provider.get();
    }

    public static void injectNavigation(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.navigation = (Navigation)provider.get();
    }

    public static void injectNavigationUrl(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.navigationUrl = (NavigationUrl)provider.get();
    }

    public static void injectNetworkUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.networkUtil = (NetworkUtil)provider.get();
    }

    public static void injectNotificationManager(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.notificationManager = (NotificationManager)provider.get();
    }

    public static void injectPermissionRequest(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.permissionRequest = (PermissionRequest)provider.get();
    }

    public static void injectPushMessageRepository(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.pushMessageRepository = (PushMessageRepository)provider.get();
    }

    public static void injectSkypeCredit(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.skypeCredit = (SkypeCredit)provider.get();
    }

    public static void injectStateManager(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.stateManager = (ViewStateManager)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.timeUtil = (TimeUtil)provider.get();
    }

    public static void injectTransferUtil(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.transferUtil = (TransferUtil)provider.get();
    }

    public static void injectTranslator(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.translator = (Translator)provider.get();
    }

    public static void injectUserPreferences(ChatFragment chatfragment, Provider provider)
    {
        chatfragment.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(ChatFragment chatfragment)
    {
        if (chatfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(chatfragment, objectInterfaceFinderProvider);
            chatfragment.lib = (SkyLib)libProvider.get();
            chatfragment.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            chatfragment.async = (AsyncService)asyncProvider.get();
            chatfragment.account = (Account)accountProvider.get();
            chatfragment.map = (ObjectIdMap)mapProvider.get();
            chatfragment.skypeCredit = (SkypeCredit)skypeCreditProvider.get();
            chatfragment.ime = (InputMethodManager)imeProvider.get();
            chatfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            chatfragment.timeUtil = (TimeUtil)timeUtilProvider.get();
            chatfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            chatfragment.navigation = (Navigation)navigationProvider.get();
            chatfragment.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            chatfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            chatfragment.messageCache = (FormattedMessageCache)messageCacheProvider.get();
            chatfragment.stateManager = (ViewStateManager)stateManagerProvider.get();
            chatfragment.analytics = (Analytics)analyticsProvider.get();
            chatfragment.notificationManager = (NotificationManager)notificationManagerProvider.get();
            chatfragment.transferUtil = (TransferUtil)transferUtilProvider.get();
            chatfragment.imageCache = (ImageCache)imageCacheProvider.get();
            chatfragment.pushMessageRepository = (PushMessageRepository)pushMessageRepositoryProvider.get();
            chatfragment.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            chatfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            chatfragment.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)mediaDocumentDownloadUtilProvider.get();
            chatfragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            chatfragment.chatText = (ChatText)chatTextProvider.get();
            chatfragment.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            chatfragment.mruManager = (MRUManager)mruManagerProvider.get();
            chatfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            chatfragment.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            chatfragment.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            chatfragment.translator = (Translator)translatorProvider.get();
            chatfragment.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            chatfragment.eventBus = (EventBus)eventBusProvider.get();
            chatfragment.networkUtil = (NetworkUtil)networkUtilProvider.get();
            chatfragment.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChatFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ChatFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
