// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook:
//            GraphRequest, al, aj

public class ak extends AbstractList
{

    private static AtomicInteger a = new AtomicInteger();
    private Handler b;
    private List c;
    private int d;
    private final String e;
    private List f;
    private String g;

    public ak()
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = new ArrayList();
    }

    public ak(Collection collection)
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = new ArrayList(collection);
    }

    public transient ak(GraphRequest agraphrequest[])
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = Arrays.asList(agraphrequest);
    }

    public int a()
    {
        return d;
    }

    public final GraphRequest a(int k)
    {
        return (GraphRequest)c.get(k);
    }

    public final void a(int k, GraphRequest graphrequest)
    {
        c.add(k, graphrequest);
    }

    final void a(Handler handler)
    {
        b = handler;
    }

    public void a(al al)
    {
        if (!f.contains(al))
        {
            f.add(al);
        }
    }

    public final boolean a(GraphRequest graphrequest)
    {
        return c.add(graphrequest);
    }

    public void add(int k, Object obj)
    {
        a(k, (GraphRequest)obj);
    }

    public boolean add(Object obj)
    {
        return a((GraphRequest)obj);
    }

    public final GraphRequest b(int k)
    {
        return (GraphRequest)c.remove(k);
    }

    public final GraphRequest b(int k, GraphRequest graphrequest)
    {
        return (GraphRequest)c.set(k, graphrequest);
    }

    final String b()
    {
        return e;
    }

    final Handler c()
    {
        return b;
    }

    public final void clear()
    {
        c.clear();
    }

    final List d()
    {
        return c;
    }

    final List e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final List g()
    {
        return i();
    }

    public Object get(int k)
    {
        return a(k);
    }

    public final aj h()
    {
        return j();
    }

    List i()
    {
        return GraphRequest.b(this);
    }

    aj j()
    {
        return GraphRequest.c(this);
    }

    public Object remove(int k)
    {
        return b(k);
    }

    public Object set(int k, Object obj)
    {
        return b(k, (GraphRequest)obj);
    }

    public final int size()
    {
        return c.size();
    }

}
