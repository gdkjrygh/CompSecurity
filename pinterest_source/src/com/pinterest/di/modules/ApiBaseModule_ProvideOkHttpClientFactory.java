// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.pinterest.di.modules:
//            ApiBaseModule

public final class ApiBaseModule_ProvideOkHttpClientFactory
    implements Factory
{

    static final boolean a;
    private final ApiBaseModule b;

    private ApiBaseModule_ProvideOkHttpClientFactory(ApiBaseModule apibasemodule)
    {
        if (!a && apibasemodule == null)
        {
            throw new AssertionError();
        } else
        {
            b = apibasemodule;
            return;
        }
    }

    public static Factory a(ApiBaseModule apibasemodule)
    {
        return new ApiBaseModule_ProvideOkHttpClientFactory(apibasemodule);
    }

    public final Object get()
    {
        ApiBaseModule apibasemodule = b;
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.a(15L, TimeUnit.SECONDS);
        okhttpclient.b(15L, TimeUnit.SECONDS);
        okhttpclient.c(15L, TimeUnit.SECONDS);
        okhttpclient.v().add(new ApiBaseModule._cls1(apibasemodule));
        return okhttpclient;
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/ApiBaseModule_ProvideOkHttpClientFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
