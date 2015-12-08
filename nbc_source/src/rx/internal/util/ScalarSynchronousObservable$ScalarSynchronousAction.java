// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.util:
//            ScalarSynchronousObservable

static final class <init>
    implements Action0
{

    private final Subscriber subscriber;
    private final Object value;

    public void call()
    {
        try
        {
            subscriber.onNext(value);
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
            return;
        }
        subscriber.onCompleted();
    }

    private (Subscriber subscriber1, Object obj)
    {
        subscriber = subscriber1;
        value = obj;
    }

    value(Subscriber subscriber1, Object obj, value value1)
    {
        this(subscriber1, obj);
    }
}
