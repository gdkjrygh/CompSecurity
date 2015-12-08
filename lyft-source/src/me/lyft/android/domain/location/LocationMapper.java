// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;

import java.util.Date;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.geo.EtaRecord;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;

// Referenced classes of package me.lyft.android.domain.location:
//            NullLocation, Location

public class LocationMapper
{

    public LocationMapper()
    {
    }

    public static Location fromLocationDTO(LocationDTO locationdto)
    {
        if (locationdto == null || locationdto.isNull())
        {
            return NullLocation.getInstance();
        }
        Location location = new Location(((Double)Objects.firstNonNull(locationdto.getLat(), Double.valueOf(0.0D))).doubleValue(), ((Double)Objects.firstNonNull(locationdto.getLng(), Double.valueOf(0.0D))).doubleValue());
        location.setAddress((String)Objects.firstNonNull(locationdto.getAddress(), ""));
        location.setRoutableAddress(locationdto.getRoutableAddress());
        location.setPlaceId((String)Objects.firstNonNull(locationdto.getPlaceId(), ""));
        location.setPlaceName((String)Objects.firstNonNull(locationdto.getPlaceName(), ""));
        if (locationdto.getAltitude() != null)
        {
            location.setAltitude(locationdto.getAltitude());
        }
        if (locationdto.getBearing() != null)
        {
            location.setBearing(locationdto.getBearing().doubleValue());
        }
        try
        {
            location.setTime(DateUtils.decode(locationdto.getRecordedAt()).getTime());
        }
        catch (Exception exception) { }
        location.setSource((String)Objects.firstNonNull(locationdto.getSource(), ""));
        return location;
    }

    public static LocationDTO fromLocationDomain(Location location)
    {
        if (location == null || location.isNull())
        {
            return null;
        }
        Double double1 = location.getLat();
        Double double2 = location.getLng();
        String s1 = Strings.emptyToNull(location.getAddress());
        String s2 = Strings.emptyToNull(location.getSource());
        String s3 = Strings.emptyToNull(location.getRoutableAddress());
        Double double3 = location.getAltitude();
        String s4 = Strings.emptyToNull(location.getPlaceName());
        Double double4 = location.getBearing();
        Double double5 = location.getSpeed();
        Double double6 = location.getAccuracy();
        Long long1 = location.getTime();
        String s;
        if (long1 != null)
        {
            s = DateUtils.convertEpochToISO(location.getTime().longValue());
        } else
        {
            s = null;
        }
        return new LocationDTO(double1, double2, s1, s2, s3, double3, s4, double4, double5, double6, s, long1, null, null, null, null, null, null, Strings.emptyToNull(location.getPlaceId()));
    }

    public static LocationDTO fromLocationDomain(Location location, RideDTO ridedto, UserDTO userdto, boolean flag, EtaRecord etarecord)
    {
        if (location == null || location.isNull())
        {
            return null;
        }
        String s;
        String s1;
        String s2;
        Long long1;
        Double double1;
        Double double2;
        String s3;
        String s4;
        Double double3;
        String s5;
        Double double4;
        Double double5;
        Double double6;
        Long long2;
        if (ridedto == null)
        {
            s = null;
        } else
        {
            s = (String)Objects.firstNonNull(ridedto.getId(), "");
        }
        if (ridedto == null)
        {
            ridedto = null;
        } else
        {
            ridedto = ridedto.getStatus();
        }
        double1 = location.getLat();
        double2 = location.getLng();
        s3 = Strings.emptyToNull(location.getAddress());
        if (flag)
        {
            s1 = "polling_fg";
        } else
        {
            s1 = "polling_bg";
        }
        s4 = Strings.emptyToNull(location.getRoutableAddress());
        double3 = location.getAltitude();
        s5 = Strings.emptyToNull(location.getPlaceName());
        double4 = location.getBearing();
        double5 = location.getSpeed();
        double6 = location.getAccuracy();
        if (location.getTime() != null)
        {
            s2 = DateUtils.convertEpochToISO(location.getTime().longValue());
        } else
        {
            s2 = null;
        }
        long2 = location.getTime();
        if (NullUserDTO.isNull(userdto))
        {
            userdto = null;
        } else
        {
            userdto = userdto.getMode();
        }
        if (etarecord.getEta() != null)
        {
            long1 = etarecord.getEta();
        } else
        {
            long1 = null;
        }
        return new LocationDTO(double1, double2, s3, s1, s4, double3, s5, double4, double5, double6, s2, long2, s, ridedto, userdto, long1, Boolean.valueOf(flag), etarecord.isInternal(), Strings.emptyToNull(location.getPlaceId()));
    }
}
