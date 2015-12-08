// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RouteDTO;
import me.lyft.android.infrastructure.lyft.ride.StopDTO;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, RideType, RouteValidator, Passenger, 
//            Route, Stop, RideStatus

public class DriverRideMapper
{

    public static final String STOP_TYPE_DROPOFF = "dropoff";
    public static final String STOP_TYPE_PICKUP = "pickup";

    public DriverRideMapper()
    {
    }

    public static DriverRide createDriverRide(RideDTO ridedto)
    {
        if (ridedto == null)
        {
            return DriverRide.empty();
        }
        RideType ridetype = RideType.getInstance(ridedto.getRideTypeId());
        me.lyft.android.domain.payment.Money money;
        String s;
        int i;
        long l;
        boolean flag;
        if (ridedto.showDriverHints() == null)
        {
            flag = false;
        } else
        {
            flag = ridedto.showDriverHints().booleanValue();
        }
        if (ridedto.getClientTimeout() == null)
        {
            l = 15L;
        } else
        {
            l = ridedto.getClientTimeout().longValue();
        }
        if (ridedto.getDynamicPricing() == null)
        {
            i = 0;
        } else
        {
            i = ridedto.getDynamicPricing().intValue();
        }
        money = MoneyMapper.fromMoneyDTO(ridedto.getProfitMinusTip());
        s = getRideId(ridedto);
        ridedto = new DriverRide(createRoutes(ridedto, ridetype), getStatus(ridedto), ridetype, ridedto.getEta(), s, flag, l, i, money, ((Boolean)Objects.firstNonNull(ridedto.getIsTrainingRide(), Boolean.valueOf(false))).booleanValue(), ((Boolean)Objects.firstNonNull(ridedto.getShowEndRideConfirmation(), Boolean.valueOf(false))).booleanValue());
        RouteValidator.validate(ridedto);
        return ridedto;
    }

    private static Passenger createPassenger(UserDTO userdto, boolean flag, String s, List list)
    {
        if (userdto == null || userdto.isNull())
        {
            return Passenger.empty();
        }
        list = list.iterator();
        boolean flag1 = false;
        boolean flag2 = false;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            StopDTO stopdto = (StopDTO)list.next();
            if (Strings.equalsIgnoreCase(stopdto.getPassengerId(), userdto.getId()) && ((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue())
            {
                if ("pickup".equals(stopdto.getStopType()))
                {
                    flag2 = true;
                } else
                if ("dropoff".equals(stopdto.getStopType()))
                {
                    flag1 = true;
                }
            }
        } while (true);
        int i;
        boolean flag3;
        if (userdto.getPhone() != null)
        {
            list = userdto.getPhone().getNumber();
        } else
        {
            list = null;
        }
        i = ((Integer)Objects.firstNonNull(userdto.getPartySize(), Integer.valueOf(0))).intValue();
        flag3 = ((Boolean)Objects.firstNonNull(userdto.isRatingCompleted(), Boolean.valueOf(false))).booleanValue();
        list = new Passenger(userdto.getId(), false, userdto.getFirstName(), userdto.getUserPhoto(), list, i, flag2, flag1, flag3);
        list.setRideId(s);
        list.setDriverCanPenalize(flag);
        list.setRating(((Double)Objects.firstNonNull(userdto.getPassengerRating(), Double.valueOf(0.0D))).floatValue());
        return list;
    }

    private static List createPassengers(boolean flag, String s, List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(createPassenger((UserDTO)list.next(), flag, s, list1))) { }
        return arraylist;
    }

    private static Route createRoute(RouteDTO routedto, boolean flag, String s, boolean flag1, boolean flag2)
    {
        List list = createPassengers(flag, s, routedto.getPassengers(), routedto.getStops());
        return new Route(createStops(list, flag1, flag2, s, routedto.getStops()), list);
    }

