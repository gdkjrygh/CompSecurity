// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.location.Location;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPVersion;
import com.digby.localpoint.sdk.core.impl.LPDevice;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.impl.Settings;
import java.util.TimeZone;
import org.json.JSONObject;

public abstract class AbstractEvent
    implements IEvent
{

    private Context mContext;
    protected long mID;
    protected Location mLocation;
    protected String mTypeID;

    protected AbstractEvent(Context context)
    {
        mContext = context;
    }

    public void afterSend(boolean flag)
    {
        DigbyController.getInstance(mContext).getSharedPrefsManager().getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.COMPLETE);
    }

    public void beforeSend()
    {
    }

    public Context getContext()
    {
        return mContext;
    }

    public Location getEventLocation()
    {
        return mLocation;
    }

    public JSONObject getJSON()
    {
        double d1;
        JSONObject jsonobject;
        d1 = -1D;
        jsonobject = new JSONObject();
        IDigbyController idigbycontroller;
        String s;
        ILPVersion ilpversion;
        idigbycontroller = DigbyController.getInstance(mContext);
        s = getTypeID();
        if (mLocation == null)
        {
            mLocation = idigbycontroller.getLocationHelper().getBestCachedLocation();
        }
        ilpversion = LPLocalpointService.getInstance(mContext).getSDKVersion();
        if (mLocation == null) goto _L2; else goto _L1
_L1:
        double d = mLocation.getLatitude();
_L5:
        jsonobject.put("latitude", d);
        if (mLocation == null) goto _L4; else goto _L3
_L3:
        d = mLocation.getLongitude();
_L6:
        jsonobject.put("longitude", d);
        d = d1;
        if (mLocation != null)
        {
            d = mLocation.getAccuracy();
        }
        jsonobject.put("accuracy", d);
        jsonobject.put("deviceId", LPDevice.getInstance(mContext).getID().getValue());
        jsonobject.put("timeZone", TimeZone.getDefault().getID());
        jsonobject.put("eventType", s);
        jsonobject.put("apiVersion", Settings.getInstance(mContext).getAPIVersion());
        jsonobject.put("appId", idigbycontroller.getSettings().getAppID());
        jsonobject.put("majorSdkVersion", ilpversion.getMajorVersion());
        jsonobject.put("minorSdkVersion", ilpversion.getMinorVersion());
        jsonobject.put("revisionSdkVersion", ilpversion.getRevisionVersion());
        return jsonobject;
_L2:
        d = -1D;
          goto _L5
_L4:
        d = -1D;
          goto _L6
        Exception exception;
        exception;
        Logger.Error("getJSON", exception);
        return jsonobject;
          goto _L5
    }

    abstract String getTypeID();

    public void setEventLocation(Location location)
    {
        mLocation = location;
    }
}
