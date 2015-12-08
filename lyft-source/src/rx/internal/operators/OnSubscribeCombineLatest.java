// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.functions.FuncN;
import rx.internal.util.RxRingBuffer;

public final class OnSubscribeCombineLatest
    implements rx.Observable.OnSubscribe
{

    final FuncN combinator;
    final List sources;

    public OnSubscribeCombineLatest(List list, FuncN funcn)
    {
        sources = list;
        combinator = funcn;
        if (list.size() > RxRingBuffer.SIZE)
        {
            throw new IllegalArgumentException("More than RxRingBuffer.SIZE sources to combineLatest is not supported.");
        } else
        {
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        if (sources.isEmpty())
        {
            subscriber.onCompleted();
            return;
        }
        if (sources.size() == 1)
        {
            subscriber.setProducer(new SingleSourceProducer(subscriber, (Observable)sources.get(0), combinator));
            return;
        } else
        {
            subscriber.setProducer(new MultiSourceProducer(subscriber, sources, combinator));
            return;
        }
    }

    private class SingleSourceProducer
        implements Producer
    {
        private class SingleSourceRequestableSubscriber extends Subscriber
        {

            private final Subscriber child;
            private final FuncN combinator;

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
                child.onNext(combinator.call(new Object[] {
                    obj
                }));
            }

            public void requestMore(long l)
            {
                request(l);
            }

            SingleSourceRequestableSubscriber(Subscriber subscriber1, FuncN funcn)
            {
                super(subscriber1);
                child = subscriber1;
                combinator = funcn;
            }
        }


        final Subscriber child;
        final FuncN combinator;
        final Observable source;
        final AtomicBoolean started = new AtomicBoolean();
        final SingleSourceRequestableSubscriber subscriber;

        public void request(long l)
        {
            subscriber.requestMore(l);
            if (started.compareAndSet(false, true))
            {
                source.unsafeSubscribe(subscriber);
            }
        }

        public SingleSourceProducer(Subscriber subscriber1, Observable observable, FuncN funcn)
        {
            source = observable;
            child = subscriber1;
            combinator = funcn;
            subscriber = new SingleSourceRequestableSubscriber(subscriber1, funcn);
        }
    }


    private class MultiSourceProducer
        implements Producer
    {
        private class MultiSourceRequestableSubscriber extends Subscriber
        {

            final AtomicLong emitted = new AtomicLong();
            boolean hasValue;
            final int index;
            final MultiSourceProducer producer;

            public void onCompleted()
            {
                producer.onCompleted(index, hasValue);
            }

            public void onError(Throwable throwable)
            {
                producer.onError(throwable);
            }

            public void onNext(Object obj)
            {
                hasValue = true;
                emitted.incrementAndGet();
                if (!producer.onNext(index, obj))
                {
                    request(1L);
                }
            }

            public void requestUpTo(long l)
            {
                long l1;
                long l2;
                do
                {
                    l1 = emitted.get();
                    l2 = Math.min(l1, l);
                } while (!emitted.compareAndSet(l1, l1 - l2));
                request(l2);
            }

            public MultiSourceRequestableSubscriber(int i, int j, Subscriber subscriber, MultiSourceProducer multisourceproducer)
            {
                super(subscriber);
                hasValue = false;
                index = i;
                producer = multisourceproducer;
                request(j);
            }
        }


        private static final AtomicLongFieldUpdater WIP = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OnSubscribeCombineLatest$MultiSourceProducer, "counter");
        private final RxRingBuffer buffer = RxRingBuffer.getSpmcInstance();
        private final Subscriber child;
        private final Object collectedValues[];
        private final FuncN combinator;
        private final BitSet completion;
        private volatile int completionCount;
        private volatile long counter;
        private final BitSet haveValues;
        private volatile int haveValuesCount;
        private final AtomicLong requested = new AtomicLong();
        private final List sources;
        private final AtomicBoolean started = new AtomicBoolean();
        private final MultiSourceRequestableSubscriber subscribers[];

        public void onCompleted(int i, boolean flag)
        {
            boolean flag2 = false;
            if (flag) goto _L2; else goto _L1
_L1:
            child.onCompleted();
_L4:
            return;
_L2:
            this;
            JVM INSTR monitorenter ;
            boolean flag1 = flag2;
            if (completion.get(i))
            {
                break MISSING_BLOCK_LABEL_69;
            }
            completion.set(i);
            completionCount = completionCount + 1;
            flag1 = flag2;
            if (completionCount == collectedValues.length)
            {
                flag1 = true;
            }
            this;
            JVM INSTR monitorexit ;
            if (!flag1) goto _L4; else goto _L3
_L3:
            buffer.onCompleted();
            tick();
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public boolean onNext(int i, Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            if (!haveValues.get(i))
            {
                haveValues.set(i);
                haveValuesCount = haveValuesCount + 1;
            }
            collectedValues[i] = obj;
            if (haveValuesCount == collectedValues.length)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            this;
            JVM INSTR monitorexit ;
            return false;
            buffer.onNext(combinator.call(collectedValues));
_L1:
            this;
            JVM INSTR monitorexit ;
            tick();
            return true;
            obj;
            onError(((Throwable) (obj)));
              goto _L1
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            onError(((Throwable) (obj)));
              goto _L1
        }

        public void request(long l)
        {
            BackpressureUtils.getAndAddRequest(requested, l);
            if (!started.get() && started.compareAndSet(false, true))
            {
                int k = RxRingBuffer.SIZE / sources.size();
                int i1 = RxRingBuffer.SIZE;
                int j1 = sources.size();
                int i = 0;
                while (i < sources.size()) 
                {
                    Observable observable = (Observable)sources.get(i);
                    MultiSourceRequestableSubscriber multisourcerequestablesubscriber;
                    int j;
                    if (i == sources.size() - 1)
                    {
                        j = k + i1 % j1;
                    } else
                    {
                        j = k;
                    }
                    multisourcerequestablesubscriber = new MultiSourceRequestableSubscriber(i, j, child, this);
                    subscribers[i] = multisourcerequestablesubscriber;
                    observable.unsafeSubscribe(multisourcerequestablesubscriber);
                    i++;
                }
            }
            tick();
        }

        void tick()
        {
            boolean flag = false;
            if (WIP.getAndIncrement(this) == 0L)
            {
                int j = 0;
                do
                {
                    int i = j;
                    if (requested.get() > 0L)
                    {
                        Object obj = buffer.poll();
                        i = j;
                        int k;
                        if (obj != null)
                        {
                            if (buffer.isCompleted(obj))
                            {
                                child.onCompleted();
                                i = j;
                            } else
                            {
                                buffer.accept(obj, child);
                                i = j + 1;
                                requested.decrementAndGet();
                            }
                        }
                    }
                    j = i;
                } while (WIP.decrementAndGet(this) > 0L);
                if (i > 0)
                {
                    obj = subscribers;
                    k = obj.length;
                    for (j = ((flag) ? 1 : 0); j < k; j++)
                    {
                        obj[j].requestUpTo(i);
                    }

                }
            }
        }


        public MultiSourceProducer(Subscriber subscriber, List list, FuncN funcn)
        {
            sources = list;
            child = subscriber;
            combinator = funcn;
            int i = list.size();
            subscribers = new MultiSourceRequestableSubscriber[i];
            collectedValues = new Object[i];
            haveValues = new BitSet(i);
            completion = new BitSet(i);
        }
    }

}
