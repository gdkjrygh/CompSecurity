// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bc, bi

static final class b
    implements Map
{

    private final bi a;
    private final Map b;

    public final void clear()
    {
        a.d();
        b.clear();
    }

    public final boolean containsKey(Object obj)
    {
        return b.containsKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return b.containsValue(obj);
    }

    public final Set entrySet()
    {
        return new <init>(a, b.entrySet());
    }

    public final boolean equals(Object obj)
    {
        return b.equals(obj);
    }

    public final Object get(Object obj)
    {
        return b.get(obj);
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final boolean isEmpty()
    {
        return b.isEmpty();
    }

    public final Set keySet()
    {
        return new <init>(a, b.keySet());
    }

    public final Object put(Object obj, Object obj1)
    {
        a.d();
        return b.put(obj, obj1);
    }

    public final void putAll(Map map)
    {
        a.d();
        b.putAll(map);
    }

    public final Object remove(Object obj)
    {
        a.d();
        return b.remove(obj);
    }

    public final int size()
    {
        return b.size();
    }

    public final String toString()
    {
        return b.toString();
    }

    public final Collection values()
    {
        return new <init>(a, b.values());
    }

    (bi bi1, Map map)
    {
        a = bi1;
        b = map;
    }
}
