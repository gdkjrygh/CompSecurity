// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.location.impl.GeofenceManager;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent, DeviceRegistrationEvent

public class DownloadGeoFencesEvent extends AbstractEvent
{

    private static final String TYPE_ID = "DOWNLOAD_GEOFENCES";
    private IGeoFenceListReceiver mGeoFenceReceiver;
    private IDownloadInfo mInfo;

    public DownloadGeoFencesEvent(Context context)
    {
        super(context);
        mGeoFenceReceiver = new IGeoFenceListReceiver() {

            final DownloadGeoFencesEvent this$0;

            public void onReceive(List list)
            {
                if (list.size() == 0)
                {
                    DigbyController.getInstance(getContext()).getSharedPrefsManager().getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER);
                }
            }

            
            {
                this$0 = DownloadGeoFencesEvent.this;
                super();
            }
        };
    }

    private void removeAllGeoFences()
    {
        try
        {
            (new GeoFenceDBHelper(new DigbyDBHelper(getContext()))).deleteAllGeoFences();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("removeAllGeoFences", exception);
        }
    }

    private void removeAllProximityAlerts()
    {
        try
        {
            GeofenceManager.getInstance(getContext()).removeAllGeofences();
            removeAllGeoFences();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("removeAllProximityAlerts", exception);
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
            IEvent ievent;
            do
            {
                if (!queue.hasNext())
                {
                    break label0;
                }
                ievent = (IEvent)queue.next();
            } while (!(ievent instanceof DeviceRegistrationEvent) && !(ievent instanceof DownloadGeoFencesEvent));
            return false;
        }
        return true;
    }

    public void afterSend(boolean flag)
    {
        Intent intent;
        try
        {
            Logger.Debug("DownloadGeoFencesEvent_onReceive", getContext());
        }
        catch (Exception exception)
        {
            Logger.Error("afterSend", exception);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        mInfo.setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.COMPLETE);
_L2:
        intent = new Intent("com.digby.mm.android.library.geofence.DOWNLOAD_COMPLETE");
        intent.putExtra("Success", flag);
        getContext().sendBroadcast(intent);
        Logger.Debug("Download_afterSend", getContext());
        DigbyController.getInstance(getContext().getApplicationContext()).getGeoFences(mGeoFenceReceiver);
        Logger.Debug("Download_afterGetGeoFences", getContext());
        return;
        mInfo.setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void beforeSend()
    {
        try
        {
            removeAllProximityAlerts();
            mInfo = DigbyController.getInstance(getContext()).getSharedPrefsManager().getLastDownloadInfo();
            mInfo.setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.DOWNLOADING);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("beforeSend", exception);
        }
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
        jsonobject1.put("geoFenceDelta", false);
        return jsonobject1;
    }

    String getTypeID()
    {
        return "DOWNLOAD_GEOFENCES";
    }
}
