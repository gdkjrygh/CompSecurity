// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

public final class OperatorSwitch
    implements rx.Observable.Operator
{

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

    private class Holder
    {

        static final OperatorSwitch INSTANCE = new OperatorSwitch();


        private Holder()
        {
        }
    }


    private class SwitchSubscriber extends Subscriber
    {

        boolean active;
        final ProducerArbiter arbiter = new ProducerArbiter();
        InnerSubscriber currentSubscriber;
        boolean emitting;
        final Object guard = new Object();
        int index;
        boolean mainDone;
        final NotificationLite nl = NotificationLite.instance();
        List queue;
        final SerializedSubscriber serializedChild;
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
            serializedChild.onCompleted();
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
                        serializedChild.onCompleted();
                        return;
                    }
                    if (nl.isError(obj))
                    {
                        serializedChild.onError(nl.getError(obj));
                        return;
                    }
                    serializedChild.onNext(obj);
                    arbiter.produced(1L);
                }
            }
        }

        void emit(Object obj, int i, InnerSubscriber innersubscriber)
        {
            boolean flag;
            boolean flag1;
            boolean flag2;
label0:
            {
                flag2 = true;
                flag = true;
                flag1 = false;
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
                break MISSING_BLOCK_LABEL_76;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            queue.add(obj);
            obj1;
            JVM INSTR monitorexit ;
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            innersubscriber = queue;
            queue = null;
            emitting = true;
            obj1;
            JVM INSTR monitorexit ;
            i = 1;
_L4:
            drain(innersubscriber);
            int j;
            j = i;
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            serializedChild.onNext(obj);
            arbiter.produced(1L);
            j = 0;
            Object obj2 = guard;
            obj2;
            JVM INSTR monitorenter ;
            innersubscriber = queue;
            queue = null;
            if (innersubscriber != null) goto _L2; else goto _L1
_L1:
            emitting = false;
            j = ((flag2) ? 1 : 0);
            obj2;
            JVM INSTR monitorexit ;
            i = ((flag) ? 1 : 0);
_L5:
            boolean flag3;
            if (i == 0)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            } else
            {
                return;
            }
            innersubscriber;
            obj;
            JVM INSTR monitorexit ;
            throw innersubscriber;
_L2:
            obj2;
            JVM INSTR monitorexit ;
            flag3 = serializedChild.isUnsubscribed();
            i = j;
            if (!flag3) goto _L4; else goto _L3
_L3:
            i = 0;
              goto _L5
            obj;
            i = 0;
_L9:
            j = i;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
_L7:
            if (i == 0)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
            }
            throw obj;
            obj;
            innersubscriber;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            i = ((flag1) ? 1 : 0);
            if (true) goto _L7; else goto _L6
_L6:
            obj;
            i = j;
            if (true) goto _L9; else goto _L8
_L8:
        }

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
            serializedChild.onError(throwable);
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
            serializedChild.onCompleted();
            unsubscribe();
            return;
        }

        public void onError(Throwable throwable)
        {
            serializedChild.onError(throwable);
            unsubscribe();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable)obj);
        }

        public void onNext(Observable observable)
        {
            synchronized (guard)
            {
                int i = index + 1;
                index = i;
                active = true;
                currentSubscriber = new InnerSubscriber(i, arbiter, this);
            }
            ssub.set(currentSubscriber);
            observable.unsafeSubscribe(currentSubscriber);
            return;
            observable;
            obj;
            JVM INSTR monitorexit ;
            throw observable;
        }

        SwitchSubscriber(Subscriber subscriber)
        {
            serializedChild = new SerializedSubscriber(subscriber);
            subscriber.add(ssub);
            subscriber.setProducer(new Producer() {

                final SwitchSubscriber this$0;

                public void request(long l)
                {
                    if (l > 0L)
                    {
                        arbiter.request(l);
                    }
                }

                
                {
                    this$0 = SwitchSubscriber.this;
                    super();
                }
            });
        }

        private class InnerSubscriber extends Subscriber
        {

            private final ProducerArbiter arbiter;
            private final int id;
            private final SwitchSubscriber parent;

            public void onCompleted()
            {
                parent.complete(id);
            }

            public void onError(Throwable throwable)
            {
                parent.error(throwable, id);
            }

            public void onNext(Object obj)
            {
                parent.emit(obj, id, this);
            }

            public void setProducer(Producer producer)
            {
                arbiter.setProducer(producer);
            }

            InnerSubscriber(int i, ProducerArbiter producerarbiter, SwitchSubscriber switchsubscriber)
            {
                id = i;
                arbiter = producerarbiter;
                parent = switchsubscriber;
            }
        }

    }

}
