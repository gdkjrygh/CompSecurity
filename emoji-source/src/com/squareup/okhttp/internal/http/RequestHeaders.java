// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.net.URI;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            RawHeaders, HeaderParser, HttpDate

public final class RequestHeaders
{

    private String acceptEncoding;
    private String connection;
    private long contentLength;
    private String contentType;
    private boolean hasAuthorization;
    private final RawHeaders headers;
    private String host;
    private String ifModifiedSince;
    private String ifNoneMatch;
    private int maxAgeSeconds;
    private int maxStaleSeconds;
    private int minFreshSeconds;
    private boolean noCache;
    private boolean onlyIfCached;
    private String proxyAuthorization;
    private String transferEncoding;
    private final URI uri;
    private String userAgent;

    public RequestHeaders(URI uri1, RawHeaders rawheaders)
    {
        maxAgeSeconds = -1;
        maxStaleSeconds = -1;
        minFreshSeconds = -1;
        contentLength = -1L;
        uri = uri1;
        headers = rawheaders;
        uri1 = new HeaderParser.CacheControlHandler() {

            final RequestHeaders this$0;

            public void handle(String s1, String s2)
            {
                if ("no-cache".equalsIgnoreCase(s1))
                {
                    noCache = true;
                } else
                {
                    if ("max-age".equalsIgnoreCase(s1))
                    {
                        maxAgeSeconds = HeaderParser.parseSeconds(s2);
                        return;
                    }
                    if ("max-stale".equalsIgnoreCase(s1))
                    {
                        maxStaleSeconds = HeaderParser.parseSeconds(s2);
                        return;
                    }
                    if ("min-fresh".equalsIgnoreCase(s1))
                    {
                        minFreshSeconds = HeaderParser.parseSeconds(s2);
                        return;
                    }
                    if ("only-if-cached".equalsIgnoreCase(s1))
                    {
                        onlyIfCached = true;
                        return;
                    }
                }
            }

            
            {
                this$0 = RequestHeaders.this;
                super();
            }
        };
        int i = 0;
        while (i < rawheaders.length()) 
        {
            Object obj = rawheaders.getFieldName(i);
            String s = rawheaders.getValue(i);
            if ("Cache-Control".equalsIgnoreCase(((String) (obj))))
            {
                HeaderParser.parseCacheControl(s, uri1);
            } else
            if ("Pragma".equalsIgnoreCase(((String) (obj))))
            {
                if ("no-cache".equalsIgnoreCase(s))
                {
                    noCache = true;
                }
            } else
            if ("If-None-Match".equalsIgnoreCase(((String) (obj))))
            {
                ifNoneMatch = s;
            } else
            if ("If-Modified-Since".equalsIgnoreCase(((String) (obj))))
            {
                ifModifiedSince = s;
            } else
            if ("Authorization".equalsIgnoreCase(((String) (obj))))
            {
                hasAuthorization = true;
            } else
            if ("Content-Length".equalsIgnoreCase(((String) (obj))))
            {
                try
                {
                    contentLength = Integer.parseInt(s);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } else
            if ("Transfer-Encoding".equalsIgnoreCase(((String) (obj))))
            {
                transferEncoding = s;
            } else
            if ("User-Agent".equalsIgnoreCase(((String) (obj))))
            {
                userAgent = s;
            } else
            if ("Host".equalsIgnoreCase(((String) (obj))))
            {
                host = s;
            } else
            if ("Connection".equalsIgnoreCase(((String) (obj))))
            {
                connection = s;
            } else
            if ("Accept-Encoding".equalsIgnoreCase(((String) (obj))))
            {
                acceptEncoding = s;
            } else
            if ("Content-Type".equalsIgnoreCase(((String) (obj))))
            {
                contentType = s;
            } else
            if ("Proxy-Authorization".equalsIgnoreCase(((String) (obj))))
            {
                proxyAuthorization = s;
            }
            i++;
        }
    }

    private String buildCookieHeader(List list)
    {
        if (list.size() == 1)
        {
            return (String)list.get(0);
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            if (i > 0)
            {
                stringbuilder.append("; ");
            }
            stringbuilder.append((String)list.get(i));
        }

        return stringbuilder.toString();
    }

    public void addCookies(Map map)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s = (String)entry.getKey();
            if (("Cookie".equalsIgnoreCase(s) || "Cookie2".equalsIgnoreCase(s)) && !((List)entry.getValue()).isEmpty())
            {
                headers.add(s, buildCookieHeader((List)entry.getValue()));
            }
        } while (true);
    }

    public String getAcceptEncoding()
    {
        return acceptEncoding;
    }

    public String getConnection()
    {
        return connection;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public String getContentType()
    {
        return contentType;
    }

    public RawHeaders getHeaders()
    {
        return headers;
    }

    public String getHost()
    {
        return host;
    }

    public String getIfModifiedSince()
    {
        return ifModifiedSince;
    }

    public String getIfNoneMatch()
    {
        return ifNoneMatch;
    }

    public int getMaxAgeSeconds()
    {
        return maxAgeSeconds;
    }

    public int getMaxStaleSeconds()
    {
        return maxStaleSeconds;
    }

    public int getMinFreshSeconds()
    {
        return minFreshSeconds;
    }

    public String getProxyAuthorization()
    {
        return proxyAuthorization;
    }

    public String getTransferEncoding()
    {
        return transferEncoding;
    }

    public URI getUri()
    {
        return uri;
    }

    public String getUserAgent()
    {
        return userAgent;
    }

    public boolean hasAuthorization()
    {
        return hasAuthorization;
    }

    public boolean hasConditions()
    {
        return ifModifiedSince != null || ifNoneMatch != null;
    }

    public boolean hasConnectionClose()
    {
        return "close".equalsIgnoreCase(connection);
    }

    public boolean isChunked()
    {
        return "chunked".equalsIgnoreCase(transferEncoding);
    }

    public boolean isNoCache()
    {
        return noCache;
    }

    public boolean isOnlyIfCached()
    {
        return onlyIfCached;
    }

    public void removeContentLength()
    {
        if (contentLength != -1L)
        {
            headers.removeAll("Content-Length");
            contentLength = -1L;
        }
    }

    public void setAcceptEncoding(String s)
    {
        if (acceptEncoding != null)
        {
            headers.removeAll("Accept-Encoding");
        }
        headers.add("Accept-Encoding", s);
        acceptEncoding = s;
    }

    public void setChunked()
    {
        if (transferEncoding != null)
        {
            headers.removeAll("Transfer-Encoding");
        }
        headers.add("Transfer-Encoding", "chunked");
        transferEncoding = "chunked";
    }

    public void setConnection(String s)
    {
        if (connection != null)
        {
            headers.removeAll("Connection");
        }
        headers.add("Connection", s);
        connection = s;
    }

    public void setContentLength(long l)
    {
        if (contentLength != -1L)
        {
            headers.removeAll("Content-Length");
        }
        headers.add("Content-Length", Long.toString(l));
        contentLength = l;
    }

    public void setContentType(String s)
    {
        if (contentType != null)
        {
            headers.removeAll("Content-Type");
        }
        headers.add("Content-Type", s);
        contentType = s;
    }

    public void setHost(String s)
    {
        if (host != null)
        {
            headers.removeAll("Host");
        }
        headers.add("Host", s);
        host = s;
    }

    public void setIfModifiedSince(Date date)
    {
        if (ifModifiedSince != null)
        {
            headers.removeAll("If-Modified-Since");
        }
        date = HttpDate.format(date);
        headers.add("If-Modified-Since", date);
        ifModifiedSince = date;
    }

    public void setIfNoneMatch(String s)
    {
        if (ifNoneMatch != null)
        {
            headers.removeAll("If-None-Match");
        }
        headers.add("If-None-Match", s);
        ifNoneMatch = s;
    }

    public void setUserAgent(String s)
    {
        if (userAgent != null)
        {
            headers.removeAll("User-Agent");
        }
        headers.add("User-Agent", s);
        userAgent = s;
    }


/*
    static boolean access$002(RequestHeaders requestheaders, boolean flag)
    {
        requestheaders.noCache = flag;
        return flag;
    }

*/


/*
    static int access$102(RequestHeaders requestheaders, int i)
    {
        requestheaders.maxAgeSeconds = i;
        return i;
    }

*/


/*
    static int access$202(RequestHeaders requestheaders, int i)
    {
        requestheaders.maxStaleSeconds = i;
        return i;
    }

*/


/*
    static int access$302(RequestHeaders requestheaders, int i)
    {
        requestheaders.minFreshSeconds = i;
        return i;
    }

*/


/*
    static boolean access$402(RequestHeaders requestheaders, boolean flag)
    {
        requestheaders.onlyIfCached = flag;
        return flag;
    }

*/
}
