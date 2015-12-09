// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.android.volley.toolbox:
//            HttpStack

public class HttpClientStack
    implements HttpStack
{

    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected final HttpClient mClient;

    public HttpClientStack(HttpClient httpclient)
    {
        mClient = httpclient;
    }

    private static void addHeaders(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    static HttpUriRequest createHttpRequest(Request request, Map map)
        throws AuthFailureError
    {
        switch (request.getMethod())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = request.getPostBody();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(request.getUrl());
                httppost.addHeader("Content-Type", request.getPostBodyContentType());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(request.getUrl());
            }

        case 0: // '\0'
            return new HttpGet(request.getUrl());

        case 3: // '\003'
            return new HttpDelete(request.getUrl());

        case 1: // '\001'
            map = new HttpPost(request.getUrl());
            map.addHeader("Content-Type", request.getBodyContentType());
            setEntityIfNonEmptyBody(map, request);
            return map;

        case 2: // '\002'
            map = new HttpPut(request.getUrl());
            map.addHeader("Content-Type", request.getBodyContentType());
            setEntityIfNonEmptyBody(map, request);
            return map;
        }
    }

    private static List getPostParameterPairs(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)map.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    private void modifySetCookies(HttpResponse httpresponse)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Header aheader[] = httpresponse.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (header.getName() == null || !header.getName().equalsIgnoreCase("Set-Cookie"))
            {
                continue;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("; ");
            }
            stringbuilder.append(header.getValue());
        }

        if (stringbuilder.length() > 0)
        {
            httpresponse.removeHeaders("Set-Cookie");
            httpresponse.addHeader("Set-Cookie", stringbuilder.toString());
        }
    }

    private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Request request)
        throws AuthFailureError
    {
        request = request.getBody();
        if (request != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(request));
        }
    }

    protected void onPrepareRequest(HttpUriRequest httpurirequest)
        throws IOException
    {
    }

    public HttpResponse performRequest(Request request, Map map)
        throws IOException, AuthFailureError
    {
        HttpUriRequest httpurirequest = createHttpRequest(request, map);
        addHeaders(httpurirequest, map);
        addHeaders(httpurirequest, request.getHeaders());
        onPrepareRequest(httpurirequest);
        map = httpurirequest.getParams();
        int i = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        request = mClient.execute(httpurirequest);
        modifySetCookies(request);
        return request;
    }
}
