// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.SynchronizedQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observables.ConnectableObservable;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

public final class OperatorPublish extends ConnectableObservable
{
    static final class InnerProducer extends AtomicLong
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

    static final class PublishSubscriber extends Subscriber
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
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            if (!nl.isCompleted(obj))
            {
                break MISSING_BLOCK_LABEL_89;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            current.compareAndSet(this, null);
            int j;
            obj = (InnerProducer[])producers.getAndSet(TERMINATED);
            j = obj.length;
            int i = 0;
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
            ainnerproducer = (InnerProducer[])producers.getAndSet(TERMINATED);
            j = ainnerproducer.length;
            i = 0;
_L4:
            if (i >= j)
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
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
_L17:
            int i = ((flag) ? 1 : 0);
            Object obj = terminalEvent;
            i = ((flag) ? 1 : 0);
            boolean flag2 = queue.isEmpty();
            i = ((flag) ? 1 : 0);
            boolean flag3 = checkTerminated(obj, flag2);
            if (!flag3) goto _L2; else goto _L1
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
            if (flag2) goto _L6; else goto _L5
_L5:
            i = ((flag) ? 1 : 0);
            exception = (InnerProducer[])producers.get();
            i = ((flag) ? 1 : 0);
            int l = exception.length;
            int k;
            long l1;
            l1 = 0x7fffffffffffffffL;
            k = 0;
            i = ((flag) ? 1 : 0);
            int i1 = exception.length;
            int j = 0;
_L36:
            if (j >= i1) goto _L8; else goto _L7
_L7:
            i = ((flag) ? 1 : 0);
            long l3 = exception[j].get();
            if (l3 < 0L) goto _L10; else goto _L9
_L9:
            i = ((flag) ? 1 : 0);
            long l2 = Math.min(l1, l3);
            i = k;
              goto _L11
_L8:
            if (l != k) goto _L13; else goto _L12
_L12:
            i = ((flag) ? 1 : 0);
            exception = ((Exception) (terminalEvent));
            i = ((flag) ? 1 : 0);
            if (queue.poll() == null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            i = ((flag) ? 1 : 0);
            flag2 = checkTerminated(exception, flag2);
            if (!flag2) goto _L15; else goto _L14
_L14:
            if (true) goto _L4; else goto _L16
_L16:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L15:
            i = ((flag) ? 1 : 0);
            request(1L);
              goto _L17
            exception;
            if (i != 0) goto _L19; else goto _L18
_L18:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L19:
            throw exception;
_L13:
            j = 0;
_L35:
            if ((long)j >= l1) goto _L21; else goto _L20
_L20:
            i = ((flag) ? 1 : 0);
            Object obj1 = terminalEvent;
            i = ((flag) ? 1 : 0);
            Object obj2 = queue.poll();
            boolean flag4;
            if (obj2 == null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            i = ((flag) ? 1 : 0);
            flag4 = checkTerminated(obj1, flag2);
            if (!flag4) goto _L23; else goto _L22
_L22:
            if (true) goto _L4; else goto _L24
_L24:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L23:
            if (!flag2) goto _L25; else goto _L21
_L21:
            if (j <= 0) goto _L27; else goto _L26
_L26:
            l2 = j;
            i = ((flag) ? 1 : 0);
            request(l2);
              goto _L27
_L6:
            i = ((flag) ? 1 : 0);
            this;
            JVM INSTR monitorenter ;
            i = ((flag1) ? 1 : 0);
            if (missed) goto _L29; else goto _L28
_L28:
            i = ((flag1) ? 1 : 0);
            emitting = false;
            i = 1;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L4; else goto _L30
_L30:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L25:
            i = ((flag) ? 1 : 0);
            obj1 = nl.getValue(obj2);
            i = ((flag) ? 1 : 0);
            l = exception.length;
            k = 0;
_L37:
            if (k >= l) goto _L32; else goto _L31
_L31:
            obj2 = exception[k];
            i = ((flag) ? 1 : 0);
            l2 = ((InnerProducer) (obj2)).get();
            if (l2 <= 0L) goto _L34; else goto _L33
_L33:
            i = ((flag) ? 1 : 0);
            ((InnerProducer) (obj2)).child.onNext(obj1);
            i = ((flag) ? 1 : 0);
            ((InnerProducer) (obj2)).produced(1L);
              goto _L34
            Throwable throwable;
            throwable;
            i = ((flag) ? 1 : 0);
            ((InnerProducer) (obj2)).unsubscribe();
            i = ((flag) ? 1 : 0);
            ((InnerProducer) (obj2)).child.onError(throwable);
              goto _L34
_L32:
            j++;
              goto _L35
_L29:
            i = ((flag1) ? 1 : 0);
            missed = false;
            i = ((flag1) ? 1 : 0);
            this;
            JVM INSTR monitorexit ;
            break; /* Loop/switch isn't completed */
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L4:
            return;
_L11:
            j++;
            l1 = l2;
            k = i;
              goto _L36
_L10:
            l2 = l1;
            i = k;
            if (l3 == 0x8000000000000000L)
            {
                i = k + 1;
                l2 = l1;
            }
              goto _L11
_L27:
            if (l1 != 0L && !flag2) goto _L17; else goto _L6
_L34:
            k++;
              goto _L37
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


    final AtomicReference current;
    final Observable source;

    private OperatorPublish(rx.Observable.OnSubscribe onsubscribe, Observable observable, AtomicReference atomicreference)
    {
        super(onsubscribe);
        source = observable;
        current = atomicreference;
    }

    public static Observable create(Observable observable, Func1 func1)
    {
        return create(new rx.Observable.OnSubscribe(observable, func1) {

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
        AtomicReference atomicreference = new AtomicReference();
        return new OperatorPublish(new rx.Observable.OnSubscribe(atomicreference) {

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
        }, observable, atomicreference);
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
