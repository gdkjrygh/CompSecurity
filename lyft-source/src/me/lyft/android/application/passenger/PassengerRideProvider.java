// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.passenger;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.passenger:
//            IPassengerRideProvider

public class PassengerRideProvider
    implements IPassengerRideProvider
{

    private ReactiveProperty passengerRideSubject;
    private ReactiveProperty stopsSubject;

    public PassengerRideProvider()
    {
        passengerRideSubject = ReactiveProperty.create(PassengerRide.empty());
        stopsSubject = ReactiveProperty.create(Collections.emptyList());
    }

    public static Stop findDropoffStopForPassenger(String s, List list)
    {
        return (Stop)Iterables.firstOrDefault(findStopsForPassenger(s, list), new Func1() {

            public Boolean call(Stop stop)
            {
                return Boolean.valueOf(stop.isDropOff());
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

        }, Stop.empty());
    }

    public static Stop findPickupStopForPassenger(String s, List list)
    {
        return (Stop)Iterables.firstOrDefault(findStopsForPassenger(s, list), new Func1() {

            public Boolean call(Stop stop)
            {
                return Boolean.valueOf(stop.isPickup());
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

        }, Stop.empty());
    }

    public static List findStopsForPassenger(final String passengerId, List list)
    {
        return Iterables.where(list, new Func1() {

            final String val$passengerId;

            public Boolean call(Stop stop)
            {
                return Boolean.valueOf(Objects.equals(passengerId, stop.getPassenger().getId()));
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

            
            {
                passengerId = s;
                super();
            }
        });
    }

    public PassengerRide getPassengerRide()
    {
        return (PassengerRide)passengerRideSubject.get();
    }

    public Observable observeRideUpdateEvent()
    {
        return passengerRideSubject.map(Unit.func1());
    }

    public Observable observeStopsChange()
    {
        return stopsSubject.asObservable();
    }

    public void updatePassengerRide(PassengerRide passengerride)
    {
        stopsSubject.onNext(passengerride.getStops());
        passengerRideSubject.onNext(passengerride);
    }
}
