// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            cg, g, e, h, 
//            bl, ca

class f extends cg
{

    final transient Map a;
    final e b;

    f(e e1, Map map)
    {
        b = e1;
        super();
        a = map;
    }

    protected final Set a()
    {
        return new g(this);
    }

    public void clear()
    {
        if (a == e.a(b))
        {
            b.b();
            return;
        } else
        {
            bl.f(new h(this));
            return;
        }
    }

    public boolean containsKey(Object obj)
    {
        return ca.b(a, obj);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.equals(obj);
    }

    public Object get(Object obj)
    {
        Collection collection = (Collection)ca.a(a, obj);
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
        return b.e();
    }

    public Object remove(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = b.a();
            collection.addAll(((Collection) (obj)));
            e.b(b, ((Collection) (obj)).size());
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
}
