// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.services.request.DmaRequest;
import com.accuweather.android.services.request.DmaUpdateTask;
import com.accuweather.android.services.request.LocationAutoCompleteRequest;
import com.accuweather.android.services.request.LocationAutoCompleteSearchTask;
import com.accuweather.android.services.request.LocationCityRequest;
import com.accuweather.android.services.request.LocationCitySearchTask;
import com.accuweather.android.services.request.LocationGeoRequest;
import com.accuweather.android.services.request.LocationGeoSearchTask;
import com.accuweather.android.services.request.LocationKeyRequest;
import com.accuweather.android.services.request.LocationKeySearchTask;
import com.accuweather.android.services.request.LocationPostalCodeRequest;
import com.accuweather.android.services.request.LocationPostalCodeSearchTask;
import com.accuweather.android.services.request.Request;
import com.accuweather.android.services.request.WeatherUpdateTask;
import com.accuweather.android.utilities.Data;
import java.util.List;

// Referenced classes of package com.accuweather.android.services:
//            ITaskFactory, BaseUpdateTask

public class TaskFactoryImpl
    implements ITaskFactory
{

    public TaskFactoryImpl()
    {
    }

    public BaseUpdateTask getTask(List list, Data data)
    {
        if (list.size() > 0)
        {
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/LocationKeyRequest))
            {
                return new LocationKeySearchTask(data);
            }
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/LocationAutoCompleteRequest))
            {
                return new LocationAutoCompleteSearchTask(data);
            }
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/LocationPostalCodeRequest))
            {
                return new LocationPostalCodeSearchTask(data);
            }
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/LocationGeoRequest))
            {
                return new LocationGeoSearchTask(data);
            }
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/LocationCityRequest))
            {
                return new LocationCitySearchTask(data);
            }
            if (((Request)list.get(0)).getClass().equals(com/accuweather/android/services/request/DmaRequest))
            {
                return new DmaUpdateTask(data);
            } else
            {
                return new WeatherUpdateTask(data);
            }
        } else
        {
            return null;
        }
    }
}
