// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.volley:
//            DefaultRetryPolicy, RequestQueue, VolleyLog, RetryPolicy, 
//            VolleyError, NetworkResponse, Response

public abstract class Request
    implements Comparable
{

    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private static final long SLOW_REQUEST_THRESHOLD_MS = 3000L;
    private Cache.Entry mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private Response.ErrorListener mErrorListener;
    private final VolleyLog.MarkerLog mEventLog;
    private final int mMethod;
    private String mRedirectUrl;
    private long mRequestBirthTime;
    private RequestQueue mRequestQueue;
    private boolean mResponseDelivered;
    private RetryPolicy mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private Object mTag;
    private final String mUrl;

    public Request(int i, String s, Response.ErrorListener errorlistener)
    {
        VolleyLog.MarkerLog markerlog;
        if (VolleyLog.MarkerLog.ENABLED)
        {
            markerlog = new VolleyLog.MarkerLog();
        } else
        {
            markerlog = null;
        }
        mEventLog = markerlog;
        mShouldCache = true;
        mCanceled = false;
        mResponseDelivered = false;
        mRequestBirthTime = 0L;
        mCacheEntry = null;
        mMethod = i;
        mUrl = s;
        mErrorListener = errorlistener;
        setRetryPolicy(new DefaultRetryPolicy());
        mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(s);
    }

    public Request(String s, Response.ErrorListener errorlistener)
    {
        this(-1, s, errorlistener);
    }

    private byte[] encodeParameters(Map map, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder("Encoding not supported: ")).append(s).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s);
        return map;
    }

    private static int findDefaultTrafficStatsTag(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = Uri.parse(s);
            if (s != null)
            {
                s = s.getHost();
                if (s != null)
                {
                    return s.hashCode();
                }
            }
        }
        return 0;
    }

    public void addMarker(String s)
    {
        if (VolleyLog.MarkerLog.ENABLED)
        {
            mEventLog.add(s, Thread.currentThread().getId());
        } else
        if (mRequestBirthTime == 0L)
        {
            mRequestBirthTime = SystemClock.elapsedRealtime();
            return;
        }
    }

    public void cancel()
    {
        mCanceled = true;
    }

    public int compareTo(Request request)
    {
        Priority priority = getPriority();
        Priority priority1 = request.getPriority();
        if (priority == priority1)
        {
            return mSequence.intValue() - request.mSequence.intValue();
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Request)obj);
    }

    public void deliverError(VolleyError volleyerror)
    {
        if (mErrorListener != null)
        {
            mErrorListener.onErrorResponse(volleyerror);
        }
    }

    protected abstract void deliverResponse(Object obj);

    protected void deliverResponseHeader(Map map)
    {
    }

    void finish(String s)
    {
        if (mRequestQueue != null)
        {
            mRequestQueue.finish(this);
        }
        if (!VolleyLog.MarkerLog.ENABLED) goto _L2; else goto _L1
_L1:
        long l = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new _cls1(s, l));
_L6:
        return;
_L4:
        mEventLog.add(s, l);
        mEventLog.finish(toString());
        return;
_L2:
        long l1 = SystemClock.elapsedRealtime() - mRequestBirthTime;
        if (l1 >= 3000L)
        {
            VolleyLog.d("%d ms: %s", new Object[] {
                Long.valueOf(l1), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public byte[] getBody()
    {
        Map map = getParams();
        if (map != null && map.size() > 0)
        {
            return encodeParameters(map, getParamsEncoding());
        } else
        {
            return null;
        }
    }

    public String getBodyContentType()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append(getParamsEncoding()).toString();
    }

    public Cache.Entry getCacheEntry()
    {
        return mCacheEntry;
    }

    public String getCacheKey()
    {
        return getUrl();
    }

    public Response.ErrorListener getErrorListener()
    {
        return mErrorListener;
    }

    public Map getHeaders()
    {
        return Collections.emptyMap();
    }

    public int getMethod()
    {
        return mMethod;
    }

    public String getOriginUrl()
    {
        return mUrl;
    }

    protected Map getParams()
    {
        return null;
    }

    protected String getParamsEncoding()
    {
        return "UTF-8";
    }

    public byte[] getPostBody()
    {
        Map map = getPostParams();
        if (map != null && map.size() > 0)
        {
            return encodeParameters(map, getPostParamsEncoding());
        } else
        {
            return null;
        }
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

    protected Map getPostParams()
    {
        return getParams();
    }

    protected String getPostParamsEncoding()
    {
        return getParamsEncoding();
    }

    public Priority getPriority()
    {
        return Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy()
    {
        return mRetryPolicy;
    }

    public final int getSequence()
    {
        if (mSequence == null)
        {
            throw new IllegalStateException("getSequence called before setSequence");
        } else
        {
            return mSequence.intValue();
        }
    }

    public Object getTag()
    {
        return mTag;
    }

    public final int getTimeoutMs()
    {
        return mRetryPolicy.getCurrentTimeout();
    }

    public int getTrafficStatsTag()
    {
        return mDefaultTrafficStatsTag;
    }

    public String getUrl()
    {
        if (mRedirectUrl != null)
        {
            return mRedirectUrl;
        } else
        {
            return mUrl;
        }
    }

    public boolean hasHadResponseDelivered()
    {
        return mResponseDelivered;
    }

    public boolean isCanceled()
    {
        return mCanceled;
    }

    public void markDelivered()
    {
        mResponseDelivered = true;
    }

    protected VolleyError parseNetworkError(VolleyError volleyerror)
    {
        return volleyerror;
    }

    protected abstract Response parseNetworkResponse(NetworkResponse networkresponse);

    public Request setCacheEntry(Cache.Entry entry)
    {
        mCacheEntry = entry;
        return this;
    }

    public void setErrorListener(Response.ErrorListener errorlistener)
    {
        mErrorListener = errorlistener;
    }

    public void setRedirectUrl(String s)
    {
        mRedirectUrl = s;
    }

    public Request setRequestQueue(RequestQueue requestqueue)
    {
        mRequestQueue = requestqueue;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retrypolicy)
    {
        mRetryPolicy = retrypolicy;
        return this;
    }

    public final Request setSequence(int i)
    {
        mSequence = Integer.valueOf(i);
        return this;
    }

    public final Request setShouldCache(boolean flag)
    {
        mShouldCache = flag;
        return this;
    }

    public Request setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public final boolean shouldCache()
    {
        return mShouldCache;
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(getTrafficStatsTag())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (mCanceled)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(getUrl()).append(" ").append(s1).append(" ").append(getPriority()).append(" ").append(mSequence).toString();
    }


    /* member class not found */
    class Priority {}


    /* member class not found */
    class _cls1 {}

}
