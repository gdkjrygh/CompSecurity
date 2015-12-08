// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.FuncN;

final class combinator extends Subscriber
{

    private final Subscriber child;
    private final FuncN combinator;

    public void onCompleted()
    {
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        child.onNext(combinator.call(new Object[] {
            obj
        }));
    }

    public void requestMore(long l)
    {
        request(l);
    }

    (Subscriber subscriber, FuncN funcn)
    {
        super(subscriber);
        child = subscriber;
        combinator = funcn;
    }
}
