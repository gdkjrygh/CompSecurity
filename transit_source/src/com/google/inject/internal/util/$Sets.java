// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions

public final class $Sets
{
    private static class SetFromMap extends AbstractSet
        implements Set, Serializable
    {

        static final long serialVersionUID = 0L;
        private final Map m;
        private transient Set s;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            s = m.keySet();
        }

        public boolean add(Object obj)
        {
            return m.put(obj, Boolean.TRUE) == null;
        }

        public void clear()
        {
            m.clear();
        }

        public boolean contains(Object obj)
        {
            return m.containsKey(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return s.containsAll(collection);
        }

        public boolean equals(Object obj)
        {
            return this == obj || s.equals(obj);
        }

        public int hashCode()
        {
            return s.hashCode();
        }

        public boolean isEmpty()
        {
            return m.isEmpty();
        }

        public Iterator iterator()
        {
            return s.iterator();
        }

        public boolean remove(Object obj)
        {
            return m.remove(obj) != null;
        }

        public boolean removeAll(Collection collection)
        {
            return s.removeAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return s.retainAll(collection);
        }

        public int size()
        {
            return m.size();
        }

        public Object[] toArray()
        {
            return s.toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return s.toArray(aobj);
        }

        public String toString()
        {
            return s.toString();
        }

        SetFromMap(Map map)
        {
            $Preconditions.checkArgument(map.isEmpty(), "Map is non-empty");
            m = map;
            s = map.keySet();
        }
    }


    private $Sets()
    {
    }

    static int hashCodeImpl(Set set)
    {
        int i = 0;
        set = set.iterator();
        while (set.hasNext()) 
        {
            Object obj = set.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i += j;
        }
        return i;
    }

    public static HashSet newHashSet()
    {
        return new HashSet();
    }

    public static LinkedHashSet newLinkedHashSet()
    {
        return new LinkedHashSet();
    }

    public static Set newSetFromMap(Map map)
    {
        return new SetFromMap(map);
    }
}
