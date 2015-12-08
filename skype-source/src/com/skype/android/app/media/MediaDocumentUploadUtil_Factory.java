// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil

public final class MediaDocumentUploadUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;
    private final Provider configurationProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider eventBusProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;

    public MediaDocumentUploadUtil_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider6;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new MediaDocumentUploadUtil_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public final MediaDocumentUploadUtil get()
    {
        return new MediaDocumentUploadUtil((Application)contextProvider.get(), (AsyncService)asyncProvider.get(), (SkyLib)libProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (EcsConfiguration)configurationProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaDocumentUploadUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
