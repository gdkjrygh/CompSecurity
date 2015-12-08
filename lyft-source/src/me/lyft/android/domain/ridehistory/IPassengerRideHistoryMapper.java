// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDetailsDTO;

// Referenced classes of package me.lyft.android.domain.ridehistory:
//            PassengerRideHistory, PassengerRideHistoryDetails

public interface IPassengerRideHistoryMapper
{

    public abstract PassengerRideHistory fromDTO(PassengerRideHistoryDTO passengerridehistorydto);

    public abstract PassengerRideHistoryDetails fromDTO(PassengerRideHistoryDetailsDTO passengerridehistorydetailsdto);
}
