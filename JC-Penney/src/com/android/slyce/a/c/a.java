// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import android.text.TextUtils;
import com.android.slyce.a.a.f;
import com.android.slyce.a.b.l;
import com.android.slyce.a.c.d.aj;
import com.android.slyce.a.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c:
//            ai, ax, bp, i, 
//            u, x, b, f, 
//            g, r, h, k, 
//            bo, d, e, av, 
//            bw, c, t, j

public class a
{

    static final boolean f;
    private static a g;
    final ArrayList a = new ArrayList();
    aj b;
    ai c;
    ax d;
    r e;

    public a(r r1)
    {
        e = r1;
        r1 = new ai(this);
        c = r1;
        a(r1);
        r1 = new aj(this);
        b = r1;
        a(r1);
        r1 = new ax();
        d = r1;
        a(r1);
        b.a(new bp());
    }

    static long a(u u1)
    {
        return d(u1);
    }

    public static a a()
    {
        if (g == null)
        {
            g = new a(r.a());
        }
        return g;
    }

    static void a(a a1, i j, Exception exception, x x1, u u1, com.android.slyce.a.c.b.a a2)
    {
        a1.a(j, exception, x1, u1, a2);
    }

    static void a(a a1, u u1, int j, i i1, com.android.slyce.a.c.b.a a2)
    {
        a1.b(u1, j, i1, a2);
    }

    static void a(a a1, u u1, int j, i i1, com.android.slyce.a.c.b.a a2, com.android.slyce.a.c.r r1)
    {
        a1.a(u1, j, i1, a2, r1);
    }

    private void a(i j, Exception exception, x x1, u u1, com.android.slyce.a.c.b.a a1)
    {
        if (!f && a1 == null)
        {
            throw new AssertionError();
        }
        e.a(j.b);
        boolean flag;
        if (exception != null)
        {
            u1.a("Connection error", exception);
            flag = j.a(exception);
        } else
        {
            u1.c("Connection successful");
            flag = j.b(x1);
        }
        if (flag)
        {
            a1.a(exception, x1);
            if (!f && exception == null && x1.a_() != null && x1.f() == null && !x1.k())
            {
                throw new AssertionError();
            }
        } else
        if (x1 != null)
        {
            x1.a(new f());
            x1.d();
        }
    }

    private void a(u u1, int j, i i1, com.android.slyce.a.c.b.a a1)
    {
        if (e.c())
        {
            b(u1, j, i1, a1);
            return;
        } else
        {
            e.a(new b(this, u1, j, i1, a1));
            return;
        }
    }

    private void a(u u1, int j, i i1, com.android.slyce.a.c.b.a a1, com.android.slyce.a.c.r r1)
    {
        u1 = new com.android.slyce.a.c.f(this, u1, i1, u1, a1, r1, j);
        r1.g = new g(this, u1);
        r1.h = new h(this, u1);
        r1.f = u1;
        u1.a(r1.e);
        synchronized (a)
        {
            for (i1 = a.iterator(); i1.hasNext() && !((k)i1.next()).a(r1);) { }
        }
        return;
        i1;
        u1;
        JVM INSTR monitorexit ;
        throw i1;
    }

    static void a(u u1, u u2, String s)
    {
        b(u1, u2, s);
    }

    static void b(a a1, u u1, int j, i i1, com.android.slyce.a.c.b.a a2)
    {
        a1.a(u1, j, i1, a2);
    }

    static void b(u u1)
    {
        c(u1);
    }

    private void b(u u1, int j, i i1, com.android.slyce.a.c.b.a a1)
    {
        Object obj;
        if (!f && !e.c())
        {
            throw new AssertionError();
        }
        if (j > 15)
        {
            a(i1, new bo("too many redirects"), ((x) (null)), u1, a1);
            return;
        }
        u1.d();
        obj = new com.android.slyce.a.c.r();
        u1.g = System.currentTimeMillis();
        obj.j = u1;
        u1.c("Executing request.");
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(((p) (obj)))) { }
        break MISSING_BLOCK_LABEL_136;
        u1;
        arraylist;
        JVM INSTR monitorexit ;
        throw u1;
        arraylist;
        JVM INSTR monitorexit ;
        if (u1.h() > 0)
        {
            i1.c = new d(this, ((com.android.slyce.a.c.r) (obj)), i1, u1, a1);
            i1.b = e.a(i1.c, d(u1));
        }
        obj.a = new e(this, u1, i1, a1, ((com.android.slyce.a.c.r) (obj)), j);
        c(u1);
        if (u1.g() != null && u1.e().a("Content-Type") == null)
        {
            u1.e().a("Content-Type", u1.g().a());
        }
        arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator1 = a.iterator();
        com.android.slyce.a.b.a a2;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_323;
            }
            a2 = ((k)iterator1.next()).a(((com.android.slyce.a.c.l) (obj)));
        } while (a2 == null);
        obj.b = a2;
        i1.c(a2);
        arraylist;
        JVM INSTR monitorexit ;
        return;
        u1;
        arraylist;
        JVM INSTR monitorexit ;
        throw u1;
        obj = new IllegalArgumentException((new StringBuilder()).append("invalid uri=").append(u1.d()).append(" middlewares=").append(a).toString());
        arraylist;
        JVM INSTR monitorexit ;
        a(i1, ((Exception) (obj)), ((x) (null)), u1, a1);
        return;
    }

    private static void b(u u1, u u2, String s)
    {
        u1 = u1.e().a(s);
        if (!TextUtils.isEmpty(u1))
        {
            u2.e().a(s, u1);
        }
    }

    private static void c(u u1)
    {
        if (u1.c == null)
        {
            Object obj;
            try
            {
                obj = ProxySelector.getDefault().select(URI.create(u1.d().toString()));
            }
            // Misplaced declaration of an exception variable
            catch (u u1)
            {
                return;
            }
            if (!((List) (obj)).isEmpty())
            {
                obj = (Proxy)((List) (obj)).get(0);
                if (((Proxy) (obj)).type() == java.net.Proxy.Type.HTTP && (((Proxy) (obj)).address() instanceof InetSocketAddress))
                {
                    InetSocketAddress inetsocketaddress = (InetSocketAddress)((Proxy) (obj)).address();
                    if (android.os.Build.VERSION.SDK_INT >= 14)
                    {
                        obj = inetsocketaddress.getHostString();
                    } else
                    {
                        obj = inetsocketaddress.getAddress();
                        if (obj != null)
                        {
                            obj = ((InetAddress) (obj)).getHostAddress();
                        } else
                        {
                            obj = inetsocketaddress.getHostName();
                        }
                    }
                    u1.a(((String) (obj)), inetsocketaddress.getPort());
                    return;
                }
            }
        }
    }

    private static long d(u u1)
    {
        return (long)u1.h();
    }

    public com.android.slyce.a.b.f a(u u1, com.android.slyce.a.c.b.a a1)
    {
        i j = new i(this, null);
        a(u1, 0, j, a1);
        return j;
    }

    public com.android.slyce.a.b.f a(u u1, String s, j j)
    {
        bw.a(u1, s);
        s = new l();
        s.c(a(u1, ((com.android.slyce.a.c.b.a) (new c(this, s, j, u1)))));
        return s;
    }

    public com.android.slyce.a.b.f a(String s, String s1, j j)
    {
        return a(((u) (new t(s.replace("ws://", "http://").replace("wss://", "https://")))), s1, j);
    }

    public void a(k k1)
    {
        a.add(0, k1);
    }

    public r b()
    {
        return e;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
