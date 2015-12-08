// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

public final class OperatorOnBackpressureLatest
    implements rx.Observable.Operator
{

    public OperatorOnBackpressureLatest()
    {
    }

    public static OperatorOnBackpressureLatest instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        LatestEmitter latestemitter = new LatestEmitter(subscriber);
        LatestSubscriber latestsubscriber = new LatestSubscriber(latestemitter);
        latestemitter.parent = latestsubscriber;
        subscriber.add(latestsubscriber);
        subscriber.add(latestemitter);
        subscriber.setProducer(latestemitter);
        return latestsubscriber;
    }

    private class Holder
    {

        static final OperatorOnBackpressureLatest INSTANCE = new OperatorOnBackpressureLatest();


        Holder()
        {
        }
    }


    private class LatestEmitter extends AtomicLong
        implements Observer, Producer, Subscription
    {

        static final Object EMPTY = new Object();
        static final long NOT_REQUESTED = 0xc000000000000000L;
        private static final long serialVersionUID = 0xed10b32c1f7b675eL;
        final Subscriber child;
        volatile boolean done;
        boolean emitting;
        boolean missed;
        LatestSubscriber parent;
        Throwable terminal;
        final AtomicReference value;

        void emit()
        {
            boolean flag1 = true;
            boolean flag = false;
            this;
            JVM INSTR monitorenter ;
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_22;
            }
            missed = true;
            this;
            JVM INSTR monitorexit ;
            return;
            emitting = true;
            missed = false;
            this;
            JVM INSTR monitorexit ;
_L14:
            long l = get();
            if (l != 0x8000000000000000L) goto _L2; else goto _L1
_L1:
            if (true) goto _L4; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            Object obj1 = value.get();
            Object obj;
            obj = obj1;
            if (l <= 0L)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            obj = obj1;
            if (obj1 != EMPTY)
            {
                child.onNext(obj1);
                value.compareAndSet(obj1, EMPTY);
                produced(1L);
                obj = EMPTY;
            }
            if (obj != EMPTY || !done) goto _L6; else goto _L5
_L5:
            obj = terminal;
            if (obj == null) goto _L8; else goto _L7
_L7:
            child.onError(((Throwable) (obj)));
_L6:
            this;
            JVM INSTR monitorenter ;
            if (missed) goto _L10; else goto _L9
_L9:
            emitting = false;
            this;
            JVM INSTR monitorexit ;
              goto _L1
_L15:
            flag1 = flag;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
_L13:
            if (flag) goto _L12; else goto _L11
_L11:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L12:
            throw obj;
_L8:
            child.onCompleted();
              goto _L6
            obj;
              goto _L13
_L10:
            missed = false;
            this;
            JVM INSTR monitorexit ;
              goto _L14
            obj;
            flag = false;
              goto _L15
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            return;
            obj;
            flag = flag1;
              goto _L15
        }

        public boolean isUnsubscribed()
        {
            return get() == 0x8000000000000000L;
        }

        public void onCompleted()
        {
            done = true;
            emit();
        }

        public void onError(Throwable throwable)
        {
            terminal = throwable;
            done = true;
            emit();
        }

        public void onNext(Object obj)
        {
            value.lazySet(obj);
            emit();
        }

        long produced(long l)
        {
            long l1;
            long l2;
            do
            {
                l1 = get();
                if (l1 < 0L)
                {
                    return l1;
                }
                l2 = l1 - l;
            } while (!compareAndSet(l1, l2));
            return l2;
        }

        public void request(long l)
        {
            if (l < 0L) goto _L2; else goto _L1
_L1:
            long l3 = get();
            if (l3 != 0x8000000000000000L) goto _L3; else goto _L2
_L2:
            return;
_L3:
            long l1;
            if (l3 != 0xc000000000000000L)
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = l;
_L5:
            if (compareAndSet(l3, l1))
            {
                if (l3 == 0xc000000000000000L)
                {
                    parent.requestMore(0x7fffffffffffffffL);
                }
                emit();
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
              goto _L5
            if (true) goto _L1; else goto _L6
_L6:
        }

        public void unsubscribe()
        {
            if (get() >= 0L)
            {
                getAndSet(0x8000000000000000L);
            }
        }


        public LatestEmitter(Subscriber subscriber)
        {
            child = subscriber;
            value = new AtomicReference(EMPTY);
            lazySet(0xc000000000000000L);
        }
    }


    private class LatestSubscriber extends Subscriber
    {

        private final LatestEmitter producer;

        public void onCompleted()
        {
            producer.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            producer.onError(throwable);
        }

        public void onNext(Object obj)
        {
            producer.onNext(obj);
        }

        public void onStart()
        {
            request(0L);
        }

        void requestMore(long l)
        {
            request(l);
        }

        private LatestSubscriber(LatestEmitter latestemitter)
        {
            producer = latestemitter;
        }

    }

}
