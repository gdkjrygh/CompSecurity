// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

// Referenced classes of package com.google.common.a:
//            q, kv, jq, mg

public final class mf extends q
    implements kv
{

    private final Comparator a;

    private mf()
    {
        this(((Comparator) (jq.b())));
    }

    private mf(Comparator comparator1)
    {
        super(new TreeMap((Comparator)Preconditions.checkNotNull(comparator1)));
        a = comparator1;
    }

    public static mf h()
    {
        return new mf();
    }

    public int a(Object obj)
    {
        int j;
        try
        {
            j = super.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        return j;
    }

    public int a(Object obj, int j)
    {
        if (obj == null)
        {
            a.compare(obj, obj);
        }
        return super.a(obj, j);
    }

    public volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public volatile int b(Object obj, int j)
    {
        return super.b(obj, j);
    }

    public volatile Set b()
    {
        return super.b();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public Comparator comparator()
    {
        return a;
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    Set e()
    {
        return new mg(this, (SortedMap)a());
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Set f()
    {
        return i();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public SortedSet i()
    {
        return (SortedSet)super.f();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public Iterator iterator()
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
