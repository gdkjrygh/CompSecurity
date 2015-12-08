// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

public final class OperatorDebounceWithTime
    implements rx.Observable.Operator
{
    static final class DebounceState
    {

        boolean emitting;
        boolean hasValue;
        int index;
        boolean terminate;
        Object value;

        public void clear()
        {
            this;
            JVM INSTR monitorenter ;
            index = index + 1;
            value = null;
            hasValue = false;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void emit(int i, Subscriber subscriber, Subscriber subscriber1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!emitting && hasValue && i == index)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj = value;
            value = null;
            hasValue = false;
            emitting = true;
            this;
            JVM INSTR monitorexit ;
            try
            {
                subscriber.onNext(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Subscriber subscriber)
            {
                subscriber1.onError(subscriber);
                return;
            }
            this;
            JVM INSTR monitorenter ;
            if (terminate)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            subscriber;
            this;
            JVM INSTR monitorexit ;
            throw subscriber;
            subscriber;
            this;
            JVM INSTR monitorexit ;
            throw subscriber;
            this;
            JVM INSTR monitorexit ;
            subscriber.onCompleted();
            return;
        }

        public void emitAndComplete(Subscriber subscriber, Subscriber subscriber1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            terminate = true;
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            boolean flag;
            obj = value;
            flag = hasValue;
            value = null;
            hasValue = false;
            emitting = true;
            this;
            JVM INSTR monitorexit ;
            if (flag)
            {
                try
                {
                    subscriber.onNext(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Subscriber subscriber)
                {
                    subscriber1.onError(subscriber);
                    return;
                }
            }
            subscriber.onCompleted();
            return;
            subscriber;
            this;
            JVM INSTR monitorexit ;
            throw subscriber;
        }

        public int next(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            int i;
            value = obj;
            hasValue = true;
            i = index + 1;
            index = i;
            this;
            JVM INSTR monitorexit ;
            return i;
            obj;
            throw obj;
        }

        DebounceState()
        {
        }
    }


    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public OperatorDebounceWithTime(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        timeout = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        final rx.Scheduler.Worker worker = scheduler.createWorker();
        SerializedSubscriber serializedsubscriber = new SerializedSubscriber(final_subscriber);
        final SerialSubscription ssub = new SerialSubscription();
        serializedsubscriber.add(worker);
        serializedsubscriber.add(ssub);
        return new Subscriber(serializedsubscriber) {

            final Subscriber self = this;
            final DebounceState state = new DebounceState();
            final OperatorDebounceWithTime this$0;
            final SerializedSubscriber val$s;
            final SerialSubscription val$ssub;
            final rx.Scheduler.Worker val$worker;

            public void onCompleted()
            {
                state.emitAndComplete(s, this);
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                unsubscribe();
                state.clear();
            }

            public void onNext(Object obj)
            {
                int i = state.next(obj);
                ssub.set(worker.schedule(i. new Action0() {

                    final _cls1 this$1;
                    final int val$index;

                    public void call()
                    {
                        state.emit(index, s, self);
                    }

            
            {
                this$1 = final__pcls1;
                index = I.this;
                super();
            }
                }, timeout, unit));
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorDebounceWithTime.this;
                ssub = serialsubscription;
                worker = worker1;
                s = serializedsubscriber;
                super(final_subscriber);
            }
        };
    }
}
