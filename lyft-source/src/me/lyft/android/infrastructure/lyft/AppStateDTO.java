// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.PreRideInfoDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.system.SystemDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft:
//            PrefillLocationsDTO

public class AppStateDTO
{

    public final AppInfo appInfo;
    public final List banners;
    public final RideDTO clientRide;
    public final List contributorRequests;
    public final LocationDTO marker;
    public final LocationDTO markerDestination;
    public final PreRideInfoDTO preRideInfo;
    public final Long preTimestamp;
    public final PrefillLocationsDTO prefillLocations;
    public final RideDTO ride;
    public final List rideTypes;
    public final SystemDTO system;
    public final Long timestamp;
    public final ArrayList topDestinations;
    public final UserDTO user;

    public AppStateDTO(Long long1, Long long2, UserDTO userdto, RideDTO ridedto, ArrayList arraylist, RideDTO ridedto1, SystemDTO systemdto, 
            AppInfo appinfo, List list, List list1, PreRideInfoDTO prerideinfodto, LocationDTO locationdto, LocationDTO locationdto1, List list2, 
            PrefillLocationsDTO prefilllocationsdto)
    {
        timestamp = long1;
        preTimestamp = long2;
        user = userdto;
        ride = ridedto;
        topDestinations = arraylist;
        clientRide = ridedto1;
        system = systemdto;
        appInfo = appinfo;
        banners = list;
        rideTypes = list1;
        preRideInfo = prerideinfodto;
        marker = locationdto;
        markerDestination = locationdto1;
        contributorRequests = list2;
        prefillLocations = prefilllocationsdto;
    }

    public AppInfo getAppInfo()
    {
        return appInfo;
    }

    public List getBanners()
    {
        return banners;
    }

    public RideDTO getClientRide()
    {
        return clientRide;
    }

    public List getContributorRequests()
    {
        return contributorRequests;
    }

    public LocationDTO getMarker()
    {
        return marker;
    }

    public LocationDTO getMarkerDestination()
    {
        return markerDestination;
    }

    public PreRideInfoDTO getPreRideInfo()
    {
        return preRideInfo;
    }

    public Long getPreTimestamp()
    {
        return preTimestamp;
    }

    public PrefillLocationsDTO getPrefillLocations()
    {
        return prefillLocations;
    }

    public RideDTO getRide()
    {
        return ride;
    }

    public List getRideTypes()
    {
        return rideTypes;
    }

    public SystemDTO getSystem()
    {
        return system;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    public ArrayList getTopDestinations()
    {
        return topDestinations;
    }

    public UserDTO getUser()
    {
        return user;
    }
}
