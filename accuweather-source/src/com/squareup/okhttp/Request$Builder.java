// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.squareup.okhttp:
//            Request

public static class url
{

    private url body;
    private final RawHeaders headers;
    private String method;
    private Object tag;
    private URL url;

    public url addHeader(String s, String s1)
    {
        headers.add(s, s1);
        return this;
    }

    public Request build()
    {
        return new Request(this, null);
    }

    public wHeaders.add get()
    {
        return method("GET", null);
    }

    public method head()
    {
        return method("HEAD", null);
    }

    public method header(String s, String s1)
    {
        headers.set(s, s1);
        return this;
    }

    public wHeaders.set method(String s, wHeaders.set set)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        } else
        {
            method = s;
            body = set;
            return this;
        }
    }

    public body post(body body1)
    {
        return method("POST", body1);
    }

    public method put(method method1)
    {
        return method("PUT", method1);
    }

    public method tag(Object obj)
    {
        tag = obj;
        return this;
    }

    public tag url(String s)
    {
        try
        {
            url = new URL(s);
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Malformed URL: ").append(s).toString());
        }
        return this;
    }

    public init> url(URL url1)
    {
        if (url1 == null)
        {
            throw new IllegalStateException("url == null");
        } else
        {
            url = url1;
            return this;
        }
    }






    public wHeaders(String s)
    {
        method = "GET";
        headers = new RawHeaders();
        url(s);
    }

    public url(URL url1)
    {
        method = "GET";
        headers = new RawHeaders();
        url(url1);
    }
}
