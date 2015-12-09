// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.api.CallbackContext;

// Referenced classes of package org.apache.cordova:
//            GeoBroker

public class CordovaLocationListener
    implements LocationListener
{

    public static int PERMISSION_DENIED = 1;
    public static int POSITION_UNAVAILABLE = 2;
    public static int TIMEOUT = 3;
    private String TAG;
    private List callbacks;
    protected LocationManager locationManager;
    private GeoBroker owner;
    protected boolean running;
    public HashMap watches;

    public CordovaLocationListener(LocationManager locationmanager, GeoBroker geobroker, String s)
    {
        running = false;
        watches = new HashMap();
        callbacks = new ArrayList();
        TAG = "[Cordova Location Listener]";
        locationManager = locationmanager;
        owner = geobroker;
        TAG = s;
    }

    private void stop()
    {
        if (running)
        {
            locationManager.removeUpdates(this);
            running = false;
        }
    }

    private void win(Location location)
    {
        CallbackContext callbackcontext;
        for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); owner.win(location, callbackcontext))
        {
            callbackcontext = (CallbackContext)iterator.next();
        }

        if (owner.isGlobalListener(this))
        {
            Log.d(TAG, "Stopping global listener");
            stop();
        }
        callbacks.clear();
        for (Iterator iterator1 = watches.values().iterator(); iterator1.hasNext(); owner.win(location, (CallbackContext)iterator1.next())) { }
    }

    public void addCallback(CallbackContext callbackcontext)
    {
        callbacks.add(callbackcontext);
        if (size() == 1)
        {
            start();
        }
    }

    public void addWatch(String s, CallbackContext callbackcontext)
    {
        watches.put(s, callbackcontext);
        if (size() == 1)
        {
            start();
        }
    }

    public void clearWatch(String s)
    {
        if (watches.containsKey(s))
        {
            watches.remove(s);
        }
        if (size() == 0)
        {
            stop();
        }
    }

    public void destroy()
    {
        stop();
    }

    protected void fail(int i, String s)
    {
        CallbackContext callbackcontext;
        for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); owner.fail(i, s, callbackcontext))
        {
            callbackcontext = (CallbackContext)iterator.next();
        }

        if (owner.isGlobalListener(this))
        {
            Log.d(TAG, "Stopping global listener");
            stop();
        }
        callbacks.clear();
        for (Iterator iterator1 = watches.values().iterator(); iterator1.hasNext(); owner.fail(i, s, (CallbackContext)iterator1.next())) { }
    }

    public void onLocationChanged(Location location)
    {
        Log.d(TAG, "The location has been updated!");
        win(location);
    }

    public void onProviderDisabled(String s)
    {
        Log.d(TAG, (new StringBuilder()).append("Location provider '").append(s).append("' disabled.").toString());
        fail(POSITION_UNAVAILABLE, "GPS provider disabled.");
    }

    public void onProviderEnabled(String s)
    {
        Log.d(TAG, (new StringBuilder()).append("Location provider ").append(s).append(" has been enabled").toString());
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        Log.d(TAG, (new StringBuilder()).append("The status of the provider ").append(s).append(" has changed").toString());
        if (i == 0)
        {
            Log.d(TAG, (new StringBuilder()).append(s).append(" is OUT OF SERVICE").toString());
            fail(POSITION_UNAVAILABLE, (new StringBuilder()).append("Provider ").append(s).append(" is out of service.").toString());
            return;
        }
        if (i == 1)
        {
            Log.d(TAG, (new StringBuilder()).append(s).append(" is TEMPORARILY_UNAVAILABLE").toString());
            return;
        } else
        {
            Log.d(TAG, (new StringBuilder()).append(s).append(" is AVAILABLE").toString());
            return;
        }
    }

    public int size()
    {
        return watches.size() + callbacks.size();
    }

    protected void start()
    {
label0:
        {
            if (!running)
            {
                if (locationManager.getProvider("network") == null)
                {
                    break label0;
                }
                running = true;
                locationManager.requestLocationUpdates("network", 60000L, 10F, this);
            }
            return;
        }
        fail(POSITION_UNAVAILABLE, "Network provider is not available.");
    }

}
