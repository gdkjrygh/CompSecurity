// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Observable, Subscriber

private static class _cls1.val.exception extends Observable
{

    public _cls1.val.exception(final Throwable exception)
    {
        super(new Observable.OnSubscribe() {

            final Throwable val$exception;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subscriber.onError(exception);
            }

            
            {
                exception = throwable;
                super();
            }
        });
    }
}
