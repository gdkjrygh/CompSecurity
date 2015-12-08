// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Criteria;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MetricImperial;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertModel;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.models.minutecast.Color;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summaries;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.services.request.LocationGeoRequest;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.SystemClock;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.WeatherDataUtility;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.gson.Gson;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.accuweather.android.services:
//            RefreshService

public abstract class WearablesService extends WearableListenerService
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.accuweather.android.utilities.Data.IWeatherDataListener
{
    public static interface IPeerConnectedListener
    {

        public abstract void onPeerConnected();
    }

    public class RunnabeStartTaskTaskSend
        implements Runnable
    {

        final WearablesService this$0;
        WeatherDataModel wdm;

        public void run()
        {
            if (mGoogleApiClient.isConnected() && wdm != null)
            {
                StartWearableActivityTask startwearableactivitytask = new StartWearableActivityTask();
                startwearableactivitytask.setWeatherData(wdm);
                startwearableactivitytask.execute(new Void[0]);
            }
        }

        public void setData(WeatherDataModel weatherdatamodel)
        {
            wdm = weatherdatamodel;
        }

        public RunnabeStartTaskTaskSend()
        {
            this$0 = WearablesService.this;
            super();
        }
    }

    private class SendToDataLayerThread extends Thread
    {

        String message;
        String path;
        final WearablesService this$0;

        public void run()
        {
            for (Iterator iterator = ((com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult)Wearable.NodeApi.getConnectedNodes(mGoogleApiClient).await()).getNodes().iterator(); iterator.hasNext();)
            {
                Node node = (Node)iterator.next();
                if (((com.google.android.gms.wearable.MessageApi.SendMessageResult)Wearable.MessageApi.sendMessage(mGoogleApiClient, node.getId(), path, message.getBytes()).await()).getStatus().isSuccess())
                {
                    Log.v("myTag", (new StringBuilder()).append("Message: {").append(message).append("} sent to: ").append(node.getDisplayName()).toString());
                } else
                {
                    Log.v("myTag", "ERROR: failed to send Message");
                }
            }

        }

        SendToDataLayerThread(String s, String s1)
        {
            this$0 = WearablesService.this;
            super();
            path = s;
            message = s1;
        }
    }

    private class StartWearableActivityTask extends AsyncTask
    {

        final WearablesService this$0;
        WeatherDataModel wdm;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            Object obj;
            avoid = new SystemClock();
            if (wdm == null || !WeatherDataUtility.isWeatherModelValid(wdm) || wdm.areAnySubModelsExpired(avoid))
            {
                break MISSING_BLOCK_LABEL_270;
            }
            obj = onGenerateJsonData(wdm);
            if (obj == null || ((Map) (obj)).size() <= 0)
            {
                break MISSING_BLOCK_LABEL_270;
            }
            avoid = ((Void []) (WearablesService.mSynObj));
            avoid;
            JVM INSTR monitorenter ;
            PutDataMapRequest putdatamaprequest;
            cancelAlarm(WearablesService.this);
            if (!mGoogleApiClient.isConnected())
            {
                break MISSING_BLOCK_LABEL_259;
            }
            putdatamaprequest = PutDataMapRequest.create("/");
            String s;
            for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); sendDataToWearable(putdatamaprequest, s, (String)((Map) (obj)).get(s)))
            {
                s = (String)iterator.next();
            }

            break MISSING_BLOCK_LABEL_160;
            Exception exception;
            exception;
            avoid;
            JVM INSTR monitorexit ;
            throw exception;
            exception = putdatamaprequest.asPutDataRequest();
            exception = (com.google.android.gms.wearable.DataApi.DataItemResult)Wearable.DataApi.putDataItem(mGoogleApiClient, exception).await();
            if (!exception.getStatus().isSuccess()) goto _L2; else goto _L1
_L1:
            Log.d("WearablesService", "sendDataToWearable: putDataItem success");
