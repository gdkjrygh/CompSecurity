// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.i;
import c.r;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import java.net.ProtocolException;
import java.util.List;

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
            if (!request1.httpUrl().host().equals(address.getUriHost()) || request1.httpUrl().port() != address.getUriPort())
            {
                throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor).append(" must retain the same host and port").toString());
            }
            if (calls > 1)
            {
                throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor).append(" must call proceed() exactly once").toString());
            }
        }
        if (index >= client.networkInterceptors().size()) goto _L2; else goto _L1
_L1:
        this._cls0 _lcls0 = new <init>(index + 1, request1);
        Interceptor interceptor1 = (Interceptor)client.networkInterceptors().get(index);
        request1 = interceptor1.intercept(_lcls0);
        if (_lcls0.calls != 1)
        {
            throw new IllegalStateException((new StringBuilder()).append("network interceptor ").append(interceptor1).append(" must call proceed() exactly once").toString());
        }
_L4:
        return request1;
_L2:
        Response response;
        int k;
        HttpEngine.access$100(HttpEngine.this).writeRequestHeaders(request1);
        HttpEngine.access$202(HttpEngine.this, request1);
        if (permitsRequestBody() && request1.body() != null)
        {
            i j = r.a(HttpEngine.access$100(HttpEngine.this).createRequestBody(request1, request1.body().contentLength()));
            request1.body().writeTo(j);
            j.close();
        }
        response = HttpEngine.access$300(HttpEngine.this);
        k = response.code();
        if (k == 204)
        {
            break; /* Loop/switch isn't completed */
        }
        request1 = response;
        if (k != 205) goto _L4; else goto _L3
_L3:
        request1 = response;
        if (response.body().contentLength() > 0L)
        {
            throw new ProtocolException((new StringBuilder()).append("HTTP ").append(k).append(" had non-zero Content-Length: ").append(response.body().contentLength()).toString());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public Request request()
    {
        return request;
    }

    (int j, Request request1)
    {
        this$0 = HttpEngine.this;
        super();
        index = j;
        request = request1;
    }
}
