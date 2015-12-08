// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

public final class OperatorSwitch
    implements rx.Observable.Operator
{
    private static final class Holder
    {

        static final OperatorSwitch INSTANCE = new OperatorSwitch();


        private Holder()
        {
        }
    }

    private static final class SwitchSubscriber extends Subscriber
    {

        boolean active;
        InnerSubscriber currentSubscriber;
        boolean emitting;
        final Object guard = new Object();
        int index;
        volatile boolean infinite;
        long initialRequested;
        boolean mainDone;
        final NotificationLite nl = NotificationLite.instance();
        List queue;
        final SerializedSubscriber s;
        final SerialSubscription ssub = new SerialSubscription();

        void complete(int i)
        {
label0:
            {
                synchronized (guard)
                {
                    if (i == index)
                    {
                        break label0;
                    }
                }
                return;
            }
            active = false;
            if (mainDone)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            queue.add(nl.completed());
            obj;
            JVM INSTR monitorexit ;
            return;
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            drain(list);
            s.onCompleted();
            unsubscribe();
            return;
        }

        void drain(List list)
        {
            if (list != null)
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    Object obj = list.next();
                    if (nl.isCompleted(obj))
                    {
                        s.onCompleted();
                        return;
                    }
                    if (nl.isError(obj))
                    {
                        s.onError(nl.getError(obj));
                        return;
                    }
                    s.onNext(obj);
                }
            }
        }

        void emit(Object obj, int i, InnerSubscriber innersubscriber)
        {
label0:
            {
                synchronized (guard)
                {
                    if (i == index)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            if (innersubscriber.requested != 0x7fffffffffffffffL)
            {
                long l = 
// JavaClassFileOutputException: get_constant: invalid tag

        void error(Throwable throwable, int i)
        {
label0:
            {
                synchronized (guard)
                {
                    if (i == index)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            queue.add(nl.error(throwable));
            obj;
            JVM INSTR monitorexit ;
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            drain(list);
            s.onError(throwable);
            unsubscribe();
            return;
        }

        public void onCompleted()
        {
label0:
            {
                synchronized (guard)
                {
                    mainDone = true;
                    if (!active)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            queue.add(nl.completed());
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj;
            JVM INSTR monitorexit ;
            drain(list);
            s.onCompleted();
            unsubscribe();
            return;
        }

        public void onError(Throwable throwable)
        {
            s.onError(throwable);
            unsubscribe();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable)obj);
        }

        public void onNext(Observable observable)
        {
            Object obj = guard;
            obj;
            JVM INSTR monitorenter ;
            int i;
            i = index + 1;
            index = i;
            active = true;
            if (!infinite) goto _L2; else goto _L1
_L1:
            long l = 0x7fffffffffffffffL;
_L4:
            currentSubscriber = new InnerSubscriber(i, l);
            currentSubscriber.requested = l;
            obj;
            JVM INSTR monitorexit ;
            ssub.set(currentSubscriber);
            observable.unsafeSubscribe(currentSubscriber);
            return;
_L2:
            if (currentSubscriber == null)
            {
                l = initialRequested;
                continue; /* Loop/switch isn't completed */
            }
            l = currentSubscriber.requested;
            if (true) goto _L4; else goto _L3
_L3:
            observable;
            obj;
            JVM INSTR monitorexit ;
            throw observable;
        }

        public SwitchSubscriber(Subscriber subscriber)
        {
            infinite = false;
            s = new SerializedSubscriber(subscriber);
            subscriber.add(ssub);
            subscriber.setProducer(new _cls1());
        }
    }

    final class SwitchSubscriber.InnerSubscriber extends Subscriber
    {

        private final int id;
        private final long initialRequested;
        private long requested;
        final SwitchSubscriber this$0;

        public void onCompleted()
        {
            complete(id);
        }

        public void onError(Throwable throwable)
        {
            error(throwable, id);
        }

        public void onNext(Object obj)
        {
            emit(obj, id, this);
        }

        public void onStart()
        {
            requestMore(initialRequested);
        }

        public void requestMore(long l)
        {
            request(l);
        }



/*
        static long access$102(SwitchSubscriber.InnerSubscriber innersubscriber, long l)
        {
            innersubscriber.requested = l;
            return l;
        }

*/


/*
        static long access$110(SwitchSubscriber.InnerSubscriber innersubscriber)
        {
            long l = innersubscriber.requested;
            innersubscriber.requested = l - 1L;
            return l;
        }

*/

        public SwitchSubscriber.InnerSubscriber(int i, long l)
        {
            this$0 = SwitchSubscriber.this;
            super();
            requested = 0L;
            id = i;
            initialRequested = l;
        }
    }


    private OperatorSwitch()
    {
    }


    public static OperatorSwitch instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        SwitchSubscriber switchsubscriber = new SwitchSubscriber(subscriber);
        subscriber.add(switchsubscriber);
        return switchsubscriber;
    }

    // Unreferenced inner class rx/internal/operators/OperatorSwitch$SwitchSubscriber$1

/* anonymous class */
    class SwitchSubscriber._cls1
        implements Producer
    {

        final SwitchSubscriber this$0;

        public void request(long l)
        {
            if (!infinite) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (l == 0x7fffffffffffffffL)
            {
                infinite = true;
            }
            Object obj = guard;
            obj;
            JVM INSTR monitorenter ;
            Object obj1 = currentSubscriber;
            if (currentSubscriber != null) goto _L4; else goto _L3
_L3:
            long l1 = initialRequested + l;
            if (l1 >= 0L) goto _L6; else goto _L5
_L5:
            infinite = true;
_L8:
            obj;
            JVM INSTR monitorexit ;
            if (obj1 == null) goto _L1; else goto _L7
_L7:
            if (infinite)
            {
                ((SwitchSubscriber.InnerSubscriber) (obj1)).requestMore(0x7fffffffffffffffL);
                return;
            } else
            {
                ((SwitchSubscriber.InnerSubscriber) (obj1)).requestMore(l);
                return;
            }
_L6:
            initialRequested = l1;
              goto _L8
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
_L4:
            l1 = currentSubscriber.requested + l;
            if (l1 >= 0L)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            infinite = true;
              goto _L8
            currentSubscriber.requested = l1;
              goto _L8
        }

            
            {
                this$0 = SwitchSubscriber.this;
                super();
            }
    }

}
