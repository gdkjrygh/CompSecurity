// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            Synchronized

private static class ction extends ction
    implements List
{

    private static final long serialVersionUID = 0L;

    public void add(int i, Object obj)
    {
        synchronized (mutex)
        {
            _mthdelegate().add(i, obj);
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = _mthdelegate().addAll(i, collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    List _mthdelegate()
    {
        return (List)super._mthdelegate();
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

    public Object get(int i)
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().get(i);
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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

    public int indexOf(Object obj)
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().indexOf(obj);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int lastIndexOf(Object obj)
    {
        int i;
        synchronized (mutex)
        {
            i = _mthdelegate().lastIndexOf(obj);
        }
        return i;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public ListIterator listIterator()
    {
        return _mthdelegate().listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return _mthdelegate().listIterator(i);
    }

    public Object remove(int i)
    {
        Object obj1;
        synchronized (mutex)
        {
            obj1 = _mthdelegate().remove(i);
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object set(int i, Object obj)
    {
        synchronized (mutex)
        {
            obj = _mthdelegate().set(i, obj);
        }
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public List subList(int i, int j)
    {
        List list;
        synchronized (mutex)
        {
            list = Synchronized.access$200(_mthdelegate().subList(i, j), mutex);
        }
        return list;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ction(List list, Object obj)
    {
        super(list, obj, null);
    }
}
