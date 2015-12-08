// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ExtendedData

public class LocationExtendedData extends ExtendedData
{

    private static final String KEY_COORDINATES = "coordinates";
    private static final int VERSION = 1;

    public LocationExtendedData(double d, double d1)
    {
        setCoordinates(d, d1);
    }

    protected void init()
    {
        setType(ExtendedData.Type.location);
        setVersion(1);
    }

    public void setCoordinates(double d, double d1)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            put("coordinates", jsonarray);
            jsonarray.put(0, d);
            jsonarray.put(1, d1);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.w("Error adding %s to LocationExtendedData.", new Object[] {
                "coordinates", jsonexception
            });
        }
    }
}
