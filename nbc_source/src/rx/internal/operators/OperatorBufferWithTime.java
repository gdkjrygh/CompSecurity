// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;

public final class OperatorBufferWithTime
    implements rx.Observable.Operator
{
    final class ExactSubscriber extends Subscriber
    {

        final Subscriber child;
        List chunk;
        boolean done;
        final rx.Scheduler.Worker inner;
        final OperatorBufferWithTime this$0;

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
            chunk = new ArrayList();
            this;
            JVM INSTR monitorexit ;
            try
            {
                child.onNext(list);
                return;
            }
            catch (Throwable throwable)
            {
                onError(throwable);
            }
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onCompleted()
        {
            inner.unsubscribe();
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_19;
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
            Object obj1 = null;
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            chunk.add(obj);
            obj = obj1;
            if (chunk.size() == count)
            {
                obj = chunk;
                chunk = new ArrayList();
            }
            this;
            JVM INSTR monitorexit ;
            if (obj != null)
            {
                child.onNext(obj);
                return;
            } else
            {
                return;
            }
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        void scheduleExact()
        {
            inner.schedulePeriodically(new Action0() {

                final ExactSubscriber this$1;

                public void call()
                {
                    emit();
                }

            
            {
                this$1 = ExactSubscriber.this;
                super();
            }
            }, timespan, timespan, unit);
        }

        public ExactSubscriber(Subscriber subscriber, rx.Scheduler.Worker worker)
        {
            this$0 = OperatorBufferWithTime.this;
            super();
            child = subscriber;
            inner = worker;
            chunk = new ArrayList();
        }
    }

    final class InexactSubscriber extends Subscriber
    {

        final Subscriber child;
        final List chunks = new LinkedList();
        boolean done;
        final rx.Scheduler.Worker inner;
        final OperatorBufferWithTime this$0;

        void emitChunk(List list)
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_15;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Iterator iterator = chunks.iterator();
_L2:
            boolean flag = flag1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_58;
            }
            if ((List)iterator.next() != list) goto _L2; else goto _L1
_L1:
            iterator.remove();
            flag = true;
            this;
            JVM INSTR monitorexit ;
            if (flag)
            {
                try
                {
                    child.onNext(list);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    onError(list);
                }
                return;
            } else
            {
                return;
            }
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
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
            Object obj;
            done = true;
            obj = new LinkedList(chunks);
            chunks.clear();
            this;
            JVM INSTR monitorexit ;
            try
            {
                List list;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); child.onNext(list))
                {
                    list = (List)((Iterator) (obj)).next();
                }

            }
            catch (Throwable throwable)
            {
                child.onError(throwable);
                return;
            }
            break MISSING_BLOCK_LABEL_92;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            child.onCompleted();
            unsubscribe();
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
            chunks.clear();
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
            Iterator iterator = chunks.iterator();
            Object obj1 = null;
_L1:
            List list;
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_100;
                }
                list = (List)iterator.next();
                list.add(obj);
            } while (list.size() != count);
            iterator.remove();
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            obj1 = new LinkedList();
            ((List) (obj1)).add(list);
              goto _L1
            this;
            JVM INSTR monitorexit ;
              goto _L2
            obj;
_L4:
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L2:
            if (obj1 != null)
            {
                for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); child.onNext(obj1))
                {
                    obj1 = (List)((Iterator) (obj)).next();
                }

            }
            return;
            obj;
            if (true) goto _L4; else goto _L3
_L3:
        }

        void scheduleChunk()
        {
            inner.schedulePeriodically(new Action0() {

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
            ArrayList arraylist = new ArrayList();
            this;
            JVM INSTR monitorenter ;
            if (!done)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            chunks.add(arraylist);
            this;
            JVM INSTR monitorexit ;
            inner.schedule(arraylist. new Action0() {

                final InexactSubscriber this$1;
                final List val$chunk;

                public void call()
                {
                    emitChunk(chunk);
                }

            
            {
                this$1 = final_inexactsubscriber;
                chunk = List.this;
                super();
            }
            }, timespan, unit);
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public InexactSubscriber(Subscriber subscriber, rx.Scheduler.Worker worker)
        {
            this$0 = OperatorBufferWithTime.this;
            super();
            child = subscriber;
            inner = worker;
        }
    }


    final int count;
    final Scheduler scheduler;
    final long timeshift;
    final long timespan;
    final TimeUnit unit;

    public OperatorBufferWithTime(long l, long l1, TimeUnit timeunit, int i, Scheduler scheduler1)
    {
        timespan = l;
        timeshift = l1;
        unit = timeunit;
        count = i;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        Object obj = new SerializedSubscriber(subscriber);
        if (timespan == timeshift)
        {
            obj = new ExactSubscriber(((Subscriber) (obj)), worker);
            ((ExactSubscriber) (obj)).add(worker);
            subscriber.add(((rx.Subscription) (obj)));
            ((ExactSubscriber) (obj)).scheduleExact();
            return ((Subscriber) (obj));
        } else
        {
            obj = new InexactSubscriber(((Subscriber) (obj)), worker);
            ((InexactSubscriber) (obj)).add(worker);
            subscriber.add(((rx.Subscription) (obj)));
            ((InexactSubscriber) (obj)).startNewChunk();
            ((InexactSubscriber) (obj)).scheduleChunk();
            return ((Subscriber) (obj));
        }
    }
}
