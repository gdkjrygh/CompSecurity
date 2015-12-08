// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.controls.RideSwitcherItem;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((RideSwitcherItem)obj);
    }

    public void call(RideSwitcherItem rideswitcheritem)
    {
        rideRequestSession.setCurrentRideTypeById(rideswitcheritem.getId());
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
