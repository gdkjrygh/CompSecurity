// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;

public final class OperatorReplay extends ConnectableObservable
{

    static final Func0 DEFAULT_UNBOUNDED_FACTORY = new Func0() {

        public Object call()
        {
            return new UnboundedReplayBuffer(16);
        }


        private class UnboundedReplayBuffer extends ArrayList
            implements ReplayBuffer
        {

            private static final long serialVersionUID = 0x62057d556fa2a2d8L;
            final NotificationLite nl = NotificationLite.instance();
            volatile int size;

            public void complete()
            {
                add(nl.completed());
                size = size + 1;
            }

            public void error(Throwable throwable)
            {
                add(nl.error(throwable));
                size = size + 1;
            }

            public void next(Object obj)
            {
                add(nl.next(obj));
                size = size + 1;
            }

            public void replay(InnerProducer innerproducer)
            {
                innerproducer;
                JVM INSTR monitorenter ;
                if (!innerproducer.emitting)
                {
                    break MISSING_BLOCK_LABEL_17;
                }
                innerproducer.missed = true;
                innerproducer;
                JVM INSTR monitorexit ;
                return;
                innerproducer.emitting = true;
                innerproducer;
                JVM INSTR monitorexit ;
_L2:
                int i;
                long l;
                long l2;
                if (innerproducer.isUnsubscribed())
                {
                    break; /* Loop/switch isn't completed */
                }
                int j = size;
                Integer integer = (Integer)innerproducer.index();
                long l1;
                if (integer != null)
                {
                    i = integer.intValue();
                } else
                {
                    i = 0;
                }
                l2 = innerproducer.get();
                l = 0L;
                l1 = l2;
                do
                {
                    if (l1 == 0L || i >= j)
                    {
                        break;
                    }
                    Object obj = get(i);
                    boolean flag;
                    try
                    {
                        flag = nl.accept(innerproducer.child, obj);
                    }
                    catch (Throwable throwable)
                    {
                        Exceptions.throwIfFatal(throwable);
                        innerproducer.unsubscribe();
                        if (!nl.isError(obj) && !nl.isCompleted(obj))
                        {
                            innerproducer.child.onError(OnErrorThrowable.addValueAsLastCause(throwable, nl.getValue(obj)));
                            return;
                        }
                        break; /* Loop/switch isn't completed */
                    }
                    if (flag || innerproducer.isUnsubscribed())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    i++;
                    l1--;
                    l++;
                } while (true);
                break MISSING_BLOCK_LABEL_198;
                obj;
                innerproducer;
                JVM INSTR monitorexit ;
                throw obj;
                if (l != 0L)
                {
                    innerproducer.index = Integer.valueOf(i);
                    if (l2 != 0x7fffffffffffffffL)
                    {
                        innerproducer.produced(l);
                    }
                }
                innerproducer;
                JVM INSTR monitorenter ;
                if (innerproducer.missed)
                {
                    break MISSING_BLOCK_LABEL_252;
                }
                innerproducer.emitting = false;
                innerproducer;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                innerproducer;
                JVM INSTR monitorexit ;
                throw exception;
                innerproducer.missed = false;
                innerproducer;
                JVM INSTR monitorexit ;
                if (true) goto _L2; else goto _L1
_L1:
            }

            public UnboundedReplayBuffer(int i)
            {
                super(i);
            }
        }

    };
    final Func0 bufferFactory;
    final AtomicReference current;
    final Observable source;

    private OperatorReplay(rx.Observable.OnSubscribe onsubscribe, Observable observable, AtomicReference atomicreference, Func0 func0)
    {
        super(onsubscribe);
        source = observable;
        current = atomicreference;
        bufferFactory = func0;
    }

