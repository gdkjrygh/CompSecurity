// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.radio.data.a;
import com.pandora.radio.data.b;
import java.util.HashMap;

// Referenced classes of package com.pandora.android.data:
//            p, g

public abstract class s extends a
    implements p
{

    private boolean d;
    private String e;
    private boolean f;
    private HashMap g;
    private g h;

    protected s()
    {
        this(new g(new HashMap()));
    }

    public s(g g1)
    {
        super(null, 0, com.pandora.radio.data.a.a.c);
        a = g1.h();
        h = g1;
        e = Long.toString(System.currentTimeMillis());
    }

    public String[] A()
    {
        return h.r();
    }

    public String[] B()
    {
        return h.s();
    }

    public String[] C()
    {
        return h.j();
    }

    public String[] D()
    {
        return h.u();
    }

    public String[] E()
    {
        return h.k();
    }

    public String[] F()
    {
        return h.t();
    }

    public boolean G()
    {
        return d;
    }

    public void H()
    {
        f = true;
    }

    public boolean I()
    {
        return f;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a(String s1)
    {
        s1 = (Boolean)u().get(s1);
        return s1 != null && s1.booleanValue();
    }

    public b c()
    {
        return new b(h.b(), h.a());
    }

    public String d()
    {
        return h.d();
    }

    public boolean e()
    {
        return false;
    }

    public int f()
    {
        return 15;
    }

    public boolean g()
    {
        return true;
    }

    public String[] h()
    {
        return h.i();
    }

    public boolean h_()
    {
        return false;
    }

    public String[] i()
    {
        return h.l();
    }

    public boolean i_()
    {
        return System.currentTimeMillis() > h.f();
    }

    public String[] j()
    {
        return h.m();
    }

    public String[] k()
    {
        return h.n();
    }

    public String[] l()
    {
        return h.o();
    }

    public String n()
    {
        return e;
    }

    public String o()
    {
        return h.A();
    }

    public String p()
    {
        return h.B();
    }

    public String q()
    {
        return h.C();
    }

    public HashMap u()
    {
        if (g == null)
        {
            g = new HashMap();
        }
        return g;
    }

    public boolean v()
    {
        return h.c();
    }

    public String w()
    {
        return h.g();
    }

    public String x()
    {
        return h.e();
    }

    public String[] y()
    {
        return h.p();
    }

    public String[] z()
    {
        return h.q();
    }
}
