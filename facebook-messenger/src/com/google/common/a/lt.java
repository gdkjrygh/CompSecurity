// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            in, lj, lv

class lt extends in
{

    final lj a;

    lt(lj lj1)
    {
        a = lj1;
        super();
    }

    public Map a(Object obj)
    {
        if (a.a(obj))
        {
            return a.b(obj);
        } else
        {
            return null;
        }
    }

    protected Set a()
    {
        return new lv(this);
    }

    public Map b(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return (Map)a.a.remove(obj);
        }
    }

    public boolean containsKey(Object obj)
    {
        return a.a(obj);
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public Set keySet()
    {
        return a.c();
    }

    public Object remove(Object obj)
    {
        return b(obj);
    }
}
