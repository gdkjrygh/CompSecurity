// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.passenger.PassengerRideProvider;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.profile.VehicleDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRouteDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RouteDTO;
import me.lyft.android.infrastructure.lyft.ride.StopDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.passenger:
//            Driver, PassengerRide, PassengerRideValidator

public class PassengerRideMapper
{

    public PassengerRideMapper()
    {
    }

    public static Driver createDriver(UserDTO userdto, RideDTO ridedto)
    {
        if (userdto == null || userdto.isNull())
        {
            return Driver.empty();
        }
        Location location = LocationMapper.fromLocationDTO(userdto.getLocation());
        List list = Iterables.select((Iterable)Objects.firstNonNull(userdto.getRecentLocations(), Collections.emptyList()), new Func1() {

            public volatile Object call(Object obj)
            {
                return call((LocationDTO)obj);
            }

            public Location call(LocationDTO locationdto)
            {
                return LocationMapper.fromLocationDTO(locationdto);
            }

        });
        String s;
        String s1;
        String s2;
        String s3;
        Vehicle vehicle;
        if (userdto.getPhone() == null)
        {
            s = null;
        } else
        {
            s = userdto.getPhone().getNumber();
        }
        if (ridedto != null)
        {
            ridedto = (String)Objects.firstNonNull(ridedto.getIcon(), "");
        } else
        {
            ridedto = "";
        }
        s1 = userdto.getId();
        s2 = userdto.getFirstName();
        s3 = userdto.getUserPhoto();
        vehicle = fromVehicleDTO(userdto.getVehicle());
        if (!list.isEmpty())
        {
            location = (Location)list.get(list.size() - 1);
        }
        return new Driver(s1, s2, s3, s, vehicle, location, userdto.getDriverRating(), list, ridedto);
    }

