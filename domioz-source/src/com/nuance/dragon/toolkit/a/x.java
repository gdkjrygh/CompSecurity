// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.dragon.toolkit.b.e;
import com.nuance.dragon.toolkit.d.b;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            as, ap, aa, y, 
//            ab, ao, al, e

public final class x
{

    private boolean a;
    private boolean b;
    private final List c;
    private final String d;
    private final e e;
    private final aa f;
    private final int g;
    private ab h;
    private ap i;
    private int j;
    private String k;
    private int l;
    private ao m;
    private boolean n;
    private boolean o;
    private b p;
    private final Handler q;
    private final Handler r;

    public x(String s, e e1, aa aa1, int i1)
    {
        this(s, e1, aa1, i1, (byte)0);
    }

    private x(String s, e e1, aa aa1, int i1, byte byte0)
    {
        this(s, e1, aa1, i1, 0);
    }

    public x(String s, e e1, aa aa1, int i1, int j1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("commandName", s);
        com.nuance.dragon.toolkit.d.b.c.a("listener", aa1);
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("timeout", "equal or greater than 0", flag);
        if (j1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("cadenceMs", "equal or greater than 0", flag);
        c = new ArrayList();
        d = s;
        e = e1;
        f = aa1;
        g = i1;
        i = new as(this);
        j = 0;
        a = true;
        m = null;
        l = j1;
        o = false;
        n = false;
        if (j1 > 0)
        {
            p = new b("com.nuance.dragon.toolkit.cloudservices.recognizer");
            p.a();
            r = p.c();
        } else
        {
            p = null;
            r = null;
        }
        q = new Handler();
    }

    static ao a(x x1)
    {
        return x1.m;
    }

    static boolean b(x x1)
    {
        return x1.n;
    }

    static aa c(x x1)
    {
        return x1.f;
    }

    static b d(x x1)
    {
        return x1.p;
    }

    static b e(x x1)
    {
        x1.p = null;
        return null;
    }

    static Handler f(x x1)
    {
        return x1.q;
    }

    static int g(x x1)
    {
        return x1.l;
    }

    static Handler h(x x1)
    {
        return x1.r;
    }

    final String a()
    {
        return d;
    }

    final void a(int i1)
    {
        j = i1;
    }

    final void a(ab ab)
    {
        h = ab;
    }

    public final void a(al al)
    {
        c.add(al);
        i.a(al);
    }

    final void a(ao ao, boolean flag)
    {
        m = ao;
        n = flag;
        if (l == 0)
        {
            f.a(this, ao, flag);
        } else
        if (!o)
        {
            if (!o)
            {
                o = true;
            }
            ao = new y(this);
            r.postDelayed(ao, l);
            return;
        }
    }

    final void a(ap ap1)
    {
        i.b();
        i = ap1;
        i.a();
    }

    final void a(com.nuance.dragon.toolkit.a.e e1)
    {
        i.a(e1);
    }

    final void a(String s)
    {
        k = s;
    }

    final e b()
    {
        return e;
    }

    final int c()
    {
        return g;
    }

    final int d()
    {
        return j;
    }

    public final void e()
    {
        b = true;
        i.d();
    }

    public final void f()
    {
        i.c();
    }

    public final boolean g()
    {
        return b;
    }

    final List h()
    {
        return c;
    }

    final aa i()
    {
        return f;
    }

    final ab j()
    {
        return h;
    }

    final ap k()
    {
        return i;
    }

    final String l()
    {
        return k;
    }

    final boolean m()
    {
        return a;
    }
}
