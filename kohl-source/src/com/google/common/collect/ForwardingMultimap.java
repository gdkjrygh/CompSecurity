// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingObject, Multimap, Multiset

public abstract class ForwardingMultimap extends ForwardingObject
    implements Multimap
{

    protected ForwardingMultimap()
    {
    }

    public Map asMap()
    {
        return _mthdelegate().asMap();
    }

    public void clear()
    {
        _mthdelegate().clear();
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        return _mthdelegate().containsEntry(obj, obj1);
    }

    public boolean containsKey(Object obj)
    {
        return _mthdelegate().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return _mthdelegate().containsValue(obj);
    }

    protected abstract Multimap _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public Collection entries()
    {
        return _mthdelegate().entries();
    }

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public Collection get(Object obj)
    {
        return _mthdelegate().get(obj);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public boolean isEmpty()
    {
        return _mthdelegate().isEmpty();
    }

    public Set keySet()
    {
        return _mthdelegate().keySet();
    }

    public Multiset keys()
    {
        return _mthdelegate().keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        return _mthdelegate().put(obj, obj1);
    }

    public boolean putAll(Multimap multimap)
    {
        return _mthdelegate().putAll(multimap);
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        return _mthdelegate().putAll(obj, iterable);
    }

    public boolean remove(Object obj, Object obj1)
    {
        return _mthdelegate().remove(obj, obj1);
    }

    public Collection removeAll(Object obj)
    {
        return _mthdelegate().removeAll(obj);
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        return _mthdelegate().replaceValues(obj, iterable);
    }

    public int size()
    {
        return _mthdelegate().size();
    }

    public Collection values()
    {
        return _mthdelegate().values();
    }
}
