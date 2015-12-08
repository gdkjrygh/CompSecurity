// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.flurry.sdk:
//            jy, ih, kc, ik, 
//            ig, ii, il, jo, 
//            jv, hi, kn, if, 
//            lt, jx

public class ij
{

    public static int a;
    public static int b;
    public static AtomicInteger c;
    static jv d;
    private static ij f;
    private static Map g;
    private String e;
    private final AtomicInteger h = new AtomicInteger(0);
    private long i;
    private jx j;

    private ij()
    {
        e = com/flurry/sdk/ij.getSimpleName();
        j = new _cls1();
        g = new HashMap();
        c = new AtomicInteger(0);
        if (b == 0)
        {
            b = 0x927c0;
        }
        if (a == 0)
        {
            a = 15;
        }
        n();
        if (d == null)
        {
            q();
        }
        jy.a().a("com.flurry.android.sdk.NetworkStateEvent", j);
    }

    public static ij a()
    {
        com/flurry/sdk/ij;
        JVM INSTR monitorenter ;
        ij ij1;
        if (f == null)
        {
            f = new ij();
        }
        ij1 = f;
        com/flurry/sdk/ij;
        JVM INSTR monitorexit ;
        return ij1;
        Exception exception;
        exception;
        throw exception;
    }

    static String a(ij ij1)
    {
        return ij1.e;
    }

    public static void a(int i1)
    {
        a = i1;
    }

    public static void b()
    {
        if (f != null)
        {
            jy.a().b("com.flurry.android.sdk.NetworkStateEvent", f.j);
            g.clear();
            g = null;
            f = null;
        }
    }

    public static void b(int i1)
    {
        b = i1;
    }

    static void b(ij ij1)
    {
        ij1.o();
    }

    private void c(ih ih1)
    {
        ih1.d = true;
        ih1.a();
        c.incrementAndGet();
        ih1.g();
        kc.a(3, e, (new StringBuilder()).append(ih1.d()).append(" report to ").append(ih1.e()).append(" finalized.").toString());
        d();
        g();
    }

    static void f()
    {
        q();
    }

    private void g()
    {
        if (j() || k())
        {
            kc.a(3, e, "Threshold reached. Sending callback logging reports");
            l();
        }
    }

    private void h()
    {
        if (j())
        {
            kc.a(3, e, "Max Callback Attempts threshold reached. Sending callback logging reports");
            l();
        }
    }

    private void i()
    {
        if (k())
        {
            kc.a(3, e, "Time threshold reached. Sending callback logging reports");
            l();
        }
    }

    private boolean j()
    {
        return c.intValue() >= a;
    }

    private boolean k()
    {
        return System.currentTimeMillis() > i;
    }

    private void l()
    {
        Iterator iterator = c().iterator();
_L2:
        ik ik1;
        boolean flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ik1 = (ik)iterator.next();
        Iterator iterator1 = ik1.d().iterator();
        flag = false;
        do
        {
label0:
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                Iterator iterator2 = ((ig)iterator1.next()).a.iterator();
                boolean flag1 = flag;
                do
                {
                    flag = flag1;
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    ih ih1 = (ih)iterator2.next();
                    if (ih1.j)
                    {
                        iterator2.remove();
                    } else
                    if (!ih1.f.equals(ii.d))
                    {
                        ih1.j = true;
                        flag1 = true;
                    }
                } while (true);
            }
        } while (true);
        if (flag)
        {
            il.a().a(ik1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        il.a().c();
        i = System.currentTimeMillis() + (long)b;
        o();
        m();
        c = new AtomicInteger(0);
        d();
        return;
    }

    private void m()
    {
        List list = c();
        int i1 = 0;
        while (i1 < list.size()) 
        {
            ik ik1 = (ik)list.get(i1);
            if (ik1.f())
            {
                c(ik1.a());
            } else
            {
                List list1 = ik1.d();
                int j1 = 0;
                while (j1 < list1.size()) 
                {
                    Object obj = (ig)list1.get(j1);
                    if (((ig) (obj)).n())
                    {
                        ik1.e().remove(Long.valueOf(((ig) (obj)).e()));
                    } else
                    {
                        obj = ((ig) (obj)).a.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            if (((ih)((Iterator) (obj)).next()).j)
                            {
                                ((Iterator) (obj)).remove();
                            }
                        }
                    }
                    j1++;
                }
            }
            i1++;
        }
    }

    private void n()
    {
        i = jo.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong("timeToSendNextPulseReport", 0L);
    }

    private void o()
    {
        android.content.SharedPreferences.Editor editor = jo.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        editor.putLong("timeToSendNextPulseReport", i);
        editor.commit();
    }

    private int p()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = h.incrementAndGet();
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void q()
    {
        d = new jv(jo.a().c().getFileStreamPath(".yflurryanongoingpulsecallbackreporter"), ".yflurryanongoingpulsecallbackreporter", 2, new _cls6());
    }

    public void a(ih ih1)
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(3, e, (new StringBuilder()).append(ih1.d()).append(" report sent successfully to ").append(ih1.e()).toString());
        ih1.f = ii.a;
        ih1.g = "";
        c(ih1);
        if (kc.c() <= 3 && kc.d())
        {
            jo.a().a(new _cls4(ih1));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ih1;
        throw ih1;
    }

