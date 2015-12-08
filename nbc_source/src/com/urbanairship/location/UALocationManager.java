// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.location.Criteria;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.util.ServiceNotBoundException;

// Referenced classes of package com.urbanairship.location:
//            LocationService, LocationPreferences, ILocationService

public class UALocationManager
{

    public static final String ACTION_SUFFIX_LOCATION_SERVICE_BOUND = ".urbanairship.location.LOCATION_SERVICE_BOUND";
    public static final String ACTION_SUFFIX_LOCATION_SERVICE_UNBOUND = ".urbanairship.location.LOCATION_SERVICE_UNBOUND";
    public static final String ACTION_SUFFIX_LOCATION_UPDATE = ".urbanairship.location.LOCATION_UPDATE";
    public static final String LOCATION_KEY = "com.urbanairship.location.LOCATION";
    private static boolean bound = false;
    private static Context context;
    private static final UALocationManager instance = new UALocationManager();
    private static ILocationService locationService;
    private BroadcastReceiver appStateChangeReceiver;
    private ServiceConnection locationConnection;
    private LocationPreferences preferences;

    private UALocationManager()
    {
    }

    public static void bindService()
    {
        if (!bound)
        {
            bound = true;
            Intent intent = new Intent(context, com/urbanairship/location/LocationService);
            context.bindService(intent, instance.locationConnection, 1);
        }
    }

    public static void disableBackgroundLocation()
    {
        Logger.info("Set background location preference to False.");
        instance.preferences.setBackgroundLocationEnabled(false);
        if (!UAirship.shared().getAnalytics().isAppInForeground() && instance.preferences.isLocationEnabled())
        {
            stopAndUnbindService();
            Logger.info("Disabling background location");
        }
    }

    public static void disableForegroundLocation()
    {
        Logger.info("Set foreground location preference to False.");
        instance.preferences.setForegroundLocationEnabled(false);
        if (!UAirship.shared().getAnalytics().isAppInForeground() && instance.preferences.isLocationEnabled() && !instance.preferences.isForegroundLocationEnabled())
        {
            Logger.info("Disabling foreground location");
            stopAndUnbindService();
        }
    }

    public static void disableLocation()
    {
        Logger.info("Set location preference to False.");
        instance.preferences.setLocationEnabled(false);
        Logger.info("Disable location.");
        stopAndUnbindService();
    }

    public static void enableBackgroundLocation()
    {
        Logger.info("Set background location preference to True.");
        instance.preferences.setBackgroundLocationEnabled(true);
        if (!UAirship.shared().getAnalytics().isAppInForeground() && instance.preferences.isLocationEnabled())
        {
            Logger.info("Enabling background location.");
            startAndBindService();
        }
    }

    public static void enableForegroundLocation()
    {
        Logger.info("Set foreground location preference to True.");
        instance.preferences.setForegroundLocationEnabled(true);
        if (UAirship.shared().getAnalytics().isAppInForeground() && instance.preferences.isLocationEnabled())
        {
            Logger.info("Enabling foreground location");
            startAndBindService();
        }
    }

    public static void enableLocation()
    {
        Logger.info("Set location preference to True.");
        instance.preferences.setLocationEnabled(true);
        if (instance.preferences.isBackgroundLocationEnabled() || UAirship.shared().getAnalytics().isAppInForeground())
        {
            Logger.info("Enable location.");
            startAndBindService();
        }
    }

    private void exceptIfNotBound()
    {
        if (!bound)
        {
            throw new ServiceNotBoundException("You must call bindService or enableLocation and wait for the LOCATION_SERVICE_BOUND broadcast before using this method.");
        } else
        {
            return;
        }
    }

    public static String getLocationIntentAction(String s)
    {
        return (new StringBuilder()).append(UAirship.getPackageName()).append(s).toString();
    }

