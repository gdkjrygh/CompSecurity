// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

public final class BufferUntilSubscriber extends Subject
{
    static final class OnSubscribeAction
        implements rx.Observable.OnSubscribe
    {

        final State state;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            boolean flag;
            if (!state.casObserverRef(null, subscriber))
            {
                break MISSING_BLOCK_LABEL_149;
            }
            subscriber.add(Subscriptions.create(new Action0() {

                final OnSubscribeAction this$0;

                public void call()
                {
                    state.observerRef = BufferUntilSubscriber.EMPTY_OBSERVER;
                }

            
            {
                this$0 = OnSubscribeAction.this;
                super();
            }
            }));
            flag = false;
            subscriber = ((Subscriber) (state.guard));
            subscriber;
            JVM INSTR monitorenter ;
            if (state.emitting)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            state.emitting = true;
            flag = true;
            subscriber;
            JVM INSTR monitorexit ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            subscriber = NotificationLite.instance();
_L2:
label0:
            do
            {
                Object obj = state.buffer.poll();
                Exception exception;
                if (obj != null)
                {
                    subscriber.accept(state.observerRef, obj);
                } else
                {
label1:
                    {
                        synchronized (state.guard)
                        {
                            if (!state.buffer.isEmpty())
                            {
                                break label1;
                            }
                            state.emitting = false;
                        }
                        return;
                    }
                }
            } while (true);
            exception;
            subscriber;
            JVM INSTR monitorexit ;
            throw exception;
            obj1;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
            subscriber;
            obj1;
            JVM INSTR monitorexit ;
            throw subscriber;
            subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
        }

        public OnSubscribeAction(State state1)
        {
            state = state1;
        }
    }

    static final class State
    {

        static final AtomicReferenceFieldUpdater OBSERVER_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/internal/operators/BufferUntilSubscriber$State, rx/Observer, "observerRef");
        final ConcurrentLinkedQueue buffer = new ConcurrentLinkedQueue();
        boolean emitting;
        Object guard;
        final NotificationLite nl = NotificationLite.instance();
        volatile Observer observerRef;

        boolean casObserverRef(Observer observer, Observer observer1)
        {
            return OBSERVER_UPDATER.compareAndSet(this, observer, observer1);
        }


        State()
        {
            observerRef = null;
            guard = new Object();
            emitting = false;
        }
    }


    private static final Observer EMPTY_OBSERVER = new Observer() {

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
        }

        public void onNext(Object obj)
        {
        }

    };
    private boolean forward;
    final State state;

    private BufferUntilSubscriber(State state1)
    {
        super(new OnSubscribeAction(state1));
        forward = false;
        state = state1;
    }

    public static BufferUntilSubscriber create()
    {
        return new BufferUntilSubscriber(new State());
    }

    private void emit(Object obj)
    {
        synchronized (state.guard)
        {
            state.buffer.add(obj);
            if (state.observerRef != null && !state.emitting)
            {
                forward = true;
                state.emitting = true;
            }
        }
        if (forward)
        {
            do
            {
                obj = state.buffer.poll();
                if (obj == null)
                {
                    break;
                }
                state.nl.accept(state.observerRef, obj);
            } while (true);
        }
        break MISSING_BLOCK_LABEL_106;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean hasObservers()
    {
        Object obj = state.guard;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (state.observerRef != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onCompleted()
    {
        if (forward)
        {
            state.observerRef.onCompleted();
            return;
        } else
        {
            emit(state.nl.completed());
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        if (forward)
        {
            state.observerRef.onError(throwable);
            return;
        } else
        {
            emit(state.nl.error(throwable));
            return;
        }
    }

    public void onNext(Object obj)
    {
        if (forward)
        {
            state.observerRef.onNext(obj);
            return;
        } else
        {
            emit(state.nl.next(obj));
            return;
        }
    }


}
