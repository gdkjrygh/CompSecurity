// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            Anvato

public final class Anvato_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider gsonProvider;

    public Anvato_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        gsonProvider = provider;
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
        return new Anvato_Factory(provider, provider1);
    }

    public Anvato get()
    {
        return new Anvato((Gson)gsonProvider.get(), (OkHttpClient)clientProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/Anvato_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
