// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.NotificationLite;
import rx.subscriptions.Subscriptions;

final class SubjectSubscriptionManager
    implements rx.Observable.OnSubscribe
{
    protected static final class State
    {

        static final State EMPTY;
        static final SubjectObserver NO_OBSERVERS[];
        static final State TERMINATED;
        final SubjectObserver observers[];
        final boolean terminated;

        public State add(SubjectObserver subjectobserver)
        {
            int i = observers.length;
            SubjectObserver asubjectobserver[] = new SubjectObserver[i + 1];
            System.arraycopy(observers, 0, asubjectobserver, 0, i);
            asubjectobserver[i] = subjectobserver;
            return new State(terminated, asubjectobserver);
        }

        public State remove(SubjectObserver subjectobserver)
        {
            SubjectObserver asubjectobserver1[];
            int l;
            asubjectobserver1 = observers;
            l = asubjectobserver1.length;
            if (l != 1 || asubjectobserver1[0] != subjectobserver) goto _L2; else goto _L1
_L1:
            State state1 = EMPTY;
_L4:
            return state1;
_L2:
            state1 = this;
            if (l == 0) goto _L4; else goto _L3
_L3:
            SubjectObserver asubjectobserver[];
            int i;
            int j;
            asubjectobserver = new SubjectObserver[l - 1];
            j = 0;
            i = 0;
_L8:
            if (j >= l) goto _L6; else goto _L5
_L5:
            SubjectObserver subjectobserver1;
            subjectobserver1 = asubjectobserver1[j];
            if (subjectobserver1 == subjectobserver)
            {
                continue; /* Loop/switch isn't completed */
            }
            state1 = this;
            if (i == l - 1) goto _L4; else goto _L7
_L7:
            int k = i + 1;
            asubjectobserver[i] = subjectobserver1;
            i = k;
            j++;
              goto _L8
_L6:
            if (i == 0)
            {
                return EMPTY;
            }
            subjectobserver = asubjectobserver;
            if (i < l - 1)
            {
                subjectobserver = new SubjectObserver[i];
                System.arraycopy(asubjectobserver, 0, subjectobserver, 0, i);
            }
            return new State(terminated, subjectobserver);
        }

        static 
        {
            NO_OBSERVERS = new SubjectObserver[0];
            TERMINATED = new State(true, NO_OBSERVERS);
            EMPTY = new State(false, NO_OBSERVERS);
        }

        public State(boolean flag, SubjectObserver asubjectobserver[])
        {
            terminated = flag;
            observers = asubjectobserver;
        }
    }

    protected static final class SubjectObserver
        implements Observer
    {

        final Observer actual;
        protected volatile boolean caughtUp;
        boolean emitting;
        boolean fastPath;
        boolean first;
        private volatile Object index;
        List queue;

        protected void accept(Object obj, NotificationLite notificationlite)
        {
            if (obj != null)
            {
                notificationlite.accept(actual, obj);
            }
        }

        protected void emitFirst(Object obj, NotificationLite notificationlite)
        {
            boolean flag = false;
            this;
            JVM INSTR monitorenter ;
            if (first && !emitting)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            first = false;
            if (obj != null)
            {
                flag = true;
            }
            emitting = flag;
            this;
            JVM INSTR monitorexit ;
            if (obj != null)
            {
                emitLoop(null, obj, notificationlite);
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

        protected void emitLoop(List list, Object obj, NotificationLite notificationlite)
        {
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag2 = true;
            flag4 = false;
            flag3 = false;
_L9:
            if (list == null) goto _L2; else goto _L1
_L1:
            boolean flag = flag3;
            list = list.iterator();
_L3:
            flag = flag3;
            if (!list.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag3;
            accept(list.next(), notificationlite);
            if (true) goto _L3; else goto _L2
            list;
            if (flag) goto _L5; else goto _L4
_L4:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L5:
            throw list;
_L2:
            boolean flag1;
            flag1 = flag2;
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            flag1 = false;
            flag = flag3;
            accept(obj, notificationlite);
            flag = flag3;
            this;
            JVM INSTR monitorenter ;
            flag = flag4;
            list = queue;
            flag = flag4;
            queue = null;
            if (list != null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            flag = flag4;
            emitting = false;
            flag = true;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L7; else goto _L6
_L6:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L7:
            return;
            flag = flag4;
            this;
            JVM INSTR monitorexit ;
            flag2 = flag1;
            if (true) goto _L9; else goto _L8
_L8:
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
        }

        protected void emitNext(Object obj, NotificationLite notificationlite)
        {
            if (fastPath)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            this;
            JVM INSTR monitorenter ;
            first = false;
            if (!emitting)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            if (queue == null)
            {
                queue = new ArrayList();
            }
            queue.add(obj);
            this;
            JVM INSTR monitorexit ;
            return;
            this;
            JVM INSTR monitorexit ;
            fastPath = true;
            notificationlite.accept(actual, obj);
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        protected Observer getActual()
        {
            return actual;
        }

        public Object index()
        {
            return index;
        }

        public void index(Object obj)
        {
            index = obj;
        }

        public void onCompleted()
        {
            actual.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            actual.onError(throwable);
        }

        public void onNext(Object obj)
        {
            actual.onNext(obj);
        }

        public SubjectObserver(Observer observer)
        {
            first = true;
            actual = observer;
        }
    }


    static final AtomicReferenceFieldUpdater LATEST_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/subjects/SubjectSubscriptionManager, java/lang/Object, "latest");
    static final AtomicReferenceFieldUpdater STATE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/subjects/SubjectSubscriptionManager, rx/subjects/SubjectSubscriptionManager$State, "state");
    boolean active;
    volatile Object latest;
    public final NotificationLite nl = NotificationLite.instance();
    Action1 onAdded;
    Action1 onStart;
    Action1 onTerminated;
    volatile State state;

    SubjectSubscriptionManager()
    {
        state = State.EMPTY;
        active = true;
        onStart = Actions.empty();
        onAdded = Actions.empty();
        onTerminated = Actions.empty();
    }

    boolean add(SubjectObserver subjectobserver)
    {
        State state1;
        State state2;
        do
        {
            state1 = state;
            if (state1.terminated)
            {
                onTerminated.call(subjectobserver);
                return false;
            }
            state2 = state1.add(subjectobserver);
        } while (!STATE_UPDATER.compareAndSet(this, state1, state2));
        onAdded.call(subjectobserver);
        return true;
    }

    void addUnsubscriber(Subscriber subscriber, final SubjectObserver bo)
    {
        subscriber.add(Subscriptions.create(new Action0() {

            final SubjectSubscriptionManager this$0;
            final SubjectObserver val$bo;

            public void call()
            {
                remove(bo);
            }

            
            {
                this$0 = SubjectSubscriptionManager.this;
                bo = subjectobserver;
                super();
            }
        }));
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        SubjectObserver subjectobserver = new SubjectObserver(subscriber);
        addUnsubscriber(subscriber, subjectobserver);
        onStart.call(subjectobserver);
        if (!subscriber.isUnsubscribed() && add(subjectobserver) && subscriber.isUnsubscribed())
        {
            remove(subjectobserver);
        }
    }

    Object get()
    {
        return latest;
    }

    SubjectObserver[] next(Object obj)
    {
        set(obj);
        return state.observers;
    }

    SubjectObserver[] observers()
    {
        return state.observers;
    }

    void remove(SubjectObserver subjectobserver)
    {
        State state1;
        State state2;
        do
        {
            state1 = state;
            if (state1.terminated)
            {
                return;
            }
        } while ((state2 = state1.remove(subjectobserver)) != state1 && !STATE_UPDATER.compareAndSet(this, state1, state2));
    }

    void set(Object obj)
    {
        latest = obj;
    }

    SubjectObserver[] terminate(Object obj)
    {
        set(obj);
        active = false;
        if (state.terminated)
        {
            return State.NO_OBSERVERS;
        } else
        {
            return ((State)STATE_UPDATER.getAndSet(this, State.TERMINATED)).observers;
        }
    }

}
