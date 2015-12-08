// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RemoteViews;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.ITaskFactory;
import com.accuweather.android.services.TaskFactoryImpl;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.IClock;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PersistanceUtils;
import com.accuweather.android.utilities.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.accuweather.android.widgets:
//            ClockWidgetScheduler, WidgetWeatherRetriever, IWidgetUiBuilder, AccuRemoteViews

public abstract class ClockWidgetUpdateService extends Service
    implements com.accuweather.android.utilities.Data.IWidgetWeatherDataListener
{
    private class WidgetException extends Exception
    {

        final ClockWidgetUpdateService this$0;

        public WidgetException(String s, Throwable throwable)
        {
            this$0 = ClockWidgetUpdateService.this;
            super(s, throwable);
        }
    }


    private static final String ACCUWX_FOLLOW_ME_MODEL_FILE_NAME = "accuwx_al_widget_followme";
    private IClock mClock;
    private ClockWidgetScheduler mClockWidgetScheduler;
    private WeatherDataModel mCurrentFollowMeWeatherDataModel;
    private boolean mIsFirstAppWidgetUpdate;
    private View mLastRemoteViewForTesting;
    private com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener mLocationConverterListener;
    private ITaskFactory mTaskFactory;
    private HashMap mWidgetIdToLocationKeyMap;
    private int mWidgetIds[];
    private IWidgetUiBuilder mWidgetUiBuilder;
    private WidgetWeatherRetriever mWidgetWeatherRetriever;

    public ClockWidgetUpdateService()
    {
        mWidgetIds = new int[0];
        mWidgetIdToLocationKeyMap = new HashMap();
        mClock = new SystemClock();
        mTaskFactory = new TaskFactoryImpl();
        mClockWidgetScheduler = new ClockWidgetScheduler();
        mWidgetWeatherRetriever = new WidgetWeatherRetriever();
        mIsFirstAppWidgetUpdate = true;
        mLocationConverterListener = new com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener() {

            final ClockWidgetUpdateService this$0;

            public void onConversionCompleted(List list)
            {
                updateWeatherContent();
            }

            public void onConversionError(Exception exception)
            {
            }

            
            {
                this$0 = ClockWidgetUpdateService.this;
                super();
            }
        };
    }

    private void addInitialPreloadLocation()
    {
label0:
        {
            if (PartnerCoding.isDefaultLocationPreload(this))
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), (new StringBuilder()).append("In addInitialPreloadLocation(), mWidgetIds = ").append(buildWidgetIdsStringForDebug(mWidgetIds)).toString());
                }
                if (mWidgetIds == null || mWidgetIds.length <= 0)
                {
                    break label0;
                }
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), (new StringBuilder()).append("In addInitalPreloadLocation, widget ids size is ").append(mWidgetIds.length).toString());
                }
                if (!getData(this).hasDefaultLocationBeenAdded())
                {
                    mWidgetIdToLocationKeyMap.put(Integer.valueOf(mWidgetIds[mWidgetIds.length - 1]), "");
                    saveWidgetIdMap();
                    mWidgetWeatherRetriever.performPreloadLocationKeySearch(getData(this));
                }
            }
            return;
        }
        Logger.d(getClass().getName(), "In addInitialPreloadLocation(), in ELSE BLOCK because the mWidgetIds array is bad: ");
    }

    private String buildWidgetIdsStringForDebug(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder("N/A");
        if (ai != null)
        {
            stringbuilder.setLength(0);
            for (int i = 0; i < ai.length; i++)
            {
                stringbuilder.append(ai[i]);
                if (i != ai.length - 1)
                {
                    stringbuilder.append(",");
                }
            }

        }
        return stringbuilder.toString();
    }

    private boolean doesGpsWidgetLocationExist()
    {
        return mWidgetIdToLocationKeyMap.containsValue("-1");
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private String getDeletedLocationKey(Intent intent)
    {
        if (intent.getStringExtra("location_code_delete") != null)
        {
            return intent.getStringExtra("location_code_delete");
        } else
        {
            return "-1";
        }
    }

    private WeatherDataModel getFollowMeWeatherDataModelFromSharedPreferences(Context context)
    {
        return (WeatherDataModel)PersistanceUtils.getObjectFromSharedPreferences("accuwx_al_widget_followme", com/accuweather/android/models/WeatherDataModel, context);
    }

    private String getLocalizedTimeString()
    {
        return DateUtils.getLocalizedStringTime(this, mClock.getCalendar(), DateUtils.is24HourFormat(this));
    }

    private List getStaticLocationKeys()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mWidgetIdToLocationKeyMap.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!"-1".equals(s))
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    private WeatherDataModel getWeatherDataModel(int i)
    {
        String s = (String)mWidgetIdToLocationKeyMap.get(Integer.valueOf(i));
        if (s.equals("-1"))
        {
            return mCurrentFollowMeWeatherDataModel;
        } else
        {
            return getData(this).getWeatherDataModelFromCode(s);
        }
    }

    private int[] getWidgetIdsForLocationKey(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mWidgetIdToLocationKeyMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            if (((String)mWidgetIdToLocationKeyMap.get(Integer.valueOf(i))).equals(s))
            {
                arraylist.add(Integer.valueOf(i));
            }
        } while (true);
        s = new int[arraylist.size()];
        for (int j = 0; j < arraylist.size(); j++)
        {
            s[j] = ((Integer)arraylist.get(j)).intValue();
        }

        return s;
    }

    private void goToFreeVersion(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append("com.accuweather.android").toString()));
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }

    private boolean isGpsWidget(int i)
    {
        return "-1".equals(mWidgetIdToLocationKeyMap.get(Integer.valueOf(i)));
    }

    private void onAppWidgetDeleted(Intent intent, int ai[])
    {
        if (intent.getExtras() != null && intent.getExtras().containsKey("appWidgetId"))
        {
            removeWidgetsById(new int[] {
                intent.getExtras().getInt("appWidgetId")
            });
        }
        stopServiceIfNoMoreWidgets(ai);
    }

    private void onAppWidgetDisabled(int ai[])
    {
        mClockWidgetScheduler.cancelClockTimeUpdate(this);
        mClockWidgetScheduler.cancelWeatherUpdate(this);
        stopServiceIfNoMoreWidgets(ai);
    }

    private void onAppWidgetEnabled(int ai[])
    {
        Data.getInstance(this).init();
        mClockWidgetScheduler.scheduleWidgetClockUpdateAlarm(this);
        mClockWidgetScheduler.scheduleWidgetContentUpdateAlarm(this);
        mWidgetWeatherRetriever.setStartTime(android.os.SystemClock.elapsedRealtime());
    }

    private void onAppWidgetUpdate()
    {
        addInitialPreloadLocation();
        if (mIsFirstAppWidgetUpdate)
        {
            mIsFirstAppWidgetUpdate = false;
            updateWeatherContent();
        }
    }

    private void onClockTimeUpdate()
    {
        addInitialPreloadLocation();
        updateWidgetClocks();
        mClockWidgetScheduler.scheduleWidgetClockUpdateAlarm(this);
    }

    private void onGetFullApp()
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("upgraded_from_android_lite", true).commit();
        (new PartnerCoding()).initializePartnerCode(this);
        Logger.d(getClass().getName(), PreferenceManager.getDefaultSharedPreferences(this).getString("pref_p_code", "androidflagship3.3"));
        goToFreeVersion(this);
    }

    private int onIntent(Intent intent)
    {
        String s1;
        int ai[];
        if (intent == null || intent.getAction() == null)
        {
            if (Logger.isDebugEnabled())
            {
                String s = getClass().getName();
                StringBuilder stringbuilder = (new StringBuilder()).append("In handleStart() return early block, intent = ").append(intent).append(", action = ");
                if (intent != null)
                {
                    intent = intent.getAction();
                } else
                {
                    intent = null;
                }
                Logger.d(s, stringbuilder.append(intent).toString());
            }
            return 1;
        }
        s1 = intent.getAction();
        ai = getAppWidgetIds(this);
        mWidgetIds = ai;
        mClockWidgetScheduler.setPendingIntentRequestCode(getPendingIntentRequestCode());
        if (!s1.equals("android.appwidget.action.APPWIDGET_DELETED")) goto _L2; else goto _L1
_L1:
        onAppWidgetDeleted(intent, ai);
_L4:
        if (ai == null || ai.length == 0)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In handleStart() return early block due to empty or null widgetIds array, intent = ").append(intent).append(", action = ").append(s1).toString());
            }
            stopSelf();
            return 1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("android.appwidget.action.APPWIDGET_DISABLED"))
        {
            onAppWidgetDisabled(ai);
        }
        if (true) goto _L4; else goto _L3
