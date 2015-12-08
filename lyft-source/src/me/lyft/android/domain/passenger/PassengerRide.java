// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.domain.ride.Stop;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.passenger:
//            Driver

public class PassengerRide
    implements INullable
{

    private int cancelPenalty;
    private Driver driver;
    private Location dropoff;
    private boolean hideLocationMarker;
    private String id;
    private List passengers;
    private Location pickup;
    private RideStatus status;
    private List stops;
    private RideType type;
    private int waitEstimateInSec;

    public PassengerRide(String s, Driver driver1, RideType ridetype, RideStatus ridestatus, Location location, Location location1, List list, 
            List list1, int i, boolean flag, int j)
    {
        id = s;
        driver = driver1;
        type = ridetype;
        status = ridestatus;
        pickup = location;
        dropoff = location1;
        stops = list;
        passengers = list1;
        cancelPenalty = i;
        hideLocationMarker = flag;
        waitEstimateInSec = j;
    }

    public static PassengerRide empty()
    {
        return NullPassengerRide.getInstance();
    }

    public int getCancelPenalty()
    {
        return cancelPenalty;
    }

    public Stop getCurrentStop()
    {
        return (Stop)Iterables.firstOrDefault(getStops(), Stop.empty());
    }

    public Driver getDriver()
    {
        return driver;
    }

    public Location getDropoff()
    {
        return (Location)Objects.firstNonNull(dropoff, NullLocation.getInstance());
    }

    public String getId()
    {
        return (String)Objects.firstNonNull(id, "");
    }

    public List getPassengers()
    {
        return passengers;
    }

    public Location getPickup()
    {
        return (Location)Objects.firstNonNull(pickup, NullLocation.getInstance());
    }

    public RideType getRideType()
    {
        return type;
    }

    public Passenger getSelf()
    {
        return (Passenger)Iterables.firstOrDefault(passengers, new Func1() {

            final PassengerRide this$0;

            public Boolean call(Passenger passenger)
            {
                return Boolean.valueOf(passenger.isSelf());
            }

            public volatile Object call(Object obj)
            {
                return call((Passenger)obj);
            }

            
            {
                this$0 = PassengerRide.this;
                super();
            }
        }, Passenger.empty());
    }

    public RideStatus getStatus()
    {
        return status;
    }

    public List getStops()
    {
        return Iterables.where(stops, new Func1() {

            final PassengerRide this$0;

            public Boolean call(Stop stop)
            {
                boolean flag;
                if (!stop.isCompleted())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

            
            {
                this$0 = PassengerRide.this;
                super();
            }
        });
    }

    public List getStopsBeforeDropoff()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getStops().iterator();
        Stop stop;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stop = (Stop)iterator.next();
            arraylist.add(stop);
        } while (!stop.isDropOff() || !stop.getPassenger().isSelf());
        return arraylist;
    }

    public List getStopsBeforePickup()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getStops().iterator();
        Stop stop;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stop = (Stop)iterator.next();
            arraylist.add(stop);
        } while (!stop.isPickup() || !stop.getPassenger().isSelf());
        return arraylist;
    }

    public int getWaitEstimateInSec()
    {
        return waitEstimateInSec;
    }

    public Boolean isAccepted()
    {
        return Boolean.valueOf(getStatus().isAccepted());
    }

    public Boolean isArrived()
    {
        return Boolean.valueOf(getStatus().isArrived());
    }

    public boolean isCourier()
    {
        return getRideType().isCourier();
    }

    public boolean isNull()
    {
        return false;
    }

    public Boolean isPickedUp()
    {
        return Boolean.valueOf(getStatus().isPickedUp());
    }

    public boolean shouldHideLocationMarker()
    {
        return hideLocationMarker;
    }

    private class NullPassengerRide extends PassengerRide
    {

        private static final PassengerRide INSTANCE = new NullPassengerRide();

        public static PassengerRide getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullPassengerRide()
        {
            super("", Driver.empty(), RideType.empty(), RideStatus.empty(), NullLocation.getInstance(), NullLocation.getInstance(), Collections.emptyList(), Collections.emptyList(), 0, false, 0);
        }
    }

}
