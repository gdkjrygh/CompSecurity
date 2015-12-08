// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.Request;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.mopub.volley.toolbox:
//            HttpStack

public class HttpClientStack
    implements HttpStack
{

    protected final HttpClient a;

    public HttpClientStack(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Request request)
    {
        request = request.getBody();
        if (request != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(request));
        }
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    public HttpResponse performRequest(Request request, Map map)
    {
        request.getMethod();
        JVM INSTR tableswitch -1 7: default 56
    //                   -1 66
    //                   0 177
    //                   1 207
    //                   2 237
    //                   3 192
    //                   4 267
    //                   5 282
    //                   6 297
    //                   7 312;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj;
        byte abyte0[] = request.getPostBody();
        int i;
        if (abyte0 != null)
        {
            obj = new HttpPost(request.getUrl());
            ((HttpPost) (obj)).addHeader("Content-Type", request.getPostBodyContentType());
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(abyte0));
        } else
        {
            obj = new HttpGet(request.getUrl());
        }
_L12:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), request.getHeaders());
        map = ((HttpUriRequest) (obj)).getParams();
        i = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(request.getUrl());
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(request.getUrl());
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(request.getUrl());
        ((HttpPost) (obj)).addHeader("Content-Type", request.getBodyContentType());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(request.getUrl());
        ((HttpPut) (obj)).addHeader("Content-Type", request.getBodyContentType());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new HttpHead(request.getUrl());
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new HttpOptions(request.getUrl());
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new HttpTrace(request.getUrl());
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new HttpPatch(request.getUrl());
        ((HttpPatch) (obj)).addHeader("Content-Type", request.getBodyContentType());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private class HttpPatch extends HttpEntityEnclosingRequestBase
    {

        public static final String METHOD_NAME = "PATCH";

        public final String getMethod()
        {
            return "PATCH";
        }

        public HttpPatch()
        {
        }

        public HttpPatch(String s)
        {
            setURI(URI.create(s));
        }

        public HttpPatch(URI uri)
        {
            setURI(uri);
        }
    }

}
