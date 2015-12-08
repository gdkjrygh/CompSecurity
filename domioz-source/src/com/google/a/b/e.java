// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            u, ca, k, p, 
//            s, r, n, m, 
//            i, l, f

abstract class e extends u
    implements Serializable
{

    private transient Map a;
    private transient int b;

    protected e(Map map)
    {
        ad.a(map.isEmpty());
        a = map;
    }

    static int a(e e1, int j)
    {
        j = e1.b + j;
        e1.b = j;
        return j;
    }

    static int a(e e1, Object obj)
    {
        obj = (Collection)ca.c(e1.a, obj);
        int j = 0;
        if (obj != null)
        {
            j = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            e1.b = e1.b - j;
        }
        return j;
    }

    static Iterator a(Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

    static List a(e e1, Object obj, List list, n n1)
    {
        return e1.a(obj, list, n1);
    }

    private List a(Object obj, List list, n n1)
    {
        if (list instanceof RandomAccess)
        {
            return new k(this, obj, list, n1);
        } else
        {
            return new p(this, obj, list, n1);
        }
    }

    static Map a(e e1)
    {
        return e1.a;
    }

    static int b(e e1)
    {
        int j = e1.b;
        e1.b = j - 1;
        return j;
    }

    static int b(e e1, int j)
    {
        j = e1.b - j;
        e1.b = j;
        return j;
    }

    static int c(e e1)
    {
        int j = e1.b;
        e1.b = j + 1;
        return j;
    }

    abstract Collection a();

    Collection a(Object obj)
    {
        return a();
    }

    final Collection a(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new s(this, obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new r(this, obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, null);
        } else
        {
            return new n(this, obj, collection, null);
        }
    }

    public boolean a(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            collection = a(obj);
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

    public Collection b(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = a(obj);
        }
        return a(obj, collection);
    }

    public void b()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        a.clear();
        b = 0;
    }

    final Set c()
    {
        if (a instanceof SortedMap)
        {
            return new m(this, (SortedMap)a);
        } else
        {
            return new i(this, a);
        }
    }

    final Map d()
    {
        if (a instanceof SortedMap)
        {
            return new l(this, (SortedMap)a);
        } else
        {
            return new f(this, a);
        }
    }
}
