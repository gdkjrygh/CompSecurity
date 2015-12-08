// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.io.PrintStream;
import java.util.Queue;
import rx.Observer;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.util:
//            PlatformDependent, SynchronizedQueue, ObjectPool

public class RxRingBuffer
    implements Subscription
{

    public static final int SIZE;
    private static ObjectPool SPMC_POOL = new ObjectPool() {

        protected volatile Object createObject()
        {
            return createObject();
        }

        protected SpmcArrayQueue createObject()
        {
            return new SpmcArrayQueue(RxRingBuffer.SIZE);
        }

    };
    private static ObjectPool SPSC_POOL = new ObjectPool() {

        protected volatile Object createObject()
        {
            return createObject();
        }

        protected SpscArrayQueue createObject()
        {
            return new SpscArrayQueue(RxRingBuffer.SIZE);
        }

    };
    static int _size;
    private static final NotificationLite on = NotificationLite.instance();
    private final ObjectPool pool;
    private Queue queue;
    private final int size;
    public volatile Object terminalState;

    RxRingBuffer()
    {
        this(((Queue) (new SynchronizedQueue(SIZE))), SIZE);
    }

    private RxRingBuffer(Queue queue1, int i)
    {
        queue = queue1;
        pool = null;
        size = i;
    }

    private RxRingBuffer(ObjectPool objectpool, int i)
    {
        pool = objectpool;
        queue = (Queue)objectpool.borrowObject();
        size = i;
    }

    public static RxRingBuffer getSpmcInstance()
    {
        if (UnsafeAccess.isUnsafeAvailable())
        {
            return new RxRingBuffer(SPMC_POOL, SIZE);
        } else
        {
            return new RxRingBuffer();
        }
    }

    public static RxRingBuffer getSpscInstance()
    {
        if (UnsafeAccess.isUnsafeAvailable())
        {
            return new RxRingBuffer(SPSC_POOL, SIZE);
        } else
        {
            return new RxRingBuffer();
        }
    }

    public boolean accept(Object obj, Observer observer)
    {
        return on.accept(observer, obj);
    }

    public Throwable asError(Object obj)
    {
        return on.getError(obj);
    }

    public int available()
    {
        return size - count();
    }

    public int capacity()
    {
        return size;
    }

    public int count()
    {
        Queue queue1 = queue;
        if (queue1 == null)
        {
            return 0;
        } else
        {
            return queue1.size();
        }
    }

    public Object getValue(Object obj)
    {
        return on.getValue(obj);
    }

    public boolean isCompleted(Object obj)
    {
        return on.isCompleted(obj);
    }

    public boolean isEmpty()
    {
        Queue queue1 = queue;
        if (queue1 == null)
        {
            return true;
        } else
        {
            return queue1.isEmpty();
        }
    }

    public boolean isError(Object obj)
    {
        return on.isError(obj);
    }

    public boolean isUnsubscribed()
    {
        return queue == null;
    }

    public void onCompleted()
    {
        if (terminalState == null)
        {
            terminalState = on.completed();
        }
    }

    public void onError(Throwable throwable)
    {
        if (terminalState == null)
        {
            terminalState = on.error(throwable);
        }
    }

    public void onNext(Object obj)
        throws MissingBackpressureException
    {
        boolean flag1 = false;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Queue queue1 = queue;
        if (queue1 == null) goto _L2; else goto _L1
_L1:
        if (!queue1.offer(on.next(obj)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag1)
        {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag1 = true;
        if (true) goto _L4; else goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        if (flag)
        {
            throw new MissingBackpressureException();
        } else
        {
            return;
        }
    }

    public Object peek()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue1 = queue;
        if (queue1 != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj1;
        Object obj2;
        obj1 = queue1.peek();
        obj2 = terminalState;
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = obj1;
        if (queue1.peek() == null)
        {
            obj = obj2;
        }
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object poll()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue1 = queue;
        if (queue1 != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj1;
        Object obj2;
        obj1 = queue1.poll();
        obj2 = terminalState;
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = obj1;
        if (queue1.peek() != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = obj2;
        terminalState = null;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue1;
        ObjectPool objectpool;
        queue1 = queue;
        objectpool = pool;
        if (objectpool == null || queue1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        queue1.clear();
        queue = null;
        objectpool.returnObject(queue1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void unsubscribe()
    {
        release();
    }

    static 
    {
        _size = 128;
        if (PlatformDependent.isAndroid())
        {
            _size = 16;
        }
        String s = System.getProperty("rx.ring-buffer.size");
        if (s != null)
        {
            try
            {
                _size = Integer.parseInt(s);
            }
            catch (Exception exception)
            {
                System.err.println((new StringBuilder()).append("Failed to set 'rx.buffer.size' with value ").append(s).append(" => ").append(exception.getMessage()).toString());
            }
        }
        SIZE = _size;
    }
}
