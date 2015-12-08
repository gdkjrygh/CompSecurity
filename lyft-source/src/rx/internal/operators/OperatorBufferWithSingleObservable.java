// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;

public final class OperatorBufferWithSingleObservable
    implements rx.Observable.Operator
{

    final Func0 bufferClosingSelector;
    final int initialCapacity;

    public OperatorBufferWithSingleObservable(final Observable bufferClosing, int i)
    {
        bufferClosingSelector = new Func0() {

            final OperatorBufferWithSingleObservable this$0;
            final Observable val$bufferClosing;

            public volatile Object call()
            {
                return call();
            }

            public Observable call()
            {
                return bufferClosing;
            }

            
            {
                this$0 = OperatorBufferWithSingleObservable.this;
                bufferClosing = observable;
                super();
            }
        };
        initialCapacity = i;
    }

    public OperatorBufferWithSingleObservable(Func0 func0, int i)
    {
        bufferClosingSelector = func0;
        initialCapacity = i;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        Observable observable;
        final BufferingSubscriber bsub;
        Subscriber subscriber1;
        try
        {
            observable = (Observable)bufferClosingSelector.call();
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
            return Subscribers.empty();
        }
        bsub = new BufferingSubscriber(new SerializedSubscriber(subscriber));
        subscriber1 = new Subscriber() {

            final OperatorBufferWithSingleObservable this$0;
            final BufferingSubscriber val$bsub;

            public void onCompleted()
            {
                bsub.onCompleted();
            }

            public void onError(Throwable throwable1)
            {
                bsub.onError(throwable1);
            }

            public void onNext(Object obj)
            {
                bsub.emit();
            }

            
            {
                this$0 = OperatorBufferWithSingleObservable.this;
                bsub = bufferingsubscriber;
                super();
            }
        };
        subscriber.add(subscriber1);
        subscriber.add(bsub);
        observable.unsafeSubscribe(subscriber1);
        return bsub;
    }

    private class BufferingSubscriber extends Subscriber
    {

        final Subscriber child;
        List chunk;
        boolean done;
        final OperatorBufferWithSingleObservable this$0;

        void emit()
        {
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_12;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            List list;
            list = chunk;
            chunk = new ArrayList(initialCapacity);
            this;
            JVM INSTR monitorexit ;
            child.onNext(list);
            return;
            Object obj;
            obj;
            unsubscribe();
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            done = true;
            this;
            JVM INSTR monitorexit ;
            child.onError(((Throwable) (obj)));
            return;
        }

        public void onCompleted()
        {
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_12;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            List list;
            done = true;
            list = chunk;
            chunk = null;
            this;
            JVM INSTR monitorexit ;
            child.onNext(list);
            child.onCompleted();
            unsubscribe();
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (Throwable throwable)
            {
                child.onError(throwable);
            }
            return;
        }

        public void onError(Throwable throwable)
        {
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_12;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            done = true;
            chunk = null;
            this;
            JVM INSTR monitorexit ;
            child.onError(throwable);
            unsubscribe();
            return;
            throwable;
            this;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public void onNext(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_12;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            chunk.add(obj);
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public BufferingSubscriber(Subscriber subscriber)
        {
            this$0 = OperatorBufferWithSingleObservable.this;
            super();
            child = subscriber;
            chunk = new ArrayList(initialCapacity);
        }
    }

}
