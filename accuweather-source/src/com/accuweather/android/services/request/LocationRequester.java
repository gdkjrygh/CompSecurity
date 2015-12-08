// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.utilities.Data;

// Referenced classes of package com.accuweather.android.services.request:
//            LocationGeoRequest, LocationAutoCompleteRequest, Request, LocationCityRequest, 
//            LocationKeyRequest

public class LocationRequester
{

    private Context context;

    public LocationRequester(Context context1)
    {
        context = context1;
    }

    private LocationGeoRequest createLocationGeoRequest(Double double1, Double double2, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        LocationGeoRequest locationgeorequest = new LocationGeoRequest();
        locationgeorequest.setLangId(getData().getLangId());
        locationgeorequest.setLat(double1);
        locationgeorequest.setLon(double2);
        locationgeorequest.setFollowMeRequest(flag);
        locationgeorequest.setNotification(flag1);
        locationgeorequest.setWidget(flag2);
        locationgeorequest.setWearable(flag3);
        return locationgeorequest;
    }

    private final Data getData()
    {
        return Data.getInstance(context);
    }

    public void performAutoCompleteLocationSearch(String s)
    {
        LocationAutoCompleteRequest locationautocompleterequest = new LocationAutoCompleteRequest();
        locationautocompleterequest.setQueryText(s);
        locationautocompleterequest.setLangId(getData().getLangId());
        getData().queueRequest(new Request[] {
            locationautocompleterequest
        });
    }

    public void performCitySearch(String s)
    {
        LocationCityRequest locationcityrequest = new LocationCityRequest();
        locationcityrequest.setQueryText(s);
        locationcityrequest.setLangId(getData().getLangId());
        getData().queueRequest(new Request[] {
            locationcityrequest
        });
    }

    public void performGeoSearch(GeocodedAddress geocodedaddress)
    {
        LocationGeoRequest locationgeorequest = new LocationGeoRequest();
        locationgeorequest.setLangId(getData().getLangId());
        locationgeorequest.setLat(geocodedaddress.getLatitude());
        locationgeorequest.setLon(geocodedaddress.getLongitude());
        locationgeorequest.setFollowMeRequest(false);
        locationgeorequest.setNotification(false);
        locationgeorequest.setWidget(false);
        locationgeorequest.setGeocodedAddress(geocodedaddress);
        locationgeorequest.setAddressRequest(true);
        getData().queueRequest(new Request[] {
            locationgeorequest
        });
    }

    public void performGeoSearch(Double double1, Double double2, boolean flag)
    {
        performGeoSearch(double1, double2, flag, false, false);
    }

    public void performGeoSearch(Double double1, Double double2, boolean flag, boolean flag1, boolean flag2)
    {
        double1 = createLocationGeoRequest(double1, double2, flag, flag1, flag2, false);
        getData().queueRequest(new Request[] {
            double1
        });
    }

    public void performGeoSearchForWearable(Double double1, Double double2)
    {
        double1 = createLocationGeoRequest(double1, double2, true, false, false, true);
        getData().queueRequest(new Request[] {
            double1
        });
    }

    public void performLocationKeySearch(String s)
    {
        LocationKeyRequest locationkeyrequest = new LocationKeyRequest();
        locationkeyrequest.setLocationKey(s);
        locationkeyrequest.setLangId(getData().getLangId());
        getData().queueRequest(new Request[] {
            locationkeyrequest
        });
    }

    public void performLocationKeySearchForWidget(String s)
    {
        LocationKeyRequest locationkeyrequest = new LocationKeyRequest();
        locationkeyrequest.setLocationKey(s);
        locationkeyrequest.setLangId(getData().getLangId());
        locationkeyrequest.setWidget(true);
        getData().queueRequest(new Request[] {
            locationkeyrequest
        });
    }
}
