// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import android.os.SystemClock;
import com.google.android.m4b.maps.a.e;
import com.google.android.m4b.maps.a.g;
import com.google.android.m4b.maps.a.h;
import com.google.android.m4b.maps.a.i;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.o;
import com.google.android.m4b.maps.a.p;
import com.google.android.m4b.maps.a.q;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.a.s;
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

// Referenced classes of package com.google.android.m4b.maps.am:
//            b, h, e

public final class a
    implements e
{

    private static boolean a;
    private static int b = 3000;
    private static int c = 4096;
    private com.google.android.m4b.maps.am.e d;
    private b e;

    public a(com.google.android.m4b.maps.am.e e1)
    {
        this(e1, new b(c));
    }

    private a(com.google.android.m4b.maps.am.e e1, b b1)
    {
        d = e1;
        e = b1;
    }

    private static Map a(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int j = 0; j < aheader.length; j++)
        {
            treemap.put(aheader[j].getName(), aheader[j].getValue());
        }

        return treemap;
    }

    private static void a(String s1, k k1, r r1)
    {
        o o1;
        int j;
        o1 = k1.j;
        j = k1.j.a;
        o1.b = o1.b + 1;
        o1.a = (int)((float)o1.a + (float)o1.a * o1.d);
        boolean flag;
        if (o1.b <= o1.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            try
            {
                throw r1;
            }
            // Misplaced declaration of an exception variable
            catch (r r1)
            {
                k1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                    s1, Integer.valueOf(j)
                }));
            }
            throw r1;
        } else
        {
            k1.a(String.format("%s-retry [timeout=%s]", new Object[] {
                s1, Integer.valueOf(j)
            }));
            return;
        }
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        com.google.android.m4b.maps.am.h h1;
        h1 = new com.google.android.m4b.maps.am.h(e, (int)httpentity.getContentLength());
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
        int j;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            s.a("Error occured when calling consumingContent", new Object[0]);
        }
        e.a(((byte []) (obj)));
        h1.close();
        throw exception;
        obj = exception;
        abyte0 = e.a(1024);
_L2:
        obj = abyte0;
        j = inputstream.read(abyte0);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        h1.write(abyte0, 0, j);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = h1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            s.a("Error occured when calling consumingContent", new Object[0]);
        }
        e.a(abyte0);
        h1.close();
        return abyte1;
    }

    public final h a(k k1)
    {
        long l = SystemClock.elapsedRealtime();
_L7:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj;
        Object obj1;
        obj = new HashMap();
        obj1 = k1.k;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (((com.google.android.m4b.maps.a.b.a) (obj1)).b != null)
        {
            ((Map) (obj)).put("If-None-Match", ((com.google.android.m4b.maps.a.b.a) (obj1)).b);
        }
        if (((com.google.android.m4b.maps.a.b.a) (obj1)).d > 0L)
        {
            ((Map) (obj)).put("If-Modified-Since", DateUtils.formatDate(new Date(((com.google.android.m4b.maps.a.b.a) (obj1)).d)));
        }
        obj1 = d.a(k1, ((Map) (obj)));
        obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int j = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (j != 304)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj = obj4;
        obj2 = k1.k;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj = obj4;
        return new h(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        ((com.google.android.m4b.maps.a.b.a) (obj2)).g.putAll(((Map) (obj4)));
        obj = obj4;
        return new h(304, ((com.google.android.m4b.maps.a.b.a) (obj2)).a, ((com.google.android.m4b.maps.a.b.a) (obj2)).g, true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = a(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L8:
        long l1 = SystemClock.elapsedRealtime() - l;
        if (!a && l1 <= (long)b) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj2 = Integer.valueOf(obj.length);
_L9:
        s.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            k1, Long.valueOf(l1), obj2, Integer.valueOf(((StatusLine) (obj3)).getStatusCode()), Integer.valueOf(k1.j.b)
        });
          goto _L4
_L11:
        throw new IOException();
        obj;
        a("socket", k1, ((r) (new q())));
          goto _L7
_L2:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L8
_L6:
        obj2 = "null";
          goto _L9
_L12:
        obj2 = new h(j, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
        return ((h) (obj2));
        obj;
        a("connection", k1, ((r) (new q())));
          goto _L7
        obj;
        throw new RuntimeException((new StringBuilder("Bad URL ")).append(k1.b).toString(), ((Throwable) (obj)));
        obj1;
        obj3 = null;
        obj = obj2;
        obj2 = obj4;
_L10:
        if (obj2 != null)
        {
            j = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            s.c("Unexpected response code %d for %s", new Object[] {
                Integer.valueOf(j), k1.b
            });
            if (obj3 != null)
            {
                obj = new h(j, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l);
                if (j == 401 || j == 403)
                {
                    a("auth", k1, ((r) (new com.google.android.m4b.maps.a.a(((h) (obj))))));
                } else
                {
                    throw new p(((h) (obj)));
                }
            } else
            {
                throw new g((byte)0);
            }
        } else
        {
            throw new i(((Throwable) (obj1)));
        }
          goto _L7
        obj4;
        obj3 = null;
        obj2 = obj1;
        obj1 = obj4;
          goto _L10
        IOException ioexception;
        ioexception;
        obj2 = obj1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj));
        obj = obj4;
          goto _L10
_L4:
        if (j >= 200 && j <= 299) goto _L12; else goto _L11
    }

    static 
    {
        a = s.a;
    }
}