    public static void init()
    {
        if (UAirship.shared().isFlying())
        {
            context = UAirship.shared().getApplicationContext();
            instance.preferences = new LocationPreferences();
            IntentFilter intentfilter;
            if (instance.preferences.isLocationEnabled() && instance.preferences.isBackgroundLocationEnabled())
            {
                startService();
            } else
            {
                Logger.debug("Location or background location are not enabled - deferring service start until foreground event.");
            }
            instance.appStateChangeReceiver = new BroadcastReceiver() {

                public void onReceive(Context context1, Intent intent)
                {
                    boolean flag = UALocationManager.instance.preferences.isLocationEnabled();
                    boolean flag1 = UALocationManager.instance.preferences.isBackgroundLocationEnabled();
                    boolean flag2 = UALocationManager.instance.preferences.isForegroundLocationEnabled();
                    if (flag && !flag1)
                    {
                        if (Analytics.ACTION_APP_BACKGROUND.equals(intent.getAction()))
                        {
                            UALocationManager.stopAndUnbindService();
                            return;
                        }
                        if (Analytics.ACTION_APP_FOREGROUND.equals(intent.getAction()) && flag2)
                        {
                            UALocationManager.startAndBindService();
                            return;
                        }
                    }
                }

            };
            instance.locationConnection = new ServiceConnection() {

                public void onServiceConnected(ComponentName componentname, IBinder ibinder)
                {
                    UALocationManager.locationService = ILocationService.Stub.asInterface(ibinder);
                    UALocationManager.bound = true;
                    UALocationManager.context.sendBroadcast(new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_SERVICE_BOUND")));
                }

                public void onServiceDisconnected(ComponentName componentname)
                {
                    UALocationManager.locationService = null;
                    UALocationManager.bound = false;
                    UALocationManager.context.sendBroadcast(new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_SERVICE_UNBOUND")));
                    Logger.info("LocationService unbound.");
                }

            };
            intentfilter = new IntentFilter();
            intentfilter.addAction(Analytics.ACTION_APP_BACKGROUND);
            intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
            intentfilter.addCategory(UAirship.getPackageName());
            UAirship.shared().getApplicationContext().registerReceiver(instance.appStateChangeReceiver, intentfilter);
            return;
        } else
        {
            throw new IllegalStateException("UAirship.takeOff must be called before UALocationManager.init!");
        }
    }

    public static boolean isServiceBound()
    {
        return bound;
    }

    public static UALocationManager shared()
    {
        return instance;
    }

    private static void startAndBindService()
    {
        startService();
        bindService();
    }

    private static void startService()
    {
        Logger.debug("UALocationManager startService");
        Intent intent = new Intent(context, com/urbanairship/location/LocationService);
        intent.setAction("com.urbanairship.location.START");
        context.startService(intent);
    }

    private static void stopAndUnbindService()
    {
        unbindService();
        stopService();
    }

    private static void stopService()
    {
        Logger.debug("UALocationManager stopService");
        Intent intent = new Intent(context, com/urbanairship/location/LocationService);
        intent.setAction("com.urbanairship.location.STOP");
        context.stopService(intent);
    }

    public static void unbindService()
    {
        if (bound)
        {
            context.unbindService(instance.locationConnection);
        }
        context.sendBroadcast(new Intent(getLocationIntentAction(".urbanairship.location.LOCATION_SERVICE_UNBOUND")));
        bound = false;
    }

    public String getBestProvider()
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        return locationService.getBestProvider();
    }

    public Criteria getCriteria()
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        return locationService.getCriteria();
    }

    public String getCurrentProvider()
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        return locationService.getCurrentProvider();
    }

    public Location getLocation()
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        return locationService.getLocation();
    }

    public LocationPreferences getPreferences()
    {
        return preferences;
    }

    public void recordCurrentLocation()
        throws RemoteException, ServiceNotBoundException
    {
        if (!bound)
        {
            Intent intent = new Intent(context, com/urbanairship/location/LocationService);
            intent.setAction("com.urbanairship.location.RECORD_CURRENT_LOCATION");
            context.startService(intent);
            return;
        } else
        {
            locationService.requestSingleLocationUpdate(null);
            return;
        }
    }

    public void recordCurrentLocation(Criteria criteria)
        throws RemoteException, ServiceNotBoundException
    {
        if (!bound)
        {
            Intent intent = new Intent(context, com/urbanairship/location/LocationService);
            intent.setAction("com.urbanairship.location.RECORD_CURRENT_LOCATION");
            intent.putExtra("com.urbanairship.location.REQUESTED_CRITERIA", criteria);
            context.startService(intent);
            return;
        } else
        {
            locationService.requestSingleLocationUpdate(criteria);
            return;
        }
    }

    public void recordLocation(Location location)
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        recordLocation(location, -1, -1);
    }

    public void recordLocation(Location location, int i, int j)
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        locationService.createLocationEvent(location, i, j);
    }

    public void resetProviders(Criteria criteria)
        throws RemoteException, ServiceNotBoundException
    {
        exceptIfNotBound();
        locationService.setCriteria(criteria);
        locationService.resetProviders();
    }







/*
    static ILocationService access$402(ILocationService ilocationservice)
    {
        locationService = ilocationservice;
        return ilocationservice;
    }

*/


/*
    static boolean access$502(boolean flag)
    {
        bound = flag;
        return flag;
    }

*/

}
