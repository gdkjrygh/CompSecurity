// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            AssetLoadingService

class val.fileName
    implements rx.
{

    final AssetLoadingService this$0;
    final String val$fileName;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            subscriber.onNext(AssetLoadingService.access$000(AssetLoadingService.this, val$fileName));
            subscriber.onCompleted();
            return;
        }
        catch (Exception exception)
        {
            subscriber.onError(exception);
        }
    }

    A()
    {
        this$0 = final_assetloadingservice;
        val$fileName = String.this;
        super();
    }
}
