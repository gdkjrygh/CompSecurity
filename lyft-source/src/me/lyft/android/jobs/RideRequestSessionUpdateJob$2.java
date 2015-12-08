// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.jobs:
//            RideRequestSessionUpdateJob

class this._cls0 extends SimpleSubscriber
{

    final RideRequestSessionUpdateJob this$0;

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        if (!Strings.isNullOrEmpty(RideRequestSessionUpdateJob.access$000(RideRequestSessionUpdateJob.this)))
        {
            rideRequestSession.setCurrentRideTypeById(RideRequestSessionUpdateJob.access$000(RideRequestSessionUpdateJob.this));
        }
        if (RideRequestSessionUpdateJob.access$100(RideRequestSessionUpdateJob.this).isNull()) goto _L2; else goto _L1
_L1:
        rideRequestSession.setPickupLocation(RideRequestSessionUpdateJob.access$100(RideRequestSessionUpdateJob.this));
_L4:
        if (!RideRequestSessionUpdateJob.access$200(RideRequestSessionUpdateJob.this).isNull())
        {
            if (rideRequestSession.getPickupLocation().isNull())
            {
                rideRequestSession.setPickupLocation(location);
            }
            rideRequestSession.setDropoffLocation(RideRequestSessionUpdateJob.access$200(RideRequestSessionUpdateJob.this));
        }
        rideRequestSession.setRideStep(RideRequestSessionUpdateJob.access$300(RideRequestSessionUpdateJob.this));
        rideRequestSession.setRequestRideStep(RideRequestSessionUpdateJob.access$400(RideRequestSessionUpdateJob.this));
        appFlow.resetTo(new me.lyft.android.ui.appFlow());
        return;
_L2:
        if (rideRequestSession.getPickupLocation().isNull())
        {
            rideRequestSession.setPickupLocation(location);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    n()
    {
        this$0 = RideRequestSessionUpdateJob.this;
        super();
    }
}
