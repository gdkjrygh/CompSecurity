// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.android.volley.toolbox:
//            ByteArrayPool, PoolingByteArrayOutputStream, HttpStack

public class BasicNetwork
    implements Network
{

    protected static final boolean DEBUG;
    private static int DEFAULT_POOL_SIZE = 4096;
    private static int SLOW_REQUEST_THRESHOLD_MS = 3000;
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(HttpStack httpstack)
    {
        this(httpstack, new ByteArrayPool(DEFAULT_POOL_SIZE));
    }

    public BasicNetwork(HttpStack httpstack, ByteArrayPool bytearraypool)
    {
        mHttpStack = httpstack;
        mPool = bytearraypool;
    }

    private void addCacheHeaders(Map map, com.android.volley.Cache.Entry entry)
    {
        if (entry != null)
        {
            if (entry.etag != null)
            {
                map.put("If-None-Match", entry.etag);
            }
            if (entry.serverDate > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(entry.serverDate)));
                return;
            }
        }
    }

    private static void attemptRetryOnException(String s, Request request, VolleyError volleyerror)
        throws VolleyError
    {
        RetryPolicy retrypolicy = request.getRetryPolicy();
        int i = request.getTimeoutMs();
        try
        {
            retrypolicy.retry(volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw volleyerror;
        }
        request.addMarker(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    protected static Map convertHeaders(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private byte[] entityToBytes(HttpEntity httpentity)
        throws IOException, ServerError
    {
        Object obj;
        Exception exception;
        PoolingByteArrayOutputStream poolingbytearrayoutputstream;
        poolingbytearrayoutputstream = new PoolingByteArrayOutputStream(mPool, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new ServerError();
        exception;
        byte abyte0[];
        byte abyte1[];
        int i;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
        }
        mPool.returnBuf(((byte []) (obj)));
        poolingbytearrayoutputstream.close();
        throw exception;
        obj = exception;
        abyte0 = mPool.getBuf(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        poolingbytearrayoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = poolingbytearrayoutputstream.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
        }
        mPool.returnBuf(abyte0);
        poolingbytearrayoutputstream.close();
        return abyte1;
    }

    private void logSlowRequests(long l, Request request, byte abyte0[], StatusLine statusline)
    {
        if (DEBUG || l > (long)SLOW_REQUEST_THRESHOLD_MS)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                request, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount())
            });
        }
    }

    protected void logError(String s, String s1, long l)
    {
        VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", new Object[] {
            s, Long.valueOf(SystemClock.elapsedRealtime() - l), s1
        });
    }

    public NetworkResponse performRequest(Request request)
        throws VolleyError
    {
        long l = SystemClock.elapsedRealtime();
_L3:
        Object obj;
        byte abyte0[];
        HttpResponse httpresponse;
        Map map;
        HttpResponse httpresponse1;
        Map map1;
        httpresponse1 = null;
        obj = null;
        map1 = Collections.emptyMap();
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        Object obj2 = new HashMap();
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        addCacheHeaders(((Map) (obj2)), request.getCacheEntry());
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        httpresponse1 = mHttpStack.performRequest(request, ((Map) (obj2)));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj2 = httpresponse1.getStatusLine();
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        int i = ((StatusLine) (obj2)).getStatusCode();
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        map1 = convertHeaders(httpresponse1.getAllHeaders());
        if (i != 304)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj2 = request.getCacheEntry();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        try
        {
            return new NetworkResponse(304, null, map1, true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            attemptRetryOnException("socket", request, new TimeoutError());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            attemptRetryOnException("connection", request, new TimeoutError());
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(request.getUrl()).toString(), malformedurlexception);
        }
        catch (Object obj1)
        {
            if (httpresponse != null)
            {
                int j = httpresponse.getStatusLine().getStatusCode();
                VolleyLog.e("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(j), request.getUrl()
                });
                if (abyte0 != null)
                {
                    obj1 = new NetworkResponse(j, abyte0, map, false);
                    if (j == 401 || j == 403)
                    {
                        attemptRetryOnException("auth", request, new AuthFailureError(((NetworkResponse) (obj1))));
                    } else
                    {
                        throw new ServerError(((NetworkResponse) (obj1)));
                    }
                } else
                {
                    throw new NetworkError(null);
                }
            } else
            {
                throw new NoConnectionError(((Throwable) (obj1)));
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        ((com.android.volley.Cache.Entry) (obj2)).responseHeaders.putAll(map1);
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj = new NetworkResponse(304, ((com.android.volley.Cache.Entry) (obj2)).data, ((com.android.volley.Cache.Entry) (obj2)).responseHeaders, true);
        return ((NetworkResponse) (obj));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        if (httpresponse1.getEntity() == null) goto _L5; else goto _L4
_L4:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj = entityToBytes(httpresponse1.getEntity());
_L7:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        logSlowRequests(SystemClock.elapsedRealtime() - l, request, ((byte []) (obj)), ((StatusLine) (obj2)));
        if (i >= 200 && i <= 299)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        throw new IOException();
_L5:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj = new byte[0];
        if (true) goto _L7; else goto _L6
_L6:
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        map = map1;
        obj = new NetworkResponse(i, ((byte []) (obj)), map1, false);
        return ((NetworkResponse) (obj));
    }

    static 
    {
        DEBUG = VolleyLog.DEBUG;
    }
}
