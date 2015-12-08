// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfoUtils;
import com.skype.android.res.ChatText;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageArea

public final class MessageArea_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider animationUtilProvider;
    private final Provider chatTextProvider;
    private final Provider configurationProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider packInfoUtilsProvider;
    private final Provider userPreferencesProvider;

    public MessageArea_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mediaContentRosterProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        animationUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            packInfoUtilsProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new MessageArea_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccessibility(MessageArea messagearea, Provider provider)
    {
        messagearea.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAnimationUtil(MessageArea messagearea, Provider provider)
    {
        messagearea.animationUtil = (PropertyAnimationUtil)provider.get();
    }

    public static void injectChatText(MessageArea messagearea, Provider provider)
    {
        messagearea.chatText = (ChatText)provider.get();
    }

    public static void injectConfiguration(MessageArea messagearea, Provider provider)
    {
        messagearea.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectMediaContentRoster(MessageArea messagearea, Provider provider)
    {
        messagearea.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectPackInfoUtils(MessageArea messagearea, Provider provider)
    {
        messagearea.packInfoUtils = (PackInfoUtils)provider.get();
    }

    public static void injectUserPreferences(MessageArea messagearea, Provider provider)
    {
        messagearea.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(MessageArea messagearea)
    {
        if (messagearea == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            messagearea.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            messagearea.animationUtil = (PropertyAnimationUtil)animationUtilProvider.get();
            messagearea.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            messagearea.configuration = (EcsConfiguration)configurationProvider.get();
            messagearea.userPreferences = (UserPreferences)userPreferencesProvider.get();
            messagearea.chatText = (ChatText)chatTextProvider.get();
            messagearea.packInfoUtils = (PackInfoUtils)packInfoUtilsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MessageArea)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/MessageArea_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
