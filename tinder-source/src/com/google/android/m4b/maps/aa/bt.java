// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bv

public abstract class bt extends bv
    implements Map
{

    protected bt()
    {
    }

    protected abstract Map b();

    protected Object c()
    {
        return b();
    }

    public void clear()
    {
        b().clear();
    }

    public boolean containsKey(Object obj)
    {
        return b().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return b().containsValue(obj);
    }

    public Set entrySet()
    {
        return b().entrySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this || b().equals(obj);
    }

    public Object get(Object obj)
    {
        return b().get(obj);
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    public boolean isEmpty()
    {
        return b().isEmpty();
    }

    public Set keySet()
    {
        return b().keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return b().put(obj, obj1);
    }

    public void putAll(Map map)
    {
        b().putAll(map);
    }

    public Object remove(Object obj)
    {
        return b().remove(obj);
    }

    public int size()
    {
        return b().size();
    }

    public Collection values()
    {
        return b().values();
    }
}
