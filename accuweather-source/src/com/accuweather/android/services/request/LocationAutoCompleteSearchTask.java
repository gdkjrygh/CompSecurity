// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.services.BaseUpdateTask;
import com.accuweather.android.services.ILocationService;
import com.accuweather.android.services.LocationService;
import com.accuweather.android.utilities.Data;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            LocationAutoCompleteRequest

public class LocationAutoCompleteSearchTask extends BaseUpdateTask
{

    private ArrayList locationSearchesResponses;
    private ILocationService locationService;
    private List requests;

    public LocationAutoCompleteSearchTask(Data data)
    {
        super(data);
        requests = new ArrayList();
        locationSearchesResponses = new ArrayList();
        locationService = new LocationService();
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
            break MISSING_BLOCK_LABEL_181;
        }
        boolean flag = isNotification;
        isNotification = ((LocationAutoCompleteRequest)requests.get(i)).isNotification() | flag;
        flag = isWidget;
        isWidget = ((LocationAutoCompleteRequest)requests.get(i)).isWidget() | flag;
        i++;
        continue; /* Loop/switch isn't completed */
_L1:
        for (; i >= requests.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }

        alist = locationService.performAutocompleteSearch(((LocationAutoCompleteRequest)requests.get(i)).getQueryText(), ((LocationAutoCompleteRequest)requests.get(i)).getLangId());
        locationSearchesResponses.add(alist);
        i++;
          goto _L1
        alist = locationSearchesResponses;
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
                return null;
            }
            i = 0;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected void onPostExecute(Object obj)
    {
        if (!locationSearchesResponses.isEmpty())
        {
            if (!isWidget)
            {
                data.notifyLocationSearchCompleted((LocationSearch)locationSearchesResponses.get(0), requests);
            } else
            {
                data.notifyWidgetLocationSearchCompleted((LocationSearch)locationSearchesResponses.get(0), requests);
            }
        }
        data.removeTaskFromQueue();
        data.executeNextTask();
    }

    public void setLocationService(ILocationService ilocationservice)
    {
        locationService = ilocationservice;
    }
}
