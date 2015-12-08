// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.Set;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRideExpense;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import rx.Observable;

public interface IPassengerRideService
{

    public abstract Observable cancelRide(CancellationOption cancellationoption, int i);

    public abstract Observable rateAndDonateDriver(Integer integer, String s, Set set, PassengerRideExpense passengerrideexpense);

    public abstract Observable setDropoff(Location location);

    public abstract Observable shareRoute();

    public abstract Observable updateStandby(FixedFare fixedfare);
}
