// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.wifi.WLWifiAccessPoint;
import com.worklight.location.api.wifi.WLWifiLocation;
import com.worklight.location.internal.geo.EmptyGeoPosition;
import com.worklight.location.internal.wifi.EmptyWifiPosition;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.location.internal:
//            DeviceContextImpl

class DeviceContextJSONFactory
{

    DeviceContextJSONFactory()
    {
    }

    private static JSONObject buildAccessPointJson(WLWifiAccessPoint wlwifiaccesspoint)
        throws JSONException
    {
        if (wlwifiaccesspoint == null)
        {
            return null;
        } else
        {
            return cleanNullValues((new JSONObject()).put("SSID", wlwifiaccesspoint.getSSID()).put("MAC", wlwifiaccesspoint.getMAC()));
        }
    }

    private static JSONArray buildAccessPointsJson(Collection collection)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); jsonarray.put(buildAccessPointJson((WLWifiAccessPoint)collection.next()))) { }
        return jsonarray;
    }

    private static JSONObject buildCoordJson(WLCoordinate wlcoordinate)
        throws JSONException
    {
        return cleanNullValues((new JSONObject()).put("accuracy", wlcoordinate.getAccuracy()).put("longitude", wlcoordinate.getLongitude()).put("latitude", wlcoordinate.getLatitude()).put("altitude", wlcoordinate.getAltitude()).put("altitudeAccuracy", wlcoordinate.getAltitudeAccuracy()).put("speed", wlcoordinate.getSpeed()).put("heading", wlcoordinate.getHeading()));
    }

    private static JSONObject buildGeoJson(WLGeoPosition wlgeoposition)
        throws JSONException
    {
        if (wlgeoposition == null)
        {
            return null;
        }
        if (wlgeoposition instanceof EmptyGeoPosition)
        {
            return new JSONObject();
        } else
        {
            return cleanNullValues((new JSONObject()).put("timestamp", wlgeoposition.getTimestamp()).put("coords", buildCoordJson(wlgeoposition.getCoordinate())));
        }
    }

    private static JSONObject buildWifiJson(WLWifiLocation wlwifilocation)
        throws JSONException
    {
        if (wlwifilocation == null)
        {
            return null;
        }
        if (wlwifilocation instanceof EmptyWifiPosition)
        {
            return new JSONObject();
        } else
        {
            return cleanNullValues((new JSONObject()).put("timestamp", wlwifilocation.getTimestamp()).put("accessPoints", buildAccessPointsJson(wlwifilocation.getAccessPoints())).put("connectedAccessPoint", buildAccessPointJson(wlwifilocation.getConnectedAccessPoint())));
        }
    }

    private static JSONObject cleanNullValues(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = new JSONObject();
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj != null)
            {
                jsonobject1.put(s, obj);
            }
        } while (true);
        return jsonobject1;
    }

    public JSONObject buildJson(DeviceContextImpl devicecontextimpl)
        throws JSONException
    {
        if (devicecontextimpl == null || devicecontextimpl.isEmpty())
        {
            return null;
        } else
        {
            WLGeoPosition wlgeoposition = devicecontextimpl.getGeoPosition();
            WLWifiLocation wlwifilocation = devicecontextimpl.getWifiLocation();
            Integer integer = devicecontextimpl.getTimezoneOffset();
            devicecontextimpl = devicecontextimpl.getLastModified();
            return cleanNullValues((new JSONObject()).put("lastModified", devicecontextimpl).put("timezoneOffset", integer).put("Geo", buildGeoJson(wlgeoposition)).put("Wifi", buildWifiJson(wlwifilocation)));
        }
    }
}
