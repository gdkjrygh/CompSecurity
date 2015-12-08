// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit.RestAdapter;

// Referenced classes of package com.pinterest.di.modules:
//            ApiModule

public final class ApiModule_ProvideCommerceApiServiceFactory
    implements Factory
{

    static final boolean a;
    private final ApiModule b;
    private final Provider c;

    private ApiModule_ProvideCommerceApiServiceFactory(ApiModule apimodule, Provider provider)
    {
        if (!a && apimodule == null)
        {
            throw new AssertionError();
        }
        b = apimodule;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static Factory a(ApiModule apimodule, Provider provider)
    {
        return new ApiModule_ProvideCommerceApiServiceFactory(apimodule, provider);
    }

    public final Object get()
    {
        com.pinterest.network.api.CommerceApiService commerceapiservice = ApiModule.a((RestAdapter)c.get());
        if (commerceapiservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return commerceapiservice;
        }
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/ApiModule_ProvideCommerceApiServiceFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
