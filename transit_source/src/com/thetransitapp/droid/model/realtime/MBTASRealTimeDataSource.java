// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            JSONRealTimeDataSource, Prediction

public class MBTASRealTimeDataSource extends JSONRealTimeDataSource
{

    private static final long serialVersionUID = 1L;

    public MBTASRealTimeDataSource()
    {
    }

    protected List processScheduleResponse(Object obj, MergedItinerary mergeditinerary)
    {
        int i;
        ArrayList arraylist = new ArrayList();
        obj = (JSONObject)obj;
        JSONObject jsonobject;
        JSONArray jsonarray;
        Object obj1;
        Object obj2;
        int j;
        int k;
        try
        {
            obj = ((JSONObject) (obj)).getJSONObject("TripList").getJSONArray("Trips");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(com/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource.getSimpleName(), ((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
            Crashlytics.logException(((Throwable) (obj)));
            return arraylist;
        }
        i = 0;
_L5:
        if (i >= ((JSONArray) (obj)).length())
        {
            return arraylist;
        }
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        if (!jsonobject.has("Predictions")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.getJSONArray("Predictions");
        j = 0;
_L3:
        if (j >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = jsonarray.getJSONObject(j);
        obj2 = jsonValueAtKeyPath(((JSONObject) (obj1)), "StopID");
        if (mergeditinerary.getRealTimeStopId().equals(obj2))
        {
            k = ((JSONObject) (obj1)).getInt("Seconds");
            obj1 = new Prediction();
            ((Prediction) (obj1)).setTripHeadsign(jsonobject.getString("Destination"));
            ((Prediction) (obj1)).setStopTime(new Date((new Date()).getTime() + (long)(k * 1000)));
            arraylist.add(obj1);
        }
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
