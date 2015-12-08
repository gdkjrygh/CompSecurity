// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.RedirectError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.android.volley.k;
import com.android.volley.l;
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

// Referenced classes of package com.android.volley.a:
//            b, k, f

public final class a
    implements f
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final com.android.volley.a.f b;
    protected final b c;

    public a(com.android.volley.a.f f1)
    {
        this(f1, new b(e));
    }

    private a(com.android.volley.a.f f1, b b1)
    {
        b = f1;
        c = b1;
    }

    private static Map a(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private static void a(String s, Request request, VolleyError volleyerror)
        throws VolleyError
    {
        k k1 = request.j;
        int i = request.j();
        try
        {
            k1.a(volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            request.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw volleyerror;
        }
        request.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
        throws IOException, ServerError
    {
        Object obj;
        Exception exception;
        com.android.volley.a.k k1;
        k1 = new com.android.volley.a.k(c, (int)httpentity.getContentLength());
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
            l.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        k1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        k1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = k1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            l.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        k1.close();
        return abyte1;
    }

    public final NetworkResponse a(Request request)
        throws VolleyError
    {
        long l1 = SystemClock.elapsedRealtime();
_L9:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj;
        Object obj1;
        obj = new HashMap();
        obj1 = request.k;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (((com.android.volley.a) (obj1)).b != null)
        {
            ((Map) (obj)).put("If-None-Match", ((com.android.volley.a) (obj1)).b);
        }
        if (((com.android.volley.a) (obj1)).d > 0L)
        {
            ((Map) (obj)).put("If-Modified-Since", DateUtils.formatDate(new Date(((com.android.volley.a) (obj1)).d)));
        }
        obj1 = b.a(request, ((Map) (obj)));
        obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = request.k;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj = obj4;
        return new NetworkResponse(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l1);
        obj = obj4;
        ((com.android.volley.a) (obj2)).g.putAll(((Map) (obj4)));
        obj = obj4;
        return new NetworkResponse(304, ((com.android.volley.a) (obj2)).a, ((com.android.volley.a) (obj2)).g, true, SystemClock.elapsedRealtime() - l1);
_L13:
        obj = obj4;
        request.c = (String)((Map) (obj4)).get("Location");
_L14:
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L4; else goto _L3
_L3:
        obj = obj4;
        obj2 = a(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L10:
        long l2 = SystemClock.elapsedRealtime() - l1;
        if (!a && l2 <= (long)d) goto _L6; else goto _L5
_L5:
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj2 = Integer.valueOf(obj.length);
_L11:
        l.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            request, Long.valueOf(l2), obj2, Integer.valueOf(((StatusLine) (obj3)).getStatusCode()), Integer.valueOf(request.j.b())
        });
          goto _L6
_L15:
        throw new IOException();
        obj;
        a("socket", request, ((VolleyError) (new TimeoutError())));
          goto _L9
_L4:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L10
_L8:
        obj2 = "null";
          goto _L11
_L16:
        obj2 = new NetworkResponse(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l1);
        return ((NetworkResponse) (obj2));
        obj;
        a("connection", request, ((VolleyError) (new TimeoutError())));
          goto _L9
        obj;
        throw new RuntimeException((new StringBuilder("Bad URL ")).append(request.b()).toString(), ((Throwable) (obj)));
        obj1;
        obj3 = null;
        obj = obj2;
        obj2 = obj4;
_L12:
        if (obj2 != null)
        {
            i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            if (i == 301 || i == 302)
            {
                l.c("Request at %s has been redirected to %s", new Object[] {
                    request.b, request.b()
                });
            } else
            {
                l.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), request.b()
                });
            }
            if (obj3 != null)
            {
                obj = new NetworkResponse(i, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l1);
                if (i == 401 || i == 403)
                {
                    a("auth", request, ((VolleyError) (new AuthFailureError(((NetworkResponse) (obj))))));
                } else
                if (i == 301 || i == 302)
                {
                    a("redirect", request, ((VolleyError) (new RedirectError(((NetworkResponse) (obj))))));
                } else
                {
                    throw new ServerError(((NetworkResponse) (obj)));
                }
            } else
            {
                throw new NetworkError(((Throwable) (obj1)));
            }
        } else
        {
            throw new NoConnectionError(((Throwable) (obj1)));
        }
          goto _L9
        obj4;
        obj3 = null;
        obj2 = obj1;
        obj1 = obj4;
          goto _L12
        IOException ioexception;
        ioexception;
        obj2 = obj1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj));
        obj = obj4;
          goto _L12
_L2:
        if (i != 301 && i != 302) goto _L14; else goto _L13
_L6:
        if (i >= 200 && i <= 299) goto _L16; else goto _L15
    }

    static 
    {
        a = l.b;
    }
}
