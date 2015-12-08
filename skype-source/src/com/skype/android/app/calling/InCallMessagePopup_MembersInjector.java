// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.SkyLib;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            InCallMessagePopup

public final class InCallMessagePopup_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider chatTextProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider transferUtilProvider;
    private final Provider userPreferencesProvider;

    public InCallMessagePopup_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider;
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
        libProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new InCallMessagePopup_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectChatText(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.chatText = (ChatText)provider.get();
    }

    public static void injectConfiguration(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectContactUtil(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectImageCache(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.lib = (SkyLib)provider.get();
    }

    public static void injectTransferUtil(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.transferUtil = (TransferUtil)provider.get();
    }

    public static void injectUserPreferences(InCallMessagePopup incallmessagepopup, Provider provider)
    {
        incallmessagepopup.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(InCallMessagePopup incallmessagepopup)
    {
        if (incallmessagepopup == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            incallmessagepopup.chatText = (ChatText)chatTextProvider.get();
            incallmessagepopup.contactUtil = (ContactUtil)contactUtilProvider.get();
            incallmessagepopup.imageCache = (ImageCache)imageCacheProvider.get();
            incallmessagepopup.lib = (SkyLib)libProvider.get();
            incallmessagepopup.transferUtil = (TransferUtil)transferUtilProvider.get();
            incallmessagepopup.userPreferences = (UserPreferences)userPreferencesProvider.get();
            incallmessagepopup.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((InCallMessagePopup)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/InCallMessagePopup_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
