// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

public class OperatorOnBackpressureBuffer
    implements rx.Observable.Operator
{

    private final Long capacity;
    private final Action0 onOverflow;

    private OperatorOnBackpressureBuffer()
    {
        capacity = null;
        onOverflow = null;
    }

    public OperatorOnBackpressureBuffer(long l)
    {
        this(l, null);
    }

    public OperatorOnBackpressureBuffer(long l, Action0 action0)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        } else
        {
            capacity = Long.valueOf(l);
            onOverflow = action0;
            return;
        }
    }


    public static OperatorOnBackpressureBuffer instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        BufferSubscriber buffersubscriber = new BufferSubscriber(subscriber, capacity, onOverflow);
        subscriber.add(buffersubscriber);
        subscriber.setProducer(buffersubscriber.manager());
        return buffersubscriber;
    }

    private class Holder
    {

        static final OperatorOnBackpressureBuffer INSTANCE = new OperatorOnBackpressureBuffer();


        private Holder()
        {
        }
    }


    private class BufferSubscriber extends Subscriber
        implements rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
    {

        private final Long baseCapacity;
        private final AtomicLong capacity;
        private final Subscriber child;
        private final BackpressureDrainManager manager = new BackpressureDrainManager(this);
        private final NotificationLite on = NotificationLite.instance();
        private final Action0 onOverflow;
        private final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        private final AtomicBoolean saturated = new AtomicBoolean(false);

        private boolean assertCapacity()
        {
            if (capacity == null)
            {
                return true;
            }
            long l;
            do
            {
                l = capacity.get();
                if (l <= 0L)
                {
                    if (saturated.compareAndSet(false, true))
                    {
                        unsubscribe();
                        child.onError(new MissingBackpressureException((new StringBuilder()).append("Overflowed buffer of ").append(baseCapacity).toString()));
                        if (onOverflow != null)
                        {
                            onOverflow.call();
                        }
                    }
                    return false;
                }
            } while (!capacity.compareAndSet(l, l - 1L));
            return true;
        }

        public boolean accept(Object obj)
        {
            return on.accept(child, obj);
        }

        public void complete(Throwable throwable)
        {
            if (throwable != null)
            {
                child.onError(throwable);
                return;
            } else
            {
                child.onCompleted();
                return;
            }
        }

        protected Producer manager()
        {
            return manager;
        }

        public void onCompleted()
        {
            if (!saturated.get())
            {
                manager.terminateAndDrain();
            }
        }

        public void onError(Throwable throwable)
        {
            if (!saturated.get())
            {
                manager.terminateAndDrain(throwable);
            }
        }

        public void onNext(Object obj)
        {
            if (!assertCapacity())
            {
                return;
            } else
            {
                queue.offer(on.next(obj));
                manager.drain();
                return;
            }
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        public Object peek()
        {
            return queue.peek();
        }

        public Object poll()
        {
            Object obj = queue.poll();
            if (capacity != null && obj != null)
            {
                capacity.incrementAndGet();
            }
            return obj;
        }

        public BufferSubscriber(Subscriber subscriber, Long long1, Action0 action0)
        {
            child = subscriber;
            baseCapacity = long1;
            if (long1 != null)
            {
                subscriber = new AtomicLong(long1.longValue());
            } else
            {
                subscriber = null;
            }
            capacity = subscriber;
            onOverflow = action0;
        }
    }

}
