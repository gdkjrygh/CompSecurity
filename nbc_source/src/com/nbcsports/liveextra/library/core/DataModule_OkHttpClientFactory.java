// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.content.Context;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            DataModule

public final class DataModule_OkHttpClientFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final DataModule module;

    public DataModule_OkHttpClientFactory(DataModule datamodule, Provider provider)
    {
        if (!$assertionsDisabled && datamodule == null)
        {
            throw new AssertionError();
        }
        module = datamodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(DataModule datamodule, Provider provider)
    {
        return new DataModule_OkHttpClientFactory(datamodule, provider);
    }

    public OkHttpClient get()
    {
        OkHttpClient okhttpclient = module.okHttpClient((Context)contextProvider.get());
        if (okhttpclient == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return okhttpclient;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/core/DataModule_OkHttpClientFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
