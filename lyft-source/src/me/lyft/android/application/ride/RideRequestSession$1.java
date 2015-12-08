// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestSession

class this._cls0 extends SimpleSubscriber
{

    final RideRequestSession this$0;

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        location.setSource("defaultLocation");
        setPickupLocation(location);
    }

    ()
    {
        this$0 = RideRequestSession.this;
        super();
    }
}
