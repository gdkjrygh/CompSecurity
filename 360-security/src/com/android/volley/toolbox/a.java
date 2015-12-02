// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.g;
import com.android.volley.i;
import com.android.volley.m;
import com.android.volley.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.android.volley.toolbox:
//            b, k, e

public class a
    implements g
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final e b;
    protected final b c;

    public a(e e1)
    {
        this(e1, new b(e));
    }

    public a(e e1, b b1)
    {
        b = e1;
        c = b1;
    }

    private static Map a(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        int j = 0;
        do
        {
            if (j >= aheader.length)
            {
                return hashmap;
            }
            hashmap.put(aheader[j].getName(), aheader[j].getValue());
            j++;
        } while (true);
    }

    private void a(long l, Request request, byte abyte0[], StatusLine statusline)
    {
        if (a || l > (long)d)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            n.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                request, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(request.u().b())
            });
        }
    }

    private static void a(String s, Request request, VolleyError volleyerror)
        throws VolleyError
    {
        m m1 = request.u();
        int j = request.t();
        try
        {
            m1.a(volleyerror);
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            request.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(j)
            }));
            throw volleyerror;
        }
        request.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(j)
        }));
    }

    private void a(Map map, com.android.volley.a a1)
    {
        if (a1 != null)
        {
            if (a1.b != null)
            {
                map.put("If-None-Match", a1.b);
            }
            if (a1.c > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(a1.c)));
                return;
            }
        }
    }

    private byte[] a(HttpEntity httpentity)
        throws IOException, ServerError
    {
        Object obj;
        Exception exception;
        k k1;
        k1 = new k(c, (int)httpentity.getContentLength());
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
        int j;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            n.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        k1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L1:
        obj = abyte0;
        j = inputstream.read(abyte0);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = abyte0;
        abyte1 = k1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            n.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        k1.close();
        return abyte1;
        obj = abyte0;
        k1.write(abyte0, 0, j);
          goto _L1
    }

    public i a(Request request)
        throws VolleyError
    {
        long l = SystemClock.elapsedRealtime();
_L11:
        Object obj;
        byte abyte0[];
        HashMap hashmap;
        Object obj3;
        abyte0 = null;
        obj3 = null;
        obj = null;
        hashmap = new HashMap();
        Object obj1;
        obj1 = new HashMap();
        a(((Map) (obj1)), request.f());
        obj1 = b.a(request, ((Map) (obj1)));
        Object obj2;
        StatusLine statusline;
        int j;
        statusline = ((HttpResponse) (obj1)).getStatusLine();
        j = statusline.getStatusCode();
        obj2 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (j != 304) goto _L2; else goto _L1
_L1:
        obj = obj3;
        if (request.f() != null) goto _L4; else goto _L3
_L3:
        abyte0 = null;
_L5:
        obj = obj3;
        IOException ioexception;
        IOException ioexception1;
        try
        {
            return new i(304, abyte0, ((Map) (obj2)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("socket", request, ((VolleyError) (new TimeoutError())));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("connection", request, ((VolleyError) (new TimeoutError())));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Bad URL ")).append(request.d()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        break MISSING_BLOCK_LABEL_311;
_L4:
        obj = obj3;
        abyte0 = request.f().a;
        if (true) goto _L5; else goto _L2
_L2:
        obj = obj3;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L7; else goto _L6
_L6:
        obj = obj3;
        abyte0 = a(((HttpResponse) (obj1)).getEntity());
_L9:
        obj = abyte0;
        a(SystemClock.elapsedRealtime() - l, request, abyte0, statusline);
        if (j >= 200 && j <= 299)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        throw new IOException();
_L7:
        obj = obj3;
        abyte0 = new byte[0];
        if (true) goto _L9; else goto _L8
_L8:
        obj = abyte0;
        abyte0 = new i(j, abyte0, ((Map) (obj2)), false);
        return abyte0;
        ioexception1;
        obj1 = abyte0;
        obj2 = hashmap;
        ioexception = ioexception1;
_L12:
        if (obj1 != null)
        {
            j = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
            n.c("Unexpected response code %d for %s", new Object[] {
                Integer.valueOf(j), request.d()
            });
            if (obj != null)
            {
                obj = new i(j, ((byte []) (obj)), ((Map) (obj2)), false);
                if (j == 401 || j == 403)
                {
                    a("auth", request, ((VolleyError) (new AuthFailureError(((i) (obj))))));
                } else
                {
                    throw new ServerError(((i) (obj)));
                }
            } else
            {
                throw new NetworkError(null);
            }
        } else
        {
            throw new NoConnectionError(ioexception);
        }
        if (true) goto _L11; else goto _L10
_L10:
        ioexception;
        obj2 = hashmap;
          goto _L12
    }

    static 
    {
        a = n.b;
    }
}
