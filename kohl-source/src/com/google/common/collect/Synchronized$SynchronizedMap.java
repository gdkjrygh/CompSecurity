// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Synchronized

private static class ct extends ct
    implements Map
{

    private static final long serialVersionUID = 0L;
    transient Set entrySet;
    transient Set keySet;
    transient Collection values;

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

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    Map _mthdelegate()
    {
        return (Map)super._mthdelegate();
    }

    public Set entrySet()
    {
        Set set;
        synchronized (mutex)
        {
            if (entrySet == null)
            {
                entrySet = Synchronized.set(_mthdelegate().entrySet(), mutex);
            }
            set = entrySet;
        }
        return set;
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

    public Object get(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().get(obj);
        }
        return obj;
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
                keySet = Synchronized.set(_mthdelegate().keySet(), mutex);
            }
            set = keySet;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object put(Object obj, Object obj1)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().put(obj, obj1);
        }
        return obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void putAll(Map map)
    {
        synchronized (mutex)
        {
            _mthdelegate().putAll(map);
        }
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
    }

    public Object remove(Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().remove(obj);
        }
        return obj;
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
            if (values == null)
            {
                values = Synchronized.access$500(_mthdelegate().values(), mutex);
            }
            collection = values;
        }
        return collection;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ct(Map map, Object obj)
    {
        super(map, obj);
    }
}