_L3:
            startRepeatingAlarm(WearablesService.this);
            avoid;
            JVM INSTR monitorexit ;
            break MISSING_BLOCK_LABEL_270;
_L2:
            Log.e("WearablesService", (new StringBuilder()).append("sendDataToWearable ERROR: failed to putDataItem: ").append(exception.getStatus()).toString());
              goto _L3
            Log.d("WearablesService", "sendDataToWearable: not connected");
              goto _L3
            return null;
        }

        public void sendDataToWearable(PutDataMapRequest putdatamaprequest, String s, String s1)
        {
            if (s1 != null && s != null)
            {
                Log.d("WearablesService", (new StringBuilder()).append("sendDataToWearable: uri: ").append(putdatamaprequest.getUri().toString()).append(", json: ").append(s1).toString());
                putdatamaprequest.getDataMap().putString(s, s1);
            } else
            {
                Log.e("WearablesService", "sendDataToWearable ERROR: send data null");
            }
            (new SendToDataLayerThread("/is-paid-value", String.valueOf(false))).start();
        }

        public void setWeatherData(WeatherDataModel weatherdatamodel)
        {
            wdm = weatherdatamodel;
        }

        private StartWearableActivityTask()
        {
            this$0 = WearablesService.this;
            super();
        }

    }


    private static final String ALERT_KEY = "alert";
    private static final String CURRENT_CONDITIONS_KEY = "current-conditions";
    private static final String CURRENT_TIME = "currentTime";
    private static final String GPS_LOCATION_KEY = "GPS_LOCATION_KEY";
    private static final String HOURLY_KEY = "hourly";
    private static final String IS_PAID_VALUE = "/is-paid-value";
    private static final String MINUTECAST_KEY = "minutecast";
    private static final String START_ACTIVITY_PATH = "/start-activity";
    public static final String TAG = "WearablesService";
    public static final long TIME_WAIT_NEW_REQUEST = 2000L;
    private static final Object mSynObj = new Object();
    private String mAlert;
    private Context mContext;
    private String mCurrentConditions;
    private GoogleApiClient mGoogleApiClient;
    Handler mHandler;
    private String mHourly;
    private String mMinuteCast;
    private boolean mResolvingError;
    public final Runnable mRunnableRefresh = new Runnable() {

        final WearablesService this$0;

        public void run()
        {
            String s = getGPSKey();
            if (s != null)
            {
                if (getData().getLocationFromKey(s) != null)
                {
                    refresh(s);
                    return;
                } else
                {
                    Log.d("WearablesService", "getdata.getLocationFromKey(key) == null -> force get GPS");
                    Data.getInstance(getApplicationContext()).getGpsLocationOnlyForWearable();
                    return;
                }
            } else
            {
                Data.getInstance(getApplicationContext()).getGpsLocationOnlyForWearable();
                return;
            }
        }

            
            {
                this$0 = WearablesService.this;
                super();
            }
    };
    public final RunnabeStartTaskTaskSend mRunnableStartTaskSend = new RunnabeStartTaskTaskSend();
    private RefreshService refreshService;

    public WearablesService()
    {
        mResolvingError = false;
        refreshService = new RefreshService();
        mCurrentConditions = null;
        mMinuteCast = null;
        mHourly = null;
        mAlert = null;
    }

    private boolean checkIfWearablesCurrentLocation()
    {
        return PreferenceUtils.get(this, "is_wearables_current_location", false);
    }

    private String getCurrentTime()
    {
        return DateFormat.getDateTimeInstance().format(new Date());
    }

    private Data getData()
    {
        return Data.getInstance(getApplicationContext());
    }

    private String getTimeWithSetting(HourlyResult hourlyresult, Locale locale)
    {
        hourlyresult = DateUtils.to12HourTimeNoMinutesWithAmPm(hourlyresult.getDateTime(), locale);
        locale = DateUtils.getAmPmDesignator(hourlyresult);
        int i = DateUtils.convertFrom12HourTo24HourFormat(DateUtils.parseHour(hourlyresult), locale, mContext);
        if (UserPreferences.isTwelveHourFormat(mContext))
        {
            return hourlyresult;
        } else
        {
            return (new StringBuilder()).append(i).append(":00").toString();
        }
    }

    public static boolean isLocationEnabled(Context context)
    {
        LocationManager locationmanager;
        boolean flag;
        boolean flag1;
        locationmanager = null;
        flag = false;
        flag1 = false;
        if (true)
        {
            locationmanager = (LocationManager)context.getSystemService("location");
        }
        boolean flag2 = locationmanager.isProviderEnabled("gps");
        flag = flag2;
_L4:
        flag2 = locationmanager.isProviderEnabled("network");
        flag1 = flag2;
_L2:
        return flag || flag1;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isTermsAndConditionsAccepted()
    {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("terms_and_conditions_accepted", false);
    }

    private void onDataError()
    {
        WeatherDataModel weatherdatamodel = null;
        LocationModel locationmodel = getData().getCurrentFollowMeLocation();
        if (locationmodel != null)
        {
            weatherdatamodel = getData().getWeatherDataModelFromCode(locationmodel.getLocKey());
        }
        if (weatherdatamodel != null)
        {
            Log.i("WearablesService", "start send cached weather data model to wear");
            startTaskSend(weatherdatamodel);
            return;
        } else
        {
            sendHomeLocation();
            return;
        }
    }

    private String onGetJsonAlert(String s, List list)
    {
        Locale locale = mContext.getResources().getConfiguration().locale;
        String s1 = mContext.getResources().getString(com.accuweather.android.R.string.InEffectFor);
        String s2 = mContext.getResources().getString(com.accuweather.android.R.string.Until);
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("currentTime", getCurrentTime());
        if (list != null && list.size() > 0)
        {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = (AlertModel)iterator.next();
                HashMap hashmap1 = new HashMap();
                hashmap1.put("alertDescription", list.getAlertDescription());
                list = list.getAlertAreas();
                if (list == null || list.size() <= 0)
                {
                    continue;
                }
                if (list.get(0) != null)
                {
                    list = ((com.accuweather.android.models.alert.AlertModel.AreaModel)list.get(0)).getEndTime();
                } else
                {
                    list = null;
                }
                if (list != null)
                {
                    list = DateUtils.to12HourTimeWithAmPm(list, locale);
                    hashmap1.put("alertEnd", (new StringBuilder()).append(s1).append(" ").append(s).append(" ").append(s2).append(" ").append(list.toUpperCase()).toString());
                }
                arraylist.add(hashmap1);
            }
        }
        hashmap.put("alerts", arraylist);
        return (new Gson()).toJson(hashmap);
    }

    private void onInitRefreshService()
    {
        refreshService.setData(Data.getInstance(getApplicationContext()));
        refreshService.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(this));
    }

    private void prepareSendDataToWear(final WeatherDataModel wdm)
    {
        checkPeerConnect(new IPeerConnectedListener() {

            final WearablesService this$0;
            final WeatherDataModel val$wdm;

            public void onPeerConnected()
            {
                if (isLocationServiceEnabled())
                {
                    if (wdm != null)
                    {
                        setWearablesIsCurrentLocation(true);
                        startTaskSend(wdm);
                        return;
                    } else
                    {
                        onDataError();
                        return;
                    }
                } else
                {
                    setWearablesIsCurrentLocation(false);
                    sendHomeLocation();
                    return;
                }
            }

            
            {
                this$0 = WearablesService.this;
                wdm = weatherdatamodel;
                super();
            }
        });
    }

    private void refresh(String s)
    {
        Log.i("WearablesService", (new StringBuilder()).append("Start refresh with key: ").append(s).toString());
        refreshService.refreshForWearable(s);
    }

    private void sendHomeLocation()
    {
        Object obj = getData().getHomeLocation();
        obj = getData().getWeatherDataModelFromCode(((LocationModel) (obj)).getLocKey());
        if (obj != null && WeatherDataUtility.isWeatherModelValid(((WeatherDataModel) (obj))))
        {
            startTaskSend(((WeatherDataModel) (obj)));
            return;
        } else
        {
            Log.e("WearablesService", (new StringBuilder()).append("Send data error - home weatherdatamodel null or invalid data: ").append(obj).toString());
            return;
        }
    }

    private void setGPSKey(String s)
    {
        if (s != null)
        {
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("GPS_LOCATION_KEY", s).commit();
        }
    }

    private void setWearablesIsCurrentLocation(boolean flag)
    {
        PreferenceUtils.save(this, "is_wearables_current_location", flag);
    }

    protected abstract void cancelAlarm(Context context);

    public void checkPeerConnect(final IPeerConnectedListener listener)
    {
        Wearable.NodeApi.getConnectedNodes(mGoogleApiClient).setResultCallback(new ResultCallback() {

            final WearablesService this$0;
            final IPeerConnectedListener val$listener;

            public volatile void onResult(Result result)
            {
                onResult((com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult)result);
            }

            public void onResult(com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult getconnectednodesresult)
            {
                if (getconnectednodesresult != null && getconnectednodesresult.getNodes() != null && getconnectednodesresult.getNodes().size() > 0)
                {
                    Log.i("WearablesService", (new StringBuilder()).append("checkPeerConnect.onResult node connected - getNodes().size(): ").append(getconnectednodesresult.getNodes().size()).toString());
                    if (listener != null)
                    {
                        listener.onPeerConnected();
                    }
                    return;
                } else
                {
                    Log.i("WearablesService", (new StringBuilder()).append("checkPeerConnect.onResult node not connected - getNodes().size(): ").append(getconnectednodesresult.getNodes().size()).toString());
                    return;
                }
            }

            
            {
                this$0 = WearablesService.this;
                listener = ipeerconnectedlistener;
                super();
            }
        });
    }

    public Map createMapData()
    {
        HashMap hashmap = new HashMap();
        if (mAlert != null)
        {
            hashmap.put("alert", mAlert);
            mAlert = null;
        }
        if (mHourly != null)
        {
            hashmap.put("hourly", mHourly);
            mHourly = null;
        }
        if (mMinuteCast != null)
        {
            hashmap.put("minutecast", mMinuteCast);
            mMinuteCast = null;
        }
        if (mCurrentConditions != null)
        {
            hashmap.put("current-conditions", mCurrentConditions);
            mCurrentConditions = null;
        }
        return hashmap;
    }

    protected String getGPSKey()
    {
        return PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("GPS_LOCATION_KEY", null);
    }

    protected Handler getHandler()
    {
        if (mHandler == null)
        {
            mHandler = new Handler(getMainLooper());
        }
        return mHandler;
    }

    public boolean isLocationServiceEnabled()
    {
        String s = ((LocationManager)getSystemService("location")).getBestProvider(new Criteria(), true);
        return s != null && !s.isEmpty() && !s.trim().isEmpty() && !"passive".equals(s);
    }

    public void onConnected(Bundle bundle)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onConnected: ").append(bundle).toString());
        refreshGPSLocation();
        (new SendToDataLayerThread("/is-paid-value", String.valueOf(false))).start();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onConnectionFailed: ").append(connectionresult).toString());
    }

    public void onConnectionSuspended(int i)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onConnectionSuspended: ").append(i).toString());
    }

    public void onCreate()
    {
        Log.i("WearablesService", " onCreated");
        super.onCreate();
        onInitGoogleApi();
        onInitRefreshService();
        Data.getInstance(getApplicationContext()).init();
        Data.getInstance(getApplicationContext()).registerWeatherDataListener(this);
        Data.getInstance(getApplicationContext()).registerWeatherDataListenerForWearable(this);
        onStart();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        if (Log.isLoggable("WearablesService", 3))
        {
            Log.d("WearablesService", (new StringBuilder()).append("onDataChanged: ").append(dataeventbuffer).toString());
        }
    }

    public void onDestroy()
    {
        Log.i("WearablesService", " onDestroy");
        onStop();
        Data.getInstance(getApplicationContext()).unregisterWeatherDataListener(this);
        Data.getInstance(getApplicationContext()).unregisterWeatherDataListenerForWearable(this);
        super.onDestroy();
    }

    public void onError(Exception exception)
    {
        Log.e("WearablesService", (new StringBuilder()).append("WEARSERVICE \nonError exception: ").append(exception).toString());
        prepareSendDataToWear(null);
    }

    public Map onGenerateJsonData(WeatherDataModel weatherdatamodel)
    {
        onUpdateCurrentConditions(weatherdatamodel);
        onUpdateHourly(weatherdatamodel);
        onUpdateMinuteCast(weatherdatamodel);
        onUpdateAlert(weatherdatamodel);
        return createMapData();
    }

    public String onGetJsonHourly(HourlyResults hourlyresults)
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("currentTime", getCurrentTime());
        if (hourlyresults != null && hourlyresults.size() > 0)
        {
            Locale locale = mContext.getResources().getConfiguration().locale;
            int i = 0;
            hourlyresults = hourlyresults.iterator();
            int j;
            do
            {
                if (!hourlyresults.hasNext())
                {
                    break;
                }
                HourlyResult hourlyresult = (HourlyResult)hourlyresults.next();
                HashMap hashmap1 = new HashMap();
                hashmap1.put("time", getTimeWithSetting(hourlyresult, locale).toUpperCase());
                hashmap1.put("weatherIcon", hourlyresult.getWeatherIcon());
                hashmap1.put("temperature", (new StringBuilder()).append(Math.round(hourlyresult.getTemperature().getValue().doubleValue())).append("").toString());
                arraylist.add(hashmap1);
                j = i + 1;
                i = j;
            } while (j < 12);
        }
        hashmap.put("hourly", arraylist);
        return (new Gson()).toJson(hashmap);
    }

    public String onGetJsonMinuteCast(WeatherDataModel weatherdatamodel)
    {
        Object obj1 = weatherdatamodel.getMinuteCastResult();
        HashMap hashmap = new HashMap();
        String s = getCurrentTime();
        boolean flag;
        if (MinuteCastUtilities.isMinuteCastLocation(weatherdatamodel) && MinuteCastUtilities.isMinuteCastSupportedLanguage())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashmap.put("currentTime", s);
        hashmap.put("isMinuteCastLocation", Boolean.valueOf(flag));
        if (flag && obj1 != null && ((MinuteCastResult) (obj1)).getSummaries() != null && ((MinuteCastResult) (obj1)).getSummaries().size() > 0)
        {
            hashmap.put("minuteCastSummary", ((MinuteCastResult) (obj1)).getSummary().getPhrase_60());
            hashmap.put("locationName", WeatherDataUtility.getAddressFromWeatherDataModel(mContext, weatherdatamodel));
            Object obj2 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            int i = 0;
            Iterator iterator = ((MinuteCastResult) (obj1)).getIntervals().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = ((Intervals)iterator.next()).getColor();
                HashMap hashmap1 = new HashMap();
                int j;
                if (obj != null)
                {
                    obj = ((Color) (obj)).getHex();
                } else
                {
                    obj = "";
                }
                hashmap1.put("color", obj);
                ((List) (obj2)).add(hashmap1);
                obj = new HashMap();
                ((HashMap) (obj)).put("iconName", WeatherDataUtility.getPrecipitationImageResourceName("ic_minute_cast_", i, weatherdatamodel));
                arraylist.add(obj);
                j = i + 1;
                i = j;
            } while (j < 60);
            hashmap.put("minuteSegments", obj2);
            hashmap.put("minuteCastIcons", arraylist);
            weatherdatamodel = new ArrayList();
            for (obj = ((MinuteCastResult) (obj1)).getSummaries().iterator(); ((Iterator) (obj)).hasNext(); weatherdatamodel.add(obj2))
            {
                obj1 = (Summaries)((Iterator) (obj)).next();
                obj2 = new HashMap();
                ((HashMap) (obj2)).put("minute", (new StringBuilder()).append(((Summaries) (obj1)).getStartMinute()).append("").toString());
            }

            hashmap.put("startMinuteSegments", weatherdatamodel);
        }
        return (new Gson()).toJson(hashmap);
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (locationsearch != null)
        {
            locationsearch = (LocationSearchResult)locationsearch.get(0);
            if (locationsearch != null && list.get(0) != null)
            {
                if (((LocationGeoRequest)list.get(0)).isFollowMeRequest() || ((LocationGeoRequest)list.get(0)).isWearable())
                {
                    setGPSKey(locationsearch.getKey());
                }
                if (((LocationGeoRequest)list.get(0)).isWearable())
                {
                    getData().setCurrentFollowMeLocation(locationsearch.toLocationModel());
                    refreshGPSLocation();
                }
            }
        }
    }

    public void onHomeLocationChanged()
    {
        Log.d("WearablesService", "onHomeLocationChanged ");
    }

    public void onInitGoogleApi()
    {
        mContext = getApplicationContext();
        if (mGoogleApiClient == null)
        {
            mGoogleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        }
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onMessageReceived: ").append(messageevent.getRequestId()).append(" ").append(messageevent.getPath()).toString());
        if (messageevent.getPath().equals("/start-activity"))
        {
            onOpenApp(messageevent);
            return;
        } else
        {
            onStartService();
            return;
        }
    }

    protected abstract void onOpenApp(MessageEvent messageevent);

    public void onPeerConnected(Node node)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onPeerConnected: ").append(node).toString());
    }

    public void onPeerDisconnected(Node node)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onPeerDisconnected: ").append(node).toString());
    }

    public void onStart()
    {
        Log.i("WearablesService", "onStart");
        if (mResolvingError)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        mGoogleApiClient.connect();
        Wearable.DataApi.addListener(mGoogleApiClient, this);
        Wearable.MessageApi.addListener(mGoogleApiClient, this);
        Wearable.NodeApi.addListener(mGoogleApiClient, this);
        return;
        Exception exception;
        exception;
        Log.e("WearablesService", (new StringBuilder()).append("onStart: connect to GoogleApiClient exception: ").append(exception).toString());
        return;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Log.i("WearablesService", " onStartCommand");
        if (intent != null)
        {
            boolean flag = intent.getBooleanExtra("update_wearables_service", false);
            Log.i("WearablesService", (new StringBuilder()).append("Update Wearables Service: ").append(flag).toString());
            if (flag)
            {
                refreshGPSLocation();
            }
        }
        return 1;
    }

    protected abstract void onStartService();

    public void onStop()
    {
        if (!mResolvingError)
        {
            Wearable.DataApi.removeListener(mGoogleApiClient, this);
            Wearable.MessageApi.removeListener(mGoogleApiClient, this);
            Wearable.NodeApi.removeListener(mGoogleApiClient, this);
            mGoogleApiClient.disconnect();
        }
    }

    public void onUpdateAlert(WeatherDataModel weatherdatamodel)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onUpdateAlert: ").append(weatherdatamodel.getCityName()).toString());
        mAlert = onGetJsonAlert(weatherdatamodel.getCityName(), weatherdatamodel.getAlerts());
    }

    public void onUpdateCurrentConditions(WeatherDataModel weatherdatamodel)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onUpdateCurrentConditions: ").append(weatherdatamodel.getCityName()).toString());
        Object obj = weatherdatamodel.getCurrentConditionsModel();
        HashMap hashmap = new HashMap();
        hashmap.put("currentTime", getCurrentTime());
        if (((CurrentConditionsResult) (obj)).getTemperature() != null)
        {
            String s;
            String s1;
            String s2;
            if (weatherdatamodel.isMetric())
            {
                s = String.format("%.0f", new Object[] {
                    ((CurrentConditionsResult) (obj)).getTemperature().getMetric().getValue()
                });
            } else
            {
                s = String.format("%.0f", new Object[] {
                    ((CurrentConditionsResult) (obj)).getTemperature().getImperial().getValue()
                });
            }
            hashmap.put("temperature", (new StringBuilder()).append(s).append("\260").toString());
        }
        s = String.format("%d", new Object[] {
            ((CurrentConditionsResult) (obj)).getWeatherIcon()
        });
        obj = WeatherDataUtility.getHighTemperatureText(mContext, weatherdatamodel, 0);
        s1 = WeatherDataUtility.getLowTemperatureText(mContext, weatherdatamodel, 0);
        s2 = WeatherDataUtility.getLocationModel(weatherdatamodel, mContext).getAlias();
        hashmap.put("isGpsResult", Boolean.toString(checkIfWearablesCurrentLocation()));
        hashmap.put("weatherIcon", s);
        hashmap.put("hiloTemperature", (new StringBuilder()).append(((String) (obj))).append("/").append(s1).toString());
        hashmap.put("locationName", s2);
        if (weatherdatamodel.getAlerts() != null)
        {
            weatherdatamodel = (new StringBuilder()).append(weatherdatamodel.getAlerts().size()).append("").toString();
        } else
        {
            weatherdatamodel = "0";
        }
        hashmap.put("alertCount", weatherdatamodel);
        mCurrentConditions = (new Gson()).toJson(hashmap);
    }

    public void onUpdateHourly(WeatherDataModel weatherdatamodel)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onUpdateHourly: ").append(weatherdatamodel.getCityName()).toString());
        mHourly = onGetJsonHourly(weatherdatamodel.getHourly());
    }

    public void onUpdateMinuteCast(WeatherDataModel weatherdatamodel)
    {
        Log.d("WearablesService", (new StringBuilder()).append("onUpdateMinuteCast: ").append(weatherdatamodel.getCityName()).toString());
        mMinuteCast = onGetJsonMinuteCast(weatherdatamodel);
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        int i = 0;
        while (i < list.size()) 
        {
            Log.i("WearablesService", (new StringBuilder()).append("onWeatherCallCompleted modelName: ").append(((WeatherDataModel)list.get(i)).getCityName()).toString());
            if (((WeatherUpdateRequest)list1.get(i)).isWearable() || ((WeatherUpdateRequest)list1.get(i)).isResultOfGpsSearch())
            {
                prepareSendDataToWear((WeatherDataModel)list.get(i));
            } else
            if (((WeatherUpdateRequest)list1.get(i)).isPrimaryLocation())
            {
                refreshGPSLocation();
            }
            i++;
        }
    }

    public void refreshGPSLocation()
    {
        checkPeerConnect(new IPeerConnectedListener() {

            final WearablesService this$0;

            public void onPeerConnected()
            {
                Handler handler = getHandler();
                if (handler != null && isTermsAndConditionsAccepted())
                {
                    handler.removeCallbacks(mRunnableRefresh);
                    handler.postDelayed(mRunnableRefresh, 2000L);
                }
            }

            
            {
                this$0 = WearablesService.this;
                super();
            }
        });
    }

    protected abstract void startRepeatingAlarm(Context context);

    public void startTaskSend(WeatherDataModel weatherdatamodel)
    {
        if (mContext == null)
        {
            Log.e("WearablesService", "startTaskSend error with mContext==null");
            return;
        }
        if (mHandler == null)
        {
            mHandler = new Handler(mContext.getMainLooper());
        }
        mHandler.removeCallbacks(mRunnableStartTaskSend);
        mRunnableStartTaskSend.setData(weatherdatamodel);
        mHandler.postDelayed(mRunnableStartTaskSend, 2000L);
    }









}
