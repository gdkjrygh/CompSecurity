// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            V2DataLoader, ModelSorter, PersistanceUtils, DataIOException, 
//            PartnerCoding, PreferenceUtils, Logger

public class DataPersistance
{
    private static class ALWidgetMapModels extends HashMap
        implements Serializable
    {

        private ALWidgetMapModels()
        {
        }
    }

    private static class LocationModels extends ArrayList
        implements Serializable
    {

        private LocationModels()
        {
        }
    }

    private static class NewsModels extends ArrayList
        implements Serializable
    {

        private NewsModels()
        {
        }
    }

    private static class ResizableDimensionMapModels extends HashMap
        implements Serializable
    {

        private static final long serialVersionUID = 1L;

        private ResizableDimensionMapModels()
        {
        }
    }

    private static class ResizableWidgetMapModels extends HashMap
        implements Serializable
    {

        private ResizableWidgetMapModels()
        {
        }
    }

    private static class WeatherDataModels extends LinkedHashMap
        implements Serializable
    {

        private WeatherDataModels()
        {
        }
    }


    private static final String ACCUWX_AL_FOLLOW_ME_WIDGET_MAP_FILE_NAME = "al_follow_me_accuwx_widget";
    private static final String ACCUWX_AL_WIDGET_MAP_FILE_NAME = "al_accuwx_widget";
    private static final String ACCUWX_LOCATION_MODEL_FILE_NAME = "accuwx_locations";
    private static final String ACCUWX_NEWS_MODEL_FILE_NAME = "accuwx_news";
    private static final String ACCUWX_RESIZABLE_DIMENSIONS = "accuwx_dimensions";
    private static final String ACCUWX_SHARP_WIDGET_MAP_FILE_NAME = "sharp_accuwx_widget";
    private static final String ACCUWX_WEATHER_MODEL_FILE_NAME = "accuwx";
    private static final String ACCUWX_WIDGET_MAP_FILE_NAME = "accuwx_widget";
    private static final String DELETED_WIDGET_ID_DELIMITER = "!&!";
    private boolean isInitialized;
    private HashMap mALFollowMeWidgetIdMap;
    private HashMap mALWidgetIdMap;
    private Context mContext;
    private LocationModel mCurrentFollowMeLocation;
    private WeatherDataModel mCurrentlyViewedWeatherDataModel;
    private ArrayList mLocations;
    private ModelSorter mModelSorter;
    private ArrayList mNewsModels;
    private HashMap mResizableDimensions;
    private HashMap mResizableWidgetIdMap;
    private HashMap mSharpWidgetIdMap;
    private boolean mShouldAllowDataSaving;
    private V2DataLoader mV2DataLoader;
    private HashMap mWeatherDataModelsMap;

    public DataPersistance(Context context)
    {
        mV2DataLoader = new V2DataLoader();
        mWeatherDataModelsMap = new LinkedHashMap();
        mNewsModels = new ArrayList();
        mLocations = new ArrayList();
        mResizableWidgetIdMap = new HashMap();
        mALWidgetIdMap = new HashMap();
        mALFollowMeWidgetIdMap = new HashMap();
        mSharpWidgetIdMap = new HashMap();
        mResizableDimensions = new HashMap();
        mShouldAllowDataSaving = true;
        mModelSorter = new ModelSorter();
        mContext = context;
    }

    private void deleteV3ModelsFiles()
    {
        File file = mContext.getFilesDir();
        (new File(file, "accuwx")).delete();
        (new File(file, "accuwx_locations")).delete();
        (new File(file, "accuwx_widget")).delete();
        (new File(file, "al_accuwx_widget")).delete();
        (new File(file, "al_follow_me_accuwx_widget")).delete();
        (new File(file, "accuwx_dimensions")).delete();
    }

    private void loadALFollowMeWidgetIdMap()
    {
        HashMap hashmap = (HashMap)PersistanceUtils.getObjectFromSharedPreferences("al_follow_me_accuwx_widget", com/accuweather/android/utilities/DataPersistance$ALWidgetMapModels, mContext);
        if (hashmap != null)
        {
            mALFollowMeWidgetIdMap.clear();
            mALFollowMeWidgetIdMap.putAll(hashmap);
        }
    }

