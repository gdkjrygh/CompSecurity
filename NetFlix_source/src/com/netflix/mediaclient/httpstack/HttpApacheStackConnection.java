// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import com.netflix.mediaclient.util.StringUtils;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpStackConnection

public class HttpApacheStackConnection extends HttpStackConnection
{

    private static CookieStore mLocalCookieStore;
    private DefaultHttpClient defaultHttpClient;
    private HttpParams httpParams;
    private String uriString;

    public HttpApacheStackConnection(HttpParams httpparams, String s)
    {
        setHttpParams(httpparams);
        setUriString(s);
        setDefaultHttpClient(null);
        mLocalCookieStore = new BasicCookieStore();
    }

    public DefaultHttpClient getDefaultHttpClient()
    {
        return defaultHttpClient;
    }

    public HttpParams getHttpParams()
    {
        return httpParams;
    }

    public HttpContext getLocalHttpContext()
    {
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("http.cookie-store", mLocalCookieStore);
        return basichttpcontext;
    }

    public String getUriString()
    {
        return uriString;
    }

    public void setCookie(String s, String s1)
    {
        if (StringUtils.isEmpty(s1))
        {
            return;
        } else
        {
            s = new BasicClientCookie(s, s1);
            s.setDomain(".netflix.com");
            s.setPath("/");
            s.setVersion(0);
            mLocalCookieStore.addCookie(s);
            return;
        }
    }

    public void setDefaultHttpClient(DefaultHttpClient defaulthttpclient)
    {
        defaultHttpClient = defaulthttpclient;
    }

    public void setHttpParams(HttpParams httpparams)
    {
        httpParams = httpparams;
    }

    public void setUriString(String s)
    {
        uriString = s;
    }
}
