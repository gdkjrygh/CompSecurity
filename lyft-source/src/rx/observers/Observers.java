// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

public final class Observers
{

    private static final Observer EMPTY = new Observer() {

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            throw new OnErrorNotImplementedException(throwable);
        }

        public final void onNext(Object obj)
        {
        }

    };

    private Observers()
    {
        throw new IllegalStateException("No instances!");
    }

    public static final Observer create(final Action1 onNext)
    {
        if (onNext == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        } else
        {
            return new Observer() {

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

    public static final Observer create(final Action1 onNext, final Action1 onError)
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
            return new Observer() {

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

    public static final Observer create(final Action1 onNext, final Action1 onError, final Action0 onComplete)
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
            return new Observer() {

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

    public static Observer empty()
    {
        return EMPTY;
    }

}
