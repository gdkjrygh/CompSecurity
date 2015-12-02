// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import com.qihoo.security.appbox.core.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.adv:
//            e

public class d
    implements Cloneable
{

    public e a;
    public c b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private List h;
    private int i;
    private int j;

    public d()
    {
        h = new ArrayList();
        j = 0;
    }

    public int a()
    {
        return j;
    }

    public void a(int k)
    {
        j = k;
    }

    public void a(e e1)
    {
        a = e1;
    }

    public void a(c c1)
    {
        b = c1;
    }

    public void a(String s)
    {
        f = s;
    }

    public void a(List list)
    {
        h = list;
    }

    public c b()
    {
        return b;
    }

    public void b(int k)
    {
        c = k;
    }

    public void b(String s)
    {
        g = s;
    }

    public int c()
    {
        return c;
    }

    public void c(int k)
    {
        d = k;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return j();
    }

    public int d()
    {
        return d;
    }

    public void d(int k)
    {
        e = k;
    }

    public int e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public List h()
    {
        return h;
    }

    public e i()
    {
        return a;
    }

    public d j()
    {
        d d1 = new d();
        d1.h = h;
        d1.a = a;
        d1.b = b;
        d1.f = f;
        d1.g = g;
        d1.c = c;
        d1.i = i;
        d1.e = e;
        d1.d = d;
        d1.j = j;
        return d1;
    }
}