    private void loadALWidgetIdMap()
    {
        HashMap hashmap = (HashMap)PersistanceUtils.getObjectFromSharedPreferences("al_accuwx_widget", com/accuweather/android/utilities/DataPersistance$ALWidgetMapModels, mContext);
        if (hashmap != null)
        {
            mALWidgetIdMap.clear();
            mALWidgetIdMap.putAll(hashmap);
        }
    }

    private void loadLocationModels()
        throws DataIOException
    {
        Object obj;
        try
        {
            obj = (ArrayList)PersistanceUtils.getObjectFromFile("accuwx_locations", com/accuweather/android/utilities/DataPersistance$LocationModels, mContext);
        }
        catch (Exception exception)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        mLocations.clear();
        mLocations.addAll(((Collection) (obj)));
        obj = PreferenceManager.getDefaultSharedPreferences(mContext);
        if (!mLocations.isEmpty() && ((SharedPreferences) (obj)).contains("accuwx_locations"))
        {
            ((SharedPreferences) (obj)).edit().remove("accuwx_locations").commit();
        }
    }

    private void loadNewsModels()
    {
        ArrayList arraylist = (ArrayList)PersistanceUtils.getObjectFromFile("accuwx_news", com/accuweather/android/utilities/DataPersistance$NewsModels, mContext);
        if (arraylist != null)
        {
            try
            {
                mNewsModels.clear();
                mNewsModels.addAll(arraylist);
                for (Iterator iterator = mWeatherDataModelsMap.values().iterator(); iterator.hasNext(); ((WeatherDataModel)iterator.next()).setNews(mNewsModels)) { }
            }
            catch (Exception exception) { }
        }
        return;
    }

    private void loadResizableWidgetDimensionsMap()
    {
        HashMap hashmap = (HashMap)PersistanceUtils.getObjectFromSharedPreferences("accuwx_dimensions", com/accuweather/android/utilities/DataPersistance$ResizableDimensionMapModels, mContext);
        if (hashmap != null)
        {
            mResizableDimensions.clear();
            mResizableDimensions.putAll(hashmap);
        }
    }

    private void loadResizableWidgetIdMap()
    {
        HashMap hashmap = (HashMap)PersistanceUtils.getObjectFromSharedPreferences("accuwx_widget", com/accuweather/android/utilities/DataPersistance$ResizableWidgetMapModels, mContext);
        if (hashmap != null)
        {
            mResizableWidgetIdMap.clear();
            mResizableWidgetIdMap.putAll(hashmap);
        }
    }

    private void loadSharpWidgetIdMap()
    {
        HashMap hashmap = (HashMap)PersistanceUtils.getObjectFromSharedPreferences("sharp_accuwx_widget", com/accuweather/android/utilities/DataPersistance$ALWidgetMapModels, mContext);
        if (hashmap != null)
        {
            mSharpWidgetIdMap.clear();
            mSharpWidgetIdMap.putAll(hashmap);
        }
    }

    private void loadWeatherDataModels()
    {
        Object obj;
        try
        {
            obj = (HashMap)PersistanceUtils.getObjectFromFile("accuwx", com/accuweather/android/utilities/DataPersistance$WeatherDataModels, mContext);
        }
        catch (Exception exception)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        mWeatherDataModelsMap.clear();
        mWeatherDataModelsMap.putAll(((java.util.Map) (obj)));
        mCurrentlyViewedWeatherDataModel = (WeatherDataModel)mWeatherDataModelsMap.get(getLastViewedLocation().getKey());
        obj = PreferenceManager.getDefaultSharedPreferences(mContext);
        if (!mWeatherDataModelsMap.isEmpty() && ((SharedPreferences) (obj)).contains("accuwx"))
        {
            ((SharedPreferences) (obj)).edit().remove("accuwx").commit();
        }
    }

    private void markPreloadDefaultLocationAdded(LocationModel locationmodel)
    {
        if (PartnerCoding.isDefaultLocationPreload(mContext) && mLocations.isEmpty() && "".equals(locationmodel.getLocKey()))
        {
            savePreloadLocationAddedState(mContext);
        }
    }

    private void removeSharedPreferencesKey(String s)
    {
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().remove(s).commit();
    }

