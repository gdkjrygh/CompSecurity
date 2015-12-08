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
//            Task

public class DependencyPriorityBlockingQueue extends PriorityBlockingQueue
    implements Task.OnCompletionListener
{

    static final int PEEK = 1;
    static final int POLL = 2;
    static final int POLL_WITH_TIMEOUT = 3;
    static final int TAKE = 0;
    final Queue blockedQueue = new LinkedList();
    private final ReentrantLock lock = new ReentrantLock();

    public DependencyPriorityBlockingQueue()
    {
    }

    boolean canProcess(Object obj)
    {
        return !(obj instanceof Task) || ((Task)obj).canProcess();
    }

    public void clear()
    {
        lock.lock();
        blockedQueue.clear();
        super.clear();
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    Object[] concatenate(Object aobj[], Object aobj1[])
    {
        int i = aobj.length;
        int j = aobj1.length;
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + j);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, i);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), i, j);
        return aobj2;
    }

    public boolean contains(Object obj)
    {
        lock.lock();
        if (super.contains(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = blockedQueue.contains(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        lock.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        lock.unlock();
        throw obj;
    }

    public int drainTo(Collection collection)
    {
        int i;
        int j;
        lock.lock();
        i = super.drainTo(collection);
        j = blockedQueue.size();
        for (; !blockedQueue.isEmpty(); collection.add(blockedQueue.poll())) { }
        break MISSING_BLOCK_LABEL_64;
        collection;
        lock.unlock();
        throw collection;
        lock.unlock();
        return i + j;
    }

    public int drainTo(Collection collection, int i)
    {
        int j;
        lock.lock();
        j = super.drainTo(collection, i);
_L2:
        if (blockedQueue.isEmpty() || j > i)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(blockedQueue.poll());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return j;
        collection;
        lock.unlock();
        throw collection;
    }

    Object get(int i, Long long1, TimeUnit timeunit)
        throws InterruptedException
    {
        do
        {
            Object obj;
label0:
            {
                obj = performOperation(i, long1, timeunit);
                if (obj != null)
                {
                    if (obj instanceof Task)
                    {
                        ((Task)obj).addCompletionListener(this);
                    }
                    if (!canProcess(obj))
                    {
                        break label0;
                    }
                }
                return obj;
            }
            offerBlockedResult(i, obj);
        } while (true);
    }

    boolean offerBlockedResult(int i, Object obj)
    {
        lock.lock();
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        super.remove(obj);
        boolean flag = blockedQueue.offer(obj);
        lock.unlock();
        return flag;
        obj;
        lock.unlock();
        throw obj;
    }

    public void onComplete(Object obj)
    {
        lock.lock();
        obj = blockedQueue.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = ((Iterator) (obj)).next();
            if (canProcess(obj1))
            {
                super.offer(obj1);
                ((Iterator) (obj)).remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_66;
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return;
    }

    public Object peek()
    {
        Object obj;
        try
        {
            obj = get(1, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return obj;
    }

    Object performOperation(int i, Long long1, TimeUnit timeunit)
        throws InterruptedException
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return super.take();

        case 1: // '\001'
            return super.peek();

        case 2: // '\002'
            return super.poll();

        case 3: // '\003'
            return super.poll(long1.longValue(), timeunit);
        }
    }

    public Object poll()
    {
        Object obj;
        try
        {
            obj = get(2, null, null);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return obj;
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return get(3, Long.valueOf(l), timeunit);
    }

    public boolean remove(Object obj)
    {
        lock.lock();
        if (super.remove(obj)) goto _L2; else goto _L1
_L1:
        boolean flag = blockedQueue.remove(obj);
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        lock.unlock();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        lock.unlock();
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        boolean flag1;
        lock.lock();
        flag = super.removeAll(collection);
        flag1 = blockedQueue.removeAll(collection);
        lock.unlock();
        return flag | flag1;
        collection;
        lock.unlock();
        throw collection;
    }

    public int size()
    {
        int i;
        int j;
        lock.lock();
        i = blockedQueue.size();
        j = super.size();
        lock.unlock();
        return i + j;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object take()
        throws InterruptedException
    {
        return get(0, null, null);
    }

    public Object[] toArray()
    {
        Object aobj[];
        lock.lock();
        aobj = concatenate(super.toArray(), blockedQueue.toArray());
        lock.unlock();
        return aobj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        lock.lock();
        aobj = concatenate(super.toArray(aobj), blockedQueue.toArray(aobj));
        lock.unlock();
        return aobj;
        aobj;
        lock.unlock();
        throw aobj;
    }
}
