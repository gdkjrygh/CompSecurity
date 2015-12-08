// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.digby.mm.android.library.comparator.impl.GeoShapeComparator;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.StatusCodesUtils;
import com.digby.mm.android.library.utils.impl.LocationHelper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            GeofenceManager

public class GeofencingGeofenceManager extends GeofenceManager
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener
{

    private LocationClient mClientAdd;
    private LocationClient mClientRemove;
    private LocationClient mClientRemoveAll;
    private PendingIntent mPendingIntent;
    private boolean needUpdateMonitoringRegion;
    private List waitingGeoshapes;
    private boolean waitingRemoveAllGeofences;
    private List waitingRemoveGeoshapes;

    GeofencingGeofenceManager(Context context)
    {
        super(context);
        waitingGeoshapes = new ArrayList();
        waitingRemoveGeoshapes = new ArrayList();
        waitingRemoveAllGeofences = false;
        mClientAdd = new LocationClient(mContext, this, this);
        mClientRemove = new LocationClient(mContext, this, this);
        mClientRemoveAll = new LocationClient(mContext, this, this);
        context = new Intent(mContext, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        context.setAction("Action_Geofence_Breached");
        mPendingIntent = PendingIntent.getService(mContext, 0, context, 0x8000000);
    }

    private final void addGeofenceWhenConnected(List list)
    {
        if (!needUpdateMonitoringRegion && (list == null || list.isEmpty()))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        Object obj;
        List list1;
        int i;
        if (needUpdateMonitoringRegion)
        {
            Logger.Debug((new StringBuilder()).append("GeofenceManager - try to add ").append(list.size() + 1).append(" geofences.").toString(), mContext);
        } else
        {
            Logger.Debug((new StringBuilder()).append("GeofenceManager - try to add ").append(list.size()).append(" geofences.").toString(), mContext);
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        allGeoshapes.addAll(list);
        list1 = convertToGeofences(getGeoshapesNeedMonitor(list));
        if (!needUpdateMonitoringRegion)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        list = null;
        try
        {
            if (mClientAdd.isConnected())
            {
                list = mClientAdd.getLastLocation();
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in addGeofenceWhenConnected", list);
            return;
        }
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj = (new LocationHelper(mContext)).getBestCachedLocation();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        i = Integer.valueOf(DigbyController.getInstance(mContext).getSettings().getSearchRadiusInMeters()).intValue() / 2;
        Logger.Debug((new StringBuilder()).append("Change monitor region ").append(i).append(" to: https://www.google.com/#q=").append(((Location) (obj)).getLatitude()).append("%2C%20").append(((Location) (obj)).getLongitude()).toString(), mContext);
        list1.add((new com.google.android.gms.location.Geofence.Builder()).setCircularRegion(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude(), i).setExpirationDuration(-1L).setRequestId("Monitoring-Region-ID").setTransitionTypes(2).build());
        if (!list1.isEmpty() && mClientAdd.isConnected())
        {
            mClientAdd.addGeofences(list1, mPendingIntent, new com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener() {

                final GeofencingGeofenceManager this$0;

                public void onAddGeofencesResult(int j, String as[])
                {
                    Logger.Debug((new StringBuilder()).append("GeofenceManager - onAddGeofencesResult. ").append(StatusCodesUtils.getLocationStatus(j)).append(": ").append(TextUtils.join(",", as)).toString(), mContext);
                    try
                    {
                        Logger.Debug("GeofenceManager - add geofences finished, disconnect it.", mContext);
                        mClientAdd.disconnect();
                        waitingGeoshapes.clear();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String as[])
                    {
                        Logger.Error("Error in onAddGeofencesResult", as);
                    }
                }

            
            {
                this$0 = GeofencingGeofenceManager.this;
                super();
            }
            });
        }
        Logger.Debug((new StringBuilder()).append("GeofenceManager - added ").append(list1.size()).append(" geofences.").toString(), mContext);
    }

    private List convertToGeofences(List list)
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            for (list = list.iterator(); list.hasNext(); arraylist.add(((IGeoShape)list.next()).asGeofence())) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in convertToGeofences", list);
        }
        return arraylist;
    }

    private List getGeofenceRequestIds(List list)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (list.isEmpty())
        {
            return arraylist;
        }
        try
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                IGeoShape igeoshape = (IGeoShape)list.next();
                if (igeoshape.getRequestId() != null)
                {
                    arraylist.add(igeoshape.getRequestId());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in getGeofenceRequestIds", list);
        }
        return arraylist;
    }

    private List getGeoshapesNeedMonitor(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (allGeoshapes.size() <= 99)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        list = null;
        if (mClientAdd.isConnected())
        {
            list = mClientAdd.getLastLocation();
        }
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = (new LocationHelper(mContext)).getBestCachedLocation();
        Collections.sort(allGeoshapes, new GeoShapeComparator(((Location) (obj))));
        obj = new ArrayList();
        ((List) (obj)).addAll(allGeoshapes.subList(0, 99));
        allGeoshapes = ((List) (obj));
        return ((List) (obj));
        return list;
        list;
        obj = arraylist;
_L2:
        Logger.Error("Error in addGeofences", list);
        return ((List) (obj));
        list;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void removeAllGeofencesWhenConnected()
    {
        Logger.Debug("GeofenceManager - try to remove all geofences.", mContext);
        try
        {
            mClientRemoveAll.removeGeofences(mPendingIntent, this);
            allGeoshapes.clear();
            waitingRemoveAllGeofences = false;
            Logger.Debug("GeofenceManager - clearing all geofences.", mContext);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in removeAllGeofencesWhenConnected", exception);
        }
    }

    private final void removeGeofencesWhenConnected(List list)
    {
        if (list == null || list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Logger.Debug((new StringBuilder()).append("GeofenceManager - try to remove ").append(list.size()).append(" geofences.").toString(), mContext);
        List list1 = getGeofenceRequestIds(list);
        mClientRemove.removeGeofences(list1, this);
        allGeoshapes.removeAll(list);
        Logger.Debug((new StringBuilder()).append("GeofenceManager - removing ").append(list1.size()).append(" geofences.").toString(), mContext);
        return;
        list;
        Logger.Error("Error in removeGeofencesWhenConnected", list);
        return;
    }

    public void addGeofences(List list, boolean flag)
    {
        Logger.Debug("GeofenceManager - addGeofences", mContext);
        if (!flag && (list == null || list.isEmpty()))
        {
            return;
        }
        needUpdateMonitoringRegion = flag;
        try
        {
            if (mClientAdd.isConnected())
            {
                addGeofenceWhenConnected(list);
                waitingGeoshapes.clear();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in addGeofences", list);
            return;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        waitingGeoshapes.addAll(list);
        if (mClientAdd.isConnecting())
        {
            Logger.Debug("LocationClient is connecting, just wait when it connected", mContext);
            return;
        }
        Logger.Warn("LocationClient is not connecting, reconnect it.");
        mClientAdd.connect();
        return;
    }

    public void onConnected(Bundle bundle)
    {
        Logger.Debug("GeofenceManager - onConnected.", mContext);
        if (!waitingRemoveAllGeofences) goto _L2; else goto _L1
_L1:
        removeAllGeofencesWhenConnected();
_L4:
        addGeofenceWhenConnected(waitingGeoshapes);
        return;
_L2:
        if (waitingRemoveGeoshapes != null && !waitingRemoveGeoshapes.isEmpty())
        {
            removeGeofencesWhenConnected(waitingRemoveGeoshapes);
        }
        if (true) goto _L4; else goto _L3
_L3:
        bundle;
        Logger.Error("Error in onConnected", bundle);
        return;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Logger.Warn((new StringBuilder()).append("GeofenceManager - onConnectionFailed:").append(connectionresult.getErrorCode()).toString());
    }

    public void onDisconnected()
    {
        Logger.Debug("GeofenceManager - onDisconnected.", mContext);
    }

    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
    {
        Logger.Debug((new StringBuilder()).append("GeofenceManager - onRemoveGeofencesByPendingIntentResult:").append(StatusCodesUtils.getLocationStatus(i)).toString(), mContext);
        Logger.Debug("GeofenceManager - remove geofences finished, disconnect it.", mContext);
        try
        {
            mClientRemove.disconnect();
            waitingRemoveAllGeofences = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            Logger.Error("Error in onRemoveGeofencesByPendingIntentResult", pendingintent);
        }
    }

    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
    {
        Logger.Debug((new StringBuilder()).append("GeofenceManager - onRemoveGeofencesByPendingIntentResult. ").append(StatusCodesUtils.getLocationStatus(i)).append(": ").append(TextUtils.join(",", as)).toString(), mContext);
        Logger.Debug("GeofenceManager - remove geofences finished, disconnect it.", mContext);
        try
        {
            mClientRemoveAll.disconnect();
            waitingGeoshapes.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Logger.Error("Error in onRemoveGeofencesByRequestIdsResult", as);
        }
    }

    public void removeAllGeofences()
    {
        Logger.Debug("GeofenceManager - removeAllGeofences.", mContext);
        try
        {
            if (mClientRemoveAll.isConnected())
            {
                removeAllGeofencesWhenConnected();
                waitingRemoveAllGeofences = false;
                return;
            }
        }
        catch (Exception exception)
        {
            Logger.Error("Error in removeAllGeofences", exception);
            return;
        }
        Logger.Warn("LocationClient is not connected yet");
        waitingRemoveAllGeofences = true;
        if (mClientRemoveAll.isConnecting())
        {
            Logger.Debug("LocationClient is connecting, just wait when it connected", mContext);
            return;
        }
        Logger.Warn("LocationClient is not connecting, reconnect it.");
        mClientRemoveAll.connect();
        return;
    }

    public void removeGeofences(List list)
    {
        Logger.Debug("GeofenceManager - removeGeofences", mContext);
        if (list == null || list.isEmpty())
        {
            return;
        }
        Logger.Debug((new StringBuilder()).append("GeofenceManager - remove ").append(list.size()).append(" geofences.").toString(), mContext);
        try
        {
            if (mClientRemove.isConnected())
            {
                removeGeofencesWhenConnected(list);
                waitingRemoveGeoshapes = null;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.Error("Error in removeGeofences", list);
            return;
        }
        waitingRemoveGeoshapes = list;
        Logger.Warn("LocationClient is not connected yet");
        if (mClientRemove.isConnecting())
        {
            Logger.Debug("LocationClient is connecting, just wait when it connected", mContext);
            return;
        }
        Logger.Warn("LocationClient is not connecting, reconnect it.");
        mClientRemove.connect();
        return;
    }


}
