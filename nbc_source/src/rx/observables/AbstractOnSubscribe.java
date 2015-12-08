// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.internal.operators.BackpressureUtils;

public abstract class AbstractOnSubscribe
    implements rx.Observable.OnSubscribe
{
    private static final class LambdaOnSubscribe extends AbstractOnSubscribe
    {

        final Action1 next;
        final Func1 onSubscribe;
        final Action1 onTerminated;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        protected void next(SubscriptionState subscriptionstate)
        {
            next.call(subscriptionstate);
        }

        protected Object onSubscribe(Subscriber subscriber)
        {
            return onSubscribe.call(subscriber);
        }

        protected void onTerminated(Object obj)
        {
            onTerminated.call(obj);
        }

        private LambdaOnSubscribe(Action1 action1, Func1 func1, Action1 action1_1)
        {
            next = action1;
            onSubscribe = func1;
            onTerminated = action1_1;
        }

    }

    private static final class SubscriptionCompleter extends AtomicBoolean
        implements Subscription
    {

        private static final long serialVersionUID = 0x6eefff08576a4bccL;
        private final SubscriptionState state;

        public boolean isUnsubscribed()
        {
            return get();
        }

        public void unsubscribe()
        {
            if (compareAndSet(false, true))
            {
                state.free();
            }
        }

        private SubscriptionCompleter(SubscriptionState subscriptionstate)
        {
            state = subscriptionstate;
        }

    }

    private static final class SubscriptionProducer
        implements Producer
    {

        final SubscriptionState state;

        protected boolean doNext()
        {
            if (!state.use())
            {
                break MISSING_BLOCK_LABEL_125;
            }
            int i = state.phase();
            state.parent.next(state);
            if (!state.verify())
            {
                throw new IllegalStateException((new StringBuilder()).append("No event produced or stop called @ Phase: ").append(i).append(" -> ").append(state.phase()).append(", Calls: ").append(state.calls()).toString());
            }
            break MISSING_BLOCK_LABEL_127;
            Object obj;
            obj;
            state.terminate();
            state.subscriber.onError(((Throwable) (obj)));
            state.free();
            return false;
            if (!state.accept() && !state.stopRequested())
            {
                break MISSING_BLOCK_LABEL_163;
            }
            state.terminate();
            state.free();
            return false;
            long l = 
// JavaClassFileOutputException: get_constant: invalid tag

        public void request(long l)
        {
            if (l > 0L && BackpressureUtils.getAndAddRequest(state.requestCount, l) == 0L)
            {
                if (l == 0x7fffffffffffffffL)
                {
                    while (!state.subscriber.isUnsubscribed() && doNext()) ;
                } else
                if (!state.subscriber.isUnsubscribed())
                {
                    while (doNext() && state.requestCount.decrementAndGet() > 0L && !state.subscriber.isUnsubscribed()) ;
                    return;
                }
            }
        }

        private SubscriptionProducer(SubscriptionState subscriptionstate)
        {
            state = subscriptionstate;
        }

    }

    public static final class SubscriptionState
    {

        private long calls;
        private boolean hasCompleted;
        private boolean hasOnNext;
        private final AtomicInteger inUse;
        private final AbstractOnSubscribe parent;
        private int phase;
        private final AtomicLong requestCount;
        private final Object state;
        private boolean stopRequested;
        private final Subscriber subscriber;
        private Throwable theException;
        private Object theValue;

        protected boolean accept()
        {
            if (hasOnNext)
            {
                Object obj = theValue;
                theValue = null;
                hasOnNext = false;
                try
                {
                    subscriber.onNext(obj);
                }
                catch (Throwable throwable)
                {
                    hasCompleted = true;
                    Throwable throwable1 = theException;
                    theException = null;
                    if (throwable1 == null)
                    {
                        subscriber.onError(throwable);
                        return true;
                    } else
                    {
                        subscriber.onError(new CompositeException(Arrays.asList(new Throwable[] {
                            throwable, throwable1
                        })));
                        return true;
                    }
                }
            }
            if (hasCompleted)
            {
                obj = theException;
                theException = null;
                if (obj != null)
                {
                    subscriber.onError(((Throwable) (obj)));
                    return true;
                } else
                {
                    subscriber.onCompleted();
                    return true;
                }
            } else
            {
                return false;
            }
        }

        public void advancePhase()
        {
            advancePhaseBy(1);
        }

        public void advancePhaseBy(int i)
        {
            phase = phase + i;
        }

        public long calls()
        {
            return calls;
        }

        protected void free()
        {
            while (inUse.get() <= 0 || inUse.decrementAndGet() != 0) 
            {
                return;
            }
            parent.onTerminated(state);
        }

        public void onCompleted()
        {
            if (hasCompleted)
            {
                throw new IllegalStateException("Already terminated", theException);
            } else
            {
                hasCompleted = true;
                return;
            }
        }

        public void onError(Throwable throwable)
        {
            if (throwable == null)
            {
                throw new NullPointerException("e != null required");
            }
            if (hasCompleted)
            {
                throw new IllegalStateException("Already terminated", theException);
            } else
            {
                theException = throwable;
                hasCompleted = true;
                return;
            }
        }

        public void onNext(Object obj)
        {
            if (hasOnNext)
            {
                throw new IllegalStateException("onNext not consumed yet!");
            }
            if (hasCompleted)
            {
                throw new IllegalStateException("Already terminated", theException);
            } else
            {
                theValue = obj;
                hasOnNext = true;
                return;
            }
        }

        public int phase()
        {
            return phase;
        }

        public void phase(int i)
        {
            phase = i;
        }

        public Object state()
        {
            return state;
        }

        public void stop()
        {
            stopRequested = true;
        }

        protected boolean stopRequested()
        {
            return stopRequested;
        }

        protected void terminate()
        {
            int i;
            do
            {
                i = inUse.get();
                if (i <= 0)
                {
                    return;
                }
            } while (!inUse.compareAndSet(i, 0));
            parent.onTerminated(state);
        }

        protected boolean use()
        {
            boolean flag = true;
            int i = inUse.get();
            if (i == 0)
            {
                flag = false;
            } else
            if (i != 1 || !inUse.compareAndSet(1, 2))
            {
                throw new IllegalStateException("This is not reentrant nor threadsafe!");
            }
            return flag;
        }

        protected boolean verify()
        {
            return hasOnNext || hasCompleted || stopRequested;
        }





/*
        static long access$708(SubscriptionState subscriptionstate)
        {
            long l = subscriptionstate.calls;
            subscriptionstate.calls = 1L + l;
            return l;
        }

*/

        private SubscriptionState(AbstractOnSubscribe abstractonsubscribe, Subscriber subscriber1, Object obj)
        {
            parent = abstractonsubscribe;
            subscriber = subscriber1;
            state = obj;
            requestCount = new AtomicLong();
            inUse = new AtomicInteger(1);
        }

    }


    private static final Func1 NULL_FUNC1 = new Func1() {

        public Object call(Object obj)
        {
            return null;
        }

    };

    public AbstractOnSubscribe()
    {
    }

    public static AbstractOnSubscribe create(Action1 action1)
    {
        return create(action1, NULL_FUNC1, ((Action1) (Actions.empty())));
    }

    public static AbstractOnSubscribe create(Action1 action1, Func1 func1)
    {
        return create(action1, func1, ((Action1) (Actions.empty())));
    }

    public static AbstractOnSubscribe create(Action1 action1, Func1 func1, Action1 action1_1)
    {
        return new LambdaOnSubscribe(action1, func1, action1_1);
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public final void call(Subscriber subscriber)
    {
        SubscriptionState subscriptionstate = new SubscriptionState(this, subscriber, onSubscribe(subscriber));
        subscriber.add(new SubscriptionCompleter(subscriptionstate));
        subscriber.setProducer(new SubscriptionProducer(subscriptionstate));
    }

    protected abstract void next(SubscriptionState subscriptionstate);

    protected Object onSubscribe(Subscriber subscriber)
    {
        return null;
    }

    protected void onTerminated(Object obj)
    {
    }

    public final Observable toObservable()
    {
        return Observable.create(this);
    }

}
