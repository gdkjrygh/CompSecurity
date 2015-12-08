// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.LocationOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.LocationEvent;
import com.urbanairship.util.UAStringUtil;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager, LastLocationFinder, LocationPreferences

public class LocationService extends Service
{
    private class ProviderListener
        implements LocationListener
    {

        final LocationService this$0;

        public void onLocationChanged(Location location1)
        {
        }

        public void onProviderDisabled(String s)
        {
            Logger.info((new StringBuilder()).append("Location provider disabled: ").append(s).toString());
            if (s.equals(currentProvider))
            {
                Logger.info((new StringBuilder()).append("Current provider (").append(s).append(") disabled, resetting providers.").toString());
                setProviders();
                initializeLocationUpdates();
            }
        }

        public void onProviderEnabled(String s)
        {
            Logger.info((new StringBuilder()).append("Location provider enabled: ").append(s).toString());
            if (!s.equals(currentProvider) && s.equals(bestProvider) || UAStringUtil.isEmpty(currentProvider))
            {
                Logger.info((new StringBuilder()).append("Best provider (").append(s).append(") now available; resetting providers.").toString());
                currentProvider = s;
                initializeLocationUpdates();
            }
        }

        public void onStatusChanged(String s, int i, Bundle bundle)
        {
        }

        private ProviderListener()
        {
            this$0 = LocationService.this;
            super();
        }

    }


