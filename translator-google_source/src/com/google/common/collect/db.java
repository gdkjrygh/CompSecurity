// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            dc, dd

abstract class db extends AbstractMap
{

    private transient Set a;
    private transient Set b;
    private transient Collection c;

    db()
    {
    }

    abstract Set a();

    Set b()
    {
        return new dc(this);
    }

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

    public Set keySet()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = b();
            b = set;
        }
        return set;
    }

    public Collection values()
    {
        Collection collection = c;
        Object obj = collection;
        if (collection == null)
        {
            obj = new dd(this);
            c = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }
}
