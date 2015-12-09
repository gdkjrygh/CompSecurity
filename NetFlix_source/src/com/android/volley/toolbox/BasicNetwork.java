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
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.RedirectException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//            ByteArrayPool, PoolingByteArrayOutputStream, InputStreamUtil, HttpStack

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

    private static Map convertHeaders(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aheader.length; i++)
        {
            hashmap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return hashmap;
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
        if (l > (long)SLOW_REQUEST_THRESHOLD_MS || DEBUG)
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

    public String getRedirectedHost(HttpResponse httpresponse)
    {
        Object obj = null;
        Object obj1 = httpresponse.getEntity();
        if (httpresponse.getStatusLine() == null || obj1 == null)
        {
            throw new NullPointerException("Status/entity is NULL. It should NOT happen!");
        }
        try
        {
            httpresponse = InputStreamUtil.convertStreamToString(((HttpEntity) (obj1)).getContent());
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            VolleyLog.e("IO exception reading redirect response %s", new Object[] {
                httpresponse
            });
            return null;
        }
        try
        {
            obj1 = new JSONObject(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            VolleyLog.e("Json exception reading redirect response %s", new Object[] {
                httpresponse
            });
            return null;
        }
        httpresponse = obj;
        if (((JSONObject) (obj1)).has("host"))
        {
            httpresponse = ((JSONObject) (obj1)).getString("host");
        }
        return httpresponse;
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
        HttpResponse httpresponse;
        Object obj1;
        byte abyte0[];
        HttpResponse httpresponse1;
        Object obj2;
        httpresponse1 = null;
        abyte0 = null;
        obj2 = new HashMap();
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        Object obj3 = new HashMap();
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        addCacheHeaders(((Map) (obj3)), request.getCacheEntry());
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        httpresponse1 = mHttpStack.performRequest(request, ((Map) (obj3)));
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        obj3 = httpresponse1.getStatusLine();
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        VolleyLog.d("Http status: %d", new Object[] {
            Integer.valueOf(i)
        });
        if (i != 500) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        NetworkResponse networkresponse;
        try
        {
            throw new HttpRetryException("retry", i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            attemptRetryOnException("Http500", request, new TimeoutError());
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
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(request.getUrl()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            attemptRetryOnException("redirect", request, new VolleyError(((RedirectException) (obj)).getMessage()));
        }
        catch (IOException ioexception)
        {
            if (httpresponse != null)
            {
                int j = httpresponse.getStatusLine().getStatusCode();
                VolleyLog.e("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(j), request.getUrl()
                });
                if (obj != null)
                {
                    obj = new NetworkResponse(j, ((byte []) (obj)), ((Map) (obj1)), false);
                    if (j == 401 || j == 403)
                    {
                        attemptRetryOnException("auth", request, new AuthFailureError(((NetworkResponse) (obj))));
                    } else
                    {
                        throw new ServerError(((NetworkResponse) (obj)));
                    }
                } else
                {
                    throw new NetworkError(null);
                }
            } else
            {
                throw new NoConnectionError(ioexception);
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (i != 410)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        obj3 = getRedirectedHost(httpresponse1);
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        request.changeHostUrl(((String) (obj3)));
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        throw new RedirectException(((String) (obj3)));
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        obj2 = convertHeaders(httpresponse1.getAllHeaders());
        if (i != 301 && i != 302 && i != 307)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        obj3 = (String)((Map) (obj2)).get("Location");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        request.changeToRedirectedUrl(((String) (obj3)));
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        throw new RedirectException(((String) (obj3)));
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        throw new IOException();
        if (i != 304)
        {
            break MISSING_BLOCK_LABEL_498;
        }
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        return new NetworkResponse(304, request.getCacheEntry().data, ((Map) (obj2)), true);
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        abyte0 = entityToBytes(httpresponse1.getEntity());
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        logSlowRequests(SystemClock.elapsedRealtime() - l, request, abyte0, ((StatusLine) (obj3)));
        if (i == 200 || i == 204 || i == 202)
        {
            break MISSING_BLOCK_LABEL_610;
        }
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        throw new IOException();
        obj = abyte0;
        httpresponse = httpresponse1;
        obj1 = obj2;
        networkresponse = new NetworkResponse(i, abyte0, ((Map) (obj2)), false);
        return networkresponse;
    }

    static 
    {
        DEBUG = VolleyLog.DEBUG;
    }
}
