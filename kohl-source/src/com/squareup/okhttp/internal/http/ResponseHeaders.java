// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            RawHeaders, HeaderParser, HttpDate, RequestHeaders

public final class ResponseHeaders
{

    private static final String RECEIVED_MILLIS = (new StringBuilder()).append(Platform.get().getPrefix()).append("-Received-Millis").toString();
    static final String RESPONSE_SOURCE = (new StringBuilder()).append(Platform.get().getPrefix()).append("-Response-Source").toString();
    static final String SELECTED_TRANSPORT = (new StringBuilder()).append(Platform.get().getPrefix()).append("-Selected-Transport").toString();
    private static final String SENT_MILLIS = (new StringBuilder()).append(Platform.get().getPrefix()).append("-Sent-Millis").toString();
    private int ageSeconds;
    private String connection;
    private String contentEncoding;
    private long contentLength;
    private String contentType;
    private String etag;
    private Date expires;
    private final RawHeaders headers;
    private boolean isPublic;
    private Date lastModified;
    private int maxAgeSeconds;
    private boolean mustRevalidate;
    private boolean noCache;
    private boolean noStore;
    private long receivedResponseMillis;
    private int sMaxAgeSeconds;
    private long sentRequestMillis;
    private Date servedDate;
    private String transferEncoding;
    private final URI uri;
    private Set varyFields;

