// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.common.Unit;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.application.polling:
//            LocationUpdateService

class this._cls0
    implements rx..polling.LocationUpdateService._cls1
{

    final LocationUpdateService this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            updateLocationSync();
            subscriber.onNext(Unit.create());
            subscriber.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    A()
    {
        this$0 = LocationUpdateService.this;
        super();
    }
}
