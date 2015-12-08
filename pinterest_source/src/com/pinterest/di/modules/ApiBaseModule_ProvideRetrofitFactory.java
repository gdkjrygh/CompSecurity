// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.di.modules:
//            ApiBaseModule

public final class ApiBaseModule_ProvideRetrofitFactory
    implements Factory
{

    static final boolean a;
    private final ApiBaseModule b;
    private final Provider c;

    private ApiBaseModule_ProvideRetrofitFactory(ApiBaseModule apibasemodule, Provider provider)
    {
        if (!a && apibasemodule == null)
        {
            throw new AssertionError();
        }
        b = apibasemodule;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static Factory a(ApiBaseModule apibasemodule, Provider provider)
    {
        return new ApiBaseModule_ProvideRetrofitFactory(apibasemodule, provider);
    }

    public final Object get()
    {
        retrofit.RestAdapter restadapter = ApiBaseModule.a((OkHttpClient)c.get());
        if (restadapter == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return restadapter;
        }
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/ApiBaseModule_ProvideRetrofitFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