    public static ConnectableObservable create(Observable observable)
    {
        return create(observable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static ConnectableObservable create(Observable observable, final int bufferSize)
    {
        if (bufferSize == 0x7fffffff)
        {
            return create(observable);
        } else
        {
            return create(observable, new Func0() {

                final int val$bufferSize;

                public volatile Object call()
                {
                    return call();
                }

                public ReplayBuffer call()
                {
                    return new SizeBoundReplayBuffer(bufferSize);
                }

            
            {
                bufferSize = i;
                super();
            }

                private class SizeBoundReplayBuffer extends BoundedReplayBuffer
                {
                    private class BoundedReplayBuffer extends AtomicReference
                        implements ReplayBuffer
                    {
                        private class Node extends AtomicReference
                        {

                            private static final long serialVersionUID = 0x367ac732fab94eaL;
                            final Object value;

                            public Node(Object obj)
                            {
                                value = obj;
                            }
                        }


                        private static final long serialVersionUID = 0x2090aef8efde5e9eL;
                        final NotificationLite nl = NotificationLite.instance();
                        int size;
                        Node tail;

                        final void addLast(Node node)
                        {
                            tail.set(node);
                            tail = node;
                            size = size + 1;
                        }

                        final void collect(Collection collection)
                        {
                            Node node = (Node)get();
                            do
                            {
                                Object obj;
label0:
                                {
                                    node = (Node)node.get();
                                    if (node != null)
                                    {
                                        obj = leaveTransform(node.value);
                                        if (!nl.isCompleted(obj) && !nl.isError(obj))
                                        {
                                            break label0;
                                        }
                                    }
                                    return;
                                }
                                collection.add(nl.getValue(obj));
                            } while (true);
                        }

                        public final void complete()
                        {
                            addLast(new Node(enterTransform(nl.completed())));
                            truncateFinal();
                        }

                        Object enterTransform(Object obj)
                        {
                            return obj;
                        }

                        public final void error(Throwable throwable)
                        {
                            addLast(new Node(enterTransform(nl.error(throwable))));
                            truncateFinal();
                        }

                        boolean hasCompleted()
                        {
                            return tail.value != null && nl.isCompleted(leaveTransform(tail.value));
                        }

                        boolean hasError()
                        {
                            return tail.value != null && nl.isError(leaveTransform(tail.value));
                        }

                        Object leaveTransform(Object obj)
                        {
                            return obj;
                        }

                        public final void next(Object obj)
                        {
                            addLast(new Node(enterTransform(nl.next(obj))));
                            truncate();
                        }

                        final void removeFirst()
                        {
                            Node node = (Node)((Node)get()).get();
                            if (node == null)
                            {
                                throw new IllegalStateException("Empty list!");
                            } else
                            {
                                size = size - 1;
                                setFirst(node);
                                return;
                            }
                        }

                        final void removeSome(int i)
                        {
                            Node node = (Node)get();
                            while (i > 0) 
                            {
                                node = (Node)node.get();
                                i--;
                                size = size - 1;
                            }
                            setFirst(node);
                        }

                        public final void replay(InnerProducer innerproducer)
                        {
                            innerproducer;
                            JVM INSTR monitorenter ;
                            if (!innerproducer.emitting)
                            {
                                break MISSING_BLOCK_LABEL_17;
                            }
                            innerproducer.missed = true;
                            innerproducer;
                            JVM INSTR monitorexit ;
                            return;
                            innerproducer.emitting = true;
                            innerproducer;
                            JVM INSTR monitorexit ;
_L4:
                            Object obj;
                            long l;
                            long l1;
                            if (innerproducer.isUnsubscribed())
                            {
                                break; /* Loop/switch isn't completed */
                            }
                            l1 = innerproducer.get();
                            Node node = (Node)innerproducer.index();
                            obj = node;
                            if (node == null)
                            {
                                obj = (Node)get();
                                innerproducer.index = obj;
                            }
                            l = 0L;
_L2:
                            Object obj1;
                            if (l1 == 0L)
                            {
                                break; /* Loop/switch isn't completed */
                            }
                            obj1 = (Node)((Node) (obj)).get();
                            if (obj1 == null)
                            {
                                break; /* Loop/switch isn't completed */
                            }
                            obj = leaveTransform(((Node) (obj1)).value);
                            try
                            {
                                if (nl.accept(innerproducer.child, obj))
                                {
                                    innerproducer.index = null;
                                    return;
                                }
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj1)
                            {
                                innerproducer.index = null;
                                Exceptions.throwIfFatal(((Throwable) (obj1)));
                                innerproducer.unsubscribe();
                                if (!nl.isError(obj) && !nl.isCompleted(obj))
                                {
                                    innerproducer.child.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), nl.getValue(obj)));
                                    return;
                                }
                                break; /* Loop/switch isn't completed */
                            }
                            break MISSING_BLOCK_LABEL_177;
                            obj;
                            innerproducer;
                            JVM INSTR monitorexit ;
                            throw obj;
                            l++;
                            if (innerproducer.isUnsubscribed())
                            {
                                break; /* Loop/switch isn't completed */
                            }
                            obj = obj1;
                            if (true) goto _L2; else goto _L1
_L1:
                            if (l != 0L)
                            {
                                innerproducer.index = obj;
                                if (l1 != 0x7fffffffffffffffL)
                                {
                                    innerproducer.produced(l);
                                }
                            }
                            innerproducer;
                            JVM INSTR monitorenter ;
                            if (innerproducer.missed)
                            {
                                break MISSING_BLOCK_LABEL_245;
                            }
                            innerproducer.emitting = false;
                            innerproducer;
                            JVM INSTR monitorexit ;
                            return;
                            Exception exception;
                            exception;
                            innerproducer;
                            JVM INSTR monitorexit ;
                            throw exception;
                            innerproducer.missed = false;
                            innerproducer;
                            JVM INSTR monitorexit ;
                            if (true) goto _L4; else goto _L3
_L3:
                        }

                        final void setFirst(Node node)
                        {
                            set(node);
                        }

                        void truncate()
                        {
                        }

                        void truncateFinal()
                        {
                        }

                        public BoundedReplayBuffer()
                        {
                            Node node = new Node(null);
                            tail = node;
                            set(node);
                        }

                        private class InnerProducer extends AtomicLong
                            implements Producer, Subscription
                        {

                            static final long UNSUBSCRIBED = 0x8000000000000000L;
                            private static final long serialVersionUID = 0xc23093c4d18f2746L;
                            final Subscriber child;
                            boolean emitting;
                            Object index;
                            boolean missed;
                            final ReplaySubscriber parent;
                            final AtomicLong totalRequested = new AtomicLong();

                            void addTotalRequested(long l)
                            {
                                long l1;
                                long l3;
                                do
                                {
                                    l3 = totalRequested.get();
                                    long l2 = l3 + l;
                                    l1 = l2;
                                    if (l2 < 0L)
                                    {
                                        l1 = 0x7fffffffffffffffL;
                                    }
                                } while (!totalRequested.compareAndSet(l3, l1));
                            }

                            Object index()
                            {
                                return index;
                            }

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
                                if (l >= 0L) goto _L2; else goto _L1
_L1:
                                long l3;
                                return;
_L2:
                                long l1;
                                do
                                {
                                    if ((l3 = get()) == 0x8000000000000000L || l3 >= 0L && l == 0L)
                                    {
                                        continue; /* Loop/switch isn't completed */
                                    }
                                    long l2 = l3 + l;
                                    l1 = l2;
                                    if (l2 < 0L)
                                    {
                                        l1 = 0x7fffffffffffffffL;
                                    }
                                } while (!compareAndSet(l3, l1));
                                break; /* Loop/switch isn't completed */
                                if (true) goto _L1; else goto _L3
_L3:
                                addTotalRequested(l);
                                parent.manageRequests();
                                parent.buffer.replay(this);
                                return;
                            }

                            public void unsubscribe()
                            {
                                if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
                                {
                                    parent.remove(this);
                                    parent.manageRequests();
                                }
                            }

                            public InnerProducer(ReplaySubscriber replaysubscriber, Subscriber subscriber)
                            {
                                parent = replaysubscriber;
                                child = subscriber;
                            }

                            private class ReplaySubscriber extends Subscriber
                                implements Subscription
                            {

                                static final InnerProducer EMPTY[] = new InnerProducer[0];
                                static final InnerProducer TERMINATED[] = new InnerProducer[0];
                                final ReplayBuffer buffer;
                                boolean done;
                                boolean emitting;
                                long maxChildRequested;
                                long maxUpstreamRequested;
                                boolean missed;
                                final NotificationLite nl = NotificationLite.instance();
                                volatile Producer producer;
                                final AtomicReference producers;
                                final AtomicBoolean shouldConnect = new AtomicBoolean();

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

                                void init()
                                {
                                    add(Subscriptions.create(new Action0() {

                                        final ReplaySubscriber this$0;

                                        public void call()
                                        {
                                            producers.getAndSet(ReplaySubscriber.TERMINATED);
                                        }

                                        
                                        {
                                            this$0 = ReplaySubscriber.this;
                                            super();
                                        }
                                    }));
                                }

                                void manageRequests()
                                {
                                    if (!isUnsubscribed()) goto _L2; else goto _L1
_L1:
                                    return;
_L2:
                                    this;
                                    JVM INSTR monitorenter ;
                                    if (!emitting)
                                    {
                                        break MISSING_BLOCK_LABEL_30;
                                    }
                                    missed = true;
                                    this;
                                    JVM INSTR monitorexit ;
                                    return;
                                    Exception exception;
                                    exception;
                                    this;
                                    JVM INSTR monitorexit ;
                                    throw exception;
                                    emitting = true;
                                    this;
                                    JVM INSTR monitorexit ;
_L10:
                                    Object obj;
                                    long l;
                                    long l2;
                                    long l3;
                                    if (isUnsubscribed())
                                    {
                                        continue; /* Loop/switch isn't completed */
                                    }
                                    InnerProducer ainnerproducer[] = (InnerProducer[])producers.get();
                                    l2 = maxChildRequested;
                                    int j = ainnerproducer.length;
                                    int i = 0;
                                    l = 0L;
                                    for (; i < j; i++)
                                    {
                                        l = Math.max(l, ainnerproducer[i].totalRequested.get());
                                    }

                                    l3 = maxUpstreamRequested;
                                    obj = producer;
                                    l2 = l - l2;
                                    if (l2 == 0L) goto _L4; else goto _L3
_L3:
                                    maxChildRequested = l;
                                    if (obj == null) goto _L6; else goto _L5
_L5:
                                    if (l3 != 0L)
                                    {
                                        maxUpstreamRequested = 0L;
                                        ((Producer) (obj)).request(l3 + l2);
                                    } else
                                    {
                                        ((Producer) (obj)).request(l2);
                                    }
_L8:
                                    this;
                                    JVM INSTR monitorenter ;
                                    if (missed)
                                    {
                                        break; /* Loop/switch isn't completed */
                                    }
                                    emitting = false;
                                    this;
                                    JVM INSTR monitorexit ;
                                    return;
                                    obj;
                                    this;
                                    JVM INSTR monitorexit ;
                                    throw obj;
_L6:
                                    l2 = l3 + l2;
                                    long l1 = l2;
                                    if (l2 < 0L)
                                    {
                                        l1 = 0x7fffffffffffffffL;
                                    }
                                    maxUpstreamRequested = l1;
                                    continue; /* Loop/switch isn't completed */
_L4:
                                    if (l3 != 0L && obj != null)
                                    {
                                        maxUpstreamRequested = 0L;
                                        ((Producer) (obj)).request(l3);
                                    }
                                    if (true) goto _L8; else goto _L7
_L7:
                                    missed = false;
                                    this;
                                    JVM INSTR monitorexit ;
                                    if (true) goto _L10; else goto _L9
_L9:
                                    if (true) goto _L1; else goto _L11
_L11:
                                }

                                public void onCompleted()
                                {
                                    if (done)
                                    {
                                        break MISSING_BLOCK_LABEL_29;
                                    }
                                    done = true;
                                    buffer.complete();
                                    replay();
                                    unsubscribe();
                                    return;
                                    Exception exception;
                                    exception;
                                    unsubscribe();
                                    throw exception;
                                }

                                public void onError(Throwable throwable)
                                {
                                    if (done)
                                    {
                                        break MISSING_BLOCK_LABEL_30;
                                    }
                                    done = true;
                                    buffer.error(throwable);
                                    replay();
                                    unsubscribe();
                                    return;
                                    throwable;
                                    unsubscribe();
                                    throw throwable;
                                }

                                public void onNext(Object obj)
                                {
                                    if (!done)
                                    {
                                        buffer.next(obj);
                                        replay();
                                    }
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

                                void replay()
                                {
                                    InnerProducer ainnerproducer[] = (InnerProducer[])producers.get();
                                    int j = ainnerproducer.length;
                                    for (int i = 0; i < j; i++)
                                    {
                                        InnerProducer innerproducer = ainnerproducer[i];
                                        buffer.replay(innerproducer);
                                    }

                                }

                                public void setProducer(Producer producer1)
                                {
                                    if (producer != null)
                                    {
                                        throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
                                    } else
                                    {
                                        producer = producer1;
                                        manageRequests();
                                        replay();
                                        return;
                                    }
                                }


                                public ReplaySubscriber(AtomicReference atomicreference, ReplayBuffer replaybuffer)
                                {
                                    buffer = replaybuffer;
                                    producers = new AtomicReference(EMPTY);
                                    request(0L);
                                }
                            }


                            private class ReplayBuffer
                            {

                                public abstract void complete();

                                public abstract void error(Throwable throwable);

                                public abstract void next(Object obj);

                                public abstract void replay(InnerProducer innerproducer);
                            }

                        }

                    }


                    private static final long serialVersionUID = 0xae25160e83344772L;
                    final int limit;

                    void truncate()
                    {
                        if (size > limit)
                        {
                            removeFirst();
                        }
                    }

                    public SizeBoundReplayBuffer(int i)
                    {
                        limit = i;
                    }
                }

            });
        }
    }

    public static ConnectableObservable create(Observable observable, long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return create(observable, l, timeunit, scheduler, 0x7fffffff);
    }

    public static ConnectableObservable create(Observable observable, long l, TimeUnit timeunit, Scheduler scheduler, final int bufferSize)
    {
        return create(observable, new Func0() {

            final int val$bufferSize;
            final long val$maxAgeInMillis;
            final Scheduler val$scheduler;

            public volatile Object call()
            {
                return call();
            }

            public ReplayBuffer call()
            {
                return new SizeAndTimeBoundReplayBuffer(bufferSize, maxAgeInMillis, scheduler);
            }

            
            {
                bufferSize = i;
                maxAgeInMillis = l;
                scheduler = scheduler1;
                super();
            }

            private class SizeAndTimeBoundReplayBuffer extends BoundedReplayBuffer
            {

                private static final long serialVersionUID = 0x2ffd21f3bea38aacL;
                final int limit;
                final long maxAgeInMillis;
                final Scheduler scheduler;

                Object enterTransform(Object obj)
                {
                    return new Timestamped(scheduler.now(), obj);
                }

                Object leaveTransform(Object obj)
                {
                    return ((Timestamped)obj).getValue();
                }

                void truncate()
                {
                    long l = scheduler.now();
                    long l1 = maxAgeInMillis;
                    Node node1 = (Node)get();
                    Node node = (Node)node1.get();
                    int i = 0;
                    do
                    {
                        if (node == null)
                        {
                            break;
                        }
                        if (size > limit)
                        {
                            i++;
                            size = size - 1;
                            Node node2 = (Node)node.get();
                            node1 = node;
                            node = node2;
                            continue;
                        }
                        if (((Timestamped)node.value).getTimestampMillis() > l - l1)
                        {
                            break;
                        }
                        i++;
                        size = size - 1;
                        Node node3 = (Node)node.get();
                        node1 = node;
                        node = node3;
                    } while (true);
                    if (i != 0)
                    {
                        setFirst(node1);
                    }
                }

                void truncateFinal()
                {
                    long l = scheduler.now();
                    long l1 = maxAgeInMillis;
                    Node node = (Node)get();
                    Node node2 = (Node)node.get();
                    int i = 0;
                    Node node4 = node;
                    for (Node node1 = node2; node1 != null && size > 1 && ((Timestamped)node1.value).getTimestampMillis() <= l - l1;)
                    {
                        i++;
                        size = size - 1;
                        node4 = (Node)node1.get();
                        Node node3 = node1;
                        node1 = node4;
                        node4 = node3;
                    }

                    if (i != 0)
                    {
                        setFirst(node4);
                    }
                }

                public SizeAndTimeBoundReplayBuffer(int i, long l, Scheduler scheduler1)
                {
                    scheduler = scheduler1;
                    limit = i;
                    maxAgeInMillis = l;
                }
            }

        });
    }

    static ConnectableObservable create(Observable observable, final Func0 bufferFactory)
    {
        final AtomicReference curr = new AtomicReference();
        return new OperatorReplay(new rx.Observable.OnSubscribe() {

            final Func0 val$bufferFactory;
            final AtomicReference val$curr;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                ReplaySubscriber replaysubscriber;
                Object obj;
                do
                {
                    obj = (ReplaySubscriber)curr.get();
                    replaysubscriber = ((ReplaySubscriber) (obj));
                    if (obj != null)
                    {
                        break;
                    }
                    replaysubscriber = new ReplaySubscriber(curr, (ReplayBuffer)bufferFactory.call());
                    replaysubscriber.init();
                } while (!curr.compareAndSet(obj, replaysubscriber));
                obj = new InnerProducer(replaysubscriber, subscriber);
                replaysubscriber.add(((InnerProducer) (obj)));
                subscriber.add(((Subscription) (obj)));
                subscriber.setProducer(((Producer) (obj)));
            }

            
            {
                curr = atomicreference;
                bufferFactory = func0;
                super();
            }
        }, observable, curr, bufferFactory);
    }

    public static Observable multicastSelector(final Func0 connectableFactory, final Func1 selector)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final Func0 val$connectableFactory;
            final Func1 val$selector;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                ConnectableObservable connectableobservable;
                Observable observable;
                try
                {
                    connectableobservable = (ConnectableObservable)connectableFactory.call();
                    observable = (Observable)selector.call(connectableobservable);
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    subscriber.onError(throwable);
                    return;
                }
                observable.subscribe(subscriber);
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
                connectableFactory = func0;
                selector = func1;
                super();
            }
        });
    }

    public static ConnectableObservable observeOn(ConnectableObservable connectableobservable, Scheduler scheduler)
    {
        return new ConnectableObservable(connectableobservable) {

            final ConnectableObservable val$co;

            public void connect(Action1 action1)
            {
                co.connect(action1);
            }

            
            {
                co = connectableobservable;
                super(final_onsubscribe);
            }
        };
    }

    public void connect(Action1 action1)
    {
        ReplaySubscriber replaysubscriber;
        ReplaySubscriber replaysubscriber1;
        do
        {
            replaysubscriber1 = (ReplaySubscriber)current.get();
            if (replaysubscriber1 != null)
            {
                replaysubscriber = replaysubscriber1;
                if (!replaysubscriber1.isUnsubscribed())
                {
                    break;
                }
            }
            replaysubscriber = new ReplaySubscriber(current, (ReplayBuffer)bufferFactory.call());
            replaysubscriber.init();
        } while (!current.compareAndSet(replaysubscriber1, replaysubscriber));
        boolean flag;
        if (!replaysubscriber.shouldConnect.get() && replaysubscriber.shouldConnect.compareAndSet(false, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        action1.call(replaysubscriber);
        if (flag)
        {
            source.unsafeSubscribe(replaysubscriber);
        }
    }


    // Unreferenced inner class rx/internal/operators/OperatorReplay$3

/* anonymous class */
    final class _cls3
        implements rx.Observable.OnSubscribe
    {

        final Observable val$observable;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            observable.unsafeSubscribe(subscriber. new Subscriber(subscriber) {

                final _cls3 this$0;
                final Subscriber val$child;

                public void onCompleted()
                {
                    child.onCompleted();
                }

                public void onError(Throwable throwable)
                {
                    child.onError(throwable);
                }

                public void onNext(Object obj)
                {
                    child.onNext(obj);
                }

            
            {
                this$0 = final__pcls3;
                child = subscriber1;
                super(Subscriber.this);
            }
            });
        }

            
            {
                observable = observable1;
                super();
            }
    }

}
