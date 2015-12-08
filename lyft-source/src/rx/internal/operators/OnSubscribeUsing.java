// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Arrays;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observers.Subscribers;

public final class OnSubscribeUsing
    implements rx.Observable.OnSubscribe
{

    private final Action1 dispose;
    private final boolean disposeEagerly;
    private final Func1 observableFactory;
    private final Func0 resourceFactory;

    public OnSubscribeUsing(Func0 func0, Func1 func1, Action1 action1, boolean flag)
    {
        resourceFactory = func0;
        observableFactory = func1;
        dispose = action1;
        disposeEagerly = flag;
    }

    private Throwable disposeEagerlyIfRequested(Action0 action0)
    {
        if (disposeEagerly)
        {
            try
            {
                action0.call();
            }
            // Misplaced declaration of an exception variable
            catch (Action0 action0)
            {
                return action0;
            }
        }
        return null;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj1;
        DisposeAction disposeaction;
        Object obj = resourceFactory.call();
        disposeaction = new DisposeAction(dispose, obj);
        subscriber.add(disposeaction);
        obj1 = (Observable)observableFactory.call(obj);
        Observable observable = ((Observable) (obj1));
        if (disposeEagerly)
        {
            observable = ((Observable) (obj1)).doOnTerminate(disposeaction);
        }
        observable.unsafeSubscribe(Subscribers.wrap(subscriber));
        return;
        Throwable throwable;
        throwable;
        obj1 = disposeEagerlyIfRequested(disposeaction);
        if (obj1 != null)
        {
            try
            {
                subscriber.onError(new CompositeException(Arrays.asList(new Throwable[] {
                    throwable, obj1
                })));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                subscriber.onError(throwable);
            }
            return;
        }
        subscriber.onError(throwable);
        return;
    }

    private class DisposeAction extends AtomicBoolean
        implements Subscription, Action0
    {

        private static final long serialVersionUID = 0x3b28c647329bb8ccL;
        private Action1 dispose;
        private Object resource;

        public void call()
        {
            if (!compareAndSet(false, true))
            {
                break MISSING_BLOCK_LABEL_32;
            }
            dispose.call(resource);
            resource = null;
            dispose = null;
            return;
            Exception exception;
            exception;
            resource = null;
            dispose = null;
            throw exception;
        }

        public boolean isUnsubscribed()
        {
            return get();
        }

        public void unsubscribe()
        {
            call();
        }

        private DisposeAction(Action1 action1, Object obj)
        {
            dispose = action1;
            resource = obj;
            lazySet(false);
        }

    }

}
