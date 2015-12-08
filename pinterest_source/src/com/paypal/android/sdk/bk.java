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
//            bf, bg, az, aM, 
//            aQ, bu, aK, bv, 
//            aL, bn, bs, aN, 
//            b, bo, c, d, 
//            bl, bm, aV

public class bk extends bf
{

    private static final String a = com/paypal/android/sdk/bk.getSimpleName();
    private final b b;
    private final String c;
    private final bv d;
    private final aQ e;
    private final aQ f;
    private final c g;
    private final ScheduledExecutorService h = Executors.newSingleThreadScheduledExecutor();
    private final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();

    public bk(b b1, String s, c c1, bv bv1, String s1, String s2, boolean flag)
    {
        boolean flag1 = true;
        super();
        b = b1;
        c = s;
        g = c1;
        d = bv1;
        b1 = bg.a();
        boolean flag2 = az.d(s);
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
        e = aM.a(flag, flag1, s1);
        e.a(b1);
        f = aM.a(false, false, s2);
        f.a(b1);
    }

    static bv a(bk bk1)
    {
        return bk1.d;
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

    static void a(bk bk1, bu bu1, IOException ioexception)
    {
        (new StringBuilder()).append(bu1.o()).append(" failure.");
        if (ioexception instanceof HttpResponseException)
        {
            int j = ((HttpResponseException)ioexception).getStatusCode();
            Log.e("paypal.sdk", (new StringBuilder("request failure with http statusCode:")).append(j).append(",exception:").append(ioexception.toString()).toString());
            a(bu1, j);
            if (bu1.r())
            {
                bu1.b(aK.a.toString(), (new StringBuilder()).append(j).append(" http response received.  Response not parsable.").toString());
            }
        } else
        {
            bu1.a(new aL(aK.b, ioexception));
        }
        Log.e("paypal.sdk", (new StringBuilder("request failed with server response:")).append(bu1.h()).toString());
        bk1.d.a(bu1);
    }

    static void a(bk bk1, bu bu1, String s, aQ aq, aV av)
    {
        bk1.a(bu1, s, aq, av);
    }

    private void a(bu bu1, String s, aQ aq, aV av)
    {
        switch (bn.a[bu1.i().b().ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder()).append(bu1.i().b()).append(" not supported.").toString());

        case 1: // '\001'
            aq.a(b.f(), a(s, bu1.g()), a(bu1, null), av);
            return;

        case 2: // '\002'
            String s1 = bu1.g();
            StringEntity stringentity = new StringEntity(s1, Charset.forName("UTF-8").name());
            aq.a(b.f(), s, a(bu1, s1), stringentity, av);
            return;

        case 3: // '\003'
            e.b(b.f(), a(s, bu1.g()), a(bu1, null), new bo(this, bu1, (byte)0));
            break;
        }
    }

    private Header[] a(bu bu1, String s)
    {
        ArrayList arraylist = new ArrayList();
        java.util.Map.Entry entry;
        for (Iterator iterator = bu1.j().entrySet().iterator(); iterator.hasNext(); arraylist.add(new BasicHeader((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        int j;
        int k;
        if (s != null)
        {
            try
            {
                arraylist.add(com.paypal.android.sdk.d.a(g.c(), arraylist, s));
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
            if (bu1.a())
            {
                (new StringBuilder()).append(bu1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            } else
            {
                (new StringBuilder()).append(bu1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            }
            j++;
        }
        return s;
    }

    static String b(bk bk1)
    {
        return bk1.c;
    }

    static c c(bk bk1)
    {
        return bk1.g;
    }

    static String c()
    {
        return a;
    }

    static aQ d(bk bk1)
    {
        return bk1.e;
    }

    static aQ e(bk bk1)
    {
        return bk1.f;
    }

    static ConcurrentLinkedQueue f(bk bk1)
    {
        return bk1.i;
    }

    final void a()
    {
        e.a(b.f());
        f.a(b.f());
    }

    final void b()
    {
        e.a().getConnectionManager().closeIdleConnections(1L, TimeUnit.MILLISECONDS);
        f.a().getConnectionManager().closeIdleConnections(1L, TimeUnit.MILLISECONDS);
    }

    public final boolean b(bu bu1)
    {
        String s;
        if (!b.a())
        {
            bu1.a(new aL(aK.b.toString()));
            return false;
        }
        bu.l();
        s = bu1.a(bu1.i());
        int j;
        if (bu1.a())
        {
            (new StringBuilder()).append(bu1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(bu1.o()).append(" request: ").append(bu1.g());
        } else
        {
            (new StringBuilder()).append(bu1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(bu1.o()).append(" request: ").append(bu1.g());
        }
        if (!bu1.a()) goto _L2; else goto _L1
_L1:
        i.offer(new bl(this, bu1, s));
        j = (new Random()).nextInt(190) + 10;
        (new StringBuilder("Delaying tracking execution for ")).append(j).append(" seconds");
        h.schedule(new bm(this), j, TimeUnit.SECONDS);
_L4:
        return true;
_L2:
        try
        {
            a(bu1, s, e, new bo(this, bu1, (byte)0));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            bu1.a(new aL(aK.d, unsupportedencodingexception));
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
