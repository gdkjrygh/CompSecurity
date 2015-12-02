// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android_src.mms.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

// Referenced classes of package android_src.mms.transaction:
//            k, x, w, c

public abstract class r extends k
{

    private final int a;
    protected Context b;
    protected String c;
    protected x d;
    protected w e;

    public r(Context context, int i, w w1)
    {
        b = context;
        d = new x();
        a = i;
        e = w1;
    }

    private void a(String s, w w1)
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)b.getSystemService("connectivity");
        if (w1.d())
        {
            int i = b(w1.b());
            if (i == -1)
            {
                throw new IOException((new StringBuilder()).append("Cannot establish route for ").append(s).append(": Unknown host").toString());
            }
            if (!connectivitymanager.requestRouteToHost(2, i))
            {
                throw new IOException((new StringBuilder()).append("Cannot establish route to proxy ").append(i).toString());
            }
        } else
        {
            int j = b(Uri.parse(s).getHost());
            if (j == -1)
            {
                throw new IOException((new StringBuilder()).append("Cannot establish route for ").append(s).append(": Unknown host").toString());
            }
            if (!connectivitymanager.requestRouteToHost(2, j))
            {
                throw new IOException((new StringBuilder()).append("Cannot establish route to ").append(j).append(" for ").append(s).toString());
            }
        }
    }

    public static int b(String s)
    {
        byte byte0;
        byte byte1;
        byte byte2;
        try
        {
            s = InetAddress.getByName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        s = s.getAddress();
        byte0 = s[3];
        byte1 = s[2];
        byte2 = s[1];
        return s[0] & 0xff | ((byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8);
    }

    public abstract void a();

    public void a(w w1)
    {
        e = w1;
    }

    public boolean a(r r1)
    {
        return getClass().equals(r1.getClass()) && c.equals(r1.c);
    }

    protected byte[] a(long l, byte abyte0[])
    {
        return a(l, abyte0, e.a());
    }

    protected byte[] a(long l, byte abyte0[], String s)
    {
        if (abyte0 == null)
        {
            throw new d();
        } else
        {
            a(s, e);
            return android_src.mms.transaction.c.a(b, l, s, abyte0, 1, e.d(), e.b(), e.c());
        }
    }

    protected byte[] a(String s)
    {
        a(s, e);
        return android_src.mms.transaction.c.a(b, -1L, s, null, 2, e.d(), e.b(), e.c());
    }

    protected byte[] a(byte abyte0[])
    {
        return a(-1L, abyte0, e.a());
    }

    protected byte[] a(byte abyte0[], String s)
    {
        return a(-1L, abyte0, s);
    }

    public abstract int b();

    public x d()
    {
        return d;
    }

    public int e()
    {
        return a;
    }

    public w f()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append(": serviceId=").append(a).toString();
    }
}
