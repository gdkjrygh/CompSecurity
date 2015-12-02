// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dz, a, h, b

class g extends dz
{

    final a a;

    private g(a a1)
    {
        a = a1;
        super();
    }

    g(a a1, b b1)
    {
        this(a1);
    }

    protected Set a()
    {
        return com.google.common.a.a.a(a).keySet();
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
        a.clear();
    }

    public Iterator iterator()
    {
        return new h(this, com.google.common.a.a.a(a).entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            com.google.common.a.a.a(a, obj);
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
}
