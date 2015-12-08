// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.view.inputmethod.InputMethodManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.main:
//            EditPropertyFragment

public final class EditPropertyFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider analyticsProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider immProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider messageCacheProvider;
    private final Provider moodCacheProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider translatorProvider;

    public EditPropertyFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
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
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        moodCacheProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        immProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        messageCacheProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        translatorProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            conversationUtilProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new EditPropertyFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccessibility(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.account = (Account)provider.get();
    }

    public static void injectActionBarCustomizer(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.analytics = (Analytics)provider.get();
    }

    public static void injectChatText(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.chatText = (ChatText)provider.get();
    }

    public static void injectContactUtil(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEcsConfiguration(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImm(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.imm = (InputMethodManager)provider.get();
    }

    public static void injectLayoutExperience(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMessageCache(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.messageCache = (FormattedMessageCache)provider.get();
    }

    public static void injectMoodCache(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.moodCache = (ContactMoodCache)provider.get();
    }

    public static void injectTranslator(EditPropertyFragment editpropertyfragment, Provider provider)
    {
        editpropertyfragment.translator = (Translator)provider.get();
    }

    public final void injectMembers(EditPropertyFragment editpropertyfragment)
    {
        if (editpropertyfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(editpropertyfragment, objectInterfaceFinderProvider);
            editpropertyfragment.account = (Account)accountProvider.get();
            editpropertyfragment.lib = (SkyLib)libProvider.get();
            editpropertyfragment.map = (ObjectIdMap)mapProvider.get();
            editpropertyfragment.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            editpropertyfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            editpropertyfragment.moodCache = (ContactMoodCache)moodCacheProvider.get();
            editpropertyfragment.imm = (InputMethodManager)immProvider.get();
            editpropertyfragment.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            editpropertyfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            editpropertyfragment.chatText = (ChatText)chatTextProvider.get();
            editpropertyfragment.analytics = (Analytics)analyticsProvider.get();
            editpropertyfragment.messageCache = (FormattedMessageCache)messageCacheProvider.get();
            editpropertyfragment.translator = (Translator)translatorProvider.get();
            editpropertyfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            editpropertyfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EditPropertyFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/main/EditPropertyFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
