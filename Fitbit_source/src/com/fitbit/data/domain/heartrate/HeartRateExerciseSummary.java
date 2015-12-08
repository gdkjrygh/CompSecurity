// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;

import com.fitbit.d.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.heartrate:
//            HeartRateDailySummary, HeartRateZone

public class HeartRateExerciseSummary extends HeartRateDailySummary
{

    public HeartRateExerciseSummary()
    {
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        a(a.e(jsonobject, "dateTime"));
        JSONArray jsonarray = jsonobject.optJSONArray("heartRateZones");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; jsonarray != null && i < jsonarray.length(); i++)
        {
            JSONObject jsonobject1 = jsonarray.optJSONObject(i);
            if (jsonobject1 != null)
            {
                HeartRateZone heartratezone = new HeartRateZone();
                heartratezone.initFromPublicApiJsonObject(jsonobject1);
                heartratezone.a(HeartRateZone.HeartRateZoneType.values()[i]);
                arraylist.add(heartratezone);
            }
        }

        b(arraylist);
        jsonarray = jsonobject.optJSONArray("customHeartRateZones");
        arraylist = new ArrayList();
        for (int j = ((flag) ? 1 : 0); jsonarray != null && j < jsonarray.length(); j++)
        {
            JSONObject jsonobject2 = jsonarray.optJSONObject(j);
            if (jsonobject2 != null)
            {
                HeartRateZone heartratezone1 = new HeartRateZone();
                heartratezone1.initFromPublicApiJsonObject(jsonobject2);
                heartratezone1.a(HeartRateZone.HeartRateZoneType.CUSTOM_ZONE);
                arraylist.add(heartratezone1);
            }
        }

        a(arraylist);
        a(jsonobject.optInt("value"));
    }
}
