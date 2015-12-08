// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            MvpdLookups

public final class MvpdLookups_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider subscriberProvider;

    public MvpdLookups_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        subscriberProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            clientProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new MvpdLookups_Factory(provider, provider1);
    }

    public MvpdLookups get()
    {
        return new MvpdLookups((ConfigurationProvider)subscriberProvider.get(), (OkHttpClient)clientProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/MvpdLookups_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
