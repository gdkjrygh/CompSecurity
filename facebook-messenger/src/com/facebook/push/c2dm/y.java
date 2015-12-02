// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.common.w.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import javax.inject.a;

// Referenced classes of package com.facebook.push.c2dm:
//            z, c

public class y
{

    private final d a;
    private final a b;
    private final boolean c;
    private final int d;

    public y(d d1, a a1, boolean flag, int i1)
    {
        a = d1;
        b = a1;
        c = flag;
        d = i1;
    }

    public z a(String s)
    {
        if (s == null)
        {
            return z.C2DM;
        }
        try
        {
            s = (z)Enum.valueOf(com/facebook/push/c2dm/z, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return z.C2DM;
        }
        return s;
    }

    public String a()
    {
        return a.a(c.b, "");
    }

    public void a(String s, z z1)
    {
        long l1 = System.currentTimeMillis();
        e e1 = a.b();
        e1.a(c.b, s);
        e1.a(com.facebook.push.c2dm.c.e, l1);
        e1.a(com.facebook.push.c2dm.c.d, l1);
        e1.a(c.i, z1.toString());
        e1.a(c.j, false);
        e1.a();
    }

    public z b()
    {
        if (c)
        {
            return z.GCM;
        } else
        {
            return z.C2DM;
        }
    }

    public z c()
    {
        return a(a.a(c.h, null));
    }

    public boolean d()
    {
        boolean flag = false;
        if (d != a.a(c.l, 0))
        {
            flag = true;
        }
        return flag;
    }

    public int e()
    {
        return d;
    }

    public z f()
    {
        return a(a.a(c.i, null));
    }

    public boolean g()
    {
        return f() == z.GCM;
    }

    public void h()
    {
        e e1 = a.b();
        e1.a(c.b, "");
        e1.a(c.c, "");
        e1.a(c.l, 0);
        e1.a(com.facebook.push.c2dm.c.e, System.currentTimeMillis());
        e1.a(c.j, false);
        e1.a();
    }

    public String i()
    {
        return a.a(c.c, "");
    }

    public String j()
    {
        String s = (String)b.b();
        if (!com.facebook.common.w.n.a(s))
        {
            return s;
        } else
        {
            return i();
        }
    }

    public boolean k()
    {
        return a.a(c.j, false);
    }

    public long l()
    {
        return a.a(com.facebook.push.c2dm.c.d, 0L);
    }

    public void m()
    {
        a.b().a(c.j, true).a(c.l, d).a(c.k, System.currentTimeMillis()).a(c.c, (String)b.b()).a();
    }

    public void n()
    {
        a.b().a(c.j, false).a();
    }

    public long o()
    {
        return a.a(c.k, 0L);
    }
}
