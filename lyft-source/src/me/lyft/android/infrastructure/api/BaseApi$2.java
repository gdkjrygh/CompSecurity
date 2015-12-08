// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.api;

import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.api:
//            BaseApi

class val.clazz
    implements rx..OnSubscribe
{

    final BaseApi this$0;
    final Class val$clazz;
    final com.squareup.okhttp.ilder val$requestBuilder;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            com.squareup.okhttp.Request request = val$requestBuilder.build();
            subscriber.onNext(BaseApi.access$100(BaseApi.this, request, val$clazz));
            subscriber.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    ()
    {
        this$0 = final_baseapi;
        val$requestBuilder = ilder;
        val$clazz = Class.this;
        super();
    }
}
