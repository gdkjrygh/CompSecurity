// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            CacheControl, Headers, HttpUrl, RequestBody

public final class Request
{

    private final RequestBody body;
    private volatile CacheControl cacheControl;
    private final Headers headers;
    private volatile URI javaNetUri;
    private volatile URL javaNetUrl;
    private final String method;
    private final Object tag;
    private final HttpUrl url;

    private Request(Builder builder)
    {
        url = builder.url;
        method = builder.method;
        headers = builder.headers.build();
        body = builder.body;
        if (builder.tag != null)
        {
            builder = ((Builder) (builder.tag));
        } else
        {
            builder = this;
        }
        tag = builder;
    }

    Request(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public RequestBody body()
    {
        return body;
    }

    public CacheControl cacheControl()
    {
        CacheControl cachecontrol = cacheControl;
        if (cachecontrol != null)
        {
            return cachecontrol;
        } else
        {
            CacheControl cachecontrol1 = CacheControl.parse(headers);
            cacheControl = cachecontrol1;
            return cachecontrol1;
        }
    }

    public String header(String s)
    {
        return headers.get(s);
    }

    public Headers headers()
    {
        return headers;
    }

    public List headers(String s)
    {
        return headers.values(s);
    }

    public HttpUrl httpUrl()
    {
        return url;
    }

    public boolean isHttps()
    {
        return url.isHttps();
    }

    public String method()
    {
        return method;
    }

    public Builder newBuilder()
    {
        return new Builder(this, null);
    }

    public Object tag()
    {
        return tag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Request{method=").append(method).append(", url=").append(url).append(", tag=");
        Object obj;
        if (tag != this)
        {
            obj = tag;
        } else
        {
            obj = null;
        }
        return stringbuilder.append(obj).append('}').toString();
    }

    public URI uri()
    {
        URI uri1;
        try
        {
            uri1 = javaNetUri;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new IOException(illegalstateexception.getMessage());
        }
        if (uri1 != null)
        {
            return uri1;
        }
        uri1 = url.uri();
        javaNetUri = uri1;
        return uri1;
    }

    public URL url()
    {
        URL url1 = javaNetUrl;
        if (url1 != null)
        {
            return url1;
        } else
        {
            URL url2 = url.url();
            javaNetUrl = url2;
            return url2;
        }
    }

    public String urlString()
    {
        return url.toString();
    }






    private class Builder
    {

        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Object tag;
        private HttpUrl url;

        public Builder addHeader(String s, String s1)
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

        public Builder cacheControl(CacheControl cachecontrol)
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

        public Builder delete()
        {
            return delete(RequestBody.create(null, new byte[0]));
        }

        public Builder delete(RequestBody requestbody)
        {
            return method("DELETE", requestbody);
        }

        public Builder get()
        {
            return method("GET", null);
        }

        public Builder head()
        {
            return method("HEAD", null);
        }

        public Builder header(String s, String s1)
        {
            headers.set(s, s1);
            return this;
        }

        public Builder headers(Headers headers1)
        {
            headers = headers1.newBuilder();
            return this;
        }

        public Builder method(String s, RequestBody requestbody)
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

        public Builder patch(RequestBody requestbody)
        {
            return method("PATCH", requestbody);
        }

        public Builder post(RequestBody requestbody)
        {
            return method("POST", requestbody);
        }

        public Builder put(RequestBody requestbody)
        {
            return method("PUT", requestbody);
        }

        public Builder removeHeader(String s)
        {
            headers.removeAll(s);
            return this;
        }

        public Builder tag(Object obj)
        {
            tag = obj;
            return this;
        }

        public Builder url(HttpUrl httpurl)
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

        public Builder url(String s)
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

        public Builder url(URL url1)
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






        public Builder()
        {
            method = "GET";
            headers = new Headers.Builder();
        }

        private Builder(Request request)
        {
            url = request.url;
            method = request.method;
            body = request.body;
            tag = request.tag;
            headers = request.headers.newBuilder();
        }

        Builder(Request request, _cls1 _pcls1)
        {
            this(request);
        }
    }

}
