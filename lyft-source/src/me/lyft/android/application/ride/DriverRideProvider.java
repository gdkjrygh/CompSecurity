// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.RouteEqualityComparator;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.ride:
//            IDriverRideProvider

public class DriverRideProvider
    implements IDriverRideProvider
{

    private ILyftPreferences preferences;
    private ReactiveProperty routeSubject;

    public DriverRideProvider(ILyftPreferences ilyftpreferences)
    {
        routeSubject = ReactiveProperty.create(DriverRide.empty());
        preferences = ilyftpreferences;
        routeSubject.setEqualityComparator(new RouteEqualityComparator());
    }

    public void clearRoute()
    {
        preferences.setIgnoreRideId(((DriverRide)routeSubject.get()).getCurrentRideId());
        routeSubject.onNext(DriverRide.empty());
    }

    public DriverRide getDriverRide()
    {
        return (DriverRide)Objects.firstNonNull(routeSubject.get(), DriverRide.empty());
    }

    public String getIgnoreRideId()
    {
        return preferences.getIgnoreRideId();
    }

    public Observable observeRide()
    {
        return routeSubject.asObservable();
    }

    public void setIgnoreRideId(String s)
    {
        preferences.setIgnoreRideId(s);
    }

    public void updateRide(DriverRide driverride)
    {
        routeSubject.onNext(driverride);
    }
}
