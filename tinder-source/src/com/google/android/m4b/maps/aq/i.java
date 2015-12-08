// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.o;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.ay.v;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.c.b;
import com.google.android.m4b.maps.cq.e;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.y.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public final class i
    implements u
{
    final class a
        implements Runnable
    {

        private t a;
        private com.google.android.m4b.maps.ac.a b;
        private int c;
        private i d;

        private static String a(com.google.android.m4b.maps.ac.a a1, String s)
        {
            int k = a1.j(2);
            for (int j = 0; j < k; j++)
            {
                com.google.android.m4b.maps.ac.a a2 = a1.c(2, j);
                if (a2.g(1).equals(s))
                {
                    return a2.g(2);
                }
            }

            return null;
        }

        private static void a(com.google.android.m4b.maps.ac.a a1, com.google.android.m4b.maps.ac.a a2)
        {
            com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(e.e);
            a3.a(1, a2);
            a1.a(9, a3);
        }

        public final void run()
        {
            com.google.android.m4b.maps.ac.a a1;
            int j;
            a1 = new com.google.android.m4b.maps.ac.a(e.f);
            j = 0;
_L2:
            com.google.android.m4b.maps.ac.a a2;
            if (j >= b.j(9))
            {
                break MISSING_BLOCK_LABEL_354;
            }
            a2 = b.c(9, j);
            Object obj = new af();
            ((af) (obj)).a(com.google.android.m4b.maps.bo.bd.a.f.a(a2));
            com.google.android.m4b.maps.ac.a a3 = al.a(a2.e(30));
            obj = new ac(a3.d(4) - 1, a3.d(2), a3.d(3), ((af) (obj)));
            a3 = ((br)((ac) (obj)).a(com.google.android.m4b.maps.bo.bd.a.f)).a;
            obj = new HttpGet(String.format("https://mapsengine.google.com/%s/maptile/maps?v=%s&authToken=%s&x=%d&y=%d&z=%d&s=", new Object[] {
                a3.g(1), p.a(a(a3, "v")), p.a(a(a3, "authToken")), Integer.valueOf(((ac) (obj)).b), Integer.valueOf(((ac) (obj)).c), Integer.valueOf(((ac) (obj)).a)
            }));
            obj = (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
            if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
            {
                byte abyte0[] = com.google.android.m4b.maps.c.b.a(((HttpResponse) (obj)).getEntity().getContent());
                com.google.android.m4b.maps.ac.a a4 = new com.google.android.m4b.maps.ac.a(e.e);
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

        public a(t t1)
        {
            d = i.this;
            super();
            c = 0;
            a = t1;
            b = com.google.android.m4b.maps.aq.i.a(t1);
        }
    }


    private static final com.google.android.m4b.maps.ac.a a;
    private final Collection b = new ArrayList();
    private final ScheduledExecutorService c;
    private final m d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public i(m m1, ScheduledExecutorService scheduledexecutorservice)
    {
        d = (m)x.a(m1);
        c = (ScheduledExecutorService)x.a(scheduledexecutorservice);
    }

    static com.google.android.m4b.maps.ac.a a()
    {
        return a;
    }

    static com.google.android.m4b.maps.ac.a a(t t1)
    {
        return d(t1);
    }

    static ScheduledExecutorService a(i j)
    {
        return j.c;
    }

    static void a(i j, t t1)
    {
        j.b(t1);
    }

    static void b(i j, t t1)
    {
        j.e.post(j. new Runnable(t1) {

            private t a;
            private i b;

            public final void run()
            {
                v av[] = com.google.android.m4b.maps.aq.i.b(b);
                int l = av.length;
                for (int k = 0; k < l; k++)
                {
                    av[k].a(a);
                }

            }

            
            {
                b = i.this;
                a = t1;
                super();
            }
        });
    }

    private void b(t t1)
    {
        v av[] = b();
        int k = av.length;
        for (int j = 0; j < k; j++)
        {
            av[j].b(t1);
        }

    }

    private v[] b()
    {
        this;
        JVM INSTR monitorenter ;
        v av[];
        av = new v[b.size()];
        b.toArray(av);
        this;
        JVM INSTR monitorexit ;
        return av;
        Exception exception;
        exception;
        throw exception;
    }

    static v[] b(i j)
    {
        return j.b();
    }

    private static com.google.android.m4b.maps.ac.a d(t t1)
    {
        o o1 = new o();
        t1.a(o1);
        t1 = new DataInputStream(new ByteArrayInputStream(o1.a.toByteArray()));
        return com.google.android.m4b.maps.ac.c.a(e.c, t1);
    }

    public final void a(int j, byte abyte0[], boolean flag, boolean flag1, boolean flag2)
    {
        d.a(j, abyte0, flag, flag1, flag2);
    }

    public final void a(v v1)
    {
        b.add(v1);
        d.a(v1);
    }

    public final void c(t t1)
    {
        boolean flag1;
        flag1 = true;
        if (t1.g() != 108)
        {
            if (ab.a("MapsEngineDataRequestDispatcher", 4))
            {
                int j = t1.g();
                Log.i("MapsEngineDataRequestDispatcher", (new StringBuilder(62)).append("Can only handle Map Tile requests. Request type is ").append(j).toString());
            }
            b(t1);
            return;
        }
        String s = d(t1).c(9, 0).f(29).g(1);
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (s.startsWith("ft:cw:")) goto _L4; else goto _L3
_L3:
        if (!s.startsWith("vdb:")) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        if (flag)
        {
            try
            {
                d.c(t1);
                return;
            }
            catch (IOException ioexception)
            {
                b(t1);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
        c.execute(new a(t1));
        return;
    }

    public final void f()
    {
        d.h = false;
    }

    public final String h()
    {
        return d.h();
    }

    static 
    {
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(e.d);
        a = a1;
        a1.a(1, 0);
        a.a(2, 0);
    }
}
