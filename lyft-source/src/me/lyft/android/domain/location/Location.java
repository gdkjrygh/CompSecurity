// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;

import me.lyft.android.common.AddressUtils;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.domain.location:
//            SphericalUtils

public class Location
    implements INullable
{

    private static final float MIN_DISTANCE_CHANGE = 10F;
    public static final String SIGNIFICANT_LOCATION_CHANGE_BG = "significant_location_change_bg";
    public static final String SOURCE_DEFAULT = "defaultLocation";
    public static final String SOURCE_MAP = "map";
    public static final String SOURCE_POLLING_BG = "polling_bg";
    public static final String SOURCE_POLLING_FG = "polling_fg";
    private Double accuracy;
    private String address;
    private Double altitude;
    private Double bearing;
    private final Double lat;
    private final Double lng;
    private String placeId;
    private String placeName;
    private PlaceType placeType;
    private String routableAddress;
    private String source;
    private Double speed;
    private Long time;

    public Location(double d, double d1)
    {
        lat = Double.valueOf(d);
        lng = Double.valueOf(d1);
    }

    public double distanceTo(Location location)
    {
        return SphericalUtils.computeDistanceBetween(this, location);
    }

    public Double getAccuracy()
    {
        return accuracy;
    }

    public String getAddress()
    {
        return address;
    }

    public Double getAltitude()
    {
        return altitude;
    }

    public Double getBearing()
    {
        return bearing;
    }

    public String getDisplayName()
    {
        if (!Strings.isNullOrEmpty(placeName))
        {
            return placeName;
        }
        if (!Strings.isNullOrEmpty(address))
        {
            return address;
        } else
        {
            return getShortRoutableAddress();
        }
    }

    public Double getLat()
    {
        return lat;
    }

    public Double getLng()
    {
        return lng;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public String getPlaceName()
    {
        return (String)Objects.firstNonNull(placeName, "");
    }

    public PlaceType getPlaceType()
    {
        return placeType;
    }

    public String getRoutableAddress()
    {
        return (String)Objects.firstNonNull(routableAddress, "");
    }

    public String getRoutableLatLng()
    {
        return (new StringBuilder()).append(lat).append(",").append(lng).toString();
    }

    public String getShortRoutableAddress()
    {
        return AddressUtils.getShortAddress(getRoutableAddress());
    }

    public String getSource()
    {
        return source;
    }

    public Double getSpeed()
    {
        return speed;
    }

    public Long getTime()
    {
        return time;
    }

    public boolean hasSameCoordinates(Location location)
    {
        double d = distanceTo(location);
        return location != null && d < 10D;
    }

    public boolean isNull()
    {
        return false;
    }

    public void setAccuracy(double d)
    {
        accuracy = Double.valueOf(d);
    }

    public void setAddress(String s)
    {
        address = s;
    }

    public void setAltitude(Double double1)
    {
        altitude = double1;
    }

    public void setBearing(double d)
    {
        bearing = Double.valueOf(d);
    }

    public void setPlaceId(String s)
    {
        placeId = s;
    }

    public void setPlaceName(String s)
    {
        placeName = s;
    }

    public void setPlaceType(PlaceType placetype)
    {
        placeType = placetype;
    }

    public void setRoutableAddress(String s)
    {
        routableAddress = s;
    }

    public void setSource(String s)
    {
        source = s;
    }

    public void setSpeed(double d)
    {
        speed = Double.valueOf(d);
    }

    public void setTime(long l)
    {
        time = Long.valueOf(l);
    }

    public String toQueryString()
    {
        return (new StringBuilder()).append(getLat()).append(",").append(getLng()).toString();
    }
}
