// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

public final class okk
    implements okf
{

    private final okn a;
    private final String b;
    private final HttpUrlRequestListener c = new okl(this);
    private volatile HttpUrlRequest d;
    private volatile CountDownLatch e;
    private volatile okm f;
    private volatile boolean g;
    private oky h;
    private long i;
    private boolean j;

    public okk(okn okn1, String s)
    {
        a = (okn)p.b(okn1, "httpUrlRequestFactory cannot be null");
        b = (String)p.a(s, "url cannot be empty");
        i = -1L;
    }

    static okm a(okk okk1, okm okm1)
    {
        okk1.f = okm1;
        return okm1;
    }

    static HttpUrlRequest a(okk okk1)
    {
        return okk1.d;
    }

    private boolean a(long l)
    {
        if (i != l)
        {
            b();
            okx okx1 = new okx();
            h = okx1.e;
            d = a.a(b, okx1.f, c);
            if (l != 0L)
            {
                d.a(l);
            }
            i = l;
            e = new CountDownLatch(1);
            g = false;
            d.g();
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(okk okk1, boolean flag)
    {
        okk1.g = true;
        return true;
    }

    private int b(long l, ByteBuffer bytebuffer)
    {
        a(l);
        int k;
        try
        {
            e.await();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new IOException("Interrupted while waiting for request start", bytebuffer);
        }
        c();
        k = bytebuffer.position();
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                break;
            }
            int i1;
            try
            {
                i1 = h.read(bytebuffer);
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new oko("Exception reading from network request channel", bytebuffer);
            }
            if (i1 == -1)
            {
                break;
            }
            i = i + (long)i1;
        } while (true);
        return bytebuffer.position() - k;
    }

    static CountDownLatch b(okk okk1)
    {
        return okk1.e;
    }

    private void b()
    {
        if (d != null)
        {
            d.h();
            d = null;
        }
        p.a(h);
        i = -1L;
        f = null;
    }

    private void c()
    {
        if (f != null)
        {
            if (f.b != null)
            {
                int k = f.a;
                throw new oko((new StringBuilder(55)).append("Exception starting connection, status code: ").append(k).toString(), f.b);
            } else
            {
                int l = f.a;
                throw new oko((new StringBuilder(51)).append("Error starting connection, status code: ").append(l).toString());
            }
        } else
        {
            return;
        }
    }

    public final int a(long l, ByteBuffer bytebuffer)
    {
        boolean flag1 = false;
        int k;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "cannot call fetchBytes() after it threw an exception");
        flag = flag1;
        if (l >= 0L)
        {
            flag = true;
        }
        p.a(flag, "startOffset must be non-negative");
        p.b(bytebuffer, "buffer must not be null");
        k = b(l, bytebuffer);
        return k;
        bytebuffer;
        j = true;
        throw bytebuffer;
    }

    public final void a()
    {
        b();
    }

    public final boolean a(long l, long l1)
    {
        a(l);
        if (g)
        {
            c();
        }
        return h.a((int)l1);
    }

    public final void close()
    {
        b();
    }
}
