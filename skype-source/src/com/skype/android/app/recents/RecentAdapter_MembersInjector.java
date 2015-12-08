// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.chat.AnnotationUtil;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ServerClock;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.recents:
//            RecentAdapter

public final class RecentAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider chatTextProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider groupAvatarUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentDownloadUtilProvider;
    private final Provider serverClockProvider;
    private final Provider spanCacheProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider transferUtilProvider;

    public RecentAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18)
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
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        serverClockProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        spanCacheProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentDownloadUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        groupAvatarUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        } else
        {
            annotationUtilProvider = provider18;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        return new RecentAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static void injectAccount(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.account = (Account)provider.get();
    }

    public static void injectAnalytics(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.analytics = (Analytics)provider.get();
    }

    public static void injectAnnotationUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.annotationUtil = (AnnotationUtil)provider.get();
    }

    public static void injectChatText(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.chatText = (ChatText)provider.get();
    }

    public static void injectConfiguration(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectContactUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDefaultAvatars(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectGroupAvatarUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.groupAvatarUtil = (GroupAvatarUtil)provider.get();
    }

    public static void injectImageCache(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExperience(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.lib = (SkyLib)provider.get();
    }

    public static void injectMap(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentDownloadUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)provider.get();
    }

    public static void injectServerClock(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.serverClock = (ServerClock)provider.get();
    }

    public static void injectSpanCache(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.spanCache = (FormattedMessageCache)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.timeUtil = (TimeUtil)provider.get();
    }

    public static void injectTransferUtil(RecentAdapter recentadapter, Provider provider)
    {
        recentadapter.transferUtil = (TransferUtil)provider.get();
    }

    public final void injectMembers(RecentAdapter recentadapter)
    {
        if (recentadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            recentadapter.account = (Account)accountProvider.get();
            recentadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            recentadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            recentadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            recentadapter.serverClock = (ServerClock)serverClockProvider.get();
            recentadapter.transferUtil = (TransferUtil)transferUtilProvider.get();
            recentadapter.spanCache = (FormattedMessageCache)spanCacheProvider.get();
            recentadapter.chatText = (ChatText)chatTextProvider.get();
            recentadapter.imageCache = (ImageCache)imageCacheProvider.get();
            recentadapter.lib = (SkyLib)libProvider.get();
            recentadapter.map = (ObjectIdMap)mapProvider.get();
            recentadapter.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)mediaDocumentDownloadUtilProvider.get();
            recentadapter.groupAvatarUtil = (GroupAvatarUtil)groupAvatarUtilProvider.get();
            recentadapter.analytics = (Analytics)analyticsProvider.get();
            recentadapter.configuration = (EcsConfiguration)configurationProvider.get();
            recentadapter.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            recentadapter.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            recentadapter.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            recentadapter.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecentAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/recents/RecentAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
