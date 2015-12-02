// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.adv:
//            d, e

public class a
    implements Cloneable
{

    private int a;
    private long b;
    private List c;
    private List d;
    private long e;

    public a()
    {
        c = new ArrayList();
        d = new ArrayList();
    }

    public long a()
    {
        return e;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(List list)
    {
        c = list;
    }

    public long b()
    {
        return b;
    }

    public void b(long l)
    {
        b = l;
    }

    public void b(List list)
    {
        d = list;
    }

    public List c()
    {
        return c;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return e();
    }

    public List d()
    {
        return d;
    }

    public a e()
    {
        a a1 = new a();
        a1.a = a;
        a1.b = b;
        a1.e = e;
        d d1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a1.c.add(d1.j()))
        {
            d1 = (d)iterator.next();
        }

        e e1;
        for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); a1.d.add(e1))
        {
            e1 = (e)iterator1.next();
        }

        return a1;
    }
}
