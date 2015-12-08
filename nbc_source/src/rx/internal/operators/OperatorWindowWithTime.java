// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite, BufferUntilSubscriber

public final class OperatorWindowWithTime
    implements rx.Observable.Operator
{
    static final class CountedSerializedSubject
    {

        final Observer consumer;
        int count;
        final Observable producer;

        public CountedSerializedSubject(Observer observer, Observable observable)
        {
            consumer = new SerializedObserver(observer);
            producer = observable;
        }
    }

    final class ExactSubscriber extends Subscriber
    {

        final Subscriber child;
        boolean emitting;
        final Object guard = new Object();
        List queue;
        volatile State state;
        final OperatorWindowWithTime this$0;
        final rx.Scheduler.Worker worker;

        void complete()
        {
            Observer observer = state.consumer;
            state = state.clear();
            if (observer != null)
            {
                observer.onCompleted();
            }
            child.onCompleted();
            unsubscribe();
        }

        boolean drain(List list)
        {
            if (list != null)
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    Object obj = list.next();
                    if (obj == OperatorWindowWithTime.NEXT_SUBJECT)
                    {
                        if (!replaceSubject())
                        {
                            return false;
                        }
                    } else
                    {
                        if (OperatorWindowWithTime.nl.isError(obj))
                        {
                            error(OperatorWindowWithTime.nl.getError(obj));
                            return true;
                        }
                        if (OperatorWindowWithTime.nl.isCompleted(obj))
                        {
                            complete();
                            return true;
                        }
                        if (!emitValue(obj))
                        {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        boolean emitValue(Object obj)
        {
            State state2 = state;
            State state1 = state2;
            if (state2.consumer == null)
            {
                if (!replaceSubject())
                {
                    return false;
                }
                state1 = state;
            }
            state1.consumer.onNext(obj);
            if (state1.count == size - 1)
            {
                state1.consumer.onCompleted();
                obj = state1.clear();
            } else
            {
                obj = state1.next();
            }
            state = ((State) (obj));
            return true;
        }

        void error(Throwable throwable)
        {
            Observer observer = state.consumer;
            state = state.clear();
            if (observer != null)
            {
                observer.onError(throwable);
            }
            child.onError(throwable);
            unsubscribe();
        }

        void nextWindow()
        {
label0:
            {
                synchronized (guard)
                {
                    if (!emitting)
                    {
                        break label0;
                    }
                    if (queue == null)
                    {
                        queue = new ArrayList();
                    }
                    queue.add(OperatorWindowWithTime.NEXT_SUBJECT);
                }
                return;
            }
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            boolean flag;
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = false;
            flag = flag2;
            boolean flag3 = replaceSubject();
            if (!flag3)
            {
                if (true)
                {
                    synchronized (guard)
                    {
                        emitting = false;
                    }
                    return;
                }
                break MISSING_BLOCK_LABEL_248;
            }
            break MISSING_BLOCK_LABEL_104;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
_L2:
            flag = flag2;
            obj1 = guard;
            flag = flag2;
            obj1;
            JVM INSTR monitorenter ;
            flag = flag1;
            obj3 = queue;
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_165;
            }
            flag = flag1;
            emitting = false;
            flag = true;
            obj1;
            JVM INSTR monitorexit ;
            if (false)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_248;
            obj3;
            obj1;
            JVM INSTR monitorexit ;
            throw obj3;
            flag = flag1;
            queue = null;
            flag = flag1;
            obj1;
            JVM INSTR monitorexit ;
            flag = flag2;
            flag3 = drain(((List) (obj3)));
            if (flag3) goto _L2; else goto _L1
_L1:
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_248;
            exception2;
            obj1;
            JVM INSTR monitorexit ;
            throw exception2;
            Exception exception3;
            exception3;
            obj1;
            JVM INSTR monitorexit ;
            throw exception3;
            exception3;
            if (!flag)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
            }
            throw exception3;
            exception4;
            obj2;
            JVM INSTR monitorexit ;
            throw exception4;
        }

        public void onCompleted()
        {
label0:
            {
                synchronized (guard)
                {
                    if (!emitting)
                    {
                        break label0;
                    }
                    if (queue == null)
                    {
                        queue = new ArrayList();
                    }
                    queue.add(OperatorWindowWithTime.nl.completed());
                }
                return;
            }
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                drain(list);
            }
            catch (Throwable throwable)
            {
                error(throwable);
                return;
            }
            complete();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onError(Throwable throwable)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!emitting)
                    {
                        break label0;
                    }
                    queue = Collections.singletonList(OperatorWindowWithTime.nl.error(throwable));
                }
                return;
            }
            queue = null;
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            error(throwable);
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public void onNext(Object obj)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!emitting)
                    {
                        break label0;
                    }
                    if (queue == null)
                    {
                        queue = new ArrayList();
                    }
                    queue.add(obj);
                }
                return;
            }
            emitting = true;
            obj1;
            JVM INSTR monitorexit ;
            boolean flag;
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = false;
            flag = flag2;
            boolean flag3 = emitValue(obj);
            if (!flag3)
            {
                if (true)
                {
                    synchronized (guard)
                    {
                        emitting = false;
                    }
                    return;
                }
                break MISSING_BLOCK_LABEL_247;
            }
            break MISSING_BLOCK_LABEL_103;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
