// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;

public final class OperatorPublish extends ConnectableObservable
{

    final AtomicReference current;
    final Observable source;

    private OperatorPublish(rx.Observable.OnSubscribe onsubscribe, Observable observable, AtomicReference atomicreference)
    {
        super(onsubscribe);
        source = observable;
        current = atomicreference;
    }

    public static Observable create(final Observable source, final Func1 selector)
    {
        return create(new rx.Observable.OnSubscribe() {

            final Func1 val$selector;
            final Observable val$source;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                ConnectableObservable connectableobservable = OperatorPublish.create(source);
                ((Observable)selector.call(connectableobservable)).unsafeSubscribe(subscriber);
                connectableobservable.connect(subscriber. new Action1() {

                    final _cls2 this$0;
                    final Subscriber val$child;

                    public volatile void call(Object obj)
                    {
                        call((Subscription)obj);
                    }

                    public void call(Subscription subscription)
                    {
                        child.add(subscription);
                    }

            
            {
                this$0 = final__pcls2;
                child = Subscriber.this;
                super();
            }
                });
            }

            
            {
                source = observable;
                selector = func1;
                super();
            }
        });
    }

    public static ConnectableObservable create(Observable observable)
    {
        final AtomicReference curr = new AtomicReference();
        return new OperatorPublish(new rx.Observable.OnSubscribe() {

            final AtomicReference val$curr;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                PublishSubscriber publishsubscriber;
                Object obj;
                do
                {
                    do
                    {
                        obj = (PublishSubscriber)curr.get();
                        if (obj != null)
                        {
                            publishsubscriber = ((PublishSubscriber) (obj));
                            if (!((PublishSubscriber) (obj)).isUnsubscribed())
                            {
                                break;
                            }
                        }
                        publishsubscriber = new PublishSubscriber(curr);
                        publishsubscriber.init();
                    } while (!curr.compareAndSet(obj, publishsubscriber));
                    obj = new InnerProducer(publishsubscriber, subscriber);
                } while (!publishsubscriber.add(((InnerProducer) (obj))));
                subscriber.add(((Subscription) (obj)));
                subscriber.setProducer(((Producer) (obj)));
            }

            
            {
                curr = atomicreference;
                super();
            }

            private class PublishSubscriber extends Subscriber
                implements Subscription
            {

                static final InnerProducer EMPTY[] = new InnerProducer[0];
                static final InnerProducer TERMINATED[] = new InnerProducer[0];
                final AtomicReference current;
                boolean emitting;
                boolean missed;
                final NotificationLite nl = NotificationLite.instance();
                final AtomicReference producers;
                final Queue queue;
                final AtomicBoolean shouldConnect = new AtomicBoolean();
                volatile Object terminalEvent;

                boolean add(InnerProducer innerproducer)
                {
                    if (innerproducer == null)
                    {
                        throw new NullPointerException();
                    }
                    InnerProducer ainnerproducer[];
                    InnerProducer ainnerproducer1[];
                    do
                    {
                        ainnerproducer = (InnerProducer[])producers.get();
                        if (ainnerproducer == TERMINATED)
                        {
                            return false;
                        }
                        int i = ainnerproducer.length;
                        ainnerproducer1 = new InnerProducer[i + 1];
                        System.arraycopy(ainnerproducer, 0, ainnerproducer1, 0, i);
                        ainnerproducer1[i] = innerproducer;
                    } while (!producers.compareAndSet(ainnerproducer, ainnerproducer1));
                    return true;
                }

                boolean checkTerminated(Object obj, boolean flag)
                {
                    int i;
                    int j;
                    j = 0;
                    i = 0;
                    if (obj == null)
                    {
                        break MISSING_BLOCK_LABEL_173;
                    }
                    if (!nl.isCompleted(obj))
                    {
                        break MISSING_BLOCK_LABEL_92;
                    }
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_173;
                    }
                    current.compareAndSet(this, null);
                    obj = (InnerProducer[])producers.getAndSet(TERMINATED);
                    j = obj.length;
_L2:
                    if (i >= j)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    ((InnerProducer) (obj[i])).child.onCompleted();
                    i++;
                    if (true) goto _L2; else goto _L1
_L1:
                    unsubscribe();
                    return true;
                    obj;
                    unsubscribe();
                    throw obj;
                    obj = nl.getError(obj);
                    current.compareAndSet(this, null);
                    InnerProducer ainnerproducer[];
                    int k;
                    ainnerproducer = (InnerProducer[])producers.getAndSet(TERMINATED);
                    k = ainnerproducer.length;
                    i = j;
_L4:
                    if (i >= k)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    ainnerproducer[i].child.onError(((Throwable) (obj)));
                    i++;
                    if (true) goto _L4; else goto _L3
_L3:
                    unsubscribe();
                    return true;
                    obj;
                    unsubscribe();
                    throw obj;
                    return false;
                }

                void dispatch()
                {
                    this;
                    JVM INSTR monitorenter ;
                    if (!emitting)
                    {
                        break MISSING_BLOCK_LABEL_17;
                    }
                    missed = true;
                    this;
                    JVM INSTR monitorexit ;
                    return;
                    emitting = true;
                    missed = false;
                    this;
                    JVM INSTR monitorexit ;
                    boolean flag = false;
_L11:
                    Object obj;
                    boolean flag1;
                    obj = terminalEvent;
                    flag1 = queue.isEmpty();
                    if (checkTerminated(obj, flag1)) goto _L2; else goto _L1
_L1:
                    if (flag1) goto _L4; else goto _L3
_L3:
                    int l;
                    int i1;
                    obj = (InnerProducer[])producers.get();
                    l = obj.length;
                    i1 = obj.length;
                    int i;
                    int j;
                    long l1;
                    j = 0;
                    l1 = 0x7fffffffffffffffL;
                    i = 0;
_L6:
                    if (i >= i1)
                    {
                        break MISSING_BLOCK_LABEL_181;
                    }
                    long l4 = obj[i].get();
                    if (l4 < 0L)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    long l2 = Math.min(l1, l4);
                    int k = j;
_L7:
                    i++;
                    j = k;
                    l1 = l2;
                    if (true) goto _L6; else goto _L5
                    obj;
                    this;
                    JVM INSTR monitorexit ;
                    throw obj;
_L5:
                    k = j;
                    l2 = l1;
                    if (l4 == 0x8000000000000000L)
                    {
                        k = j + 1;
                        l2 = l1;
                    }
                      goto _L7
                    if (l != j) goto _L9; else goto _L8
_L8:
                    obj = terminalEvent;
                    if (queue.poll() == null)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (checkTerminated(obj, flag1)) goto _L2; else goto _L10
_L10:
                    request(1L);
                      goto _L11
                    obj;
                    i = ((flag) ? 1 : 0);
_L22:
                    if (i != 0) goto _L13; else goto _L12
_L12:
                    this;
                    JVM INSTR monitorenter ;
                    emitting = false;
                    this;
                    JVM INSTR monitorexit ;
_L13:
                    throw obj;
_L9:
                    i = 0;
_L23:
                    if ((long)i >= l1) goto _L15; else goto _L14
_L14:
                    Object obj1;
                    Object obj2;
                    obj1 = terminalEvent;
                    obj2 = queue.poll();
                    if (obj2 == null)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (checkTerminated(obj1, flag1)) goto _L2; else goto _L16
_L16:
                    if (!flag1) goto _L17; else goto _L15
_L15:
                    if (i <= 0) goto _L19; else goto _L18
_L18:
                    request(i);
                      goto _L19
_L4:
                    this;
                    JVM INSTR monitorenter ;
                    if (missed) goto _L21; else goto _L20
_L20:
                    emitting = false;
                    j = 1;
                    this;
                    JVM INSTR monitorexit ;
                    return;
_L24:
                    j = i;
                    this;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                      goto _L22
_L17:
                    obj1 = nl.getValue(obj2);
                    k = obj.length;
                    Exception exception;
                    InnerProducer innerproducer;
                    Throwable throwable;
                    long l3;
                    for (j = 0; j >= k; j++)
                    {
                        break MISSING_BLOCK_LABEL_431;
                    }

                    innerproducer = obj[j];
                    l3 = innerproducer.get();
                    if (l3 <= 0L)
                    {
                        break MISSING_BLOCK_LABEL_489;
                    }
                    innerproducer.child.onNext(obj1);
                    innerproducer.produced(1L);
                    break MISSING_BLOCK_LABEL_489;
                    throwable;
                    innerproducer.unsubscribe();
                    innerproducer.child.onError(throwable);
                    break MISSING_BLOCK_LABEL_489;
                    i++;
                      goto _L23
_L21:
                    missed = false;
                    this;
                    JVM INSTR monitorexit ;
                    break; /* Loop/switch isn't completed */
                    obj;
                    i = 0;
                      goto _L24
                    exception;
                    this;
                    JVM INSTR monitorexit ;
                    throw exception;
_L2:
                    return;
_L19:
                    if (l1 != 0L && !flag1) goto _L11; else goto _L4
                    exception;
                    i = j;
                      goto _L24
                }

                void init()
                {
                    add(Subscriptions.create(new Action0() {

                        final PublishSubscriber this$0;

                        public void call()
                        {
                            producers.getAndSet(PublishSubscriber.TERMINATED);
                            current.compareAndSet(PublishSubscriber.this, null);
                        }

                        
                        {
                            this$0 = PublishSubscriber.this;
                            super();
                        }
                    }));
                }

                public void onCompleted()
                {
                    if (terminalEvent == null)
                    {
                        terminalEvent = nl.completed();
                        dispatch();
                    }
                }

                public void onError(Throwable throwable)
                {
                    if (terminalEvent == null)
                    {
                        terminalEvent = nl.error(throwable);
                        dispatch();
                    }
                }

                public void onNext(Object obj)
                {
                    if (!queue.offer(nl.next(obj)))
                    {
                        onError(new MissingBackpressureException());
                        return;
                    } else
                    {
                        dispatch();
                        return;
                    }
                }

                public void onStart()
                {
                    request(RxRingBuffer.SIZE);
                }

                void remove(InnerProducer innerproducer)
                {
_L4:
                    InnerProducer ainnerproducer1[] = (InnerProducer[])producers.get();
                    if (ainnerproducer1 != EMPTY && ainnerproducer1 != TERMINATED) goto _L2; else goto _L1
_L1:
                    return;
_L2:
                    int i;
                    byte byte0;
                    int k;
                    byte0 = -1;
                    k = ainnerproducer1.length;
                    i = 0;
_L5:
                    int j;
                    j = byte0;
                    if (i >= k)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    if (!ainnerproducer1[i].equals(innerproducer))
                    {
                        break MISSING_BLOCK_LABEL_90;
                    }
                    j = i;
                    if (j < 0) goto _L1; else goto _L3
_L3:
                    InnerProducer ainnerproducer[];
                    if (k == 1)
                    {
                        ainnerproducer = EMPTY;
                    } else
                    {
                        ainnerproducer = new InnerProducer[k - 1];
                        System.arraycopy(ainnerproducer1, 0, ainnerproducer, 0, j);
                        System.arraycopy(ainnerproducer1, j + 1, ainnerproducer, j, k - j - 1);
                    }
                    if (producers.compareAndSet(ainnerproducer1, ainnerproducer))
                    {
                        return;
                    }
                      goto _L4
                    i++;
                      goto _L5
                }


                public PublishSubscriber(AtomicReference atomicreference)
                {
                    Object obj;
                    if (UnsafeAccess.isUnsafeAvailable())
                    {
                        obj = new SpscArrayQueue(RxRingBuffer.SIZE);
                    } else
                    {
                        obj = new SynchronizedQueue(RxRingBuffer.SIZE);
                    }
                    queue = ((Queue) (obj));
                    producers = new AtomicReference(EMPTY);
                    current = atomicreference;
                }
            }


            private class InnerProducer extends AtomicLong
                implements Producer, Subscription
            {

                static final long NOT_REQUESTED = 0xc000000000000000L;
                static final long UNSUBSCRIBED = 0x8000000000000000L;
                private static final long serialVersionUID = 0xc23093c4d18f2746L;
                final Subscriber child;
                final PublishSubscriber parent;

                public boolean isUnsubscribed()
                {
                    return get() == 0x8000000000000000L;
                }

                public long produced(long l)
                {
                    if (l <= 0L)
                    {
                        throw new IllegalArgumentException("Cant produce zero or less");
                    }
                    long l1;
                    long l2;
                    do
                    {
                        l1 = get();
                        if (l1 == 0xc000000000000000L)
                        {
                            throw new IllegalStateException("Produced without request");
                        }
                        if (l1 == 0x8000000000000000L)
                        {
                            return 0x8000000000000000L;
                        }
                        l2 = l1 - l;
                        if (l2 < 0L)
                        {
                            throw new IllegalStateException((new StringBuilder()).append("More produced (").append(l).append(") than requested (").append(l1).append(")").toString());
                        }
                    } while (!compareAndSet(l1, l2));
                    return l2;
                }

                public void request(long l)
                {
                    long l3;
                    if (l >= 0L)
                    {
                        while ((l3 = get()) != 0x8000000000000000L && (l3 < 0L || l != 0L)) 
                        {
                            long l1;
                            if (l3 == 0xc000000000000000L)
                            {
                                l1 = l;
                            } else
                            {
                                long l2 = l3 + l;
                                l1 = l2;
                                if (l2 < 0L)
                                {
                                    l1 = 0x7fffffffffffffffL;
                                }
                            }
                            if (compareAndSet(l3, l1))
                            {
                                parent.dispatch();
                                return;
                            }
                        }
                    }
                }

                public void unsubscribe()
                {
                    if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
                    {
                        parent.remove(this);
                        parent.dispatch();
                    }
                }

                public InnerProducer(PublishSubscriber publishsubscriber, Subscriber subscriber)
                {
                    parent = publishsubscriber;
                    child = subscriber;
                    lazySet(0xc000000000000000L);
                }
            }

        }, observable, curr);
    }

    public void connect(Action1 action1)
    {
        PublishSubscriber publishsubscriber;
        PublishSubscriber publishsubscriber1;
        do
        {
            publishsubscriber1 = (PublishSubscriber)current.get();
            if (publishsubscriber1 != null)
            {
                publishsubscriber = publishsubscriber1;
                if (!publishsubscriber1.isUnsubscribed())
                {
                    break;
                }
            }
            publishsubscriber = new PublishSubscriber(current);
            publishsubscriber.init();
        } while (!current.compareAndSet(publishsubscriber1, publishsubscriber));
        boolean flag;
        if (!publishsubscriber.shouldConnect.get() && publishsubscriber.shouldConnect.compareAndSet(false, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        action1.call(publishsubscriber);
        if (flag)
        {
            source.unsafeSubscribe(publishsubscriber);
        }
    }
}
