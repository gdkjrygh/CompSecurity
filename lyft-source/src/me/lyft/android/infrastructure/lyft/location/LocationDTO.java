// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.location;

import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.infrastructure.lyft.location:
//            NullLocationDTO

public class LocationDTO
    implements INullable
{

    public final Double accuracy;
    public final String address;
    public final Double altitude;
    public final Double bearing;
    public final Long eta;
    public final Boolean isAppForegrounded;
    public final Boolean isInternalEta;
    public final Double lat;
    public final Double lng;
    public final String placeId;
    public final String placeName;
    public final String recordedAt;
    public final String rideId;
    public final String rideStatus;
    public final String routableAddress;
    public final String source;
    public final Double speed;
    public final Long timestamp;
    public final String userMode;

    public LocationDTO(Double double1, Double double2, String s, String s1, String s2, Double double3, String s3, 
            Double double4, Double double5, Double double6, String s4, Long long1, String s5, String s6, 
            String s7, Long long2, Boolean boolean1, Boolean boolean2, String s8)
    {
        lat = double1;
        lng = double2;
        address = s;
        source = s1;
        routableAddress = s2;
        altitude = double3;
        placeName = s3;
        bearing = double4;
        speed = double5;
        accuracy = double6;
        recordedAt = s4;
        timestamp = long1;
        rideId = s5;
        rideStatus = s6;
        userMode = s7;
        eta = long2;
        isAppForegrounded = boolean1;
        isInternalEta = boolean2;
        placeId = s8;
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

    public Long getEta()
    {
        return eta;
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
        return placeName;
    }

    public String getRecordedAt()
    {
        return recordedAt;
    }

    public String getRoutableAddress()
    {
        return routableAddress;
    }

    public String getSource()
    {
        return source;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    public boolean isNull()
    {
        return NullLocationDTO.isNull(this);
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationDTO{lat=").append(lat).append(", lng=").append(lng).append(", address='").append(address).append('\'').append(", source='").append(source).append('\'').append(", routableAddress='").append(routableAddress).append('\'').append(", altitude=").append(altitude).append(", placeName='").append(placeName).append('\'').append(", bearing=").append(bearing).append(", speed=").append(speed).append(", accuracy=").append(accuracy).append(", recordedAt='").append(recordedAt).append('\'').append(", rideId='").append(rideId).append('\'').append(", rideStatus='").append(rideStatus).append('\'').append(", userMode='").append(userMode).append('\'').append(", eta=").append(eta).append(", isAppForegrounded=").append(isAppForegrounded).append(", isInternalEta=").append(isInternalEta).append(", placeId='").append(placeId).append('\'').append('}').toString();
    }
}