    private void saveDeletedALFollowMeWidgetIdsToSharedPreferences(int ai[])
    {
        saveDeletedClockWidgetIdsToSharedPreferences("deleted_al_follow_me_widget_ids", ai);
    }

    private void saveDeletedALWidgetIdsToSharedPreferences(int ai[])
    {
        saveDeletedClockWidgetIdsToSharedPreferences("deleted_al_widget_ids", ai);
    }

    private void saveDeletedClockWidgetIdsToSharedPreferences(String s, int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder(PreferenceUtils.get(mContext, s, ""));
        for (int i = 0; i < ai.length; i++)
        {
            if (!TextUtils.isEmpty(stringbuilder))
            {
                stringbuilder.append("!&!");
            }
            stringbuilder.append(String.valueOf(ai[i]));
        }

        PreferenceUtils.save(mContext, s, stringbuilder.toString());
    }

    private void saveDeletedSharpWidgetIdsToSharedPreferences(int ai[])
    {
        saveDeletedClockWidgetIdsToSharedPreferences("deleted_sharp_widget_ids", ai);
    }

    private void savePreloadLocationAddedState(Context context)
    {
        PreferenceUtils.save(mContext, "default_location_added", true);
    }

    public void TESTING_resetDataToInitialState()
    {
        mV2DataLoader.removeV2Preferences(mContext);
        deleteV3ModelsFiles();
        removeSharedPreferencesKey("last_viewed_location_key");
        mWeatherDataModelsMap = new LinkedHashMap();
        mLocations = new ArrayList();
        mCurrentlyViewedWeatherDataModel = null;
        isInitialized = false;
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().clear().commit();
    }

    public boolean addLocation(LocationModel locationmodel)
    {
        for (Iterator iterator = mLocations.iterator(); iterator.hasNext();)
        {
            if (((LocationModel)iterator.next()).equals(locationmodel))
            {
                return false;
            }
        }

        markPreloadDefaultLocationAdded(locationmodel);
        mLocations.add(locationmodel);
        if (mLocations.size() == 1)
        {
            setHomeLocation(locationmodel.getKey());
        }
        mContext.sendBroadcast(new Intent("accuwx.intent.action.ADD_WIDGET_LOCATION"));
        return true;
    }

