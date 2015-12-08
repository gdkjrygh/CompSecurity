// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

// Referenced classes of package org.apache.http.protocol:
//            HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList, HttpContext

public final class ImmutableHttpProcessor
    implements HttpProcessor
{

    private final HttpRequestInterceptor requestInterceptors[];
    private final HttpResponseInterceptor responseInterceptors[];

    public ImmutableHttpProcessor(HttpRequestInterceptorList httprequestinterceptorlist, HttpResponseInterceptorList httpresponseinterceptorlist)
    {
        boolean flag = false;
        super();
        if (httprequestinterceptorlist != null)
        {
            int k = httprequestinterceptorlist.getRequestInterceptorCount();
            requestInterceptors = new HttpRequestInterceptor[k];
            for (int i = 0; i < k; i++)
            {
                requestInterceptors[i] = httprequestinterceptorlist.getRequestInterceptor(i);
            }

        } else
        {
            requestInterceptors = new HttpRequestInterceptor[0];
        }
        if (httpresponseinterceptorlist != null)
        {
            int l = httpresponseinterceptorlist.getResponseInterceptorCount();
            responseInterceptors = new HttpResponseInterceptor[l];
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                responseInterceptors[j] = httpresponseinterceptorlist.getResponseInterceptor(j);
            }

        } else
        {
            responseInterceptors = new HttpResponseInterceptor[0];
        }
    }

    public ImmutableHttpProcessor(HttpRequestInterceptor ahttprequestinterceptor[])
    {
        this(ahttprequestinterceptor, ((HttpResponseInterceptor []) (null)));
    }

    public ImmutableHttpProcessor(HttpRequestInterceptor ahttprequestinterceptor[], HttpResponseInterceptor ahttpresponseinterceptor[])
    {
        boolean flag = false;
        super();
        if (ahttprequestinterceptor != null)
        {
            int k = ahttprequestinterceptor.length;
            requestInterceptors = new HttpRequestInterceptor[k];
            for (int i = 0; i < k; i++)
            {
                requestInterceptors[i] = ahttprequestinterceptor[i];
            }

        } else
        {
            requestInterceptors = new HttpRequestInterceptor[0];
        }
        if (ahttpresponseinterceptor != null)
        {
            int l = ahttpresponseinterceptor.length;
            responseInterceptors = new HttpResponseInterceptor[l];
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                responseInterceptors[j] = ahttpresponseinterceptor[j];
            }

        } else
        {
            responseInterceptors = new HttpResponseInterceptor[0];
        }
    }

    public ImmutableHttpProcessor(HttpResponseInterceptor ahttpresponseinterceptor[])
    {
        this(((HttpRequestInterceptor []) (null)), ahttpresponseinterceptor);
    }

    public final void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        for (int i = 0; i < requestInterceptors.length; i++)
        {
            requestInterceptors[i].process(httprequest, httpcontext);
        }

    }

    public final void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        for (int i = 0; i < responseInterceptors.length; i++)
        {
            responseInterceptors[i].process(httpresponse, httpcontext);
        }

    }
}
