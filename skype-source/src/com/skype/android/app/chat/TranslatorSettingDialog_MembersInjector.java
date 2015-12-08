// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Account;
import com.skype.Translator;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.event.EventBus;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

public final class TranslatorSettingDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider eventBusProvider;
    private final Provider imageCacheProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider translatorProvider;

    public TranslatorSettingDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
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
        translatorProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new TranslatorSettingDialog_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAccount(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.account = (Account)provider.get();
    }

    public static void injectAnalytics(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectEventBus(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.eventBus = (EventBus)provider.get();
    }

    public static void injectImageCache(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.imageCache = (ImageCache)provider.get();
    }

    public static void injectTranslator(TranslatorSettingDialog translatorsettingdialog, Provider provider)
    {
        translatorsettingdialog.translator = (Translator)provider.get();
    }

    public final void injectMembers(TranslatorSettingDialog translatorsettingdialog)
    {
        if (translatorsettingdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(translatorsettingdialog, objectInterfaceFinderProvider);
            translatorsettingdialog.translator = (Translator)translatorProvider.get();
            translatorsettingdialog.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            translatorsettingdialog.imageCache = (ImageCache)imageCacheProvider.get();
            translatorsettingdialog.account = (Account)accountProvider.get();
            translatorsettingdialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            translatorsettingdialog.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            translatorsettingdialog.eventBus = (EventBus)eventBusProvider.get();
            translatorsettingdialog.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TranslatorSettingDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/TranslatorSettingDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
