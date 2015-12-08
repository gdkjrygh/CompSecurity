// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPGeopoint;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.impl.handler.CheckInEventResponseHandler;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.events.impl.CheckInEvent;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPLocalpointService, LPLocationProvider, LPDevice, LPGeopoint

public class LPLocation
    implements ILPLocation
{
    public static class LPLocationID
        implements ILPID
    {

        private final long locationId;

        public String getValue()
        {
            return String.format(Locale.US, "%d", new Object[] {
                Long.valueOf(locationId)
            });
        }

        public LPLocationID(long l)
        {
            locationId = l;
        }
    }


    private final String BSSID;
    private final long ID;
    private final String SSID;
    private String asString;
    private final LPGeopoint center;
    private final String description;
    private Integer hashCode;
    private final String locationCode;
    private final Context mContext;
    private final String name;
    private final Set tags;

    public LPLocation(long l, String s, String s1, LPGeopoint lpgeopoint, String s2, String s3, 
            String s4, Set set, Context context)
    {
        ID = l;
        name = s;
        description = s1;
        center = lpgeopoint;
        BSSID = s2;
        SSID = s3;
        locationCode = s4;
        tags = set;
        mContext = context;
    }

    public void checkIn()
    {
        Object obj = LPLocalpointService.getInstance(mContext).getLocationProvider().getGeoFenceDBHelper().getGeoFence(ID);
        obj = new CheckInEvent(mContext, ((com.digby.mm.android.library.geofence.IGeoFence) (obj)));
        CheckInEventResponseHandler checkineventresponsehandler = new CheckInEventResponseHandler(mContext, this);
        DigbyController.getInstance(mContext).sendEvent(((com.digby.mm.android.library.events.IEvent) (obj)), checkineventresponsehandler);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof LPLocation))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            obj = (LPLocation)obj;
            return (new EqualsBuilder()).append(name, ((LPLocation) (obj)).name).append(ID, ((LPLocation) (obj)).ID).append(description, ((LPLocation) (obj)).description).append(BSSID, ((LPLocation) (obj)).BSSID).append(SSID, ((LPLocation) (obj)).SSID).append(locationCode, ((LPLocation) (obj)).locationCode).append(center, ((LPLocation) (obj)).center).isEquals();
        }
    }

    public String getBSSID()
    {
        return BSSID;
    }

    public ILPGeopoint getCenter()
    {
        return center;
    }

    public String getCode()
    {
        return locationCode;
    }

    public String getDescription()
    {
        return description;
    }

    public ILPID getID()
    {
        return new LPLocationID(ID);
    }

    public String getName()
    {
        return name;
    }

    public String getSSID()
    {
        return SSID;
    }

    public Set getTags()
    {
        return tags;
    }

    public int hashCode()
    {
        if (hashCode == null)
        {
            hashCode = Integer.valueOf((new HashCodeBuilder()).append(name).append(ID).append(description).append(BSSID).append(SSID).append(locationCode).append(center).append(tags).toHashCode());
        }
        return hashCode.intValue();
    }

    public boolean isDeviceIn()
    {
        return ((LPDevice)LPLocalpointService.getInstance(mContext).getDevice()).getLocationsIn().contains(this);
    }

    public String toString()
    {
        if (asString == null)
        {
            asString = (new ToStringBuilder(this)).append(name).append(ID).append(description).append(BSSID).append(SSID).append(locationCode).append(center).append(tags).toString();
        }
        return asString;
    }
}
