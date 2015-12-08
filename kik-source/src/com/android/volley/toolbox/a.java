// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.t;
import com.android.volley.u;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
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
//            b, s, g

public final class a
    implements h
{

    protected static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    protected final g b;
    protected final b c;

    public a(g g1)
    {
        this(g1, new b(e));
    }

    private a(g g1, b b1)
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
_L3:
        Object obj;
        byte abyte0[];
        HttpResponse httpresponse;
        Object obj1;
        HttpResponse httpresponse1;
        Object obj2;
        httpresponse1 = null;
        obj1 = null;
        obj2 = new HashMap();
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        HashMap hashmap = new HashMap();
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        Object obj3 = n1.f();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        if (((com.android.volley.b.a) (obj3)).b == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        hashmap.put("If-None-Match", ((com.android.volley.b.a) (obj3)).b);
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        if (((com.android.volley.b.a) (obj3)).c <= 0L)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        hashmap.put("If-Modified-Since", DateUtils.formatDate(new Date(((com.android.volley.b.a) (obj3)).c)));
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        httpresponse1 = b.a(n1, hashmap);
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        obj3 = httpresponse1.getStatusLine();
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        obj2 = a(httpresponse1.getAllHeaders());
        if (i != 304) goto _L2; else goto _L1
_L1:
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        byte abyte1[];
        long l2;
        try
        {
            return new k(304, n1.f().a, ((Map) (obj2)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("socket", n1, ((w) (new v())));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("connection", n1, ((w) (new v())));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Bad URL ")).append(n1.d()).toString(), ((Throwable) (obj)));
        }
        catch (IOException ioexception)
        {
            if (httpresponse != null)
            {
                int i1 = httpresponse.getStatusLine().getStatusCode();
                x.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i1), n1.d()
                });
                if (abyte0 != null)
                {
                    obj = new k(i1, abyte0, ((Map) (obj)), false);
                    if (i1 == 401 || i1 == 403)
                    {
                        a("auth", n1, ((w) (new com.android.volley.a(((k) (obj))))));
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
                throw new l(ioexception);
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        obj = obj2;
        abyte0 = ((byte []) (obj1));
        httpresponse = httpresponse1;
        abyte1 = a(httpresponse1.getEntity());
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        l2 = SystemClock.elapsedRealtime() - l1;
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        if (a) goto _L5; else goto _L4
_L4:
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        if (l2 <= (long)d) goto _L6; else goto _L5
_L5:
        if (abyte1 == null) goto _L8; else goto _L7
_L7:
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        obj1 = Integer.valueOf(abyte1.length);
_L10:
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        x.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            n1, Long.valueOf(l2), obj1, Integer.valueOf(((StatusLine) (obj3)).getStatusCode()), Integer.valueOf(n1.q().b())
        });
_L6:
        if (i == 200 || i == 204)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        throw new IOException();
_L8:
        obj1 = "null";
        if (true) goto _L10; else goto _L9
_L9:
        obj = obj2;
        abyte0 = abyte1;
        httpresponse = httpresponse1;
        obj1 = new k(i, abyte1, ((Map) (obj2)), false);
        return ((k) (obj1));
    }

    static 
    {
        a = x.b;
    }
}
