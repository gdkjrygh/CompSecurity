// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.Money;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            Route, Stop, Passenger, RideType, 
//            RideStatus

public class DriverRide
    implements INullable
{

    public static final long DEFAULT_LAPSE_TIMER_SECONDS = 15L;
    private String currentRideId;
    private Long eta;
    private boolean isTrainingRide;
    private long lapseTimerSeconds;
    private int primeTimePercent;
    private Money profitMinusTip;
    private List routes;
    private boolean showEndRideConfirmation;
    private boolean showHints;
    private RideStatus status;
    private RideType type;

    public DriverRide(List list, RideStatus ridestatus, RideType ridetype, Long long1, String s, boolean flag, long l, int i, Money money, boolean flag1, boolean flag2)
    {
        routes = list;
        status = ridestatus;
        type = ridetype;
        eta = long1;
        currentRideId = s;
        showHints = flag;
        lapseTimerSeconds = l;
        primeTimePercent = i;
        profitMinusTip = money;
        isTrainingRide = flag1;
        showEndRideConfirmation = flag2;
    }

    public static DriverRide empty()
    {
        return NullDriverRide.INSTANCE;
    }

    private Stop firstStop()
    {
        return ((Route)routes.get(0)).getFirstStop();
    }

    private Stop lastStop()
    {
        return ((Route)routes.get(routes.size() - 1)).getLastStop();
    }

    public Stop findDropoffStopForPassenger(String s)
    {
        for (Iterator iterator = getStopsFromCurrentRoute().iterator(); iterator.hasNext();)
        {
            Stop stop = (Stop)iterator.next();
            if (stop.isDropOff() && Objects.equals(stop.getPassenger().getId(), s))
            {
                return stop;
            }
        }

        return Stop.empty();
    }

    public Stop findPickupStopForPassenger(String s)
    {
        for (Iterator iterator = getStopsFromCurrentRoute().iterator(); iterator.hasNext();)
        {
            Stop stop = (Stop)iterator.next();
            if (stop.isPickup() && Objects.equals(stop.getPassenger().getId(), s))
            {
                return stop;
            }
        }

        return Stop.empty();
    }

    public List getAllPassengers()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = routes.iterator(); iterator.hasNext(); arraylist.addAll(((Route)iterator.next()).getPassengers())) { }
        return arraylist;
    }

    public List getAllStops()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = routes.iterator(); iterator.hasNext(); arraylist.addAll(((Route)iterator.next()).getStops())) { }
        return arraylist;
    }

    public Passenger getCurrentPassenger()
    {
        return getCurrentStop().getPassenger();
    }

    public String getCurrentRideId()
    {
        return currentRideId;
    }

    public List getCurrentRouteNotDroppedOffPassengers()
    {
        return Iterables.where(((Route)routes.get(0)).getPassengers(), new Func1() {

            final DriverRide this$0;

            public Boolean call(Passenger passenger)
            {
                boolean flag;
                if (!passenger.isDroppedoff())
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
                return call((Passenger)obj);
            }

            
            {
                this$0 = DriverRide.this;
                super();
            }
        });
    }

    public Stop getCurrentStop()
    {
        if (getIncompleteStops().size() > 0)
        {
            return (Stop)getIncompleteStops().get(0);
        } else
        {
            return Stop.empty();
        }
    }

    public Long getEta()
    {
        return eta;
    }

    public List getIncompleteStops()
    {
        return ((Route)routes.get(0)).getIncompleteStops();
    }

    public long getLapseTimerSeconds()
    {
        return lapseTimerSeconds;
    }

    public List getNotDroppedOffPassengers()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = routes.iterator(); iterator.hasNext(); arraylist.addAll(Iterables.where(((Route)iterator.next()).getPassengers(), new Func1() {

        final DriverRide this$0;

        public Boolean call(Passenger passenger)
        {
            boolean flag;
            if (!passenger.isDroppedoff())
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
            return call((Passenger)obj);
        }

            
            {
                this$0 = DriverRide.this;
                super();
            }
    }))) { }
        return arraylist;
    }

    public List getPassengersFromCurrentRoute()
    {
        if (routes.isEmpty())
        {
            return Collections.emptyList();
        } else
        {
            return ((Route)routes.get(0)).getPassengers();
        }
    }

    public List getPassengersFromNextRoute()
    {
        if (routes.size() > 1)
        {
            return ((Route)routes.get(1)).getPassengers();
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getPickupStops()
    {
        return Iterables.where(((Route)routes.get(0)).getStops(), new Func1() {

            final DriverRide this$0;

            public Boolean call(Stop stop)
            {
                return Boolean.valueOf(stop.isPickup());
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

            
            {
                this$0 = DriverRide.this;
                super();
            }
        });
    }

    public int getPrimeTimePercent()
    {
        return primeTimePercent;
    }

    public Money getProfitMinusTip()
    {
        return profitMinusTip;
    }

    public List getQueuedRoutes()
    {
        return Iterables.skip(routes, 1);
    }

    public List getRoutes()
    {
        return routes;
    }

    public RideStatus getStatus()
    {
        return status;
    }

    public List getStopsFromCurrentRoute()
    {
        if (routes.isEmpty())
        {
            return Collections.emptyList();
        } else
        {
            return ((Route)routes.get(0)).getStops();
        }
    }

    public RideType getType()
    {
        return (RideType)Objects.firstNonNull(type, RideType.empty());
    }

    public Passenger getUnratedPassenger()
    {
        for (Iterator iterator = getPassengersFromCurrentRoute().iterator(); iterator.hasNext();)
        {
            Passenger passenger = (Passenger)iterator.next();
            if (!passenger.isRatingCompleted())
            {
                return passenger;
            }
        }

        return Passenger.empty();
    }

    public boolean isAccepted()
    {
        return getStatus().isAccepted();
    }

    public boolean isActive()
    {
        return getStatus().isActive();
    }

    public boolean isArrived()
    {
        return getStatus().isArrived();
    }

    public boolean isCourier()
    {
        return getType().isCourier();
    }

    public boolean isCurrentStop(Stop stop)
    {
        return getCurrentStop().equals(stop);
    }

    public boolean isDroppedOff()
    {
        return getStatus().isDroppedOff();
    }

    public boolean isDroppingOffPassenger()
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (isCourier() && isPickedUp())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!isCourier() && (isArrived() || isPickedUp()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    public boolean isFirstStop(Stop stop)
    {
        return firstStop().equals(stop);
    }

    public boolean isInProgress()
    {
        return getStatus().isInProgress();
    }

    public boolean isLastStop(Stop stop)
    {
        return lastStop().equals(stop);
    }

    public boolean isLastStopInRoute(Stop stop)
    {
        for (Iterator iterator = routes.iterator(); iterator.hasNext();)
        {
            if (((Route)iterator.next()).getLastStop().equals(stop))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPending()
    {
        return getStatus().isPending();
    }

    public boolean isPickedUp()
    {
        return getStatus().isPickedUp();
    }

    public boolean isPlus()
    {
        return getType().isPlus();
    }

    public boolean isTrainingRide()
    {
        return isTrainingRide;
    }

    public boolean showEndRideConfirmation()
    {
        return showEndRideConfirmation;
    }

    public boolean showHints()
    {
        return showHints;
    }

    private class NullDriverRide extends DriverRide
    {

        private static DriverRide INSTANCE = new NullDriverRide();

        public List getIncompleteStops()
        {
            return Collections.emptyList();
        }

        public boolean isNull()
        {
            return true;
        }



        private NullDriverRide()
        {
            super(Collections.emptyList(), RideStatus.empty(), RideType.empty(), null, "", false, 0L, 0, null, false, false);
        }
    }

}
