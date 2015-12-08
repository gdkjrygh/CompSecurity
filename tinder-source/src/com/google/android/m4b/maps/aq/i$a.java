// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.c.b;
import com.google.android.m4b.maps.cq.e;
import com.google.android.m4b.maps.y.p;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            i

final class b
    implements Runnable
{

    private t a;
    private a b;
    private int c;
    private i d;

    private static String a(a a1, String s)
    {
        int k = a1.j(2);
        for (int j = 0; j < k; j++)
        {
            a a2 = a1.c(2, j);
            if (a2.g(1).equals(s))
            {
                return a2.g(2);
            }
        }

        return null;
    }

    private static void a(a a1, a a2)
    {
        a a3 = new a(e.e);
        a3.a(1, a2);
        a1.a(9, a3);
    }

    public final void run()
    {
        a a1;
        int j;
        a1 = new a(e.f);
        j = 0;
_L2:
        a a2;
        if (j >= b.j(9))
        {
            break MISSING_BLOCK_LABEL_354;
        }
        a2 = b.c(9, j);
        Object obj = new af();
        ((af) (obj)).a(com.google.android.m4b.maps.bo..f.a(a2));
        a a3 = al.a(a2.e(30));
        obj = new ac(a3.d(4) - 1, a3.d(2), a3.d(3), ((af) (obj)));
        a3 = ((br)((ac) (obj)).a(com.google.android.m4b.maps.bo..f)).a;
        obj = new HttpGet(String.format("https://mapsengine.google.com/%s/maptile/maps?v=%s&authToken=%s&x=%d&y=%d&z=%d&s=", new Object[] {
            a3.g(1), p.a(a(a3, "v")), p.a(a(a3, "authToken")), Integer.valueOf(((ac) (obj)).b), Integer.valueOf(((ac) (obj)).c), Integer.valueOf(((ac) (obj)).a)
        }));
        obj = (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
        {
            byte abyte0[] = com.google.android.m4b.maps.c.b.a(((HttpResponse) (obj)).getEntity().getContent());
            a a4 = new a(e.e);
            a4.a(1, a2);
            a4.a(2, abyte0);
            a1.a(9, a4);
            break MISSING_BLOCK_LABEL_403;
        }
        try
        {
            a(a1, a2);
        }
        catch (IOException ioexception1)
        {
            long l = (long)(200D * Math.pow(2D, c));
            if (l < 60000L)
            {
                com.google.android.m4b.maps.aq.i.a(d).schedule(this, l, TimeUnit.MILLISECONDS);
                c = c + 1;
                return;
            }
            a(a1, a2);
        }
        break MISSING_BLOCK_LABEL_403;
        a1.a(1, com.google.android.m4b.maps.aq.i.a());
        try
        {
            a.a(com.google.android.m4b.maps.ac.c.b(a1));
        }
        catch (IOException ioexception)
        {
            com.google.android.m4b.maps.aq.i.a(d, a);
        }
        com.google.android.m4b.maps.aq.i.b(d, a);
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public torService(i j, t t1)
    {
        d = j;
        super();
        c = 0;
        a = t1;
        b = com.google.android.m4b.maps.aq.i.a(t1);
    }
}
