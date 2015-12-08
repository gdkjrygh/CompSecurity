// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.content.overlay:
//            OverlayContentService

public final class OverlayContentService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;

    public OverlayContentService_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            clientProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new OverlayContentService_Factory(provider);
    }

    public OverlayContentService get()
    {
        return new OverlayContentService((OkHttpClient)clientProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/content/overlay/OverlayContentService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
