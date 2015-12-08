// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Subscription;

// Referenced classes of package rx.subscriptions:
//            Subscriptions

public final class RefCountSubscription
    implements Subscription
{
    private static final class InnerSubscription
        implements Subscription
    {

        static final AtomicIntegerFieldUpdater INNER_DONE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/subscriptions/RefCountSubscription$InnerSubscription, "innerDone");
        volatile int innerDone;
        final RefCountSubscription parent;

        public boolean isUnsubscribed()
        {
            return innerDone != 0;
        }

        public void unsubscribe()
        {
            if (INNER_DONE_UPDATER.compareAndSet(this, 0, 1))
            {
                parent.unsubscribeAChild();
            }
        }


        public InnerSubscription(RefCountSubscription refcountsubscription)
        {
            parent = refcountsubscription;
        }
    }

    private static final class State
    {

        final int children;
        final boolean isUnsubscribed;

        State addChild()
        {
            return new State(isUnsubscribed, children + 1);
        }

        State removeChild()
        {
            return new State(isUnsubscribed, children - 1);
        }

        State unsubscribe()
        {
            return new State(true, children);
        }

        State(boolean flag, int i)
        {
            isUnsubscribed = flag;
            children = i;
        }
    }


    static final State EMPTY_STATE = new State(false, 0);
    static final AtomicReferenceFieldUpdater STATE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/subscriptions/RefCountSubscription, rx/subscriptions/RefCountSubscription$State, "state");
    private final Subscription actual;
    volatile State state;

    public RefCountSubscription(Subscription subscription)
    {
        state = EMPTY_STATE;
        if (subscription == null)
        {
            throw new IllegalArgumentException("s");
        } else
        {
            actual = subscription;
            return;
        }
    }

    private void unsubscribeActualIfApplicable(State state1)
    {
        if (state1.isUnsubscribed && state1.children == 0)
        {
            actual.unsubscribe();
        }
    }

    public Subscription get()
    {
        State state1;
        State state2;
        do
        {
            state1 = state;
            if (state1.isUnsubscribed)
            {
                return Subscriptions.unsubscribed();
            }
            state2 = state1.addChild();
        } while (!STATE_UPDATER.compareAndSet(this, state1, state2));
        return new InnerSubscription(this);
    }

    public boolean isUnsubscribed()
    {
        return state.isUnsubscribed;
    }

    public void unsubscribe()
    {
        State state1;
        State state2;
        do
        {
            state1 = state;
            if (state1.isUnsubscribed)
            {
                return;
            }
            state2 = state1.unsubscribe();
        } while (!STATE_UPDATER.compareAndSet(this, state1, state2));
        unsubscribeActualIfApplicable(state2);
    }

    void unsubscribeAChild()
    {
        State state1;
        State state2;
        do
        {
            state1 = state;
            state2 = state1.removeChild();
        } while (!STATE_UPDATER.compareAndSet(this, state1, state2));
        unsubscribeActualIfApplicable(state2);
    }

}