    public WeatherDataModel addWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        return (WeatherDataModel)mWeatherDataModelsMap.put(weatherdatamodel.getLocationKey(), weatherdatamodel);
    }

    public boolean areCachedModelPropertiesExpired(String s, boolean flag, String s1)
    {
label0:
        {
            boolean flag1 = false;
            s = (WeatherDataModel)mWeatherDataModelsMap.get(s);
            if (s == null)
            {
                return true;
            }
            boolean flag2;
            boolean flag3;
            if (flag == s.isMetric())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag3 = s.getLanguage().equals(s1);
            flag2 = s.isLatestModelVersion();
            Logger.d(getClass().getName(), (new StringBuilder()).append("In areCachedModelPropertiesExpired, metricValuesMatch? ").append(flag).append(", languagesMatch? ").append(flag3).append(", isLatestModelVersion? ").append(flag2).toString());
            if (flag && flag3)
            {
                flag = flag1;
                if (flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public boolean areLocationsTheNewestVersion()
    {
        for (Iterator iterator = mLocations.iterator(); iterator.hasNext();)
        {
            if (!((LocationModel)iterator.next()).isLatestModelVersion())
            {
                return false;
            }
        }

        return true;
    }

    public boolean areWeatherModelVersionsOutdated()
    {
        List list = getWeatherDataModelsList();
        for (int i = 0; i < list.size(); i++)
        {
            if (!((WeatherDataModel)list.get(i)).isLatestModelVersion())
            {
                return true;
            }
        }

        return false;
    }

    protected void clearAll()
    {
        mShouldAllowDataSaving = false;
        mV2DataLoader.removeV2Preferences(mContext);
        deleteV3ModelsFiles();
        mWeatherDataModelsMap = new LinkedHashMap();
        mLocations = new ArrayList();
        mCurrentlyViewedWeatherDataModel = null;
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().clear().commit();
        ((NotificationManager)mContext.getSystemService("notification")).cancelAll();
    }

    public boolean deleteLocation(String s)
    {
        String s1 = getHomeLocation().getKey();
        int i = 0;
        do
        {
label0:
            {
                if (i < mLocations.size())
                {
                    if (!((LocationModel)mLocations.get(i)).getKey().equals(s))
                    {
                        break label0;
                    }
                    mLocations.remove(i);
                }
                if (s1.equals(s))
                {
                    setHomeLocation(((LocationModel)mLocations.get(0)).getKey());
                }
                mWeatherDataModelsMap.remove(s);
                if (mCurrentlyViewedWeatherDataModel == null)
                {
                    return false;
                } else
                {
                    mContext.sendBroadcast((new Intent("accuwx.intent.action.DELETE_LOCATION")).putExtra("location_code_delete", s));
                    return s.equals(mCurrentlyViewedWeatherDataModel.getLocationKey());
                }
            }
            i++;
        } while (true);
    }

    public boolean doV2LocationsExist()
    {
        return mV2DataLoader.doV2LocationsExist(mContext);
    }

    public boolean doV2LocationsNeedConverted()
    {
        return mV2DataLoader.doV2LocationsNeedConverted(mLocations);
    }

    public HashMap getALFollowMeWidgetsIdMap()
    {
        return mALFollowMeWidgetIdMap;
    }

    public HashMap getALWidgetIdMap()
    {
        return mALWidgetIdMap;
    }

    public LocationModel getCurrentFollowMeLocation()
    {
        return mCurrentFollowMeLocation;
    }

    public WeatherDataModel getCurrentlyViewedWeatherDataModel()
    {
        return mCurrentlyViewedWeatherDataModel;
    }

    public LocationModel getHomeLocation()
    {
        for (Iterator iterator = mLocations.iterator(); iterator.hasNext();)
        {
            LocationModel locationmodel = (LocationModel)iterator.next();
            if (locationmodel.isHome())
            {
                return locationmodel;
            }
        }

        return new LocationModel();
    }

    public List getKeys()
    {
        return mModelSorter.getKeys(mLocations);
    }

    public LocationModel getLastViewedLocation()
    {
        Object obj = PreferenceUtils.get(mContext, "last_viewed_location_key", null);
        if (obj != null)
        {
            obj = getLocationFromKey(((String) (obj)));
            if (obj != null)
            {
                return ((LocationModel) (obj));
            }
        }
        return getHomeLocation();
    }

    public List getLocNames()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < mLocations.size(); i++)
        {
            arraylist.add(LocationModel.toSimpleName(((LocationModel)mLocations.get(i)).getAliasedName()));
        }

        return arraylist;
    }

    public LocationModel getLocationFromAliasedName(String s)
    {
        return mModelSorter.getLocationFromAliasedName(s, mLocations);
    }

    public LocationModel getLocationFromKey(String s)
    {
        return mModelSorter.getLocationFromKey(s, mCurrentFollowMeLocation, mLocations);
    }

    public LocationModel getLocationFromKeyIgnoringFollowMe(String s)
    {
        return mModelSorter.getLocationFromKey(s, null, mLocations);
    }

    public ArrayList getLocations()
    {
        return mLocations;
    }

    public List getPrettyNames()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < mLocations.size(); i++)
        {
            arraylist.add(((LocationModel)mLocations.get(i)).getAliasedName());
        }

        return arraylist;
    }

    public List getPrimarySortedWeatherDataModels()
    {
        return mModelSorter.getPrimarySortedWeatherDataModels(getCurrentlyViewedWeatherDataModel(), mLocations, mWeatherDataModelsMap);
    }

    public List getPrimarySortedWeatherDataModelsWithFollowMe()
    {
        return mModelSorter.getPrimarySortedWeatherDataModelsWithFollowMe(mCurrentFollowMeLocation, getCurrentlyViewedWeatherDataModel(), mLocations, mWeatherDataModelsMap);
    }

    public HashMap getResizableDimensionMap()
    {
        return mResizableDimensions;
    }

    public HashMap getResizableWidgetIdMap()
    {
        return mResizableWidgetIdMap;
    }

    public HashMap getSharpWidgetIdMap()
    {
        return mSharpWidgetIdMap;
    }

    public List getSortedKeysForMaps()
    {
        return mModelSorter.getSortedKeysForMaps(mCurrentFollowMeLocation, getCurrentlyViewedWeatherDataModel(), getHomeLocation(), mLocations);
    }

    public List getSortedLocationNames()
    {
        return mModelSorter.getSortedLocationNames(getHomeLocation(), mLocations, mWeatherDataModelsMap);
    }

    public String getV2HomeLocCode()
    {
        return mV2DataLoader.getV2HomeLocCode(mContext);
    }

    public WeatherDataModel getWeatherDataModelFromCode(String s)
    {
        return (WeatherDataModel)mWeatherDataModelsMap.get(s);
    }

    public HashMap getWeatherDataModels()
    {
        return mWeatherDataModelsMap;
    }

    public List getWeatherDataModelsList()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mWeatherDataModelsMap.values().iterator(); iterator.hasNext(); arraylist.add((WeatherDataModel)iterator.next())) { }
        return arraylist;
    }

    public boolean hasALFollowMeWidgetIdBeenDeleted(int i)
    {
        return hasClockWidgetIdBeenDeleted("deleted_al_follow_me_widget_ids", i);
    }

    public boolean hasALWidgetIdBeenDeleted(int i)
    {
        return hasClockWidgetIdBeenDeleted("deleted_al_widget_ids", i);
    }

    public boolean hasCachedValue(String s, boolean flag, String s1)
    {
        WeatherDataModel weatherdatamodel = (WeatherDataModel)mWeatherDataModelsMap.get(s);
        flag = areCachedModelPropertiesExpired(s, flag, s1);
        return weatherdatamodel != null && weatherdatamodel.isDataValid() && !flag;
    }

    public boolean hasClockWidgetIdBeenDeleted(String s, int i)
    {
        for (s = Arrays.asList(PreferenceUtils.get(mContext, s, "").split("!&!")).iterator(); s.hasNext();)
        {
            String s1 = (String)s.next();
            if (!TextUtils.isEmpty(s1) && Integer.valueOf(s1).intValue() == i)
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasLocation()
    {
        return mLocations.size() > 0;
    }

    public boolean hasPrimaryWeatherDataModel()
    {
        return getCurrentlyViewedWeatherDataModel() != null;
    }

    public boolean hasSharpWidgetIdBeenDeleted(int i)
    {
        return hasClockWidgetIdBeenDeleted("deleted_sharp_widget_ids", i);
    }

    protected void initFromV2Data()
    {
        Logger.d(getClass().getName(), "In initFromV2.");
        mWeatherDataModelsMap.clear();
        mLocations.clear();
        mCurrentlyViewedWeatherDataModel = null;
        mLocations = mV2DataLoader.getV2LocationModels(mContext);
        mV2DataLoader.removeV2Preferences(mContext);
    }

    protected void initFromV3Data()
        throws DataIOException
    {
        Logger.d(getClass().getName(), "In initFromV3Data.");
        loadLocationModels();
        loadResizableWidgetIdMap();
        loadALWidgetIdMap();
        loadALFollowMeWidgetIdMap();
        loadSharpWidgetIdMap();
        loadResizableWidgetDimensionsMap();
        loadWeatherDataModels();
        loadNewsModels();
    }

    public boolean isFullWeatherUpdateRequired(WeatherUpdateRequest weatherupdaterequest)
    {
        WeatherDataModel weatherdatamodel = (WeatherDataModel)mWeatherDataModelsMap.get(weatherupdaterequest.getLocationKey());
        return weatherdatamodel == null || !weatherdatamodel.isDataValid() || areCachedModelPropertiesExpired(weatherupdaterequest.getLocationKey(), weatherupdaterequest.isMetric(), weatherupdaterequest.getLangId()) || weatherupdaterequest.isWearable();
    }

    public void loadData()
        throws DataIOException
    {
        this;
        JVM INSTR monitorenter ;
        if (isInitialized) goto _L2; else goto _L1
_L1:
        if (!doV2LocationsExist())
        {
            break MISSING_BLOCK_LABEL_28;
        }
        initFromV2Data();
_L3:
        isInitialized = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        initFromV3Data();
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public void removeALFollowMeWidgetsById(int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            mALFollowMeWidgetIdMap.remove(Integer.valueOf(ai[i]));
        }

        saveDeletedALFollowMeWidgetIdsToSharedPreferences(ai);
        saveALFollowMeWidgetIdMap();
    }

    public void removeALWidgetsById(int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            mALWidgetIdMap.remove(Integer.valueOf(ai[i]));
        }

        saveDeletedALWidgetIdsToSharedPreferences(ai);
        saveALWidgetIdMap();
    }

    public void removeSharpWidgetsById(int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            mSharpWidgetIdMap.remove(Integer.valueOf(ai[i]));
        }

        saveDeletedSharpWidgetIdsToSharedPreferences(ai);
        saveSharpWidgetIdMap();
    }

    public void saveALFollowMeWidgetIdMap()
    {
        PersistanceUtils.saveObjectToSharedPreferences("al_follow_me_accuwx_widget", mALFollowMeWidgetIdMap, mContext);
    }

    public void saveALWidgetIdMap()
    {
        PersistanceUtils.saveObjectToSharedPreferences("al_accuwx_widget", mALWidgetIdMap, mContext);
    }

    protected void saveLocationModels()
        throws DataIOException
    {
        PersistanceUtils.saveObjectToFile("accuwx_locations", mLocations, mContext);
    }

    public void saveLocations()
        throws DataIOException
    {
        Logger.d(getClass().getName(), "In saveLocations().");
        if (shouldAllowDataSaving())
        {
            saveLocationModels();
        }
    }

    public void saveResizableDimensionsMap()
    {
        PersistanceUtils.saveObjectToSharedPreferences("accuwx_dimensions", mResizableDimensions, mContext);
    }

    public void saveResizableWidgetIdMap()
    {
        PersistanceUtils.saveObjectToSharedPreferences("accuwx_widget", mResizableWidgetIdMap, mContext);
    }

    public void saveSharpWidgetIdMap()
    {
        PersistanceUtils.saveObjectToSharedPreferences("sharp_accuwx_widget", mSharpWidgetIdMap, mContext);
    }

    public void saveWeather()
        throws DataIOException
    {
        Logger.d(getClass().getName(), "In saveWeather().");
        if (shouldAllowDataSaving())
        {
            saveWeatherModels();
        }
    }

    protected void saveWeatherModels()
        throws DataIOException
    {
        PersistanceUtils.saveObjectToFile("accuwx", mWeatherDataModelsMap, mContext);
        Iterator iterator = mWeatherDataModelsMap.values().iterator();
        if (iterator.hasNext())
        {
            PersistanceUtils.saveObjectToFile("accuwx_news", ((WeatherDataModel)iterator.next()).getNews(), mContext);
        }
    }

    public void setCurrentFollowMeLocation(LocationModel locationmodel)
    {
        mCurrentFollowMeLocation = locationmodel;
    }

    public void setCurrentlyViewedWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        mCurrentlyViewedWeatherDataModel = weatherdatamodel;
    }

    public void setHomeLocation(String s)
    {
        LocationModel locationmodel;
        for (Iterator iterator = mLocations.iterator(); iterator.hasNext(); locationmodel.setHome(locationmodel.getKey().equals(s)))
        {
            locationmodel = (LocationModel)iterator.next();
        }

          goto _L1
_L3:
        mContext.sendBroadcast(new Intent("com.accuweather.android.action.HOME_LOCATION_CHANGED"));
        return;
_L1:
        try
        {
            saveLocationModels();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.e(getClass().getName(), (new StringBuilder()).append("Couldn't set the home location: ").append(s).toString());
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void setLastViewedLocation(String s)
    {
        String s1 = PreferenceUtils.get(mContext, "last_viewed_location_key", null);
        if (s1 == null || !s1.equals(s))
        {
            PreferenceUtils.save(mContext, "last_viewed_location_key", s);
        }
    }

    public void setLocations(ArrayList arraylist)
    {
        mLocations = arraylist;
    }

    public void setWeatherDataModels(LinkedHashMap linkedhashmap)
    {
        mWeatherDataModelsMap = linkedhashmap;
    }

    protected boolean shouldAllowDataSaving()
    {
        return mShouldAllowDataSaving;
    }

    public void simulateV2()
    {
        mV2DataLoader.simulateV2(mContext);
        initFromV2Data();
    }

    public List sortWeatherDataModels(List list, String s)
    {
        return mModelSorter.sortWeatherDataModels(list, s);
    }
}
