// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public class btz extends btu
{

    private static final String a = btz.getSimpleName();
    private final bsx b;
    private final String c;
    private final buk d;
    private final brl e;
    private final brl f;
    private final bus g;
    private final ScheduledExecutorService h = Executors.newSingleThreadScheduledExecutor();
    private final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();

    public btz(bsx bsx1, String s, bus bus1, buk buk1, String s1, String s2, boolean flag)
    {
        boolean flag1 = true;
        super();
        b = bsx1;
        c = s;
        g = bus1;
        d = buk1;
        bsx1 = btv.a();
        boolean flag2 = bst.d(s);
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
        e = brh.a(flag, flag1, s1);
        e.a(bsx1);
        f = brh.a(false, false, s2);
        f.a(bsx1);
    }

    static buk a(btz btz1)
    {
        return btz1.d;
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

    static void a(btz btz1, buj buj1, IOException ioexception)
    {
        (new StringBuilder()).append(buj1.o()).append(" failure.");
        if (ioexception instanceof HttpResponseException)
        {
            int j = ((HttpResponseException)ioexception).getStatusCode();
            Log.e("paypal.sdk", (new StringBuilder("request failure with http statusCode:")).append(j).append(",exception:").append(ioexception.toString()).toString());
            a(buj1, j);
            if (buj1.r())
            {
                buj1.b(brf.a.toString(), (new StringBuilder()).append(j).append(" http response received.  Response not parsable.").toString());
            }
        } else
        {
            buj1.a(new brg(brf.b, ioexception));
        }
        Log.e("paypal.sdk", (new StringBuilder("request failed with server response:")).append(buj1.h()).toString());
        btz1.d.a(buj1);
    }

    static void a(btz btz1, buj buj1, String s, brl brl1, brq brq)
    {
        btz1.a(buj1, s, brl1, brq);
    }

    private void a(buj buj1, String s, brl brl1, brq brq)
    {
        switch (buc.a[buj1.i().b().ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder()).append(buj1.i().b()).append(" not supported.").toString());

        case 1: // '\001'
            brl1.a(b.f(), a(s, buj1.g()), a(buj1, null), brq);
            return;

        case 2: // '\002'
            String s1 = buj1.g();
            StringEntity stringentity = new StringEntity(s1, Charset.forName("UTF-8").name());
            brl1.a(b.f(), s, a(buj1, s1), stringentity, brq);
            return;

        case 3: // '\003'
            e.b(b.f(), a(s, buj1.g()), a(buj1, null), new bud(this, buj1, (byte)0));
            break;
        }
    }

    private Header[] a(buj buj1, String s)
    {
        ArrayList arraylist = new ArrayList();
        java.util.Map.Entry entry;
        for (Iterator iterator = buj1.j().entrySet().iterator(); iterator.hasNext(); arraylist.add(new BasicHeader((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        int j;
        int k;
        if (s != null)
        {
            try
            {
                arraylist.add(bwq.a(g.c(), arraylist, s));
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
            if (buj1.a())
            {
                (new StringBuilder()).append(buj1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            } else
            {
                (new StringBuilder()).append(buj1.o()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            }
            j++;
        }
        return s;
    }

    static String b(btz btz1)
    {
        return btz1.c;
    }

    static bus c(btz btz1)
    {
        return btz1.g;
    }

    static String c()
    {
        return a;
    }

    static brl d(btz btz1)
    {
        return btz1.e;
    }

    static brl e(btz btz1)
    {
        return btz1.f;
    }

    static ConcurrentLinkedQueue f(btz btz1)
    {
        return btz1.i;
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

    public final boolean b(buj buj1)
    {
        String s;
        if (!b.a())
        {
            buj1.a(new brg(brf.b.toString()));
            return false;
        }
        buj.l();
        s = buj1.a(buj1.i());
        int j;
        if (buj1.a())
        {
            (new StringBuilder()).append(buj1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(buj1.o()).append(" request: ").append(buj1.g());
        } else
        {
            (new StringBuilder()).append(buj1.o()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(buj1.o()).append(" request: ").append(buj1.g());
        }
        if (!buj1.a()) goto _L2; else goto _L1
_L1:
        i.offer(new bua(this, buj1, s));
        j = (new Random()).nextInt(190) + 10;
        (new StringBuilder("Delaying tracking execution for ")).append(j).append(" seconds");
        h.schedule(new bub(this), j, TimeUnit.SECONDS);
_L4:
        return true;
_L2:
        try
        {
            a(buj1, s, e, new bud(this, buj1, (byte)0));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            buj1.a(new brg(brf.d, unsupportedencodingexception));
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
