// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c, e, ax, bc

class a extends 
{
    final class a extends ax.b
    {

        private c.a a;

        final Map a()
        {
            return a;
        }

        public final boolean contains(Object obj)
        {
            return bc.a(a.a.entrySet(), obj);
        }

        public final Iterator iterator()
        {
            return a. new b();
        }

        public final boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                c.a(a.b, ((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        a()
        {
            a = c.a.this;
            super();
        }
    }

    final class b
        implements Iterator
    {

        private Iterator a;
        private Collection b;
        private c.a c;

        public final boolean hasNext()
        {
            return a.hasNext();
        }

        public final Object next()
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
            b = (Collection)entry.getValue();
            c.a a1 = c;
            Object obj = entry.getKey();
            return ax.a(obj, a1.b.a(obj, (Collection)entry.getValue()));
        }

        public final void remove()
        {
            a.remove();
            com.google.android.m4b.maps.aa.c.b(c.b, b.size());
            b.clear();
        }

        b()
        {
            c = c.a.this;
            super();
            a = c.a.entrySet().iterator();
        }
    }


    final transient Map a;
    final c b;

    protected final Set a()
    {
        return new a();
    }

    public void clear()
    {
        if (a == c.a(b))
        {
            c c1 = b;
            for (Iterator iterator = c1.a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
            c1.a.clear();
            c1.b = 0;
            return;
        } else
        {
            e.d(new b());
            return;
        }
    }

    public boolean containsKey(Object obj)
    {
        return ax.b(a, obj);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.equals(obj);
    }

    public Object get(Object obj)
    {
        Collection collection = (Collection)ax.a(a, obj);
        if (collection == null)
        {
            return null;
        } else
        {
            return b.a(obj, collection);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Set keySet()
    {
        return b.d();
    }

    public Object remove(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = b.f();
            collection.addAll(((Collection) (obj)));
            c.b(b, ((Collection) (obj)).size());
            ((Collection) (obj)).clear();
            return collection;
        }
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return a.toString();
    }

    a(c c1, Map map)
    {
        b = c1;
        super();
        a = map;
    }
}
