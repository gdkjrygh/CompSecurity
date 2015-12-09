// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.e;
import com.android.volley.f;
import com.android.volley.g;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.o;
import com.android.volley.p;
import com.android.volley.q;
import com.android.volley.r;
import com.android.volley.s;
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
//            b, l, f

public class a
    implements e
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final com.android.volley.toolbox.f b;
    protected final b c;

    public a(com.android.volley.toolbox.f f1)
    {
        this(f1, new b(e));
    }

    public a(com.android.volley.toolbox.f f1, b b1)
    {
        b = f1;
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

    private void a(long l1, k k1, byte abyte0[], StatusLine statusline)
    {
        if (a || l1 > (long)d)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            s.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                k1, Long.valueOf(l1), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(k1.w().b())
            });
        }
    }

    private static void a(String s1, k k1, r r1)
        throws r
    {
        o o1 = k1.w();
        int i = k1.v();
        try
        {
            o1.a(r1);
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            k1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s1, Integer.valueOf(i)
            }));
            throw r1;
        }
        k1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s1, Integer.valueOf(i)
        }));
    }

    private void a(Map map, com.android.volley.b.a a1)
    {
        if (a1 != null)
        {
            if (a1.b != null)
            {
                map.put("If-None-Match", a1.b);
            }
            if (a1.d > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(a1.d)));
                return;
            }
        }
    }

    private byte[] a(HttpEntity httpentity)
        throws IOException, p
    {
        Object obj;
        Exception exception;
        l l1;
        l1 = new l(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new p();
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
            s.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        l1.close();
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
        l1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = l1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            s.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        l1.close();
        return abyte1;
    }

    public g a(k k1)
        throws r
    {
        long l1 = SystemClock.elapsedRealtime();
_L5:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj1;
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)), k1.h());
        obj1 = b.a(k1, hashmap);
        Object obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = k1.h();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj4;
        return new g(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l1);
        obj = obj4;
        ((com.android.volley.b.a) (obj2)).g.putAll(((Map) (obj4)));
        obj = obj4;
        return new g(304, ((com.android.volley.b.a) (obj2)).a, ((com.android.volley.b.a) (obj2)).g, true, SystemClock.elapsedRealtime() - l1);
_L8:
        obj = obj4;
        k1.c((String)((Map) (obj4)).get("Location"));
_L9:
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L4; else goto _L3
_L3:
        obj = obj4;
        obj2 = a(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L6:
        a(SystemClock.elapsedRealtime() - l1, k1, ((byte []) (obj)), ((StatusLine) (obj3)));
        if (i >= 200 && i <= 299)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        throw new IOException();
        obj;
        a("socket", k1, ((r) (new q())));
          goto _L5
_L4:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L6
        obj2 = new g(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l1);
        return ((g) (obj2));
        obj;
        a("connection", k1, ((r) (new q())));
          goto _L5
        obj;
        throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(k1.e()).toString(), ((Throwable) (obj)));
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
                s.c("Request at %s has been redirected to %s", new Object[] {
                    k1.f(), k1.e()
                });
            } else
            {
                s.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), k1.e()
                });
            }
            if (obj3 != null)
            {
                obj = new g(i, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l1);
                if (i == 401 || i == 403)
                {
                    a("auth", k1, ((r) (new com.android.volley.a(((g) (obj))))));
                } else
                if (i == 301 || i == 302)
                {
                    a("redirect", k1, ((r) (new j(((g) (obj))))));
                } else
                {
                    throw new p(((g) (obj)));
                }
            } else
            {
                throw new f(((Throwable) (obj1)));
            }
        } else
        {
            throw new h(((Throwable) (obj1)));
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
        a = s.b;
    }
}
