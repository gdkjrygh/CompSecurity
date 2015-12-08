// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimap, Synchronized, Multiset

private static class nit> extends nit>
    implements Multimap
{

    private static final long serialVersionUID = 0L;
    transient Map asMap;
    transient Collection entries;
    transient Set keySet;
    transient Multiset keys;
    transient Collection valuesCollection;

    public Map asMap()
    {
        Map map;
        synchronized (mutex)
        {
            if (asMap == null)
            {
                asMap = new it>(_mthdelegate().asMap(), mutex);
            }
            map = asMap;
        }
        return map;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void clear()
    {
        synchronized (mutex)
        {
            _mthdelegate().clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().containsEntry(obj, obj1);
        }
        return flag;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean containsKey(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().containsKey(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean containsValue(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().containsValue(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    Multimap _mthdelegate()
    {
        return (Multimap)super.legate();
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public Collection entries()
    {
        Collection collection;
        synchronized (mutex)
        {
            if (entries == null)
            {
                entries = Synchronized.access$400(_mthdelegate().entries(), mutex);
            }
            collection = entries;
        }
        return collection;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().equals(obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Collection get(Object obj)
    {
        synchronized (mutex)
        {
            obj = Synchronized.access$400(_mthdelegate().get(obj), mutex);
        }
        return ((Collection) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int hashCode()
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().hashCode();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isEmpty()
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().isEmpty();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Set keySet()
    {
        Set set;
        synchronized (mutex)
        {
            if (keySet == null)
            {
                keySet = Synchronized.access$300(_mthdelegate().keySet(), mutex);
            }
            set = keySet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Multiset keys()
    {
        Multiset multiset;
        synchronized (mutex)
        {
            if (keys == null)
            {
                keys = Synchronized.multiset(_mthdelegate().keys(), mutex);
            }
            multiset = keys;
        }
        return multiset;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean put(Object obj, Object obj1)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().put(obj, obj1);
        }
        return flag;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean putAll(Multimap multimap)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().putAll(multimap);
        }
        return flag;
        multimap;
        obj;
        JVM INSTR monitorexit ;
        throw multimap;
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().putAll(obj, iterable);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean remove(Object obj, Object obj1)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().remove(obj, obj1);
        }
        return flag;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Collection removeAll(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().removeAll(obj);
        }
        return ((Collection) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().replaceValues(obj, iterable);
        }
        return ((Collection) (obj));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int size()
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Collection values()
    {
        Collection collection;
        synchronized (mutex)
        {
            if (valuesCollection == null)
            {
                valuesCollection = Synchronized.access$500(_mthdelegate().values(), mutex);
            }
            collection = valuesCollection;
        }
        return collection;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    A(Multimap multimap, Object obj)
    {
        super(multimap, obj);
    }
}
