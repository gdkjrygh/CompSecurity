// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
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
import rx.internal.operators.OnSubscribeAmb;
import rx.internal.operators.OnSubscribeCache;
import rx.internal.operators.OnSubscribeCombineLatest;
import rx.internal.operators.OnSubscribeDefer;
import rx.internal.operators.OnSubscribeDelaySubscription;
import rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.operators.OnSubscribeGroupJoin;
import rx.internal.operators.OnSubscribeJoin;
import rx.internal.operators.OnSubscribeMulticastSelector;
import rx.internal.operators.OnSubscribeRange;
import rx.internal.operators.OnSubscribeRedo;
import rx.internal.operators.OnSubscribeSingle;
import rx.internal.operators.OnSubscribeTimerOnce;
import rx.internal.operators.OnSubscribeTimerPeriodically;
import rx.internal.operators.OnSubscribeToObservableFuture;
import rx.internal.operators.OnSubscribeUsing;
import rx.internal.operators.OperatorAll;
import rx.internal.operators.OperatorAny;
import rx.internal.operators.OperatorAsObservable;
import rx.internal.operators.OperatorBufferWithSingleObservable;
import rx.internal.operators.OperatorBufferWithSize;
import rx.internal.operators.OperatorBufferWithStartEndObservable;
import rx.internal.operators.OperatorBufferWithTime;
import rx.internal.operators.OperatorCast;
import rx.internal.operators.OperatorConcat;
import rx.internal.operators.OperatorDebounceWithSelector;
import rx.internal.operators.OperatorDebounceWithTime;
import rx.internal.operators.OperatorDelay;
import rx.internal.operators.OperatorDelayWithSelector;
import rx.internal.operators.OperatorDematerialize;
import rx.internal.operators.OperatorDistinct;
import rx.internal.operators.OperatorDistinctUntilChanged;
import rx.internal.operators.OperatorDoOnEach;
import rx.internal.operators.OperatorDoOnRequest;
import rx.internal.operators.OperatorDoOnSubscribe;
import rx.internal.operators.OperatorDoOnUnsubscribe;
import rx.internal.operators.OperatorElementAt;
import rx.internal.operators.OperatorFilter;
import rx.internal.operators.OperatorFinally;
import rx.internal.operators.OperatorGroupBy;
import rx.internal.operators.OperatorIgnoreElements;
import rx.internal.operators.OperatorMap;
import rx.internal.operators.OperatorMapNotification;
import rx.internal.operators.OperatorMapPair;
import rx.internal.operators.OperatorMaterialize;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorMulticast;
import rx.internal.operators.OperatorObserveOn;
import rx.internal.operators.OperatorOnBackpressureBlock;
import rx.internal.operators.OperatorOnBackpressureBuffer;
import rx.internal.operators.OperatorOnBackpressureDrop;
import rx.internal.operators.OperatorOnBackpressureLatest;
import rx.internal.operators.OperatorOnErrorResumeNextViaFunction;
import rx.internal.operators.OperatorOnErrorResumeNextViaObservable;
import rx.internal.operators.OperatorOnErrorReturn;
import rx.internal.operators.OperatorOnExceptionResumeNextViaObservable;
import rx.internal.operators.OperatorPublish;
import rx.internal.operators.OperatorReplay;
import rx.internal.operators.OperatorRetryWithPredicate;
import rx.internal.operators.OperatorSampleWithObservable;
import rx.internal.operators.OperatorSampleWithTime;
import rx.internal.operators.OperatorScan;
import rx.internal.operators.OperatorSequenceEqual;
import rx.internal.operators.OperatorSerialize;
import rx.internal.operators.OperatorSingle;
import rx.internal.operators.OperatorSkip;
import rx.internal.operators.OperatorSkipLast;
import rx.internal.operators.OperatorSkipLastTimed;
import rx.internal.operators.OperatorSkipTimed;
import rx.internal.operators.OperatorSkipUntil;
import rx.internal.operators.OperatorSkipWhile;
import rx.internal.operators.OperatorSubscribeOn;
import rx.internal.operators.OperatorSwitch;
import rx.internal.operators.OperatorSwitchIfEmpty;
import rx.internal.operators.OperatorTake;
import rx.internal.operators.OperatorTakeLast;
import rx.internal.operators.OperatorTakeLastOne;
import rx.internal.operators.OperatorTakeLastTimed;
import rx.internal.operators.OperatorTakeTimed;
import rx.internal.operators.OperatorTakeUntil;
import rx.internal.operators.OperatorTakeUntilPredicate;
import rx.internal.operators.OperatorTakeWhile;
import rx.internal.operators.OperatorThrottleFirst;
import rx.internal.operators.OperatorTimeInterval;
import rx.internal.operators.OperatorTimeout;
import rx.internal.operators.OperatorTimeoutWithSelector;
import rx.internal.operators.OperatorTimestamp;
import rx.internal.operators.OperatorToMap;
import rx.internal.operators.OperatorToMultimap;
import rx.internal.operators.OperatorToObservableList;
import rx.internal.operators.OperatorToObservableSortedList;
import rx.internal.operators.OperatorUnsubscribeOn;
import rx.internal.operators.OperatorWindowWithObservable;
import rx.internal.operators.OperatorWindowWithObservableFactory;
import rx.internal.operators.OperatorWindowWithSize;
import rx.internal.operators.OperatorWindowWithStartEndObservable;
import rx.internal.operators.OperatorWindowWithTime;
import rx.internal.operators.OperatorWithLatestFrom;
import rx.internal.operators.OperatorZip;
import rx.internal.operators.OperatorZipIterable;
import rx.internal.producers.SingleProducer;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions;
import rx.observables.BlockingObservable;
import rx.observables.ConnectableObservable;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaObservableExecutionHook;
import rx.plugins.RxJavaPlugins;
import rx.schedulers.Schedulers;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx:
//            Subscriber, Single, Scheduler, Observer, 
//            Subscription, Notification

public class Observable
{
    private static final class CountHolder
    {

