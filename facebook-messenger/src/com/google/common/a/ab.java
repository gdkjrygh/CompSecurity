// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ik, x, ad, gg, 
//            ac

class ab extends AbstractMap
{

    final transient Map a;
    transient Set b;
    final x c;

    ab(x x1, Map map)
    {
        c = x1;
        super();
        a = map;
    }

    public Collection a(Object obj)
    {
        Collection collection = (Collection)ik.a(a, obj);
        if (collection == null)
        {
            return null;
        } else
        {
            return x.a(c, obj, collection);
        }
    }

    public Collection b(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = c.c();
            collection.addAll(((Collection) (obj)));
            x.b(c, ((Collection) (obj)).size());
            ((Collection) (obj)).clear();
            return collection;
        }
    }

    public void clear()
    {
        if (a == x.a(c))
        {
            c.f();
            return;
        } else
        {
            gg.f(new ad(this));
            return;
        }
    }

    public boolean containsKey(Object obj)
    {
        return ik.b(a, obj);
    }

    public Set entrySet()
    {
        Set set = b;
        Object obj = set;
        if (set == null)
        {
            obj = new ac(this);
            b = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.equals(obj);
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Set keySet()
    {
        return c.g();
    }

    public Object remove(Object obj)
    {
        return b(obj);
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return a.toString();
    }
}
