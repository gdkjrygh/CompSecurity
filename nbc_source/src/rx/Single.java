// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.internal.operators.OnSubscribeToObservableFuture;
import rx.internal.operators.OperatorMap;
import rx.internal.operators.OperatorObserveOn;
import rx.internal.operators.OperatorOnErrorReturn;
import rx.internal.operators.OperatorSubscribeOn;
import rx.internal.operators.OperatorTimeout;
import rx.internal.operators.OperatorZip;
import rx.internal.producers.SingleDelayedProducer;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaObservableExecutionHook;
import rx.plugins.RxJavaPlugins;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx:
//            Observable, SingleSubscriber, Subscriber, Scheduler, 
//            Subscription

public class Single
{
    public static interface OnSubscribe
        extends Action1
    {
    }

    public static interface Transformer
        extends Func1
    {
    }


    private static final RxJavaObservableExecutionHook hook = RxJavaPlugins.getInstance().getObservableExecutionHook();
    final Observable.OnSubscribe onSubscribe;

    private Single(Observable.OnSubscribe onsubscribe)
    {
        onSubscribe = onsubscribe;
    }

    protected Single(final OnSubscribe f)
    {
        onSubscribe = new Observable.OnSubscribe() {

            final Single this$0;
            final OnSubscribe val$f;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                final SingleDelayedProducer producer = new SingleDelayedProducer(subscriber);
                subscriber.setProducer(producer);
                producer = subscriber. new SingleSubscriber() {

                    final _cls1 this$1;
                    final Subscriber val$child;
                    final SingleDelayedProducer val$producer;

                    public void onError(Throwable throwable)
                    {
                        child.onError(throwable);
                    }

                    public void onSuccess(Object obj)
                    {
                        producer.setValue(obj);
                    }

            
            {
                this$1 = final__pcls1;
                producer = singledelayedproducer;
                child = Subscriber.this;
                super();
            }
                };
                subscriber.add(producer);
                f.call(producer);
            }

            
            {
                this$0 = Single.this;
                f = onsubscribe;
                super();
            }
        };
    }

    private static Observable asObservable(Single single)
    {
        return Observable.create(single.onSubscribe);
    }

    public static final Observable concat(Single single, Single single1)
    {
        return Observable.concat(asObservable(single), asObservable(single1));
    }

    public static final Observable concat(Single single, Single single1, Single single2)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3, Single single4)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3, Single single4, Single single5)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static final Observable concat(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7, 
            Single single8)
    {
        return Observable.concat(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static final Single create(OnSubscribe onsubscribe)
    {
        return new Single(onsubscribe);
    }

    public static final Single error(Throwable throwable)
    {
        return create(new OnSubscribe(throwable) {

            final Throwable val$exception;

            public volatile void call(Object obj)
            {
                call((SingleSubscriber)obj);
            }

            public void call(SingleSubscriber singlesubscriber)
            {
                singlesubscriber.onError(exception);
            }

            
            {
                exception = throwable;
                super();
            }
        });
    }

    public static final Single from(Future future)
    {
        return new Single(OnSubscribeToObservableFuture.toObservableFuture(future));
    }

    public static final Single from(Future future, long l, TimeUnit timeunit)
    {
        return new Single(OnSubscribeToObservableFuture.toObservableFuture(future, l, timeunit));
    }

    public static final Single from(Future future, Scheduler scheduler)
    {
        return (new Single(OnSubscribeToObservableFuture.toObservableFuture(future))).subscribeOn(scheduler);
    }

    public static final Single just(Object obj)
    {
        return create(new OnSubscribe(obj) {

            final Object val$value;

            public volatile void call(Object obj1)
            {
                call((SingleSubscriber)obj1);
            }

            public void call(SingleSubscriber singlesubscriber)
            {
                singlesubscriber.onSuccess(value);
            }

            
            {
                value = obj;
                super();
            }
        });
    }

    private final Single lift(final Observable.Operator lift)
    {
        return new Single(new Observable.OnSubscribe() {

            final Single this$0;
            final Observable.Operator val$lift;

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
                    obj = (Subscriber)Single.hook.onLift(lift).call(subscriber);
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
                this$0 = Single.this;
                lift = operator;
                super();
            }
        });
    }

    public static final Observable merge(Single single, Single single1)
    {
        return Observable.merge(asObservable(single), asObservable(single1));
    }

    public static final Observable merge(Single single, Single single1, Single single2)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3, Single single4)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3, Single single4, Single single5)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static final Observable merge(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7, 
            Single single8)
    {
        return Observable.merge(asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static final Single merge(Single single)
    {
        return create(new OnSubscribe(single) {

            final Single val$source;

            public volatile void call(Object obj)
            {
                call((SingleSubscriber)obj);
            }

            public void call(SingleSubscriber singlesubscriber)
            {
                source.subscribe(singlesubscriber. new SingleSubscriber() {

                    final _cls5 this$0;
                    final SingleSubscriber val$child;

                    public void onError(Throwable throwable)
                    {
                        child.onError(throwable);
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((Single)obj);
                    }

                    public void onSuccess(Single single)
                    {
                        single.subscribe(child);
                    }

            
            {
                this$0 = final__pcls5;
                child = SingleSubscriber.this;
                super();
            }
                });
            }

            
            {
                source = single;
                super();
            }
        });
    }

    private final Single nest()
    {
        return just(asObservable(this));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7, 
            Single single8, Func9 func9)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8)
        }).lift(new OperatorZip(func9));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Single single7, 
            Func8 func8)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7)
        }).lift(new OperatorZip(func8));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Single single6, Func7 func7)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6)
        }).lift(new OperatorZip(func7));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Single single4, Single single5, Func6 func6)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5)
        }).lift(new OperatorZip(func6));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Single single4, Func5 func5)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3), asObservable(single4)
        }).lift(new OperatorZip(func5));
    }

    public static final Single zip(Single single, Single single1, Single single2, Single single3, Func4 func4)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2), asObservable(single3)
        }).lift(new OperatorZip(func4));
    }

    public static final Single zip(Single single, Single single1, Single single2, Func3 func3)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1), asObservable(single2)
        }).lift(new OperatorZip(func3));
    }

    public static final Single zip(Single single, Single single1, Func2 func2)
    {
        return just(new Observable[] {
            asObservable(single), asObservable(single1)
        }).lift(new OperatorZip(func2));
    }

    public Single compose(Transformer transformer)
    {
        return (Single)transformer.call(this);
    }

    public final Observable concatWith(Single single)
    {
        return concat(this, single);
    }

    public final Single flatMap(Func1 func1)
    {
        return merge(map(func1));
    }

    public final Observable flatMapObservable(Func1 func1)
    {
        return Observable.merge(asObservable(map(func1)));
    }

    public final Single map(Func1 func1)
    {
        return lift(new OperatorMap(func1));
    }

    public final Observable mergeWith(Single single)
    {
        return merge(this, single);
    }

    public final Single observeOn(Scheduler scheduler)
    {
        return lift(new OperatorObserveOn(scheduler));
    }

    public final Single onErrorReturn(Func1 func1)
    {
        return lift(new OperatorOnErrorReturn(func1));
    }

    public final Subscription subscribe()
    {
        return subscribe(((Subscriber) (new Subscriber() {

            final Single this$0;

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
                this$0 = Single.this;
                super();
            }
        })));
    }

    public final Subscription subscribe(final SingleSubscriber te)
    {
        Subscriber subscriber = new Subscriber() {

            final Single this$0;
            final SingleSubscriber val$te;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                te.onError(throwable);
            }

            public void onNext(Object obj)
            {
                te.onSuccess(obj);
            }

            
            {
                this$0 = Single.this;
                te = singlesubscriber;
                super();
            }
        };
        te.add(subscriber);
        subscribe(((Subscriber) (subscriber)));
        return subscriber;
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
            onSubscribe.call(obj);
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
            return Subscriptions.empty();
        }
        return subscriber;
    }

    public final Subscription subscribe(final Action1 onSuccess)
    {
        if (onSuccess == null)
        {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Single this$0;
                final Action1 val$onSuccess;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    throw new OnErrorNotImplementedException(throwable);
                }

                public final void onNext(Object obj)
                {
                    onSuccess.call(obj);
                }

            
            {
                this$0 = Single.this;
                onSuccess = action1;
                super();
            }
            })));
        }
    }

    public final Subscription subscribe(final Action1 onSuccess, final Action1 onError)
    {
        if (onSuccess == null)
        {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (onError == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        } else
        {
            return subscribe(((Subscriber) (new Subscriber() {

                final Single this$0;
                final Action1 val$onError;
                final Action1 val$onSuccess;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    onError.call(throwable);
                }

                public final void onNext(Object obj)
                {
                    onSuccess.call(obj);
                }

            
            {
                this$0 = Single.this;
                onError = action1;
                onSuccess = action1_1;
                super();
            }
            })));
        }
    }

    public final Single subscribeOn(Scheduler scheduler)
    {
        return nest().lift(new OperatorSubscribeOn(scheduler));
    }

    public final Single timeout(long l, TimeUnit timeunit)
    {
        return timeout(l, timeunit, null, Schedulers.computation());
    }

    public final Single timeout(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        return timeout(l, timeunit, null, scheduler);
    }

    public final Single timeout(long l, TimeUnit timeunit, Single single)
    {
        return timeout(l, timeunit, single, Schedulers.computation());
    }

    public final Single timeout(long l, TimeUnit timeunit, Single single, Scheduler scheduler)
    {
        Single single1 = single;
        if (single == null)
        {
            single1 = error(new TimeoutException());
        }
        return lift(new OperatorTimeout(l, timeunit, asObservable(single1), scheduler));
    }

    public final Observable toObservable()
    {
        return asObservable(this);
    }

    public final void unsafeSubscribe(Subscriber subscriber)
    {
        try
        {
            subscriber.onStart();
            onSubscribe.call(subscriber);
            hook.onSubscribeReturn(subscriber);
            return;
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            try
            {
                subscriber.onError(hook.onSubscribeError(throwable));
                return;
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
            }
            hook.onSubscribeError(subscriber);
            throw subscriber;
        }
    }

    public final Single zipWith(Single single, Func2 func2)
    {
        return zip(this, single, func2);
    }


}
