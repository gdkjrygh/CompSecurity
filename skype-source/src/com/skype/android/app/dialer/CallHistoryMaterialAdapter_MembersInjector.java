// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.android.app.Navigation;
import com.skype.android.app.recents.RecentAdapter_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            CallHistoryMaterialAdapter

public final class CallHistoryMaterialAdapter_MembersInjector
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
    private final Provider navigationProvider;
    private final Provider serverClockProvider;
    private final Provider spanCacheProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider transferUtilProvider;

    public CallHistoryMaterialAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19)
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
        }
        annotationUtilProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        } else
        {
            navigationProvider = provider19;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19)
    {
        return new CallHistoryMaterialAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectConversationUtil(CallHistoryMaterialAdapter callhistorymaterialadapter, Provider provider)
    {
        callhistorymaterialadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectMap(CallHistoryMaterialAdapter callhistorymaterialadapter, Provider provider)
    {
        callhistorymaterialadapter.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(CallHistoryMaterialAdapter callhistorymaterialadapter, Provider provider)
    {
        callhistorymaterialadapter.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(CallHistoryMaterialAdapter callhistorymaterialadapter)
    {
        if (callhistorymaterialadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            RecentAdapter_MembersInjector.injectAccount(callhistorymaterialadapter, accountProvider);
            RecentAdapter_MembersInjector.injectContactUtil(callhistorymaterialadapter, contactUtilProvider);
            RecentAdapter_MembersInjector.injectConversationUtil(callhistorymaterialadapter, conversationUtilProvider);
            RecentAdapter_MembersInjector.injectTimeUtil(callhistorymaterialadapter, timeUtilProvider);
            RecentAdapter_MembersInjector.injectServerClock(callhistorymaterialadapter, serverClockProvider);
            RecentAdapter_MembersInjector.injectTransferUtil(callhistorymaterialadapter, transferUtilProvider);
            RecentAdapter_MembersInjector.injectSpanCache(callhistorymaterialadapter, spanCacheProvider);
            RecentAdapter_MembersInjector.injectChatText(callhistorymaterialadapter, chatTextProvider);
            RecentAdapter_MembersInjector.injectImageCache(callhistorymaterialadapter, imageCacheProvider);
            RecentAdapter_MembersInjector.injectLib(callhistorymaterialadapter, libProvider);
            RecentAdapter_MembersInjector.injectMap(callhistorymaterialadapter, mapProvider);
            RecentAdapter_MembersInjector.injectMediaDocumentDownloadUtil(callhistorymaterialadapter, mediaDocumentDownloadUtilProvider);
            RecentAdapter_MembersInjector.injectGroupAvatarUtil(callhistorymaterialadapter, groupAvatarUtilProvider);
            RecentAdapter_MembersInjector.injectAnalytics(callhistorymaterialadapter, analyticsProvider);
            RecentAdapter_MembersInjector.injectConfiguration(callhistorymaterialadapter, configurationProvider);
            RecentAdapter_MembersInjector.injectTimeAnomalyTelemetry(callhistorymaterialadapter, timeAnomalyTelemetryProvider);
            RecentAdapter_MembersInjector.injectDefaultAvatars(callhistorymaterialadapter, defaultAvatarsProvider);
            RecentAdapter_MembersInjector.injectLayoutExperience(callhistorymaterialadapter, layoutExperienceProvider);
            RecentAdapter_MembersInjector.injectAnnotationUtil(callhistorymaterialadapter, annotationUtilProvider);
            callhistorymaterialadapter.navigation = (Navigation)navigationProvider.get();
            callhistorymaterialadapter.map = (ObjectIdMap)mapProvider.get();
            callhistorymaterialadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallHistoryMaterialAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/CallHistoryMaterialAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
