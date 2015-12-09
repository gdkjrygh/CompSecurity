// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.paypal.android.sdk:
//            dl, dm, cj, at, 
//            ay, dw, aq, dx, 
//            as, dq, du, au, 
//            cn, dr, ef, gd, 
//            bi, bj, bd

public class dp extends dl
{

    private static final String a = com/paypal/android/sdk/dp.getSimpleName();
    private final cn b;
    private final String c;
    private final dx d;
    private final ay e;
    private final ay f;
    private final ef g;
    private final ScheduledExecutorService h = Executors.newSingleThreadScheduledExecutor();
    private final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();

    public dp(cn cn1, String s, ef ef1, dx dx1, int j, String s1, String s2, 
            boolean flag)
    {
        boolean flag1 = true;
        super();
        b = cn1;
        c = s;
        g = ef1;
        d = dx1;
        cn1 = dm.a();
        boolean flag2 = cj.d(s);
        if (flag2 && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2)
        {
            flag1 = false;
        }
        e = at.a(0x15f90, flag, flag1, s1);
        e.a(cn1);
        f = at.a(0x15f90, false, false, s2);
        f.a(cn1);
    }

    static dx a(dp dp1)
    {
        return dp1.d;
    }

    private static String a(String s, String s1)
    {
        String s2 = s;
        if (s1 != null)
        {
            s2 = s;
            if (!s.endsWith("/"))
            {
                s2 = (new StringBuilder()).append(s).append("/").toString();
            }
            s2 = (new StringBuilder()).append(s2).append(s1).toString();
        }
        return s2;
    }

    static void a(dp dp1, dw dw1, IOException ioexception)
    {
        (new StringBuilder()).append(dw1.o()).append(" failure.");
        if (ioexception instanceof HttpResponseException)
        {
            int j = ((HttpResponseException)ioexception).getStatusCode();
            Log.e("paypal.sdk", (new StringBuilder("request failure with http statusCode:")).append(j).append(",exception:").append(ioexception.toString()).toString());
            a(dw1, j);
            if (dw1.r())
            {
                dw1.a(aq.a.toString(), (new StringBuilder()).append(j).append(" http response received.  Response not parsable.").toString(), null);
            }
        } else
        {
            dw1.a(new as(aq.b, ioexception));
        }
        Log.e("paypal.sdk", (new StringBuilder("request failed with server response:")).append(dw1.h()).toString());
        dp1.d.a(dw1);
    }

    static void a(dp dp1, dw dw1, String s, ay ay1, bd bd)
    {
        dp1.a(dw1, s, ay1, bd);
    }

    private void a(dw dw1, String s, ay ay1, bd bd)
    {
        switch (dq.a[dw1.i().b().ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder()).append(dw1.i().b()).append(" not supported.").toString());

        case 1: // '\001'
            ay1.a(b.f(), a(s, dw1.g()), a(dw1, null), null, bd);
            return;

        case 2: // '\002'
            String s1 = dw1.g();
            StringEntity stringentity = new StringEntity(s1, Charset.forName("UTF-8").name());
            ay1.a(b.f(), s, a(dw1, s1), stringentity, null, bd);
            return;

        case 3: // '\003'
            e.a(b.f(), a(s, dw1.g()), a(dw1, null), new dr(this, dw1, (byte)0));
            break;
        }
    }

    private Header[] a(dw dw1, String s)
    {
        ArrayList arraylist = new ArrayList();
        java.util.Map.Entry entry;
        for (Iterator iterator = dw1.j().entrySet().iterator(); iterator.hasNext(); arraylist.add(new BasicHeader((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        int j;
        int k;
        if (s != null)
        {
            try
            {
                arraylist.add(gd.a(g.c(), arraylist, s));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        s = (Header[])arraylist.toArray(new Header[0]);
        k = s.length;
        j = 0;
        while (j < k) 
        {
            Header header = s[j];
            if (dw1.a())
            {
                (new StringBuilder()).append(dw1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            } else
            {
                (new StringBuilder()).append(dw1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            }
            j++;
        }
        return s;
    }

    static String b(dp dp1)
    {
        return dp1.c;
    }

    static ef c(dp dp1)
    {
        return dp1.g;
    }

    static String c()
    {
        return a;
    }

    static ay d(dp dp1)
    {
        return dp1.e;
    }

    static ay e(dp dp1)
    {
        return dp1.f;
    }

    static ConcurrentLinkedQueue f(dp dp1)
    {
        return dp1.i;
    }

    final void a()
    {
        e.a(b.f(), true);
        f.a(b.f(), true);
    }

    final void b()
    {
        e.a().getConnectionManager().closeIdleConnections(1L, TimeUnit.MILLISECONDS);
        f.a().getConnectionManager().closeIdleConnections(1L, TimeUnit.MILLISECONDS);
    }

    public final boolean b(dw dw1)
    {
        String s;
        if (!b.a())
        {
            dw1.a(new as(aq.b.toString()));
            return false;
        }
        dw.l();
        s = dw1.a(dw1.i());
        int j;
        if (dw1.a())
        {
            (new StringBuilder()).append(dw1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(dw1.o()).append(" request: ").append(dw1.g());
        } else
        {
            (new StringBuilder()).append(dw1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(dw1.o()).append(" request: ").append(dw1.g());
        }
        if (!dw1.a()) goto _L2; else goto _L1
_L1:
        i.offer(new bi(this, dw1, s));
        j = (new Random()).nextInt(190) + 10;
        (new StringBuilder("Delaying tracking execution for ")).append(j).append(" seconds");
        h.schedule(new bj(this), j, TimeUnit.SECONDS);
_L4:
        return true;
_L2:
        try
        {
            a(dw1, s, e, new dr(this, dw1, (byte)0));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            dw1.a(new as(aq.d, unsupportedencodingexception));
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
