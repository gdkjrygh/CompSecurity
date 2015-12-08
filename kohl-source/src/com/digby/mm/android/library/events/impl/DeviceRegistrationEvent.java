// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent

public class DeviceRegistrationEvent extends AbstractEvent
{

    private static final String TYPE_ID = "DEVICE_REGISTRATION";
    private IGeoFenceListReceiver mGeoFenceReceiver;
    private String mRegKey;

    public DeviceRegistrationEvent(Context context, String s)
    {
        super(context);
        mGeoFenceReceiver = new IGeoFenceListReceiver() {

            final DeviceRegistrationEvent this$0;

            public void onReceive(List list)
            {
                if (list.size() == 0)
                {
                    DigbyController.getInstance(getContext()).getSharedPrefsManager().getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER);
                }
            }

            
            {
                this$0 = DeviceRegistrationEvent.this;
                super();
            }
        };
        try
        {
            mRegKey = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("DeviceRegistrationEvent", context);
        }
    }

    public boolean addToQueue(Queue queue)
    {
label0:
        {
            if (queue == null || queue.size() <= 0)
            {
                break label0;
            }
            queue = queue.iterator();
            do
            {
                if (!queue.hasNext())
                {
                    break label0;
                }
            } while (!((IEvent)queue.next() instanceof DeviceRegistrationEvent));
            return false;
        }
        return true;
    }

    public void afterSend(boolean flag)
    {
        Object obj;
        Intent intent;
        try
        {
            obj = DigbyController.getInstance(getContext()).getSharedPrefsManager();
        }
        catch (Exception exception)
        {
            Logger.Error("afterSend", exception);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        ((ISharedPrefsManager) (obj)).setDeviceRegistered(true);
        ((ISharedPrefsManager) (obj)).getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.COMPLETE);
        intent = new Intent("com.digby.mm.android.library.geofence.BRAND_ENABLED_DISABLED");
        intent.putExtra("Enabled", true);
        getContext().sendBroadcast(intent);
_L2:
        ((ISharedPrefsManager) (obj)).setIsRegistering(false);
        obj = new Intent("com.digby.mm.android.library.geofence.DOWNLOAD_COMPLETE");
        ((Intent) (obj)).putExtra("Success", flag);
        getContext().sendBroadcast(((Intent) (obj)));
        Logger.Debug("DeviceRegistrationEvent_afterSend", getContext());
        DigbyController.getInstance(getContext().getApplicationContext()).getGeoFences(mGeoFenceReceiver);
        Logger.Debug("DeviceRegistrationEvent_afterGetGeoFences", getContext());
        return;
        ((ISharedPrefsManager) (obj)).getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public JSONObject getJSON()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = super.getJSON();
        }
        catch (Exception exception)
        {
            Logger.Error("getJSON", exception);
            return jsonobject;
        }
        jsonobject = jsonobject1;
        jsonobject1.put("deviceRegKey", mRegKey);
        jsonobject = jsonobject1;
        jsonobject1.put("osType", "ANDROID");
        jsonobject = jsonobject1;
        jsonobject1.put("osVersion", DigbyController.getInstance(getContext()).getSettings().getAndroidVersion());
        jsonobject = jsonobject1;
        jsonobject1.put("deviceType", "PHONE");
        jsonobject = jsonobject1;
        jsonobject1.put("searchRadius", Integer.valueOf(DigbyController.getInstance(getContext()).getSettings().getSearchRadiusInMeters()));
        jsonobject = jsonobject1;
        jsonobject1.put("geoFenceDelta", false);
        jsonobject = jsonobject1;
        jsonobject1.put("gcm", true);
        return jsonobject1;
    }

    String getTypeID()
    {
        return "DEVICE_REGISTRATION";
    }
}
