// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LocationManager
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, LocationListener
{
    public static interface OnPlayServiceInstalledListener
    {

        public abstract void onFailed();

        public abstract void onSuccess();
    }


    private static final int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    static final int REQUEST_CODE_RECOVER_PLAY_SERVICES = 1001;
    private static final String TAG = "LocationManager";
    private static Context mContext;
    public static LocationManager mInstance;
    public Location mCurrentLocation;
    private GoogleApiClient mGoogleApiClient;
    private boolean mInitLocationTest;
    private LocationRequest mLocationRequest;
    private OnPlayServiceInstalledListener mOnPlayServiceInstalledListener;

    public LocationManager(Context context)
    {
        mInitLocationTest = false;
        mContext = context;
    }

    public static LocationManager getInstance(Context context)
    {
        mContext = context;
        if (mInstance == null)
        {
            mInstance = new LocationManager(context);
        }
        return mInstance;
    }

    public Address getUsersAddress()
    {
        Object obj = new Geocoder(mContext, Locale.getDefault());
        try
        {
            obj = (Address)((Geocoder) (obj)).getFromLocation(getUsersLocation().getLatitude(), getUsersLocation().getLongitude(), 1).get(0);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return null;
        }
        return ((Address) (obj));
    }

    public Location getUsersLocation()
    {
        if (mGoogleApiClient.isConnected())
        {
            mCurrentLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
            if (mCurrentLocation == null)
            {
                Utils.logger("LocationManager", "isLocationKnown(): The users location is: NULL");
                turnOnLocationServices();
                return null;
            } else
            {
                Utils.logger("LocationManager", (new StringBuilder()).append("isLocationKnown(): The users location is: ").append(mCurrentLocation).toString());
                return mCurrentLocation;
            }
        } else
        {
            Utils.logger("LocationManager", "isLocationKnown(): We are not connected so return false: ");
            return null;
        }
    }

    public void init()
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i == 0)
        {
            mGoogleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            mInitLocationTest = true;
            turnOnLocationServices();
            notifyPlayServiceSucceeded();
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(i))
        {
            showErrorDialog(i);
            return;
        } else
        {
            Toast.makeText(mContext, "This device is not supported.", 1).show();
            return;
        }
    }

    public boolean isUserInUs()
    {
label0:
        {
label1:
            {
                if (!isUsersLocationKnown())
                {
                    break label0;
                }
                Address address = getUsersAddress();
                if (address != null)
                {
                    Utils.logger("LocationManager", (new StringBuilder()).append("isUserInUs: a.getCountryCode():").append(address.getCountryCode()).toString());
                    if (!address.getCountryCode().equalsIgnoreCase("US"))
                    {
                        break label1;
                    }
                }
                return true;
            }
            return false;
        }
        Utils.logger("LocationManager", "isUserInUs: location not known return false:");
        return false;
    }

    public boolean isUsersLocationKnown()
    {
        if (mGoogleApiClient.isConnected())
        {
            mCurrentLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
            if (mCurrentLocation == null)
            {
                Utils.logger("LocationManager", "isLocationKnown(): The users location is: NULL");
                turnOnLocationServices();
                return false;
            } else
            {
                Utils.logger("LocationManager", (new StringBuilder()).append("isLocationKnown(): The users location is: ").append(mCurrentLocation).toString());
                return true;
            }
        } else
        {
            Utils.logger("LocationManager", "isLocationKnown(): We are not connected so return false: ");
            return false;
        }
    }

    public void notifyPlayServiceFailed()
    {
        mOnPlayServiceInstalledListener.onFailed();
    }

    public void notifyPlayServiceSucceeded()
    {
        mOnPlayServiceInstalledListener.onSuccess();
    }

    public void onConnected(Bundle bundle)
    {
        Utils.logger("LocationManager", "Connected");
        mLocationRequest = LocationRequest.create();
        mLocationRequest.setPriority(104);
        mLocationRequest.setInterval(60010L);
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (connectionresult.hasResolution())
        {
            try
            {
                Utils.logger("LocationManager", "Connection succeeded:");
                connectionresult.startResolutionForResult((Activity)mContext, 9000);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                Utils.logger("LocationManager", "Connection intent exception");
            }
            connectionresult.printStackTrace();
            return;
        } else
        {
            Utils.logger("LocationManager", (new StringBuilder()).append("Connection failed:").append(connectionresult.getErrorCode()).toString());
            return;
        }
    }

    public void onConnectionSuspended(int i)
    {
        Log.i("LocationManager", "GoogleApiClient connection has been suspend");
    }

    public void onLocationChanged(Location location)
    {
    }

    public void setOnPlayServiceInstalledListener(OnPlayServiceInstalledListener onplayserviceinstalledlistener)
    {
        mOnPlayServiceInstalledListener = onplayserviceinstalledlistener;
    }

    void showErrorDialog(int i)
    {
        Dialog dialog = GooglePlayServicesUtil.getErrorDialog(i, (Activity)mContext, 1001);
        dialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final LocationManager this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                notifyPlayServiceFailed();
            }

            
            {
                this$0 = LocationManager.this;
                super();
            }
        });
        dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final LocationManager this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                notifyPlayServiceFailed();
            }

            
            {
                this$0 = LocationManager.this;
                super();
            }
        });
        dialog.show();
    }

    public void turnOffLocationServices()
    {
        if (mGoogleApiClient != null)
        {
            mGoogleApiClient.disconnect();
        }
    }

    public void turnOnLocationServices()
    {
        if (mGoogleApiClient != null)
        {
            mGoogleApiClient.connect();
        }
    }
}
