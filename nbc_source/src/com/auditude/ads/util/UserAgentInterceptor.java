// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

class UserAgentInterceptor
    implements Interceptor
{

    private final String userAgent;

    public UserAgentInterceptor(String s)
    {
        userAgent = s;
    }

    public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
        throws IOException
    {
        return chain.proceed(chain.request().newBuilder().removeHeader("User-Agent").addHeader("User-Agent", userAgent).build());
    }
}
