// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, ab, ac, u, 
//            c, h, w, z, 
//            j

public final class x extends af
{
    static interface a
    {

        public abstract void a(int i1, Throwable throwable, byte abyte0[]);
    }

    private static final class b
        implements Runnable
    {

        private final a a;
        private final int b;
        private final Throwable c;
        private final byte d[];

        public final void run()
        {
            a.a(b, c, d);
        }

        private b(a a1, int i1, Throwable throwable, byte abyte0[])
        {
            a = a1;
            b = i1;
            c = throwable;
            d = abyte0;
        }

        b(a a1, int i1, Throwable throwable, byte abyte0[], byte byte0)
        {
            this(a1, i1, throwable, abyte0);
        }
    }

    private final class c
        implements Runnable
    {

        final x a;
        private final URL b;
        private final byte c[];
        private final a d;

        public final void run()
        {
            a.d();
            Object obj;
            Object obj2;
            obj2 = a.j().a(c);
            obj = b.openConnection();
            if (!(obj instanceof HttpURLConnection))
            {
                throw new IOException("Failed to obtain HTTP connection");
            }
              goto _L1
            obj2;
            Object obj1;
            int i1;
            i1 = 0;
            obj = null;
            obj1 = null;
_L5:
            if (obj != null)
            {
                try
                {
                    ((OutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    a.l().a.a("Error closing HTTP compressed POST connection output stream", obj);
                }
            }
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            a.k().a(new b(d, i1, ((Throwable) (obj2)), null, (byte)0));
            return;
_L1:
            obj = (HttpURLConnection)obj;
            ((HttpURLConnection) (obj)).setDefaultUseCaches(false);
            com.google.android.gms.measurement.internal.j.s();
            ((HttpURLConnection) (obj)).setConnectTimeout(60000);
            com.google.android.gms.measurement.internal.j.t();
            ((HttpURLConnection) (obj)).setReadTimeout(61000);
            ((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
            ((HttpURLConnection) (obj)).setDoInput(true);
            Object obj4;
            try
            {
                ((HttpURLConnection) (obj)).setDoOutput(true);
                ((HttpURLConnection) (obj)).addRequestProperty("Content-Encoding", "gzip");
                ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(obj2.length);
                ((HttpURLConnection) (obj)).connect();
                obj1 = ((HttpURLConnection) (obj)).getOutputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                i1 = 0;
                obj1 = obj;
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                i1 = 0;
                Object obj3 = null;
                obj2 = obj;
                obj = obj3;
                continue; /* Loop/switch isn't completed */
            }
            try
            {
_L2:
                ((OutputStream) (obj1)).write(((byte []) (obj2)));
                ((OutputStream) (obj1)).close();
            }
            catch (IOException ioexception)
            {
                i1 = 0;
                obj2 = obj;
                obj = obj1;
                obj1 = obj2;
                obj2 = ioexception;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                i1 = 0;
                obj2 = obj;
                obj = obj1;
                obj1 = exception;
                continue; /* Loop/switch isn't completed */
            }
            i1 = ((HttpURLConnection) (obj)).getResponseCode();
            obj1 = x.a(((HttpURLConnection) (obj)));
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            a.k().a(new b(d, i1, null, ((byte []) (obj1)), (byte)0));
            return;
            obj1;
            i1 = 0;
            obj = null;
            obj2 = null;
_L3:
            if (obj != null)
            {
                try
                {
                    ((OutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    a.l().a.a("Error closing HTTP compressed POST connection output stream", obj);
                }
            }
            if (obj2 != null)
            {
                ((HttpURLConnection) (obj2)).disconnect();
            }
            a.k().a(new b(d, i1, null, null, (byte)0));
            throw obj1;
            obj1;
            obj4 = null;
            obj2 = obj;
            obj = obj4;
            if (true) goto _L3; else goto _L2
            obj2;
            obj1 = obj;
            obj = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public c(URL url, byte abyte0[], a a1)
        {
            a = x.this;
            super();
            b = url;
            c = abyte0;
            d = a1;
        }
    }


    public x(ac ac)
    {
        super(ac);
    }

    static byte[] a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        HttpURLConnection httpurlconnection1;
        byte abyte0[];
        abyte0 = null;
        httpurlconnection1 = abyte0;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        httpurlconnection1 = abyte0;
        httpurlconnection = httpurlconnection.getInputStream();
        httpurlconnection1 = httpurlconnection;
        abyte0 = new byte[1024];
_L2:
        httpurlconnection1 = httpurlconnection;
        int i1 = httpurlconnection.read(abyte0);
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        httpurlconnection1 = httpurlconnection;
        bytearrayoutputstream.write(abyte0, 0, i1);
        if (true) goto _L2; else goto _L1
        httpurlconnection;
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.close();
        }
        throw httpurlconnection;
_L1:
        httpurlconnection1 = httpurlconnection;
        abyte0 = bytearrayoutputstream.toByteArray();
        if (httpurlconnection != null)
        {
            httpurlconnection.close();
        }
        return abyte0;
    }

    protected final void a()
    {
    }

    public final void a(URL url, byte abyte0[], a a1)
    {
        super.e();
        t();
        u.a(url);
        u.a(abyte0);
        u.a(a1);
        ab ab1 = super.k();
        ab1.a(new c(url, abyte0, a1), ab1.a, "Task exception on network thread");
    }

    public final boolean b()
    {
        t();
        Object obj = (ConnectivityManager)super.i().getSystemService("connectivity");
        try
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            securityexception = null;
        }
        return obj != null && ((NetworkInfo) (obj)).isConnected();
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile com.google.android.gms.measurement.internal.c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }
}
