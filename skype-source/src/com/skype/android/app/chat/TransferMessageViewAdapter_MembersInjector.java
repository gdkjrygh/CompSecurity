// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.transfer.TransferThumbnails;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            k, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class TransferMessageViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider thumbnailsProvider;
    private final Provider timeUtilProvider;
    private final Provider transferQueueProvider;
    private final Provider transferUtilProvider;

    public TransferMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider;
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
        navigationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        annotationUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        transferQueueProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        thumbnailsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            transferUtilProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new TransferMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectThumbnails(k k1, Provider provider)
    {
        k1.thumbnails = (TransferThumbnails)provider.get();
    }

    public static void injectTransferQueue(k k1, Provider provider)
    {
        k1.transferQueue = (TransferQueue)provider.get();
    }

    public static void injectTransferUtil(k k1, Provider provider)
    {
        k1.transferUtil = (TransferUtil)provider.get();
    }

    public final void injectMembers(k k1)
    {
        if (k1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            k1.timeUtil = (TimeUtil)timeUtilProvider.get();
            k1.contactUtil = (ContactUtil)contactUtilProvider.get();
            k1.imageCache = (ImageCache)imageCacheProvider.get();
            k1.navigation = (Navigation)navigationProvider.get();
            k1.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            k1.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            k1.analytics = (Analytics)analyticsProvider.get();
            k1.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            k1.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            k1.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            k1.transferQueue = (TransferQueue)transferQueueProvider.get();
            k1.thumbnails = (TransferThumbnails)thumbnailsProvider.get();
            k1.transferUtil = (TransferUtil)transferUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((k)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/TransferMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
