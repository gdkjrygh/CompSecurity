// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dy

public abstract class dw extends dy
    implements Map
{

    protected dw()
    {
    }

    protected abstract Map a();

    protected Object c()
    {
        return a();
    }

    public void clear()
    {
        a().clear();
    }

    public boolean containsKey(Object obj)
    {
        return a().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return a().containsValue(obj);
    }

    public Set entrySet()
    {
        return a().entrySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this || a().equals(obj);
    }

    public Object get(Object obj)
    {
        return a().get(obj);
    }

    public int hashCode()
    {
        return a().hashCode();
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public Set keySet()
    {
        return a().keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a().put(obj, obj1);
    }

    public void putAll(Map map)
    {
        a().putAll(map);
    }

    public Object remove(Object obj)
    {
        return a().remove(obj);
    }

    public int size()
    {
        return a().size();
    }

    public Collection values()
    {
        return a().values();
    }
}