    public void a(ik ik1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ik1 != null) goto _L2; else goto _L1
_L1:
        kc.a(3, e, "Must add valid PulseCallbackAsyncReportInfo");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(3, e, (new StringBuilder("Adding and sending ")).append(ik1.c()).append(" report to PulseCallbackManager.").toString());
        if (ik1.d().size() != 0)
        {
            if (i == 0L)
            {
                i = System.currentTimeMillis() + (long)b;
                jo.a().b(new _cls2());
            }
            int i1 = p();
            ik1.a(i1);
            g.put(Integer.valueOf(i1), ik1);
            ik1 = ik1.d().iterator();
            while (ik1.hasNext()) 
            {
                hi.a().e().b((kn)ik1.next());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        ik1;
        throw ik1;
    }

    public boolean a(ih ih1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        ih1.h = ih1.h + 1;
        ih1.i = System.currentTimeMillis();
        if (!ih1.c() && !TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        kc.a(3, e, (new StringBuilder("Maximum number of redirects attempted. Aborting: ")).append(ih1.d()).append(" report to ").append(ih1.e()).toString());
        ih1.f = ii.c;
        ih1.g = "";
        c(ih1);
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        kc.a(3, e, (new StringBuilder("Report to ")).append(ih1.e()).append(" redirecting to url: ").append(s).toString());
        ih1.a(s);
        d();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        ih1;
        throw ih1;
    }

    public void b(ih ih1)
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(3, e, (new StringBuilder("Maximum number of attempts reached. Aborting: ")).append(ih1.d()).toString());
        ih1.f = ii.b;
        ih1.i = System.currentTimeMillis();
        ih1.g = "";
        c(ih1);
        this;
        JVM INSTR monitorexit ;
        return;
        ih1;
        throw ih1;
    }

    public void b(ik ik1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ik1 != null) goto _L2; else goto _L1
_L1:
        kc.a(3, e, "Must add valid PulseCallbackAsyncReportInfo");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i == 0L)
        {
            i = System.currentTimeMillis() + (long)b;
            jo.a().b(new _cls3());
        }
        int i1 = p();
        ik1.a(i1);
        g.put(Integer.valueOf(i1), ik1);
        for (Iterator iterator = ik1.d().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((ig)iterator.next()).a.iterator();
            while (iterator1.hasNext()) 
            {
                iterator1.next();
                c.incrementAndGet();
                h();
            }
        }

        break MISSING_BLOCK_LABEL_152;
        ik1;
        throw ik1;
        i();
        kc.a(3, e, (new StringBuilder("Restoring ")).append(ik1.c()).append(" report to PulseCallbackManager. Number of stored completed callbacks: ").append(c.get()).toString());
          goto _L3
    }

    public boolean b(ih ih1, String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        ih1.f = ii.c;
        ih1.i = System.currentTimeMillis();
        String s1;
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        ih1.g = s1;
        if (!ih1.b()) goto _L2; else goto _L1
_L1:
        kc.a(3, e, (new StringBuilder("Maximum number of attempts reached. Aborting: ")).append(ih1.d()).append(" report to ").append(ih1.e()).toString());
        c(ih1);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (lt.h(ih1.f()))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        kc.a(3, e, (new StringBuilder("Url: ")).append(ih1.f()).append(" is invalid.").toString());
        c(ih1);
          goto _L3
        ih1;
        throw ih1;
        kc.a(3, e, (new StringBuilder("Retrying callback to ")).append(ih1.d()).append(" in: ").append(ih1.l.g() / 1000L).append(" seconds.").toString());
        flag = true;
        ih1.a();
        c.incrementAndGet();
        d();
        g();
          goto _L3
    }

    public List c()
    {
        return new ArrayList(g.values());
    }

    public void c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(3, e, (new StringBuilder("Removing report ")).append(i1).append(" from PulseCallbackManager").toString());
        g.remove(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        jo.a().b(new _cls5());
    }

    public List e()
    {
        if (d == null)
        {
            q();
        }
        return (List)d.a();
    }

    private class _cls1
        implements jx
    {

        final ij a;

        public void a(jh jh1)
        {
            kc.a(4, ij.a(a), (new StringBuilder("onNetworkStateChanged : isNetworkEnable = ")).append(jh1.a).toString());
            class _cls1
                implements Runnable
            {

                final _cls1 a;

                public void run()
                {
                    il.a().c();
                }

                _cls1()
                {
                    a = _cls1.this;
                    super();
                }
            }

            if (jh1.a)
            {
                jo.a().b(new _cls1());
            }
        }

        public volatile void a(jw jw)
        {
            a((jh)jw);
        }

        _cls1()
        {
            a = ij.this;
            super();
        }
    }


    private class _cls6
        implements la
    {

        public final kx a(int i1)
        {
            return new kw(new ik.a());
        }

        _cls6()
        {
        }
    }


    private class _cls4
        implements Runnable
    {

        final ih a;
        final ij b;

        public void run()
        {
            Toast.makeText(jo.a().c(), (new StringBuilder("PulseCallbackReportInfo HTTP Response Code: ")).append(a.e).append(" for url: ").append(a.f()).toString(), 1).show();
        }

        _cls4(ih ih1)
        {
            b = ij.this;
            a = ih1;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ij a;

        public void run()
        {
            ij.b(a);
        }

        _cls2()
        {
            a = ij.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final ij a;

        public void run()
        {
            ij.b(a);
        }

        _cls3()
        {
            a = ij.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final ij a;

        public void run()
        {
            List list = ij.a().c();
            if (ij.d == null)
            {
                ij.f();
            }
            ij.d.a(list);
        }

        _cls5()
        {
            a = ij.this;
            super();
        }
    }

}
