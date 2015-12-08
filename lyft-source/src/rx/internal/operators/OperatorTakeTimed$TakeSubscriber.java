// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

final class child extends Subscriber
    implements Action0
{

    final Subscriber child;

    public void call()
    {
        onCompleted();
    }

    public void onCompleted()
    {
        child.onCompleted();
        unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
        unsubscribe();
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
    }

    public (Subscriber subscriber)
    {
        super(subscriber);
        child = subscriber;
    }
}
