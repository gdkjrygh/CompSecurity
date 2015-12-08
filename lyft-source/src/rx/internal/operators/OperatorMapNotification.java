// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func0;
import rx.functions.Func1;

public final class OperatorMapNotification
    implements rx.Observable.Operator
{

    private final Func0 onCompleted;
    private final Func1 onError;
    private final Func1 onNext;

    public OperatorMapNotification(Func1 func1, Func1 func1_1, Func0 func0)
    {
        onNext = func1;
        onError = func1_1;
        onCompleted = func0;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber o)
    {
        Subscriber subscriber = new Subscriber() {

            SingleEmitter emitter;
            final OperatorMapNotification this$0;
            final Subscriber val$o;

            public void onCompleted()
            {
                try
                {
                    emitter.offerAndComplete(OperatorMapNotification.this.onCompleted.call());
                    return;
                }
                catch (Throwable throwable)
                {
                    o.onError(throwable);
                }
            }

            public void onError(Throwable throwable)
            {
                try
                {
                    emitter.offerAndComplete(OperatorMapNotification.this.onError.call(throwable));
                    return;
                }
                catch (Throwable throwable1)
                {
                    o.onError(throwable);
                }
            }

            public void onNext(Object obj)
            {
                try
                {
                    emitter.offer(OperatorMapNotification.this.onNext.call(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    o.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
            }

            public void setProducer(Producer producer)
            {
                emitter = new SingleEmitter(o, producer, this);
                o.setProducer(emitter);
            }

            
            {
                this$0 = OperatorMapNotification.this;
                o = subscriber;
                super();
            }

            private class SingleEmitter extends AtomicLong
                implements Producer, Subscription
            {

                private static final long serialVersionUID = 0xfc8848db9615d8dcL;
                final Subscription cancel;
                final Subscriber child;
                volatile boolean complete;
                boolean emitting;
                boolean missed;
                final NotificationLite nl = NotificationLite.instance();
                final Producer producer;
                final Queue queue;

                void drain()
                {
                    boolean flag = true;
                    boolean flag1 = false;
                    this;
                    JVM INSTR monitorenter ;
                    if (!emitting)
                    {
                        break MISSING_BLOCK_LABEL_21;
                    }
                    missed = true;
                    this;
                    JVM INSTR monitorexit ;
                    return;
                    emitting = true;
                    missed = false;
                    this;
                    JVM INSTR monitorexit ;
_L13:
                    long l;
                    boolean flag2;
                    boolean flag3;
                    l = get();
                    flag2 = complete;
                    flag3 = queue.isEmpty();
                    if (!flag2 || !flag3) goto _L2; else goto _L1
_L1:
                    child.onCompleted();
                    return;
                    Exception exception;
                    exception;
                    flag = flag1;
_L11:
                    if (flag) goto _L4; else goto _L3
_L3:
                    this;
                    JVM INSTR monitorenter ;
                    emitting = false;
                    this;
                    JVM INSTR monitorexit ;
_L4:
                    throw exception;
                    exception;
                    this;
                    JVM INSTR monitorexit ;
                    throw exception;
_L2:
                    if (l <= 0L) goto _L6; else goto _L5
_L5:
                    Object obj = queue.poll();
                    if (obj == null) goto _L8; else goto _L7
_L7:
                    child.onNext(nl.getValue(obj));
                    produced(1L);
_L6:
                    this;
                    JVM INSTR monitorenter ;
                    flag2 = missed;
                    if (flag2) goto _L10; else goto _L9
_L9:
                    flag1 = flag;
                    emitting = false;
                    flag1 = flag;
                    this;
                    JVM INSTR monitorexit ;
                    return;
_L14:
                    flag1 = flag;
                    this;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                      goto _L11
_L8:
                    if (!flag2) goto _L6; else goto _L12
_L12:
                    child.onCompleted();
                    return;
_L10:
                    missed = false;
                    this;
                    JVM INSTR monitorexit ;
                      goto _L13
                    obj;
                    flag = false;
                      goto _L14
                    obj;
                    this;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    flag = flag1;
                      goto _L14
                }

                public boolean isUnsubscribed()
                {
                    return get() < 0L;
                }

                public void offer(Object obj)
                {
                    if (!queue.offer(obj))
                    {
                        child.onError(new MissingBackpressureException());
                        unsubscribe();
                        return;
                    } else
                    {
                        drain();
                        return;
                    }
                }

                public void offerAndComplete(Object obj)
                {
                    if (!queue.offer(obj))
                    {
                        child.onError(new MissingBackpressureException());
                        unsubscribe();
                        return;
                    } else
                    {
                        complete = true;
                        drain();
                        return;
                    }
                }

                void produced(long l)
                {
                    long l1;
                    long l2;
                    do
                    {
                        l1 = get();
                        if (l1 < 0L)
                        {
                            return;
                        }
                        l2 = l1 - l;
                        if (l2 < 0L)
                        {
                            throw new IllegalStateException((new StringBuilder()).append("More produced (").append(l).append(") than requested (").append(l1).append(")").toString());
                        }
                    } while (!compareAndSet(l1, l2));
                }

                public void request(long l)
                {
                    long l1;
                    long l3;
                    do
                    {
                        l3 = get();
                        if (l3 < 0L)
                        {
                            return;
                        }
                        long l2 = l3 + l;
                        l1 = l2;
                        if (l2 < 0L)
                        {
                            l1 = 0x7fffffffffffffffL;
                        }
                    } while (!compareAndSet(l3, l1));
                    producer.request(l);
                    drain();
                }

                public void unsubscribe()
                {
                    if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
                    {
                        cancel.unsubscribe();
                    }
                }

                public SingleEmitter(Subscriber subscriber, Producer producer1, Subscription subscription)
                {
                    child = subscriber;
                    producer = producer1;
                    cancel = subscription;
                    if (UnsafeAccess.isUnsafeAvailable())
                    {
                        subscriber = new SpscArrayQueue(2);
                    } else
                    {
                        subscriber = new ConcurrentLinkedQueue();
                    }
                    queue = subscriber;
                }
            }

        };
        o.add(subscriber);
        return subscriber;
    }



}