    private static List createRoutes(RideDTO ridedto, RideType ridetype)
    {
        ArrayList arraylist;
        int i;
        boolean flag;
        if (ridedto.queuedRoutes != null)
        {
            i = ridedto.queuedRoutes.size() + 1;
        } else
        {
            i = 1;
        }
        arraylist = new ArrayList(i);
        flag = ((Boolean)Objects.firstNonNull(ridedto.getDriverCanPenalize(), Boolean.valueOf(false))).booleanValue();
        arraylist.add(createRoute(ridedto.getRoute(), flag, getRideId(ridedto), ridetype.isCourier(), "arrived".equalsIgnoreCase(ridedto.getStatus())));
        if (Features.QUEUED_RIDES.isEnabled() && ridedto.queuedRoutes != null)
        {
            for (ridedto = ridedto.queuedRoutes.iterator(); ridedto.hasNext(); arraylist.add(createRoute(ridetype, flag, getRideIfFromCurrentStop(ridetype), false, false)))
            {
                ridetype = (RouteDTO)ridedto.next();
            }

        }
        return arraylist;
    }

    private static Stop createStop(StopDTO stopdto, Passenger passenger, String s, boolean flag, boolean flag1)
    {
        String s1 = stopdto.getRideId();
        me.lyft.android.domain.location.Location location = LocationMapper.fromLocationDTO(stopdto.getLocation());
        Stop.Type type;
        if ("pickup".equals(stopdto.getStopType()))
        {
            type = Stop.Type.PICKUP;
        } else
        {
            type = Stop.Type.DROPOFF;
        }
        passenger = new Stop(passenger, s1, location, type, ((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue());
        passenger.setCompleted(((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue());
        if (Objects.equals(passenger.getRideId(), s))
        {
            passenger.setArrived(flag1);
        }
        if (!flag && passenger.isArrived() && passenger.isPickup())
        {
            passenger.setCompleted(true);
        }
        passenger.setInHotspot(((Boolean)Objects.firstNonNull(stopdto.getIsInHotspot(), Boolean.valueOf(false))).booleanValue());
        passenger.setInGeofence(((Boolean)Objects.firstNonNull(stopdto.getInGeoFence(), Boolean.FALSE)).booleanValue());
        return passenger;
    }

    private static List createStops(List list, boolean flag, boolean flag1, String s, List list1)
    {
        ArrayList arraylist = new ArrayList();
        StopDTO stopdto;
        for (list1 = list1.iterator(); list1.hasNext(); arraylist.add(createStop(stopdto, findPassengerById(stopdto.getPassengerId(), list), s, flag, flag1)))
        {
            stopdto = (StopDTO)list1.next();
        }

        return arraylist;
    }

    private static Passenger findPassengerById(String s, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Passenger passenger = (Passenger)list.next();
            if (Objects.equals(s, passenger.getId()))
            {
                return passenger;
            }
        }

        return Passenger.empty();
    }

    private static String getRideId(RideDTO ridedto)
    {
        if (Strings.equalsIgnoreCase(ridedto.getRideTypeId(), "courier"))
        {
            return ridedto.getRoute().getCurrentStopRideId();
        } else
        {
            return ridedto.getId();
        }
    }

    private static String getRideIfFromCurrentStop(RouteDTO routedto)
    {
        for (routedto = ((List)Objects.firstNonNull(routedto.getStops(), Collections.EMPTY_LIST)).iterator(); routedto.hasNext();)
        {
            StopDTO stopdto = (StopDTO)routedto.next();
            if (!((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue())
            {
                return stopdto.getRideId();
            }
        }

        return "";
    }

    private static RideStatus getStatus(RideDTO ridedto)
    {
        RideStatus ridestatus;
        try
        {
            if (isCanceled(ridedto))
            {
                return new RideStatus(RideStatus.Status.CANCELED);
            }
            ridestatus = new RideStatus(RideStatus.Status.valueOf(ridedto.getStatus().toUpperCase()));
        }
        catch (Throwable throwable)
        {
            L.e(throwable, (new StringBuilder()).append("Unexpected ride status : ").append(ridedto.getStatus()).toString(), new Object[0]);
            return RideStatus.empty();
        }
        return ridestatus;
    }

    private static boolean isCanceled(RideDTO ridedto)
    {
        return Arrays.asList(new String[] {
            "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
        }).contains(ridedto.getStatus());
    }
}
