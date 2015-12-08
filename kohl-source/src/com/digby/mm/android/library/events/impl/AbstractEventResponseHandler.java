// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.content.Intent;
import com.digby.localpoint.sdk.core.impl.LPID;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.localpoint.sdk.core.impl.LPMessageProvider;
import com.digby.localpoint.sdk.core.util.LocationEventBroadcaster;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.exception.DigbyException;
import com.digby.mm.android.library.exception.DisabledBrandException;
import com.digby.mm.android.library.exception.DisabledGeoFenceException;
import com.digby.mm.android.library.exception.InvalidAppIdException;
import com.digby.mm.android.library.exception.InvalidBrandCodeException;
import com.digby.mm.android.library.exception.InvalidEventTypeException;
import com.digby.mm.android.library.exception.InvalidGeoFenceException;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.location.impl.GeofenceManager;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            GeoFenceEntryEvent, GeoFenceExitEvent, EventBroadcaster, EventResponse, 
//            DownloadGeoFencesEvent, CampaignMessageHandler

public abstract class AbstractEventResponseHandler
    implements IEventResponseHandler
{

    private IGeofenceManager geofenceManager;
    private IEvent mEvent;
    private JSONObject mJSONResponse;
    private JSONArray mMessageIDs;
    private List mMessages;

    public AbstractEventResponseHandler()
    {
        mMessages = new ArrayList();
        mMessageIDs = new JSONArray();
    }

    private List addGeoFences(JSONArray jsonarray, GeoFenceDBHelper geofencedbhelper)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        i = 0;
_L10:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Logger.Debug("Add GeoFence", mEvent.getContext());
        obj = jsonarray.getJSONObject(i);
        obj1 = geofencedbhelper.getGeoFence(((JSONObject) (obj)).getLong("id"));
        boolean flag;
        flag = true;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj1 = ((IGeoFence) (obj1)).getGeoShape();
        flag = false;
        arraylist1.add(obj1);
        arraylist1.add(((IGeoShape) (obj1)).getGeoShapeForEntryTracking());
        obj = geofencedbhelper.insertGeoFence(((JSONObject) (obj)));
        if (!flag) goto _L4; else goto _L3
_L3:
        LocationEventBroadcaster.getInstance(mEvent.getContext()).broadcastLocationAdd(new LPID(Long.toString(((IGeoFence) (obj)).getID())));
_L6:
        if (DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().getUseLocationServices() && ((IGeoFence) (obj)).isValidEventType(com/digby/mm/android/library/events/impl/GeoFenceEntryEvent) && ((IGeoFence) (obj)).isValidEventType(com/digby/mm/android/library/events/impl/GeoFenceExitEvent))
        {
            obj = ((IGeoFence) (obj)).getGeoShape();
            arraylist.add(obj);
            arraylist.add(((IGeoShape) (obj)).getGeoShapeForEntryTracking());
        }
        break MISSING_BLOCK_LABEL_305;
_L4:
        LocationEventBroadcaster.getInstance(mEvent.getContext()).broadcastLocationModify(new LPID(Long.toString(((IGeoFence) (obj)).getID())));
        if (true) goto _L6; else goto _L5
_L5:
        jsonarray;
        Logger.Error("addGeoFences", jsonarray);
_L8:
        return arraylist;
_L2:
        if (arraylist1.isEmpty()) goto _L8; else goto _L7
_L7:
        geofenceManager.removeGeofences(arraylist1);
        return arraylist;
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private DigbyException getException()
    {
        DigbyException digbyexception = new DigbyException("", new Object[0]);
        mJSONResponse.getInt("errorCode");
        JVM INSTR tableswitch 401 407: default 222
    //                   401 85
    //                   402 106
    //                   403 127
    //                   404 148
    //                   405 64
    //                   406 169
    //                   407 190;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return new DigbyException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L2:
        return new InvalidBrandCodeException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L3:
        return new InvalidAppIdException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L4:
        return new InvalidGeoFenceException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L5:
        return new DisabledGeoFenceException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L6:
        return new InvalidEventTypeException(mJSONResponse.getString("errorMessage"), new Object[0]);
_L7:
        DisabledBrandException disabledbrandexception = new DisabledBrandException(mJSONResponse.getString("errorMessage"), new Object[0]);
        return disabledbrandexception;
        Exception exception;
        exception;
        Logger.Error("getException", exception);
        return digbyexception;
    }

    private void removeAllGeoFences()
    {
        try
        {
            GeoFenceDBHelper geofencedbhelper = new GeoFenceDBHelper(new DigbyDBHelper(mEvent.getContext()));
            geofenceManager.removeAllGeofences();
            geofencedbhelper.deleteAllGeoFences();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("removeAllProximityAlerts", exception);
        }
    }

    private void removeGeoFences(JSONArray jsonarray, GeoFenceDBHelper geofencedbhelper)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
_L2:
        Object obj;
        StringBuilder stringbuilder;
        long l;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        l = jsonarray.getLong(i);
        obj = geofencedbhelper.getGeoFence(l);
        stringbuilder = (new StringBuilder()).append("GeoFence == null: ");
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Logger.Debug(stringbuilder.append(flag).toString(), mEvent.getContext());
        if (DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().getUseLocationServices() && ((IGeoFence) (obj)).isValidEventType(com/digby/mm/android/library/events/impl/GeoFenceEntryEvent) && ((IGeoFence) (obj)).isValidEventType(com/digby/mm/android/library/events/impl/GeoFenceExitEvent))
        {
            obj = ((IGeoFence) (obj)).getGeoShape();
            arraylist.add(obj);
            arraylist.add(((IGeoShape) (obj)).getGeoShapeForEntryTracking());
        }
        geofencedbhelper.deleteGeoFence(l);
        LocationEventBroadcaster.getInstance(mEvent.getContext()).broadcastLocationRemove(new LPID(Long.toString(l)));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (!arraylist.isEmpty())
            {
                geofenceManager.removeGeofences(arraylist);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Logger.Error("removeGeoFences", jsonarray);
        }
        return;
    }

    private Map toMap(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = jsonobject.keys();
        do
        {
            obj = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (String)iterator.next();
            hashmap.put(obj, jsonobject.get(((String) (obj))).toString());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void handleBrandDisabled()
    {
        try
        {
            Logger.Debug("Send Brand Disabled intent", mEvent.getContext());
            Intent intent = new Intent("com.digby.mm.android.library.geofence.BRAND_ENABLED_DISABLED");
            intent.putExtra("Enabled", false);
            mEvent.getContext().sendBroadcast(intent);
            Logger.Debug("Remove all geoFences", mEvent.getContext());
            removeAllGeoFences();
            Logger.Debug("unregister device", mEvent.getContext());
            DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().setDeviceRegistered(false);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("handleBrandDisabled", exception);
        }
    }

    public final void handleEventResponse(JSONObject jsonobject, IEvent ievent)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        if (jsonobject.has("Response"))
        {
            break MISSING_BLOCK_LABEL_21;
        }
        Logger.Warn("handleEventResponse: no response from the event.");
        return;
        mEvent = ievent;
        geofenceManager = GeofenceManager.getInstance(mEvent.getContext());
        Logger.Debug((new StringBuilder()).append("Response: ").append(jsonobject.getString("Response")).toString(), mEvent.getContext());
        mJSONResponse = new JSONObject(jsonobject.getString("Response"));
        if (jsonobject.getInt("ResponseCode") != 200) goto _L2; else goto _L1
_L1:
        DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().getLastDownloadInfo().saveInfo();
        ievent = DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().getGeoFencesInside();
        handleMessages(mJSONResponse.getJSONArray("messages"));
        handleGeoFenceChanges(mJSONResponse.getJSONObject("geoFences"));
        new EventBroadcaster(mEvent.getContext(), mJSONResponse.getJSONObject("geoFences").getJSONArray("in"), mMessageIDs, mEvent.getEventLocation(), ievent);
        onResponse(new EventResponse(mEvent, mMessages));
_L5:
        ievent = mEvent;
        boolean flag;
        if (jsonobject.getInt("ResponseCode") == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            ievent.afterSend(flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.Error("handleEventResponse", jsonobject);
        }
        return;
_L2:
        Logger.Debug((new StringBuilder()).append("Response Code: ").append(jsonobject.getInt("ResponseCode")).toString(), mEvent.getContext());
        ievent = getException();
        if (!(ievent instanceof DisabledBrandException)) goto _L4; else goto _L3
_L3:
        Logger.Debug("handleBrandDisabled", mEvent.getContext());
        handleBrandDisabled();
_L7:
        onError(ievent);
          goto _L5
_L4:
        if (!(ievent instanceof DisabledGeoFenceException)) goto _L7; else goto _L6
_L6:
        Logger.Debug("handleGeoFenceDisabled", mEvent.getContext());
        handleGeoFenceDisabled();
          goto _L7
    }

    public final void handleGeoFenceChanges(JSONObject jsonobject)
    {
        try
        {
            GeoFenceDBHelper geofencedbhelper = new GeoFenceDBHelper(new DigbyDBHelper(mEvent.getContext()));
            ArrayList arraylist = new ArrayList();
            if (jsonobject.has("plus"))
            {
                arraylist.addAll(addGeoFences(jsonobject.getJSONArray("plus"), geofencedbhelper));
            }
            if (jsonobject.has("minus"))
            {
                removeGeoFences(jsonobject.getJSONArray("minus"), geofencedbhelper);
            }
            if (jsonobject.has("in"))
            {
                DigbyController.getInstance(mEvent.getContext()).getSharedPrefsManager().setGeoFencesInside(jsonobject.getJSONArray("in"));
            }
            geofenceManager.addGeofences(arraylist, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.Error("handleGeoFenceChanges", jsonobject);
        }
    }

    public final void handleGeoFenceDisabled()
    {
        try
        {
            DigbyController.getInstance(mEvent.getContext()).sendEvent(new DownloadGeoFencesEvent(mEvent.getContext()), new AbstractEventResponseHandler() {

                final AbstractEventResponseHandler this$0;

                public void onError(DigbyException digbyexception)
                {
                }

                public void onResponse(IEventResponse ieventresponse)
                {
                    Logger.Debug("Send GeoFencesUpdated Intent", mEvent.getContext());
                    ieventresponse = new Intent("com.digby.mm.android.library.GeoFencesUpdated");
                    mEvent.getContext().sendBroadcast(ieventresponse);
                }

            
            {
                this$0 = AbstractEventResponseHandler.this;
                super();
            }
            });
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("handleGeoFenceDisabled", exception);
        }
    }

    public final void handleMessages(JSONArray jsonarray)
    {
        try
        {
            (new CampaignMessageHandler(mEvent.getContext(), mMessages, mMessageIDs)).handleMessages(jsonarray);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Logger.Error("handleMessages", jsonarray);
        }
    }

    boolean messageIsInDB(long l)
    {
        com.digby.localpoint.sdk.core.ILPMessage ilpmessage;
        try
        {
            ilpmessage = LPLocalpointService.getInstance(mEvent.getContext()).getMessageProvider().getMessage(new LPID(Long.toString(l)));
        }
        catch (Exception exception)
        {
            Logger.Error("messageIsInDB", exception);
            return false;
        }
        return ilpmessage != null;
    }

}