_L3:
        reloadDataIfRequired(this);
        mWidgetIdToLocationKeyMap = getWidgetIdMap();
        mWidgetUiBuilder = getWidgetUiBuilder(this, mWidgetIdToLocationKeyMap);
        WeatherDataModel weatherdatamodel = getFollowMeWeatherDataModelFromSharedPreferences(this);
        if (weatherdatamodel != null)
        {
            mCurrentFollowMeWeatherDataModel = weatherdatamodel;
        }
        getData(this).setTaskFactory(mTaskFactory);
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In handleStart(), mWidgetIdToLocationKeyMap = ").append(mWidgetIdToLocationKeyMap).append(", mWidgetIds = ").append(buildWidgetIdsStringForDebug(mWidgetIds)).append(", action = ").append(intent.getAction()).toString());
        }
        if (!getData(this).areLocationsTheNewestVersion())
        {
            getData(this).upgradeLocationModels(mLocationConverterListener);
        }
        if (s1.equals("accuwx.intent.action.UPDATE_METRIC") || s1.equals("android.net.conn.CONNECTIVITY_CHANGE") || s1.equals("accuwx.intent.action.UPDATE_WIDGET_DATA") || s1.equals("android.intent.action.LOCALE_CHANGED"))
        {
            updateWeatherContent();
            return 1;
        }
        if (s1.equals("android.intent.action.TIME_SET") || s1.equals("android.intent.action.TIMEZONE_CHANGED") || s1.equals("com.accuweather.android.widget.CLOCK_WIDGET_UPDATE"))
        {
            onClockTimeUpdate();
            return 1;
        }
        if (s1.equals("accuwx.intent.action.DELETE_LOCATION"))
        {
            onLocationDeleted(intent);
            return 1;
        }
        if (s1.equals("android.appwidget.action.APPWIDGET_UPDATE"))
        {
            onAppWidgetUpdate();
            return 1;
        }
        if (s1.equals("android.appwidget.action.APPWIDGET_ENABLED"))
        {
            onAppWidgetEnabled(ai);
            return 1;
        }
        if (s1.equals("com.accuweather.android.action.GET_FULL_APP"))
        {
            onGetFullApp();
            return 1;
        }
        if (s1.equals("android.location.PROVIDERS_CHANGED"))
        {
            retrieveWeatherForGpsWidgets();
            return 1;
        } else
        {
            onAppWidgetUpdate();
            return 1;
        }
    }

    private void onLocationDeleted(Intent intent)
    {
        intent = getWidgetIdsForLocationKey(getDeletedLocationKey(intent));
        if (intent.length > 0)
        {
            for (int i = 0; i < intent.length; i++)
            {
                updateWidgetUiForDeletedLocation(intent[i]);
            }

            removeWidgetsById(intent);
        }
    }

    private void retrieveWeatherForStaticLocationWidgets()
    {
        List list = getStaticLocationKeys();
        if (!list.isEmpty())
        {
            mWidgetWeatherRetriever.retrieveWeather(getData(this), list);
        }
    }

    private void saveFollowMeWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        PersistanceUtils.saveObjectToSharedPreferences("accuwx_al_widget_followme", weatherdatamodel, this);
    }

    private void stopServiceIfNoMoreWidgets(int ai[])
    {
        if (ai.length == 0)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "In handleStart() DELETED block, no widget ids left and about to stop service.");
            }
            stopSelf();
        }
    }

    private void updateAllWidgetDisplays()
    {
        for (int i = 0; i < mWidgetIds.length; i++)
        {
            updateWidgetDisplay(mWidgetIds[i]);
        }

    }

    private void updateDeletedWidgetLocationUis()
    {
        int ai[] = mWidgetIds;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (hasWidgetIdBeenDeleted(k))
            {
                updateWidgetUiForDeletedLocation(k);
            }
        }

    }

    private void updateGpsWidgetUiForNoLocation(int i)
    {
        AccuRemoteViews accuremoteviews = mWidgetUiBuilder.buildRemoteViewForGpsTimeout(i, getLocalizedTimeString());
        AppWidgetManager.getInstance(this).updateAppWidget(i, accuremoteviews);
        mLastRemoteViewForTesting = accuremoteviews.getLayoutForTest();
    }

    private void updateWeatherContent()
    {
        updateDeletedWidgetLocationUis();
        retrieveWeatherForStaticLocationWidgets();
        retrieveWeatherForGpsWidgets();
    }

    private void updateWidgetClocks()
    {
        int i = 0;
        while (i < mWidgetIds.length) 
        {
            if (mWidgetIdToLocationKeyMap.get(Integer.valueOf(mWidgetIds[i])) != null)
            {
                updateWidgetDisplay(mWidgetIds[i]);
            } else
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateContentForTime(), no locationKey mapping exists for widgetId ").append(mWidgetIds[i]).append(", current map = ").append(mWidgetIdToLocationKeyMap).toString());
            }
            i++;
        }
    }

    private void updateWidgetDisplay(int i)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In updateWidgetDisplay(), widgetId arg = ").append(i).append(", widgetIds list = ").append(buildWidgetIdsStringForDebug(mWidgetIds)).toString());
        }
        if (!mWidgetIdToLocationKeyMap.containsKey(Integer.valueOf(i))) goto _L2; else goto _L1
