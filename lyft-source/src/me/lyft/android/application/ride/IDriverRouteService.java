// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import rx.Observable;

public interface IDriverRouteService
{

    public abstract Observable acceptRoute();

    public abstract Observable arrive(Stop stop, String s);

    public abstract Observable cancelRoute(CancellationOption cancellationoption);

    public abstract Observable clearRoute();

    public abstract Observable dropoff(Passenger passenger);

    public abstract Observable enterLastRide();

    public abstract Observable exitLastRide();

    public abstract Observable lapseRoute(boolean flag);

    public abstract Observable pickup(Passenger passenger, int i);

    public abstract Observable rate(Passenger passenger, int i, String s);

    public abstract Observable setDropoff(Location location);

    public abstract Observable skipNoShow(Passenger passenger);

    public abstract Observable skipWrongPartySize(Passenger passenger, int i);
}
