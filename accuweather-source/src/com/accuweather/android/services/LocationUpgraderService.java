// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.utilities.Data;
import java.util.ArrayList;
import java.util.List;

public class LocationUpgraderService
    implements com.accuweather.android.utilities.Data.IWeatherDataListener
{
    public static interface ILocationConverterListener
    {

        public abstract void onConversionCompleted(List list);

        public abstract void onConversionError(Exception exception);
    }


    private Context mContext;
    private List mConvertedLocations;
    private LocationModel mCurrentlyUpgradingLocation;
    private boolean mIsUpgrading;
    private Exception mLastException;
    private List mLocationConverterListeners;
    private LocationRequester mLocationRequester;
    private List mLocationsToBeUpgraded;

    public LocationUpgraderService(Context context)
    {
        mConvertedLocations = new ArrayList();
        mLocationsToBeUpgraded = new ArrayList();
        mLocationConverterListeners = new ArrayList();
        mContext = context;
        mLocationRequester = new LocationRequester(context);
    }

    private void executeNextConversionTask()
    {
        if (mLocationsToBeUpgraded.size() == 0)
        {
            onConversionCompletedSuccessfully();
            return;
        }
        mCurrentlyUpgradingLocation = (LocationModel)mLocationsToBeUpgraded.get(0);
        if (Data.getInstance(mContext).getV2HomeLocCode().equals(mCurrentlyUpgradingLocation.getLocKey()))
        {
            mCurrentlyUpgradingLocation.setHome(true);
        }
        String s = mCurrentlyUpgradingLocation.getLocKey();
        if (s.toLowerCase().contains("postalcode"))
        {
            s = getFormattedLocationKeyFromPostalCode(s);
            mLocationRequester.performCitySearch(s);
            return;
        }
        if (s.toLowerCase().contains("cityid"))
        {
            s = getFormattedLocationKeyFromCityId(s);
            mLocationRequester.performLocationKeySearch(s);
            return;
        } else
        {
            mLocationRequester.performLocationKeySearch(s);
            return;
        }
    }

    private String getFormattedLocationKeyFromCityId(String s)
    {
        return s.split(":")[1];
    }

    private String getFormattedLocationKeyFromPostalCode(String s)
    {
        return s.split(":")[1];
    }

    private void onConversionCompletedSuccessfully()
    {
        Data.getInstance(mContext).unregisterWeatherDataListener(this);
        for (int i = 0; i < mLocationConverterListeners.size(); i++)
        {
            ((ILocationConverterListener)mLocationConverterListeners.get(i)).onConversionCompleted(mConvertedLocations);
        }

        mLocationConverterListeners.clear();
        mIsUpgrading = false;
    }

    public void addLocationConverterListener(ILocationConverterListener ilocationconverterlistener)
    {
        if (!mLocationConverterListeners.contains(ilocationconverterlistener))
        {
            mLocationConverterListeners.add(ilocationconverterlistener);
        }
    }

    public boolean isUpgrading()
    {
        return mIsUpgrading;
    }

    public void onError(Exception exception)
    {
        Data.getInstance(mContext).unregisterWeatherDataListener(this);
        for (int i = 0; i < mLocationConverterListeners.size(); i++)
        {
            ((ILocationConverterListener)mLocationConverterListeners.get(i)).onConversionError(exception);
        }

        mLocationConverterListeners.clear();
        mIsUpgrading = false;
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onHomeLocationChanged()
    {
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (mLastException != null)
        {
            mLocationsToBeUpgraded.clear();
            onError(mLastException);
            return;
        }
        if (locationsearch != null && !locationsearch.isEmpty())
        {
            list = (LocationSearchResult)locationsearch.get(0);
            boolean flag = mCurrentlyUpgradingLocation.isAliased();
            boolean flag1 = mCurrentlyUpgradingLocation.isHome();
            locationsearch = mCurrentlyUpgradingLocation.getAliasedName();
            list = list.toLocationModel();
            list.setHome(flag1);
            if (flag)
            {
                list.setAliasName(locationsearch);
            }
            mConvertedLocations.add(list);
        }
        if (mLocationsToBeUpgraded.size() > 0)
        {
            mLocationsToBeUpgraded.remove(0);
        }
        if (mLocationsToBeUpgraded.size() > 0)
        {
            executeNextConversionTask();
            return;
        } else
        {
            onConversionCompletedSuccessfully();
            return;
        }
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
    }

    public void upgradeLocations(List list)
    {
        mIsUpgrading = true;
        mLocationsToBeUpgraded.clear();
        mLocationsToBeUpgraded.addAll(list);
        Data.getInstance(mContext).registerWeatherDataListener(this);
        mConvertedLocations.clear();
        executeNextConversionTask();
    }
}
