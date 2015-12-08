// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.pinterest.base.ApplicationInfo;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class ApiBaseModule
{

    private static boolean a = false;

    public ApiBaseModule()
    {
    }

    static RestAdapter a(OkHttpClient okhttpclient)
    {
        retrofit.RestAdapter.Builder builder = (new retrofit.RestAdapter.Builder()).setEndpoint("https://commerce.pinterest.com/v3/commerce/").setClient(new OkClient(okhttpclient));
        okhttpclient = builder;
        if (ApplicationInfo.isNonProduction())
        {
            okhttpclient = builder.setLogLevel(retrofit.RestAdapter.LogLevel.FULL);
        }
        return okhttpclient.build();
    }

}
