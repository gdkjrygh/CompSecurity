// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;
import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ch, fq, fu, 
//            ft, fs, fv, az, 
//            fp, dz, fr, dy, 
//            dx, bk, bj, cs, 
//            gb, fz

public class dw
    implements fp.a
{
    class a
    {

        int a;
        long b;
        long c;
        long d;
        boolean e;
        String f;
        final dw g;

        public a()
        {
            g = dw.this;
            super();
            c = 0L;
            d = 0L;
            e = true;
            f = null;
        }
    }


    fp a;
    String b;
    String c;
    dz d;
    az e;
    boolean f;
    List g;
    int h;
    private Map i;
    private Map j;
    private List k;
    private az l;
    private dz m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Context r;
    private Thread s;

    public dw(Context context, String s1)
    {
        int i1 = 0;
        super();
        p = false;
        q = false;
        s = null;
        b = s1;
        r = context;
        k = new ArrayList();
        j = new HashMap();
        i = new HashMap();
        n = false;
        o = false;
        h = 0;
        s1 = ct.r();
        for (int j1 = s1.length; i1 < j1; i1++)
        {
            Object obj = s1[i1];
            k.add(obj);
            j.put(obj, new a());
        }

        (new ch(context.getFilesDir())).b();
    }

    private void a(az.a a1)
    {
        if (a1.a == fp.d.a)
        {
            a1 = new fq(this, r, a1.b, a1.c);
        } else
        if (a1.a == fp.d.b)
        {
            a1 = new fu(this, r, a1.c);
        } else
        if (a1.a == fp.d.e)
        {
            a1 = new ft(this, r, a1.c);
        } else
        if (a1.a == fp.d.c)
        {
            a1 = new fs(this, r, e);
        } else
        if (a1.a == fp.d.f)
        {
            a1 = new fv(this, r, e);
        } else
        {
            a1 = null;
        }
        if (a1 != null)
        {
            a(((fp) (a1)), false, false);
            return;
        } else
        {
            n = false;
            a = null;
            return;
        }
    }

    private void a(az az1)
    {
        g = az1.b();
        h = 0;
        e = az1;
        f = false;
        if (g.size() > 0)
        {
            a((az.a)g.get(0));
            return;
        } else
        {
            k();
            g();
            return;
        }
    }

    private void a(fp fp1, boolean flag, boolean flag1)
    {
        if (flag)
        {
            ct.a(ct.a.b, (new StringBuilder()).append("Re-Starting Job: ").append(fp1.toString()).toString());
        } else
        {
            ct.a(ct.a.b, (new StringBuilder()).append("Starting Job: ").append(fp1.toString()).toString());
        }
        a = fp1;
        if (flag)
        {
            a.d();
            return;
        } else
        {
            a.b();
            return;
        }
    }

    private void a(fz fz)
    {
        if (i.containsKey(c))
        {
            i.remove(c);
        }
        d = new dz(fz, c);
        i.put(c, d);
        a(d.e());
    }

    private void a(String s1, dz dz1, az az1)
    {
        ct.d("Dumping Unusable Ad.");
        az1.d();
        a(dz1, az1);
        f(s1);
    }

    static boolean a(dw dw1)
    {
        return dw1.n;
    }

    static void b(dw dw1)
    {
        dw1.n();
    }

    private boolean b(az az1)
    {
        long l1 = ct.B();
        if (az1.v() > 0L && l1 - az1.w() >= az1.v())
        {
            ct.d("Ad is expired because its lifetime has elapsed.");
            return true;
        }
        if ((new GregorianCalendar()).after(az1.e()))
        {
            ct.d("Ad is expired because it cache date has elapsed.");
            return true;
        } else
        {
            return false;
        }
    }

    static boolean c(dw dw1)
    {
        return dw1.p;
    }

    static boolean d(dw dw1)
    {
        return dw1.q;
    }

    private void g()
    {
        long l1 = ct.B();
        String s2 = h();
        if (s2 != null)
        {
            c = s2;
            d = null;
            q = false;
            a a1 = (a)j.get(s2);
            if (l1 - a1.b >= 60000L)
            {
                a1.b = l1;
                a1.a = 0;
            }
            a1.a = a1.a + 1;
            a1.c = l1;
            String s1 = b;
            if (a1.f != null)
            {
                s1 = a1.f;
            }
            a(new fr(this, s2, s1), false, false);
            return;
        }
        dz dz1 = i();
        if (dz1 == null)
        {
            q = true;
            return;
        } else
        {
            c = dz1.f();
            d = dz1;
            q = false;
            a(dz1.e());
            return;
        }
    }

    private boolean g(String s1)
    {
        s1 = (a)j.get(s1);
        return ((a) (s1)).a >= 5 && ct.B() - ((a) (s1)).b < 60000L;
    }

    private String h()
    {
        int i1 = 0;
        do
        {
            if (i1 >= 2)
            {
                break;
            }
            for (Iterator iterator = k.iterator(); iterator.hasNext();)
            {
                String s1 = (String)iterator.next();
                if (!i.containsKey(s1) && h(s1))
                {
                    if (i1 == 1)
                    {
                        return s1;
                    }
                    if (((a)j.get(s1)).f != null)
                    {
                        return s1;
                    }
                }
            }

            i1++;
        } while (true);
        return null;
    }

    private boolean h(String s1)
    {
        if (g(s1))
        {
            ct.d((new StringBuilder()).append(s1).append(" is closed because of too many calls this minute").toString());
            return false;
        }
        a a1 = (a)j.get(s1);
        if (!a1.e)
        {
            ct.d((new StringBuilder()).append(s1).append(" is closed because of no ad match").toString());
            GoogleAdapterCalls.onGetAdFailed();
            return false;
        }
        long l1 = ct.B();
        if (l1 - a1.c <= a1.d)
        {
            long l2 = a1.d;
            long l3 = a1.c;
            ct.d((new StringBuilder()).append(s1).append(" is closed because of built in call delay: ").append(l2 - (l1 - l3)).append("ms remaining.").toString());
            return false;
        } else
        {
            return true;
        }
    }

    private dz i()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (dz)i.get(obj);
            if (obj != null && !((dz) (obj)).b())
            {
                return ((dz) (obj));
            }
        }

        return null;
    }

    private String i(String s1)
    {
        return (new StringBuilder()).append(s1).append("precached").toString();
    }

    private void j()
    {
        s = new dy(this);
        s.setUncaughtExceptionHandler(new dx(this));
        s.start();
    }

    private void k()
    {
        if (k.size() == 1)
        {
            ct.d("Pre loading ad...");
            d.e().a(r);
        }
        d.c();
        ch.a(d.e());
        d = null;
        e = null;
        h = 0;
        c = null;
        g = null;
    }

    private boolean l()
    {
label0:
        {
            az.a a1 = (az.a)g.get(h);
            a.a(a1.b, e);
            m();
            a = null;
            h = h + 1;
            if (h < g.size())
            {
                a((az.a)g.get(h));
                break label0;
            }
            try
            {
                k();
                g();
            }
            catch (Exception exception)
            {
                ct.a(exception);
                return true;
            }
        }
        return false;
    }

    private void m()
    {
        if (!f && e != null && e.n())
        {
            f = true;
            (new ch(r.getFilesDir().getAbsoluteFile())).d(d.e());
        }
    }

    private void n()
    {
        boolean flag1 = true;
        if (a != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        g();
        flag = false;
_L4:
        if (flag)
        {
            if (d != null)
            {
                i.remove(d.f());
            }
            synchronized (s)
            {
                ((a)j.get(c)).d = 10000L;
                ((a)j.get(c)).e = false;
            }
            a = null;
            d = null;
            e = null;
            g();
        }
        return;
_L2:
        if (a.a() == fp.b.e)
        {
            a(a, true, true);
            flag = false;
        } else
        if (a.a() == fp.b.b)
        {
            if (a instanceof fr)
            {
                synchronized (s)
                {
                    ((a)j.get(c)).d = 2000L;
                }
                a(((fr)a).h());
                m();
                flag = false;
            } else
            {
                flag = l();
            }
        } else
        {
            flag = flag1;
            if (a.a() != fp.b.d)
            {
                flag = flag1;
                if (a.a() != fp.b.c)
                {
                    flag = false;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L4; else goto _L3
_L3:
        exception1;
        thread;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void a()
    {
        if (s != null)
        {
            synchronized (s)
            {
                n = false;
                p = true;
                if (a != null)
                {
                    a.c();
                }
                s.notify();
            }
            return;
        } else
        {
            return;
        }
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(dz dz1, az az1)
    {
        this;
        JVM INSTR monitorenter ;
        dz1.a();
        if (dz1.d())
        {
            i.remove(dz1.f());
        }
        this;
        JVM INSTR monitorexit ;
        ch.b(az1);
        return;
        dz1;
        this;
        JVM INSTR monitorexit ;
        throw dz1;
    }

    public void a(fp fp1)
    {
        ct.a(ct.a.b, (new StringBuilder()).append("Job ").append(fp1.a().name()).append(": ").append(fp1.toString()).toString());
    }

    public boolean a(String s1)
    {
        if (b(s1))
        {
            return true;
        } else
        {
            return b(i(s1));
        }
    }

    public void b()
    {
        ct.d("Stopping Download Manager");
        if (s != null)
        {
            synchronized (s)
            {
                if (n)
                {
                    n = false;
                    if (a != null)
                    {
                        a.c();
                    }
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        dz dz1;
        if (!i.containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        dz1 = (dz)i.get(s1);
        if (dz1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (dz1.b())
        {
            az az1 = dz1.e();
            if (!b(az1))
            {
                break MISSING_BLOCK_LABEL_64;
            }
            a(s1, dz1, az1);
        }
        return false;
        this;
        JVM INSTR monitorexit ;
        return true;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void c()
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        n = true;
        j();
_L4:
        return;
_L2:
        if (n) goto _L4; else goto _L3
_L3:
        Thread thread = s;
        thread;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            ((a)j.get(s1)).e = true;
        }

        break MISSING_BLOCK_LABEL_90;
        Exception exception;
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
        n = true;
        s.notify();
        thread;
        JVM INSTR monitorexit ;
        ct.d("Resuming Download Manager");
        return;
    }

    public boolean c(String s1)
    {
        if (d(s1))
        {
            return true;
        } else
        {
            return d(i(s1));
        }
    }

    public az d()
    {
        return l;
    }

    public boolean d(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        String s2 = s1;
        if (!i.containsKey(s1))
        {
            s2 = i(s1);
        }
        if (!i.containsKey(s2)) goto _L2; else goto _L1
_L1:
        s1 = (dz)i.get(s2);
        if (s1 == null) goto _L2; else goto _L3
_L3:
        if (!s1.b()) goto _L2; else goto _L4
_L4:
        az az1 = s1.e();
        if (!b(az1)) goto _L6; else goto _L5
_L5:
        a(s2, s1, az1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return false;
_L6:
        if (!(s1.e() instanceof bk))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        if (!(s1.e() instanceof bj))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        a(s2, s1, az1);
          goto _L2
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public fz e()
    {
        if (m == null)
        {
            return null;
        } else
        {
            return m.g();
        }
    }

    public boolean e(String s1)
    {
        if (o) goto _L2; else goto _L1
_L1:
        ct.d((new StringBuilder()).append("Starting ad for ").append(s1).toString());
        dz dz1;
        az az1;
        boolean flag;
        if (b(s1))
        {
            ct.d("TremorDebug: startAdView - Ad is ready");
            flag = true;
        } else
        if (b(i(s1)))
        {
            ct.d("TremorDebug: startAdView - Ad is ready pre-cache channel");
            f(s1);
            s1 = i(s1);
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        ct.d("TremorDebug: startAdView - Ad was ready. Check expriry");
        dz1 = (dz)i.get(s1);
        az1 = dz1.e();
        if (!b(az1)) goto _L6; else goto _L5
_L5:
        ct.d("TremorDebug: startAdView - Ad Expired and dumped.");
        a(s1, dz1, az1);
_L8:
        ct.d("TremorDebug: startAdView - returning false");
        return false;
_L6:
        ct.d("TremorDebug: startAdView - Ad was good");
        l = az1;
        m = dz1;
        o = true;
        ct.d("TremorDebug: startAdView - Returning true");
        return true;
_L4:
        ct.d("TremorDebug: startAdView - Ad was not ready");
        continue; /* Loop/switch isn't completed */
_L2:
        ct.d("TremorDebug: startAdView - ad view was aleady started!");
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void f()
    {
        if (o)
        {
            ct.f().b();
            ct.g().a();
            a(m, l);
            l = null;
            m = null;
            o = false;
            synchronized (s)
            {
                s.notify();
            }
            return;
        } else
        {
            return;
        }
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(String s1)
    {
        ct.f().b();
        if (s != null)
        {
            synchronized (s)
            {
                ((a)j.get(s1)).e = true;
                s.notify();
            }
            return;
        } else
        {
            return;
        }
        s1;
        thread;
        JVM INSTR monitorexit ;
        throw s1;
    }
}
