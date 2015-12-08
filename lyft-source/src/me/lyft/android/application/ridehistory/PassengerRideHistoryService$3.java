// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ridehistory;

import me.lyft.android.domain.ridehistory.IPassengerRideHistoryMapper;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryDetails;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDetailsDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ridehistory:
//            PassengerRideHistoryService

class this._cls0
    implements Func1
{

    final PassengerRideHistoryService this$0;

    public volatile Object call(Object obj)
    {
        return call((PassengerRideHistoryDetailsDTO)obj);
    }

    public PassengerRideHistoryDetails call(PassengerRideHistoryDetailsDTO passengerridehistorydetailsdto)
    {
        return PassengerRideHistoryService.access$100(PassengerRideHistoryService.this).fromDTO(passengerridehistorydetailsdto);
    }

    tailsDTO()
    {
        this$0 = PassengerRideHistoryService.this;
        super();
    }
}
