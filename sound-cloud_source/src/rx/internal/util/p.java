// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class p
    implements Queue
{

    private final LinkedList a;
    private final int b;

    public p()
    {
        a = new LinkedList();
        b = -1;
    }

    public p(int i)
    {
        a = new LinkedList();
        b = i;
    }

    public final boolean add(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.add(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public final boolean addAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.addAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public final void clear()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object clone()
    {
        this;
        JVM INSTR monitorenter ;
        p p1;
        p1 = new p(b);
        p1.addAll(a);
        this;
        JVM INSTR monitorexit ;
        return p1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean contains(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.contains(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public final boolean containsAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.containsAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public final Object element()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a.element();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (p)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((p) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((p) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final boolean isEmpty()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.isEmpty();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1 = a.iterator();
        this;
        JVM INSTR monitorexit ;
        return iterator1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean offer(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (b < 0) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = a.size();
        j = b;
        if (i + 1 <= j) goto _L2; else goto _L3
_L3:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a.offer(obj);
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public final Object peek()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a.peek();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object poll()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a.poll();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object remove()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a.remove();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean remove(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public final boolean removeAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.removeAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public final boolean retainAll(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.retainAll(collection);
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    public final int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object[] toArray()
    {
        this;
        JVM INSTR monitorenter ;
        Object aobj[] = a.toArray();
        this;
        JVM INSTR monitorexit ;
        return aobj;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object[] toArray(Object aobj[])
    {
        this;
        JVM INSTR monitorenter ;
        aobj = a.toArray(aobj);
        this;
        JVM INSTR monitorexit ;
        return aobj;
        aobj;
        throw aobj;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = a.toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
