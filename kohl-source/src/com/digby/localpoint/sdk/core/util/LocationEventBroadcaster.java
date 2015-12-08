// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.digby.localpoint.sdk.core.ILPError;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.mm.android.library.utils.Logger;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class LocationEventBroadcaster
{

    public static final String ACCURACY_EXTRA = "accuracy";
    public static final String CHECKIN_FAILURE_INTENT = "com.digby.localpoint.CheckInFailure";
    public static final String CHECKIN_SUCCESS_INTENT = "com.digby.localpoint.CheckInSuccess";
    public static final String ERROR_CODE_EXTRA = "errorCode";
    public static final String ERROR_MESSAGE_EXTRA = "errorMessage";
    private static LocationEventBroadcaster INSTANCE;
    public static final String LATITUDE_EXTRA = "latitude";
    public static final String LOCATION_ADDED_INTENT = "com.digby.localpoint.LocationAdded";
    public static final String LOCATION_ENTRY_INTENT = "com.digby.localpoint.LocationEntry";
    public static final String LOCATION_EXIT_INTENT = "com.digby.localpoint.LocationExit";
    public static final String LOCATION_ID_EXTRA = "locationId";
    public static final String LOCATION_MODIFIED_INTENT = "com.digby.localpoint.LocationModified";
    public static final String LOCATION_REMOVED_INTENT = "com.digby.localpoint.LocationRemoved";
    public static final String LONGITUDE_EXTRA = "longitude";
    private final Context mContext;

    private LocationEventBroadcaster(Context context)
    {
        mContext = context;
    }

    public static LocationEventBroadcaster getInstance(Context context)
    {
        if (INSTANCE == null)
        {
            INSTANCE = new LocationEventBroadcaster(context);
        }
        return INSTANCE;
    }

    public void broadcastCheckInFailure(ILPLocation ilplocation, ILPError ilperror)
    {
        Logger.Debug((new StringBuilder()).append("Check In failure error code: ").append(ilperror.getErrorCode()).toString(), mContext);
        Logger.Debug((new StringBuilder()).append("Check In failure error msg:  ").append(ilperror.getErrorMessage()).toString(), mContext);
        Intent intent = new Intent("com.digby.localpoint.CheckInFailure");
        intent.putExtra("locationId", ilplocation.getID().getValue());
        intent.putExtra("errorCode", ilperror.getErrorCode());
        intent.putExtra("errorMessage", ilperror.getErrorMessage());
        mContext.sendBroadcast(intent);
    }

    public void broadcastCheckInSuccess(ILPLocation ilplocation)
    {
        Intent intent = new Intent("com.digby.localpoint.CheckInSuccess");
        intent.putExtra("locationId", ilplocation.getID().getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastEntry(Set set, Location location)
    {
        Logger.Debug(String.format(Locale.US, "Broadcasting entry to %d locations.", new Object[] {
            Integer.valueOf(set.size())
        }));
        Intent intent;
        for (set = set.iterator(); set.hasNext(); mContext.sendBroadcast(intent))
        {
            location = (ILPID)set.next();
            intent = new Intent("com.digby.localpoint.LocationEntry");
            intent.putExtra("locationId", location.getValue());
        }

    }

    public void broadcastExit(Set set, Location location)
    {
        Logger.Debug(String.format(Locale.US, "Broadcasting exit to %d locations.", new Object[] {
            Integer.valueOf(set.size())
        }));
        Intent intent;
        for (set = set.iterator(); set.hasNext(); mContext.sendBroadcast(intent))
        {
            location = (ILPID)set.next();
            intent = new Intent("com.digby.localpoint.LocationExit");
            intent.putExtra("locationId", location.getValue());
        }

    }

    public void broadcastLocationAdd(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.LocationAdded");
        intent.putExtra("locationId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastLocationAdd(ILPLocation ilplocation)
    {
        broadcastLocationAdd(ilplocation.getID());
    }

    public void broadcastLocationModify(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.LocationModified");
        intent.putExtra("locationId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastLocationModify(ILPLocation ilplocation)
    {
        broadcastLocationModify(ilplocation.getID());
    }

    public void broadcastLocationRemove(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.LocationRemoved");
        intent.putExtra("locationId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastLocationRemove(ILPLocation ilplocation)
    {
        broadcastLocationRemove(ilplocation.getID());
    }
}
