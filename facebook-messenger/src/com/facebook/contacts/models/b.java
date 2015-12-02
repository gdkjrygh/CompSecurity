// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import com.facebook.common.w.q;
import com.facebook.contacts.models.a.a;
import com.facebook.user.Name;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.models:
//            Contact

public class b
{

    private String a;
    private String b;
    private String c;
    private Name d;
    private String e;
    private String f;
    private String g;
    private Name h;
    private String i;
    private String j;
    private String k;
    private float l;
    private String m;
    private es n;
    private boolean o;
    private q p;
    private boolean q;
    private a r;
    private String s;
    private es t;

    public b()
    {
        p = q.UNSET;
        n = es.d();
        t = es.d();
    }

    public b a(float f1)
    {
        l = f1;
        return this;
    }

    public b a(q q1)
    {
        p = q1;
        return this;
    }

    public b a(a a1)
    {
        r = a1;
        return this;
    }

    public b a(Name name)
    {
        d = name;
        return this;
    }

    public b a(es es1)
    {
        n = es1;
        return this;
    }

    public b a(String s1)
    {
        a = s1;
        return this;
    }

    public b a(boolean flag)
    {
        o = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public b b(Name name)
    {
        h = name;
        return this;
    }

    public b b(String s1)
    {
        b = s1;
        return this;
    }

    public b b(boolean flag)
    {
        q = flag;
        return this;
    }

    public String b()
    {
        return b;
    }

    public void b(es es1)
    {
        t = es1;
    }

    public b c(String s1)
    {
        c = s1;
        return this;
    }

    public String c()
    {
        return c;
    }

    public b d(String s1)
    {
        e = s1;
        return this;
    }

    public Name d()
    {
        return d;
    }

    public b e(String s1)
    {
        i = s1;
        return this;
    }

    public Name e()
    {
        return h;
    }

    public b f(String s1)
    {
        j = s1;
        return this;
    }

    public String f()
    {
        return e;
    }

    public b g(String s1)
    {
        k = s1;
        return this;
    }

    public String g()
    {
        return f;
    }

    public b h(String s1)
    {
        m = s1;
        return this;
    }

    public String h()
    {
        return g;
    }

    public b i(String s1)
    {
        s = s1;
        return this;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public String k()
    {
        return k;
    }

    public float l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public es n()
    {
        return n;
    }

    public boolean o()
    {
        return o;
    }

    public q p()
    {
        return p;
    }

    public boolean q()
    {
        return q;
    }

    public a r()
    {
        return r;
    }

    public String s()
    {
        return s;
    }

    public es t()
    {
        return t;
    }

    public Contact u()
    {
        return new Contact(this);
    }
}
