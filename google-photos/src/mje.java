// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class mje
    implements HttpUrlRequestListener
{

    final List a = new ArrayList(2);
    ata b;
    long c;
    HttpUrlRequest d;
    volatile boolean e;
    final mjd f;
    private long g;
    private long h;

    mje(mjd mjd1)
    {
        f = mjd1;
        super();
    }

    static HttpUrlRequest a(mje mje1)
    {
        return mje1.d;
    }

    static HttpUrlRequest a(mje mje1, HttpUrlRequest httpurlrequest)
    {
        mje1.d = httpurlrequest;
        return httpurlrequest;
    }

    private void a(Exception exception)
    {
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            ((mjg)a.get(i)).a(exception);
        }

    }

    static boolean a(mje mje1, boolean flag)
    {
        mje1.e = false;
        return false;
    }

    static boolean b(mje mje1)
    {
        return mje1.e;
    }

    static List c(mje mje1)
    {
        return mje1.a;
    }

    private void c(HttpUrlRequest httpurlrequest)
    {
        httpurlrequest = httpurlrequest.e();
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            ((mjg)a.get(i)).a(httpurlrequest);
            httpurlrequest = (ByteBuffer)httpurlrequest.asReadOnlyBuffer().position(0);
        }

    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        h = System.currentTimeMillis();
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        int i = 1;
        synchronized (f)
        {
            mjd.a(f).remove(b);
        }
        obj = mjd.a(httpurlrequest);
        boolean flag;
        if (obj == null && !httpurlrequest.i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = System.currentTimeMillis();
        if (flag && Log.isLoggable("ChromiumSerializer", 2))
        {
            String s = String.valueOf("Successfully completed request, url: ");
            String s2 = String.valueOf(b);
            long l = System.currentTimeMillis();
            long l2 = c;
            (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s2).length())).append(s).append(s2).append(", duration: ").append(l - l2);
        } else
        if (!flag && Log.isLoggable("ChromiumSerializer", 6) && !httpurlrequest.i())
        {
            String s1;
            int j;
            long l1;
            boolean flag1;
            if (obj == null)
            {
                i = 0;
            }
            s1 = String.valueOf("Request failed, cancelled: ");
            flag1 = httpurlrequest.i();
            if (i != 0)
            {
                l1 = -1L;
            } else
            {
                l1 = httpurlrequest.a();
            }
            if (i == 0 && httpurlrequest.e() != null)
            {
                i = httpurlrequest.e().limit();
            } else
            {
                i = -1;
            }
            j = httpurlrequest.b();
            Log.e("ChromiumSerializer", (new StringBuilder(String.valueOf(s1).length() + 93)).append(s1).append(flag1).append(", content length: ").append(l1).append(", data length: ").append(i).append(", status code").append(j).toString(), ((Throwable) (obj)));
        }
        if (flag)
        {
            c(httpurlrequest);
        } else
        {
            a(((Exception) (obj)));
        }
        if (mjd.b(f) != null)
        {
            mjd.b(f).a(httpurlrequest, c, h, g);
        }
        mjd.c(f).a(this);
        return;
        httpurlrequest;
        obj;
        JVM INSTR monitorexit ;
        throw httpurlrequest;
    }
}