        static final Func2 INSTANCE = new Func2() {

            public final Integer call(Integer integer, Object obj)
            {
                return Integer.valueOf(integer.intValue() + 1);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Integer)obj, obj1);
            }

        };


        private CountHolder()
        {
        }
    }

    private static final class CountLongHolder
    {

        static final Func2 INSTANCE = new Func2() {

            public final Long call(Long long1, Object obj)
            {
                return Long.valueOf(long1.longValue() + 1L);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Long)obj, obj1);
            }

        };


        private CountLongHolder()
        {
        }
    }

    private static final class EmptyHolder
    {

        static final Observable INSTANCE = Observable.create(new OnSubscribe() {

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subscriber.onCompleted();
            }

        });


        private EmptyHolder()
        {
        }
    }

    private static class HolderAnyForEmpty
    {

        static final OperatorAny INSTANCE = new OperatorAny(UtilityFunctions.alwaysTrue(), true);


        private HolderAnyForEmpty()
        {
        }
    }

    private static class NeverObservable extends Observable
    {

        static NeverObservable instance()
        {
            return Holder.INSTANCE;
        }

        NeverObservable()
        {
            super(new _cls1());
        }
    }

    private static class NeverObservable.Holder
    {

        static final NeverObservable INSTANCE = new NeverObservable();


        private NeverObservable.Holder()
        {
        }
    }

    public static interface OnSubscribe
        extends Action1
    {
    }

    public static interface Operator
        extends Func1
    {
    }

    private static class ThrowObservable extends Observable
    {

        public ThrowObservable(final Throwable exception)
        {
            super(new _cls1());
        }
    }

    public static interface Transformer
        extends Func1
    {
    }


    private static final RxJavaObservableExecutionHook hook = RxJavaPlugins.getInstance().getObservableExecutionHook();
    final OnSubscribe onSubscribe;

    protected Observable(OnSubscribe onsubscribe)
    {
        onSubscribe = onsubscribe;
    }

    public static final Observable amb(Iterable iterable)
    {
        return create(OnSubscribeAmb.amb(iterable));
    }

    public static final Observable amb(Observable observable, Observable observable1)
    {
        return create(OnSubscribeAmb.amb(observable, observable1));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static final Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8)
    {
        return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static final Observable combineLatest(List list, FuncN funcn)
    {
        return create(new OnSubscribeCombineLatest(list, funcn));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8, Func9 func9)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
        }), Functions.fromFunc(func9));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Func8 func8)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
        }), Functions.fromFunc(func8));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Func7 func7)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6
        }), Functions.fromFunc(func7));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Func6 func6)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5
        }), Functions.fromFunc(func6));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Func5 func5)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4
        }), Functions.fromFunc(func5));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Func4 func4)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3
        }), Functions.fromFunc(func4));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Func3 func3)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1, observable2
        }), Functions.fromFunc(func3));
    }

    public static final Observable combineLatest(Observable observable, Observable observable1, Func2 func2)
    {
        return combineLatest(Arrays.asList(new Observable[] {
            observable, observable1
        }), Functions.fromFunc(func2));
    }

    public static final Observable concat(Observable observable)
    {
        return observable.lift(OperatorConcat.instance());
    }

    public static final Observable concat(Observable observable, Observable observable1)
    {
        return concat(just(observable, observable1));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2)
    {
        return concat(just(observable, observable1, observable2));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3)
    {
        return concat(just(observable, observable1, observable2, observable3));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
    {
        return concat(just(observable, observable1, observable2, observable3, observable4));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
    {
        return concat(just(observable, observable1, observable2, observable3, observable4, observable5));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
    {
        return concat(just(observable, observable1, observable2, observable3, observable4, observable5, observable6));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
    {
        return concat(just(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static final Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8)
    {
        return concat(just(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static final Observable create(OnSubscribe onsubscribe)
    {
        return new Observable(hook.onCreate(onsubscribe));
    }

    public static final Observable defer(Func0 func0)
    {
        return create(new OnSubscribeDefer(func0));
    }

    public static final Observable empty()
    {
        return EmptyHolder.INSTANCE;
    }

    public static final Observable error(Throwable throwable)
    {
        return new ThrowObservable(throwable);
    }

    public static final Observable from(Iterable iterable)
    {
        return create(new OnSubscribeFromIterable(iterable));
    }

    public static final Observable from(Future future)
    {
        return create(OnSubscribeToObservableFuture.toObservableFuture(future));
    }

    public static final Observable from(Future future, long l, TimeUnit timeunit)
    {
        return create(OnSubscribeToObservableFuture.toObservableFuture(future, l, timeunit));
    }

    public static final Observable from(Future future, Scheduler scheduler)
    {
        return create(OnSubscribeToObservableFuture.toObservableFuture(future)).subscribeOn(scheduler);
    }

    public static final Observable from(Object aobj[])
    {
        return from(((Iterable) (Arrays.asList(aobj))));
    }

    public static final Observable interval(long l, long l1, TimeUnit timeunit)
    {
        return interval(l, l1, timeunit, Schedulers.computation());
    }

    public static final Observable interval(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
    {
        return create(new OnSubscribeTimerPeriodically(l, l1, timeunit, scheduler));
    }

    public static final Observable interval(long l, TimeUnit timeunit)
    {
        return interval(l, l, timeunit, Schedulers.computation());
    }

    public static final Observable interval(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return interval(l, l, timeunit, scheduler);
    }

    public static final Observable just(Object obj)
    {
        return ScalarSynchronousObservable.create(obj);
    }

    public static final Observable just(Object obj, Object obj1)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8
        }));
    }

    public static final Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return from(Arrays.asList(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9
        }));
    }

    private final Observable mapNotification(Func1 func1, Func1 func1_1, Func0 func0)
    {
        return lift(new OperatorMapNotification(func1, func1_1, func0));
    }

    public static final Observable merge(Iterable iterable)
    {
        return merge(from(iterable));
    }

    public static final Observable merge(Iterable iterable, int i)
    {
        return merge(from(iterable), i);
    }

    public static final Observable merge(Observable observable)
    {
        if (observable.getClass() == rx/internal/util/ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)observable).scalarFlatMap(UtilityFunctions.identity());
        } else
        {
            return observable.lift(OperatorMerge.instance(false));
        }
    }

    public static final Observable merge(Observable observable, int i)
    {
        if (observable.getClass() == rx/internal/util/ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)observable).scalarFlatMap(UtilityFunctions.identity());
        } else
        {
            return observable.lift(OperatorMerge.instance(false, i));
        }
    }

    public static final Observable merge(Observable observable, Observable observable1)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
        })));
    }

    public static final Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8)
    {
        return merge(from(Arrays.asList(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
        })));
    }

    public static final Observable merge(Observable aobservable[])
    {
        return merge(from(aobservable));
    }

    public static final Observable merge(Observable aobservable[], int i)
    {
        return merge(from(aobservable), i);
    }

    public static final Observable mergeDelayError(Observable observable)
    {
        return observable.lift(OperatorMerge.instance(true));
    }

    public static final Observable mergeDelayError(Observable observable, int i)
    {
        return observable.lift(OperatorMerge.instance(true, i));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1)
    {
        return mergeDelayError(just(observable, observable1));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2)
    {
        return mergeDelayError(just(observable, observable1, observable2));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3, observable4));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3, observable4, observable5));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3, observable4, observable5, observable6));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static final Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8)
    {
        return mergeDelayError(just(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static final Observable never()
    {
        return NeverObservable.instance();
    }

    public static final Observable range(int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Count can not be negative");
        }
        if (j == 0)
        {
            return empty();
        }
        if (i > (0x7fffffff - j) + 1)
        {
            throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
        }
        if (j == 1)
        {
            return just(Integer.valueOf(i));
        } else
        {
            return create(new OnSubscribeRange(i, (j - 1) + i));
        }
    }

    public static final Observable range(int i, int j, Scheduler scheduler)
    {
        return range(i, j).subscribeOn(scheduler);
    }

    public static final Observable sequenceEqual(Observable observable, Observable observable1)
    {
        return sequenceEqual(observable, observable1, new Func2() {

            public final Boolean call(Object obj, Object obj1)
            {
                if (obj == null)
                {
                    boolean flag;
                    if (obj1 == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return Boolean.valueOf(flag);
                } else
                {
                    return Boolean.valueOf(obj.equals(obj1));
                }
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call(obj, obj1);
            }

        });
    }

    public static final Observable sequenceEqual(Observable observable, Observable observable1, Func2 func2)
    {
        return OperatorSequenceEqual.sequenceEqual(observable, observable1, func2);
    }

    public static final Observable switchOnNext(Observable observable)
    {
        return observable.lift(OperatorSwitch.instance());
    }

    public static final Observable timer(long l, long l1, TimeUnit timeunit)
    {
        return interval(l, l1, timeunit, Schedulers.computation());
    }

    public static final Observable timer(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
    {
        return interval(l, l1, timeunit, scheduler);
    }

    public static final Observable timer(long l, TimeUnit timeunit)
    {
        return timer(l, timeunit, Schedulers.computation());
    }

    public static final Observable timer(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return create(new OnSubscribeTimerOnce(l, timeunit, scheduler));
    }

    public static final Observable using(Func0 func0, Func1 func1, Action1 action1)
    {
        return using(func0, func1, action1, false);
    }

    public static final Observable using(Func0 func0, Func1 func1, Action1 action1, boolean flag)
    {
        return create(new OnSubscribeUsing(func0, func1, action1, flag));
    }

    public static final Observable zip(Iterable iterable, FuncN funcn)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((Observable)iterable.next())) { }
        return just(((Object) (arraylist.toArray(new Observable[arraylist.size()])))).lift(new OperatorZip(funcn));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8, Func9 func9)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
        }).lift(new OperatorZip(func9));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Func8 func8)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
        }).lift(new OperatorZip(func8));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Func7 func7)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5, observable6
        }).lift(new OperatorZip(func7));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Func6 func6)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3, observable4, observable5
        }).lift(new OperatorZip(func6));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Func5 func5)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3, observable4
        }).lift(new OperatorZip(func5));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Func4 func4)
    {
        return just(new Observable[] {
            observable, observable1, observable2, observable3
        }).lift(new OperatorZip(func4));
    }

    public static final Observable zip(Observable observable, Observable observable1, Observable observable2, Func3 func3)
    {
        return just(new Observable[] {
            observable, observable1, observable2
        }).lift(new OperatorZip(func3));
    }

    public static final Observable zip(Observable observable, Observable observable1, Func2 func2)
    {
        return just(new Observable[] {
            observable, observable1
        }).lift(new OperatorZip(func2));
    }

    public static final Observable zip(Observable observable, FuncN funcn)
    {
        return observable.toList().map(new Func1() {

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Observable[] call(List list)
            {
                return (Observable[])list.toArray(new Observable[list.size()]);
            }

        }).lift(new OperatorZip(funcn));
    }

    public final Observable all(Func1 func1)
    {
        return lift(new OperatorAll(func1));
    }

    public final Observable ambWith(Observable observable)
    {
        return amb(this, observable);
    }

    public final Observable asObservable()
    {
        return lift(OperatorAsObservable.instance());
    }

    public final Observable buffer(int i)
    {
        return buffer(i, i);
    }

    public final Observable buffer(int i, int j)
    {
        return lift(new OperatorBufferWithSize(i, j));
    }

    public final Observable buffer(long l, long l1, TimeUnit timeunit)
    {
        return buffer(l, l1, timeunit, Schedulers.computation());
    }

    public final Observable buffer(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorBufferWithTime(l, l1, timeunit, 0x7fffffff, scheduler));
    }

    public final Observable buffer(long l, TimeUnit timeunit)
    {
        return buffer(l, timeunit, 0x7fffffff, Schedulers.computation());
    }

    public final Observable buffer(long l, TimeUnit timeunit, int i)
    {
        return lift(new OperatorBufferWithTime(l, l, timeunit, i, Schedulers.computation()));
    }

    public final Observable buffer(long l, TimeUnit timeunit, int i, Scheduler scheduler)
    {
        return lift(new OperatorBufferWithTime(l, l, timeunit, i, scheduler));
    }

    public final Observable buffer(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return buffer(l, l, timeunit, scheduler);
    }

    public final Observable buffer(Observable observable)
    {
        return buffer(observable, 16);
    }

    public final Observable buffer(Observable observable, int i)
    {
        return lift(new OperatorBufferWithSingleObservable(observable, i));
    }

    public final Observable buffer(Observable observable, Func1 func1)
    {
        return lift(new OperatorBufferWithStartEndObservable(observable, func1));
    }

    public final Observable buffer(Func0 func0)
    {
        return lift(new OperatorBufferWithSingleObservable(func0, 16));
    }

    public final Observable cache()
    {
        return create(new OnSubscribeCache(this));
    }

    public final Observable cache(int i)
    {
        return create(new OnSubscribeCache(this, i));
    }

    public final Observable cast(Class class1)
    {
        return lift(new OperatorCast(class1));
    }

    public final Observable collect(Func0 func0, final Action2 collector)
    {
        return lift(new OperatorScan(func0, new Func2() {

            final Observable this$0;
            final Action2 val$collector;

            public final Object call(Object obj, Object obj1)
            {
                collector.call(obj, obj1);
                return obj;
            }

            
            {
                this$0 = Observable.this;
                collector = action2;
                super();
            }
        })).last();
    }

    public Observable compose(Transformer transformer)
    {
        return (Observable)transformer.call(this);
    }

    public final Observable concatMap(Func1 func1)
    {
        return concat(map(func1));
    }

    public final Observable concatWith(Observable observable)
    {
        return concat(this, observable);
    }

    public final Observable contains(final Object element)
    {
        return exists(new Func1() {

            final Observable this$0;
            final Object val$element;

            public final Boolean call(Object obj)
            {
                boolean flag;
                if (element == null)
                {
                    if (obj == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = element.equals(obj);
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call(obj);
            }

            
            {
                this$0 = Observable.this;
                element = obj;
                super();
            }
        });
    }

    public final Observable count()
    {
        return reduce(Integer.valueOf(0), CountHolder.INSTANCE);
    }

    public final Observable countLong()
    {
        return reduce(Long.valueOf(0L), CountLongHolder.INSTANCE);
    }

    public final Observable debounce(long l, TimeUnit timeunit)
    {
        return debounce(l, timeunit, Schedulers.computation());
    }

    public final Observable debounce(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorDebounceWithTime(l, timeunit, scheduler));
    }

    public final Observable debounce(Func1 func1)
    {
        return lift(new OperatorDebounceWithSelector(func1));
    }

    public final Observable defaultIfEmpty(final Object defaultValue)
    {
        return switchIfEmpty(create(new OnSubscribe() {

            final Observable this$0;
            final Object val$defaultValue;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subscriber.setProducer(new SingleProducer(subscriber, defaultValue));
            }

            
            {
                this$0 = Observable.this;
                defaultValue = obj;
                super();
            }
        }));
    }

    public final Observable delay(long l, TimeUnit timeunit)
    {
        return delay(l, timeunit, Schedulers.computation());
    }

    public final Observable delay(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorDelay(this, l, timeunit, scheduler));
    }

    public final Observable delay(Func0 func0, Func1 func1)
    {
        return delaySubscription(func0).lift(new OperatorDelayWithSelector(this, func1));
    }

    public final Observable delay(Func1 func1)
    {
        return lift(new OperatorDelayWithSelector(this, func1));
    }

    public final Observable delaySubscription(long l, TimeUnit timeunit)
    {
        return delaySubscription(l, timeunit, Schedulers.computation());
    }

    public final Observable delaySubscription(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return create(new OnSubscribeDelaySubscription(this, l, timeunit, scheduler));
    }

    public final Observable delaySubscription(Func0 func0)
    {
        return create(new OnSubscribeDelaySubscriptionWithSelector(this, func0));
    }

    public final Observable dematerialize()
    {
        return lift(OperatorDematerialize.instance());
    }

    public final Observable distinct()
    {
        return lift(OperatorDistinct.instance());
    }

    public final Observable distinct(Func1 func1)
    {
        return lift(new OperatorDistinct(func1));
    }

    public final Observable distinctUntilChanged()
    {
        return lift(OperatorDistinctUntilChanged.instance());
    }

    public final Observable distinctUntilChanged(Func1 func1)
    {
        return lift(new OperatorDistinctUntilChanged(func1));
    }

    public final Observable doOnCompleted(final Action0 onCompleted)
    {
        return lift(new OperatorDoOnEach(new Observer() {

            final Observable this$0;
            final Action0 val$onCompleted;

            public final void onCompleted()
            {
                onCompleted.call();
            }

            public final void onError(Throwable throwable)
            {
            }

            public final void onNext(Object obj)
            {
            }

            
            {
                this$0 = Observable.this;
                onCompleted = action0;
                super();
            }
        }));
    }

    public final Observable doOnEach(Observer observer)
    {
        return lift(new OperatorDoOnEach(observer));
    }

    public final Observable doOnEach(final Action1 onNotification)
    {
        return lift(new OperatorDoOnEach(new Observer() {

            final Observable this$0;
            final Action1 val$onNotification;

            public final void onCompleted()
            {
                onNotification.call(Notification.createOnCompleted());
            }

            public final void onError(Throwable throwable)
            {
                onNotification.call(Notification.createOnError(throwable));
            }

            public final void onNext(Object obj)
            {
                onNotification.call(Notification.createOnNext(obj));
            }

            
            {
                this$0 = Observable.this;
                onNotification = action1;
                super();
            }
        }));
    }

    public final Observable doOnError(final Action1 onError)
    {
        return lift(new OperatorDoOnEach(new Observer() {

            final Observable this$0;
            final Action1 val$onError;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                onError.call(throwable);
            }

            public final void onNext(Object obj)
            {
            }

            
            {
                this$0 = Observable.this;
                onError = action1;
                super();
            }
        }));
    }

    public final Observable doOnNext(final Action1 onNext)
    {
        return lift(new OperatorDoOnEach(new Observer() {

            final Observable this$0;
            final Action1 val$onNext;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
            }

            public final void onNext(Object obj)
            {
                onNext.call(obj);
            }

            
            {
                this$0 = Observable.this;
                onNext = action1;
                super();
            }
        }));
    }

    public final Observable doOnRequest(Action1 action1)
    {
        return lift(new OperatorDoOnRequest(action1));
    }

    public final Observable doOnSubscribe(Action0 action0)
    {
        return lift(new OperatorDoOnSubscribe(action0));
    }

    public final Observable doOnTerminate(final Action0 onTerminate)
    {
        return lift(new OperatorDoOnEach(new Observer() {

            final Observable this$0;
            final Action0 val$onTerminate;

            public final void onCompleted()
            {
                onTerminate.call();
            }

            public final void onError(Throwable throwable)
            {
                onTerminate.call();
            }

            public final void onNext(Object obj)
            {
            }

            
            {
                this$0 = Observable.this;
                onTerminate = action0;
                super();
            }
        }));
    }

    public final Observable doOnUnsubscribe(Action0 action0)
    {
        return lift(new OperatorDoOnUnsubscribe(action0));
    }

    public final Observable elementAt(int i)
    {
        return lift(new OperatorElementAt(i));
    }

    public final Observable elementAtOrDefault(int i, Object obj)
    {
        return lift(new OperatorElementAt(i, obj));
    }

    public final Observable exists(Func1 func1)
    {
        return lift(new OperatorAny(func1, false));
    }

    public final Observable filter(Func1 func1)
    {
        return lift(new OperatorFilter(func1));
    }

    public final Observable finallyDo(Action0 action0)
    {
        return lift(new OperatorFinally(action0));
    }

    public final Observable first()
    {
        return take(1).single();
    }

    public final Observable first(Func1 func1)
    {
        return takeFirst(func1).single();
    }

    public final Observable firstOrDefault(Object obj)
    {
        return take(1).singleOrDefault(obj);
    }

    public final Observable firstOrDefault(Object obj, Func1 func1)
    {
        return takeFirst(func1).singleOrDefault(obj);
    }

    public final Observable flatMap(Func1 func1)
    {
        if (getClass() == rx/internal/util/ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
        } else
        {
            return merge(map(func1));
        }
    }

    public final Observable flatMap(Func1 func1, int i)
    {
        if (getClass() == rx/internal/util/ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
        } else
        {
            return merge(map(func1), i);
        }
    }

    public final Observable flatMap(Func1 func1, Func1 func1_1, Func0 func0)
    {
        return merge(mapNotification(func1, func1_1, func0));
    }

    public final Observable flatMap(Func1 func1, Func1 func1_1, Func0 func0, int i)
    {
        return merge(mapNotification(func1, func1_1, func0), i);
    }

    public final Observable flatMap(Func1 func1, Func2 func2)
    {
        return merge(lift(new OperatorMapPair(func1, func2)));
    }

    public final Observable flatMap(Func1 func1, Func2 func2, int i)
    {
        return merge(lift(new OperatorMapPair(func1, func2)), i);
    }

    public final Observable flatMapIterable(Func1 func1)
    {
        return merge(map(OperatorMapPair.convertSelector(func1)));
    }

    public final Observable flatMapIterable(Func1 func1, Func2 func2)
    {
        return flatMap(OperatorMapPair.convertSelector(func1), func2);
    }

    public final void forEach(Action1 action1)
    {
        subscribe(action1);
    }

    public final void forEach(Action1 action1, Action1 action1_1)
    {
        subscribe(action1, action1_1);
    }

    public final void forEach(Action1 action1, Action1 action1_1, Action0 action0)
    {
        subscribe(action1, action1_1, action0);
    }

    public final Observable groupBy(Func1 func1)
    {
        return lift(new OperatorGroupBy(func1));
    }

    public final Observable groupBy(Func1 func1, Func1 func1_1)
    {
        return lift(new OperatorGroupBy(func1, func1_1));
    }

    public final Observable groupJoin(Observable observable, Func1 func1, Func1 func1_1, Func2 func2)
    {
        return create(new OnSubscribeGroupJoin(this, observable, func1, func1_1, func2));
    }

    public final Observable ignoreElements()
    {
        return lift(OperatorIgnoreElements.instance());
    }

    public final Observable isEmpty()
    {
        return lift(HolderAnyForEmpty.INSTANCE);
    }

    public final Observable join(Observable observable, Func1 func1, Func1 func1_1, Func2 func2)
    {
        return create(new OnSubscribeJoin(this, observable, func1, func1_1, func2));
    }

    public final Observable last()
    {
        return takeLast(1).single();
    }

    public final Observable last(Func1 func1)
    {
        return filter(func1).takeLast(1).single();
    }

    public final Observable lastOrDefault(Object obj)
    {
        return takeLast(1).singleOrDefault(obj);
    }

    public final Observable lastOrDefault(Object obj, Func1 func1)
    {
        return filter(func1).takeLast(1).singleOrDefault(obj);
    }

    public final Observable lift(final Operator lift)
    {
        return new Observable(new OnSubscribe() {

            final Observable this$0;
            final Operator val$lift;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj;
                Throwable throwable;
                try
                {
                    obj = (Subscriber)Observable.hook.onLift(lift).call(subscriber);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (obj instanceof OnErrorNotImplementedException)
                    {
                        throw (OnErrorNotImplementedException)obj;
                    } else
                    {
                        subscriber.onError(((Throwable) (obj)));
                        return;
                    }
                }
                ((Subscriber) (obj)).onStart();
                onSubscribe.call(obj);
                return;
                throwable;
                if (throwable instanceof OnErrorNotImplementedException)
                {
                    throw (OnErrorNotImplementedException)throwable;
                }
                ((Subscriber) (obj)).onError(throwable);
                return;
            }

            
            {
                this$0 = Observable.this;
                lift = operator;
                super();
            }
        });
    }

    public final Observable limit(int i)
    {
        return take(i);
    }

    public final Observable map(Func1 func1)
    {
        return lift(new OperatorMap(func1));
    }

    public final Observable materialize()
    {
        return lift(OperatorMaterialize.instance());
    }

    public final Observable mergeWith(Observable observable)
    {
        return merge(this, observable);
    }

    public final Observable nest()
    {
        return just(this);
    }

    public final Observable observeOn(Scheduler scheduler)
    {
        if (this instanceof ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)this).scalarScheduleOn(scheduler);
        } else
        {
            return lift(new OperatorObserveOn(scheduler));
        }
    }

    public final Observable ofType(final Class klass)
    {
        return filter(new Func1() {

            final Observable this$0;
            final Class val$klass;

            public final Boolean call(Object obj)
            {
                return Boolean.valueOf(klass.isInstance(obj));
            }

            public volatile Object call(Object obj)
            {
                return call(obj);
            }

            
            {
                this$0 = Observable.this;
                klass = class1;
                super();
            }
        }).cast(klass);
    }

    public final Observable onBackpressureBlock()
    {
        return onBackpressureBlock(RxRingBuffer.SIZE);
    }

    public final Observable onBackpressureBlock(int i)
    {
        return lift(new OperatorOnBackpressureBlock(i));
    }

    public final Observable onBackpressureBuffer()
    {
        return lift(OperatorOnBackpressureBuffer.instance());
    }

    public final Observable onBackpressureBuffer(long l)
    {
        return lift(new OperatorOnBackpressureBuffer(l));
    }

    public final Observable onBackpressureBuffer(long l, Action0 action0)
    {
        return lift(new OperatorOnBackpressureBuffer(l, action0));
    }

    public final Observable onBackpressureDrop()
    {
        return lift(OperatorOnBackpressureDrop.instance());
    }

    public final Observable onBackpressureDrop(Action1 action1)
    {
        return lift(new OperatorOnBackpressureDrop(action1));
    }

    public final Observable onBackpressureLatest()
    {
        return lift(OperatorOnBackpressureLatest.instance());
    }

    public final Observable onErrorResumeNext(Observable observable)
    {
        return lift(new OperatorOnErrorResumeNextViaObservable(observable));
    }

    public final Observable onErrorResumeNext(Func1 func1)
    {
        return lift(new OperatorOnErrorResumeNextViaFunction(func1));
    }

    public final Observable onErrorReturn(Func1 func1)
    {
        return lift(new OperatorOnErrorReturn(func1));
    }

    public final Observable onExceptionResumeNext(Observable observable)
    {
        return lift(new OperatorOnExceptionResumeNextViaObservable(observable));
    }

    public final Observable publish(Func1 func1)
    {
        return OperatorPublish.create(this, func1);
    }

    public final ConnectableObservable publish()
    {
        return OperatorPublish.create(this);
    }

    public final Observable reduce(Object obj, Func2 func2)
    {
        return scan(obj, func2).takeLast(1);
    }

    public final Observable reduce(Func2 func2)
    {
        return scan(func2).last();
    }

    public final Observable repeat()
    {
        return OnSubscribeRedo.repeat(this);
    }

    public final Observable repeat(long l)
    {
        return OnSubscribeRedo.repeat(this, l);
    }

    public final Observable repeat(long l, Scheduler scheduler)
    {
        return OnSubscribeRedo.repeat(this, l, scheduler);
    }

    public final Observable repeat(Scheduler scheduler)
    {
        return OnSubscribeRedo.repeat(this, scheduler);
    }

    public final Observable repeatWhen(final Func1 notificationHandler)
    {
        return OnSubscribeRedo.repeat(this, new Func1() {

            final Observable this$0;
            final Func1 val$notificationHandler;

            public volatile Object call(Object obj)
            {
                return call((Observable)obj);
            }

            public Observable call(Observable observable)
            {
                return (Observable)notificationHandler.call(observable.map(new Func1() {

                    final _cls14 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Notification)obj);
                    }

                    public Void call(Notification notification)
                    {
                        return null;
                    }

            
            {
                this$1 = _cls14.this;
                super();
            }
                }));
            }

            
            {
                this$0 = Observable.this;
                notificationHandler = func1;
                super();
            }
        });
    }

    public final Observable repeatWhen(final Func1 notificationHandler, Scheduler scheduler)
    {
        return OnSubscribeRedo.repeat(this, new Func1() {

            final Observable this$0;
            final Func1 val$notificationHandler;

            public volatile Object call(Object obj)
            {
                return call((Observable)obj);
            }

            public Observable call(Observable observable)
            {
                return (Observable)notificationHandler.call(observable.map(new Func1() {

                    final _cls13 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Notification)obj);
                    }

                    public Void call(Notification notification)
                    {
                        return null;
                    }

            
            {
                this$1 = _cls13.this;
                super();
            }
                }));
            }

            
            {
                this$0 = Observable.this;
                notificationHandler = func1;
                super();
            }
        }, scheduler);
    }

    public final Observable replay(Func1 func1)
    {
        return create(new OnSubscribeMulticastSelector(this, new Func0() {

            final Observable this$0;

            public volatile Object call()
            {
                return call();
            }

            public final Subject call()
            {
                return ReplaySubject.create();
            }

            
            {
                this$0 = Observable.this;
                super();
            }
        }, func1));
    }

    public final Observable replay(Func1 func1, final int bufferSize)
    {
        return create(new OnSubscribeMulticastSelector(this, new Func0() {

            final Observable this$0;
            final int val$bufferSize;

            public volatile Object call()
            {
                return call();
            }

            public final Subject call()
            {
                return ReplaySubject.createWithSize(bufferSize);
            }

            
            {
                this$0 = Observable.this;
                bufferSize = i;
                super();
            }
        }, func1));
    }

    public final Observable replay(Func1 func1, int i, long l, TimeUnit timeunit)
    {
        return replay(func1, i, l, timeunit, Schedulers.computation());
    }

    public final Observable replay(Func1 func1, final int bufferSize, final long time, final TimeUnit unit, final Scheduler scheduler)
    {
        if (bufferSize < 0)
        {
            throw new IllegalArgumentException("bufferSize < 0");
        } else
        {
            return create(new OnSubscribeMulticastSelector(this, new Func0() {

                final Observable this$0;
                final int val$bufferSize;
                final Scheduler val$scheduler;
                final long val$time;
                final TimeUnit val$unit;

                public volatile Object call()
                {
                    return call();
                }

                public final Subject call()
                {
                    return ReplaySubject.createWithTimeAndSize(time, unit, bufferSize, scheduler);
                }

            
            {
                this$0 = Observable.this;
                time = l;
                unit = timeunit;
                bufferSize = i;
                scheduler = scheduler1;
                super();
            }
            }, func1));
        }
    }

    public final Observable replay(Func1 func1, final int bufferSize, final Scheduler scheduler)
    {
        return create(new OnSubscribeMulticastSelector(this, new Func0() {

            final Observable this$0;
            final int val$bufferSize;
            final Scheduler val$scheduler;

            public volatile Object call()
            {
                return call();
            }

            public final Subject call()
            {
                return OperatorReplay.createScheduledSubject(ReplaySubject.createWithSize(bufferSize), scheduler);
            }

            
            {
                this$0 = Observable.this;
                bufferSize = i;
                scheduler = scheduler1;
                super();
            }
        }, func1));
    }

    public final Observable replay(Func1 func1, long l, TimeUnit timeunit)
    {
        return replay(func1, l, timeunit, Schedulers.computation());
    }

    public final Observable replay(Func1 func1, final long time, final TimeUnit unit, final Scheduler scheduler)
    {
        return create(new OnSubscribeMulticastSelector(this, new Func0() {

            final Observable this$0;
            final Scheduler val$scheduler;
            final long val$time;
            final TimeUnit val$unit;

            public volatile Object call()
            {
                return call();
            }

            public final Subject call()
            {
                return ReplaySubject.createWithTime(time, unit, scheduler);
            }

            
            {
                this$0 = Observable.this;
                time = l;
                unit = timeunit;
                scheduler = scheduler1;
                super();
            }
        }, func1));
    }

    public final Observable replay(Func1 func1, final Scheduler scheduler)
    {
        return create(new OnSubscribeMulticastSelector(this, new Func0() {

            final Observable this$0;
            final Scheduler val$scheduler;

            public volatile Object call()
            {
                return call();
            }

            public final Subject call()
            {
                return OperatorReplay.createScheduledSubject(ReplaySubject.create(), scheduler);
            }

            
            {
                this$0 = Observable.this;
                scheduler = scheduler1;
                super();
            }
        }, func1));
    }

    public final ConnectableObservable replay()
    {
        return new OperatorMulticast(this, new Func0() {

            final Observable this$0;

            public volatile Object call()
            {
                return call();
            }

            public Subject call()
            {
                return ReplaySubject.create();
            }

            
            {
                this$0 = Observable.this;
                super();
            }
        });
    }

    public final ConnectableObservable replay(final int bufferSize)
    {
        return new OperatorMulticast(this, new Func0() {

            final Observable this$0;
            final int val$bufferSize;

            public volatile Object call()
            {
                return call();
            }

            public Subject call()
            {
                return ReplaySubject.createWithSize(bufferSize);
            }

            
            {
                this$0 = Observable.this;
                bufferSize = i;
                super();
            }
        });
    }

    public final ConnectableObservable replay(int i, long l, TimeUnit timeunit)
    {
        return replay(i, l, timeunit, Schedulers.computation());
    }

    public final ConnectableObservable replay(final int bufferSize, final long time, final TimeUnit unit, final Scheduler scheduler)
    {
        if (bufferSize < 0)
        {
            throw new IllegalArgumentException("bufferSize < 0");
        } else
        {
            return new OperatorMulticast(this, new Func0() {

                final Observable this$0;
                final int val$bufferSize;
                final Scheduler val$scheduler;
                final long val$time;
                final TimeUnit val$unit;

                public volatile Object call()
                {
                    return call();
                }

                public Subject call()
                {
                    return ReplaySubject.createWithTimeAndSize(time, unit, bufferSize, scheduler);
                }

            
            {
                this$0 = Observable.this;
                time = l;
                unit = timeunit;
                bufferSize = i;
                scheduler = scheduler1;
                super();
            }
            });
        }
    }

    public final ConnectableObservable replay(final int bufferSize, final Scheduler scheduler)
    {
        return new OperatorMulticast(this, new Func0() {

            final Observable this$0;
            final int val$bufferSize;
            final Scheduler val$scheduler;

            public volatile Object call()
            {
                return call();
            }

            public Subject call()
            {
                return OperatorReplay.createScheduledSubject(ReplaySubject.createWithSize(bufferSize), scheduler);
            }

            
            {
                this$0 = Observable.this;
                bufferSize = i;
                scheduler = scheduler1;
                super();
            }
        });
    }

    public final ConnectableObservable replay(long l, TimeUnit timeunit)
    {
        return replay(l, timeunit, Schedulers.computation());
    }

    public final ConnectableObservable replay(final long time, final TimeUnit unit, final Scheduler scheduler)
    {
        return new OperatorMulticast(this, new Func0() {

            final Observable this$0;
            final Scheduler val$scheduler;
            final long val$time;
            final TimeUnit val$unit;

            public volatile Object call()
            {
                return call();
            }

            public Subject call()
            {
                return ReplaySubject.createWithTime(time, unit, scheduler);
            }

            
            {
                this$0 = Observable.this;
                time = l;
                unit = timeunit;
                scheduler = scheduler1;
                super();
            }
        });
    }

    public final ConnectableObservable replay(final Scheduler scheduler)
    {
        return new OperatorMulticast(this, new Func0() {

            final Observable this$0;
            final Scheduler val$scheduler;

            public volatile Object call()
            {
                return call();
            }

            public Subject call()
            {
                return OperatorReplay.createScheduledSubject(ReplaySubject.create(), scheduler);
            }

            
            {
                this$0 = Observable.this;
                scheduler = scheduler1;
                super();
            }
        });
    }

    public final Observable retry()
    {
        return OnSubscribeRedo.retry(this);
    }

    public final Observable retry(long l)
    {
        return OnSubscribeRedo.retry(this, l);
    }

    public final Observable retry(Func2 func2)
    {
        return nest().lift(new OperatorRetryWithPredicate(func2));
    }

    public final Observable retryWhen(final Func1 notificationHandler)
    {
        return OnSubscribeRedo.retry(this, new Func1() {

            final Observable this$0;
            final Func1 val$notificationHandler;

            public volatile Object call(Object obj)
            {
                return call((Observable)obj);
            }

            public Observable call(Observable observable)
            {
                return (Observable)notificationHandler.call(observable.map(new Func1() {

                    final _cls27 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Notification)obj);
                    }

                    public Throwable call(Notification notification)
                    {
                        return notification.getThrowable();
                    }

            
            {
                this$1 = _cls27.this;
                super();
            }
                }));
            }

            
            {
                this$0 = Observable.this;
                notificationHandler = func1;
                super();
            }
        });
    }

    public final Observable retryWhen(final Func1 notificationHandler, Scheduler scheduler)
    {
        return OnSubscribeRedo.retry(this, new Func1() {

            final Observable this$0;
            final Func1 val$notificationHandler;

            public volatile Object call(Object obj)
            {
                return call((Observable)obj);
            }

            public Observable call(Observable observable)
            {
                return (Observable)notificationHandler.call(observable.map(new Func1() {

                    final _cls28 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Notification)obj);
                    }

                    public Throwable call(Notification notification)
                    {
                        return notification.getThrowable();
                    }

            
            {
                this$1 = _cls28.this;
                super();
            }
                }));
            }

            
            {
                this$0 = Observable.this;
                notificationHandler = func1;
                super();
            }
        }, scheduler);
    }

    public final Observable sample(long l, TimeUnit timeunit)
    {
        return sample(l, timeunit, Schedulers.computation());
    }

    public final Observable sample(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorSampleWithTime(l, timeunit, scheduler));
    }

    public final Observable sample(Observable observable)
    {
        return lift(new OperatorSampleWithObservable(observable));
    }

    public final Observable scan(Object obj, Func2 func2)
    {
        return lift(new OperatorScan(obj, func2));
    }

    public final Observable scan(Func2 func2)
    {
        return lift(new OperatorScan(func2));
    }

    public final Observable serialize()
    {
        return lift(OperatorSerialize.instance());
    }

    public final Observable share()
    {
        return publish().refCount();
    }

    public final Observable single()
    {
        return lift(OperatorSingle.instance());
    }

    public final Observable single(Func1 func1)
    {
        return filter(func1).single();
    }

    public final Observable singleOrDefault(Object obj)
    {
        return lift(new OperatorSingle(obj));
    }

    public final Observable singleOrDefault(Object obj, Func1 func1)
    {
        return filter(func1).singleOrDefault(obj);
    }

    public final Observable skip(int i)
    {
        return lift(new OperatorSkip(i));
    }

    public final Observable skip(long l, TimeUnit timeunit)
    {
        return skip(l, timeunit, Schedulers.computation());
    }

    public final Observable skip(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorSkipTimed(l, timeunit, scheduler));
    }

    public final Observable skipLast(int i)
    {
        return lift(new OperatorSkipLast(i));
    }

    public final Observable skipLast(long l, TimeUnit timeunit)
    {
        return skipLast(l, timeunit, Schedulers.computation());
    }

    public final Observable skipLast(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorSkipLastTimed(l, timeunit, scheduler));
    }

    public final Observable skipUntil(Observable observable)
    {
        return lift(new OperatorSkipUntil(observable));
    }

    public final Observable skipWhile(Func1 func1)
    {
        return lift(new OperatorSkipWhile(OperatorSkipWhile.toPredicate2(func1)));
    }

    public final Observable startWith(Iterable iterable)
    {
        return concat(from(iterable), this);
    }

    public final Observable startWith(Object obj)
    {
        return concat(just(obj), this);
    }

    public final Observable startWith(Object obj, Object obj1)
    {
        return concat(just(obj, obj1), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2)
    {
        return concat(just(obj, obj1, obj2), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return concat(just(obj, obj1, obj2, obj3), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return concat(just(obj, obj1, obj2, obj3, obj4), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return concat(just(obj, obj1, obj2, obj3, obj4, obj5), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
    {
        return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
            Object obj7)
    {
        return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7), this);
    }

    public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
            Object obj7, Object obj8)
    {
        return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8), this);
    }

    public final Observable startWith(Observable observable)
    {
        return concat(observable, this);
    }

    public final Subscription subscribe()
    {
        return subscribe(((Subscriber) (new Subscriber() {

            final Observable this$0;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                throw new OnErrorNotImplementedException(throwable);
            }

            public final void onNext(Object obj)
            {
            }

            
            {
                this$0 = Observable.this;
                super();
            }
        })));
    }

    public final Subscription subscribe(final Observer observer)
    {
        if (observer instanceof Subscriber)
        {
            return subscribe((Subscriber)observer);
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Observable this$0;
                final Observer val$observer;

                public void onCompleted()
                {
                    observer.onCompleted();
                }

                public void onError(Throwable throwable)
                {
                    observer.onError(throwable);
                }

                public void onNext(Object obj)
                {
                    observer.onNext(obj);
                }

            
            {
                this$0 = Observable.this;
                observer = observer1;
                super();
            }
            })));
        }
    }

    public final Subscription subscribe(Subscriber subscriber)
    {
        if (subscriber == null)
        {
            throw new IllegalArgumentException("observer can not be null");
        }
        if (onSubscribe == null)
        {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        subscriber.onStart();
        Object obj = subscriber;
        if (!(subscriber instanceof SafeSubscriber))
        {
            obj = new SafeSubscriber(subscriber);
        }
        try
        {
            hook.onSubscribeStart(this, onSubscribe).call(obj);
            subscriber = hook.onSubscribeReturn(((Subscription) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Subscriber subscriber)
        {
            Exceptions.throwIfFatal(subscriber);
            try
            {
                ((Subscriber) (obj)).onError(hook.onSubscribeError(subscriber));
            }
            // Misplaced declaration of an exception variable
            catch (Subscriber subscriber)
            {
                throw subscriber;
            }
            catch (Throwable throwable)
            {
                subscriber = new RuntimeException((new StringBuilder()).append("Error occurred attempting to subscribe [").append(subscriber.getMessage()).append("] and then again while trying to pass to onError.").toString(), throwable);
                hook.onSubscribeError(subscriber);
                throw subscriber;
            }
            return Subscriptions.unsubscribed();
        }
        return subscriber;
    }

    public final Subscription subscribe(final Action1 onNext)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Observable this$0;
                final Action1 val$onNext;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    throw new OnErrorNotImplementedException(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                this$0 = Observable.this;
                onNext = action1;
                super();
            }
            })));
        }
    }

    public final Subscription subscribe(final Action1 onNext, final Action1 onError)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (onError == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Observable this$0;
                final Action1 val$onError;
                final Action1 val$onNext;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    onError.call(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                this$0 = Observable.this;
                onError = action1;
                onNext = action1_1;
                super();
            }
            })));
        }
    }

    public final Subscription subscribe(final Action1 onNext, final Action1 onError, final Action0 onComplete)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (onError == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (onComplete == null)
        {
            throw new IllegalArgumentException("onComplete can not be null");
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Observable this$0;
                final Action0 val$onComplete;
                final Action1 val$onError;
                final Action1 val$onNext;

                public final void onCompleted()
                {
                    onComplete.call();
                }

                public final void onError(Throwable throwable)
                {
                    onError.call(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                this$0 = Observable.this;
                onComplete = action0;
                onError = action1;
                onNext = action1_1;
                super();
            }
            })));
        }
    }

    public final Observable subscribeOn(Scheduler scheduler)
    {
        if (this instanceof ScalarSynchronousObservable)
        {
            return ((ScalarSynchronousObservable)this).scalarScheduleOn(scheduler);
        } else
        {
            return nest().lift(new OperatorSubscribeOn(scheduler));
        }
    }

    public final Observable switchIfEmpty(Observable observable)
    {
        return lift(new OperatorSwitchIfEmpty(observable));
    }

    public final Observable switchMap(Func1 func1)
    {
        return switchOnNext(map(func1));
    }

    public final Observable take(int i)
    {
        return lift(new OperatorTake(i));
    }

    public final Observable take(long l, TimeUnit timeunit)
    {
        return take(l, timeunit, Schedulers.computation());
    }

    public final Observable take(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorTakeTimed(l, timeunit, scheduler));
    }

    public final Observable takeFirst(Func1 func1)
    {
        return filter(func1).take(1);
    }

    public final Observable takeLast(int i)
    {
        if (i == 0)
        {
            return ignoreElements();
        }
        if (i == 1)
        {
            return lift(OperatorTakeLastOne.instance());
        } else
        {
            return lift(new OperatorTakeLast(i));
        }
    }

    public final Observable takeLast(int i, long l, TimeUnit timeunit)
    {
        return takeLast(i, l, timeunit, Schedulers.computation());
    }

    public final Observable takeLast(int i, long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorTakeLastTimed(i, l, timeunit, scheduler));
    }

    public final Observable takeLast(long l, TimeUnit timeunit)
    {
        return takeLast(l, timeunit, Schedulers.computation());
    }

    public final Observable takeLast(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorTakeLastTimed(l, timeunit, scheduler));
    }

    public final Observable takeLastBuffer(int i)
    {
        return takeLast(i).toList();
    }

    public final Observable takeLastBuffer(int i, long l, TimeUnit timeunit)
    {
        return takeLast(i, l, timeunit).toList();
    }

    public final Observable takeLastBuffer(int i, long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return takeLast(i, l, timeunit, scheduler).toList();
    }

    public final Observable takeLastBuffer(long l, TimeUnit timeunit)
    {
        return takeLast(l, timeunit).toList();
    }

    public final Observable takeLastBuffer(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return takeLast(l, timeunit, scheduler).toList();
    }

    public final Observable takeUntil(Observable observable)
    {
        return lift(new OperatorTakeUntil(observable));
    }

    public final Observable takeUntil(Func1 func1)
    {
        return lift(new OperatorTakeUntilPredicate(func1));
    }

    public final Observable takeWhile(Func1 func1)
    {
        return lift(new OperatorTakeWhile(func1));
    }

    public final Observable throttleFirst(long l, TimeUnit timeunit)
    {
        return throttleFirst(l, timeunit, Schedulers.computation());
    }

    public final Observable throttleFirst(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return lift(new OperatorThrottleFirst(l, timeunit, scheduler));
    }

    public final Observable throttleLast(long l, TimeUnit timeunit)
    {
        return sample(l, timeunit);
    }

    public final Observable throttleLast(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return sample(l, timeunit, scheduler);
    }

    public final Observable throttleWithTimeout(long l, TimeUnit timeunit)
    {
        return debounce(l, timeunit);
    }

    public final Observable throttleWithTimeout(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return debounce(l, timeunit, scheduler);
    }

    public final Observable timeInterval()
    {
        return timeInterval(Schedulers.immediate());
    }

    public final Observable timeInterval(Scheduler scheduler)
    {
        return lift(new OperatorTimeInterval(scheduler));
    }

    public final Observable timeout(long l, TimeUnit timeunit)
    {
        return timeout(l, timeunit, null, Schedulers.computation());
    }

    public final Observable timeout(long l, TimeUnit timeunit, Observable observable)
    {
        return timeout(l, timeunit, observable, Schedulers.computation());
    }

    public final Observable timeout(long l, TimeUnit timeunit, Observable observable, Scheduler scheduler)
    {
        return lift(new OperatorTimeout(l, timeunit, observable, scheduler));
    }

    public final Observable timeout(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return timeout(l, timeunit, null, scheduler);
    }

    public final Observable timeout(Func0 func0, Func1 func1)
    {
        return timeout(func0, func1, ((Observable) (null)));
    }

    public final Observable timeout(Func0 func0, Func1 func1, Observable observable)
    {
        if (func1 == null)
        {
            throw new NullPointerException("timeoutSelector is null");
        } else
        {
            return lift(new OperatorTimeoutWithSelector(func0, func1, observable));
        }
    }

    public final Observable timeout(Func1 func1)
    {
        return timeout(((Func0) (null)), func1, ((Observable) (null)));
    }

    public final Observable timeout(Func1 func1, Observable observable)
    {
        return timeout(((Func0) (null)), func1, observable);
    }

    public final Observable timestamp()
    {
        return timestamp(Schedulers.immediate());
    }

    public final Observable timestamp(Scheduler scheduler)
    {
        return lift(new OperatorTimestamp(scheduler));
    }

    public final BlockingObservable toBlocking()
    {
        return BlockingObservable.from(this);
    }

    public final Observable toList()
    {
        return lift(OperatorToObservableList.instance());
    }

    public final Observable toMap(Func1 func1)
    {
        return lift(new OperatorToMap(func1, UtilityFunctions.identity()));
    }

    public final Observable toMap(Func1 func1, Func1 func1_1)
    {
        return lift(new OperatorToMap(func1, func1_1));
    }

    public final Observable toMap(Func1 func1, Func1 func1_1, Func0 func0)
    {
        return lift(new OperatorToMap(func1, func1_1, func0));
    }

    public final Observable toMultimap(Func1 func1)
    {
        return lift(new OperatorToMultimap(func1, UtilityFunctions.identity()));
    }

    public final Observable toMultimap(Func1 func1, Func1 func1_1)
    {
        return lift(new OperatorToMultimap(func1, func1_1));
    }

    public final Observable toMultimap(Func1 func1, Func1 func1_1, Func0 func0)
    {
        return lift(new OperatorToMultimap(func1, func1_1, func0));
    }

    public final Observable toMultimap(Func1 func1, Func1 func1_1, Func0 func0, Func1 func1_2)
    {
        return lift(new OperatorToMultimap(func1, func1_1, func0, func1_2));
    }

    public Single toSingle()
    {
        return new Single(OnSubscribeSingle.create(this));
    }

    public final Observable toSortedList()
    {
        return lift(new OperatorToObservableSortedList(10));
    }

    public final Observable toSortedList(int i)
    {
        return lift(new OperatorToObservableSortedList(i));
    }

    public final Observable toSortedList(Func2 func2)
    {
        return lift(new OperatorToObservableSortedList(func2, 10));
    }

    public final Observable toSortedList(Func2 func2, int i)
    {
        return lift(new OperatorToObservableSortedList(func2, i));
    }

    public final Subscription unsafeSubscribe(Subscriber subscriber)
    {
        Subscription subscription;
        try
        {
            subscriber.onStart();
            hook.onSubscribeStart(this, onSubscribe).call(subscriber);
            subscription = hook.onSubscribeReturn(subscriber);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            try
            {
                subscriber.onError(hook.onSubscribeError(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (Subscriber subscriber)
            {
                throw subscriber;
            }
            // Misplaced declaration of an exception variable
            catch (Subscriber subscriber)
            {
                subscriber = new RuntimeException((new StringBuilder()).append("Error occurred attempting to subscribe [").append(throwable.getMessage()).append("] and then again while trying to pass to onError.").toString(), subscriber);
                hook.onSubscribeError(subscriber);
                throw subscriber;
            }
            return Subscriptions.unsubscribed();
        }
        return subscription;
    }

    public final Observable unsubscribeOn(Scheduler scheduler)
    {
        return lift(new OperatorUnsubscribeOn(scheduler));
    }

    public final Observable window(int i)
    {
        return window(i, i);
    }

    public final Observable window(int i, int j)
    {
        return lift(new OperatorWindowWithSize(i, j));
    }

    public final Observable window(long l, long l1, TimeUnit timeunit)
    {
        return window(l, l1, timeunit, 0x7fffffff, Schedulers.computation());
    }

    public final Observable window(long l, long l1, TimeUnit timeunit, int i, Scheduler scheduler)
    {
        return lift(new OperatorWindowWithTime(l, l1, timeunit, i, scheduler));
    }

    public final Observable window(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
    {
        return window(l, l1, timeunit, 0x7fffffff, scheduler);
    }

    public final Observable window(long l, TimeUnit timeunit)
    {
        return window(l, l, timeunit, Schedulers.computation());
    }

    public final Observable window(long l, TimeUnit timeunit, int i)
    {
        return window(l, timeunit, i, Schedulers.computation());
    }

    public final Observable window(long l, TimeUnit timeunit, int i, Scheduler scheduler)
    {
        return window(l, l, timeunit, i, scheduler);
    }

    public final Observable window(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return window(l, timeunit, 0x7fffffff, scheduler);
    }

    public final Observable window(Observable observable)
    {
        return lift(new OperatorWindowWithObservable(observable));
    }

    public final Observable window(Observable observable, Func1 func1)
    {
        return lift(new OperatorWindowWithStartEndObservable(observable, func1));
    }

    public final Observable window(Func0 func0)
    {
        return lift(new OperatorWindowWithObservableFactory(func0));
    }

    public final Observable withLatestFrom(Observable observable, Func2 func2)
    {
        return lift(new OperatorWithLatestFrom(observable, func2));
    }

    public final Observable zipWith(Iterable iterable, Func2 func2)
    {
        return lift(new OperatorZipIterable(iterable, func2));
    }

    public final Observable zipWith(Observable observable, Func2 func2)
    {
        return zip(this, observable, func2);
    }



    // Unreferenced inner class rx/Observable$NeverObservable$1

/* anonymous class */
    class NeverObservable._cls1
        implements OnSubscribe
    {

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
        }

    }


    // Unreferenced inner class rx/Observable$ThrowObservable$1

/* anonymous class */
    class ThrowObservable._cls1
        implements OnSubscribe
    {

        final Throwable val$exception;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            subscriber.onError(exception);
        }

            
            {
                exception = throwable;
                super();
            }
    }

}
