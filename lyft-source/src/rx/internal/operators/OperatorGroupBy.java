// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Func1;

public class OperatorGroupBy
    implements rx.Observable.Operator
{

    private static final Func1 IDENTITY = new Func1() {

        public Object call(Object obj)
        {
            return obj;
        }

    };
    private static final Object NULL_KEY = new Object();
    final Func1 keySelector;
    final Func1 valueSelector;

    public OperatorGroupBy(Func1 func1)
    {
        this(func1, IDENTITY);
    }

    public OperatorGroupBy(Func1 func1, Func1 func1_1)
    {
        keySelector = func1;
        valueSelector = func1_1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        return new GroupBySubscriber(keySelector, valueSelector, subscriber);
    }



    private class GroupBySubscriber extends Subscriber
    {

        static final AtomicLongFieldUpdater BUFFERED_COUNT = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorGroupBy$GroupBySubscriber, "bufferedCount");
        static final AtomicIntegerFieldUpdater COMPLETION_EMITTED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorGroupBy$GroupBySubscriber, "completionEmitted");
        private static final int MAX_QUEUE_SIZE = 1024;
        static final AtomicLongFieldUpdater REQUESTED = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorGroupBy$GroupBySubscriber, "requested");
        static final AtomicIntegerFieldUpdater TERMINATED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorGroupBy$GroupBySubscriber, "terminated");
        private static final int TERMINATED_WITH_COMPLETED = 1;
        private static final int TERMINATED_WITH_ERROR = 2;
        private static final int UNTERMINATED = 0;
        static final AtomicIntegerFieldUpdater WIP_FOR_UNSUBSCRIBE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorGroupBy$GroupBySubscriber, "wipForUnsubscribe");
        private static final NotificationLite nl = NotificationLite.instance();
        volatile long bufferedCount;
        final Subscriber child;
        volatile int completionEmitted;
        final Func1 elementSelector;
        private final ConcurrentHashMap groups = new ConcurrentHashMap();
        final Func1 keySelector;
        volatile long requested;
        final GroupBySubscriber self = this;
        volatile int terminated;
        volatile int wipForUnsubscribe;

        private void cleanupGroup(Object obj)
        {
            class GroupState
            {

                private final Queue buffer;
                private final AtomicLong count;
                private final AtomicLong requested;
                private final Subject s;

                public Observable getObservable()
                {
                    return s;
                }

                public Observer getObserver()
                {
                    return s;
                }




                private GroupState()
                {
                    s = BufferUntilSubscriber.create();
                    requested = new AtomicLong();
                    count = new AtomicLong();
                    buffer = new ConcurrentLinkedQueue();
                }

            }

            obj = (GroupState)groups.remove(obj);
            if (obj != null)
            {
                if (!((GroupState) (obj)).buffer.isEmpty())
                {
                    BUFFERED_COUNT.addAndGet(self, -((GroupState) (obj)).buffer.size());
                }
                completeInner();
                requestMoreIfNecessary();
            }
        }

        private void completeInner()
        {
            if (WIP_FOR_UNSUBSCRIBE_UPDATER.decrementAndGet(this) == 0)
            {
                unsubscribe();
            } else
            if (groups.isEmpty() && terminated == 1 && COMPLETION_EMITTED_UPDATER.compareAndSet(this, 0, 1))
            {
                child.onCompleted();
                return;
            }
        }

        private GroupState createNewGroup(final Object key)
        {
            final GroupState groupState = new GroupState();
            GroupedObservable groupedobservable = GroupedObservable.create(getKey(key), new rx.Observable.OnSubscribe() {

                final GroupBySubscriber this$0;
                final GroupState val$groupState;
                final Object val$key;

                public volatile void call(Object obj)
                {
                    call((Subscriber)obj);
                }

                public void call(final Subscriber final_subscriber)
                {
                    final_subscriber.setProducer(new Producer() {

                        final _cls2 this$1;

                        public void request(long l)
                        {
                            requestFromGroupedObservable(l, groupState);
                        }

                
                {
                    this$1 = _cls2.this;
                    super();
                }
                    });
                    AtomicBoolean atomicboolean = new AtomicBoolean();
                    groupState.getObservable().doOnUnsubscribe(atomicboolean. new Action0() {

                        final _cls2 this$1;
                        final AtomicBoolean val$once;

                        public void call()
                        {
                            if (once.compareAndSet(false, true))
                            {
                                cleanupGroup(key);
                            }
                        }

                
                {
                    this$1 = final__pcls2;
                    once = AtomicBoolean.this;
                    super();
                }
                    }).unsafeSubscribe(final_subscriber. new Subscriber(atomicboolean) {

                        final _cls2 this$1;
                        final Subscriber val$o;
                        final AtomicBoolean val$once;

                        public void onCompleted()
                        {
                            o.onCompleted();
                            if (once.compareAndSet(false, true))
                            {
                                cleanupGroup(key);
                            }
                        }

                        public void onError(Throwable throwable)
                        {
                            o.onError(throwable);
                            if (once.compareAndSet(false, true))
                            {
                                cleanupGroup(key);
                            }
                        }

                        public void onNext(Object obj)
                        {
                            try
                            {
                                o.onNext(elementSelector.call(obj));
                                return;
                            }
                            catch (Throwable throwable)
                            {
                                onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                            }
                        }

                        public void onStart()
                        {
                        }

                
                {
                    this$1 = final__pcls2;
                    o = Subscriber.this;
                    once = atomicboolean;
                    super(final_subscriber);
                }
                    });
                }

                
                {
                    this$0 = GroupBySubscriber.this;
                    groupState = groupstate;
                    key = obj;
                    super();
                }
            });
            int i;
            do
            {
                i = wipForUnsubscribe;
                if (i <= 0)
                {
                    return null;
                }
            } while (!WIP_FOR_UNSUBSCRIBE_UPDATER.compareAndSet(this, i, i + 1));
            if ((GroupState)groups.putIfAbsent(key, groupState) != null)
            {
                throw new IllegalStateException("Group already existed while creating a new one");
            } else
            {
                child.onNext(groupedobservable);
                return groupState;
            }
        }

        private void drainIfPossible(GroupState groupstate)
        {
            for (; groupstate.requested.get() > 0L; requestMoreIfNecessary())
            {
                Object obj = groupstate.buffer.poll();
                if (obj == null)
                {
                    break;
                }
                Observer observer = groupstate.getObserver();
                nl.accept(observer, obj);
                if (groupstate.requested.get() != 0x7fffffffffffffffL)
                {
                    groupstate.requested.decrementAndGet();
                }
                BUFFERED_COUNT.decrementAndGet(this);
            }

        }

        private void emitItem(GroupState groupstate, Object obj)
        {
            AtomicLong atomiclong;
            Queue queue;
            queue = groupstate.buffer;
            atomiclong = groupstate.requested;
            REQUESTED.decrementAndGet(this);
            if (atomiclong == null || atomiclong.get() <= 0L || queue != null && !queue.isEmpty()) goto _L2; else goto _L1
_L1:
            groupstate = groupstate.getObserver();
            nl.accept(groupstate, obj);
            if (atomiclong.get() != 0x7fffffffffffffffL)
            {
                atomiclong.decrementAndGet();
            }
_L4:
            requestMoreIfNecessary();
            return;
_L2:
            queue.add(obj);
            BUFFERED_COUNT.incrementAndGet(this);
            if (groupstate.count.getAndIncrement() == 0L)
            {
                pollQueue(groupstate);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private Object getKey(Object obj)
        {
            Object obj1 = obj;
            if (obj == OperatorGroupBy.NULL_KEY)
            {
                obj1 = null;
            }
            return obj1;
        }

        private Object groupedKey(Object obj)
        {
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = OperatorGroupBy.NULL_KEY;
            }
            return obj1;
        }

        private void pollQueue(GroupState groupstate)
        {
            do
            {
                drainIfPossible(groupstate);
                if (groupstate.count.decrementAndGet() > 1L)
                {
                    groupstate.count.set(1L);
                }
            } while (groupstate.count.get() > 0L);
        }

        private void requestMoreIfNecessary()
        {
            if (REQUESTED.get(this) == 0L && terminated == 0)
            {
                long l = 1024L - BUFFERED_COUNT.get(this);
                if (l > 0L && REQUESTED.compareAndSet(this, 0L, l))
                {
                    request(l);
                }
            }
        }

        public void onCompleted()
        {
            if (TERMINATED_UPDATER.compareAndSet(this, 0, 1))
            {
                for (Iterator iterator = groups.values().iterator(); iterator.hasNext(); emitItem((GroupState)iterator.next(), nl.completed())) { }
                if (groups.isEmpty() && COMPLETION_EMITTED_UPDATER.compareAndSet(this, 0, 1))
                {
                    child.onCompleted();
                }
            }
        }

        public void onError(Throwable throwable)
        {
            if (!TERMINATED_UPDATER.compareAndSet(this, 0, 2))
            {
                break MISSING_BLOCK_LABEL_69;
            }
            for (Iterator iterator = groups.values().iterator(); iterator.hasNext(); emitItem((GroupState)iterator.next(), nl.error(throwable))) { }
            child.onError(throwable);
            unsubscribe();
            return;
            throwable;
            unsubscribe();
            throw throwable;
        }

        public void onNext(Object obj)
        {
            GroupState groupstate1;
            Object obj1;
            obj1 = groupedKey(keySelector.call(obj));
            groupstate1 = (GroupState)groups.get(obj1);
            GroupState groupstate;
            groupstate = groupstate1;
            if (groupstate1 != null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            if (child.isUnsubscribed())
            {
                return;
            }
            groupstate = createNewGroup(obj1);
            if (groupstate != null)
            {
                try
                {
                    emitItem(groupstate, nl.next(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
            }
            return;
        }

        public void onStart()
        {
            REQUESTED.set(this, 1024L);
            request(1024L);
        }

        void requestFromGroupedObservable(long l, GroupState groupstate)
        {
            BackpressureUtils.getAndAddRequest(groupstate.requested, l);
            if (groupstate.count.getAndIncrement() == 0L)
            {
                pollQueue(groupstate);
            }
        }



        public GroupBySubscriber(Func1 func1, Func1 func1_1, Subscriber subscriber)
        {
            wipForUnsubscribe = 1;
            terminated = 0;
            keySelector = func1;
            elementSelector = func1_1;
            child = subscriber;
            subscriber.add(Subscriptions.create(new Action0() {

                final GroupBySubscriber this$0;

                public void call()
                {
                    if (GroupBySubscriber.WIP_FOR_UNSUBSCRIBE_UPDATER.decrementAndGet(self) == 0)
                    {
                        self.unsubscribe();
                    }
                }

                
                {
                    this$0 = GroupBySubscriber.this;
                    super();
                }
            }));
        }
    }

}
