// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.os.Handler;
import android.os.HandlerThread;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.sdkutils.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kik.a.d.aa;
import kik.a.e.b;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.f.s;
import kik.a.h.j;
import org.c.c;

// Referenced classes of package kik.android:
//            h, b, c, g, 
//            f, d

public final class a
    implements b
{

    private static final org.c.b a = org.c.c.a("AddressIntegration");
    private final kik.a.d.a b;
    private final w c;
    private final h d = new h();
    private final Object e = new Object();
    private final String f;
    private String g;
    private final kik.android.d.c h;
    private v i;
    private kik.a.e.f j;
    private HandlerThread k;
    private Handler l;
    private kik.a.e.c m;
    private Iterator n;
    private boolean o;
    private boolean p;
    private s q;
    private f r;
    private Random s;
    private i t;
    private i u;

    public a(kik.android.d.c c1, v v1, kik.a.e.f f1, kik.a.d.a a1, w w1, String s1)
    {
        o = true;
        p = false;
        r = new f();
        s = new Random();
        t = new kik.android.b(this);
        u = new kik.android.c(this);
        b = a1;
        i = v1;
        j = f1;
        c = w1;
        k = new HandlerThread("AddressBookThread");
        k.start();
        l = new Handler(k.getLooper());
        f = s1;
        h = c1;
        if (c != null)
        {
            c.d();
            g = c.d().a;
        } else
        {
            g = null;
        }
        r.a(j.b(), t);
        r.a(c.a(), u);
    }

    static String a(a a1, String s1)
    {
        a1.g = s1;
        return s1;
    }

    static s a(a a1)
    {
        return a1.q;
    }

    static s a(a a1, s s1)
    {
        a1.q = s1;
        return s1;
    }

    private void a(s s1)
    {
        j.a(s1).a(new g(this, s1));
    }

    static void a(a a1, List list)
    {
        try
        {
            a1.m.a(list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            (new StringBuilder("Could not update address filter! :")).append(list.getMessage());
        }
        if (a1.o)
        {
            a1.i.c("AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY", (new StringBuilder()).append(kik.a.h.j.b()).toString());
            a1.o = false;
        }
        if (a1.p)
        {
            a1.i.c("AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY", (new StringBuilder()).append(kik.a.h.j.b()).toString());
            a1.p = false;
        }
    }

    private void a(boolean flag)
    {
        l.post(new kik.android.f(this, flag));
    }

    static w b(a a1)
    {
        return a1.c;
    }

    static void b(a a1, s s1)
    {
        a1.a(s1);
    }

    static String c(a a1)
    {
        return a1.g;
    }

    static void d(a a1)
    {
        a1.d.a();
        a1.a(new s(a1.f, a1.g, false, false));
    }

    static v e(a a1)
    {
        return a1.i;
    }

    static boolean f(a a1)
    {
        return a1.i();
    }

    private void g()
    {
        synchronized (e)
        {
            m.h();
            o = true;
            p = true;
            q = null;
            h();
            n = b.a();
            a(true);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean g(a a1)
    {
        return a1.k();
    }

    private void h()
    {
        synchronized (e)
        {
            l.removeCallbacksAndMessages(null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void h(a a1)
    {
        a1.g();
    }

    private boolean i()
    {
        return i.n("AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY") == null;
    }

    static boolean i(a a1)
    {
        return a1.j();
    }

    static void j(a a1)
    {
        com.c.a.c.c c1 = null;
        if (a1.n != null && a1.n.hasNext()) goto _L2; else goto _L1
_L1:
        com.c.a.c.c c2 = a1.m.a();
        c1 = c2;
_L4:
        synchronized (a1.e)
        {
            a1.o = true;
            a1.p = false;
            a1.q = null;
            a1.h();
            a1.n = a1.b.a(c1);
            a1.a(false);
        }
_L2:
        return;
        obj;
        (new StringBuilder("Could not retrieve address filter for update! :")).append(((IOException) (obj)).getMessage());
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private boolean j()
    {
        String s1 = i.n("AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY");
        if (s1 != null)
        {
            long l1 = Long.parseLong(s1);
            if (kik.a.h.j.b() - l1 > ((Long)h.a("address-update-interval").b()).longValue())
            {
                return true;
            }
        }
        return false;
    }

    static Handler k(a a1)
    {
        return a1.l;
    }

    private boolean k()
    {
        String s1 = i.n("AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY");
        if (s1 != null)
        {
            long l1 = Long.parseLong(s1);
            if (kik.a.h.j.b() - l1 > ((Long)h.a("address-full-update-interval").b()).longValue())
            {
                return true;
            }
        } else
        {
            long l2 = kik.a.h.j.b();
            long l3 = s.nextInt(10) * 24 * 60 * 60;
            i.c("AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY", String.valueOf(l2 - l3 * 1000L));
        }
        return false;
    }

    static Object l(a a1)
    {
        return a1.e;
    }

    static Iterator m(a a1)
    {
        return a1.n;
    }

    static Iterator n(a a1)
    {
        a1.n = null;
        return null;
    }

    static boolean o(a a1)
    {
        return a1.o;
    }

    static h p(a a1)
    {
        return a1.d;
    }

    static String q(a a1)
    {
        return a1.f;
    }

    static void r(a a1)
    {
        a1.a(false);
    }

    public final void a()
    {
        k.interrupt();
        m.g();
        r.a();
    }

    public final void a(kik.a.e.c c1)
    {
        m = c1;
    }

    public final boolean b()
    {
        return m.f();
    }

    public final p c()
    {
        boolean flag = false;
        if (y.b(9))
        {
            flag = true;
        }
        p p1 = m.b();
        long l1;
        if (flag)
        {
            l1 = 10000L;
        } else
        {
            l1 = 5000L;
        }
        return com.kik.g.s.a(p1, l1);
    }

    public final void d()
    {
        if (!b() || i() || j() || k())
        {
            g();
        }
        m.c();
    }

    public final void e()
    {
        m.d();
        synchronized (e)
        {
            o = true;
            h();
            q = null;
            n = null;
            d.a();
            a(new s(null, null, true, true));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        c().a(new d(this));
    }

}
