// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import android.os.SystemClock;
import com.android.b.aa;
import com.android.b.ab;
import com.android.b.ac;
import com.android.b.ad;
import com.android.b.c;
import com.android.b.k;
import com.android.b.m;
import com.android.b.n;
import com.android.b.o;
import com.android.b.q;
import com.android.b.z;
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

// Referenced classes of package com.android.b.a:
//            b, q, k

public class a
    implements k
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final com.android.b.a.k b;
    protected final b c;

    public a(com.android.b.a.k k1)
    {
        this(k1, new b(e));
    }

    public a(com.android.b.a.k k1, b b1)
    {
        b = k1;
        c = b1;
    }

    protected static Map a(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private void a(long l, q q1, byte abyte0[], StatusLine statusline)
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
            ad.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                q1, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(q1.t().b())
            });
        }
    }

    private static void a(String s, q q1, ac ac1)
    {
        z z1 = q1.t();
        int i = q1.s();
        try
        {
            z1.a(ac1);
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            q1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw ac1;
        }
        q1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private void a(Map map, c c1)
    {
        if (c1 != null)
        {
            if (c1.b != null)
            {
                map.put("If-None-Match", c1.b);
            }
            if (c1.d > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(c1.d)));
                return;
            }
        }
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        com.android.b.a.q q1;
        q1 = new com.android.b.a.q(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new aa();
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
            ad.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        q1.close();
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
        q1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = q1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            ad.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        q1.close();
        return abyte1;
    }

    public n a(q q1)
    {
        long l = SystemClock.elapsedRealtime();
_L5:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj1;
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)), q1.f());
        obj1 = b.a(q1, hashmap);
        Object obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = q1.f();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj4;
        return new n(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        ((c) (obj2)).g.putAll(((Map) (obj4)));
        obj = obj4;
        return new n(304, ((c) (obj2)).a, ((c) (obj2)).g, true, SystemClock.elapsedRealtime() - l);
_L8:
        obj = obj4;
        q1.c((String)((Map) (obj4)).get("Location"));
_L9:
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L4; else goto _L3
_L3:
        obj = obj4;
        obj2 = a(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L6:
        a(SystemClock.elapsedRealtime() - l, q1, ((byte []) (obj)), ((StatusLine) (obj3)));
        if (i >= 200 && i <= 299)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        throw new IOException();
        obj;
        a("socket", q1, ((ac) (new ab())));
          goto _L5
_L4:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L6
        obj2 = new n(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
        return ((n) (obj2));
        obj;
        a("connection", q1, ((ac) (new ab())));
          goto _L5
        obj;
        throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(q1.c()).toString(), ((Throwable) (obj)));
        obj1;
        obj3 = null;
        obj = obj2;
        obj2 = obj4;
_L7:
        if (obj2 != null)
        {
            i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            if (i == 301 || i == 302)
            {
                ad.c("Request at %s has been redirected to %s", new Object[] {
                    q1.d(), q1.c()
                });
            } else
            {
                ad.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), q1.c()
                });
            }
            if (obj3 != null)
            {
                obj = new n(i, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l);
                if (i == 401 || i == 403)
                {
                    a("auth", q1, ((ac) (new com.android.b.a(((n) (obj))))));
                } else
                if (i == 301 || i == 302)
                {
                    a("redirect", q1, ((ac) (new com.android.b.a(((n) (obj))))));
                } else
                {
                    throw new aa(((n) (obj)));
                }
            } else
            {
                throw new m(null);
            }
        } else
        {
            throw new o(((Throwable) (obj1)));
        }
          goto _L5
        obj4;
        obj3 = null;
        obj2 = obj1;
        obj1 = obj4;
          goto _L7
        IOException ioexception;
        ioexception;
        obj2 = obj1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj));
        obj = obj4;
          goto _L7
_L2:
        if (i != 301 && i != 302) goto _L9; else goto _L8
    }

    static 
    {
        a = ad.b;
    }
}
