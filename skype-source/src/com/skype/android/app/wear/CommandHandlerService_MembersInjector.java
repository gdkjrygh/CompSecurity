// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.LoginManager;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.wear:
//            CommandHandlerService, WearDataRequestCache

public final class CommandHandlerService_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider dreamKeeperProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider loginManagerProvider;
    private final Provider mapProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider messageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navProvider;
    private final Provider transferUtilProvider;
    private final Provider wearCacheProvider;

    public CommandHandlerService_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        navProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mediaContentRosterProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        wearCacheProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        messageCacheProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider14;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14)
    {
        return new CommandHandlerService_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectAnalytics(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.analytics = (Analytics)provider.get();
    }

    public static void injectAsync(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.async = (AsyncService)provider.get();
    }

    public static void injectConversationUtil(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectDreamKeeper(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.dreamKeeper = (DreamKeeper)provider.get();
    }

    public static void injectImageCache(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.lib = (SkyLib)provider.get();
    }

    public static void injectLoginManager(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.loginManager = (LoginManager)provider.get();
    }

    public static void injectMap(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaContentRoster(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectMessageCache(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.messageCache = (FormattedMessageCache)provider.get();
    }

    public static void injectMessageHolderUtil(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.messageHolderUtil = (MessageHolderUtil)provider.get();
    }

    public static void injectNav(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.nav = (BackgroundNavigation)provider.get();
    }

    public static void injectTransferUtil(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.transferUtil = (TransferUtil)provider.get();
    }

    public static void injectWearCache(CommandHandlerService commandhandlerservice, Provider provider)
    {
        commandhandlerservice.wearCache = (WearDataRequestCache)provider.get();
    }

    public final void injectMembers(CommandHandlerService commandhandlerservice)
    {
        if (commandhandlerservice == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            commandhandlerservice.nav = (BackgroundNavigation)navProvider.get();
            commandhandlerservice.lib = (SkyLib)libProvider.get();
            commandhandlerservice.loginManager = (LoginManager)loginManagerProvider.get();
            commandhandlerservice.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            commandhandlerservice.map = (ObjectIdMap)mapProvider.get();
            commandhandlerservice.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            commandhandlerservice.async = (AsyncService)asyncProvider.get();
            commandhandlerservice.imageCache = (ImageCache)imageCacheProvider.get();
            commandhandlerservice.wearCache = (WearDataRequestCache)wearCacheProvider.get();
            commandhandlerservice.messageCache = (FormattedMessageCache)messageCacheProvider.get();
            commandhandlerservice.dreamKeeper = (DreamKeeper)dreamKeeperProvider.get();
            commandhandlerservice.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            commandhandlerservice.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            commandhandlerservice.transferUtil = (TransferUtil)transferUtilProvider.get();
            commandhandlerservice.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommandHandlerService)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/wear/CommandHandlerService_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
