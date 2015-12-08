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
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            CompositeGeocoder, LocationCityRequest

public class LocationCitySearchTask extends BaseUpdateTask
{

    private CompositeGeocoder compositeGeocoder;
    private Exception lastException;
    private ArrayList locationSearchResponses;
    private ILocationService locationService;
    private List requests;

    public LocationCitySearchTask(Data data)
    {
        super(data);
        requests = new ArrayList();
        locationSearchResponses = new ArrayList();
        lastException = null;
        locationService = new LocationService();
        compositeGeocoder = new CompositeGeocoder(data.getContext());
    }

    private void updateGeocodedAddressForCityCenter(LocationSearchResult locationsearchresult)
    {
        Logger.d("geocoding", "updateGeocodedAddressForCityCenter(LocationSearchResult locationSearchResult)");
        Object obj;
        try
        {
            obj = locationsearchresult.getGeoPosition();
            if (((GeoPosition) (obj)).getLatitude() == null || ((GeoPosition) (obj)).getLongitude() == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            obj = compositeGeocoder.geocode(((GeoPosition) (obj)).getLatitude(), ((GeoPosition) (obj)).getLongitude());
        }
        // Misplaced declaration of an exception variable
        catch (LocationSearchResult locationsearchresult)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (!((List) (obj)).isEmpty())
        {
            locationsearchresult.setGeocodedAddress((GeocodedAddress)((List) (obj)).get(0));
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((List[])aobj);
    }

    protected transient Object doInBackground(List alist[])
    {
        if (alist.length > 0)
        {
            requests.addAll(alist[0]);
        }
          goto _L1
_L4:
        int i;
        if (i >= requests.size())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        boolean flag = isNotification;
        isNotification = ((LocationCityRequest)requests.get(i)).isNotification() | flag;
        flag = isWidget;
        isWidget = ((LocationCityRequest)requests.get(i)).isWidget() | flag;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        for (; i >= requests.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_213;
        }

        alist = locationService.performCitySearch(((LocationCityRequest)requests.get(i)).getQueryText(), ((LocationCityRequest)requests.get(i)).getLangId());
        if (alist == null)
        {
            try
            {
                throw new IOException();
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                lastException = alist;
            }
            return null;
        }
        if (alist.size() == 1 && !isWidget)
        {
            updateGeocodedAddressForCityCenter((LocationSearchResult)alist.get(0));
        }
        locationSearchResponses.add(alist);
        i++;
          goto _L2
        alist = locationSearchResponses;
        return alist;
_L1:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPostExecute(Object obj)
    {
        if (lastException == null) goto _L2; else goto _L1
_L1:
        notifyError(lastException);
_L4:
        data.removeTaskFromQueue();
        data.executeNextTask();
        return;
_L2:
        if (!locationSearchResponses.isEmpty())
        {
            if (!isWidget)
            {
                data.notifyLocationSearchCompleted((LocationSearch)locationSearchResponses.get(0), requests);
            } else
            {
                data.notifyWidgetLocationSearchCompleted((LocationSearch)locationSearchResponses.get(0), requests);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLocationService(ILocationService ilocationservice)
    {
        locationService = ilocationservice;
    }
}
