// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            c, b, o, u, 
//            v, ADCStorage, ah, t, 
//            a, j, l, AdColonyAd, 
//            ag, AdColonyInterstitialAd, AdColonyV4VCAd, AdColonyVideoAd, 
//            ab, ADCVideo, AdColonyOverlay, AdColonyFullscreen, 
//            g

class d
{

    c a;
    b b;
    o c;
    u d;
    v e;
    ADCStorage f;
    ah g;
    t h;
    ArrayList i;
    ArrayList j;
    volatile boolean k;
    boolean l;
    boolean m;
    ab.a n;

    d()
    {
        a = new c(this);
        b = new b(this);
        c = new o(this);
        d = new u(this);
        e = new v(this);
        f = new ADCStorage(this);
        g = new ah(this);
        h = new t(this);
        i = new ArrayList();
        j = new ArrayList();
        n = new ab.a();
    }

    double a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = a.i.f(s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return d1;
        s;
        com.jirbo.adcolony.a.a(s);
        d1 = 0.0D;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    void a()
    {
        while (l || !com.jirbo.adcolony.a.d()) 
        {
            return;
        }
_L2:
        if (l && (k || i.size() <= 0))
        {
            break; /* Loop/switch isn't completed */
        }
        l = true;
        j.addAll(i);
        i.clear();
        int i1 = 0;
_L3:
        if (i1 < j.size())
        {
            if (j.get(i1) != null)
            {
                ((j)j.get(i1)).a();
            }
            break MISSING_BLOCK_LABEL_144;
        }
        try
        {
            j.clear();
        }
        catch (RuntimeException runtimeexception)
        {
            l = false;
            j.clear();
            i.clear();
            com.jirbo.adcolony.a.a(runtimeexception);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        l = false;
        return;
        i1++;
          goto _L3
    }

    void a(double d1, AdColonyAd adcolonyad)
    {
        new _cls5(this, d1, adcolonyad);
    }

    void a(int i1)
    {
        com.jirbo.adcolony.a.a(i1);
    }

    void a(AdColonyAd adcolonyad)
    {
        this;
        JVM INSTR monitorenter ;
        a.n = 0.0D;
        l.a.b("Tracking ad event - start");
        ag ag1 = adcolonyad.h.k;
        ag1.d = ag1.d + 1;
        if (!adcolonyad.b())
        {
            adcolonyad.h.k();
            h.a(adcolonyad.g, adcolonyad.i.d);
        }
        new _cls4(this, adcolonyad);
        this;
        JVM INSTR monitorexit ;
        return;
        adcolonyad;
        throw adcolonyad;
    }

    void a(AdColonyInterstitialAd adcolonyinterstitialad)
    {
        this;
        JVM INSTR monitorenter ;
        a.b(adcolonyinterstitialad.g);
        this;
        JVM INSTR monitorexit ;
        return;
        adcolonyinterstitialad;
        throw adcolonyinterstitialad;
    }

    void a(AdColonyV4VCAd adcolonyv4vcad)
    {
        this;
        JVM INSTR monitorenter ;
        a.c(adcolonyv4vcad.g);
        this;
        JVM INSTR monitorexit ;
        return;
        adcolonyv4vcad;
        throw adcolonyv4vcad;
    }

    void a(AdColonyVideoAd adcolonyvideoad)
    {
        this;
        JVM INSTR monitorenter ;
        a.b(adcolonyvideoad.g);
        this;
        JVM INSTR monitorexit ;
        return;
        adcolonyvideoad;
        throw adcolonyvideoad;
    }

    void a(j j1)
    {
label0:
        {
            synchronized (i)
            {
                if (com.jirbo.adcolony.a.d())
                {
                    break label0;
                }
            }
            return;
        }
        i.add(j1);
        if (!k)
        {
            g();
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        j1;
        arraylist;
        JVM INSTR monitorexit ;
        throw j1;
    }

    void a(String s, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        h.b(s, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    void a(String s, String s1)
    {
        new _cls7(this, s, s1);
    }

    void a(String s, String s1, AdColonyAd adcolonyad)
    {
        new _cls8(this, s, s1, adcolonyad);
    }

    void a(String s, String s1, String as[])
    {
        this;
        JVM INSTR monitorenter ;
        a(a.n);
        l.c.a("==== Configuring AdColony ").a(a.b).b(" ====");
        l.a.a("package name: ").b(ab.f());
        a.j = s1;
        a.k = as;
        a.a(s);
        n.a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        com.jirbo.adcolony.a.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    void a(boolean flag, AdColonyAd adcolonyad)
    {
        int i1;
        int j1;
        j1 = 0;
        i1 = 1;
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (adcolonyad != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(1.0D, adcolonyad);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        AdColonyV4VCAd adcolonyv4vcad;
        String s;
        int k1;
        int l1;
        if (!adcolonyad.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        adcolonyad.h.k();
        h.a(adcolonyad.g, adcolonyad.i.d);
        adcolonyv4vcad = (AdColonyV4VCAd)a.J;
        s = adcolonyv4vcad.getRewardName();
        k1 = adcolonyv4vcad.getRewardAmount();
        l1 = adcolonyv4vcad.getViewsPerReward();
        if (l1 <= 1)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        i1 = h.c(adcolonyv4vcad.getRewardName()) + 1;
        if (i1 >= l1)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            boolean flag2 = false;
            j1 = i1;
            i1 = ((flag2) ? 1 : 0);
        }
        h.b(adcolonyv4vcad.getRewardName(), j1);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (adcolonyv4vcad.h.j.e)
        {
            a(true, s, k1);
        }
        new _cls6(this, s, k1, adcolonyad);
        if (true) goto _L1; else goto _L3
_L3:
        adcolonyad;
        throw adcolonyad;
    }

    void a(boolean flag, String s, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        a.N.a(flag, s, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    boolean a(String s, boolean flag, boolean flag1)
    {
        boolean flag3 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = com.jirbo.adcolony.a.d();
        if (flag2) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag2;
_L2:
        flag2 = flag3;
        try
        {
            if (b.b(s, flag))
            {
                flag2 = b.j.n.a(s).b(flag1);
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        com.jirbo.adcolony.a.a(s);
        flag2 = flag3;
        if (true) goto _L4; else goto _L3
_L3:
        throw s;
    }

    int b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = a.i.g(s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return i1;
        s;
        com.jirbo.adcolony.a.a(s);
        i1 = 0;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    void b()
    {
        k = true;
        new _cls1(this);
    }

    boolean b(AdColonyAd adcolonyad)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.l.b()) goto _L2; else goto _L1
_L1:
        a.J.f = 3;
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a(adcolonyad);
        ADCVideo.a();
        if (a.m)
        {
            l.a.b("Launching AdColonyOverlay");
            adcolonyad = new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyOverlay);
            com.jirbo.adcolony.a.b().startActivity(adcolonyad);
            break MISSING_BLOCK_LABEL_115;
        }
        l.a.b("Launching AdColonyFullscreen");
        adcolonyad = new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyFullscreen);
        com.jirbo.adcolony.a.b().startActivity(adcolonyad);
        break MISSING_BLOCK_LABEL_115;
        adcolonyad;
        throw adcolonyad;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean b(AdColonyInterstitialAd adcolonyinterstitialad)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s;
        boolean flag1;
        a.J = adcolonyinterstitialad;
        s = adcolonyinterstitialad.g;
        flag1 = f(s);
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        l.a.a("Showing ad for zone ").b(s);
        a(adcolonyinterstitialad);
        flag1 = b(((AdColonyAd) (adcolonyinterstitialad)));
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        adcolonyinterstitialad;
        com.jirbo.adcolony.a.a(adcolonyinterstitialad);
        if (true) goto _L1; else goto _L3
_L3:
        adcolonyinterstitialad;
        throw adcolonyinterstitialad;
    }

    boolean b(AdColonyV4VCAd adcolonyv4vcad)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s;
        boolean flag1;
        a.J = adcolonyv4vcad;
        s = adcolonyv4vcad.g;
        flag1 = g(s);
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        l.a.a("Showing v4vc for zone ").b(s);
        a(adcolonyv4vcad);
        flag1 = b(((AdColonyAd) (adcolonyv4vcad)));
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        adcolonyv4vcad;
        com.jirbo.adcolony.a.a(adcolonyv4vcad);
        if (true) goto _L1; else goto _L3
_L3:
        adcolonyv4vcad;
        throw adcolonyv4vcad;
    }

    boolean b(AdColonyVideoAd adcolonyvideoad)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        String s;
        boolean flag1;
        a.J = adcolonyvideoad;
        s = adcolonyvideoad.g;
        flag1 = f(s);
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        l.a.a("Showing ad for zone ").b(s);
        a(adcolonyvideoad);
        flag1 = b(((AdColonyAd) (adcolonyvideoad)));
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        adcolonyvideoad;
        com.jirbo.adcolony.a.a(adcolonyvideoad);
        if (true) goto _L1; else goto _L3
_L3:
        adcolonyvideoad;
        throw adcolonyvideoad;
    }

    boolean b(String s, boolean flag, boolean flag1)
    {
        boolean flag3 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = com.jirbo.adcolony.a.d();
        if (flag2) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag2;
_L2:
        flag2 = flag3;
        try
        {
            if (b.b(s, flag))
            {
                flag2 = b.j.n.a(s).c(flag1);
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        com.jirbo.adcolony.a.a(s);
        flag2 = flag3;
        if (true) goto _L4; else goto _L3
_L3:
        throw s;
    }

    void c()
    {
        k = false;
        new _cls2(this);
    }

    boolean c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.i.h(s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        com.jirbo.adcolony.a.a(s);
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    String d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.i.e(s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        com.jirbo.adcolony.a.a(s);
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    void d()
    {
        new _cls3(this);
    }

    int e(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = h.c(s);
        this;
        JVM INSTR monitorexit ;
        return i1;
        s;
        throw s;
    }

    String e()
    {
        this;
        JVM INSTR monitorenter ;
        String s = b.c();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    String f()
    {
        this;
        JVM INSTR monitorenter ;
        String s = b.d();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    boolean f(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(s, false, true);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    void g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = com.jirbo.adcolony.a.c();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a();
        if (!a.p)
        {
            if (com.jirbo.adcolony.g.n() != null || n.b() > 5D)
            {
                a.a();
                a.p = true;
            }
            a.r = true;
        }
        b.f();
        c.e();
        e.b();
        d.d();
        h.d();
        g.d();
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        com.jirbo.adcolony.a.a(((RuntimeException) (obj)));
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    boolean g(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b(s, false, true);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    n.ab h(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = b.j.n.a(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private class _cls5 extends j
    {

        final double a;
        final AdColonyAd b;
        final d c;

        void a()
        {
            o.d.a(a, b);
        }

        _cls5(d d2, double d3, AdColonyAd adcolonyad)
        {
            c = d.this;
            a = d3;
            b = adcolonyad;
            super(d2);
        }
    }


    private class _cls4 extends j
    {

        final AdColonyAd a;
        final d b;

        void a()
        {
            if (AdColony.isZoneV4VC(a.g) || !a.k.equals("native"))
            {
                b.a("start", (new StringBuilder("{\"ad_slot\":")).append(a.h.k.d).append(", \"replay\":").append(a.s).append("}").toString(), a);
            }
        }

        _cls4(d d2, AdColonyAd adcolonyad)
        {
            b = d.this;
            a = adcolonyad;
            super(d2);
        }
    }


    private class _cls7 extends j
    {

        final String a;
        final String b;
        final d c;

        void a()
        {
            o.d.a(a, com.jirbo.adcolony.k.b(b));
        }

        _cls7(d d2, String s, String s1)
        {
            c = d.this;
            a = s;
            b = s1;
            super(d2);
        }
    }


    private class _cls8 extends j
    {

        final String a;
        final String b;
        final AdColonyAd c;
        final d d;

        void a()
        {
            o.d.a(a, com.jirbo.adcolony.k.b(b), c);
        }

        _cls8(d d2, String s, String s1, AdColonyAd adcolonyad)
        {
            d = d.this;
            a = s;
            b = s1;
            c = adcolonyad;
            super(d2);
        }
    }


    private class _cls6 extends j
    {

        final String a;
        final int b;
        final AdColonyAd c;
        final d d;

        void a()
        {
            ADCData.g g1 = new ADCData.g();
            g1.b("v4vc_name", a);
            g1.b("v4vc_amount", b);
            o.d.a("reward_v4vc", g1, c);
        }

        _cls6(d d2, String s, int i1, AdColonyAd adcolonyad)
        {
            d = d.this;
            a = s;
            b = i1;
            c = adcolonyad;
            super(d2);
        }
    }


    private class _cls1 extends j
    {

        final d a;

        void a()
        {
            o.e.c();
        }

        _cls1(d d2)
        {
            a = d.this;
            super(d2);
        }
    }


    private class _cls2 extends j
    {

        final d a;

        void a()
        {
            o.e.d();
        }

        _cls2(d d2)
        {
            a = d.this;
            super(d2);
        }
    }


    private class _cls3 extends j
    {

        final d a;

        void a()
        {
            o.e.e();
        }

        _cls3(d d2)
        {
            a = d.this;
            super(d2);
        }
    }

}
