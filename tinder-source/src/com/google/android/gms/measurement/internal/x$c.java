// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            x, h, ab, j, 
//            w

private final class d
    implements Runnable
{

    final x a;
    private final URL b;
    private final byte c[];
    private final d d;

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
        int i;
        i = 0;
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
        a.k().a(new <init>(d, i, ((Throwable) (obj2)), null, (byte)0));
        return;
_L1:
        obj = (HttpURLConnection)obj;
        ((HttpURLConnection) (obj)).setDefaultUseCaches(false);
        j.s();
        ((HttpURLConnection) (obj)).setConnectTimeout(60000);
        j.t();
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
            i = 0;
            obj1 = obj;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            i = 0;
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
            i = 0;
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
            obj2 = ioexception;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            i = 0;
            obj2 = obj;
            obj = obj1;
            obj1 = exception;
            continue; /* Loop/switch isn't completed */
        }
        i = ((HttpURLConnection) (obj)).getResponseCode();
        obj1 = x.a(((HttpURLConnection) (obj)));
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        a.k().a(new <init>(d, i, null, ((byte []) (obj1)), (byte)0));
        return;
        obj1;
        i = 0;
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
        a.k().a(new <init>(d, i, null, null, (byte)0));
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

    public (x x1, URL url, byte abyte0[],  )
    {
        a = x1;
        super();
        b = url;
        c = abyte0;
        d = ;
    }
}
