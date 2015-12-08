// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Util;
import java.net.URL;
import java.util.List;
import okio.BufferedSink;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine, Transport

class request
    implements com.squareup.okhttp.erceptorChain
{

    private int calls;
    private final int index;
    private final Request request;
    final HttpEngine this$0;

    public Connection connection()
    {
        return HttpEngine.access$000(HttpEngine.this);
    }

    public Response proceed(Request request1)
    {
        calls = calls + 1;
        if (index > 0)
        {
            Interceptor interceptor = (Interceptor)client.networkInterceptors().get(index - 1);
            Address address = connection().getRoute().getAddress();
            if (!request1.url().getHost().equals(address.getUriHost()) || Util.getEffectivePort(request1.url()) != address.getUriPort())
            {
                throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor).append(" must retain the same host and port").toString());
            }
            if (calls > 1)
            {
                throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor).append(" must call proceed() exactly once").toString());
            }
        }
        if (index < client.networkInterceptors().size())
        {
            request1 = new <init>(index + 1, request1);
            Interceptor interceptor1 = (Interceptor)client.networkInterceptors().get(index);
            Response response = interceptor1.intercept(request1);
            if (((index) (request1)).calls != 1)
            {
                throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor1).append(" must call proceed() exactly once").toString());
            } else
            {
                return response;
            }
        }
        HttpEngine.access$100(HttpEngine.this).writeRequestHeaders(request1);
        if (permitsRequestBody() && request1.body() != null)
        {
            BufferedSink bufferedsink = Okio.buffer(HttpEngine.access$100(HttpEngine.this).createRequestBody(request1, request1.body().contentLength()));
            request1.body().writeTo(bufferedsink);
            bufferedsink.close();
        }
        return HttpEngine.access$200(HttpEngine.this);
    }

    public Request request()
    {
        return request;
    }

    (int i, Request request1)
    {
        this$0 = HttpEngine.this;
        super();
        index = i;
        request = request1;
    }
}