    public static PassengerRide createPassengerRide(RideDTO ridedto, UserDTO userdto)
    {
        if (ridedto.isNull())
        {
            return PassengerRide.empty();
        } else
        {
            RideStatus ridestatus = createRideStatus(ridedto);
            RideType ridetype = RideType.getInstance(ridedto.getRideTypeId());
            List list = createPassengers(userdto, ridedto);
            List list1 = createStops(list, ridedto);
            list = filterDroppedOffPassengers(list, list1);
            list1 = filterCompleteStops(list1);
            Location location = PassengerRideProvider.findPickupStopForPassenger(userdto.getId(), list1).getLocation();
            userdto = PassengerRideProvider.findDropoffStopForPassenger(userdto.getId(), list1).getLocation();
            int i = ((Integer)Objects.firstNonNull(ridedto.getWaitEstimateInSec(), Integer.valueOf(0))).intValue();
            ridedto = new PassengerRide((String)Objects.firstNonNull(ridedto.getId(), ""), createDriver((UserDTO)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(ridedto.getRoute(), NullRouteDTO.getInstance())).getDriver(), NullUserDTO.getInstance()), ridedto), ridetype, ridestatus, location, userdto, list1, list, ((Integer)Objects.firstNonNull(ridedto.getCancelPenalty(), Integer.valueOf(0))).intValue(), ((Boolean)Objects.firstNonNull(ridedto.getHideCurrentLocationMarker(), Boolean.FALSE)).booleanValue(), i);
            PassengerRideValidator.validate(ridedto);
            return ridedto;
        }
    }

    private static List createPassengers(UserDTO userdto, RideDTO ridedto)
    {
        List list = (List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(ridedto.getRoute(), NullRouteDTO.getInstance())).getPassengers(), Collections.EMPTY_LIST);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            UserDTO userdto1 = (UserDTO)iterator.next();
            String s;
            String s1;
            String s2;
            String s3;
            int i;
            boolean flag;
            boolean flag1;
            if (userdto1.getPhone() != null)
            {
                s = userdto1.getPhone().getNumber();
            } else
            {
                s = null;
            }
            s1 = userdto1.getId();
            flag1 = Objects.equals(userdto1.getId(), userdto.getId());
            s2 = userdto1.getFirstName();
            s3 = userdto1.getUserPhoto();
            i = ((Integer)Objects.firstNonNull(userdto1.getPartySize(), Integer.valueOf(0))).intValue();
            if (isPickedUp(ridedto) || isDroppedOff(ridedto))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new Passenger(s1, flag1, s2, s3, s, i, flag, isDroppedOff(ridedto), ((Boolean)Objects.firstNonNull(userdto1.isRatingCompleted(), Boolean.valueOf(false))).booleanValue()));
        }
        return arraylist;
    }

    private static RideStatus createRideStatus(RideDTO ridedto)
    {
        if (ridedto.getStatus() == null)
        {
            return RideStatus.empty();
        }
        if (Arrays.asList(new String[] {
    "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
}).contains(ridedto.getStatus()))
        {
            return new RideStatus(me.lyft.android.domain.ride.RideStatus.Status.CANCELED);
        } else
        {
            return new RideStatus(me.lyft.android.domain.ride.RideStatus.Status.valueOf(ridedto.getStatus().toUpperCase()));
        }
    }

    private static List createStops(List list, RideDTO ridedto)
    {
        return createStopsFromRoute(ridedto, list);
    }

    private static List createStopsFromRoute(RideDTO ridedto, List list)
    {
        ArrayList arraylist = new ArrayList();
        StopDTO stopdto;
        for (Iterator iterator = ((List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(ridedto.getRoute(), NullRouteDTO.getInstance())).getStops(), Collections.EMPTY_LIST)).iterator(); iterator.hasNext(); arraylist.add(new Stop(findPassengerById((String)Objects.firstNonNull(stopdto.getPassengerId(), ""), list), (String)Objects.firstNonNull(ridedto.getId(), ""), LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(stopdto.getLocation(), NullLocationDTO.getInstance())), getStopType(stopdto), ((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue())))
        {
            stopdto = (StopDTO)iterator.next();
        }

        return arraylist;
    }

    private static List filterCompleteStops(List list)
    {
        return Iterables.where(list, new Func1() {

            public Boolean call(Stop stop)
            {
                boolean flag;
                if (stop.getPassenger().isSelf() || !stop.isCompleted())
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

        });
    }

    private static List filterDroppedOffPassengers(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(list);
        list = list1.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            list1 = (Stop)list.next();
            if (list1.isCompleted() && list1.isDropOff() && !list1.getPassenger().isSelf())
            {
                arraylist.remove(list1.getPassenger());
            }
        } while (true);
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

    private static Vehicle fromVehicleDTO(VehicleDTO vehicledto)
    {
        if (vehicledto == null)
        {
            return Vehicle.empty();
        } else
        {
            return new Vehicle(vehicledto.getPhoto(), (String)Objects.firstNonNull(vehicledto.getColor(), ""), (String)Objects.firstNonNull(vehicledto.getMake(), ""), (String)Objects.firstNonNull(vehicledto.getModel(), ""), (Integer)Objects.firstNonNull(vehicledto.getYear(), Integer.valueOf(0)), (String)Objects.firstNonNull(vehicledto.getState(), ""), (String)Objects.firstNonNull(vehicledto.getLicensePlate(), ""));
        }
    }

    private static me.lyft.android.domain.ride.Stop.Type getStopType(StopDTO stopdto)
    {
        if ("pickup".equals(stopdto.getStopType()))
        {
            return me.lyft.android.domain.ride.Stop.Type.PICKUP;
        } else
        {
            return me.lyft.android.domain.ride.Stop.Type.DROPOFF;
        }
    }

    private static boolean isDroppedOff(RideDTO ridedto)
    {
        return "droppedOff".equalsIgnoreCase(ridedto.getStatus());
    }

    private static boolean isPickedUp(RideDTO ridedto)
    {
        return "pickedUp".equalsIgnoreCase(ridedto.getStatus());
    }
}
