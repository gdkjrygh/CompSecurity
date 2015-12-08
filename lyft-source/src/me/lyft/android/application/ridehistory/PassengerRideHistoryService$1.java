// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ridehistory;

import java.util.List;
import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ridehistory:
//            PassengerRideHistoryService

class this._cls0
    implements Action1
{

    final PassengerRideHistoryService this$0;

    public volatile void call(Object obj)
    {
        call((PassengerRideHistory)obj);
    }

    public void call(PassengerRideHistory passengerridehistory)
    {
        PassengerRideHistoryService.access$000(PassengerRideHistoryService.this).getRideHistory().addAll(passengerridehistory.getRideHistory());
        PassengerRideHistoryService.access$000(PassengerRideHistoryService.this).setHasMore(passengerridehistory.hasMore());
        PassengerRideHistoryService.access$000(PassengerRideHistoryService.this).setLimit(passengerridehistory.getLimit());
        PassengerRideHistoryService.access$000(PassengerRideHistoryService.this).setOffset(passengerridehistory.getOffset());
    }

    ()
    {
        this$0 = PassengerRideHistoryService.this;
        super();
    }
}
