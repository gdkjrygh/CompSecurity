// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

// Referenced classes of package rx.observers:
//            Observers

public final class Subscribers
{

    private Subscribers()
    {
        throw new IllegalStateException("No instances!");
    }

    public static final Subscriber create(final Action1 onNext)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        } else
        {
            return new Subscriber() {

                final Action1 val$onNext;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    throw new OnErrorNotImplementedException(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                onNext = action1;
                super();
            }
            };
        }
    }

    public static final Subscriber create(final Action1 onNext, final Action1 onError)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (onError == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        } else
        {
            return new Subscriber() {

                final Action1 val$onError;
                final Action1 val$onNext;

                public final void onCompleted()
                {
                }

                public final void onError(Throwable throwable)
                {
                    onError.call(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                onError = action1;
                onNext = action1_1;
                super();
            }
            };
        }
    }

    public static final Subscriber create(final Action1 onNext, final Action1 onError, final Action0 onComplete)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (onError == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (onComplete == null)
        {
            throw new IllegalArgumentException("onComplete can not be null");
        } else
        {
            return new Subscriber() {

                final Action0 val$onComplete;
                final Action1 val$onError;
                final Action1 val$onNext;

                public final void onCompleted()
                {
                    onComplete.call();
                }

                public final void onError(Throwable throwable)
                {
                    onError.call(throwable);
                }

                public final void onNext(Object obj)
                {
                    onNext.call(obj);
                }

            
            {
                onComplete = action0;
                onError = action1;
                onNext = action1_1;
                super();
            }
            };
        }
    }

    public static Subscriber empty()
    {
        return from(Observers.empty());
    }

    public static Subscriber from(final Observer o)
    {
        return new Subscriber() {

            final Observer val$o;

            public void onCompleted()
            {
                o.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                o.onError(throwable);
            }

            public void onNext(Object obj)
            {
                o.onNext(obj);
            }

            
            {
                o = observer;
                super();
            }
        };
    }

    public static Subscriber wrap(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            final Subscriber val$subscriber;

            public void onCompleted()
            {
                subscriber.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                subscriber.onNext(obj);
            }

            
            {
                subscriber = subscriber2;
                super(final_subscriber1);
            }
        };
    }
}
