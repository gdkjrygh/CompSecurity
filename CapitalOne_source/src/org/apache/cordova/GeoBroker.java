// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            GPSListener, NetworkListener, CordovaLocationListener

public class GeoBroker extends CordovaPlugin
{

    private GPSListener gpsListener;
    private LocationManager locationManager;
    private NetworkListener networkListener;

    public GeoBroker()
    {
    }

    private void addWatch(String s, CallbackContext callbackcontext, boolean flag)
    {
        if (flag)
        {
            gpsListener.addWatch(s, callbackcontext);
            return;
        } else
        {
            networkListener.addWatch(s, callbackcontext);
            return;
        }
    }

    private void clearWatch(String s)
    {
        gpsListener.clearWatch(s);
        networkListener.clearWatch(s);
    }

    private void getCurrentLocation(CallbackContext callbackcontext, boolean flag)
    {
        if (flag)
        {
            gpsListener.addCallback(callbackcontext);
            return;
        } else
        {
            networkListener.addCallback(callbackcontext);
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (locationManager == null)
        {
            locationManager = (LocationManager)cordova.getActivity().getSystemService("location");
            networkListener = new NetworkListener(locationManager, this);
            gpsListener = new GPSListener(locationManager, this);
        }
        if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network"))
        {
            if (s.equals("getLocation"))
            {
                boolean flag = jsonarray.getBoolean(0);
                int i = jsonarray.getInt(1);
                jsonarray = locationManager;
                if (flag)
                {
                    s = "gps";
                } else
                {
                    s = "network";
                }
                s = jsonarray.getLastKnownLocation(s);
                if (s != null && System.currentTimeMillis() - s.getTime() <= (long)i)
                {
                    callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, returnLocationJSON(s)));
                } else
                {
                    getCurrentLocation(callbackcontext, flag);
                }
            } else
            if (s.equals("addWatch"))
            {
                addWatch(jsonarray.getString(0), callbackcontext, jsonarray.getBoolean(1));
            } else
            if (s.equals("clearWatch"))
            {
                clearWatch(jsonarray.getString(0));
            } else
            {
                return false;
            }
        } else
        {
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT, "Location API is not available for this device."));
        }
        return true;
    }

    public void fail(int i, String s, CallbackContext callbackcontext)
    {
        JSONObject jsonobject;
        Object obj;
        jsonobject = new JSONObject();
        obj = null;
        jsonobject.put("code", i);
        jsonobject.put("message", s);
        s = obj;
_L1:
        JSONException jsonexception;
        if (jsonobject != null)
        {
            s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, jsonobject);
        } else
        {
            s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, s);
        }
        callbackcontext.sendPluginResult(s);
        return;
        jsonexception;
        jsonexception = null;
        s = (new StringBuilder()).append("{'code':").append(i).append(",'message':'").append(s.replaceAll("'", "'")).append("'}").toString();
          goto _L1
    }

    public boolean isGlobalListener(CordovaLocationListener cordovalocationlistener)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (gpsListener == null)
            {
                break label0;
            }
            flag = flag1;
            if (networkListener == null)
            {
                break label0;
            }
            if (!gpsListener.equals(cordovalocationlistener))
            {
                flag = flag1;
                if (!networkListener.equals(cordovalocationlistener))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void onDestroy()
    {
        if (networkListener != null)
        {
            networkListener.destroy();
            networkListener = null;
        }
        if (gpsListener != null)
        {
            gpsListener.destroy();
            gpsListener = null;
        }
    }

    public void onReset()
    {
        onDestroy();
    }

    public JSONObject returnLocationJSON(Location location)
    {
        Object obj1;
        JSONObject jsonobject;
        obj1 = null;
        jsonobject = new JSONObject();
        Object obj;
        jsonobject.put("latitude", location.getLatitude());
        jsonobject.put("longitude", location.getLongitude());
        if (!location.hasAltitude())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj = Double.valueOf(location.getAltitude());
_L1:
        jsonobject.put("altitude", obj);
        jsonobject.put("accuracy", location.getAccuracy());
        obj = obj1;
        try
        {
            if (!location.hasBearing())
            {
                break MISSING_BLOCK_LABEL_98;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            location.printStackTrace();
            return jsonobject;
        }
        obj = obj1;
        if (location.hasSpeed())
        {
            obj = Float.valueOf(location.getBearing());
        }
        jsonobject.put("heading", obj);
        jsonobject.put("speed", location.getSpeed());
        jsonobject.put("timestamp", location.getTime());
        return jsonobject;
        obj = null;
          goto _L1
    }

    public void win(Location location, CallbackContext callbackcontext)
    {
        callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, returnLocationJSON(location)));
    }
}
