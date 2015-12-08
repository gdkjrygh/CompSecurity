// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

final class <init> extends Subscriber
{

    private final request producer;

    public void onCompleted()
    {
        producer.ompleted();
    }

    public void onError(Throwable throwable)
    {
        producer.rror(throwable);
    }

    public void onNext(Object obj)
    {
        producer.ext(obj);
    }

    public void onStart()
    {
        request(0L);
    }

    void requestMore(long l)
    {
        request(l);
    }

    private I(I i)
    {
        producer = i;
    }

    producer(producer producer1, producer producer2)
    {
        this(producer1);
    }
}
