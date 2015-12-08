// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.accuweather.android.widgets:
//            HoloUiBuilder, Dimension

public class HoloLightContentUpdater
{

    private static HashMap mWidgetIdToLocationKeyMap = new HashMap();
    public int mCurrentlyDisplayedIndex;
    private String mCurrentlyDisplayedModelLocationKey;
    private WeatherDataModel mFollowMeLocationWeatherDataModel;
    private com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener mLocationConverterListener;
    private HoloUiBuilder mUiBuilder;
    private List mWeatherDataModels;
    private int mWidgetIds[];

    public HoloLightContentUpdater()
    {
        mWeatherDataModels = new ArrayList();
        mUiBuilder = new HoloUiBuilder();
    }

    private void advanceWidgetToNextLocation(int i, Context context)
    {
        String s = (String)mWidgetIdToLocationKeyMap.get(Integer.valueOf(i));
        boolean flag = false;
        List list = getLocations(context);
        int k = 0;
        do
        {
label0:
            {
                int j = ((flag) ? 1 : 0);
                if (k < list.size())
                {
                    if (!((LocationModel)list.get(k)).getKey().equals(s))
                    {
                        break label0;
                    }
                    j = k + 1;
                }
                k = j;
                if (j >= list.size())
                {
                    k = 0;
                }
                if (list.size() > 0)
                {
                    mWidgetIdToLocationKeyMap.put(Integer.valueOf(i), ((LocationModel)list.get(k)).getKey());
                    mCurrentlyDisplayedModelLocationKey = ((LocationModel)list.get(k)).getKey();
                    mCurrentlyDisplayedIndex = k;
                }
                getData(context).saveResizableWidgetIdMap();
                return;
            }
            k++;
        } while (true);
    }

    private WeatherContentUpdateParams buildWeatherContentUpdateParams()
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(true);
        weathercontentupdateparams.setCurrentConditionsUpdate(true);
        weathercontentupdateparams.setDailyUpdate(true);
        weathercontentupdateparams.setHourlyUpdate(true);
        weathercontentupdateparams.setNewsUpdate(false);
        weathercontentupdateparams.setVideoUpdate(false);
        return weathercontentupdateparams;
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private void getFollowMeLocation(Context context)
    {
        if (!mWidgetIdToLocationKeyMap.isEmpty() && mWidgetIdToLocationKeyMap.containsValue("-1"))
        {
            findLocation(context);
        }
    }

    private List getOrderedLocationKeys(List list, String s)
    {
        ArrayList arraylist;
        int i;
        boolean flag;
        arraylist = new ArrayList();
        flag = false;
        i = ((flag) ? 1 : 0);
        if (s == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L7:
        i = ((flag) ? 1 : 0);
        if (j >= list.size()) goto _L2; else goto _L3
_L3:
        if (!((LocationModel)list.get(j)).getKey().equals(s)) goto _L5; else goto _L4
_L4:
        i = j;
_L2:
        for (j = i; j < list.size(); j++)
        {
            arraylist.add(((LocationModel)list.get(j)).getKey());
        }

        break; /* Loop/switch isn't completed */
_L5:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        for (int k = 0; k < i; k++)
        {
            arraylist.add(((LocationModel)list.get(k)).getKey());
        }

        return arraylist;
    }

    private WeatherDataModel getWeatherDataModelByKey(String s)
    {
        for (Iterator iterator = mWeatherDataModels.iterator(); iterator.hasNext();)
        {
            WeatherDataModel weatherdatamodel = (WeatherDataModel)iterator.next();
            if (weatherdatamodel.getLocationKey().equals(s))
            {
                return weatherdatamodel;
            }
        }

        if (mFollowMeLocationWeatherDataModel != null)
        {
            return mFollowMeLocationWeatherDataModel;
        } else
        {
            return null;
        }
    }

    private void handleDeletion(Context context)
    {
        List list = getData(context).getKeys();
        Iterator iterator = mWidgetIdToLocationKeyMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            String s = (String)mWidgetIdToLocationKeyMap.get(integer);
            if (list.contains(s) || s.equals("-1"))
            {
                continue;
            }
            advanceWidgetToNextLocation(integer.intValue(), context);
            break;
        } while (true);
    }

    private boolean isHomeLocation(String s, Context context)
    {
        return getData(context).getHomeLocation().getKey().equals(s);
    }

    protected static void saveWidgetDimensions(Context context, int i, int j, int k)
    {
        getData(context).getResizableDimensionsMap().put(Integer.valueOf(i), new Dimension(j, k));
        getData(context).saveResizableWidgetDimensionsMap();
    }

    private boolean shouldHandleIntentAction(String s)
    {
        return s.equals("android.appwidget.action.APPWIDGET_UPDATE") || s.equals("android.appwidget.action.APPWIDGET_ENABLED") || s.equals("accuwx.intent.action.DELETE_LOCATION") || s.equals("accuwx.intent.action.ADD_WIDGET_LOCATION") || s.equals("accuwx.intent.action.UPDATE_METRIC") || s.equals("accuwx.intent.action.UPDATE_WIDGET_DATA");
    }

