// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            ko, ig, kc, ij, 
//            kj, lt, jm, jv, 
//            jo, jb, ih, in, 
//            kt, ik, kn

public class if extends ko
{

    public static long a;
    private static final String b = com/flurry/sdk/if.getSimpleName();

    public if()
    {
        a(30000L);
    }

    static void a(if if1, ih ih1, ig ig1)
    {
        if1.b(ih1, ig1);
    }

    static void a(if if1, ih ih1, ig ig1, kj kj1)
    {
        if1.a(ih1, ig1, kj1);
    }

    static void a(if if1, ih ih1, ig ig1, String s)
    {
        if1.a(ih1, ig1, s);
    }

    private void a(ih ih1, ig ig1)
    {
        kc.a(3, b, (new StringBuilder()).append(ig1.m()).append(" report sent successfully to : ").append(ig1.i()).toString());
        ij.a().a(ih1);
        c(ig1);
    }

    private void a(ih ih1, ig ig1, kj kj1)
    {
        Object obj = null;
        List list = kj1.b("Location");
        String s = obj;
        if (list != null)
        {
            s = obj;
            if (list.size() > 0)
            {
                s = lt.b((String)list.get(0), ig1.s());
            }
        }
        boolean flag = ij.a().a(ih1, s);
        if (flag)
        {
            kc.a(3, b, (new StringBuilder("Received redirect url. Retrying: ")).append(s).toString());
        } else
        {
            kc.a(3, b, (new StringBuilder("Received redirect url. Retrying: ")).append(flag).toString());
        }
        if (flag)
        {
            ig1.c(s);
            kj1.a(s);
            kj1.c("Location");
            jm.a().a(this, kj1);
            return;
        } else
        {
            c(ig1);
            return;
        }
    }

    private void a(ih ih1, ig ig1, String s)
    {
        boolean flag = ij.a().b(ih1, s);
        kc.a(3, b, (new StringBuilder("Failed report retrying: ")).append(flag).toString());
        if (flag)
        {
            d(ig1);
            return;
        } else
        {
            c(ig1);
            return;
        }
    }

    static String b()
    {
        return b;
    }

    static void b(if if1, ih ih1, ig ig1)
    {
        if1.a(ih1, ig1);
    }

    private void b(ih ih1, ig ig1)
    {
        ij.a().b(ih1);
        c(ig1);
    }

    protected jv a()
    {
        return new jv(jo.a().c().getFileStreamPath(".yflurryanpulsecallbackreporter"), ".yflurryanpulsecallbackreporter", 2, new _cls1());
    }

    protected void a(ig ig1)
    {
        kc.a(3, b, (new StringBuilder("Sending next pulse report to ")).append(ig1.i()).append(" at: ").append(ig1.t()).toString());
        long l1 = jb.a().d();
        long l = l1;
        if (l1 == 0L)
        {
            l = a;
        }
        long l2 = jb.a().g();
        l1 = l2;
        if (l2 == 0L)
        {
            l1 = System.currentTimeMillis() - l;
        }
        ih ih1 = new ih(ig1, l, l1, ig1.r());
        kj kj1 = new kj();
        kj1.a(ig1.t());
        kj1.d(0x186a0);
        Map map;
        if (ig1.f().equals(in.c))
        {
            kj1.a(new kt());
            if (ig1.l() != null)
            {
                kj1.a(ig1.l().getBytes());
            }
            kj1.a(kl.a.c);
        } else
        {
            kj1.a(kl.a.b);
        }
        kj1.a(ig1.j() * 1000);
        kj1.b(ig1.k() * 1000);
        kj1.c(true);
        kj1.a(true);
        kj1.c((ig1.j() + ig1.k()) * 1000);
        map = ig1.h();
        if (map != null)
        {
            String s;
            for (Iterator iterator = ig1.h().keySet().iterator(); iterator.hasNext(); kj1.a(s, (String)map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        kj1.b(false);
        kj1.a(new _cls2(ig1, ih1));
        jm.a().a(this, kj1);
    }

    protected volatile void a(kn kn)
    {
        a((ig)kn);
    }

    protected void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        ij.a().d();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    protected void b(List list)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ij.a().e();
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (((List) (obj)).size() == 0) goto _L1; else goto _L3
_L3:
        kc.a(3, b, (new StringBuilder("Restoring ")).append(((List) (obj)).size()).append(" from report queue.").toString());
        ik ik1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ij.a().b(ik1))
        {
            ik1 = (ik)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_101;
        list;
        throw list;
        Iterator iterator = ij.a().c().iterator();
        while (iterator.hasNext()) 
        {
            Iterator iterator1 = ((ik)iterator.next()).d().iterator();
            while (iterator1.hasNext()) 
            {
                ig ig1 = (ig)iterator1.next();
                if (!ig1.n())
                {
                    kc.a(3, b, (new StringBuilder("Callback for ")).append(ig1.m()).append(" to ").append(ig1.i()).append(" not completed.  Adding to reporter queue.").toString());
                    list.add(ig1);
                }
            }
        }
          goto _L1
    }


    private class _cls1
        implements la
    {

        final if a;

        public kx a(int i)
        {
            return new kw(new ig.a());
        }

        _cls1()
        {
            a = if.this;
            super();
        }
    }


    private class _cls2
        implements kj.a
    {

        final ig a;
        final ih b;
        final if c;

        public volatile void a(kj kj1, Object obj)
        {
            a(kj1, (String)obj);
        }

        public void a(kj kj1, String s)
        {
            kc.a(3, if.b(), (new StringBuilder("Pulse report to ")).append(a.i()).append(" for ").append(a.m()).append(", HTTP status code is: ").append(kj1.h()).toString());
            int i = kj1.h();
            b.a((int)kj1.c());
            b.e = i;
            if (!kj1.f())
            {
                Exception exception = kj1.j();
                if (kj1.d())
                {
                    if (kj1.i())
                    {
                        kc.a(3, if.b(), (new StringBuilder("Timeout occured when trying to connect to: ")).append(a.i()).append(". Exception: ").append(kj1.j().getMessage()).toString());
                    } else
                    {
                        kc.a(3, if.b(), (new StringBuilder("Manually managed http request timeout occured for: ")).append(a.i()).toString());
                    }
                    if.a(c, b, a);
                    return;
                } else
                {
                    kc.a(3, if.b(), (new StringBuilder("Error occured when trying to connect to: ")).append(a.i()).append(". Exception: ").append(exception.getMessage()).toString());
                    if.a(c, b, a, s);
                    return;
                }
            }
            if (i >= 200 && i < 300)
            {
                if.b(c, b, a);
                return;
            }
            if (i >= 300 && i < 400)
            {
                if.a(c, b, a, kj1);
                return;
            } else
            {
                kc.a(3, if.b(), (new StringBuilder()).append(a.m()).append(" report failed sending to : ").append(a.i()).toString());
                if.a(c, b, a, s);
                return;
            }
        }

        _cls2(ig ig1, ih ih1)
        {
            c = if.this;
            a = ig1;
            b = ih1;
            super();
        }
    }

}
