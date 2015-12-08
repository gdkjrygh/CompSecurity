// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.BaseUpdateTask;
import com.accuweather.android.services.IWeatherParser;
import com.accuweather.android.services.MockWeatherParser;
import com.accuweather.android.services.WeatherParser;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.IClock;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.SystemClock;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

// Referenced classes of package com.accuweather.android.services.request:
//            WeatherUpdateRequest

public class WeatherUpdateTask extends BaseUpdateTask
{

    private IClock clock;
    private boolean isTimerUpdate;
    private Exception lastException;
    private IWeatherParser parser;
    private List requests;

    public WeatherUpdateTask(Data data)
    {
        super(data);
        lastException = null;
        isTimerUpdate = false;
        clock = new SystemClock();
        requests = new ArrayList();
        parser = new WeatherParser(data.getContext());
    }

    private boolean isMainAppUpdate(WeatherUpdateRequest weatherupdaterequest)
    {
        return !weatherupdaterequest.isWidget() && !weatherupdaterequest.isNotification();
    }

    private boolean isTestLocationKey(String s)
    {
        return s.equals("2233o81") || s.equals("35o127");
    }

    private WeatherDataModel retrieveCachedData(WeatherUpdateRequest weatherupdaterequest, String s)
    {
        weatherupdaterequest = data.getWeatherDataModelFromCode(weatherupdaterequest.getLocationKey());
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In doInBackground(), in shouldUseCachedData block for location ").append(s).append(", data was updated at ").append(new Date(weatherupdaterequest.getCurrentConditionsUpdateTime())).append(", observation time = ").append(weatherupdaterequest.getLocalObservationDateTime()).toString());
        }
        return weatherupdaterequest;
    }

    private WeatherDataModel retrieveModel(WeatherUpdateRequest weatherupdaterequest, String s)
        throws IOException, ParserConfigurationException, SAXException, URISyntaxException
    {
        if (shouldUseCachedData(weatherupdaterequest))
        {
            return retrieveCachedData(weatherupdaterequest, s);
        } else
        {
            return retrieveNewData(weatherupdaterequest, s);
        }
    }

    private WeatherDataModel retrieveNewData(WeatherUpdateRequest weatherupdaterequest, String s)
        throws IOException, ParserConfigurationException, SAXException, URISyntaxException
    {
        if (isTestLocationKey(s))
        {
            return retrieveTestWeatherDataModel(weatherupdaterequest);
        } else
        {
            return parser.parse(weatherupdaterequest, data);
        }
    }

    private WeatherDataModel retrieveTestWeatherDataModel(WeatherUpdateRequest weatherupdaterequest)
        throws IOException
    {
        MockWeatherParser mockweatherparser = new MockWeatherParser();
        mockweatherparser.addMockLocation(weatherupdaterequest.getLocationKey(), data);
        return mockweatherparser.parse(weatherupdaterequest, data);
    }

    private void saveData()
    {
        if (isWidget || isNotification)
        {
            data.markAsDirty();
            data.saveLocations();
            data.saveWeather();
            data.saveResizableWidgetDimensionsMap();
            data.saveResizableWidgetIdMap();
            return;
        } else
        {
            data.saveLocations();
            data.saveWeather();
            return;
        }
    }

    private boolean shouldUseCachedData(WeatherUpdateRequest weatherupdaterequest)
    {
        Data data = this.data;
        String s = weatherupdaterequest.getLocationKey();
        boolean flag;
        if (weatherupdaterequest.getMetric() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = data.hasCachedValue(s, flag, weatherupdaterequest.getLangId());
        if (!weatherupdaterequest.isWearable() && flag && this.data.areLocationsTheNewestVersion())
        {
            boolean flag1 = this.data.getWeatherDataModelFromCode(weatherupdaterequest.getLocationKey()).areAnySubModelsExpired(clock);
            weatherupdaterequest = getClass().getName();
            StringBuilder stringbuilder = (new StringBuilder()).append("In shouldUseCachedData(), sub models block, !areAnySubmodelsExpired = ");
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Logger.d(weatherupdaterequest, stringbuilder.append(flag).toString());
            return !flag1;
        } else
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In shouldUseCachedData(), hasCachedValue = ").append(flag).toString());
            return false;
        }
    }

    private void updateDataForPrimaryLocation(WeatherDataModel weatherdatamodel, WeatherUpdateRequest weatherupdaterequest)
    {
        if (weatherupdaterequest.isPrimaryLocation())
        {
            data.setLastViewedLocation(weatherdatamodel.getLocationKey());
            data.setCurrentlyViewedWeatherDataModel(weatherdatamodel);
        }
    }

    private void updateModelData(WeatherUpdateRequest weatherupdaterequest, String s, WeatherDataModel weatherdatamodel)
    {
        if (isMainAppUpdate(weatherupdaterequest))
        {
            weatherdatamodel.setPrimaryLocation(weatherupdaterequest.isPrimaryLocation());
            updateDataForPrimaryLocation(weatherdatamodel, weatherupdaterequest);
        }
        weatherdatamodel.setResultOfGpsSearch(weatherupdaterequest.isResultOfGpsSearch());
        s = data.getLocationFromKey(s);
        if (weatherupdaterequest.isResultOfGpsSearch())
        {
            s = data.getCurrentFollowMeLocation();
        }
        if (s != null)
        {
            weatherdatamodel.setLatitude(s.getLatitude());
            weatherdatamodel.setLongitude(s.getLongitude());
            if (s.getCanonicalLocationKey() != null)
            {
                weatherdatamodel.setCanonicalLocationKey(s.getCanonicalLocationKey());
            }
            if (s.getCanonicalPostalCode() != null)
            {
                weatherdatamodel.setCanonicalPostalCode(s.getCanonicalPostalCode());
            }
        }
    }

    public boolean containsNotificationTask()
    {
        if (requests != null)
        {
            Iterator iterator = requests.iterator();
            while (iterator.hasNext()) 
            {
                if (((WeatherUpdateRequest)iterator.next()).isNotification())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsWidgetTask()
    {
        if (requests != null)
        {
            Iterator iterator = requests.iterator();
            while (iterator.hasNext()) 
            {
                if (((WeatherUpdateRequest)iterator.next()).isWidget())
                {
                    return true;
                }
            }
        }
        return false;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((List[])aobj);
    }

    protected transient Object doInBackground(List alist[])
    {
        try
        {
            if (alist.length == 0)
            {
                throw new IllegalArgumentException("There must be at least one parser params argument for weather updates.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            alist.printStackTrace();
            lastException = alist;
            return new ArrayList();
        }
        ArrayList arraylist;
        arraylist = new ArrayList();
        requests.clear();
        requests.addAll(alist[0]);
        int i = 0;
_L2:
        if (i >= requests.size())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = isNotification;
        isNotification = ((WeatherUpdateRequest)requests.get(i)).isNotification() | flag;
        flag = isWidget;
        isWidget = ((WeatherUpdateRequest)requests.get(i)).isWidget() | flag;
        flag = isTimerUpdate;
        isTimerUpdate = ((WeatherUpdateRequest)requests.get(i)).isResultOfTimerRefresh() | flag;
        flag = isWearable;
        isWearable = ((WeatherUpdateRequest)requests.get(i)).isWearable() | flag;
        i++;
        if (true) goto _L2; else goto _L1
_L4:
        if (i >= requests.size())
        {
            break MISSING_BLOCK_LABEL_334;
        }
        alist = (WeatherUpdateRequest)requests.get(i);
        String s = alist.getLocationKey();
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("Key ").append(s).append(", is widget ").append(alist.isWidget()).toString());
        }
        WeatherDataModel weatherdatamodel = retrieveModel(alist, s);
        updateModelData(alist, s, weatherdatamodel);
        arraylist.add(weatherdatamodel);
        data.addWeatherDataModel(weatherdatamodel);
        i++;
        continue; /* Loop/switch isn't completed */
        saveData();
        return arraylist;
_L1:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
        return obj != null && getClass().equals(obj.getClass()) && hashCode() == obj.hashCode();
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    protected void onPostExecute(Object obj)
    {
        data.removeTaskFromQueue();
        if (lastException != null)
        {
            if (!isTimerUpdate)
            {
                notifyError(lastException);
            }
        } else
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "In onPostExecute(), notifying listeners.");
            }
            if (isWearable)
            {
                data.notifyWeatherCallCompletedForWearables((List)obj, requests);
            } else
            {
                if (!isWidget && !isNotification)
                {
                    data.notifyWeatherCallCompleted((List)obj, requests);
                }
                data.notifyNotificationWeatherCallCompleted((List)obj, requests);
                data.notifyWidgetWeatherCallCompleted((List)obj);
            }
        }
        data.executeNextTask();
    }

    public void setClock(IClock iclock)
    {
        clock = iclock;
    }

    public void setWeatherParser(IWeatherParser iweatherparser)
    {
        parser = iweatherparser;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WeatherUpdateTask [lastException=").append(lastException).append(", isTimerUpdate=").append(isTimerUpdate).append(", clock=").append(clock).append(", parser=").append(parser).append(", requests=").append(requests).append("]").toString();
    }
}
