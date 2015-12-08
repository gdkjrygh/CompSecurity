// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http.apache;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.RequestDirector;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.api.client.testing.http.apache:
//            MockHttpClient

class this._cls0
    implements RequestDirector
{

    final MockHttpClient this$0;

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        return new BasicHttpResponse(HttpVersion.HTTP_1_1, responseCode, null);
    }

    ()
    {
        this$0 = MockHttpClient.this;
        super();
    }
}
