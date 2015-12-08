// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import android.util.Log;
import com.netflix.mediaclient.util.StringUtils;
import java.net.HttpURLConnection;

// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpStackConnection

public class HttpUrlStackConnection extends HttpStackConnection
{

    private static final String COOKIE_VALUE_DELIMITER = ";";
    private static final String NAME_VALUE_SEPERATOR = "=";
    private StringBuilder cookieBuilder;
    private String uriString;
    private HttpURLConnection urlConnection;

    public HttpUrlStackConnection(HttpURLConnection httpurlconnection, String s)
    {
        setUrlConnection(httpurlconnection);
        setUriString(s);
        cookieBuilder = new StringBuilder();
    }

    public String getCookies()
    {
        return cookieBuilder.toString();
    }

    public String getUriString()
    {
        return uriString;
    }

    public HttpURLConnection getUrlConnection()
    {
        return urlConnection;
    }

    public void setCookie(String s, String s1)
    {
        if (StringUtils.isEmpty(s1))
        {
            Log.d("HttpUrlStackConnection", (new StringBuilder()).append("cookieValue null for ").append(s).toString());
        }
        if (cookieBuilder.length() > 0)
        {
            cookieBuilder.append(";");
        }
        cookieBuilder.append(s);
        cookieBuilder.append("=");
        cookieBuilder.append(s1);
    }

    public void setUriString(String s)
    {
        uriString = s;
    }

    public void setUrlConnection(HttpURLConnection httpurlconnection)
    {
        urlConnection = httpurlconnection;
    }
}
