// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

final class _cls1.a
    implements Interceptor
{

    private RequestBody a(RequestBody requestbody)
    {
        return new RequestBody(requestbody) {

            final RequestBody a;
            final OkHttpClientImpl.GzipRequestInterceptor b;

            public long contentLength()
            {
                return -1L;
            }

            public MediaType contentType()
            {
                return a.contentType();
            }

            public void writeTo(BufferedSink bufferedsink)
            {
                bufferedsink = Okio.buffer(new GzipSink(bufferedsink));
                a.writeTo(bufferedsink);
                bufferedsink.close();
            }

            
            {
                b = OkHttpClientImpl.GzipRequestInterceptor.this;
                a = requestbody;
                super();
            }
        };
    }

    public Response intercept(com.squareup.okhttp.questInterceptor questinterceptor)
    {
        Request request = questinterceptor.questInterceptor();
        if (request.body() == null || request.header("Content-Encoding") != null)
        {
            return questinterceptor.questInterceptor(request);
        } else
        {
            return questinterceptor.questInterceptor(request.newBuilder().questInterceptor("Content-Encoding", "gzip").questInterceptor(request.method(), a(request.body())).a());
        }
    }

    _cls1.a()
    {
    }
}
