// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.domain.location.Location;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Subscription;

// Referenced classes of package me.lyft.android.application.polling:
//            PollingService, ILocationUpdateService

class this._cls0 extends SimpleSubscriber
{

    final PollingService this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        L.e(throwable, "location update failed in api poller", new Object[0]);
        PollingService.access$300(PollingService.this).unsubscribe();
    }

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        locationUpdateService.addLocationToHistory(location);
    }

    rvice()
    {
        this$0 = PollingService.this;
        super();
    }
}
