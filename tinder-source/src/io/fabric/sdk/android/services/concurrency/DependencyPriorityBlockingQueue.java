// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            a

public class DependencyPriorityBlockingQueue extends PriorityBlockingQueue
{

    final Queue a = new LinkedList();
    private final ReentrantLock b = new ReentrantLock();

    public DependencyPriorityBlockingQueue()
    {
    }

    private a a(int i, Long long1, TimeUnit timeunit)
        throws InterruptedException
    {
_L6:
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 61
    //                   1 73
    //                   2 85
    //                   3 97;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        a a1 = null;
_L7:
        if (a1 != null && !a1.g())
        {
            a(i, a1);
        } else
        {
            return a1;
        }
        if (true) goto _L6; else goto _L2
_L2:
        a1 = (a)super.take();
          goto _L7
_L3:
        a1 = (a)super.peek();
          goto _L7
_L4:
        a1 = (a)super.poll();
          goto _L7
_L5:
        a1 = (a)super.poll(long1.longValue(), timeunit);
          goto _L7
    }

    private boolean a(int i, a a1)
    {
        b.lock();
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        super.remove(a1);
        boolean flag = a.offer(a1);
        b.unlock();
        return flag;
        a1;
        b.unlock();
        throw a1;
    }

    private static Object[] a(Object aobj[], Object aobj1[])
    {
        int i = aobj.length;
        int j = aobj1.length;
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + j);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, i);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), i, j);
        return aobj2;
    }

    private a b()
    {
        a a1;
        try
        {
            a1 = a(1, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return a1;
    }

    private a c()
    {
        a a1;
        try
        {
            a1 = a(2, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return a1;
    }

    public final void a()
    {
        b.lock();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.g())
            {
                super.offer(a1);
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
        b.unlock();
        return;
    }

    public void clear()
    {
        b.lock();
        a.clear();
        super.clear();
        b.unlock();
        return;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public boolean contains(Object obj)
    {
        b.lock();
        if (super.contains(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = a.contains(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        b.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        b.unlock();
        throw obj;
    }

    public int drainTo(Collection collection)
    {
        int i;
        int j;
        b.lock();
        i = super.drainTo(collection);
        j = a.size();
        for (; !a.isEmpty(); collection.add(a.poll())) { }
        break MISSING_BLOCK_LABEL_64;
        collection;
        b.unlock();
        throw collection;
        b.unlock();
        return i + j;
    }

    public int drainTo(Collection collection, int i)
    {
        int j;
        b.lock();
        j = super.drainTo(collection, i);
_L2:
        if (a.isEmpty() || j > i)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(a.poll());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        b.unlock();
        return j;
        collection;
        b.unlock();
        throw collection;
    }

    public Object peek()
    {
        return b();
    }

    public Object poll()
    {
        return c();
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return a(3, Long.valueOf(l), timeunit);
    }

    public boolean remove(Object obj)
    {
        b.lock();
        if (super.remove(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = a.remove(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        b.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        b.unlock();
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        boolean flag1;
        b.lock();
        flag = super.removeAll(collection);
        flag1 = a.removeAll(collection);
        b.unlock();
        return flag | flag1;
        collection;
        b.unlock();
        throw collection;
    }

    public int size()
    {
        int i;
        int j;
        b.lock();
        i = a.size();
        j = super.size();
        b.unlock();
        return i + j;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public Object take()
        throws InterruptedException
    {
        return a(0, null, null);
    }

    public Object[] toArray()
    {
        Object aobj[];
        b.lock();
        aobj = a(super.toArray(), a.toArray());
        b.unlock();
        return aobj;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        b.lock();
        aobj = a(super.toArray(aobj), a.toArray(aobj));
        b.unlock();
        return aobj;
        aobj;
        b.unlock();
        throw aobj;
    }
}
