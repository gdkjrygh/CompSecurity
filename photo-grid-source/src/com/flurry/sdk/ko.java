// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            jy, jo, kc, lp, 
//            ji, kn, jv, jx

public abstract class ko
{

    private static final String a = com/flurry/sdk/ko.getSimpleName();
    private static long b = 10000L;
    private final int c = 0x7fffffff;
    private final jv d = a();
    private final List e = new ArrayList();
    private boolean f;
    private int g;
    private long h;
    private final Runnable i = new _cls1();
    private final jx j = new _cls2();

    public ko()
    {
        jy.a().a("com.flurry.android.sdk.NetworkStateEvent", j);
        h = b;
        g = -1;
        jo.a().b(new _cls3());
    }

    static void a(ko ko1)
    {
        ko1.b();
    }

    static List b(ko ko1)
    {
        return ko1.e;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g < 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        kc.a(3, a, "Transmit is in progress");
          goto _L1
        Exception exception;
        exception;
        throw exception;
label0:
        {
            h();
            if (!e.isEmpty())
            {
                break label0;
            }
            h = b;
            g = -1;
        }
          goto _L1
        g = 0;
        jo.a().b(new _cls8());
          goto _L1
    }

    static void c(ko ko1)
    {
        ko1.f();
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        lp.b();
        if (!ji.a().c()) goto _L2; else goto _L1
_L1:
        if (g >= e.size()) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = e;
        int k = g;
        g = k + 1;
        obj = (kn)((List) (obj)).get(k);
        if (((kn) (obj)).q()) goto _L1; else goto _L5
_L5:
        if (obj != null) goto _L7; else goto _L6
_L6:
        g();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(3, a, "Network is not available, aborting transmission");
        break; /* Loop/switch isn't completed */
_L7:
        a(((kn) (obj)));
        if (true) goto _L8; else goto _L4
        obj;
        throw obj;
_L4:
        obj = null;
        if (true) goto _L5; else goto _L9
_L9:
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        h();
        a(e);
        if (!f) goto _L2; else goto _L1
_L1:
        kc.a(3, a, "Reporter paused");
        h = b;
_L3:
        g = -1;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        kc.a(3, a, "All reports sent successfully");
        h = b;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        h = h << 1;
        kc.a(3, a, (new StringBuilder("One or more reports failed to send, backing off: ")).append(h).append("ms").toString());
        jo.a().b(i, h);
          goto _L3
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = e.iterator();
_L3:
        kn kn1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        kn1 = (kn)((Iterator) (obj)).next();
        if (!kn1.q()) goto _L2; else goto _L1
_L1:
        kc.a(3, a, (new StringBuilder("Url transmitted - ")).append(kn1.s()).append(" Attempts: ").append(kn1.r()).toString());
        ((Iterator) (obj)).remove();
          goto _L3
        obj;
        throw obj;
_L2:
        if (kn1.r() <= kn1.d()) goto _L5; else goto _L4
_L4:
        kc.a(3, a, (new StringBuilder("Exceeded max no of attempts - ")).append(kn1.s()).append(" Attempts: ").append(kn1.r()).toString());
        ((Iterator) (obj)).remove();
          goto _L3
_L5:
        if (System.currentTimeMillis() <= kn1.p() || kn1.r() <= 0) goto _L3; else goto _L6
_L6:
        kc.a(3, a, (new StringBuilder("Expired: Time expired - ")).append(kn1.s()).append(" Attempts: ").append(kn1.r()).toString());
        ((Iterator) (obj)).remove();
          goto _L3
        this;
        JVM INSTR monitorexit ;
    }

    private void i()
    {
        jy.a().b("com.flurry.android.sdk.NetworkStateEvent", j);
    }

    protected abstract jv a();

    public void a(long l)
    {
        b = l;
        h = b;
    }

    protected abstract void a(kn kn1);

    protected void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        lp.b();
        list = new ArrayList(list);
        d.a(list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void b(kn kn1)
    {
        this;
        JVM INSTR monitorenter ;
        if (kn1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e.add(kn1);
        jo.a().b(new _cls5());
        if (true) goto _L1; else goto _L3
_L3:
        kn1;
        throw kn1;
    }

    protected void b(List list)
    {
        this;
        JVM INSTR monitorenter ;
        List list1;
        lp.b();
        list1 = (List)d.a();
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        list.addAll(list1);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void c()
    {
        jo.a().c(i);
        i();
    }

    protected void c(kn kn1)
    {
        this;
        JVM INSTR monitorenter ;
        kn1.b(true);
        jo.a().b(new _cls6());
        this;
        JVM INSTR monitorexit ;
        return;
        kn1;
        throw kn1;
    }

    public void d()
    {
        f = true;
    }

    protected void d(kn kn1)
    {
        this;
        JVM INSTR monitorenter ;
        kn1.a_();
        jo.a().b(new _cls7());
        this;
        JVM INSTR monitorexit ;
        return;
        kn1;
        throw kn1;
    }

    public void e()
    {
        f = false;
        jo.a().b(new _cls4());
    }


    private class _cls1 extends lr
    {

        final ko a;

        public void a()
        {
            ko.a(a);
        }

        _cls1()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls2
        implements jx
    {

        final ko a;

        public void a(jh jh1)
        {
            if (jh1.a)
            {
                ko.a(a);
            }
        }

        public volatile void a(jw jw)
        {
            a((jh)jw);
        }

        _cls2()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls3 extends lr
    {

        final ko a;

        public void a()
        {
            a.b(ko.b(a));
            ko.a(a);
        }

        _cls3()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls8 extends lr
    {

        final ko a;

        public void a()
        {
            ko.c(a);
        }

        _cls8()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls5 extends lr
    {

        final ko a;

        public void a()
        {
            ko.a(a);
        }

        _cls5()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls6 extends lr
    {

        final ko a;

        public void a()
        {
            ko.c(a);
        }

        _cls6()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls7 extends lr
    {

        final ko a;

        public void a()
        {
            ko.c(a);
        }

        _cls7()
        {
            a = ko.this;
            super();
        }
    }


    private class _cls4 extends lr
    {

        final ko a;

        public void a()
        {
            ko.a(a);
        }

        _cls4()
        {
            a = ko.this;
            super();
        }
    }

}
