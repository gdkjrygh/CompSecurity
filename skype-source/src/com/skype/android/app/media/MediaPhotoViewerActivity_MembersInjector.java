// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.event.EventBus;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaPhotoViewerActivity, MediaDocumentDownloadUtil

public final class MediaPhotoViewerActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider crashReporterProvider;
    private final Provider eventBusProvider;
    private final Provider mediaDocumentDownloadUtilProvider;
    private final Provider networkUtilProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public MediaPhotoViewerActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentDownloadUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new MediaPhotoViewerActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccessibility(MediaPhotoViewerActivity mediaphotovieweractivity, Provider provider)
    {
        mediaphotovieweractivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(MediaPhotoViewerActivity mediaphotovieweractivity, Provider provider)
    {
        mediaphotovieweractivity.analytics = (Analytics)provider.get();
    }

    public static void injectEventBus(MediaPhotoViewerActivity mediaphotovieweractivity, Provider provider)
    {
        mediaphotovieweractivity.eventBus = (EventBus)provider.get();
    }

    public static void injectMediaDocumentDownloadUtil(MediaPhotoViewerActivity mediaphotovieweractivity, Provider provider)
    {
        mediaphotovieweractivity.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)provider.get();
    }

    public static void injectNetworkUtil(MediaPhotoViewerActivity mediaphotovieweractivity, Provider provider)
    {
        mediaphotovieweractivity.networkUtil = (NetworkUtil)provider.get();
    }

    public final void injectMembers(MediaPhotoViewerActivity mediaphotovieweractivity)
    {
        if (mediaphotovieweractivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(mediaphotovieweractivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(mediaphotovieweractivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(mediaphotovieweractivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(mediaphotovieweractivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(mediaphotovieweractivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(mediaphotovieweractivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(mediaphotovieweractivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(mediaphotovieweractivity, activityAccountStateObserverProvider);
            mediaphotovieweractivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            mediaphotovieweractivity.mediaDocumentDownloadUtil = (MediaDocumentDownloadUtil)mediaDocumentDownloadUtilProvider.get();
            mediaphotovieweractivity.analytics = (Analytics)analyticsProvider.get();
            mediaphotovieweractivity.networkUtil = (NetworkUtil)networkUtilProvider.get();
            mediaphotovieweractivity.eventBus = (EventBus)eventBusProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MediaPhotoViewerActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaPhotoViewerActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
