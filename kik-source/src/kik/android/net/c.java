// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net;

import android.os.SystemClock;
import com.android.volley.a;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.t;
import com.android.volley.toolbox.b;
import com.android.volley.toolbox.g;
import com.android.volley.toolbox.s;
import com.android.volley.u;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.kik.cache.au;
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

public final class c
    implements h
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final g b;
    protected final b c;

    public c(g g1)
    {
        this(g1, new b(e));
    }

    private c(g g1, b b1)
    {
        b = g1;
        c = b1;
    }

    private static Map a(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aheader.length; i++)
        {
            hashmap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return hashmap;
    }

    private static void a(String s1, n n1, w w1)
    {
        t t1 = n1.q();
        int i = n1.p();
        try
        {
            t1.a(w1);
        }
        // Misplaced declaration of an exception variable
        catch (w w1)
        {
            n1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s1, Integer.valueOf(i)
            }));
            throw w1;
        }
        n1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s1, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        s s1;
        s1 = new s(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new u();
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
            x.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        s1.close();
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
        s1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = s1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            x.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        s1.close();
        return abyte1;
    }

    public final k a(n n1)
    {
        long l1 = SystemClock.elapsedRealtime();
_L13:
        Object obj3 = new HashMap();
        Object obj;
        Object obj1;
        obj = new HashMap();
        obj1 = n1.f();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (((com.android.volley.b.a) (obj1)).b != null)
        {
            ((Map) (obj)).put("If-None-Match", ((com.android.volley.b.a) (obj1)).b);
        }
        if (((com.android.volley.b.a) (obj1)).c > 0L)
        {
            ((Map) (obj)).put("If-Modified-Since", DateUtils.formatDate(new Date(((com.android.volley.b.a) (obj1)).c)));
        }
        obj = b.a(n1, ((Map) (obj)));
        Object obj2;
        StatusLine statusline;
        int i;
        statusline = ((HttpResponse) (obj)).getStatusLine();
        i = statusline.getStatusCode();
        obj2 = a(((HttpResponse) (obj)).getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        if (n1.f() != null) goto _L4; else goto _L3
_L3:
        byte abyte0[] = null;
_L6:
        return new k(304, abyte0, ((Map) (obj2)), true);
_L4:
        abyte0 = n1.f().a;
        if (true) goto _L6; else goto _L5
_L5:
        if (n1 instanceof au)
        {
            abyte0 = (String)((Map) (obj2)).get("Location");
            ((au)n1).a_(abyte0);
        }
_L17:
        abyte0 = ((HttpResponse) (obj)).getEntity();
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        abyte0 = a(((HttpResponse) (obj)).getEntity());
_L14:
        long l2 = SystemClock.elapsedRealtime() - l1;
        if (!a && l2 <= (long)d) goto _L10; else goto _L9
_L9:
        if (abyte0 == null) goto _L12; else goto _L11
_L11:
        obj3 = Integer.valueOf(abyte0.length);
_L15:
        x.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            n1, Long.valueOf(l2), obj3, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(n1.q().b())
        });
          goto _L10
_L18:
        throw new IOException();
        obj;
        a("socket", n1, ((w) (new v())));
          goto _L13
        abyte0;
        throw new w(abyte0);
        obj;
        a("connection", n1, ((w) (new v())));
          goto _L13
_L8:
        abyte0 = new byte[0];
          goto _L14
_L12:
        obj3 = "null";
          goto _L15
_L19:
        obj3 = new k(i, abyte0, ((Map) (obj2)), false);
        return ((k) (obj3));
        obj;
        throw new RuntimeException((new StringBuilder("Bad URL ")).append(n1.d()).toString(), ((Throwable) (obj)));
        obj;
        obj2 = null;
        abyte0 = null;
_L16:
        if (obj2 != null)
        {
            i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            if (i == 301 || i == 302 && (n1 instanceof au))
            {
                x.c("Request at %s has been redirected to %s", new Object[] {
                    ((au)n1).t(), n1.d()
                });
            } else
            {
                x.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), n1.d()
                });
            }
            if (abyte0 != null)
            {
                obj = new k(i, abyte0, ((Map) (obj3)), false);
                if (i == 401 || i == 403)
                {
                    a("auth", n1, ((w) (new a(((k) (obj))))));
                } else
                if (i == 301 || i == 302 && (n1 instanceof au))
                {
                    a("redirect", n1, ((w) (new a(((k) (obj))))));
                } else
                {
                    throw new u(((k) (obj)));
                }
            } else
            {
                throw new j((byte)0);
            }
        } else
        {
            throw new l(((Throwable) (obj)));
        }
          goto _L13
        IOException ioexception1;
        ioexception1;
        abyte0 = null;
        obj2 = obj;
        obj = ioexception1;
          goto _L16
        ioexception1;
        obj3 = obj2;
        abyte0 = null;
        obj2 = obj;
        obj = ioexception1;
          goto _L16
        IOException ioexception;
        ioexception;
        Object obj4 = obj;
        obj = ioexception;
        ioexception = ((IOException) (obj2));
        obj2 = obj4;
          goto _L16
_L2:
        if (i != 301 && i != 302) goto _L17; else goto _L5
_L10:
        if (i >= 200 && i <= 299) goto _L19; else goto _L18
    }

    static 
    {
        a = x.b;
    }
}
