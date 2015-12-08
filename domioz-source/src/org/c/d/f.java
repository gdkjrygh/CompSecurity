// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.c.d:
//            j, a

final class f
    implements Serializable, j
{

    private final Map a;

    public f(Map map)
    {
        org.c.d.a.notNull(map, "'map' must not be null");
        a = map;
    }

    public final void add(Object obj, Object obj1)
    {
        List list = (List)a.get(obj);
        Object obj2 = list;
        if (list == null)
        {
            obj2 = new LinkedList();
            a.put(obj, obj2);
        }
        ((List) (obj2)).add(obj1);
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return a.containsValue(obj);
    }

    public final Set entrySet()
    {
        return a.entrySet();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        } else
        {
            return a.equals(obj);
        }
    }

    public final volatile Object get(Object obj)
    {
        return (List)a.get(obj);
    }

    public final Object getFirst(Object obj)
    {
        obj = (List)a.get(obj);
        if (obj != null)
        {
            return ((List) (obj)).get(0);
        } else
        {
            return null;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Set keySet()
    {
        return a.keySet();
    }

    public final volatile Object put(Object obj, Object obj1)
    {
        obj1 = (List)obj1;
        return (List)a.put(obj, obj1);
    }

    public final void putAll(Map map)
    {
        a.putAll(map);
    }

    public final volatile Object remove(Object obj)
    {
        return (List)a.remove(obj);
    }

    public final void set(Object obj, Object obj1)
    {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(obj1);
        a.put(obj, linkedlist);
    }

    public final void setAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); set(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public final int size()
    {
        return a.size();
    }

    public final Map toSingleValueMap()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); linkedhashmap.put(entry.getKey(), ((List)entry.getValue()).get(0)))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return linkedhashmap;
    }

    public final String toString()
    {
        return a.toString();
    }

    public final Collection values()
    {
        return a.values();
    }
}
