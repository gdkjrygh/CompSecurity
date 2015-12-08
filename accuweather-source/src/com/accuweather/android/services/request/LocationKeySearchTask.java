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
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            CompositeGeocoder, LocationKeyRequest

public class LocationKeySearchTask extends BaseUpdateTask
{

    private CompositeGeocoder compositeGeocoder;
    private Exception lastException;
    private List locationKeys;
    private ArrayList locationSearchResponses;
    private ILocationService locationService;
    private List requests;

    public LocationKeySearchTask(Data data)
    {
        super(data);
        requests = new ArrayList();
        locationKeys = new ArrayList();
        locationSearchResponses = new ArrayList();
        lastException = null;
        locationService = new LocationService();
        compositeGeocoder = new CompositeGeocoder(data.getContext());
    }

    private void updateGeocodedAddressForCityCenter(LocationSearchResult locationsearchresult)
    {
        Object obj;
        try
        {
            obj = locationsearchresult.getGeoPosition();
            if (((GeoPosition) (obj)).getLatitude() == null || ((GeoPosition) (obj)).getLongitude() == null)
            {
                break MISSING_BLOCK_LABEL_62;
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
            break MISSING_BLOCK_LABEL_62;
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
_L3:
        int i;
        if (i >= requests.size())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        boolean flag = isNotification;
        isNotification = ((LocationKeyRequest)requests.get(i)).isNotification() | flag;
        flag = isWidget;
        isWidget = ((LocationKeyRequest)requests.get(i)).isWidget() | flag;
        locationKeys.add(((LocationKeyRequest)requests.get(i)).getLocationKey());
        i++;
        continue; /* Loop/switch isn't completed */
_L1:
        LocationSearch locationsearch;
        for (; i >= requests.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_222;
        }

        alist = locationService.performLocationKeySearch(((LocationKeyRequest)requests.get(i)).getLocationKey(), ((LocationKeyRequest)requests.get(i)).getLangId());
        if (!isWidget)
        {
            updateGeocodedAddressForCityCenter(alist);
        }
        locationsearch = new LocationSearch();
        locationsearch.add(alist);
        locationSearchResponses.add(locationsearch);
        i++;
          goto _L1
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
        if (true) goto _L3; else goto _L2
_L2:
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
