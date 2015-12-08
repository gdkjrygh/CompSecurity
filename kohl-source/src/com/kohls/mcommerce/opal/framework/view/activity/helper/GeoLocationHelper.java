// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity.helper;

import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.iface.IGeoLocation;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

public class GeoLocationHelper
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, LocationListener
{

    public static Location mCurrentLocation;
    public static double mLatitude;
    public static double mLongitude;
    private WeakReference mActivityRefrence;
    private IGeoLocation mGeoLocationListner;
    private LocationClient mLocationClient;

    public GeoLocationHelper(WeakReference weakreference, IGeoLocation igeolocation)
    {
        mActivityRefrence = weakreference;
        mGeoLocationListner = igeolocation;
    }

    private boolean checkFragmentisActive()
    {
        return mActivityRefrence.get() != null;
    }

    private void dismissDialog()
    {
        UtilityMethods.dismissDialog(4001);
        UtilityMethods.dismissDialog(4002);
    }

    private void initialiseGoogleMap()
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(KohlsPhoneApplication.getContext());
        if (i != 0)
        {
            UtilityMethods.showGoogleServiceErrorDialog(i, 1001, (Activity)mActivityRefrence.get());
            return;
        } else
        {
            mLocationClient = new LocationClient(KohlsPhoneApplication.getContext(), this, this);
            mLocationClient.connect();
            return;
        }
    }

    private boolean isLocationServiceEnabled()
    {
        LocationManager locationmanager = (LocationManager)KohlsPhoneApplication.getContext().getSystemService("location");
        return locationmanager != null && locationmanager.isProviderEnabled("network");
    }

    private void showLocationSettings()
    {
        dismissDialog();
        Object obj = ((Activity)mActivityRefrence.get()).getString(0x7f08021f);
        obj = UtilityMethods.getAlertDialog((Context)mActivityRefrence.get(), ((String) (obj)), ((Activity)mActivityRefrence.get()).getString(0x7f080111), ((Activity)mActivityRefrence.get()).getString(0x7f0800c7), new _cls1());
        if (checkFragmentisActive())
        {
            ((android.app.AlertDialog.Builder) (obj)).show();
        }
    }

    private void startFetchingCurrentLocation()
    {
        initialiseGoogleMap();
    }

    public Address getAddress()
        throws IOException
    {
        List list = (new Geocoder(KohlsPhoneApplication.getContext())).getFromLocation(mLatitude, mLongitude, 1);
        if (list != null && list.size() > 0)
        {
            return (Address)list.get(0);
        } else
        {
            return null;
        }
    }

    public Location getCurrentLocation()
    {
        return mCurrentLocation;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public void initializeComponent()
    {
        startFetchingCurrentLocation();
    }

    public boolean isCurrentLocationAvailable()
    {
        return mCurrentLocation != null;
    }

    public void onConnected(Bundle bundle)
    {
        if (!isLocationServiceEnabled())
        {
            dismissDialog();
            showLocationSettings();
            if (mGeoLocationListner != null)
            {
                mGeoLocationListner.onConnectionFailed();
            }
        } else
        if (mLocationClient.isConnected())
        {
            mCurrentLocation = mLocationClient.getLastLocation();
            if (mCurrentLocation != null)
            {
                mLatitude = mCurrentLocation.getLatitude();
                mLongitude = mCurrentLocation.getLongitude();
            }
            if (mGeoLocationListner != null)
            {
                mGeoLocationListner.onConnected();
            }
            stopLocationUpdates();
            return;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (mGeoLocationListner != null)
        {
            mGeoLocationListner.onConnectionFailed();
        }
        UtilityMethods.showGoogleServiceErrorDialog(connectionresult.getErrorCode(), 1001, (Activity)mActivityRefrence.get());
        stopLocationUpdates();
    }

    public void onDisconnected()
    {
    }

    public void onLocationChanged(Location location)
    {
        mCurrentLocation = location;
        mLatitude = location.getLatitude();
        mLongitude = location.getLongitude();
    }

    public String populateZipCode()
        throws IOException
    {
        List list = (new Geocoder(KohlsPhoneApplication.getContext())).getFromLocation(mLatitude, mLongitude, 1);
        if (list != null && list.size() > 0)
        {
            Logger.debug("GeoLocation", (new StringBuilder()).append("ZipCode = ").append(((Address)list.get(0)).getPostalCode()).toString());
            return ((Address)list.get(0)).getPostalCode();
        } else
        {
            Logger.debug("GeoLocation", "ZipCode = null");
            return "";
        }
    }

    protected void stopLocationUpdates()
    {
        if (mLocationClient != null && mLocationClient.isConnected())
        {
            mLocationClient.removeLocationUpdates(this);
            mLocationClient.disconnect();
        }
    }



    /* member class not found */
    class _cls1 {}

}
