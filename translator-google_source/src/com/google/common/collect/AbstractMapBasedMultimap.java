// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            w, j, o, Maps, 
//            k, d, l, h, 
//            c, b, r, q, 
//            m

abstract class AbstractMapBasedMultimap extends w
    implements Serializable
{

    private static final long serialVersionUID = 0x21f766b1f568c81dL;
    private transient Map a;
    private transient int b;

    protected AbstractMapBasedMultimap(Map map)
    {
        p.a(map.isEmpty());
        a = map;
    }

    private List a(Object obj, List list, m m1)
    {
        if (list instanceof RandomAccess)
        {
            return new j(this, obj, list, m1);
        } else
        {
            return new o(this, obj, list, m1);
        }
    }

    Map backingMap()
    {
        return a;
    }

    public void clear()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        a.clear();
        b = 0;
    }

    public boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    Map createAsMap()
    {
        if (a instanceof SortedMap)
        {
            return new k(this, (SortedMap)a);
        } else
        {
            return new d(this, a);
        }
    }

    abstract Collection createCollection();

    Collection createCollection(Object obj)
    {
        return createCollection();
    }

    Set createKeySet()
    {
        if (a instanceof SortedMap)
        {
            return new l(this, (SortedMap)a);
        } else
        {
            return new h(this, a);
        }
    }

    Collection createUnmodifiableEmptyCollection()
    {
        return unmodifiableCollectionSubclass(createCollection());
    }

    public Collection entries()
    {
        return super.entries();
    }

    Iterator entryIterator()
    {
        return new c(this);
    }

    public Collection get(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createCollection(obj);
        }
        return wrapCollection(obj, collection);
    }

    public boolean put(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            collection = createCollection(obj);
            if (collection.add(obj1))
            {
                b = b + 1;
                a.put(obj, collection);
                return true;
            } else
            {
                throw new AssertionError("New Collection violated the Collection spec");
            }
        }
        if (collection.add(obj1))
        {
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public Collection removeAll(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return createUnmodifiableEmptyCollection();
        } else
        {
            Collection collection = createCollection();
            collection.addAll(((Collection) (obj)));
            b = b - ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            return unmodifiableCollectionSubclass(collection);
        }
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext())
        {
            return removeAll(obj);
        }
        Collection collection = (Collection)a.get(obj);
        iterable = collection;
        if (collection == null)
        {
            iterable = createCollection(obj);
            a.put(obj, iterable);
        }
        obj = createCollection();
        ((Collection) (obj)).addAll(iterable);
        b = b - iterable.size();
        iterable.clear();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (iterable.add(iterator.next()))
            {
                b = b + 1;
            }
        } while (true);
        return unmodifiableCollectionSubclass(((Collection) (obj)));
    }

    final void setMap(Map map)
    {
        a = map;
        b = 0;
        map = map.values().iterator();
        while (map.hasNext()) 
        {
            Collection collection = (Collection)map.next();
            int i;
            boolean flag;
            if (!collection.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            i = b;
            b = collection.size() + i;
        }
    }

    public int size()
    {
        return b;
    }

    Collection unmodifiableCollectionSubclass(Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set)
        {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List)
        {
            return Collections.unmodifiableList((List)collection);
        } else
        {
            return Collections.unmodifiableCollection(collection);
        }
    }

    Iterator valueIterator()
    {
        return new b(this);
    }

    public Collection values()
    {
        return super.values();
    }

    Collection wrapCollection(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new r(this, obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new q(this, obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, null);
        } else
        {
            return new m(this, obj, collection, null);
        }
    }



/*
    static Iterator access$100(AbstractMapBasedMultimap abstractmapbasedmultimap, Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

*/


/*
    static int access$208(AbstractMapBasedMultimap abstractmapbasedmultimap)
    {
        int i = abstractmapbasedmultimap.b;
        abstractmapbasedmultimap.b = i + 1;
        return i;
    }

*/


/*
    static int access$210(AbstractMapBasedMultimap abstractmapbasedmultimap)
    {
        int i = abstractmapbasedmultimap.b;
        abstractmapbasedmultimap.b = i - 1;
        return i;
    }

*/


/*
    static int access$212(AbstractMapBasedMultimap abstractmapbasedmultimap, int i)
    {
        i = abstractmapbasedmultimap.b + i;
        abstractmapbasedmultimap.b = i;
        return i;
    }

*/


/*
    static int access$220(AbstractMapBasedMultimap abstractmapbasedmultimap, int i)
    {
        i = abstractmapbasedmultimap.b - i;
        abstractmapbasedmultimap.b = i;
        return i;
    }

*/



/*
    static int access$400(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj)
    {
        obj = (Collection)Maps.c(abstractmapbasedmultimap.a, obj);
        int i = 0;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            abstractmapbasedmultimap.b = abstractmapbasedmultimap.b - i;
        }
        return i;
    }

*/
}
