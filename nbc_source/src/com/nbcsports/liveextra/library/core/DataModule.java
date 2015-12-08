// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.nbcsports.liveextra.library.tve.Anvato;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import timber.log.Timber;

public class DataModule
{
    class LoggingInterceptor
        implements Interceptor
    {

        final DataModule this$0;

        public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
            throws IOException
        {
            Request request = chain.request();
            long l = System.nanoTime();
            Timber.i("Sending request %s on %s%n%s", new Object[] {
                request.url(), chain.connection(), request.headers()
            });
            chain = chain.proceed(request);
            long l1 = System.nanoTime();
            Timber.i("Received response for %s in %.1fms%n%s", new Object[] {
                chain.request().url(), Double.valueOf((double)(l1 - l) / 1000000D), chain.headers()
            });
            return chain;
        }

        LoggingInterceptor()
        {
            this$0 = DataModule.this;
            super();
        }
    }

    class UserAgentInterceptor
        implements Interceptor
    {

        final DataModule this$0;
        private final String userAgent;

        public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
            throws IOException
        {
            return chain.proceed(chain.request().newBuilder().removeHeader("User-Agent").addHeader("User-Agent", userAgent).build());
        }

        public UserAgentInterceptor(String s)
        {
            this$0 = DataModule.this;
            super();
            userAgent = s;
        }
    }


    public DataModule()
    {
    }

    private String getUserAgent()
    {
        return String.format("liveextra-%s/%s %s", new Object[] {
            "nbclive", Integer.valueOf(0x3d0c10), System.getProperty("http.agent")
        });
    }

    com.nbcsports.liveextra.library.tve.Anvato.API anvato(Anvato anvato1)
    {
        return anvato1.getRestAdapter();
    }

    Gson anvatoGson()
    {
        return (new GsonBuilder()).disableHtmlEscaping().create();
    }

    Gson gson()
    {
        return (new GsonBuilder()).registerTypeAdapter(com/nbcsports/liveextra/library/api/models/NbcDate, new com.nbcsports.liveextra.library.api.models.NbcDate.TypeAdapter()).excludeFieldsWithoutExposeAnnotation().create();
    }

    OkHttpClient okHttpClient(Context context)
    {
        return new OkHttpClient();
    }
}
