// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            ch, bl, j, e

class i extends ch
{

    final e a;

    i(e e1, Map map)
    {
        a = e1;
        super(map);
    }

    public void clear()
    {
        bl.f(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return super.c.keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || super.c.keySet().equals(obj);
    }

    public int hashCode()
    {
        return super.c.keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new j(this, super.c.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)super.c.remove(obj);
        int k;
        if (obj != null)
        {
            k = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            e.b(a, k);
        } else
        {
            k = 0;
        }
        return k > 0;
    }
}
