// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            JSONRealTimeDataSource, Prediction

public class GTFSRealTimeDataSource extends JSONRealTimeDataSource
{

    private static final long serialVersionUID = 1L;

    public GTFSRealTimeDataSource()
    {
    }

    public void getPredictionForItinerary(Context context, MergedItinerary mergeditinerary, BaseRealTimeDataSource.RealTimeCallback realtimecallback)
    {
        Object obj = mergeditinerary.getCurrentScheduleItem();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = mergeditinerary.getOngoingScheduleItems();
        if (((List) (obj1)).indexOf(obj) == -1 || mergeditinerary.getRoute().getFeed().getCode() == null || mergeditinerary.getRealTimeRouteId() == null) goto _L2; else goto _L3
_L3:
        String s = replaceVariablesInURLFromItinerary(getTripURL(), mergeditinerary);
        if (s == null) goto _L2; else goto _L4
_L4:
        obj = new String();
        obj1 = ((List) (obj1)).iterator();
_L8:
        if (((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append("?feed_code=").append(mergeditinerary.getRoute().getFeed().getCode()).toString()))).append("&stop_id=").append(mergeditinerary.getRealTimeStopId()).toString()))).append("&trip_ids=").append(((String) (obj))).toString();
        obj = s;
        if (mergeditinerary.getRealTimeRouteId() != null)
        {
            obj = (new StringBuilder(String.valueOf(s))).append("&route_id=").append(mergeditinerary.getRealTimeRouteId()).toString();
        }
        fetchPredictionForURL(context, ((String) (obj)), mergeditinerary, realtimecallback);
_L2:
        return;
_L6:
        ScheduleItem scheduleitem = (ScheduleItem)((Iterator) (obj1)).next();
        if (((String) (obj)).equals(""))
        {
            obj = scheduleitem.getTripId();
        } else
        {
            obj = (new StringBuilder(String.valueOf(obj))).append(",").append(scheduleitem.getTripId()).toString();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected List processScheduleResponse(Object obj, MergedItinerary mergeditinerary)
    {
        obj = (JSONObject)obj;
        if (!((JSONObject) (obj)).has("updates") || ((JSONObject) (obj)).isNull("updates")) goto _L2; else goto _L1
_L1:
        obj = ((JSONObject) (obj)).getJSONArray("updates");
        mergeditinerary = new ArrayList();
        int i = 0;
_L8:
        int j = ((JSONArray) (obj)).length();
        if (i >= j)
        {
            return mergeditinerary;
        }
        JSONObject jsonobject;
        Prediction prediction;
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        prediction = new Prediction();
        if (jsonobject.isNull("time")) goto _L4; else goto _L3
_L3:
        prediction.setStopTime(new Date(jsonobject.getLong("time") * 1000L));
_L6:
        if (!jsonobject.isNull("trip_id"))
        {
            prediction.setTripID(jsonobject.getString("trip_id"));
        }
        if (!jsonobject.isNull("headsign"))
        {
            prediction.setTripHeadsign(jsonobject.getString("headsign"));
        }
        if (!jsonobject.isNull("cancelled"))
        {
            prediction.setCancelled(jsonobject.getBoolean("cancelled"));
        }
        mergeditinerary.add(prediction);
          goto _L5
_L4:
        prediction.setDelay(jsonobject.getDouble("delay"));
          goto _L6
        JSONException jsonexception;
        jsonexception;
        Crashlytics.logException(jsonexception);
          goto _L5
        obj;
        Crashlytics.logException(((Throwable) (obj)));
_L2:
        return null;
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
