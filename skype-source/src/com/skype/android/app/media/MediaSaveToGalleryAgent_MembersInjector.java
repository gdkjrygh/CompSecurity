// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.Account;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Agent_MembersInjector;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaSaveToGalleryAgent, MediaDocumentDownloadUtil

public final class MediaSaveToGalleryAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider eventBusProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentDownloadUtilProvider;
    private final Provider userPrefsProvider;

    public MediaSaveToGalleryAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
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
        asyncProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentDownloadUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new MediaSaveToGalleryAgent_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccount(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.account = (Account)provider.get();
    }

    public static void injectAnalytics(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.analytics = (Analytics)provider.get();
    }

    public static void injectAsync(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.async = (AsyncService)provider.get();
    }

    public static void injectEventBus(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.eventBus = (EventBus)provider.get();
    }

    public static void injectMap(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentDownloadUtil(MediaSaveToGalleryAgent mediasavetogalleryagent, Provider provider)
    {
        mediasavetogalleryagent.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)provider.get();
    }

    public final void injectMembers(MediaSaveToGalleryAgent mediasavetogalleryagent)
    {
        if (mediasavetogalleryagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(mediasavetogalleryagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(mediasavetogalleryagent, userPrefsProvider);
            mediasavetogalleryagent.async = (AsyncService)asyncProvider.get();
            mediasavetogalleryagent.analytics = (Analytics)analyticsProvider.get();
            mediasavetogalleryagent.map = (ObjectIdMap)mapProvider.get();
            mediasavetogalleryagent.account = (Account)accountProvider.get();
            mediasavetogalleryagent.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)mediaDocumentDownloadUtilProvider.get();
            mediasavetogalleryagent.eventBus = (EventBus)eventBusProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MediaSaveToGalleryAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaSaveToGalleryAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
