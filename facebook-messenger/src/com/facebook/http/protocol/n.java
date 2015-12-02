// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.http.protocol:
//            p, o, t

public class n
{

    private final String a;
    private final String b;
    private final String c;
    private final es d;
    private final t e;
    private final List f;
    private final Object g;
    private final boolean h;
    private final boolean i;
    private final o j;

    public n(p p1)
    {
        Preconditions.checkNotNull(p1.a());
        Preconditions.checkNotNull(p1.b());
        Preconditions.checkNotNull(p1.c());
        Preconditions.checkNotNull(p1.d());
        a = p1.a();
        b = p1.b();
        c = p1.c();
        d = es.a(p1.d());
        e = p1.e();
        f = p1.f();
        g = p1.g();
        h = p1.h();
        i = p1.i();
        j = p1.j();
    }

    public n(String s, String s1, String s2, List list, t t)
    {
        a = s;
        b = s1;
        c = s2;
        d = es.a(list);
        e = t;
        f = es.d();
        g = null;
        h = false;
        i = false;
        j = o.MULTI_PART_ENTITY;
    }

    public static p newBuilder()
    {
        return new p();
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public es d()
    {
        return d;
    }

    public List e()
    {
        if (f == null || f.isEmpty())
        {
            return null;
        } else
        {
            return f;
        }
    }

    public t f()
    {
        return e;
    }

    public Object g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public o j()
    {
        return j;
    }
}
