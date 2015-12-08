// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            am, bl, Maps, ed

public abstract class al extends am
    implements Map
{

    protected al()
    {
    }

    public void clear()
    {
        _mthdelegate().clear();
    }

    public boolean containsKey(Object obj)
    {
        return _mthdelegate().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return _mthdelegate().containsValue(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Map _mthdelegate();

    public Set entrySet()
    {
        return _mthdelegate().entrySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public Object get(Object obj)
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

    public Object put(Object obj, Object obj1)
    {
        return _mthdelegate().put(obj, obj1);
    }

    public void putAll(Map map)
    {
        _mthdelegate().putAll(map);
    }

    public Object remove(Object obj)
    {
        return _mthdelegate().remove(obj);
    }

    public int size()
    {
        return _mthdelegate().size();
    }

    protected void standardClear()
    {
        bl.d(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj)
    {
        return Maps.d(this, obj);
    }

    protected boolean standardContainsValue(Object obj)
    {
        return Maps.e(this, obj);
    }

    protected boolean standardEquals(Object obj)
    {
        return Maps.f(this, obj);
    }

    protected int standardHashCode()
    {
        return ed.a(entrySet());
    }

    protected boolean standardIsEmpty()
    {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map map)
    {
        Maps.a(this, map);
    }

    protected Object standardRemove(Object obj)
    {
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (k.a(entry.getKey(), obj))
            {
                obj = entry.getValue();
                iterator.remove();
                return obj;
            }
        }

        return null;
    }

    protected String standardToString()
    {
        return Maps.a(this);
    }

    public Collection values()
    {
        return _mthdelegate().values();
    }
}