_L1:
        Object obj = getWeatherDataModel(i);
        if (obj == null || !((WeatherDataModel) (obj)).isDataValid()) goto _L4; else goto _L3
_L3:
        obj = mWidgetUiBuilder.buildRemoteView(i, ((WeatherDataModel) (obj)), getLocalizedTimeString());
        AppWidgetManager.getInstance(this).updateAppWidget(i, ((RemoteViews) (obj)));
        mLastRemoteViewForTesting = ((AccuRemoteViews) (obj)).getLayoutForTest();
_L6:
        return;
_L4:
        if (isGpsWidget(i) && mCurrentFollowMeWeatherDataModel == null)
        {
            updateGpsWidgetUiForNoLocation(i);
        }
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In updateWidgetDisplay() ELSE BLOCK!!!****. Widget Will not be updated for widgetId arg = ").append(i).append(", widgetIds list = ").append(buildWidgetIdsStringForDebug(mWidgetIds)).append(", wdm = ").append(obj).append(", widgetIdMap = ").append(mWidgetIdToLocationKeyMap).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (hasWidgetIdBeenDeleted(i))
        {
            updateWidgetUiForDeletedLocation(i);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateWidgetUiForDeletedLocation(int i)
    {
        RemoteViews remoteviews = new RemoteViews(getPackageName(), com.accuweather.android.R.layout.al_widget_deleted_layout);
        AppWidgetManager.getInstance(this).updateAppWidget(i, remoteviews);
    }

    public HashMap TESTING__getWidgetIdToLocationKeyMap()
    {
        return mWidgetIdToLocationKeyMap;
    }

    public int[] TESTING__getWidgetIds()
    {
        return mWidgetIds;
    }

    protected void findLocation()
    {
        mWidgetWeatherRetriever.findFollowMeLocation(getData(this));
    }

    protected abstract int[] getAppWidgetIds(Context context);

    public View getLastRemoteViewForTesting()
    {
        return mLastRemoteViewForTesting;
    }

    protected abstract int getPendingIntentRequestCode();

    protected abstract HashMap getWidgetIdMap();

    protected abstract IWidgetUiBuilder getWidgetUiBuilder(Context context, HashMap hashmap);

    protected abstract boolean hasWidgetIdBeenDeleted(int i);

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        Data.getInstance(this).registerWeatherDataListener(this);
    }

    public void onDestroy()
    {
        Data.getInstance(this).unregisterWeatherDataListener(this);
        super.onDestroy();
    }

    public void onError(Exception exception)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In onError(), exception = ").append(exception).toString());
            exception.printStackTrace();
        }
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
        list = getAppWidgetIds(this);
        if (list != null && list.length > 0 && locationsearch != null && !locationsearch.isEmpty())
        {
            locationsearch = (LocationSearchResult)locationsearch.get(0);
            if (getData(this).getLocations().isEmpty())
            {
                getData(this).addLocation(locationsearch.toLocationModel());
            }
            updateWeatherForGpsWidget(locationsearch.getKey(), this);
        }
    }

    public void onHomeLocationChanged()
    {
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        try
        {
            i = onIntent(intent);
        }
        catch (Exception exception)
        {
            Logger.e(this, (new StringBuilder()).append("Error updating widget ").append(getClass().getSimpleName()).append(" for intent ").append(intent).toString(), new Object[] {
                exception
            });
            return 1;
        }
        return i;
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
    }

    public void onWidgetLocationSearchCompleted(LocationSearch locationsearch)
    {
        int ai[] = getAppWidgetIds(this);
        if (ai != null && ai.length > 0 && locationsearch != null && !locationsearch.isEmpty())
        {
            getData(this).addLocation(((LocationSearchResult)locationsearch.get(0)).toLocationModel());
            updateWeatherContent();
        }
    }

    public void onWidgetWeatherCallCompleted(List list)
    {
        int ai[] = getAppWidgetIds(this);
        if (ai == null || ai.length <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        if (i >= list.size()) goto _L4; else goto _L3
_L3:
        if (!((WeatherDataModel)list.get(i)).isResultOfGpsSearch()) goto _L6; else goto _L5
_L5:
        mCurrentFollowMeWeatherDataModel = (WeatherDataModel)list.get(i);
        saveFollowMeWeatherDataModel(mCurrentFollowMeWeatherDataModel);
_L4:
        updateAllWidgetDisplays();
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void reloadDataIfRequired(Context context)
    {
        getData(context).loadData();
    }

    protected abstract void removeWidgetsById(int ai[]);

    public void retrieveWeatherForGpsWidgets()
    {
        if (doesGpsWidgetLocationExist())
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "In updateWeatherForGpsWidgets(), about to findLocation().");
            }
            findLocation();
        }
    }

    protected abstract void saveWidgetIdMap();

    public void setClock(IClock iclock)
    {
        mClock = iclock;
    }

    public void setTaskFactory(ITaskFactory itaskfactory)
    {
        mTaskFactory = itaskfactory;
    }

    protected void updateWeatherForGpsWidget(String s, Context context)
    {
        mWidgetWeatherRetriever.retrieveWeatherForFollowMe(getData(this), s);
    }

}
