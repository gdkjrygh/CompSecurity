// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Action1
{

    final PassengerCourierRideMatchingView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        int i = passengerRideProvider.getPassengerRide().getWaitEstimateInSec();
        PassengerCourierRideMatchingView.access$100(PassengerCourierRideMatchingView.this).onNext(Integer.valueOf(i));
        PassengerCourierRideMatchingView.access$200(PassengerCourierRideMatchingView.this, preRideInfoRepository.getPreRideInfo().getFares());
        PassengerCourierRideMatchingView.access$400(PassengerCourierRideMatchingView.this).onNext(PassengerCourierRideMatchingView.access$300(PassengerCourierRideMatchingView.this).getFixedFareToken());
    }

    ()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
