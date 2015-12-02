// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            gw, hd

class hc extends AbstractMap
{

    Set a;
    final gw b;

    hc(gw gw1)
    {
        b = gw1;
        super();
    }

    public Collection a(Object obj)
    {
        java.util.List list = b.b(obj);
        obj = list;
        if (list.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    public Collection b(Object obj)
    {
        java.util.List list = b.a(obj);
        obj = list;
        if (list.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    public boolean containsKey(Object obj)
    {
        return b.f(obj);
    }

    public Set entrySet()
    {
        Set set = a;
        Object obj = set;
        if (set == null)
        {
            obj = new hd(b, null);
            a = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public Object remove(Object obj)
    {
        return b(obj);
    }
}
