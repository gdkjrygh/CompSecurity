// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.Date;

public class DownloadInfo
    implements IDownloadInfo
{

    public static final String mDateKey = "Date";
    public static final String mLatitudeKey = "Latitude";
    public static final String mLongitudeKey = "Longitude";
    public static final String mStateKey = "State";
    private Context mContext;
    private Date mDate;
    private Location mLocation;
    private ISharedPrefsManager mPrefsManager;
    private com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates mState;

    public DownloadInfo(SharedPreferences sharedpreferences, Context context)
    {
        try
        {
            mLocation = new Location("network");
            mLocation.setLatitude(sharedpreferences.getFloat("Latitude", -1F));
            mLocation.setLongitude(sharedpreferences.getFloat("Longitude", -1F));
            mDate = new Date(sharedpreferences.getLong("Date", -1L));
            mState = com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.valueOf(sharedpreferences.getString("State", com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER.toString()));
            mContext = context;
            mPrefsManager = DigbyController.getInstance(context).getSharedPrefsManager();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            Logger.Error("DownloadInfo", sharedpreferences);
        }
    }

    private float distanceFromLastDownLoad()
    {
        Location location = DigbyController.getInstance(mContext).getLocationHelper().getBestCachedLocation();
        if (location != null)
        {
            return location.distanceTo(getLastDownloadLocation());
        } else
        {
            return 3.402823E+38F;
        }
    }

    private float halfTheSearchRadius()
    {
        return Float.valueOf(DigbyController.getInstance(mContext).getSettings().getSearchRadiusInMeters()).floatValue() / 2.0F;
    }

    public com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates getDownloadState()
    {
        return mState;
    }

    public Date getLastDownloadDate()
    {
        return mDate;
    }

    public Location getLastDownloadLocation()
    {
        return mLocation;
    }

    public void saveInfo()
    {
        mPrefsManager.setLastDownloadInfo(mState, "Latitude", "Longitude", "Date", "State");
    }

    public void setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates edownloadstates)
    {
        mState = edownloadstates;
        saveInfo();
    }

    public boolean shouldDownload()
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        flag2 = flag3;
        if (!getDownloadState().equals(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.DOWNLOADING)) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        flag2 = flag1;
        boolean flag;
        if (((new Date()).getTime() - getLastDownloadDate().getTime()) / 0x5265c00L > 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag1;
        if (distanceFromLastDownLoad() <= halfTheSearchRadius())
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag2 = flag3;
        try
        {
            flag3 = getDownloadState().equals(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER);
        }
        catch (Exception exception)
        {
            Logger.Error("shouldDownload", exception);
            return flag2;
        }
        if (flag3)
        {
            flag1 = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }
}
