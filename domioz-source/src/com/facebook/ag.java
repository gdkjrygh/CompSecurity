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
//            GraphRequest, ah

public final class ag extends AbstractList
{

    private static AtomicInteger a = new AtomicInteger();
    private Handler b;
    private List c;
    private int d;
    private final String e;
    private List f;
    private String g;

    public ag()
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = new ArrayList();
    }

    public ag(Collection collection)
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = new ArrayList(collection);
    }

    public transient ag(GraphRequest agraphrequest[])
    {
        c = new ArrayList();
        d = 0;
        e = Integer.valueOf(a.incrementAndGet()).toString();
        f = new ArrayList();
        c = Arrays.asList(agraphrequest);
    }

    public final int a()
    {
        return d;
    }

    public final GraphRequest a(int i)
    {
        return (GraphRequest)c.get(i);
    }

    final void a(Handler handler)
    {
        b = handler;
    }

    public final void a(ah ah)
    {
        if (!f.contains(ah))
        {
            f.add(ah);
        }
    }

    public final boolean a(GraphRequest graphrequest)
    {
        return c.add(graphrequest);
    }

    public final volatile void add(int i, Object obj)
    {
        obj = (GraphRequest)obj;
        c.add(i, obj);
    }

    public final boolean add(Object obj)
    {
        return a((GraphRequest)obj);
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

    public final Object get(int i)
    {
        return a(i);
    }

    public final volatile Object remove(int i)
    {
        return (GraphRequest)c.remove(i);
    }

    public final volatile Object set(int i, Object obj)
    {
        obj = (GraphRequest)obj;
        return (GraphRequest)c.set(i, obj);
    }

    public final int size()
    {
        return c.size();
    }

}
