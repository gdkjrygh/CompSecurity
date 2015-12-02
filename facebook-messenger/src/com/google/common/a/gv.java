// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            q, ik, jh, gb

public final class gv extends q
{

    private gv()
    {
        super(new LinkedHashMap());
    }

    private gv(int i)
    {
        super(new LinkedHashMap(ik.b(i)));
    }

    public static gv a(int i)
    {
        return new gv(i);
    }

    public static gv a(Iterable iterable)
    {
        gv gv1 = a(jh.a(iterable));
        gb.a(gv1, iterable);
        return gv1;
    }

    public static gv h()
    {
        return new gv();
    }

    public volatile int a(Object obj)
    {
        return super.a(obj);
    }

    public volatile int a(Object obj, int i)
    {
        return super.a(obj, i);
    }

    public volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public volatile int b(Object obj, int i)
    {
        return super.b(obj, i);
    }

    public volatile Set b()
    {
        return super.b();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Set f()
    {
        return super.f();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
