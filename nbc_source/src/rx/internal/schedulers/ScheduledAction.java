// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;
import rx.subscriptions.CompositeSubscription;

public final class ScheduledAction extends AtomicReference
    implements Runnable, Subscription
{
    private final class FutureCompleter
        implements Subscription
    {

        private final Future f;
        final ScheduledAction this$0;

        public boolean isUnsubscribed()
        {
            return f.isCancelled();
        }

        public void unsubscribe()
        {
            if (get() != Thread.currentThread())
            {
                f.cancel(true);
                return;
            } else
            {
                f.cancel(false);
                return;
            }
        }

        private FutureCompleter(Future future)
        {
            this$0 = ScheduledAction.this;
            super();
            f = future;
        }

    }

    private static final class Remover extends AtomicBoolean
        implements Subscription
    {

        private static final long serialVersionUID = 0x36e5888d681586eL;
        final CompositeSubscription parent;
        final ScheduledAction s;

        public boolean isUnsubscribed()
        {
            return s.isUnsubscribed();
        }

        public void unsubscribe()
        {
            if (compareAndSet(false, true))
            {
                parent.remove(s);
            }
        }

        public Remover(ScheduledAction scheduledaction, CompositeSubscription compositesubscription)
        {
            s = scheduledaction;
            parent = compositesubscription;
        }
    }

    private static final class Remover2 extends AtomicBoolean
        implements Subscription
    {

        private static final long serialVersionUID = 0x36e5888d681586eL;
        final SubscriptionList parent;
        final ScheduledAction s;

        public boolean isUnsubscribed()
        {
            return s.isUnsubscribed();
        }

        public void unsubscribe()
        {
            if (compareAndSet(false, true))
            {
                parent.remove(s);
            }
        }

        public Remover2(ScheduledAction scheduledaction, SubscriptionList subscriptionlist)
        {
            s = scheduledaction;
            parent = subscriptionlist;
        }
    }


    private static final long serialVersionUID = 0xc902baa90878364fL;
    final Action0 action;
    final SubscriptionList cancel;

    public ScheduledAction(Action0 action0)
    {
        action = action0;
        cancel = new SubscriptionList();
    }

    public ScheduledAction(Action0 action0, SubscriptionList subscriptionlist)
    {
        action = action0;
        cancel = new SubscriptionList(new Remover2(this, subscriptionlist));
    }

    public ScheduledAction(Action0 action0, CompositeSubscription compositesubscription)
    {
        action = action0;
        cancel = new SubscriptionList(new Remover(this, compositesubscription));
    }

    public void add(Future future)
    {
        cancel.add(new FutureCompleter(future));
    }

    public void add(Subscription subscription)
    {
        cancel.add(subscription);
    }

    public void addParent(SubscriptionList subscriptionlist)
    {
        cancel.add(new Remover2(this, subscriptionlist));
    }

    public void addParent(CompositeSubscription compositesubscription)
    {
        cancel.add(new Remover(this, compositesubscription));
    }

    public boolean isUnsubscribed()
    {
        return cancel.isUnsubscribed();
    }

    public void run()
    {
        lazySet(Thread.currentThread());
        action.call();
        unsubscribe();
        return;
        Object obj;
        obj;
        if (!(obj instanceof OnErrorNotImplementedException))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", ((Throwable) (obj)));
_L1:
        RxJavaPlugins.getInstance().getErrorHandler().handleError(((Throwable) (obj)));
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, ((Throwable) (obj)));
        unsubscribe();
        return;
        obj = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", ((Throwable) (obj)));
          goto _L1
        obj;
        unsubscribe();
        throw obj;
    }

    public void unsubscribe()
    {
        if (!cancel.isUnsubscribed())
        {
            cancel.unsubscribe();
        }
    }
}
