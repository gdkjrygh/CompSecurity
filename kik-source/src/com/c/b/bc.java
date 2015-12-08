// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bi, ba, au

public final class bc
    implements bi
{
    private static final class a
        implements Collection
    {

        private final bi a;
        private final Collection b;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final void clear()
        {
            a.d();
            b.clear();
        }

        public final boolean contains(Object obj)
        {
            return b.contains(obj);
        }

        public final boolean containsAll(Collection collection)
        {
            return b.containsAll(collection);
        }

        public final boolean equals(Object obj)
        {
            return b.equals(obj);
        }

        public final int hashCode()
        {
            return b.hashCode();
        }

        public final boolean isEmpty()
        {
            return b.isEmpty();
        }

        public final Iterator iterator()
        {
            return new b(a, b.iterator());
        }

        public final boolean remove(Object obj)
        {
            a.d();
            return b.remove(obj);
        }

        public final boolean removeAll(Collection collection)
        {
            a.d();
            return b.removeAll(collection);
        }

        public final boolean retainAll(Collection collection)
        {
            a.d();
            return b.retainAll(collection);
        }

        public final int size()
        {
            return b.size();
        }

        public final Object[] toArray()
        {
            return b.toArray();
        }

        public final Object[] toArray(Object aobj[])
        {
            return b.toArray(aobj);
        }

        public final String toString()
        {
            return b.toString();
        }

        a(bi bi1, Collection collection)
        {
            a = bi1;
            b = collection;
        }
    }

    private static final class b
        implements Iterator
    {

        private final bi a;
        private final Iterator b;

        public final boolean equals(Object obj)
        {
            return b.equals(obj);
        }

        public final boolean hasNext()
        {
            return b.hasNext();
        }

        public final int hashCode()
        {
            return b.hashCode();
        }

        public final Object next()
        {
            return b.next();
        }

        public final void remove()
        {
            a.d();
            b.remove();
        }

        public final String toString()
        {
            return b.toString();
        }

        b(bi bi1, Iterator iterator)
        {
            a = bi1;
            b = iterator;
        }
    }

    static final class c
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
            return new d(a, b.entrySet());
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
            return new d(a, b.keySet());
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
            return new a(a, b.values());
        }

        c(bi bi1, Map map)
        {
            a = bi1;
            b = map;
        }
    }

    private static final class d
        implements Set
    {

        private final bi a;
        private final Set b;

        public final boolean add(Object obj)
        {
            a.d();
            return b.add(obj);
        }

        public final boolean addAll(Collection collection)
        {
            a.d();
            return b.addAll(collection);
        }

        public final void clear()
        {
            a.d();
            b.clear();
        }

        public final boolean contains(Object obj)
        {
            return b.contains(obj);
        }

        public final boolean containsAll(Collection collection)
        {
            return b.containsAll(collection);
        }

        public final boolean equals(Object obj)
        {
            return b.equals(obj);
        }

        public final int hashCode()
        {
            return b.hashCode();
        }

        public final boolean isEmpty()
        {
            return b.isEmpty();
        }

        public final Iterator iterator()
        {
            return new b(a, b.iterator());
        }

        public final boolean remove(Object obj)
        {
            a.d();
            return b.remove(obj);
        }

        public final boolean removeAll(Collection collection)
        {
            a.d();
            return b.removeAll(collection);
        }

        public final boolean retainAll(Collection collection)
        {
            a.d();
            return b.retainAll(collection);
        }

        public final int size()
        {
            return b.size();
        }

        public final Object[] toArray()
        {
            return b.toArray();
        }

        public final Object[] toArray(Object aobj[])
        {
            return b.toArray(aobj);
        }

        public final String toString()
        {
            return b.toString();
        }

        d(bi bi1, Set set)
        {
            a = bi1;
            b = set;
        }
    }


    private static final bc d;
    private c b;
    private boolean c;

    private bc(Map map)
    {
        b = new c(this, map);
        c = true;
    }

    private static int a(Object obj)
    {
        if (obj instanceof byte[])
        {
            return ba.b((byte[])obj);
        }
        if (obj instanceof au.a)
        {
            return au.a((au.a)obj);
        } else
        {
            return obj.hashCode();
        }
    }

    static int a(Map map)
    {
        map = map.entrySet().iterator();
        java.util.Map.Entry entry;
        int i;
        int j;
        for (i = 0; map.hasNext(); i = (a(entry.getValue()) ^ j) + i)
        {
            entry = (java.util.Map.Entry)map.next();
            j = a(entry.getKey());
        }

        return i;
    }

    static boolean a(Map map, Map map1)
    {
        if (map == map1)
        {
            return true;
        }
        if (map.size() != map1.size())
        {
            return false;
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)map.next();
            if (!map1.containsKey(((java.util.Map.Entry) (obj1)).getKey()))
            {
                return false;
            }
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            obj1 = map1.get(((java.util.Map.Entry) (obj1)).getKey());
            boolean flag;
            if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
            {
                flag = Arrays.equals((byte[])obj, (byte[])obj1);
            } else
            {
                flag = obj.equals(obj1);
            }
            if (!flag)
            {
                return false;
            }
        }

        return true;
    }

    public final void d()
    {
        if (!c)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof bc))
        {
            return false;
        } else
        {
            obj = (bc)obj;
            return a(b, ((bc) (obj)).b);
        }
    }

    public final int hashCode()
    {
        return a(b);
    }

    static 
    {
        bc bc1 = new bc(Collections.emptyMap());
        d = bc1;
        bc1.c = false;
    }
}
