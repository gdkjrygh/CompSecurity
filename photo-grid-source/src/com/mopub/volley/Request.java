// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

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

// Referenced classes of package com.mopub.volley:
//            f, DefaultRetryPolicy, RequestQueue, d, 
//            VolleyLog, RetryPolicy, VolleyError, NetworkResponse, 
//            Response

public abstract class Request
    implements Comparable
{

    private final f a;
    private final int b;
    private final String c;
    private final int d;
    private final Response.ErrorListener e;
    private Integer f;
    private RequestQueue g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private RetryPolicy l;
    private Cache.Entry m;
    private Object n;

    public Request(int i1, String s, Response.ErrorListener errorlistener)
    {
        f f1;
        if (f.ENABLED)
        {
            f1 = new f();
        } else
        {
            f1 = null;
        }
        a = f1;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        b = i1;
        c = s;
        e = errorlistener;
        setRetryPolicy(new DefaultRetryPolicy());
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        i1 = s.hashCode();
_L6:
        d = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Request(String s, Response.ErrorListener errorlistener)
    {
        this(-1, s, errorlistener);
    }

    protected static VolleyError a(VolleyError volleyerror)
    {
        return volleyerror;
    }

    static f a(Request request)
    {
        return request.a;
    }

    private static byte[] a(Map map, String s)
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

    protected abstract Response a(NetworkResponse networkresponse);

    protected Map a()
    {
        return null;
    }

    final void a(String s)
    {
        if (g != null)
        {
            g.a(this);
        }
        if (!f.ENABLED) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new d(this, s, l1));
_L6:
        return;
_L4:
        a.add(s, l1);
        a.finish(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - k;
        if (l2 >= 3000L)
        {
            VolleyLog.d("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void addMarker(String s)
    {
        if (f.ENABLED)
        {
            a.add(s, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public void cancel()
    {
        i = true;
    }

    public int compareTo(Request request)
    {
        Priority priority = getPriority();
        Priority priority1 = request.getPriority();
        if (priority == priority1)
        {
            return f.intValue() - request.f.intValue();
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
        if (e != null)
        {
            e.onErrorResponse(volleyerror);
        }
    }

    protected abstract void deliverResponse(Object obj);

    public byte[] getBody()
    {
        Map map = a();
        if (map != null && map.size() > 0)
        {
            return a(map, "UTF-8");
        } else
        {
            return null;
        }
    }

    public String getBodyContentType()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public Cache.Entry getCacheEntry()
    {
        return m;
    }

    public String getCacheKey()
    {
        return getUrl();
    }

    public Response.ErrorListener getErrorListener()
    {
        return e;
    }

    public Map getHeaders()
    {
        return Collections.emptyMap();
    }

    public int getMethod()
    {
        return b;
    }

    public byte[] getPostBody()
    {
        Map map = a();
        if (map != null && map.size() > 0)
        {
            return a(map, "UTF-8");
        } else
        {
            return null;
        }
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

    public Priority getPriority()
    {
        return Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy()
    {
        return l;
    }

    public final int getSequence()
    {
        if (f == null)
        {
            throw new IllegalStateException("getSequence called before setSequence");
        } else
        {
            return f.intValue();
        }
    }

    public Object getTag()
    {
        return n;
    }

    public final int getTimeoutMs()
    {
        return l.getCurrentTimeout();
    }

    public int getTrafficStatsTag()
    {
        return d;
    }

    public String getUrl()
    {
        return c;
    }

    public boolean hasHadResponseDelivered()
    {
        return j;
    }

    public boolean isCanceled()
    {
        return i;
    }

    public void markDelivered()
    {
        j = true;
    }

    public Request setCacheEntry(Cache.Entry entry)
    {
        m = entry;
        return this;
    }

    public Request setRequestQueue(RequestQueue requestqueue)
    {
        g = requestqueue;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retrypolicy)
    {
        l = retrypolicy;
        return this;
    }

    public final Request setSequence(int i1)
    {
        f = Integer.valueOf(i1);
        return this;
    }

    public final Request setShouldCache(boolean flag)
    {
        h = flag;
        return this;
    }

    public Request setTag(Object obj)
    {
        n = obj;
        return this;
    }

    public final boolean shouldCache()
    {
        return h;
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(getTrafficStatsTag())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (i)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(getUrl()).append(" ").append(s1).append(" ").append(getPriority()).append(" ").append(f).toString();
    }

    private class Priority extends Enum
    {

        public static final Priority HIGH;
        public static final Priority IMMEDIATE;
        public static final Priority LOW;
        public static final Priority NORMAL;
        private static final Priority a[];

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/mopub/volley/Request$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])a.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0);
            NORMAL = new Priority("NORMAL", 1);
            HIGH = new Priority("HIGH", 2);
            IMMEDIATE = new Priority("IMMEDIATE", 3);
            a = (new Priority[] {
                LOW, NORMAL, HIGH, IMMEDIATE
            });
        }

        private Priority(String s, int i1)
        {
            super(s, i1);
        }
    }

}
