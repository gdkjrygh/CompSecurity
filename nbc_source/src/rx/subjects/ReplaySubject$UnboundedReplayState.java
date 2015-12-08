// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Observer;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class list
    implements list
{

    static final AtomicIntegerFieldUpdater INDEX_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/subjects/ReplaySubject$UnboundedReplayState, "index");
    volatile int index;
    private final ArrayList list;
    private final NotificationLite nl = NotificationLite.instance();
    private volatile boolean terminated;

    public void accept(Observer observer, int i)
    {
        nl.accept(observer, list.get(i));
    }

    public void complete()
    {
        if (!terminated)
        {
            terminated = true;
            list.add(nl.completed());
            INDEX_UPDATER.getAndIncrement(this);
        }
    }

    public void error(Throwable throwable)
    {
        if (!terminated)
        {
            terminated = true;
            list.add(nl.error(throwable));
            INDEX_UPDATER.getAndIncrement(this);
        }
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Object latest()
    {
        Object obj;
label0:
        {
            Object obj1 = null;
            int i = index;
            obj = obj1;
            if (i > 0)
            {
                obj = list.get(i - 1);
                if (!nl.isCompleted(obj) && !nl.isError(obj))
                {
                    break label0;
                }
                obj = obj1;
                if (i > 1)
                {
                    obj = nl.getValue(list.get(i - 2));
                }
            }
            return obj;
        }
        return nl.getValue(obj);
    }

    public void next(Object obj)
    {
        if (!terminated)
        {
            list.add(nl.next(obj));
            INDEX_UPDATER.getAndIncrement(this);
        }
    }

    public boolean replayObserver(bserver bserver)
    {
        bserver;
        JVM INSTR monitorenter ;
        bserver.first = false;
        if (!bserver.emitting)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        bserver;
        JVM INSTR monitorexit ;
        return false;
        bserver;
        JVM INSTR monitorexit ;
        Integer integer = (Integer)bserver.index();
        Exception exception;
        if (integer != null)
        {
            bserver.index(Integer.valueOf(replayObserverFromIndex(integer, bserver).intValue()));
            return true;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("failed to find lastEmittedLink for: ").append(bserver).toString());
        }
        exception;
        bserver;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Integer replayObserverFromIndex(Integer integer, bserver bserver)
    {
        int i;
        for (i = integer.intValue(); i < index; i++)
        {
            accept(bserver, i);
        }

        return Integer.valueOf(i);
    }

    public volatile Object replayObserverFromIndex(Object obj, bserver bserver)
    {
        return replayObserverFromIndex((Integer)obj, bserver);
    }

    public Integer replayObserverFromIndexTest(Integer integer, bserver bserver, long l)
    {
        return replayObserverFromIndex(integer, bserver);
    }

    public volatile Object replayObserverFromIndexTest(Object obj, bserver bserver, long l)
    {
        return replayObserverFromIndexTest((Integer)obj, bserver, l);
    }

    public int size()
    {
        int i;
label0:
        {
            int j = index;
            i = j;
            if (j <= 0)
            {
                break label0;
            }
            Object obj = list.get(j - 1);
            if (!nl.isCompleted(obj))
            {
                i = j;
                if (!nl.isError(obj))
                {
                    break label0;
                }
            }
            i = j - 1;
        }
        return i;
    }

    public boolean terminated()
    {
        return terminated;
    }

    public Object[] toArray(Object aobj[])
    {
        int j = size();
        Object aobj2[];
        if (j > 0)
        {
            Object aobj1[] = aobj;
            if (j > aobj.length)
            {
                aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
            }
            for (int i = 0; i < j; i++)
            {
                aobj1[i] = list.get(i);
            }

            aobj2 = aobj1;
            if (aobj1.length > j)
            {
                aobj1[j] = null;
                aobj2 = aobj1;
            }
        } else
        {
            aobj2 = aobj;
            if (aobj.length > 0)
            {
                aobj[0] = null;
                return aobj;
            }
        }
        return aobj2;
    }


    public bserver(int i)
    {
        list = new ArrayList(i);
    }
}
