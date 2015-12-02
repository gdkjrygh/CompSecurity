// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.pm.PackageManager;
import com.facebook.config.a.a;
import com.facebook.contacts.upload.c;
import com.facebook.orca.compose.av;
import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.n;
import com.facebook.orca.prefs.o;
import com.facebook.orca.threads.m;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

public class h
{

    private static final Class a = com/facebook/orca/nux/h;
    private final a b;
    private final d c;
    private final az d;
    private final c e;
    private final PackageManager f;
    private final javax.inject.a g;
    private final javax.inject.a h;
    private final javax.inject.a i;
    private final javax.inject.a j;
    private final javax.inject.a k;

    public h(a a1, d d1, az az1, c c1, PackageManager packagemanager, javax.inject.a a2, javax.inject.a a3, 
            javax.inject.a a4, javax.inject.a a5, javax.inject.a a6)
    {
        b = a1;
        c = d1;
        d = az1;
        e = c1;
        f = packagemanager;
        g = a2;
        h = a3;
        i = a4;
        j = a5;
        k = a6;
        s();
    }

    private void a(ae ae)
    {
        c.b().a(ae, true).a();
    }

    private void b(ae ae)
    {
        c.b().a(ae, false).a();
    }

    private void s()
    {
        boolean flag = c.a(o.d, false);
        int i1 = c.a(o.i, -1);
        int j1 = c.a(o.g, -1);
        if (i1 != -1)
        {
            c.b().a(o.i).a(o.g, i1).a();
        } else
        if (j1 == -1 && flag)
        {
            c.b().a(o.g, 1).a();
            i1 = 1;
        } else
        {
            i1 = j1;
        }
        if (i1 != 3)
        {
            e e1 = c.b().a(o.g, 3);
            if (i1 != -1)
            {
                e1.a(o.h, true);
            }
            if (i1 == 2)
            {
                e1.a(o.j).a(o.l).a(o.o);
            }
            e1.a();
        }
    }

    public void a()
    {
        c.b().a(o.d).a(o.g).a(o.h).a(o.i).a(o.j).a(o.l).a(o.o).a(o.q).a(n.K).a(o.k).a();
        av.a(d);
    }

    public boolean a(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d())
        {
            flag = flag1;
            if (com.facebook.orca.threads.m.g(s1))
            {
                flag = flag1;
                if (!c.a(o.l, false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean b()
    {
        return b.i() == com.facebook.config.a.d.MESSENGER;
    }

    public boolean c()
    {
        return b() && ((Boolean)h.b()).booleanValue();
    }

    public boolean d()
    {
        int i1;
        if (((Boolean)j.b()).booleanValue())
        {
            i1 = 0;
        } else
        {
            i1 = 20;
        }
        if (d.a("send_clicked") >= i1 || f() || g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return e() && i1 != 0;
    }

    public boolean e()
    {
        return b() && ((Boolean)g.b()).booleanValue();
    }

    public boolean f()
    {
        return c.a(o.h, false);
    }

    public boolean g()
    {
        try
        {
            f.getApplicationInfo("com.facebook.home", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    public boolean h()
    {
        return c.a(o.j, false);
    }

    public boolean i()
    {
        return b() && !c.a(o.d, false) && !((Boolean)i.b()).booleanValue();
    }

    public boolean j()
    {
        boolean flag1 = false;
        k();
        boolean flag = flag1;
        if (d())
        {
            flag = flag1;
            if (!c.a(o.j, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public void k()
    {
        if (((Boolean)k.b()).booleanValue() && !c.a(o.k, false))
        {
            if (!c.a(n.g, false))
            {
                b(o.j);
            }
            a(o.k);
        }
    }

    public boolean l()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c())
        {
            flag = flag1;
            if (!e.e())
            {
                flag = flag1;
                if (!c.a(o.q, false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean m()
    {
        boolean flag = false;
        if (!c.a(o.r, false))
        {
            flag = true;
        }
        return flag;
    }

    public void n()
    {
        e e1 = c.b();
        e1.a(o.d, true);
        e1.a(o.i, 3);
        e1.a();
    }

    public void o()
    {
        a(o.j);
    }

    public void p()
    {
        a(o.l);
    }

    public void q()
    {
        a(o.q);
    }

    public void r()
    {
        a(o.r);
    }

}
