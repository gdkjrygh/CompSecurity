// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.Logger;

public class Settings
    implements ISettings
{

    public static final String ACCURACY_EXTRAS_KEY = "Accuracy";
    public static final String BRAND_ENABLED_DISABLED_INTENT = "com.digby.mm.android.library.geofence.BRAND_ENABLED_DISABLED";
    public static final String GEOFENCES_EXTRAS_KEY = "GeoFences";
    public static final String GEOFENCES_UPDATED_INTENT = "com.digby.mm.android.library.GeoFencesUpdated";
    public static final String GEOFENCE_DOWNLOAD_COMPLETE_INTENT = "com.digby.mm.android.library.geofence.DOWNLOAD_COMPLETE";
    public static final String GEOFENCE_ENTRY_INTENT = "com.digby.mm.android.library.GeoFenceEntry";
    public static final String GEOFENCE_EXIT_INTENT = "com.digby.mm.android.library.GeoFenceExit";
    public static final String GEOFENCE_IDS_EXTRAS_KEY = "geofence_ids";
    public static final String LATITUDE_EXTRAS_KEY = "Latitude";
    private static final String LOCALPOINT_API_VERSION = "1.0";
    public static final String LOG_MESSAGE_INTENT = "com.digby.mm.android.library.LogMessage";
    public static final String LONGITUDE_EXTRAS_KEY = "Longitude";
    public static final String MESSAGES_EXTRAS_KEY = "Messages";
    private static Settings mSettings;
    private Context mContext;

    private Settings(Context context)
    {
        mContext = context.getApplicationContext();
    }

    public static Settings getInstance(Context context)
    {
        try
        {
            if (mSettings == null)
            {
                mSettings = new Settings(context);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("getInstance", context);
        }
        return mSettings;
    }

    public String getAPIVersion()
    {
        return "1.0";
    }

    public String getAndroidVersion()
    {
        String s;
        try
        {
            s = (new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).append("").toString();
        }
        catch (Exception exception)
        {
            Logger.Error("getAndroidVersion", exception);
            return "";
        }
        return s;
    }

    public String getAppID()
    {
        String s;
        try
        {
            s = mContext.getApplicationContext().getPackageManager().getApplicationInfo(mContext.getPackageName(), 128).metaData.getString("digby_appId");
        }
        catch (Exception exception)
        {
            Logger.Error("getAppKey", exception);
            return "";
        }
        return s;
    }

    public String getBrandCode()
    {
        String s;
        try
        {
            s = mContext.getApplicationContext().getPackageManager().getApplicationInfo(mContext.getPackageName(), 128).metaData.getString("digby_brandCode");
        }
        catch (Exception exception)
        {
            Logger.Error("getBrandCode", exception);
            return "";
        }
        return s;
    }

    public int getSearchRadiusInMeters()
    {
        return getSearchRadiusInMeters(50000);
    }

    public int getSearchRadiusInMeters(int i)
    {
        String s;
        int j;
        try
        {
            s = mContext.getApplicationContext().getPackageManager().getApplicationInfo(mContext.getPackageName(), 128).metaData.get("digby_searchRadius_meters").toString();
        }
        catch (Exception exception)
        {
            Logger.Error("getSearchRadiusInMeters", exception);
            return i;
        }
        j = i;
        if (s.matches("-?\\d+(\\.\\d+)?"))
        {
            j = Integer.parseInt(s);
        }
        return j;
    }

    public String getServer()
    {
        String s = "";
        String s1;
        try
        {
            s1 = mContext.getApplicationContext().getPackageManager().getApplicationInfo(mContext.getPackageName(), 128).metaData.get("digby_server").toString();
        }
        catch (Exception exception)
        {
            Logger.Error("getServer", exception);
            return s;
        }
        s = s1;
        if (s1.equals("api"))
        {
            return "";
        }
        s = s1;
        s1 = (new StringBuilder()).append(s1).append(".").toString();
        return s1;
    }

    public String getServerPort()
    {
        String s = "";
        Object obj;
        try
        {
            obj = mContext.getApplicationContext().getPackageManager().getApplicationInfo(mContext.getPackageName(), 128).metaData.get("digby_server_port");
        }
        catch (Exception exception)
        {
            Logger.Debug("Could not get optional server port property from manifest", mContext);
            return "";
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        s = obj.toString();
        return s;
    }

    public boolean phoneHasLocationServicesEnabled()
    {
label0:
        {
label1:
            {
                boolean flag;
                try
                {
                    LocationManager locationmanager = (LocationManager)mContext.getSystemService("location");
                    if (locationmanager.isProviderEnabled("gps"))
                    {
                        break label1;
                    }
                    flag = locationmanager.isProviderEnabled("network");
                }
                catch (Exception exception)
                {
                    Logger.Error("phoneHasLocationServicesEnabled", exception);
                    return false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }
}
