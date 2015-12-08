// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            Passenger

public class Stop
    implements INullable
{

    private static final Func1 TO_LOCATION = new Func1() {

        public volatile Object call(Object obj)
        {
            return call((Stop)obj);
        }

        public Location call(Stop stop)
        {
            return stop.getLocation();
        }

    };
    private boolean arrived;
    private boolean completed;
    private boolean isInGeofence;
    private boolean isInHotspot;
    private Location location;
    private Passenger passenger;
    private String rideId;
    private Type type;

    public Stop(Passenger passenger1, String s, Location location1, Type type1, boolean flag)
    {
        passenger = passenger1;
        rideId = s;
        location = location1;
        type = type1;
        completed = flag;
    }

    public static Stop empty()
    {
        return NullStop.instance;
    }

    public static Func1 toLocation()
    {
        return TO_LOCATION;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Stop)
        {
            if (getLocation().hasSameCoordinates(((Stop) (obj = (Stop)obj)).getLocation()) && Objects.equals(getPassenger().getId(), ((Stop) (obj)).getPassenger().getId()) && Objects.equals(getRideId(), ((Stop) (obj)).getRideId()) && isCompleted() == ((Stop) (obj)).isCompleted() && isArrived() == ((Stop) (obj)).isArrived() && isInGeofence() == ((Stop) (obj)).isInGeofence() && isInHotspot() == ((Stop) (obj)).isInHotspot())
            {
                return true;
            }
        }
        return false;
    }

    public Location getLocation()
    {
        return (Location)Objects.firstNonNull(location, NullLocation.getInstance());
    }

    public Passenger getPassenger()
    {
        return (Passenger)Objects.firstNonNull(passenger, Passenger.empty());
    }

    public String getRideId()
    {
        return (String)Objects.firstNonNull(rideId, "");
    }

    public String getStopId()
    {
        return (new StringBuilder()).append(rideId).append(getPassenger().getId()).append(type).toString();
    }

    public boolean isArrived()
    {
        return arrived;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public boolean isDropOff()
    {
        return type == Type.DROPOFF;
    }

    public boolean isInGeofence()
    {
        return isInGeofence;
    }

    public boolean isInHotspot()
    {
        return isInHotspot;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPickup()
    {
        return type == Type.PICKUP;
    }

    void setArrived(boolean flag)
    {
        arrived = flag;
    }

    void setCompleted(boolean flag)
    {
        completed = flag;
    }

    void setInGeofence(boolean flag)
    {
        isInGeofence = flag;
    }

    void setInHotspot(boolean flag)
    {
        isInHotspot = flag;
    }

    void setLocation(Location location1)
    {
        location = location1;
    }

    void setPassenger(Passenger passenger1)
    {
        passenger = passenger1;
    }

    void setRideId(String s)
    {
        rideId = s;
    }

    void setType(Type type1)
    {
        type = type1;
    }

    public String toString()
    {
        return Strings.joinWithDelimiter(",", new String[] {
            getLocation().toString(), getPassenger().getId(), getRideId(), (new StringBuilder()).append(isCompleted()).append("").toString(), (new StringBuilder()).append(isArrived()).append("").toString(), (new StringBuilder()).append(isInGeofence()).append("").toString(), (new StringBuilder()).append(isInHotspot()).append("").toString()
        });
    }


    private class NullStop extends Stop
    {

        private static final NullStop instance = new NullStop();

        public boolean isNull()
        {
            return true;
        }



        private NullStop()
        {
            super(null, null, null, null, false);
        }
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DROPOFF;
        public static final Type PICKUP;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(me/lyft/android/domain/ride/Stop$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            PICKUP = new Type("PICKUP", 0);
            DROPOFF = new Type("DROPOFF", 1);
            $VALUES = (new Type[] {
                PICKUP, DROPOFF
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
