// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;

// Referenced classes of package com.accuweather.android.utilities:
//            DataPersistance, DataIOException

public class OptimizedDataPersistance extends DataPersistance
{

    private boolean mAreLocationModelsDirty;
    private boolean mAreWeatherModelsDirty;

    public OptimizedDataPersistance(Context context)
    {
        super(context);
        mAreWeatherModelsDirty = true;
        mAreLocationModelsDirty = true;
    }

    public void TESTING_resetDataToInitialState()
    {
        markAsDirty();
        super.TESTING_resetDataToInitialState();
    }

    public boolean addLocation(LocationModel locationmodel)
    {
        boolean flag = super.addLocation(locationmodel);
        if (flag)
        {
            markAsDirty();
        }
        return flag;
    }

    public WeatherDataModel addWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        WeatherDataModel weatherdatamodel1 = super.addWeatherDataModel(weatherdatamodel);
        if (weatherdatamodel1 == null || !weatherdatamodel1.equals(weatherdatamodel))
        {
            markAsDirty();
        }
        return weatherdatamodel1;
    }

    public boolean areLocationModelsDirty()
    {
        return mAreLocationModelsDirty;
    }

    public boolean areWeatherModelsDirty()
    {
        return mAreWeatherModelsDirty;
    }

    protected void clearAll()
    {
        markAsDirty();
        super.clearAll();
    }

    public boolean deleteLocation(String s)
    {
        markAsDirty();
        return super.deleteLocation(s);
    }

    protected void initFromV2Data()
    {
        super.initFromV2Data();
        markAsDirty();
    }

    protected void initFromV3Data()
        throws DataIOException
    {
        super.initFromV3Data();
        markAsDirty();
    }

    protected void markAsDirty()
    {
        mAreWeatherModelsDirty = true;
        mAreLocationModelsDirty = true;
    }

    public void saveLocations()
        throws DataIOException
    {
        if (shouldAllowDataSaving() && mAreLocationModelsDirty)
        {
            saveLocationModels();
            mAreLocationModelsDirty = false;
        }
    }

    public void saveWeather()
        throws DataIOException
    {
        if (shouldAllowDataSaving() && mAreWeatherModelsDirty)
        {
            saveWeatherModels();
            mAreWeatherModelsDirty = false;
        }
    }

    public void setLocations(ArrayList arraylist)
    {
        super.setLocations(arraylist);
        markAsDirty();
    }

    public void setWeatherDataModels(LinkedHashMap linkedhashmap)
    {
        super.setWeatherDataModels(linkedhashmap);
        markAsDirty();
    }
}
