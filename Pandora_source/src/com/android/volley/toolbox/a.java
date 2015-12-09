// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
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
import p.k.f;
import p.k.h;
import p.k.i;
import p.k.j;
import p.k.l;
import p.k.p;
import p.k.q;
import p.k.r;
import p.k.s;
import p.k.t;

// Referenced classes of package com.android.volley.toolbox:
//            b, j, f

public class a
    implements f
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
        for (int k = 0; k < aheader.length; k++)
        {
            treemap.put(aheader[k].getName(), aheader[k].getValue());
        }

        return treemap;
    }

    private void a(long l1, l l2, byte abyte0[], StatusLine statusline)
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
            t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                l2, Long.valueOf(l1), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(l2.u().b())
            });
        }
    }

    private static void a(String s1, l l1, s s2)
        throws s
    {
        p p1 = l1.u();
        int k = l1.t();
        try
        {
            p1.a(s2);
        }
        // Misplaced declaration of an exception variable
        catch (s s2)
        {
            l1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s1, Integer.valueOf(k)
            }));
            throw s2;
        }
        l1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s1, Integer.valueOf(k)
        }));
    }

    private void a(Map map, p.k.b.a a1)
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
        throws IOException, q
    {
        Object obj;
        Exception exception;
        com.android.volley.toolbox.j j1;
        j1 = new com.android.volley.toolbox.j(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new q();
        exception;
        byte abyte0[];
        byte abyte1[];
        int k;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            t.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        j1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L2:
        obj = abyte0;
        k = inputstream.read(abyte0);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        j1.write(abyte0, 0, k);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = j1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            t.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        j1.close();
        return abyte1;
    }

    public i a(l l1)
        throws s
    {
        long l2 = SystemClock.elapsedRealtime();
_L6:
        Object obj;
        i k;
        Object obj2;
        Map map;
        map = null;
        k = null;
        obj = null;
        obj2 = Collections.emptyMap();
        Object obj1;
        obj1 = new HashMap();
        a(((Map) (obj1)), l1.f());
        obj1 = b.a(l1, ((Map) (obj1)));
        StatusLine statusline;
        int i1;
        statusline = ((HttpResponse) (obj1)).getStatusLine();
        i1 = statusline.getStatusCode();
        map = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i1 != 304)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        obj = k;
        obj2 = l1.f();
        if (obj2 == null)
        {
            obj = k;
            IOException ioexception;
            try
            {
                return new i(304, null, map, true);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a("socket", l1, ((s) (new r())));
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a("connection", l1, ((s) (new r())));
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(l1.c()).toString(), ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                obj2 = map;
            }
            break MISSING_BLOCK_LABEL_362;
        }
        obj = k;
        ((p.k.b.a) (obj2)).f.putAll(map);
        obj = k;
        k = new i(304, ((p.k.b.a) (obj2)).a, ((p.k.b.a) (obj2)).f, true);
        return k;
        if (i1 != 301 && i1 != 302)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        obj = k;
        l1.c((String)map.get("Location"));
        obj = k;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
_L1:
        obj = k;
        k = a(((HttpResponse) (obj1)).getEntity());
_L4:
        obj = k;
        a(SystemClock.elapsedRealtime() - l2, l1, ((byte []) (k)), statusline);
        if (i1 >= 200 && i1 <= 299)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = k;
        throw new IOException();
_L2:
        obj = k;
        k = new byte[0];
        if (true) goto _L4; else goto _L3
_L3:
        obj = k;
        k = new i(i1, k, map, false);
        return k;
        ioexception;
        obj1 = map;
_L7:
        if (obj1 != null)
        {
            i1 = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
            if (i1 == 301 || i1 == 302)
            {
                t.c("Request at %s has been redirected to %s", new Object[] {
                    l1.d(), l1.c()
                });
            } else
            {
                t.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i1), l1.c()
                });
            }
            if (obj != null)
            {
                obj = new i(i1, ((byte []) (obj)), ((Map) (obj2)), false);
                if (i1 == 401 || i1 == 403)
                {
                    a("auth", l1, ((s) (new p.k.a(((i) (obj))))));
                } else
                if (i1 == 301 || i1 == 302)
                {
                    a("redirect", l1, ((s) (new p.k.a(((i) (obj))))));
                } else
                {
                    throw new q(((i) (obj)));
                }
            } else
            {
                throw new h(null);
            }
        } else
        {
            throw new j(ioexception);
        }
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
    }

    static 
    {
        a = t.b;
    }
}
