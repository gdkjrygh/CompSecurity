// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.adobe.mediacore.MediaPlayer;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            PrimetimeCustomMediaPlayerProxy

public final class PrimetimeCustomMediaPlayerProxy_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider playerProvider;

    public PrimetimeCustomMediaPlayerProxy_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            playerProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new PrimetimeCustomMediaPlayerProxy_Factory(provider);
    }

    public PrimetimeCustomMediaPlayerProxy get()
    {
        return new PrimetimeCustomMediaPlayerProxy((MediaPlayer)playerProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/conviva/PrimetimeCustomMediaPlayerProxy_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
