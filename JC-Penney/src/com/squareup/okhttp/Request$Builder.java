// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HttpMethod;
import java.net.URL;

// Referenced classes of package com.squareup.okhttp:
//            Request, Headers, CacheControl, RequestBody, 
//            HttpUrl

public class <init>
{

    private RequestBody body;
    private url headers;
    private String method;
    private Object tag;
    private HttpUrl url;

    public <init> addHeader(String s, String s1)
    {
        headers.add(s, s1);
        return this;
    }

    public Request build()
    {
        if (url == null)
        {
            throw new IllegalStateException("url == null");
        } else
        {
            return new Request(this, null);
        }
    }

    public t> cacheControl(CacheControl cachecontrol)
    {
        cachecontrol = cachecontrol.toString();
        if (cachecontrol.isEmpty())
        {
            return removeHeader("Cache-Control");
        } else
        {
            return header("Cache-Control", cachecontrol);
        }
    }

    public header delete()
    {
        return delete(RequestBody.create(null, new byte[0]));
    }

    public te delete(RequestBody requestbody)
    {
        return method("DELETE", requestbody);
    }

    public method get()
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

    public set headers(Headers headers1)
    {
        headers = headers1.newBuilder();
        return this;
    }

    public er method(String s, RequestBody requestbody)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        if (requestbody != null && !HttpMethod.permitsRequestBody(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("method ").append(s).append(" must not have a request body.").toString());
        }
        if (requestbody == null && HttpMethod.requiresRequestBody(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("method ").append(s).append(" must have a request body.").toString());
        } else
        {
            method = s;
            body = requestbody;
            return this;
        }
    }

    public body patch(RequestBody requestbody)
    {
        return method("PATCH", requestbody);
    }

    public method post(RequestBody requestbody)
    {
        return method("POST", requestbody);
    }

    public method put(RequestBody requestbody)
    {
        return method("PUT", requestbody);
    }

    public method removeHeader(String s)
    {
        headers.removeAll(s);
        return this;
    }

    public removeAll tag(Object obj)
    {
        tag = obj;
        return this;
    }

    public tag url(HttpUrl httpurl)
    {
        if (httpurl == null)
        {
            throw new IllegalArgumentException("url == null");
        } else
        {
            url = httpurl;
            return this;
        }
    }

    public url url(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("url == null");
        }
        String s1;
        if (s.regionMatches(true, 0, "ws:", 0, 3))
        {
            s1 = (new StringBuilder()).append("http:").append(s.substring(3)).toString();
        } else
        {
            s1 = s;
            if (s.regionMatches(true, 0, "wss:", 0, 4))
            {
                s1 = (new StringBuilder()).append("https:").append(s.substring(4)).toString();
            }
        }
        s = HttpUrl.parse(s1);
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unexpected url: ").append(s1).toString());
        } else
        {
            return url(((HttpUrl) (s)));
        }
    }

    public url url(URL url1)
    {
        if (url1 == null)
        {
            throw new IllegalArgumentException("url == null");
        }
        HttpUrl httpurl = HttpUrl.get(url1);
        if (httpurl == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unexpected url: ").append(url1).toString());
        } else
        {
            return url(httpurl);
        }
    }






    public tpMethod()
    {
        method = "GET";
        headers = new <init>();
    }

    private <init>(Request request)
    {
        url = Request.access$600(request);
        method = Request.access$700(request);
        body = Request.access$800(request);
        tag = Request.access$900(request);
        headers = Request.access$1000(request).newBuilder();
    }

    er(Request request, er er)
    {
        this(request);
    }
}
