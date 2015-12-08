// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Agent_MembersInjector;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaMessageAgent, MediaDocumentUploadUtil

public final class MediaMessageAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider accountProvider1;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider networkUtilProvider;
    private final Provider notificationManagerProvider;
    private final Provider userPrefsProvider;

    public MediaMessageAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentUploadUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        } else
        {
            accountProvider1 = provider10;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10)
    {
        return new MediaMessageAgent_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectAccountProvider(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectAnalytics(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.lib = (SkyLib)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectNetworkUtil(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.networkUtil = (NetworkUtil)provider.get();
    }

    public static void injectNotificationManager(MediaMessageAgent mediamessageagent, Provider provider)
    {
        mediamessageagent.notificationManager = (NotificationManager)provider.get();
    }

    public final void injectMembers(MediaMessageAgent mediamessageagent)
    {
        if (mediamessageagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(mediamessageagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(mediamessageagent, userPrefsProvider);
            mediamessageagent.lib = (SkyLib)libProvider.get();
            mediamessageagent.analytics = (Analytics)analyticsProvider.get();
            mediamessageagent.notificationManager = (NotificationManager)notificationManagerProvider.get();
            mediamessageagent.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            mediamessageagent.imageCache = (ImageCache)imageCacheProvider.get();
            mediamessageagent.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            mediamessageagent.networkUtil = (NetworkUtil)networkUtilProvider.get();
            mediamessageagent.contactUtil = (ContactUtil)contactUtilProvider.get();
            mediamessageagent.accountProvider = (AccountProvider)accountProvider1.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MediaMessageAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaMessageAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
