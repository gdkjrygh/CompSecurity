// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.LoggingTelemetry;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            TextMessageViewAdapter, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class TextMessageViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider configurationAndEcsConfigurationProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider spannedTextProvider;
    private final Provider telemetryLoggerProvider;
    private final Provider timeUtilProvider;
    private final Provider translatorProvider;
    private final Provider userPreferencesProvider;

    public TextMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accessibilityAndAccessibilityUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        configurationAndEcsConfigurationProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        annotationUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        spannedTextProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        telemetryLoggerProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        } else
        {
            translatorProvider = provider16;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16)
    {
        return new TextMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static void injectAccessibilityUtil(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.analytics = (Analytics)provider.get();
    }

    public static void injectConfiguration(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectConversationUtil(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLib(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.lib = (SkyLib)provider.get();
    }

    public static void injectMap(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.map = (ObjectIdMap)provider.get();
    }

    public static void injectSpannedText(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.spannedText = (FormattedMessageCache)provider.get();
    }

    public static void injectTelemetryLogger(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.telemetryLogger = (LoggingTelemetry)provider.get();
    }

    public static void injectTranslator(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.translator = (Translator)provider.get();
    }

    public static void injectUserPreferences(TextMessageViewAdapter textmessageviewadapter, Provider provider)
    {
        textmessageviewadapter.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(TextMessageViewAdapter textmessageviewadapter)
    {
        if (textmessageviewadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            textmessageviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            textmessageviewadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            textmessageviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            textmessageviewadapter.navigation = (Navigation)navigationProvider.get();
            textmessageviewadapter.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            textmessageviewadapter.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            textmessageviewadapter.analytics = (Analytics)analyticsProvider.get();
            textmessageviewadapter.ecsConfiguration = (EcsConfiguration)configurationAndEcsConfigurationProvider.get();
            textmessageviewadapter.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            textmessageviewadapter.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            textmessageviewadapter.lib = (SkyLib)libProvider.get();
            textmessageviewadapter.spannedText = (FormattedMessageCache)spannedTextProvider.get();
            textmessageviewadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            textmessageviewadapter.accessibilityUtil = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            textmessageviewadapter.userPreferences = (UserPreferences)userPreferencesProvider.get();
            textmessageviewadapter.configuration = (EcsConfiguration)configurationAndEcsConfigurationProvider.get();
            textmessageviewadapter.telemetryLogger = (LoggingTelemetry)telemetryLoggerProvider.get();
            textmessageviewadapter.map = (ObjectIdMap)mapProvider.get();
            textmessageviewadapter.analytics = (Analytics)analyticsProvider.get();
            textmessageviewadapter.translator = (Translator)translatorProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TextMessageViewAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/TextMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
