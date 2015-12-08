// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            l, d, u, b, 
//            a, ab, c, f, 
//            k, ag

class v
{

    d a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    double f;
    double g;
    double h;
    int i;
    String j;

    v(d d1)
    {
        d = false;
        e = false;
        j = "uuid";
        a = d1;
    }

    void a()
    {
    }

    void a(double d1)
    {
        l.a.a("Submitting session duration ").b(d1);
        ADCData.g g1 = new ADCData.g();
        g1.b("session_length", (int)d1);
        a.d.a("session_end", g1);
    }

    void b()
    {
        if (a.b.b)
        {
            if (d)
            {
                d = false;
                a.d.a("install", null);
            }
            if (e)
            {
                e = false;
                a.d.a("session_start", null);
            }
        }
    }

    void c()
    {
        l.b.b("AdColony resuming");
        a.r = true;
        if (b)
        {
            l.d.b("AdColony.onResume() called multiple times in succession.");
        }
        b = true;
        g();
        double d1 = ab.c();
        if (c)
        {
            if (d1 - g > (double)a.a.d)
            {
                a(h);
                f = d1;
                h();
            }
            c = false;
            f();
        } else
        {
            f = d1;
            h();
        }
        com.jirbo.adcolony.a.h();
    }

    void d()
    {
        l.b.b("AdColony suspending");
        a.r = true;
        if (!b)
        {
            l.d.b("AdColony.onPause() called without initial call to onResume().");
        }
        b = false;
        c = true;
        g = ab.c();
        f();
    }

    void e()
    {
        l.b.b("AdColony terminating");
        a.r = true;
        a(h);
        c = false;
        f();
    }

    void f()
    {
        ADCData.g g1 = new ADCData.g();
        g1.b("allow_resume", c);
        g1.b("start_time", f);
        g1.b("finish_time", g);
        g1.b("session_time", h);
        k.a(new f("session_info.txt"), g1);
    }

    void g()
    {
        ADCData.g g1 = k.b(new f("session_info.txt"));
        if (g1 != null)
        {
            c = g1.h("allow_resume");
            f = g1.f("start_time");
            g = g1.f("finish_time");
            h = g1.f("session_time");
            return;
        } else
        {
            d = true;
            return;
        }
    }

    void h()
    {
        e = true;
        j = ab.b();
        h = 0.0D;
        i = 0;
        if (a.l != null && a.l.b != null && a.l.b.j != null && a.l.b.j.n != null)
        {
            int i1 = 0;
            while (i1 < a.l.b.j.n.a()) 
            {
                if (a.l.b.j.n.a(i1).k != null)
                {
                    a.l.b.j.n.a(i1).k.d = 0;
                }
                i1++;
            }
        }
    }
}
