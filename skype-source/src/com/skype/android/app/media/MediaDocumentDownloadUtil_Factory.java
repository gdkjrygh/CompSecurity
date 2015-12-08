// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, UrlPreviewMediaAgent

public final class MediaDocumentDownloadUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;
    private final Provider contextProvider;
    private final Provider httpUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider urlPreviewMediaAgentProvider;

    public MediaDocumentDownloadUtil_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
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
        httpUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            urlPreviewMediaAgentProvider = provider6;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new MediaDocumentDownloadUtil_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public final MediaDocumentDownloadUtil get()
    {
        return new MediaDocumentDownloadUtil((Application)contextProvider.get(), (AsyncService)asyncProvider.get(), (HttpUtil)httpUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (ObjectIdMap)mapProvider.get(), (SkyLib)libProvider.get(), (UrlPreviewMediaAgent)urlPreviewMediaAgentProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/media/MediaDocumentDownloadUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
