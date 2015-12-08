// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Subscription;

// Referenced classes of package rx.subscriptions:
//            Subscriptions

public final class MultipleAssignmentSubscription
    implements Subscription
{
    private static final class State
    {

        final boolean isUnsubscribed;
        final Subscription subscription;

        State set(Subscription subscription1)
        {
            return new State(isUnsubscribed, subscription1);
        }

        State unsubscribe()
        {
            return new State(true, subscription);
        }

        State(boolean flag, Subscription subscription1)
        {
            isUnsubscribed = flag;
            subscription = subscription1;
        }
    }


    static final AtomicReferenceFieldUpdater STATE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/subscriptions/MultipleAssignmentSubscription, rx/subscriptions/MultipleAssignmentSubscription$State, "state");
    volatile State state;

    public MultipleAssignmentSubscription()
    {
        state = new State(false, Subscriptions.empty());
    }

    public Subscription get()
    {
        return state.subscription;
    }

    public boolean isUnsubscribed()
    {
        return state.isUnsubscribed;
    }

    public void set(Subscription subscription)
    {
        if (subscription == null)
        {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        State state1;
        State state2;
        do
        {
            state1 = state;
            if (state1.isUnsubscribed)
            {
                subscription.unsubscribe();
                return;
            }
            state2 = state1.set(subscription);
        } while (!STATE_UPDATER.compareAndSet(this, state1, state2));
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
        state1.subscription.unsubscribe();
    }

}
