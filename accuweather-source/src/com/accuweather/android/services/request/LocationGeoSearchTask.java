// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.BaseUpdateTask;
import com.accuweather.android.services.ILocationService;
import com.accuweather.android.services.LocationService;
import com.accuweather.android.utilities.ConversionUtilities;
import com.accuweather.android.utilities.Data;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            CompositeGeocoder, LocationGeoRequest, LocationNotFoundException

public class LocationGeoSearchTask extends BaseUpdateTask
{

    private CompositeGeocoder compositeGeocoder;
    private Exception lastException;
    private ArrayList locationSearchResponses;
    private ILocationService locationService;
    private List requests;

    public LocationGeoSearchTask(Data data)
    {
        super(data);
        requests = new ArrayList();
        locationSearchResponses = new ArrayList();
        lastException = null;
        locationService = new LocationService();
        compositeGeocoder = new CompositeGeocoder(data.getContext());
    }

    private GeoPosition getPreferredGeoPosition(LocationSearchResult locationsearchresult, LocationGeoRequest locationgeorequest)
    {
        GeoPosition geoposition = new GeoPosition();
        if (locationgeorequest.getLat() != null && locationgeorequest.getLon() != null)
        {
            geoposition.setLatitude(locationgeorequest.getLat());
            geoposition.setLongitude(locationgeorequest.getLon());
        } else
        if (locationsearchresult.getGeoPosition() != null && locationsearchresult.getGeoPosition().getLatitude() != null && locationsearchresult.getGeoPosition().getLongitude() != null)
        {
            geoposition.setLatitude(locationsearchresult.getGeoPosition().getLatitude());
            geoposition.setLongitude(locationsearchresult.getGeoPosition().getLongitude());
            return geoposition;
        }
        return geoposition;
    }

    private void updateGeocodedAddress(LocationSearchResult locationsearchresult, LocationGeoRequest locationgeorequest)
    {
        if (locationgeorequest.isAddressRequest())
        {
            if (locationgeorequest.getGeocodedAddress() != null)
            {
                locationsearchresult.setGeocodedAddress(locationgeorequest.getGeocodedAddress());
                return;
            }
            break MISSING_BLOCK_LABEL_89;
        }
        locationgeorequest = getPreferredGeoPosition(locationsearchresult, locationgeorequest);
        if (locationgeorequest.getLatitude() == null || locationgeorequest.getLongitude() == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        locationgeorequest = compositeGeocoder.geocode(locationgeorequest.getLatitude(), locationgeorequest.getLongitude());
        if (locationgeorequest != null)
        {
            try
            {
                if (!locationgeorequest.isEmpty())
                {
                    locationsearchresult.setGeocodedAddress((GeocodedAddress)locationgeorequest.get(0));
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (LocationSearchResult locationsearchresult) { }
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((List[])aobj);
    }

    protected transient Object doInBackground(List alist[])
    {
_L1:
        int i;
        if (i >= requests.size())
        {
            break MISSING_BLOCK_LABEL_359;
        }
        boolean flag = isNotification;
        isNotification = ((LocationGeoRequest)requests.get(i)).isNotification() | flag;
        flag = isWidget;
        isWidget = ((LocationGeoRequest)requests.get(i)).isWidget() | flag;
        flag = isWearable;
        isWearable = ((LocationGeoRequest)requests.get(i)).isWearable() | flag;
        i++;
          goto _L1
_L2:
        for (; i < requests.size(); i++)
        {
            double d = ConversionUtilities.toTwoDecimals(((LocationGeoRequest)requests.get(i)).getLat().doubleValue());
            double d1 = ConversionUtilities.toTwoDecimals(((LocationGeoRequest)requests.get(i)).getLon().doubleValue());
            alist = ((LocationGeoRequest)requests.get(i)).getLangId();
            alist = locationService.performCoordinatesSearch(d, d1, alist);
            if (!isWidget)
            {
                updateGeocodedAddress(alist, (LocationGeoRequest)requests.get(i));
            }
            LocationSearch locationsearch = new LocationSearch();
            locationsearch.add(alist);
            locationSearchResponses.add(locationsearch);
            if (((LocationGeoRequest)requests.get(i)).isFollowMeRequest())
            {
                alist.setGeoPosition(getPreferredGeoPosition(alist, (LocationGeoRequest)requests.get(i)));
                data.setCurrentFollowMeLocation(alist.toLocationModel());
            }
            break MISSING_BLOCK_LABEL_365;
        }

        alist = locationSearchResponses;
        return alist;
        {
            try
            {
                if (alist.length > 0)
                {
                    requests.addAll(alist[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                lastException = alist;
                return null;
            }
            i = 0;
        }
          goto _L1
        i = 0;
          goto _L2
    }

    protected void onPostExecute(Object obj)
    {
        if (lastException != null)
        {
            notifyError(lastException);
        } else
        if (!locationSearchResponses.isEmpty())
        {
            if (isWearable)
            {
                data.notifyGpsSearchCompleteForWearable((LocationSearch)locationSearchResponses.get(0), requests);
            } else
            {
                boolean flag;
                if (isWidget || isNotification)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                data.notifyGpsSearchCompleted((LocationSearch)locationSearchResponses.get(0), requests, flag);
            }
        } else
        {
            notifyError(new LocationNotFoundException("No gps location found"));
        }
        data.removeTaskFromQueue();
        data.executeNextTask();
    }

    public void setLocationService(ILocationService ilocationservice)
    {
        locationService = ilocationservice;
    }
}
