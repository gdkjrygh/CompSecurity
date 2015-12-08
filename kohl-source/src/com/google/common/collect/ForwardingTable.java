// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingObject, Table

public abstract class ForwardingTable extends ForwardingObject
    implements Table
{

    protected ForwardingTable()
    {
    }

    public Set cellSet()
    {
        return _mthdelegate().cellSet();
    }

    public void clear()
    {
        _mthdelegate().clear();
    }

    public Map column(Object obj)
    {
        return _mthdelegate().column(obj);
    }

    public Set columnKeySet()
    {
        return _mthdelegate().columnKeySet();
    }

    public Map columnMap()
    {
        return _mthdelegate().columnMap();
    }

    public boolean contains(Object obj, Object obj1)
    {
        return _mthdelegate().contains(obj, obj1);
    }

    public boolean containsColumn(Object obj)
    {
        return _mthdelegate().containsColumn(obj);
    }

    public boolean containsRow(Object obj)
    {
        return _mthdelegate().containsRow(obj);
    }

    public boolean containsValue(Object obj)
    {
        return _mthdelegate().containsValue(obj);
    }

    protected abstract Table _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public Object get(Object obj, Object obj1)
    {
        return _mthdelegate().get(obj, obj1);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public boolean isEmpty()
    {
        return _mthdelegate().isEmpty();
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        return _mthdelegate().put(obj, obj1, obj2);
    }

    public void putAll(Table table)
    {
        _mthdelegate().putAll(table);
    }

    public Object remove(Object obj, Object obj1)
    {
        return _mthdelegate().remove(obj, obj1);
    }

    public Map row(Object obj)
    {
        return _mthdelegate().row(obj);
    }

    public Set rowKeySet()
    {
        return _mthdelegate().rowKeySet();
    }

    public Map rowMap()
    {
        return _mthdelegate().rowMap();
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
