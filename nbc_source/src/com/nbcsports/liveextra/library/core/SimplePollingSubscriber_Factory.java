// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            SimplePollingSubscriber

public final class SimplePollingSubscriber_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;

    public SimplePollingSubscriber_Factory(Provider provider)
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
        return new SimplePollingSubscriber_Factory(provider);
    }

    public SimplePollingSubscriber get()
    {
        return new SimplePollingSubscriber((OkHttpClient)clientProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/core/SimplePollingSubscriber_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