    private void stopService(Context context)
    {
        if (context != null)
        {
            context.stopService(new Intent(context, mUiBuilder.getWidgetServiceClass()));
        }
    }

    private void stopServiceIfNoMoreWidgets(Context context, int ai[])
    {
        if (ai.length == 0)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "In handleStart() DELETED block, no widget ids left and about to stop service.");
            }
            stopService(context);
        }
    }

    private void updateWidgetDisplay(Context context)
    {
        if (mWeatherDataModels == null)
        {
            Logger.d(getClass().getName(), "In updateWidgetDisplay() mWeatherDataModels is null and returning early.");
        } else
        {
            if (mWidgetIds == null)
            {
                Logger.d(getClass().getName(), "In updateWidgetDisplay() mWidgetIds is null and returning early.");
                return;
            }
            int i = 0;
            while (i < mWidgetIds.length) 
            {
                WeatherDataModel weatherdatamodel = getWeatherDataModelByKey((String)mWidgetIdToLocationKeyMap.get(Integer.valueOf(mWidgetIds[i])));
                if (weatherdatamodel != null)
                {
                    mCurrentlyDisplayedModelLocationKey = weatherdatamodel.getLocationKey();
                    updateWidgetDisplay(context, mWidgetIds[i], weatherdatamodel);
                }
                i++;
            }
        }
    }

    public final String TESTING_getCurrentlyDisplayedModelLocationKey()
    {
        return mCurrentlyDisplayedModelLocationKey;
    }

    public final WeatherDataModel TESTING_getFollowMeLocationWeatherDataModel()
    {
        return mFollowMeLocationWeatherDataModel;
    }

    protected void findLocation(Context context)
    {
        getData(context).getGpsLocation(false, true);
    }

    protected int[] getAppWidgetIds(Context context)
    {
        return mUiBuilder.getAppWidgetIds(context);
    }

    protected String getIconPrefix()
    {
        return mUiBuilder.getIconPrefix();
    }

    protected String getIntentForLocationAdvancing()
    {
        return mUiBuilder.getIntentForLocationAdvancing();
    }

    protected List getLocations(Context context)
    {
        return getData(context).getLocations();
    }

    protected List getWeatherDataModels(Context context)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = getData(context).getLocations();
        for (int i = 0; i < arraylist1.size(); i++)
        {
            Object obj = (LocationModel)arraylist1.get(i);
            if (obj == null)
            {
                continue;
            }
            obj = getData(context).getWeatherDataModelFromCode(((LocationModel) (obj)).getLocKey());
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    protected HashMap getWidgetIdMap(Context context)
    {
        return getData(context).getResizableWidgetIdMap();
    }

    protected int getWidgetLayoutId()
    {
        return mUiBuilder.getWidgetLayoutId();
    }

    public void handleStart(Intent intent, int i, final Context context)
    {
        Logger.i(this);
        if (intent == null || intent.getAction() == null)
        {
            if (Logger.isDebugEnabled())
            {
                context = getClass().getName();
                StringBuilder stringbuilder = (new StringBuilder()).append("In handleStart() return early block, intent = ").append(intent).append(", action = ");
                if (intent != null)
                {
                    intent = intent.getAction();
                } else
                {
                    intent = null;
                }
                Logger.d(context, stringbuilder.append(intent).toString());
            }
        } else
        {
            String s = intent.getAction();
            int ai[] = getAppWidgetIds(context);
            mWidgetIds = ai;
            Logger.i(this, (new StringBuilder()).append("handleStart - Action is ").append(s).toString());
            if (s.equals("android.appwidget.action.APPWIDGET_DELETED") || s.equals("android.appwidget.action.APPWIDGET_DISABLED"))
            {
                stopServiceIfNoMoreWidgets(context, ai);
            }
            if (ai == null || ai.length == 0)
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), (new StringBuilder()).append("In handleStart() return early block due to empty or null widgetIds array, intent = ").append(intent).append(", action = ").append(s).toString());
                }
                stopService(context);
                return;
            }
            reloadDataIfRequired(context);
            mWidgetIdToLocationKeyMap = getWidgetIdMap(context);
            mWeatherDataModels = getWeatherDataModels(context);
            if (!getData(context).areLocationsTheNewestVersion())
            {
                if (mLocationConverterListener == null)
                {
                    mLocationConverterListener = new com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener() {

                        final HoloLightContentUpdater this$0;
                        final Context val$context;

                        public void onConversionCompleted(List list)
                        {
                            updateWidgetDisplay(context);
                        }

                        public void onConversionError(Exception exception)
                        {
                        }

            
            {
                this$0 = HoloLightContentUpdater.this;
                context = context1;
                super();
            }
                    };
                }
                getData(context).upgradeLocationModels(mLocationConverterListener);
            }
            if (s.equals(getIntentForLocationAdvancing()))
            {
                if (intent.hasExtra("widget_id"))
                {
                    advanceWidgetToNextLocation(intent.getExtras().getInt("widget_id"), context);
                }
                updateWidgetDisplay(context);
                return;
            }
            if (s.equals("com.accuweather.android.action.WIDGET_RESIZE"))
            {
                updateWidgetDisplay(context);
                return;
            }
            if (shouldHandleIntentAction(s))
            {
                getFollowMeLocation(context);
                if (s.equals("accuwx.intent.action.DELETE_LOCATION"))
                {
                    handleDeletion(context);
                }
                updateWeatherContent(context);
                return;
            }
        }
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, Context context)
    {
        if (getLocations(context).size() == 0)
        {
            LocationModel locationmodel = ((LocationSearchResult)locationsearch.get(0)).toLocationModel();
            getData(context).addLocation(locationmodel);
        }
        WeatherUpdateRequest weatherupdaterequest = new WeatherUpdateRequest();
        weatherupdaterequest.setLocationKey(((LocationSearchResult)locationsearch.get(0)).getKey());
        weatherupdaterequest.setMetric(UserPreferences.getMetricIntPreference(context));
        weatherupdaterequest.setLangId(getData(context).getLangId());
        weatherupdaterequest.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(context));
        weatherupdaterequest.setPrimaryLocation(false);
        weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParams());
        weatherupdaterequest.setWidget(true);
        weatherupdaterequest.setResultOfGpsSearch(true);
        updateWeatherForGpsLocations(context, Arrays.asList(new WeatherUpdateRequest[] {
            weatherupdaterequest
        }));
    }

    public void onWidgetWeatherCallCompleted(List list, Context context)
    {
        if (list.size() == 0 || ((WeatherDataModel)list.get(0)).getForecast() == null || ((WeatherDataModel)list.get(0)).getForecast().getDailyForecasts() == null || ((WeatherDataModel)list.get(0)).getForecast().getDailyForecasts().isEmpty())
        {
            return;
        }
        String s = ((WeatherDataModel)list.get(0)).getLocationKey();
        mWeatherDataModels = getWeatherDataModels(context);
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i < mWeatherDataModels.size())
                {
                    if (!((WeatherDataModel)mWeatherDataModels.get(i)).getLocationKey().equals(s))
                    {
                        break label1;
                    }
                    mWeatherDataModels.set(i, list.get(0));
                }
                if (mWidgetIds != null)
                {
                    for (i = 0; i < mWidgetIds.length; i++)
                    {
                        if (((WeatherDataModel)list.get(0)).isResultOfGpsSearch())
                        {
                            mFollowMeLocationWeatherDataModel = (WeatherDataModel)list.get(0);
                        }
                        if (mWidgetIdToLocationKeyMap.get(Integer.valueOf(mWidgetIds[i])) == null && isHomeLocation(((WeatherDataModel)list.get(0)).getLocationKey(), context))
                        {
                            mWidgetIdToLocationKeyMap.put(Integer.valueOf(mWidgetIds[i]), ((WeatherDataModel)list.get(0)).getLocationKey());
                        }
                    }

                }
                break label0;
            }
            i++;
        } while (true);
        updateWidgetDisplay(context);
    }

    public void populateLocations(RemoteViews remoteviews, WeatherDataModel weatherdatamodel, int i, Context context)
    {
        mUiBuilder.populateLocations(remoteviews, weatherdatamodel, i, context, mWeatherDataModels, mCurrentlyDisplayedIndex);
    }

    protected void reloadDataIfRequired(Context context)
    {
        getData(context).loadData();
    }

    public void setUiBuilder(HoloUiBuilder holouibuilder)
    {
        mUiBuilder = holouibuilder;
    }

    public void updateWeatherContent(Context context)
    {
        Logger.i(getClass().getName(), "In updateWeatherContent().");
        List list = getOrderedLocationKeys(getLocations(context), mCurrentlyDisplayedModelLocationKey);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("updateWeatherContent - key is ").append((String)list.get(i)).toString());
            WeatherUpdateRequest weatherupdaterequest = new WeatherUpdateRequest();
            weatherupdaterequest.setLocationKey((String)list.get(i));
            weatherupdaterequest.setMetric(UserPreferences.getMetricIntPreference(context));
            weatherupdaterequest.setLangId(getData(context).getLangId());
            weatherupdaterequest.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(context));
            weatherupdaterequest.setPrimaryLocation(false);
            weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParams());
            weatherupdaterequest.setWidget(true);
            arraylist.add(weatherupdaterequest);
        }

        if (!arraylist.isEmpty())
        {
            updateWeatherForNonGpsLocations(context, arraylist);
        }
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("updateWeatherContent - params size is ").append(arraylist.size()).toString());
        }
    }

    protected void updateWeatherForGpsLocations(Context context, List list)
    {
        getData(context).queueRequest(list);
    }

    protected void updateWeatherForNonGpsLocations(Context context, List list)
    {
        getData(context).queueRequest(list);
    }

    protected void updateWidgetDisplay(Context context, int i, WeatherDataModel weatherdatamodel)
    {
        mUiBuilder.updateWidgetDisplay(context, weatherdatamodel, i, mWeatherDataModels, mCurrentlyDisplayedIndex);
    }


}