    public ResponseHeaders(URI uri1, RawHeaders rawheaders)
    {
        maxAgeSeconds = -1;
        sMaxAgeSeconds = -1;
        ageSeconds = -1;
        varyFields = Collections.emptySet();
        contentLength = -1L;
        uri = uri1;
        headers = rawheaders;
        uri1 = new HeaderParser.CacheControlHandler() {

            final ResponseHeaders this$0;

            public void handle(String s1, String s2)
            {
                if ("no-cache".equalsIgnoreCase(s1))
                {
                    noCache = true;
                } else
                {
                    if ("no-store".equalsIgnoreCase(s1))
                    {
                        noStore = true;
                        return;
                    }
                    if ("max-age".equalsIgnoreCase(s1))
                    {
                        maxAgeSeconds = HeaderParser.parseSeconds(s2);
                        return;
                    }
                    if ("s-maxage".equalsIgnoreCase(s1))
                    {
                        sMaxAgeSeconds = HeaderParser.parseSeconds(s2);
                        return;
                    }
                    if ("public".equalsIgnoreCase(s1))
                    {
                        isPublic = true;
                        return;
                    }
                    if ("must-revalidate".equalsIgnoreCase(s1))
                    {
                        mustRevalidate = true;
                        return;
                    }
                }
            }

            
            {
                this$0 = ResponseHeaders.this;
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
            if ("Date".equalsIgnoreCase(((String) (obj))))
            {
                servedDate = HttpDate.parse(s);
            } else
            if ("Expires".equalsIgnoreCase(((String) (obj))))
            {
                expires = HttpDate.parse(s);
            } else
            if ("Last-Modified".equalsIgnoreCase(((String) (obj))))
            {
                lastModified = HttpDate.parse(s);
            } else
            if ("ETag".equalsIgnoreCase(((String) (obj))))
            {
                etag = s;
            } else
            if ("Pragma".equalsIgnoreCase(((String) (obj))))
            {
                if ("no-cache".equalsIgnoreCase(s))
                {
                    noCache = true;
                }
            } else
            if ("Age".equalsIgnoreCase(((String) (obj))))
            {
                ageSeconds = HeaderParser.parseSeconds(s);
            } else
            if ("Vary".equalsIgnoreCase(((String) (obj))))
            {
                if (varyFields.isEmpty())
                {
                    varyFields = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                obj = s.split(",");
                int k = obj.length;
                int j = 0;
                while (j < k) 
                {
                    s = obj[j];
                    varyFields.add(s.trim());
                    j++;
                }
            } else
            if ("Content-Encoding".equalsIgnoreCase(((String) (obj))))
            {
                contentEncoding = s;
            } else
            if ("Transfer-Encoding".equalsIgnoreCase(((String) (obj))))
            {
                transferEncoding = s;
            } else
            if ("Content-Length".equalsIgnoreCase(((String) (obj))))
            {
                try
                {
                    contentLength = Long.parseLong(s);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } else
            if ("Content-Type".equalsIgnoreCase(((String) (obj))))
            {
                contentType = s;
            } else
            if ("Connection".equalsIgnoreCase(((String) (obj))))
            {
                connection = s;
            } else
            if (SENT_MILLIS.equalsIgnoreCase(((String) (obj))))
            {
                sentRequestMillis = Long.parseLong(s);
            } else
            if (RECEIVED_MILLIS.equalsIgnoreCase(((String) (obj))))
            {
                receivedResponseMillis = Long.parseLong(s);
            }
            i++;
        }
    }

    private long computeAge(long l)
    {
        long l1 = 0L;
        if (servedDate != null)
        {
            l1 = Math.max(0L, receivedResponseMillis - servedDate.getTime());
        }
        if (ageSeconds != -1)
        {
            l1 = Math.max(l1, TimeUnit.SECONDS.toMillis(ageSeconds));
        }
        return l1 + (receivedResponseMillis - sentRequestMillis) + (l - receivedResponseMillis);
    }

    private long computeFreshnessLifetime()
    {
        long l1 = 0L;
        long l;
        if (maxAgeSeconds != -1)
        {
            l = TimeUnit.SECONDS.toMillis(maxAgeSeconds);
        } else
        {
            if (expires != null)
            {
                if (servedDate != null)
                {
                    l = servedDate.getTime();
                } else
                {
                    l = receivedResponseMillis;
                }
                l = expires.getTime() - l;
                if (l <= 0L)
                {
                    l = 0L;
                }
                return l;
            }
            l = l1;
            if (lastModified != null)
            {
                l = l1;
                if (uri.getRawQuery() == null)
                {
                    long l2;
                    if (servedDate != null)
                    {
                        l = servedDate.getTime();
                    } else
                    {
                        l = sentRequestMillis;
                    }
                    l2 = l - lastModified.getTime();
                    l = l1;
                    if (l2 > 0L)
                    {
                        return l2 / 10L;
                    }
                }
            }
        }
        return l;
    }

    private static boolean isEndToEnd(String s)
    {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }

    private boolean isFreshnessLifetimeHeuristic()
    {
        return maxAgeSeconds == -1 && expires == null;
    }

    public ResponseSource chooseResponseSource(long l, RequestHeaders requestheaders)
    {
        if (!isCacheable(requestheaders))
        {
            return ResponseSource.NETWORK;
        }
        if (requestheaders.isNoCache() || requestheaders.hasConditions())
        {
            return ResponseSource.NETWORK;
        }
        long l4 = computeAge(l);
        long l1 = computeFreshnessLifetime();
        l = l1;
        if (requestheaders.getMaxAgeSeconds() != -1)
        {
            l = Math.min(l1, TimeUnit.SECONDS.toMillis(requestheaders.getMaxAgeSeconds()));
        }
        l1 = 0L;
        if (requestheaders.getMinFreshSeconds() != -1)
        {
            l1 = TimeUnit.SECONDS.toMillis(requestheaders.getMinFreshSeconds());
        }
        long l3 = 0L;
        long l2 = l3;
        if (!mustRevalidate)
        {
            l2 = l3;
            if (requestheaders.getMaxStaleSeconds() != -1)
            {
                l2 = TimeUnit.SECONDS.toMillis(requestheaders.getMaxStaleSeconds());
            }
        }
        if (!noCache && l4 + l1 < l + l2)
        {
            if (l4 + l1 >= l)
            {
                headers.add("Warning", "110 HttpURLConnection \"Response is stale\"");
            }
            if (l4 > 0x5265c00L && isFreshnessLifetimeHeuristic())
            {
                headers.add("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
            }
            return ResponseSource.CACHE;
        }
        if (lastModified != null)
        {
            requestheaders.setIfModifiedSince(lastModified);
        } else
        if (servedDate != null)
        {
            requestheaders.setIfModifiedSince(servedDate);
        }
        if (etag != null)
        {
            requestheaders.setIfNoneMatch(etag);
        }
        if (requestheaders.hasConditions())
        {
            return ResponseSource.CONDITIONAL_CACHE;
        } else
        {
            return ResponseSource.NETWORK;
        }
    }

    public ResponseHeaders combine(ResponseHeaders responseheaders)
        throws IOException
    {
        RawHeaders rawheaders = new RawHeaders();
        rawheaders.setStatusLine(headers.getStatusLine());
        int i = 0;
        do
        {
            if (i >= headers.length())
            {
                break;
            }
            String s = headers.getFieldName(i);
            String s2 = headers.getValue(i);
            if ((!"Warning".equals(s) || !s2.startsWith("1")) && (!isEndToEnd(s) || responseheaders.headers.get(s) == null))
            {
                rawheaders.add(s, s2);
            }
            i++;
        } while (true);
        for (int j = 0; j < responseheaders.headers.length(); j++)
        {
            String s1 = responseheaders.headers.getFieldName(j);
            if (isEndToEnd(s1))
            {
                rawheaders.add(s1, responseheaders.headers.getValue(j));
            }
        }

        return new ResponseHeaders(uri, rawheaders);
    }

    public String getConnection()
    {
        return connection;
    }

    public String getContentEncoding()
    {
        return contentEncoding;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public String getContentType()
    {
        return contentType;
    }

    public String getEtag()
    {
        return etag;
    }

    public Date getExpires()
    {
        return expires;
    }

    public RawHeaders getHeaders()
    {
        return headers;
    }

    public Date getLastModified()
    {
        return lastModified;
    }

    public int getMaxAgeSeconds()
    {
        return maxAgeSeconds;
    }

    public int getSMaxAgeSeconds()
    {
        return sMaxAgeSeconds;
    }

    public Date getServedDate()
    {
        return servedDate;
    }

    public URI getUri()
    {
        return uri;
    }

    public Set getVaryFields()
    {
        return varyFields;
    }

    public boolean hasConnectionClose()
    {
        return "close".equalsIgnoreCase(connection);
    }

    public boolean hasVaryAll()
    {
        return varyFields.contains("*");
    }

    public boolean isCacheable(RequestHeaders requestheaders)
    {
        for (int i = headers.getResponseCode(); i != 200 && i != 203 && i != 300 && i != 301 && i != 410 || requestheaders.hasAuthorization() && !isPublic && !mustRevalidate && sMaxAgeSeconds == -1 || noStore;)
        {
            return false;
        }

        return true;
    }

    public boolean isChunked()
    {
        return "chunked".equalsIgnoreCase(transferEncoding);
    }

    public boolean isContentEncodingGzip()
    {
        return "gzip".equalsIgnoreCase(contentEncoding);
    }

    public boolean isMustRevalidate()
    {
        return mustRevalidate;
    }

    public boolean isNoCache()
    {
        return noCache;
    }

    public boolean isNoStore()
    {
        return noStore;
    }

    public boolean isPublic()
    {
        return isPublic;
    }

    public void setLocalTimestamps(long l, long l1)
    {
        sentRequestMillis = l;
        headers.add(SENT_MILLIS, Long.toString(l));
        receivedResponseMillis = l1;
        headers.add(RECEIVED_MILLIS, Long.toString(l1));
    }

    public void setResponseSource(ResponseSource responsesource)
    {
        headers.set(RESPONSE_SOURCE, (new StringBuilder()).append(responsesource.toString()).append(" ").append(headers.getResponseCode()).toString());
    }

    public void setTransport(String s)
    {
        headers.set(SELECTED_TRANSPORT, s);
    }

    public void stripContentEncoding()
    {
        contentEncoding = null;
        headers.removeAll("Content-Encoding");
    }

    public void stripContentLength()
    {
        contentLength = -1L;
        headers.removeAll("Content-Length");
    }

    public boolean validate(ResponseHeaders responseheaders)
    {
        while (responseheaders.headers.getResponseCode() == 304 || lastModified != null && responseheaders.lastModified != null && responseheaders.lastModified.getTime() < lastModified.getTime()) 
        {
            return true;
        }
        return false;
    }

    public boolean varyMatches(Map map, Map map1)
    {
        for (Iterator iterator = varyFields.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!Util.equal(map.get(s), map1.get(s)))
            {
                return false;
            }
        }

        return true;
    }



/*
    static boolean access$002(ResponseHeaders responseheaders, boolean flag)
    {
        responseheaders.noCache = flag;
        return flag;
    }

*/


/*
    static boolean access$102(ResponseHeaders responseheaders, boolean flag)
    {
        responseheaders.noStore = flag;
        return flag;
    }

*/


/*
    static int access$202(ResponseHeaders responseheaders, int i)
    {
        responseheaders.maxAgeSeconds = i;
        return i;
    }

*/


/*
    static int access$302(ResponseHeaders responseheaders, int i)
    {
        responseheaders.sMaxAgeSeconds = i;
        return i;
    }

*/


/*
    static boolean access$402(ResponseHeaders responseheaders, boolean flag)
    {
        responseheaders.isPublic = flag;
        return flag;
    }

*/


/*
    static boolean access$502(ResponseHeaders responseheaders, boolean flag)
    {
        responseheaders.mustRevalidate = flag;
        return flag;
    }

*/
}
