// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.util.DateFormatter;
import com.thetransitapp.droid.util.ServiceUtility;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            BaseRealTimeDataSource, Prediction

public class JSONRealTimeDataSource extends BaseRealTimeDataSource
{

    private static final long serialVersionUID = 1L;

    public JSONRealTimeDataSource()
    {
    }

    private String dateStringInPredictionObject(JSONObject jsonobject)
    {
        Object obj1 = jsonValueAtKeyPath(jsonobject, getTimestampKeyPath());
        Object obj = obj1;
        if (getDateKeyPath() != null)
        {
            obj = (new StringBuilder()).append(obj1).append(" ").append(jsonValueAtKeyPath(jsonobject, getDateKeyPath()).toString()).toString();
        }
        if (obj instanceof Integer)
        {
            jsonobject = obj.toString();
        } else
        {
            jsonobject = ((JSONObject) (obj));
        }
        return (String)jsonobject;
    }

    private Prediction predictionFromObjectAndRealStopTime(JSONObject jsonobject, Date date)
    {
        Prediction prediction = new Prediction();
        prediction.setStopTime(date);
        if (getScheduleBasedKeyPath() != null)
        {
            prediction.setScheduleBased(valueMatchScheduleBased(jsonValueAtKeyPath(jsonobject, getScheduleBasedKeyPath())));
        }
        if (getCancelledKeyPath() != null)
        {
            prediction.setCancelled(valueMatchCancelled(jsonValueAtKeyPath(jsonobject, getCancelledKeyPath())));
        }
        if (getDestinationFilteringKeyPath() != null)
        {
            prediction.setTripHeadsign((String)jsonValueAtKeyPath(jsonobject, getDestinationFilteringKeyPath()));
        }
        return prediction;
    }

    private Object stringValueAtKeyPath(JSONObject jsonobject, String s)
    {
        if (s == null)
        {
            jsonobject = null;
        } else
        {
            s = ((String) (jsonValueAtKeyPath(jsonobject, getRouteFilteringKeyPath())));
            jsonobject = s;
            if (s instanceof Integer)
            {
                return s.toString();
            }
        }
        return jsonobject;
    }

    Object jsonValueAtKeyPath(JSONObject jsonobject, String s)
    {
        String as[];
        int i;
        int j;
        i = 0;
        String as1[] = s.split("\\.");
        as = as1;
        if (as1.length == 0)
        {
            as = new String[1];
            as[0] = s;
        }
        j = as.length;
_L7:
        if (i < j) goto _L2; else goto _L1
_L1:
        return jsonobject;
_L2:
        s = as[i];
        jsonobject = (JSONObject)jsonobject;
        if (jsonobject.isNull(s) || !jsonobject.has(s))
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (jsonobject.get(s)));
        jsonobject = s;
        if (s instanceof JSONArray) goto _L1; else goto _L3
_L3:
        jsonobject = s;
        if (s instanceof Integer) goto _L1; else goto _L4
_L4:
        jsonobject = s;
        if (s instanceof String) goto _L1; else goto _L5
_L5:
        jsonobject = (JSONObject)s;
_L8:
        i++;
        if (true) goto _L7; else goto _L6
        jsonobject;
        jsonobject = null;
          goto _L8
_L6:
        return null;
    }

    public Object parseStream(InputStream inputstream)
    {
        inputstream = ServiceUtility.convertStreamToString(inputstream);
        try
        {
            if (inputstream.startsWith("["))
            {
                return new JSONArray(inputstream);
            }
            inputstream = new JSONObject(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e("Invalid JSON", inputstream.getMessage());
            return null;
        }
        return inputstream;
    }

    protected List processScheduleResponse(Object obj, MergedItinerary mergeditinerary)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        ArrayList arraylist1;
        if (getPredictionsKeyPath() != null)
        {
            obj = jsonValueAtKeyPath((JSONObject)obj, getPredictionsKeyPath());
        } else
        {
            obj = (JSONArray)obj;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (obj instanceof JSONObject)
        {
            arraylist1 = new ArrayList();
            arraylist1.add(obj);
            obj = new JSONArray(arraylist1);
        }
        obj = (JSONArray)obj;
        i = 0;
_L5:
        if (i < ((JSONArray) (obj)).length()) goto _L3; else goto _L2
_L2:
        return arraylist;
_L3:
        JSONObject jsonobject;
        Object obj1;
        Object obj2;
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        obj1 = stringValueAtKeyPath(jsonobject, getRouteFilteringKeyPath());
        obj2 = stringValueAtKeyPath(jsonobject, getStopFilteringKeyPath());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (!obj1.equals(mergeditinerary.getRealTimeRouteId()))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        if (!obj2.equals(mergeditinerary.getRealTimeStopId()))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj1 = dateStringInPredictionObject(jsonobject);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj1 = getTimestampFormat().format(((String) (obj1)));
        if (obj1 != null)
        {
            try
            {
                arraylist.add(predictionFromObjectAndRealStopTime(jsonobject, ((Date) (obj1))));
            }
            catch (JSONException jsonexception)
            {
                Log.e(com/thetransitapp/droid/model/realtime/JSONRealTimeDataSource.getSimpleName(), jsonexception.getMessage(), jsonexception);
                Crashlytics.logException(jsonexception);
            }
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
