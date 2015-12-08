// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import com.digby.mm.android.library.geofence.IDownloadInfo;
import org.json.JSONArray;

public interface ISharedPrefsManager
{

    public abstract int getCurrentGeofenceManager();

    public abstract boolean getDeviceRegistered();

    public abstract JSONArray getGeoFencesInside();

    public abstract boolean getIsRegistering();

    public abstract IDownloadInfo getLastDownloadInfo();

    public abstract JSONArray getLogMessages();

    public abstract int getNumDeviceRegFailures();

    public abstract boolean getUseLocationServices();

    public abstract void saveLogMessages(JSONArray jsonarray);

    public abstract void setCurrentGeofenceManager(int i);

    public abstract void setDeviceRegistered(boolean flag);

    public abstract void setGeoFencesInside(JSONArray jsonarray);

    public abstract void setIsRegistering(boolean flag);

    public abstract void setLastDownloadInfo(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates edownloadstates, String s, String s1, String s2, String s3);

    public abstract void setNumDeviceRegFailures(int i);

    public abstract void setUseLocationServices(boolean flag);
}