_L2:
            flag = flag2;
            obj = guard;
            flag = flag2;
            obj;
            JVM INSTR monitorenter ;
            flag = flag1;
            obj2 = queue;
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_164;
            }
            flag = flag1;
            emitting = false;
            flag = true;
            obj;
            JVM INSTR monitorexit ;
            if (false)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_247;
            obj2;
            obj;
            JVM INSTR monitorexit ;
            throw obj2;
            flag = flag1;
            queue = null;
            flag = flag1;
            obj;
            JVM INSTR monitorexit ;
            flag = flag2;
            flag3 = drain(((List) (obj2)));
            if (flag3) goto _L2; else goto _L1
_L1:
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_247;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Exception exception1;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            exception1;
            if (!flag)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
            }
            throw exception1;
            exception2;
            obj;
            JVM INSTR monitorexit ;
            throw exception2;
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        boolean replaceSubject()
        {
            Observer observer = state.consumer;
            if (observer != null)
            {
                observer.onCompleted();
            }
            if (child.isUnsubscribed())
            {
                state = state.clear();
                unsubscribe();
                return false;
            } else
            {
                BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
                state = state.create(bufferuntilsubscriber, bufferuntilsubscriber);
                child.onNext(bufferuntilsubscriber);
                return true;
            }
        }

        void scheduleExact()
        {
            worker.schedulePeriodically(new Action0() {

                final ExactSubscriber this$1;

                public void call()
                {
                    nextWindow();
                }

            
            {
                this$1 = ExactSubscriber.this;
                super();
            }
            }, 0L, timespan, unit);
        }

        public ExactSubscriber(Subscriber subscriber, rx.Scheduler.Worker worker1)
        {
            this$0 = OperatorWindowWithTime.this;
            super();
            child = new SerializedSubscriber(subscriber);
            worker = worker1;
            state = State.empty();
            subscriber.add(Subscriptions.create(new _cls1()));
        }
    }

    final class InexactSubscriber extends Subscriber
    {

        final Subscriber child;
        final List chunks = new LinkedList();
        boolean done;
        final Object guard = new Object();
        final OperatorWindowWithTime this$0;
        final rx.Scheduler.Worker worker;

        CountedSerializedSubject createCountedSerializedSubject()
        {
            BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
            return new CountedSerializedSubject(bufferuntilsubscriber, bufferuntilsubscriber);
        }

        public void onCompleted()
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            ArrayList arraylist;
            done = true;
            arraylist = new ArrayList(chunks);
            chunks.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((CountedSerializedSubject)((Iterator) (obj)).next()).consumer.onCompleted()) { }
            break MISSING_BLOCK_LABEL_86;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            child.onCompleted();
            return;
        }

        public void onError(Throwable throwable)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            ArrayList arraylist;
            done = true;
            arraylist = new ArrayList(chunks);
            chunks.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((CountedSerializedSubject)((Iterator) (obj)).next()).consumer.onError(throwable)) { }
            break MISSING_BLOCK_LABEL_87;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            child.onError(throwable);
            return;
        }

        public void onNext(Object obj)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            ArrayList arraylist;
            arraylist = new ArrayList(chunks);
            Iterator iterator1 = chunks.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                CountedSerializedSubject countedserializedsubject1 = (CountedSerializedSubject)iterator1.next();
                int i = countedserializedsubject1.count + 1;
                countedserializedsubject1.count = i;
                if (i == size)
                {
                    iterator1.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_105;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj1;
            JVM INSTR monitorexit ;
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CountedSerializedSubject countedserializedsubject = (CountedSerializedSubject)iterator.next();
                countedserializedsubject.consumer.onNext(obj);
                if (countedserializedsubject.count == size)
                {
                    countedserializedsubject.consumer.onCompleted();
                }
            } while (true);
            return;
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        void scheduleChunk()
        {
            worker.schedulePeriodically(new Action0() {

                final InexactSubscriber this$1;

                public void call()
                {
                    startNewChunk();
                }

            
            {
                this$1 = InexactSubscriber.this;
                super();
            }
            }, timeshift, timeshift, unit);
        }

        void startNewChunk()
        {
            CountedSerializedSubject countedserializedsubject;
label0:
            {
                countedserializedsubject = createCountedSerializedSubject();
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            chunks.add(countedserializedsubject);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                child.onNext(countedserializedsubject.producer);
            }
            catch (Throwable throwable)
            {
                onError(throwable);
                return;
            }
            worker.schedule(countedserializedsubject. new Action0() {

                final InexactSubscriber this$1;
                final CountedSerializedSubject val$chunk;

                public void call()
                {
                    terminateChunk(chunk);
                }

            
            {
                this$1 = final_inexactsubscriber;
                chunk = CountedSerializedSubject.this;
                super();
            }
            }, timespan, unit);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void terminateChunk(CountedSerializedSubject countedserializedsubject)
        {
            boolean flag1;
label0:
            {
                flag1 = false;
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            Iterator iterator = chunks.iterator();
_L2:
            boolean flag = flag1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            if ((CountedSerializedSubject)iterator.next() != countedserializedsubject) goto _L2; else goto _L1
_L1:
            flag = true;
            iterator.remove();
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                countedserializedsubject.consumer.onCompleted();
                return;
            } else
            {
                return;
            }
            countedserializedsubject;
            obj;
            JVM INSTR monitorexit ;
            throw countedserializedsubject;
        }

        public InexactSubscriber(Subscriber subscriber, rx.Scheduler.Worker worker1)
        {
            this$0 = OperatorWindowWithTime.this;
            super(subscriber);
            child = subscriber;
            worker = worker1;
        }
    }

    static final class State
    {

        static final State EMPTY = new State(null, null, 0);
        final Observer consumer;
        final int count;
        final Observable producer;

        public static State empty()
        {
            return EMPTY;
        }

        public State clear()
        {
            return empty();
        }

        public State create(Observer observer, Observable observable)
        {
            return new State(observer, observable, 0);
        }

        public State next()
        {
            return new State(consumer, producer, count + 1);
        }


        public State(Observer observer, Observable observable, int i)
        {
            consumer = observer;
            producer = observable;
            count = i;
        }
    }


    static final Object NEXT_SUBJECT = new Object();
    static final NotificationLite nl = NotificationLite.instance();
    final Scheduler scheduler;
    final int size;
    final long timeshift;
    final long timespan;
    final TimeUnit unit;

    public OperatorWindowWithTime(long l, long l1, TimeUnit timeunit, int i, Scheduler scheduler1)
    {
        timespan = l;
        timeshift = l1;
        unit = timeunit;
        size = i;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        if (timespan == timeshift)
        {
            subscriber = new ExactSubscriber(subscriber, worker);
            subscriber.add(worker);
            subscriber.scheduleExact();
            return subscriber;
        } else
        {
            subscriber = new InexactSubscriber(subscriber, worker);
            subscriber.add(worker);
            subscriber.startNewChunk();
            subscriber.scheduleChunk();
            return subscriber;
        }
    }


    // Unreferenced inner class rx/internal/operators/OperatorWindowWithTime$ExactSubscriber$1

/* anonymous class */
    class ExactSubscriber._cls1
        implements Action0
    {

        final ExactSubscriber this$1;
        final OperatorWindowWithTime val$this$0;

        public void call()
        {
            if (state.consumer == null)
            {
                unsubscribe();
            }
        }

            
            {
                this$1 = final_exactsubscriber;
                this$0 = OperatorWindowWithTime.this;
                super();
            }
    }

}
