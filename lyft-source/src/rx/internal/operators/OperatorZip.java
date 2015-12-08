// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.functions.Functions;

public final class OperatorZip
    implements rx.Observable.Operator
{

    final FuncN zipFunction;

    public OperatorZip(Func2 func2)
    {
        zipFunction = Functions.fromFunc(func2);
    }

    public OperatorZip(Func3 func3)
    {
        zipFunction = Functions.fromFunc(func3);
    }

    public OperatorZip(Func4 func4)
    {
        zipFunction = Functions.fromFunc(func4);
    }

    public OperatorZip(Func5 func5)
    {
        zipFunction = Functions.fromFunc(func5);
    }

    public OperatorZip(Func6 func6)
    {
        zipFunction = Functions.fromFunc(func6);
    }

    public OperatorZip(Func7 func7)
    {
        zipFunction = Functions.fromFunc(func7);
    }

    public OperatorZip(Func8 func8)
    {
        zipFunction = Functions.fromFunc(func8);
    }

    public OperatorZip(Func9 func9)
    {
        zipFunction = Functions.fromFunc(func9);
    }

    public OperatorZip(FuncN funcn)
    {
        zipFunction = funcn;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        Zip zip = new Zip(subscriber, zipFunction);
        ZipProducer zipproducer = new ZipProducer(zip);
        subscriber.setProducer(zipproducer);
        return new ZipSubscriber(subscriber, zip, zipproducer);
    }

    private class Zip
    {

        static final AtomicLongFieldUpdater COUNTER_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorZip$Zip, "counter");
        static final int THRESHOLD;
        private final Observer child;
        private final CompositeSubscription childSubscription = new CompositeSubscription();
        volatile long counter;
        int emitted;
        private Object observers[];
        private AtomicLong requested;
        private final FuncN zipFunction;

        public void start(Observable aobservable[], AtomicLong atomiclong)
        {
            boolean flag = false;
            observers = new Object[aobservable.length];
            requested = atomiclong;
            int i = 0;
            class InnerSubscriber extends Subscriber
            {

                final RxRingBuffer items = RxRingBuffer.getSpmcInstance();
                final Zip this$0;

                public void onCompleted()
                {
                    items.onCompleted();
                    tick();
                }

                public void onError(Throwable throwable)
                {
                    child.onError(throwable);
                }

                public void onNext(Object obj)
                {
                    try
                    {
                        items.onNext(obj);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        onError(((Throwable) (obj)));
                    }
                    tick();
                }

                public void onStart()
                {
                    request(RxRingBuffer.SIZE);
                }

                public void requestMore(long l)
                {
                    request(l);
                }

                InnerSubscriber()
                {
                    this$0 = Zip.this;
                    super();
                }
            }

            int j;
            do
            {
                j = ((flag) ? 1 : 0);
                if (i >= aobservable.length)
                {
                    break;
                }
                atomiclong = new InnerSubscriber();
                observers[i] = atomiclong;
                childSubscription.add(atomiclong);
                i++;
            } while (true);
            for (; j < aobservable.length; j++)
            {
                aobservable[j].unsafeSubscribe((InnerSubscriber)observers[j]);
            }

        }

        void tick()
        {
            Object obj;
            for (obj = ((Object) (observers)); obj == null || COUNTER_UPDATER.getAndIncrement(this) != 0L;)
            {
                return;
            }

            int i1 = obj.length;
            Observer observer = child;
            AtomicLong atomiclong = requested;
            do
            {
                do
                {
                    Object obj1 = ((Object) (new Object[i1]));
                    boolean flag = true;
                    int k = 0;
                    while (k < i1) 
                    {
                        RxRingBuffer rxringbuffer = ((InnerSubscriber)obj[k]).items;
                        Object obj2 = rxringbuffer.peek();
                        if (obj2 == null)
                        {
                            flag = false;
                        } else
                        {
                            if (rxringbuffer.isCompleted(obj2))
                            {
                                observer.onCompleted();
                                childSubscription.unsubscribe();
                                return;
                            }
                            obj1[k] = rxringbuffer.getValue(obj2);
                        }
                        k++;
                    }
                    if (atomiclong.get() <= 0L || !flag)
                    {
                        break;
                    }
                    try
                    {
                        observer.onNext(zipFunction.call(((Object []) (obj1))));
                        atomiclong.decrementAndGet();
                        emitted = emitted + 1;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        observer.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj)), obj1));
                        return;
                    }
                    k = obj.length;
                    for (int i = 0; i < k; i++)
                    {
                        obj1 = ((InnerSubscriber)obj[i]).items;
                        ((RxRingBuffer) (obj1)).poll();
                        if (((RxRingBuffer) (obj1)).isCompleted(((RxRingBuffer) (obj1)).peek()))
                        {
                            observer.onCompleted();
                            childSubscription.unsubscribe();
                            return;
                        }
                    }

                    if (emitted > THRESHOLD)
                    {
                        int l = obj.length;
                        for (int j = 0; j < l; j++)
                        {
                            ((InnerSubscriber)obj[j]).requestMore(emitted);
                        }

                        emitted = 0;
                    }
                } while (true);
            } while (COUNTER_UPDATER.decrementAndGet(this) > 0L);
        }

        static 
        {
            THRESHOLD = (int)((double)RxRingBuffer.SIZE * 0.69999999999999996D);
        }


        public Zip(Subscriber subscriber, FuncN funcn)
        {
            emitted = 0;
            child = subscriber;
            zipFunction = funcn;
            subscriber.add(childSubscription);
        }
    }


    private class ZipProducer extends AtomicLong
        implements Producer
    {

        private static final long serialVersionUID = 0xef1d7f41cd754f54L;
        private Zip zipper;

        public void request(long l)
        {
            BackpressureUtils.getAndAddRequest(this, l);
            zipper.tick();
        }

        public ZipProducer(Zip zip)
        {
            zipper = zip;
        }
    }


    private class ZipSubscriber extends Subscriber
    {

        final Subscriber child;
        final ZipProducer producer;
        boolean started;
        final OperatorZip this$0;
        final Zip zipper;

        public void onCompleted()
        {
            if (!started)
            {
                child.onCompleted();
            }
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable[])obj);
        }

        public void onNext(Observable aobservable[])
        {
            if (aobservable == null || aobservable.length == 0)
            {
                child.onCompleted();
                return;
            } else
            {
                started = true;
                zipper.start(aobservable, producer);
                return;
            }
        }

        public ZipSubscriber(Subscriber subscriber, Zip zip, ZipProducer zipproducer)
        {
            this$0 = OperatorZip.this;
            super(subscriber);
            started = false;
            child = subscriber;
            zipper = zip;
            producer = zipproducer;
        }
    }

}
