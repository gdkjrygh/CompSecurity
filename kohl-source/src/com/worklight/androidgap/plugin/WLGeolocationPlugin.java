// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.worklight.common.Logger;
import java.util.HashMap;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLLocationListener, WLGPSListener, WLNetworkListener

public class WLGeolocationPlugin extends CordovaPlugin
{

    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WLGeolocationPlugin.getName());
    private WLGPSListener gpsListener;
    private LocationManager locationManager;
    private WLNetworkListener networkListener;

    public WLGeolocationPlugin()
    {
    }

    private void addWatch(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        WLLocationListener wllocationlistener = getListener(jsonarray, 1, 2, callbackcontext);
        if (wllocationlistener != null)
        {
            wllocationlistener.addWatch(jsonarray.getString(0), callbackcontext, jsonarray.getInt(3), jsonarray.getInt(4));
        }
    }

    private void clearWatch(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        jsonarray = jsonarray.getString(0);
        if (gpsListener.watches.containsKey(jsonarray))
        {
            gpsListener.clearWatch(jsonarray);
        } else
        if (networkListener.watches.containsKey(jsonarray))
        {
            networkListener.clearWatch(jsonarray);
            return;
        }
    }

    private WLLocationListener getListener(JSONArray jsonarray, int i, int j, CallbackContext callbackcontext)
        throws JSONException
    {
        boolean flag = jsonarray.getBoolean(i);
        Object obj = new Criteria();
        if (flag)
        {
            i = jsonarray.getInt(j);
            if (i < 100)
            {
                i = 3;
            } else
            if (i <= 500)
            {
                i = 2;
            } else
            {
                i = 1;
            }
        } else
        {
            i = 1;
        }
        ((Criteria) (obj)).setHorizontalAccuracy(i);
        obj = locationManager.getBestProvider(((Criteria) (obj)), true);
        if (i == 3)
        {
            jsonarray = "ACCURACY_HIGH";
        } else
        if (i == 2)
        {
            jsonarray = "ACCURACY_MEDIUM";
        } else
        {
            jsonarray = "ACCURACY_LOW";
        }
        if (obj == null)
        {
            fail(WLLocationListener.PERMISSION_DENIED, (new StringBuilder()).append("Android couldn't find a location provider for accuracy level ").append(jsonarray).append(" according to permissions in the Manifest and provider enablements in the device settings").toString(), callbackcontext, false);
            return null;
        }
        if (((String) (obj)).equals("gps"))
        {
            return gpsListener;
        }
        if (i == 3)
        {
            logger.warn((new StringBuilder()).append("Network provider selected for accuracy level ").append(jsonarray).append(". Check the manifest for the ACCESS_FINE_LOCATION permission").toString());
        }
        return networkListener;
    }

    private void getLocation(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        Object obj;
        Location location;
        Object obj1;
        int i;
        i = jsonarray.getInt(2);
        obj = gpsListener.getLastKnownLocation();
        location = networkListener.getLastKnownLocation();
        obj1 = null;
        if (obj == null || location == null) goto _L2; else goto _L1
_L1:
        if (((Location) (obj)).getTime() < location.getTime())
        {
            obj = location;
        }
_L8:
        if (obj == null || System.currentTimeMillis() - ((Location) (obj)).getTime() > (long)i) goto _L4; else goto _L3
_L3:
        callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, returnLocationJSON(((Location) (obj)))));
_L6:
        return;
_L2:
        if (obj == null)
        {
            obj = obj1;
            if (location != null)
            {
                obj = location;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = jsonarray.getString(0);
        jsonarray = getListener(jsonarray, 1, 3, callbackcontext);
        if (jsonarray == null) goto _L6; else goto _L5
_L5:
        jsonarray.addCallback(((String) (obj)), callbackcontext, i);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void removeCallback(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        jsonarray = jsonarray.getString(0);
        if (gpsListener.callbacks.containsKey(jsonarray))
        {
            gpsListener.removeCallback(jsonarray);
        } else
        if (networkListener.callbacks.containsKey(jsonarray))
        {
            networkListener.removeCallback(jsonarray);
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (locationManager == null)
        {
            locationManager = (LocationManager)cordova.getActivity().getSystemService("location");
            networkListener = new WLNetworkListener(locationManager, this);
            gpsListener = new WLGPSListener(locationManager, this);
        }
        if (s.equals("getLocation"))
        {
            getLocation(jsonarray, callbackcontext);
            return true;
        }
        if (s.equals("addWatch"))
        {
            addWatch(jsonarray, callbackcontext);
            return true;
        }
        if (s.equals("clearWatch"))
        {
            clearWatch(jsonarray, callbackcontext);
            return true;
        }
        if (s.equals("removeCallback"))
        {
            removeCallback(jsonarray, callbackcontext);
            return true;
        } else
        {
            return false;
        }
    }

    public void fail(int i, String s, CallbackContext callbackcontext, boolean flag)
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
            s = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, jsonobject);
        } else
        {
            s = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, s);
        }
        s.setKeepCallback(flag);
        callbackcontext.sendPluginResult(s);
        return;
        jsonexception;
        jsonexception = null;
        s = (new StringBuilder()).append("{'code':").append(i).append(",'message':'").append(s.replaceAll("'", "'")).append("'}").toString();
          goto _L1
    }

    public boolean isGlobalListener(WLLocationListener wllocationlistener)
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
            if (!gpsListener.equals(wllocationlistener))
            {
                flag = flag1;
                if (!networkListener.equals(wllocationlistener))
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
            break MISSING_BLOCK_LABEL_142;
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
                break MISSING_BLOCK_LABEL_102;
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
        jsonobject.put("velocity", location.getSpeed());
        jsonobject.put("timestamp", location.getTime());
        return jsonobject;
        obj = null;
          goto _L1
    }

    public void win(Location location, CallbackContext callbackcontext, boolean flag)
    {
        location = new PluginResult(org.apache.cordova.PluginResult.Status.OK, returnLocationJSON(location));
        location.setKeepCallback(flag);
        callbackcontext.sendPluginResult(location);
    }

}
