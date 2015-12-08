// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.operators.BlockingOperatorLatest;
import rx.internal.operators.BlockingOperatorMostRecent;
import rx.internal.operators.BlockingOperatorNext;
import rx.internal.operators.BlockingOperatorToFuture;
import rx.internal.operators.BlockingOperatorToIterator;
import rx.internal.util.UtilityFunctions;

public final class BlockingObservable
{

    private final Observable o;

    private BlockingObservable(Observable observable)
    {
        o = observable;
    }

    private Object blockForSingle(Observable observable)
    {
        final Object returnItem = new AtomicReference();
        final AtomicReference returnException = new AtomicReference();
        final CountDownLatch latch = new CountDownLatch(1);
        observable = observable.subscribe(new Subscriber() {

            final BlockingObservable this$0;
            final CountDownLatch val$latch;
            final AtomicReference val$returnException;
            final AtomicReference val$returnItem;

            public void onCompleted()
            {
                latch.countDown();
            }

            public void onError(Throwable throwable)
            {
                returnException.set(throwable);
                latch.countDown();
            }

            public void onNext(Object obj)
            {
                returnItem.set(obj);
            }

            
            {
                this$0 = BlockingObservable.this;
                latch = countdownlatch;
                returnException = atomicreference;
                returnItem = atomicreference1;
                super();
            }
        });
        try
        {
            latch.await();
        }
        // Misplaced declaration of an exception variable
        catch (final Object returnItem)
        {
            observable.unsubscribe();
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting for subscription to complete.", ((Throwable) (returnItem)));
        }
        if (returnException.get() != null)
        {
            if (returnException.get() instanceof RuntimeException)
            {
                throw (RuntimeException)returnException.get();
            } else
            {
                throw new RuntimeException((Throwable)returnException.get());
            }
        } else
        {
            return ((AtomicReference) (returnItem)).get();
        }
    }

    public static BlockingObservable from(Observable observable)
    {
        return new BlockingObservable(observable);
    }

    public Object first()
    {
        return blockForSingle(o.first());
    }

    public Object first(Func1 func1)
    {
        return blockForSingle(o.first(func1));
    }

    public Object firstOrDefault(Object obj)
    {
        return blockForSingle(o.map(UtilityFunctions.identity()).firstOrDefault(obj));
    }

    public Object firstOrDefault(Object obj, Func1 func1)
    {
        return blockForSingle(o.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(obj));
    }

    public void forEach(final Action1 onNext)
    {
        final CountDownLatch latch = new CountDownLatch(1);
        final AtomicReference exceptionFromOnError = new AtomicReference();
        onNext = o.subscribe(new Subscriber() {

            final BlockingObservable this$0;
            final AtomicReference val$exceptionFromOnError;
            final CountDownLatch val$latch;
            final Action1 val$onNext;

            public void onCompleted()
            {
                latch.countDown();
            }

            public void onError(Throwable throwable)
            {
                exceptionFromOnError.set(throwable);
                latch.countDown();
            }

            public void onNext(Object obj)
            {
                onNext.call(obj);
            }

            
            {
                this$0 = BlockingObservable.this;
                latch = countdownlatch;
                exceptionFromOnError = atomicreference;
                onNext = action1;
                super();
            }
        });
        try
        {
            latch.await();
        }
        catch (InterruptedException interruptedexception)
        {
            onNext.unsubscribe();
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting for subscription to complete.", interruptedexception);
        }
        if (exceptionFromOnError.get() != null)
        {
            if (exceptionFromOnError.get() instanceof RuntimeException)
            {
                throw (RuntimeException)exceptionFromOnError.get();
            } else
            {
                throw new RuntimeException((Throwable)exceptionFromOnError.get());
            }
        } else
        {
            return;
        }
    }

    public Iterator getIterator()
    {
        return BlockingOperatorToIterator.toIterator(o);
    }

    public Object last()
    {
        return blockForSingle(o.last());
    }

    public Object last(Func1 func1)
    {
        return blockForSingle(o.last(func1));
    }

    public Object lastOrDefault(Object obj)
    {
        return blockForSingle(o.map(UtilityFunctions.identity()).lastOrDefault(obj));
    }

    public Object lastOrDefault(Object obj, Func1 func1)
    {
        return blockForSingle(o.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(obj));
    }

    public Iterable latest()
    {
        return BlockingOperatorLatest.latest(o);
    }

    public Iterable mostRecent(Object obj)
    {
        return BlockingOperatorMostRecent.mostRecent(o, obj);
    }

    public Iterable next()
    {
        return BlockingOperatorNext.next(o);
    }

    public Object single()
    {
        return blockForSingle(o.single());
    }

    public Object single(Func1 func1)
    {
        return blockForSingle(o.single(func1));
    }

    public Object singleOrDefault(Object obj)
    {
        return blockForSingle(o.map(UtilityFunctions.identity()).singleOrDefault(obj));
    }

    public Object singleOrDefault(Object obj, Func1 func1)
    {
        return blockForSingle(o.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(obj));
    }

    public Future toFuture()
    {
        return BlockingOperatorToFuture.toFuture(o);
    }

    public Iterable toIterable()
    {
        return new Iterable() {

            final BlockingObservable this$0;

            public Iterator iterator()
            {
                return getIterator();
            }

            
            {
                this$0 = BlockingObservable.this;
                super();
            }
        };
    }
}
