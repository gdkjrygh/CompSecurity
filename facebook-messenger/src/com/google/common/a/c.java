// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dz, a, ik, d, 
//            b

class c extends dz
{

    final Set a;
    final a b;

    private c(a a1)
    {
        b = a1;
        super();
        a = com.google.common.a.a.a(b).entrySet();
    }

    c(a a1, b b1)
    {
        this(a1);
    }

    protected Set a()
    {
        return a;
    }

    protected Collection b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public void clear()
    {
        b.clear();
    }

    public boolean contains(Object obj)
    {
        return ik.a(a(), obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a(collection);
    }

    public Iterator iterator()
    {
        return new d(this, a.iterator());
    }

    public boolean remove(Object obj)
    {
        if (!a.contains(obj))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            com.google.common.a.a.a(com.google.common.a.a.b(b)).remove(((java.util.Map.Entry) (obj)).getValue());
            a.remove(obj);
            return true;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return b(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return c(collection);
    }

    public Object[] toArray()
    {
        return f();
    }

    public Object[] toArray(Object aobj[])
    {
        return a(aobj);
    }
}
