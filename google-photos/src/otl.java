// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestContext;

public final class otl
    implements jmw
{

    private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final Map a = new HashMap();
    private final UrlRequestContext c;
    private final Executor d;
    private final jnm e = null;
    private final k f = null;
    private final int g = 8000;
    private final int h = 8000;
    private final BlockingQueue i;
    private UrlRequest j;
    private String k;
    private otm l;

    public otl(UrlRequestContext urlrequestcontext, Executor executor, jnm jnm, k k1, int i1, int j1, BlockingQueue blockingqueue)
    {
        c = (UrlRequestContext)p.a(urlrequestcontext);
        d = (Executor)p.a(executor);
        p.b(true, "Connection timeout can't be 0");
        p.b(true, "Read timeout can't be 0");
        i = blockingqueue;
    }

    static k a(otl otl1)
    {
        return otl1.f;
    }

    static Pattern b()
    {
        return b;
    }

    static jnm b(otl otl1)
    {
        return otl1.e;
    }

    static BlockingQueue c(otl otl1)
    {
        return otl1.i;
    }

    static int d(otl otl1)
    {
        return otl1.h;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        p.a("CronetDataSource.read");
        if (l == null || !l.a())
        {
            a();
            throw new jmx("Connection closed", null);
        }
        break MISSING_BLOCK_LABEL_43;
        abyte0;
        p.b();
        throw abyte0;
        i1 = otm.a(l, abyte0, i1, j1);
        p.b();
        return i1;
    }

    public final long a(jms jms1)
    {
        p.a("CronetDataSource.open");
        if (l != null)
        {
            throw new jmx("Connection already open", jms1);
        }
        break MISSING_BLOCK_LABEL_29;
        jms1;
        p.b();
        throw jms1;
        k = jms1.a.toString();
        l = new otm(this, jms1);
        j = c.a(k, l, d);
        l.a(j);
        UrlRequest urlrequest = j;
        if (jms1.c != 0L || jms1.d != -1L)
        {
            StringBuilder stringbuilder = new StringBuilder();
            long l1 = jms1.c;
            stringbuilder.append((new StringBuilder(27)).append("bytes=").append(l1).append("-").toString());
            if (jms1.d != -1L)
            {
                stringbuilder.append((jms1.c + jms1.d) - 1L);
            }
            urlrequest.a("Range", stringbuilder.toString());
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); j.a((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (jms1.b != null)
        {
            if (!a.containsKey("Content-Type"))
            {
                throw new otq("POST requests must set a Content-Type header", jms1);
            }
            j.a(new otk(jms1.b), d);
        }
        j.a();
        Object obj;
        try
        {
            obj = l;
            long l2 = g;
            TimeUnit timeunit = TimeUnit.MILLISECONDS;
            ((otm) (obj)).a.await(l2, timeunit);
            if (((otm) (obj)).b != null)
            {
                throw ((otm) (obj)).b;
            }
            break MISSING_BLOCK_LABEL_377;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw new jmx("Connection timeout exception", jms1);
        long l3 = ((otm) (obj)).c;
        p.b();
        return l3;
    }

    public final void a()
    {
        p.a("CronetDataSource.close");
        if (j != null)
        {
            j.c();
            j = null;
        }
        if (l != null)
        {
            otm.a(l);
            l = null;
        }
        k = null;
        p.b();
        return;
        Exception exception;
        exception;
        p.b();
        throw exception;
    }

}
