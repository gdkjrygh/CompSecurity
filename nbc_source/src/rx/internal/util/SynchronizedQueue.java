// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SynchronizedQueue
    implements Queue
{

    private final LinkedList list;
    private final int size;

    public SynchronizedQueue()
    {
        list = new LinkedList();
        size = -1;
    }

    public SynchronizedQueue(int i)
    {
        list = new LinkedList();
        size = i;
    }

    public boolean add(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.add(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public boolean addAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.addAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        list.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Object clone()
    {
        this;
        JVM INSTR monitorenter ;
        SynchronizedQueue synchronizedqueue;
        synchronizedqueue = new SynchronizedQueue(size);
        synchronizedqueue.addAll(list);
        this;
        JVM INSTR monitorexit ;
        return synchronizedqueue;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean contains(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.contains(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public boolean containsAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.containsAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public Object element()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = list.element();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.equals(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public int hashCode()
    {
        this;
        JVM INSTR monitorenter ;
        int i = list.hashCode();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isEmpty()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.isEmpty();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1 = list.iterator();
        this;
        JVM INSTR monitorexit ;
        return iterator1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean offer(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (size <= -1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = list.size();
        j = size;
        if (i + 1 <= j) goto _L2; else goto _L3
_L3:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = list.offer(obj);
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public Object peek()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = list.peek();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public Object poll()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = list.poll();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public Object remove()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = list.remove();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean remove(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.removeAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public boolean retainAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = list.retainAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = list.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public Object[] toArray()
    {
        this;
        JVM INSTR monitorenter ;
        Object aobj[] = list.toArray();
        this;
        JVM INSTR monitorexit ;
        return aobj;
        Exception exception;
        exception;
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        this;
        JVM INSTR monitorenter ;
        aobj = list.toArray(aobj);
        this;
        JVM INSTR monitorexit ;
        return aobj;
        aobj;
        throw aobj;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = list.toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
