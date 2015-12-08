// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.location.Location;
import com.accuweather.android.exceptions.GpsResultsOutOfBounds;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.ITaskFactory;
import com.accuweather.android.services.LocationUpgraderService;
import com.accuweather.android.services.gps.ILocationListener;
import com.accuweather.android.services.gps.NativeLocationFinder;
import com.accuweather.android.services.request.DmaRequest;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.services.request.Request;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            OptimizedDataPersistance, TaskQueue, FontUtils, Logger, 
//            PreferenceUtils, DataIOException, UserPreferences

public class Data
    implements ILocationListener
{
    public static interface INotificationWeatherDataListener
        extends IWeatherDataListener
    {

        public abstract void onNotificationConnectionError();
    }

    public static interface IWeatherDataListener
    {

        public abstract void onError(Exception exception);

        public abstract void onGpsSearchCompleted(LocationSearch locationsearch, List list);

        public abstract void onHomeLocationChanged();

        public abstract void onLocationSearchCompleted(LocationSearch locationsearch, List list);

        public abstract void onWeatherCallCompleted(List list, List list1);
    }

    public static interface IWidgetWeatherDataListener
        extends IWeatherDataListener
    {

        public abstract void onWidgetLocationSearchCompleted(LocationSearch locationsearch);

        public abstract void onWidgetWeatherCallCompleted(List list);
    }


    private static final String TAG = "Data";
    public static Context mContext;
    private static Data mInstance;
    private boolean isFollowMeCurrentlyViewed;
    private OptimizedDataPersistance mDataPersistance;
    private HashMap mDmaModels;
    private NativeLocationFinder mFinder;
    private NativeLocationFinder mFinderForWearable;
    private boolean mIsFromNotification;
    private boolean mIsFromWearable;
    private boolean mIsFromWidget;
    private boolean mIsLoaded;
    private boolean mIsTesting;
    private String mLastRequestedMetricValue;
    private int mLastViewedPage;
    private LocationRequester mLocationRequester;
    private LocationUpgraderService mLocationUpgraderService;
    private ArrayList mNotificationListeners;
    private TaskQueue mTaskQueue;
    private List mWearableListeners;
    private List mWeatherListeners;
    private ArrayList mWidgetWeatherListeners;

    protected Data(Context context)
    {
        mLastViewedPage = 1;
        mIsLoaded = false;
        mWeatherListeners = Collections.synchronizedList(new ArrayList());
        mWidgetWeatherListeners = new ArrayList();
        mNotificationListeners = new ArrayList();
        mWearableListeners = Collections.synchronizedList(new ArrayList());
        mDmaModels = new HashMap();
        mLastRequestedMetricValue = "";
        mIsTesting = false;
        mDataPersistance = new OptimizedDataPersistance(context);
        mContext = context.getApplicationContext();
        mTaskQueue = new TaskQueue(this);
        mLocationRequester = new LocationRequester(mContext);
    }

    private boolean areCoordinateResultsValid(double d, double d1)
    {
        return d <= 90D && d >= -90D && d1 <= 180D && d1 >= -180D;
    }

    public static Typeface getDefaultTypeface()
    {
        return FontUtils.getDefaultTypeface(mContext);
    }

    public static Data getInstance(Context context)
    {
        com/accuweather/android/utilities/Data;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new Data(context.getApplicationContext());
        }
        context = mInstance;
        com/accuweather/android/utilities/Data;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Typeface getRobotoBold()
    {
        return FontUtils.getRobotoBold(mContext);
    }

    public static Typeface getRobotoBoldCondensed()
    {
        return FontUtils.getRobotoBoldCondensed(mContext);
    }

    public static Typeface getRobotoCondensed()
    {
        return FontUtils.getRobotoCondensed(mContext);
    }

    public static Typeface getRobotoLight()
    {
        return FontUtils.getRobotoLight(mContext);
    }

    public static Typeface getRobotoNormal()
    {
        return FontUtils.getRobotoNormal(mContext);
    }

    public void TESTING_resetSingleton()
    {
        mInstance.setCurrentlyViewedWeatherDataModel(null);
        mInstance = null;
    }

    public boolean addLocation(LocationModel locationmodel)
    {
        return mDataPersistance.addLocation(locationmodel);
    }

    public void addWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        mDataPersistance.addWeatherDataModel(weatherdatamodel);
    }

    public boolean areCachedModelPropertiesExpired(String s, boolean flag, String s1)
    {
        return mDataPersistance.areCachedModelPropertiesExpired(s, flag, s1);
    }

    public boolean areLocationsTheNewestVersion()
    {
        return mDataPersistance.areLocationsTheNewestVersion();
    }

    public boolean areWeatherModelVersionsOutdated()
    {
        return mDataPersistance.areWeatherModelVersionsOutdated();
    }

    public void clearAll()
    {
        mDataPersistance.clearAll();
    }

    public void clearTaskQueue()
    {
        Logger.printMethodTrace(this);
        mTaskQueue.clearTaskQueue();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public boolean deleteLocation(String s)
    {
        return mDataPersistance.deleteLocation(s);
    }

    public boolean doV2LocationsExist()
    {
        return mDataPersistance.doV2LocationsExist();
    }

    public boolean doV2LocationsNeedConverted()
    {
        return mDataPersistance.doV2LocationsNeedConverted();
    }

    public void executeNextTask()
    {
        mTaskQueue.executeNextTask();
    }

    public HashMap getALFollowMeWidgetIdMap()
    {
        return mDataPersistance.getALFollowMeWidgetsIdMap();
    }

    public HashMap getALWidgetIdMap()
    {
        return mDataPersistance.getALWidgetIdMap();
    }

    public Context getContext()
    {
        return mContext;
    }

    public LocationModel getCurrentFollowMeLocation()
    {
        return mDataPersistance.getCurrentFollowMeLocation();
    }

    public WeatherDataModel getCurrentlyViewedWeatherDataModel()
    {
        return mDataPersistance.getCurrentlyViewedWeatherDataModel();
    }

    public HashMap getDmaModels()
    {
        return mDmaModels;
    }

    public void getGpsLocation(boolean flag)
    {
        getGpsLocation(flag, false);
    }

    public void getGpsLocation(boolean flag, boolean flag1)
    {
        if (mFinder == null)
        {
            mFinder = new NativeLocationFinder(mContext);
            mFinder.setLocationListener(this);
        }
        mIsFromNotification = flag;
        mIsFromWidget = flag1;
        mFinder.findLocation();
    }

    public void getGpsLocationOnlyForWearable()
    {
        Logger.i("Data", "getGpsLocationOnlyForWearable");
        if (mFinderForWearable == null)
        {
            mFinderForWearable = new NativeLocationFinder(mContext);
            mFinderForWearable.setLocationListener(new ILocationListener() {

                final Data this$0;

                public void onLocationChanged(double d, double d1)
                {
                    Logger.i("Data", (new StringBuilder()).append("mFinderForWearable onLocationChanged lat-lon: ").append(d).append("-").append(d1).toString());
                    if (areCoordinateResultsValid(d, d1))
                    {
                        mLocationRequester.performGeoSearchForWearable(Double.valueOf(d), Double.valueOf(d1));
                        return;
                    } else
                    {
                        onLocationFixError(new GpsResultsOutOfBounds());
                        return;
                    }
                }

                public void onLocationChanged(Location location)
                {
                    Logger.i("Data", "mFinderForWearable onLocationChanged");
                    if (location == null)
                    {
                        getGpsLocationOnlyForWearable();
                        return;
                    } else
                    {
                        onLocationChanged(location.getLatitude(), location.getLongitude());
                        return;
                    }
                }

                public void onLocationFixError(Exception exception)
                {
                    Logger.e("Data", (new StringBuilder()).append("mFinderForWearable onLocationFixError:").append(exception.getMessage()).toString());
                    notifyErrorForWearables(exception);
                }

            
            {
                this$0 = Data.this;
                super();
            }
            });
        }
        mFinderForWearable.findLocation();
    }

    public LocationModel getHomeLocation()
    {
        return mDataPersistance.getHomeLocation();
    }

    public List getKeys()
    {
        return mDataPersistance.getKeys();
    }

    public String getLangId()
    {
        return mContext.getResources().getString(com.accuweather.android.R.string.lang_id);
    }

    public String getLastRequestedMetricValue()
    {
        return mLastRequestedMetricValue;
    }

    public LocationModel getLastViewedLocation()
    {
        return mDataPersistance.getLastViewedLocation();
    }

    public int getLastViewedPage()
    {
        return mLastViewedPage;
    }

    public List getLocNames()
    {
        return mDataPersistance.getLocNames();
    }

    public LocationModel getLocationFromAliasedName(String s)
    {
        return mDataPersistance.getLocationFromAliasedName(s);
    }

    public LocationModel getLocationFromKey(String s)
    {
        return mDataPersistance.getLocationFromKey(s);
    }

    public LocationModel getLocationFromKeyIgnoringFollowMe(String s)
    {
        return mDataPersistance.getLocationFromKeyIgnoringFollowMe(s);
    }

    public ArrayList getLocations()
    {
        return mDataPersistance.getLocations();
    }

    public Integer getPageNumberForOrientation()
    {
        return Integer.valueOf(PreferenceUtils.get(mContext, "save_current_page_number", 1));
    }

    public List getPrettyNames()
    {
        return mDataPersistance.getPrettyNames();
    }

    public List getPrimarySortedWeatherDataModels()
    {
        return mDataPersistance.getPrimarySortedWeatherDataModels();
    }

    public HashMap getResizableDimensionsMap()
    {
        return mDataPersistance.getResizableDimensionMap();
    }

    public HashMap getResizableWidgetIdMap()
    {
        return mDataPersistance.getResizableWidgetIdMap();
    }

    public HashMap getSharpWidgetIdMap()
    {
        return mDataPersistance.getSharpWidgetIdMap();
    }

    public List getSortedKeysForMaps()
    {
        return mDataPersistance.getSortedKeysForMaps();
    }

    public List getSortedLocationNames()
    {
        return mDataPersistance.getSortedLocationNames();
    }

    public String getV2HomeLocCode()
    {
        return mDataPersistance.getV2HomeLocCode();
    }

    public WeatherDataModel getWeatherDataModelFromCode(String s)
    {
        return mDataPersistance.getWeatherDataModelFromCode(s);
    }

    public List getWeatherDataModels()
    {
        return mDataPersistance.getWeatherDataModelsList();
    }

    public boolean hasALFollowMeWidgetIdBeenDeleted(int i)
    {
        return mDataPersistance.hasALFollowMeWidgetIdBeenDeleted(i);
    }

    public boolean hasALWidgetIdBeenDeleted(int i)
    {
        return mDataPersistance.hasALWidgetIdBeenDeleted(i);
    }

    public boolean hasALocationBeenExplicitlyAdded()
    {
        return PreferenceUtils.get(mContext, "has_location_been_explicitly_added", false);
    }

    public boolean hasCachedValue(String s, boolean flag, String s1)
    {
        return mDataPersistance.hasCachedValue(s, flag, s1);
    }

    public boolean hasDefaultLocationBeenAdded()
    {
        return PreferenceUtils.get(mContext, "default_location_added", false);
    }

    public boolean hasLocation()
    {
        return mDataPersistance.hasLocation();
    }

    public boolean hasPrimaryWeatherDataModel()
    {
        return mDataPersistance.hasPrimaryWeatherDataModel();
    }

    public boolean hasSharpWidgetIdBeenDeleted(int i)
    {
        return mDataPersistance.hasSharpWidgetIdBeenDeleted(i);
    }

    public void init()
    {
        if (mIsLoaded)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        mIsLoaded = true;
        requestDma();
        mDataPersistance.loadData();
        return;
        DataIOException dataioexception;
        dataioexception;
        mIsLoaded = false;
        Logger.e(getClass().getName(), (new StringBuilder()).append("An error occurred loading the data models: ").append(dataioexception).toString());
        return;
    }

    public boolean isFollowMeCurrentlyViewed()
    {
        return isFollowMeCurrentlyViewed;
    }

    public boolean isFullWeatherUpdateRequired(WeatherUpdateRequest weatherupdaterequest)
    {
        return mDataPersistance.isFullWeatherUpdateRequired(weatherupdaterequest);
    }

    public boolean isTesting()
    {
        return mIsTesting;
    }

    public void loadData()
    {
        try
        {
            Logger.d(getClass().getName(), "In loadData().");
            mDataPersistance.loadData();
            return;
        }
        catch (DataIOException dataioexception)
        {
            Logger.e(getClass().getName(), (new StringBuilder()).append("An error occurred in loadData(): ").append(dataioexception).toString());
        }
    }

    public void markAsDirty()
    {
        mDataPersistance.markAsDirty();
    }

    public void notifyErrorForWearables(Exception exception)
    {
        List list = mWearableListeners;
        list;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= mWearableListeners.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((IWeatherDataListener)mWearableListeners.get(i)).onError(exception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void notifyGpsSearchCompleteForWearable(LocationSearch locationsearch, List list)
    {
        Logger.i("Data", (new StringBuilder()).append("notifyGpsSearchCompleteForWearable ").append(((LocationSearchResult)locationsearch.get(0)).getPrettyName()).toString());
        for (int i = 0; i < mWearableListeners.size(); i++)
        {
            ((IWeatherDataListener)mWearableListeners.get(i)).onGpsSearchCompleted(locationsearch, list);
        }

    }

    public void notifyGpsSearchCompleted(LocationSearch locationsearch, List list, boolean flag)
    {
        if (!flag)
        {
            for (int i = 0; i < mWeatherListeners.size(); i++)
            {
                ((IWeatherDataListener)mWeatherListeners.get(i)).onGpsSearchCompleted(locationsearch, list);
            }

        }
        for (int j = 0; j < mNotificationListeners.size(); j++)
        {
            ((INotificationWeatherDataListener)mNotificationListeners.get(j)).onGpsSearchCompleted(locationsearch, list);
        }

        for (int k = 0; k < mWidgetWeatherListeners.size(); k++)
        {
            ((IWidgetWeatherDataListener)mWidgetWeatherListeners.get(k)).onGpsSearchCompleted(locationsearch, list);
        }

    }

    public void notifyLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        for (int i = 0; i < mWeatherListeners.size(); i++)
        {
            if (mWeatherListeners.get(i) != null)
            {
                ((IWeatherDataListener)mWeatherListeners.get(i)).onLocationSearchCompleted(locationsearch, list);
            }
        }

        for (int j = 0; j < mWidgetWeatherListeners.size(); j++)
        {
            if (mWidgetWeatherListeners.get(j) != null)
            {
                ((IWidgetWeatherDataListener)mWidgetWeatherListeners.get(j)).onLocationSearchCompleted(locationsearch, list);
            }
        }

        for (int k = 0; k < mNotificationListeners.size(); k++)
        {
            if (mNotificationListeners.get(k) != null)
            {
                ((INotificationWeatherDataListener)mNotificationListeners.get(k)).onLocationSearchCompleted(locationsearch, list);
            }
        }

    }

    public void notifyMainAppWeatherCallError(Exception exception)
    {
        for (Iterator iterator = mWeatherListeners.iterator(); iterator.hasNext(); ((IWeatherDataListener)iterator.next()).onError(exception)) { }
    }

    public void notifyNotificationConnectionError()
    {
        for (int i = 0; i < mNotificationListeners.size(); i++)
        {
            ((INotificationWeatherDataListener)mNotificationListeners.get(i)).onNotificationConnectionError();
        }

    }

    public void notifyNotificationWeatherCallCompleted(List list, List list1)
    {
        for (int i = 0; i < mNotificationListeners.size(); i++)
        {
            ((INotificationWeatherDataListener)mNotificationListeners.get(i)).onWeatherCallCompleted(list, list1);
        }

    }

    public void notifyNotificationWeatherCallError(Exception exception)
    {
        for (int i = 0; i < mNotificationListeners.size(); i++)
        {
            ((INotificationWeatherDataListener)mNotificationListeners.get(i)).onError(exception);
        }

    }

    public void notifyWeatherCallCompleted(List list, List list1)
    {
        List list2 = mWeatherListeners;
        list2;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= mWeatherListeners.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((IWeatherDataListener)mWeatherListeners.get(i)).onWeatherCallCompleted(list, list1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        list2;
        JVM INSTR monitorexit ;
        return;
        list;
        list2;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void notifyWeatherCallCompletedForWearables(List list, List list1)
    {
        List list2 = mWearableListeners;
        list2;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= mWearableListeners.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((IWeatherDataListener)mWearableListeners.get(i)).onWeatherCallCompleted(list, list1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        list2;
        JVM INSTR monitorexit ;
        return;
        list;
        list2;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void notifyWidgetLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        for (int i = 0; i < mWidgetWeatherListeners.size(); i++)
        {
            if (mWidgetWeatherListeners.get(i) != null)
            {
                ((IWidgetWeatherDataListener)mWidgetWeatherListeners.get(i)).onWidgetLocationSearchCompleted(locationsearch);
            }
        }

    }

    public void notifyWidgetWeatherCallCompleted(List list)
    {
        String s = getClass().getName();
        StringBuilder stringbuilder = (new StringBuilder()).append("In notifyWidgetWeatherCallCompleted(), models size = ");
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        Logger.d(s, stringbuilder.append(i).toString());
        for (i = 0; i < mWidgetWeatherListeners.size(); i++)
        {
            ((IWidgetWeatherDataListener)mWidgetWeatherListeners.get(i)).onWidgetWeatherCallCompleted(list);
        }

    }

    public void notifyWidgetWeatherCallError(Exception exception)
    {
        for (int i = 0; i < mWidgetWeatherListeners.size(); i++)
        {
            ((IWidgetWeatherDataListener)mWidgetWeatherListeners.get(i)).onError(exception);
        }

    }

    public void onLocationChanged(double d, double d1)
    {
        if (areCoordinateResultsValid(d, d1))
        {
            mLocationRequester.performGeoSearch(Double.valueOf(d), Double.valueOf(d1), true, mIsFromNotification, mIsFromWidget);
            return;
        } else
        {
            onLocationFixError(new GpsResultsOutOfBounds());
            return;
        }
    }

    public void onLocationChanged(Location location)
    {
        if (location == null)
        {
            getGpsLocation(false);
            return;
        } else
        {
            onLocationChanged(location.getLatitude(), location.getLongitude());
            return;
        }
    }

    public void onLocationFixError(Exception exception)
    {
        Logger.d(this, (new StringBuilder()).append("In onLocationFixError(), exception = ").append(exception).append(", from notification? ").append(mIsFromNotification).append(", from widget? ").append(mIsFromWidget).toString());
        if (mIsFromWidget)
        {
            notifyWidgetWeatherCallError(exception);
            return;
        }
        if (mIsFromNotification)
        {
            notifyNotificationWeatherCallError(exception);
            return;
        } else
        {
            notifyMainAppWeatherCallError(exception);
            return;
        }
    }

    public void performLocationKeySearchForWidget(String s)
    {
        mLocationRequester.performLocationKeySearchForWidget(s);
    }

    public void queueRequest(List list)
    {
        mTaskQueue.queueRequest(list);
    }

    public transient void queueRequest(Request arequest[])
    {
        mTaskQueue.queueRequest(arequest);
    }

    public void registerWeatherDataListener(IWeatherDataListener iweatherdatalistener)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("In registerWeatherDataListener, listener = ").append(iweatherdatalistener).toString());
        if ((iweatherdatalistener instanceof INotificationWeatherDataListener) && !mNotificationListeners.contains(iweatherdatalistener))
        {
            mNotificationListeners.add((INotificationWeatherDataListener)iweatherdatalistener);
        } else
        {
            if ((iweatherdatalistener instanceof IWidgetWeatherDataListener) && !mWidgetWeatherListeners.contains(iweatherdatalistener))
            {
                mWidgetWeatherListeners.add((IWidgetWeatherDataListener)iweatherdatalistener);
                return;
            }
            if (!mWeatherListeners.contains(iweatherdatalistener))
            {
                mWeatherListeners.add(iweatherdatalistener);
                return;
            }
        }
    }

    public void registerWeatherDataListenerForWearable(IWeatherDataListener iweatherdatalistener)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("In registerWeatherDataListenerForWearable, listener = ").append(iweatherdatalistener).toString());
        if (!mWearableListeners.contains(iweatherdatalistener))
        {
            mWearableListeners.add(iweatherdatalistener);
        }
    }

    public void removeALFollowMeWidgetsById(int ai[])
    {
        mDataPersistance.removeALFollowMeWidgetsById(ai);
    }

    public void removeALWidgetsById(int ai[])
    {
        mDataPersistance.removeALWidgetsById(ai);
    }

    public void removeSharpWidgetsById(int ai[])
    {
        mDataPersistance.removeSharpWidgetsById(ai);
    }

    public void removeTaskFromQueue()
    {
        mTaskQueue.removeTaskFromQueue();
    }

    protected void requestDma()
    {
        queueRequest(new Request[] {
            new DmaRequest()
        });
    }

    public void saveALFollowMeWidgetIdMap()
    {
        mDataPersistance.saveALFollowMeWidgetIdMap();
    }

    public void saveALWidgetIdMap()
    {
        mDataPersistance.saveALWidgetIdMap();
    }

    public void saveLocations()
    {
        try
        {
            mDataPersistance.saveLocations();
            return;
        }
        catch (DataIOException dataioexception)
        {
            Logger.e(getClass().getName(), "Data save error in saveLocations()", dataioexception);
        }
    }

    public void saveResizableWidgetDimensionsMap()
    {
        mDataPersistance.saveResizableDimensionsMap();
    }

    public void saveResizableWidgetIdMap()
    {
        mDataPersistance.saveResizableWidgetIdMap();
    }

    public void saveSharpWidgetIdMap()
    {
        mDataPersistance.saveSharpWidgetIdMap();
    }

    public void saveWeather()
    {
        try
        {
            mDataPersistance.saveWeather();
            return;
        }
        catch (DataIOException dataioexception)
        {
            Logger.e(getClass().getName(), "Data save error in saveWeather()", dataioexception);
        }
    }

    public void setCurrentFollowMeLocation(LocationModel locationmodel)
    {
        mDataPersistance.setCurrentFollowMeLocation(locationmodel);
    }

    public void setCurrentlyViewedWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        mDataPersistance.setCurrentlyViewedWeatherDataModel(weatherdatamodel);
    }

    public void setFollowMeIsCurrentlyViewed(boolean flag)
    {
        isFollowMeCurrentlyViewed = flag;
    }

    public void setHomeLocation(String s)
    {
        mDataPersistance.setHomeLocation(s);
        for (s = mWeatherListeners.iterator(); s.hasNext(); ((IWeatherDataListener)s.next()).onHomeLocationChanged()) { }
        for (s = mWidgetWeatherListeners.iterator(); s.hasNext(); ((IWidgetWeatherDataListener)s.next()).onHomeLocationChanged()) { }
        for (s = mNotificationListeners.iterator(); s.hasNext(); ((INotificationWeatherDataListener)s.next()).onHomeLocationChanged()) { }
    }

    public void setLastViewedLocation(String s)
    {
        mDataPersistance.setLastViewedLocation(s);
    }

    public void setLastViewedPage(int i)
    {
        mLastViewedPage = i;
    }

    public void setLocationExplicitlyAdded(boolean flag)
    {
        PreferenceUtils.save(mContext, "has_location_been_explicitly_added", flag);
    }

    public void setLocations(ArrayList arraylist)
    {
        mDataPersistance.setLocations(arraylist);
    }

    public void setMetric(String s)
    {
        Logger.i(this, (new StringBuilder()).append("Set metric to ").append(s).toString());
        mLastRequestedMetricValue = s;
        UserPreferences.setMetric(s, mContext);
        mContext.sendBroadcast(new Intent("accuwx.intent.action.UPDATE_METRIC"));
    }

    public void setPageNumberForOrientation(Integer integer)
    {
        PreferenceUtils.save(mContext, "save_current_page_number", integer.intValue());
    }

    public void setTaskFactory(ITaskFactory itaskfactory)
    {
        mTaskQueue.setTaskFactory(itaskfactory);
    }

    public void setTesting(boolean flag)
    {
        mIsTesting = flag;
    }

    public void simulateV2()
    {
        mDataPersistance.simulateV2();
    }

    public List sortWeatherDataModels(List list, String s)
    {
        return mDataPersistance.sortWeatherDataModels(list, s);
    }

    public void unregisterWeatherDataListener(IWeatherDataListener iweatherdatalistener)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("In unregisterWeatherDataListener, listener = ").append(iweatherdatalistener).toString());
        if (iweatherdatalistener instanceof INotificationWeatherDataListener)
        {
            mNotificationListeners.remove((INotificationWeatherDataListener)iweatherdatalistener);
            return;
        }
        if (iweatherdatalistener instanceof IWidgetWeatherDataListener)
        {
            mWidgetWeatherListeners.remove((IWidgetWeatherDataListener)iweatherdatalistener);
            return;
        } else
        {
            mWeatherListeners.remove(iweatherdatalistener);
            return;
        }
    }

    public void unregisterWeatherDataListenerForWearable(IWeatherDataListener iweatherdatalistener)
    {
        mWearableListeners.remove(iweatherdatalistener);
    }

    public void upgradeLocationModels(com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener ilocationconverterlistener)
    {
        if (mLocationUpgraderService == null)
        {
            mLocationUpgraderService = new LocationUpgraderService(mContext);
        }
        mLocationUpgraderService.addLocationConverterListener(ilocationconverterlistener);
        if (!mLocationUpgraderService.isUpgrading())
        {
            mLocationUpgraderService.upgradeLocations(getLocations());
        }
    }


}