    public static final String ACTION_RECORD_CURRENT_LOCATION = "com.urbanairship.location.RECORD_CURRENT_LOCATION";
    public static final String ACTION_START = "com.urbanairship.location.START";
    public static final String ACTION_STOP = "com.urbanairship.location.STOP";
    public static final String ACTION_SUFFIX_LOCATION_CHANGED = ".urbanairship.location.LOCATION_CHANGED";
    public static final String ACTION_SUFFIX_SINGLE_LOCATION_CHANGED = ".urbanairship.location.SINGLE_LOCATION_CHANGED";
    private static final String NETWORK_PROVIDER;
    public static final String REQUESTED_ACCURACY_KEY = "com.urbanairship.location.REQUESTED_ACCURACY";
    public static final String REQUESTED_CRITERIA = "com.urbanairship.location.REQUESTED_CRITERIA";
    private static boolean bound = false;
    private static boolean started = false;
    private String bestProvider;
    private Context context;
    Criteria criteria;
    private String currentProvider;
    private ProviderListener gpsListener;
    private LastLocationFinder lastLocationFinder;
    private Location location;
    private final ILocationService.Stub locationBinder = new ILocationService.Stub() {

        final LocationService this$0;

        public void createLocationEvent(Location location1, int i, int j)
        {
            location = location1;
            UAirship.shared().getAnalytics().addEvent(new LocationEvent(location, com.urbanairship.analytics.LocationEvent.UpdateType.SINGLE, i, j));
        }

        public String getBestProvider()
        {
            return bestProvider;
        }

        public Criteria getCriteria()
        {
            return criteria;
        }

        public String getCurrentProvider()
        {
            return currentProvider;
        }

        public Location getLocation()
        {
            return location;
        }

        public void requestSingleLocationUpdate(Criteria criteria1)
        {
            Logger.info("Requesting a single update.");
            if (criteria1 == null && UAStringUtil.isEmpty(currentProvider))
            {
                initializeCriteria();
                setProviders();
            }
            int i;
            if (criteria1 == null)
            {
                i = criteria.getAccuracy();
            } else
            {
                i = criteria1.getAccuracy();
            }
            if (criteria1 == null)
            {
                criteria1 = currentProvider;
            } else
            {
                criteria1 = locationManager.getBestProvider(criteria1, true);
            }
            if (!UAStringUtil.isEmpty(criteria1))
            {
                createSingleLocationChangedPendingIntent(i);
                locationManager.requestLocationUpdates(criteria1, 0L, 0.0F, singleLocationChangedPendingIntent);
                return;
            } else
            {
                Logger.debug("There are no available location providers. Retrieving last known location.");
                invokeLastLocationFinder();
                return;
            }
        }

        public void resetProviders()
        {
            setProviders();
            if (LocationService.started)
            {
                initializeLocationUpdates();
            }
        }

        public void setCriteria(Criteria criteria1)
        {
            criteria = criteria1;
            createLocationChangedPendingIntent();
        }

            
            {
                this$0 = LocationService.this;
                super();
            }
    };
    private PendingIntent locationChangedPendingIntent;
    private final BroadcastReceiver locationChangedReceiver = new BroadcastReceiver() {

        final LocationService this$0;

        public void onReceive(Context context1, Intent intent)
        {
            Location location1;
label0:
            {
                if (UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_CHANGED").equals(intent.getAction()) || UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED").equals(intent.getAction()))
                {
                    location1 = (Location)intent.getExtras().get("location");
                    if (location1 != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            Logger.info("Received a location update.");
            Logger.verbose((new StringBuilder()).append("Location: ").append(location1.toString()).toString());
            Object obj = com.urbanairship.analytics.LocationEvent.UpdateType.CONTINUOUS;
            int i;
            if (UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED").equals(intent.getAction()))
            {
                Logger.info("Received a single-shot location update.");
                locationManager.removeUpdates(singleLocationChangedPendingIntent);
                com.urbanairship.analytics.LocationEvent.UpdateType updatetype = com.urbanairship.analytics.LocationEvent.UpdateType.SINGLE;
                boolean flag = false;
                i = ((flag) ? 1 : 0);
                obj = updatetype;
                if (!UALocationManager.shared().getPreferences().isForegroundLocationEnabled())
                {
                    UALocationManager.unbindService();
                    obj = new Intent(context1, com/urbanairship/location/LocationService);
                    ((Intent) (obj)).setAction("com.urbanairship.location.STOP");
                    Logger.debug("LocationService stopService");
                    context1.stopService(((Intent) (obj)));
                    obj = updatetype;
                    i = ((flag) ? 1 : 0);
                }
            } else
            {
                i = UAirship.shared().getAirshipConfigOptions().locationOptions.updateIntervalMeters;
            }
            location = location1;
            UAirship.shared().getAnalytics().addEvent(new LocationEvent(location1, ((com.urbanairship.analytics.LocationEvent.UpdateType) (obj)), intent.getIntExtra("com.urbanairship.location.REQUESTED_ACCURACY", -1), i));
            intent = new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_UPDATE"));
            intent.putExtra("com.urbanairship.location.LOCATION", location);
            context1.sendBroadcast(intent);
        }

            
            {
                this$0 = LocationService.this;
                super();
            }
    };
    private LocationManager locationManager;
    private ProviderListener networkListener;
    private PendingIntent singleLocationChangedPendingIntent;

    public LocationService()
    {
    }

    private void createLocationChangedPendingIntent()
    {
        Intent intent = new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_CHANGED"));
        intent.putExtra("com.urbanairship.location.REQUESTED_ACCURACY", criteria.getAccuracy());
        locationChangedPendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
    }

    private void createService()
    {
        this;
        JVM INSTR monitorenter ;
        bound = true;
        context = UAirship.shared().getApplicationContext();
        locationManager = (LocationManager)context.getSystemService("location");
        registerReceivers();
        initializeCriteria();
        createSingleLocationChangedPendingIntent(criteria.getAccuracy());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void createSingleLocationChangedPendingIntent(int i)
    {
        Intent intent = new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED"));
        intent.putExtra("com.urbanairship.location.REQUESTED_ACCURACY", i);
        singleLocationChangedPendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
    }

    private void initializeCriteria()
    {
        LocationOptions locationoptions = UAirship.shared().getAirshipConfigOptions().locationOptions;
        locationoptions.isValid();
        criteria = new Criteria();
        if (locationoptions.horizontalAccuracy == 0)
        {
            criteria.setAccuracy(locationoptions.accuracy);
        } else
        {
            criteria.setAccuracy(locationoptions.horizontalAccuracy);
        }
        criteria.setPowerRequirement(locationoptions.powerRequirement);
        criteria.setCostAllowed(locationoptions.costAllowed);
        criteria.setAltitudeRequired(locationoptions.altitudeRequired);
        criteria.setSpeedRequired(locationoptions.speedRequired);
        criteria.setBearingRequired(locationoptions.bearingRequired);
    }

    private void initializeLocationUpdates()
    {
        Logger.info("Removing location update requests with the old provider");
        locationManager.removeUpdates(locationChangedPendingIntent);
        if (isProviderEnabled(currentProvider))
        {
            LocationOptions locationoptions = UAirship.shared().getAirshipConfigOptions().locationOptions;
            Logger.info((new StringBuilder()).append("Requesting location updates with the new provider: ").append(currentProvider).toString());
            requestLocationUpdates(currentProvider, locationoptions, locationChangedPendingIntent);
            return;
        } else
        {
            Logger.info("There are no available providers, waiting to request updates.");
            return;
        }
    }

    private void initializeProviderListeners()
    {
        LocationOptions locationoptions = UAirship.shared().getAirshipConfigOptions().locationOptions;
        if (locationoptions.allowGPSForLocationTracking && isProviderAvailable(bestProvider))
        {
            gpsListener = new ProviderListener();
            requestLocationUpdates(bestProvider, locationoptions, gpsListener);
        }
        if (isProviderAvailable(NETWORK_PROVIDER))
        {
            networkListener = new ProviderListener();
            requestLocationUpdates(NETWORK_PROVIDER, locationoptions, networkListener);
        }
    }

    private void invokeLastLocationFinder()
    {
        Logger.debug("Invoking last location finder.");
        lastLocationFinder = new LastLocationFinder(context);
        AsyncTask asynctask = new AsyncTask() {

            final LocationService this$0;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                avoid = UAirship.shared().getAirshipConfigOptions().locationOptions;
                avoid = lastLocationFinder.getLastBestLocation(((LocationOptions) (avoid)).updateIntervalSeconds * 1000L, criteria);
                if (avoid != null)
                {
                    Logger.info(String.format(Locale.US, "Last best location found at lat: %f, long: %f with provider: %s", new Object[] {
                        Double.valueOf(avoid.getLatitude()), Double.valueOf(avoid.getLongitude()), avoid.getProvider()
                    }));
                    Intent intent = new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_CHANGED"));
                    intent.putExtra("location", avoid);
                    context.sendBroadcast(intent);
                } else
                {
                    Logger.info("No last best location found.");
                }
                return null;
            }

            
            {
                this$0 = LocationService.this;
                super();
            }
        };
        try
        {
            asynctask.execute(new Void[0]);
            return;
        }
        catch (Exception exception)
        {
            Logger.error("Unable to execute findLastLocationTask.", exception);
        }
    }

    private boolean isProviderAvailable(String s)
    {
        List list;
        if (s != null && s.length() != 0)
        {
            if ((list = locationManager.getProviders(false)) != null && list.contains(s))
            {
                return true;
            }
        }
        return false;
    }

    private boolean isProviderEnabled(String s)
    {
        return isProviderAvailable(s) && locationManager.isProviderEnabled(s);
    }

    private void registerReceivers()
    {
        Logger.debug("Registering location change receivers.");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_CHANGED"));
        intentfilter.addAction(UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED"));
        context.registerReceiver(locationChangedReceiver, intentfilter);
    }

    private void requestLocationUpdates(String s, LocationOptions locationoptions, PendingIntent pendingintent)
    {
        try
        {
            locationManager.requestLocationUpdates(s, locationoptions.updateIntervalSeconds * 1000L, locationoptions.updateIntervalMeters, pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationOptions locationoptions)
        {
            Logger.error((new StringBuilder()).append("Unable to request location updates for provider ").append(s).toString());
        }
    }

    private void requestLocationUpdates(String s, LocationOptions locationoptions, ProviderListener providerlistener)
    {
        try
        {
            locationManager.requestLocationUpdates(s, locationoptions.updateIntervalSeconds * 1000L, locationoptions.updateIntervalMeters, providerlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationOptions locationoptions)
        {
            Logger.error((new StringBuilder()).append("Unable to request location updates for provider ").append(s).toString());
        }
    }

    private void setProviders()
    {
        if (UAirship.shared().getAirshipConfigOptions().locationOptions.allowGPSForLocationTracking)
        {
            bestProvider = locationManager.getBestProvider(criteria, false);
            String s;
            if (isProviderEnabled(bestProvider))
            {
                s = bestProvider;
            } else
            {
                s = locationManager.getBestProvider(criteria, true);
            }
            currentProvider = s;
        } else
        {
            bestProvider = NETWORK_PROVIDER;
            String s1;
            if (isProviderEnabled(bestProvider))
            {
                s1 = bestProvider;
            } else
            {
                s1 = null;
            }
            currentProvider = s1;
        }
        Logger.info(String.format("Current location provider: %s, best location provider: %s", new Object[] {
            currentProvider, bestProvider
        }));
    }

    private void setupService()
    {
        this;
        JVM INSTR monitorenter ;
        if (!started) goto _L2; else goto _L1
_L1:
        Logger.debug("Location service already started.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        started = true;
        setProviders();
        invokeLastLocationFinder();
        createLocationChangedPendingIntent();
        initializeProviderListeners();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void teardownService()
    {
        this;
        JVM INSTR monitorenter ;
        if (networkListener != null)
        {
            locationManager.removeUpdates(networkListener);
        }
        if (gpsListener != null)
        {
            locationManager.removeUpdates(gpsListener);
        }
        context.unregisterReceiver(locationChangedReceiver);
        if (started)
        {
            locationManager.removeUpdates(locationChangedPendingIntent);
        }
        started = false;
        bound = false;
        stopSelf();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public IBinder onBind(Intent intent)
    {
        return locationBinder;
    }

    public void onCreate()
    {
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        if (!UAirship.shared().isFlying())
        {
            Logger.error("LocationService started prior to a UAirship.takeOff() call.");
            throw new IllegalStateException("UAirship.takeOff() must be called every time Application.onCreate() is invoked.");
        }
        super.onCreate();
        if (!bound)
        {
            createService();
        }
    }

    public void onDestroy()
    {
        Logger.info("Location service destroyed");
        teardownService();
    }

    public void onStart(Intent intent, int i)
    {
        Logger.debug((new StringBuilder()).append("Location Service started with intent=").append(intent).toString());
        super.onStart(intent, i);
        if (intent != null && !UAStringUtil.isEmpty(intent.getAction())) goto _L2; else goto _L1
_L1:
        Logger.warn("Attempted to start service with null intent or action.");
_L4:
        return;
_L2:
        String s;
        s = intent.getAction();
        if (!s.equals("com.urbanairship.location.STOP"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (started)
        {
            teardownService();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s.equals("com.urbanairship.location.START"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!started)
        {
            setupService();
        }
        if (UALocationManager.shared().getPreferences().isForegroundLocationEnabled())
        {
            initializeLocationUpdates();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!s.equals("com.urbanairship.location.RECORD_CURRENT_LOCATION"))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (!started)
        {
            setupService();
        }
        try
        {
            if (intent.getParcelableExtra("com.urbanairship.location.REQUESTED_CRITERIA") != null)
            {
                intent = (Criteria)intent.getParcelableExtra("com.urbanairship.location.REQUESTED_CRITERIA");
                locationBinder.requestSingleLocationUpdate(intent);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Logger.error(intent.getMessage());
            return;
        }
        locationBinder.requestSingleLocationUpdate(null);
        return;
        Logger.warn((new StringBuilder()).append("Unknown action: ").append(intent.getAction()).toString());
        return;
    }

    static 
    {
        NETWORK_PROVIDER = com.urbanairship.analytics.LocationEvent.AllowableProvider.NETWORK.toString().toLowerCase(Locale.US);
    }










/*
    static String access$302(LocationService locationservice, String s)
    {
        locationservice.currentProvider = s;
        return s;
    }

*/






/*
    static Location access$702(LocationService locationservice, Location location1)
    {
        locationservice.location = location1;
        return location1;
    }

*/


}
