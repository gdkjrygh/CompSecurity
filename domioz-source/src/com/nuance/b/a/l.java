// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import com.nuance.b.b.aq;
import com.nuance.b.b.ar;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nuance.b.a:
//            m

public final class l
{

    List a;
    List b;
    List c;
    List d;
    List e;
    private aq f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private ar m;
    private String n;

    public l()
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
    }

    public final aq a()
    {
        return f;
    }

    public final String a(int i1)
    {
        switch (m.a[i1 - 1])
        {
        default:
            return null;

        case 1: // '\001'
            return j;

        case 2: // '\002'
            return k;

        case 3: // '\003'
            return i;
        }
    }

    final void a(aq aq)
    {
        f = aq;
    }

    final void a(ar ar)
    {
        m = ar;
    }

    final void a(String s)
    {
        g = s;
    }

    public final String b()
    {
        return g;
    }

    final void b(String s)
    {
        h = s;
    }

    public final String c()
    {
        return h;
    }

    final void c(String s)
    {
        l = s;
    }

    public final List d()
    {
        return b;
    }

    final void d(String s)
    {
        i = s;
    }

    public final List e()
    {
        return d;
    }

    final void e(String s)
    {
        j = s;
    }

    public final List f()
    {
        return e;
    }

    final void f(String s)
    {
        k = s;
    }

    public final ar g()
    {
        return m;
    }

    final void g(String s)
    {
        n = s;
    }

    public final String toString()
    {
        return (new StringBuilder("[BeliefState: activeAgency=")).append(g).append(", agentInFocus=").append(h).append("]").toString();
    }
}
