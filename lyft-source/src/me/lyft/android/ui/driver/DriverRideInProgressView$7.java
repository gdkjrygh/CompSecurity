// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;
import rx.functions.Func0;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements Action1
{

    final DriverRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        boolean flag1 = true;
        DriverRideInProgressView.access$202(DriverRideInProgressView.this, driverride);
        DriverRideInProgressView.access$102(DriverRideInProgressView.this, driverride.getCurrentStop());
        DriverRideInProgressView.access$002(DriverRideInProgressView.this, driverride.getCurrentPassenger());
        DriverRideInProgressView.access$2900(DriverRideInProgressView.this).onNext((new Func0() {

            final DriverRideInProgressView._cls7 this$1;

            public Boolean call()
            {
                return Boolean.valueOf(DriverRideInProgressView.access$100(this$0).isPickup());
            }

            public volatile Object call()
            {
                return call();
            }

            
            {
                this$1 = DriverRideInProgressView._cls7.this;
                super();
            }
        }).call());
        DriverRideInProgressView.access$1100(DriverRideInProgressView.this).onNext(Boolean.valueOf(DriverRideInProgressView.access$100(DriverRideInProgressView.this).isInGeofence()));
        DriverRideInProgressView.access$2400(DriverRideInProgressView.this).onNext(driverride.getStatus().toString());
        if (DriverRideInProgressView.access$100(DriverRideInProgressView.this).isDropOff())
        {
            DriverRideInProgressView.access$3000(DriverRideInProgressView.this).onNext(DriverRideInProgressView.access$100(DriverRideInProgressView.this).getLocation());
        }
        DriverRideInProgressView.access$1800(DriverRideInProgressView.this).onNext(DriverRideInProgressView.access$100(DriverRideInProgressView.this).getRideId());
        ReactiveProperty reactiveproperty = DriverRideInProgressView.access$3100(DriverRideInProgressView.this);
        boolean flag;
        if (driverride.isAccepted() && DriverRideInProgressView.access$100(DriverRideInProgressView.this).isInGeofence())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        reactiveproperty.onNext(Boolean.valueOf(flag));
        reactiveproperty = DriverRideInProgressView.access$3200(DriverRideInProgressView.this);
        if (driverride.isAccepted() && !DriverRideInProgressView.access$100(DriverRideInProgressView.this).isInGeofence())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        reactiveproperty.onNext(Boolean.valueOf(flag));
        DriverRideInProgressView.access$2600(DriverRideInProgressView.this).onNext(Boolean.valueOf(driverride.isAccepted()));
        DriverRideInProgressView.access$600(DriverRideInProgressView.this).onNext(Boolean.valueOf(driverride.isCourier()));
        DriverRideInProgressView.access$700(DriverRideInProgressView.this).onNext(Boolean.valueOf(DriverRideInProgressView.access$100(DriverRideInProgressView.this).isDropOff()));
        DriverRideInProgressView.access$3300(DriverRideInProgressView.this).onNext(driverride.getIncompleteStops());
        DriverRideInProgressView.access$2800(DriverRideInProgressView.this).onNext(DriverRideInProgressView.access$000(DriverRideInProgressView.this).getPhotoUrl());
        DriverRideInProgressView.access$1900(DriverRideInProgressView.this).onNext(DriverRideInProgressView.access$100(DriverRideInProgressView.this));
        DriverRideInProgressView.access$3400(DriverRideInProgressView.this);
        DriverRideInProgressView.access$3500(DriverRideInProgressView.this);
        DriverRideInProgressView.access$3600(DriverRideInProgressView.this);
    }

    _cls1.this._cls1()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
