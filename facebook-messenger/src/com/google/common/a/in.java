// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            io, ip

abstract class in extends AbstractMap
{

    private Set a;
    private Set b;
    private Collection c;

    in()
    {
    }

    protected abstract Set a();

    public Set entrySet()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = a();
            a = set;
        }
        return set;
    }

    public boolean isEmpty()
    {
        return entrySet().isEmpty();
    }

    public Set keySet()
    {
        Set set = b;
        Object obj = set;
        if (set == null)
        {
            obj = new io(this);
            b = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Collection values()
    {
        Collection collection = c;
        Object obj = collection;
        if (collection == null)
        {
            obj = new ip(this);
            c = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }
}
