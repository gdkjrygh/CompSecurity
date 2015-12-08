// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.impl.DownloadInfo;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.Date;
import org.json.JSONArray;

public class SharedPrefsManager
    implements ISharedPrefsManager
{

    private static final String mDeviceDiscoveredKey = "DeviceDiscovered";
    private static final String mGeoFencesInsideKey = "GeoFencesInside";
    private static final String mGeofenceManagerKey = "GeofenceManager";
    private static final String mIsRegisteringKey = "IsRegistering";
    private static final String mLogMessagesKey = "LogMessages";
    private static final String mNumRegFailuresKey = "NumRegFailures";
    private static final String mSharedPrefsStore = "DigbyMMLibrary";
    private static final String mUseLocationServicesKey = "UseLocationServices";
    private Context mContext;

    public SharedPrefsManager(Context context)
    {
        mContext = context;
    }

    public int getCurrentGeofenceManager()
    {
        int i;
        try
        {
            i = mContext.getApplicationContext().getSharedPreferences("GeofenceManager", 0).getInt("GeofenceManager", -1);
        }
        catch (Exception exception)
        {
            Logger.Error("getCurrentGeofenceManager", exception);
            return -1;
        }
        return i;
    }

    public boolean getDeviceRegistered()
    {
        boolean flag;
        try
        {
            flag = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getBoolean("DeviceDiscovered", false);
        }
        catch (Exception exception)
        {
            Logger.Error("getDeviceRegistered", exception);
            return false;
        }
        return flag;
    }

    public JSONArray getGeoFencesInside()
    {
        JSONArray jsonarray = new JSONArray();
        JSONArray jsonarray1;
        try
        {
            jsonarray1 = new JSONArray(mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getString("GeoFencesInside", "[]"));
        }
        catch (Exception exception)
        {
            Logger.Error("getGeoFencesInside", exception);
            return jsonarray;
        }
        return jsonarray1;
    }

    public boolean getIsRegistering()
    {
        boolean flag;
        try
        {
            flag = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getBoolean("IsRegistering", false);
        }
        catch (Exception exception)
        {
            Logger.Error("getIsRegistering", exception);
            return false;
        }
        return flag;
    }

    public IDownloadInfo getLastDownloadInfo()
    {
        DownloadInfo downloadinfo;
        try
        {
            downloadinfo = new DownloadInfo(mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0), mContext);
        }
        catch (Exception exception)
        {
            Logger.Error("getLastDownloadInfo", exception);
            return null;
        }
        return downloadinfo;
    }

    public JSONArray getLogMessages()
    {
        JSONArray jsonarray = new JSONArray();
        JSONArray jsonarray1;
        try
        {
            jsonarray1 = new JSONArray(mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getString("LogMessages", "[]"));
        }
        catch (Exception exception)
        {
            Logger.Error("getLogMessages", exception);
            return jsonarray;
        }
        return jsonarray1;
    }

    public int getNumDeviceRegFailures()
    {
        int i;
        try
        {
            i = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getInt("NumRegFailures", 0);
        }
        catch (Exception exception)
        {
            Logger.Error("getNumDeviceRegFailures", exception);
            return 0;
        }
        return i;
    }

    public boolean getUseLocationServices()
    {
        boolean flag;
        try
        {
            flag = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).getBoolean("UseLocationServices", true);
        }
        catch (Exception exception)
        {
            Logger.Error("getUseLocationServices", exception);
            return true;
        }
        return flag;
    }

    public void saveLogMessages(JSONArray jsonarray)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putString("LogMessages", jsonarray.toString());
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Logger.Error("saveLogMessages", jsonarray);
        }
    }

    public void setCurrentGeofenceManager(int i)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("GeofenceManager", 0).edit();
            editor.putInt("GeofenceManager", i);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("setCurrentGeofenceManager", exception);
        }
    }

    public void setDeviceRegistered(boolean flag)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putBoolean("DeviceDiscovered", flag);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("setDeviceRegistered", exception);
        }
    }

    public void setGeoFencesInside(JSONArray jsonarray)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putString("GeoFencesInside", jsonarray.toString());
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Logger.Error("setGeoFencesInside", jsonarray);
        }
    }

    public void setIsRegistering(boolean flag)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putBoolean("IsRegistering", flag);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("setIsRegistering", exception);
        }
    }

    public void setLastDownloadInfo(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates edownloadstates, String s, String s1, String s2, String s3)
    {
        Location location = DigbyController.getInstance(mContext).getLocationHelper().getBestCachedLocation();
        if (location == null)
        {
            android.content.SharedPreferences.Editor editor;
            try
            {
                Logger.Warn("No best cached location");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates edownloadstates)
            {
                Logger.Error("setLastDownloadInfo", edownloadstates);
            }
            break MISSING_BLOCK_LABEL_130;
        }
        editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
        editor.putFloat(s, (float)location.getLatitude());
        editor.putFloat(s1, (float)location.getLongitude());
        editor.putLong(s2, (new Date()).getTime());
        editor.putString(s3, edownloadstates.toString());
        editor.commit();
        return;
    }

    public void setNumDeviceRegFailures(int i)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putInt("NumRegFailures", i);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("setNumDeviceRegFailures", exception);
        }
    }

    public void setUseLocationServices(boolean flag)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = mContext.getApplicationContext().getSharedPreferences("DigbyMMLibrary", 0).edit();
            editor.putBoolean("UseLocationServices", flag);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("setUseLocationServices", exception);
        }
    }
}
