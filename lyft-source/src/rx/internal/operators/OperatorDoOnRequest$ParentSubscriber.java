// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

final class <init> extends Subscriber
{

    private final Subscriber child;

    private void requestMore(long l)
    {
        request(l);
    }

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
        child.onNext(obj);
    }


    private (Subscriber subscriber)
    {
        child = subscriber;
    }

    child(Subscriber subscriber, child child1)
    {
        this(subscriber);
    }
}
