// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.worklight.common.Logger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLGeolocationPlugin

public abstract class WLLocationListener
    implements LocationListener
{

    public static int PERMISSION_DENIED = 1;
    public static int POSITION_UNAVAILABLE = 2;
    public static int TIMEOUT = 3;
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WLLocationListener.getName());
    private String TAG;
    protected HashMap callbacks;
    protected LocationManager locationManager;
    protected int maximumAge;
    protected int minChangeDistance;
    protected int minChangeTime;
    private WLGeolocationPlugin owner;
    protected String provider;
    protected boolean running;
    protected HashMap watches;

    public WLLocationListener(LocationManager locationmanager, WLGeolocationPlugin wlgeolocationplugin, String s)
    {
        running = false;
        watches = new HashMap();
        callbacks = new HashMap();
        TAG = "[MobileFirst Platform Location Listener]";
        maximumAge = 0;
        minChangeDistance = 10;
        minChangeTime = 60000;
        locationManager = locationmanager;
        owner = wlgeolocationplugin;
        TAG = (new StringBuilder()).append("[WL ").append(s).append(" Listener]").toString();
        provider = s;
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
        long l = System.currentTimeMillis() - location.getTime();
        if (l > (long)maximumAge)
        {
            logger.debug((new StringBuilder()).append("Acquired location age: ").append(l).append(" milliseconds. More than maximumAge of ").append(maximumAge).append(" milliseconds. Ignoring.").toString());
        } else
        {
            for (Iterator iterator = callbacks.values().iterator(); iterator.hasNext(); owner.win(location, (CallbackContext)iterator.next(), false)) { }
            if (owner.isGlobalListener(this) && watches.size() == 0)
            {
                logger.debug("Stopping global listener");
                stop();
            }
            callbacks.clear();
            for (Iterator iterator1 = watches.values().iterator(); iterator1.hasNext(); owner.win(location, (CallbackContext)iterator1.next(), true)) { }
            if (watches.isEmpty())
            {
                stop();
                return;
            }
        }
    }

    public void addCallback(String s, CallbackContext callbackcontext, int i)
    {
        maximumAge = i;
        callbacks.put(s, callbackcontext);
        if (size() == 1)
        {
            start();
        }
    }

    public void addWatch(String s, CallbackContext callbackcontext, int i, int j)
    {
        minChangeDistance = i;
        minChangeTime = j;
        watches.put(s, callbackcontext);
        stop();
        start();
    }

    public void clearWatch(String s)
    {
        watches.remove(s);
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
        for (Iterator iterator = callbacks.values().iterator(); iterator.hasNext(); owner.fail(i, s, (CallbackContext)iterator.next(), false)) { }
        if (owner.isGlobalListener(this) && watches.size() == 0)
        {
            logger.debug("Stopping global listener");
            stop();
        }
        callbacks.clear();
        for (Iterator iterator1 = watches.values().iterator(); iterator1.hasNext(); owner.fail(i, s, (CallbackContext)iterator1.next(), true)) { }
    }

    public Location getLastKnownLocation()
    {
        Location location;
        try
        {
            location = locationManager.getLastKnownLocation(provider);
        }
        catch (SecurityException securityexception)
        {
            return null;
        }
        return location;
    }

    public void onLocationChanged(Location location)
    {
        logger.debug("The location has been updated!");
        win(location);
    }

    public void onProviderDisabled(String s)
    {
        logger.debug((new StringBuilder()).append("Location provider '").append(s).append("' disabled.").toString());
        fail(POSITION_UNAVAILABLE, (new StringBuilder()).append(s).append(" provider disabled.").toString());
    }

    public void onProviderEnabled(String s)
    {
        logger.debug((new StringBuilder()).append("Location provider ").append(s).append(" has been enabled").toString());
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        logger.debug((new StringBuilder()).append("The status of the provider ").append(s).append(" has changed").toString());
        if (i == 0)
        {
            logger.debug((new StringBuilder()).append(s).append(" is OUT OF SERVICE").toString());
            fail(POSITION_UNAVAILABLE, (new StringBuilder()).append("Provider ").append(s).append(" is out of service.").toString());
            return;
        }
        if (i == 1)
        {
            logger.debug((new StringBuilder()).append(s).append(" is TEMPORARILY_UNAVAILABLE").toString());
            return;
        } else
        {
            logger.debug((new StringBuilder()).append(s).append(" is AVAILABLE").toString());
            return;
        }
    }

    public void removeCallback(String s)
    {
        callbacks.remove(s);
        if (size() == 0)
        {
            stop();
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
                locationManager.requestLocationUpdates("network", minChangeTime, minChangeDistance, this);
            }
            return;
        }
        fail(POSITION_UNAVAILABLE, "Network provider is not available.");
    }

}
