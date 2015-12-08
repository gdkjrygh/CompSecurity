// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax, bc, e, i

public final class bo
{
    static abstract class a extends AbstractSet
    {

        public boolean removeAll(Collection collection)
        {
            return bo.a(this, collection);
        }

        public boolean retainAll(Collection collection)
        {
            return super.retainAll((Collection)j.a(collection));
        }

        a()
        {
        }
    }

    static final class b extends AbstractSet
        implements Serializable, Set
    {

        private static final long serialVersionUID = 0L;
        private final Map a;
        private transient Set b;

        private void readObject(ObjectInputStream objectinputstream)
        {
            objectinputstream.defaultReadObject();
            b = a.keySet();
        }

        public final boolean add(Object obj)
        {
            return a.put(obj, Boolean.TRUE) == null;
        }

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        public final boolean containsAll(Collection collection)
        {
            return b.containsAll(collection);
        }

        public final boolean equals(Object obj)
        {
            return this == obj || b.equals(obj);
        }

        public final int hashCode()
        {
            return b.hashCode();
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final Iterator iterator()
        {
            return b.iterator();
        }

        public final boolean remove(Object obj)
        {
            return a.remove(obj) != null;
        }

        public final boolean removeAll(Collection collection)
        {
            return b.removeAll(collection);
        }

        public final boolean retainAll(Collection collection)
        {
            return b.retainAll(collection);
        }

        public final int size()
        {
            return a.size();
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

        b(Map map)
        {
            j.a(map.isEmpty(), "Map is non-empty");
            a = map;
            b = map.keySet();
        }
    }


    public static HashSet a(int k)
    {
        return new HashSet(ax.b(k));
    }

    public static HashSet a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new HashSet(bc.a(iterable));
        } else
        {
            iterable = iterable.iterator();
            HashSet hashset = new HashSet();
            e.a(hashset, iterable);
            return hashset;
        }
    }

    public static Set a()
    {
        return new b(ax.e());
    }

    static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    static boolean a(Set set, Collection collection)
    {
        j.a(collection);
        Object obj = collection;
        if (collection instanceof i)
        {
            obj = ((i)collection).a();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return e.a(set.iterator(), ((Collection) (obj)));
        } else
        {
            return a(set, ((Collection) (obj)).iterator());
        }
    }

    static boolean a(Set set, Iterator iterator)
    {
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= set.remove(iterator.next())) { }
        return flag;
    }
}
