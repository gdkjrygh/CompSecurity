// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseInterceptor;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.services:
//            AbstractGoogleClientRequest

class val.httpRequest
    implements HttpResponseInterceptor
{

    final AbstractGoogleClientRequest this$0;
    final HttpRequest val$httpRequest;
    final HttpResponseInterceptor val$responseInterceptor;

    public void interceptResponse(HttpResponse httpresponse)
        throws IOException
    {
        if (val$responseInterceptor != null)
        {
            val$responseInterceptor.interceptResponse(httpresponse);
        }
        if (!httpresponse.isSuccessStatusCode() && val$httpRequest.getThrowExceptionOnExecuteError())
        {
            throw newExceptionOnError(httpresponse);
        } else
        {
            return;
        }
    }

    ()
    {
        this$0 = final_abstractgoogleclientrequest;
        val$responseInterceptor = httpresponseinterceptor;
        val$httpRequest = HttpRequest.this;
        super();
    }
}
