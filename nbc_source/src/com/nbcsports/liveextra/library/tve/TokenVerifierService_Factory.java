// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            TokenVerifierService

public final class TokenVerifierService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;

    public TokenVerifierService_Factory(Provider provider)
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
        return new TokenVerifierService_Factory(provider);
    }

    public TokenVerifierService get()
    {
        return new TokenVerifierService((OkHttpClient)clientProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/TokenVerifierService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
