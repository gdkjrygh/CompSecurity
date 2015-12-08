// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.base.service.WalletContextParameter;
import com.google.android.apps.wallet.base.service.WalletIntentService;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandlerManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.location.GeofencingEventFactory;
import com.google.android.apps.wallet.util.location.LocationClientException;
import com.google.android.apps.wallet.util.location.SynchronizedLocationClient;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationRequest;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.geofencing.service:
//            GeofencingServiceDebugMonitor, GeofencingReceiver, GeofencingInMemoryState, GeofencingServiceErrorProcessor, 
//            GeofencingNotificationClient

public class GeofencingService extends WalletIntentService
{

    private static final long MAX_LOCATION_AGE_MILLIS;
    private static final long MAX_LOCATION_RESOLUTION_TIME_MILLIS;
    public static final String SERVICE_NAME = com/google/android/apps/wallet/geofencing/service/GeofencingService.getSimpleName();
    GeofencingServiceErrorProcessor errorProcessor;
    GeofencingEventFactory geofencingEventFactory;
    GeofencingInMemoryState geofencingInMemoryState;
    GeofencingNotificationClient geofencingNotificationClient;
    GeofencingNotificationHandlerManager geofencingNotificationHandlerManager;
    NetworkInformationProvider networkInformationProvider;
    GeofencingServiceDebugMonitor serviceMonitor;
    SharedPreferences sharedPrefs;
    SynchronizedLocationClient synchronizedLocationClient;
    System system;

    public GeofencingService()
    {
        super(SERVICE_NAME, EnumSet.of(WalletContextParameter.RESTRICTIONS_SATISFIED, WalletContextParameter.SETUP_COMPLETE));
    }

    private static Geofence buildCachedAreaGeofence(com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
    {
        return (new com.google.android.gms.location.Geofence.Builder()).setRequestId("cached_area").setCircularRegion(zone.center.latitude.doubleValue(), zone.center.longitude.doubleValue(), Protos.valueWithDefault(zone.radiusInMeters, 150F)).setTransitionTypes(2).setExpirationDuration(-1L).build();
    }

    private static Geofence buildGeofence(String s, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.ExitZone exitzone)
    {
        return (new com.google.android.gms.location.Geofence.Builder()).setRequestId(s).setCircularRegion(exitzone.center.latitude.doubleValue(), exitzone.center.longitude.doubleValue(), Protos.valueWithDefault(exitzone.radiusInMeters, 150F)).setTransitionTypes(2).setExpirationDuration(-1L).build();
    }

    private static Geofence buildGeofence(String s, com.google.wallet.proto.api.NanoWalletLocation.Zone zone)
    {
        int i = Protos.valueWithDefault(zone.dwellingDurationInMs, 0);
        byte byte0;
        if (i > 0)
        {
            byte0 = 6;
        } else
        {
            byte0 = 3;
        }
        return (new com.google.android.gms.location.Geofence.Builder()).setRequestId(s).setCircularRegion(zone.center.latitude.doubleValue(), zone.center.longitude.doubleValue(), Protos.valueWithDefault(zone.radiusInMeters, 150F)).setTransitionTypes(byte0).setLoiteringDelay(i).setExpirationDuration(-1L).build();
    }

    private boolean checkAndLogError(Intent intent)
    {
        GeofencingEventFactory geofencingeventfactory = geofencingEventFactory;
        intent = GeofencingEventFactory.fromIntent(intent);
        if (intent.hasError())
        {
            int i = intent.getErrorCode();
            switch (i)
            {
            default:
                WLog.efmt(SERVICE_NAME, "Error: %d", new Object[] {
                    Integer.valueOf(i)
                });
                return true;

            case 1000: 
                WLog.e(SERVICE_NAME, "Error: GEOFENCE_NOT_AVAILABLE");
                return true;

            case 1: // '\001'
                WLog.e(SERVICE_NAME, "Error: ERROR");
                return true;
            }
        } else
        {
            return false;
        }
    }

    private static com.google.wallet.proto.NanoWalletEntities.PhysicalLocation convertLocation(Location location)
    {
        com.google.wallet.proto.NanoWalletEntities.PhysicalLocation physicallocation = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
        physicallocation.latitude = Double.valueOf(location.getLatitude());
        physicallocation.longitude = Double.valueOf(location.getLongitude());
        physicallocation.accuracy = Float.valueOf(location.getAccuracy());
        return physicallocation;
    }

    private void disableGeofencing()
        throws InterruptedException, LocationClientException
    {
        serviceMonitor.onStop();
        removeGeofences();
    }

    private void enableGeofencing()
        throws InterruptedException, LocationClientException
    {
        serviceMonitor.onStart();
        requestLocationUpdate();
    }

    private Location getCurrentLocation()
        throws InterruptedException, LocationClientException
    {
        synchronizedLocationClient.connect(this);
        Location location = synchronizedLocationClient.getLastLocation();
        if (location == null)
        {
            synchronizedLocationClient.disconnect();
            return null;
        }
        System system1 = system;
        long l = System.currentTimeMillis() - location.getTime();
        if (l <= MAX_LOCATION_AGE_MILLIS)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        WLog.wfmt(SERVICE_NAME, "Last location too old: %d ms", new Object[] {
            Long.valueOf(l)
        });
        synchronizedLocationClient.disconnect();
        return null;
        synchronizedLocationClient.disconnect();
        return location;
        Exception exception;
        exception;
        synchronizedLocationClient.disconnect();
        throw exception;
    }

    private PendingIntent getGeofenceTransitionPendingIntent()
    {
        return PendingIntent.getBroadcast(this, 0, InternalIntents.forAction(this, "com.google.android.apps.wallet.services.geofencing.CROSS_BOUNDARY_BROADCAST"), 0);
    }

    private PendingIntent getLeaveExitZonePendingIntent()
    {
        return PendingIntent.getBroadcast(this, 0, InternalIntents.forAction(this, "com.google.android.apps.wallet.services.geofencing.LEAVE_EXIT_ZONE_BROADCAST"), 0);
    }

    private PendingIntent getLocationUpdatePendingIntent()
    {
        return PendingIntent.getBroadcast(this, 0, GeofencingReceiver.createLocationReadyPendingIntent(getApplicationContext()), 0);
    }

    private void handleCrossBoundaryIntent(Intent intent)
        throws InterruptedException, LocationClientException, RpcException
    {
        if (checkAndLogError(intent))
        {
            return;
        }
        Location location = getCurrentLocation();
        Object obj = geofencingEventFactory;
        intent = GeofencingEventFactory.fromIntent(intent);
        obj = intent.getTriggeringGeofences();
        int i = intent.getGeofenceTransition();
        if (location == null)
        {
            WLog.w(SERVICE_NAME, "Unexpected null value for LocationClient.getLastLocation()");
            return;
        }
        if (obj == null)
        {
            WLog.w(SERVICE_NAME, "Unexpected null value for LocationClient.getTriggeringGeofences()");
            return;
        }
        serviceMonitor.onCrossBoundary(location, i, ((List) (obj)));
        for (intent = ((List) (obj)).iterator(); intent.hasNext();)
        {
            if (((Geofence)intent.next()).getRequestId().equals("cached_area"))
            {
                if (i != 2)
                {
                    WLog.wfmt(SERVICE_NAME, "Unexpected geofence transition: %d for cached zone", new Object[] {
                        Integer.valueOf(i)
                    });
                }
                updateGeofencesAtLocation(location);
                return;
            }
        }

        switch (i)
        {
        case 3: // '\003'
        default:
            WLog.wfmt(SERVICE_NAME, "Unknown geofence transition: %d", new Object[] {
                Integer.valueOf(i)
            });
            return;

        case 1: // '\001'
        case 4: // '\004'
            updateGeofencingNotifications(location, false);
            return;

        case 2: // '\002'
            WLog.d(SERVICE_NAME, "Geofence exit transition (no-op)");
            break;
        }
    }

    private void handleLeaveExitZoneIntent(Intent intent)
        throws InterruptedException, LocationClientException, RpcException
    {
        if (checkAndLogError(intent))
        {
            return;
        }
        Location location = getCurrentLocation();
        if (location == null)
        {
            WLog.w(SERVICE_NAME, "Unexpected null value for LocationClient.getLastLocation()");
            return;
        }
        GeofencingEventFactory geofencingeventfactory = geofencingEventFactory;
        intent = GeofencingEventFactory.fromIntent(intent).getTriggeringGeofences();
        if (intent == null)
        {
            WLog.w(SERVICE_NAME, "Unexpected null value for LocationClient.getTriggeringGeofences()");
            return;
        } else
        {
            serviceMonitor.onLeaveExitZone(location, intent);
            updateGeofencingNotifications(location, true);
            return;
        }
    }

    private void handleLocationReadyIntent(Intent intent)
        throws InterruptedException, LocationClientException, RpcException
    {
        synchronizedLocationClient.connect(this);
        synchronizedLocationClient.removeLocationUpdates(getLocationUpdatePendingIntent());
        synchronizedLocationClient.disconnect();
        if (!geofencingInMemoryState.canHandleLocationUpdate())
        {
            return;
        } else
        {
            geofencingInMemoryState.disableHandlingOfLocationUpdates();
            intent = (Location)intent.getExtras().get("com.google.android.location.LOCATION");
            serviceMonitor.onLocationReady(intent);
            updateGeofencesAtLocation(intent);
            return;
        }
        intent;
        synchronizedLocationClient.disconnect();
        throw intent;
    }

    private void handleRequestLocationIntent()
        throws InterruptedException, LocationClientException
    {
        requestLocationUpdate();
    }

    private void handleZoneDataChangedIntent()
        throws InterruptedException, LocationClientException
    {
        requestLocationUpdate();
    }

    private void removeGeofences()
        throws InterruptedException, LocationClientException
    {
        synchronizedLocationClient.connect(this);
        PendingIntent pendingintent = getGeofenceTransitionPendingIntent();
        synchronizedLocationClient.removeGeofences(pendingintent);
        synchronizedLocationClient.disconnect();
        return;
        Exception exception;
        exception;
        synchronizedLocationClient.disconnect();
        throw exception;
    }

    private void requestLocationUpdate()
        throws InterruptedException, LocationClientException
    {
        LocationRequest locationrequest;
        geofencingInMemoryState.enableHandlingOfLocationUpdates();
        serviceMonitor.onRequestLocation();
        locationrequest = LocationRequest.create().setNumUpdates(1).setInterval(0L).setPriority(102).setExpirationDuration(MAX_LOCATION_RESOLUTION_TIME_MILLIS);
        synchronizedLocationClient.connect(this);
        synchronizedLocationClient.requestLocationUpdates(locationrequest, getLocationUpdatePendingIntent());
        synchronizedLocationClient.disconnect();
        return;
        Exception exception;
        exception;
        synchronizedLocationClient.disconnect();
        throw exception;
    }

    private void setUpGeofencesForExitZones(Location location, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse geofencedmessageresponse)
        throws InterruptedException, LocationClientException
    {
        java.util.ArrayList arraylist;
        java.util.ArrayList arraylist1 = Lists.newArrayList();
        arraylist = Lists.newArrayList();
        boolean flag = ((Boolean)SharedPreference.ALLOW_REMOVING_GEOFENCING_NOTIFICATION.get(sharedPrefs)).booleanValue();
        if (flag)
        {
            for (int i = 0; i < geofencedmessageresponse.message.length; i++)
            {
                com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage = geofencedmessageresponse.message[i];
                String s = (new StringBuilder(31)).append("geofence_exit_zone_").append(i).append("_").toString();
                for (int j = 0; j < geofencedmessage.exitZone.length; j++)
                {
                    arraylist1.add(geofencedmessage.exitZone[j]);
                    arraylist.add(buildGeofence((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(j).toString(), geofencedmessage.exitZone[j]));
                }

            }

        }
        serviceMonitor.onUpdateExitZoneGeofences(location, flag, arraylist1, arraylist);
        synchronizedLocationClient.connect(this);
        location = getLeaveExitZonePendingIntent();
        synchronizedLocationClient.removeGeofences(location);
        if (!arraylist.isEmpty())
        {
            synchronizedLocationClient.addGeofences(arraylist, location);
        }
        synchronizedLocationClient.disconnect();
        return;
        location;
        synchronizedLocationClient.disconnect();
        throw location;
    }

    private void updateGeofencesAtLocation(Location location)
        throws InterruptedException, LocationClientException, RpcException
    {
        Object obj1;
        if (!networkInformationProvider.hasNetworkAccess())
        {
            WLog.e(SERVICE_NAME, "No network access when fetching interested zones");
            serviceMonitor.noNetworkAccess("No network access when fetching interested zones");
            errorProcessor.noNetworkAccess();
            return;
        }
        Object obj = convertLocation(location);
        obj1 = new com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesRequest();
        obj1.dwellingSupported = Boolean.valueOf(true);
        obj1.currentPosition = ((com.google.wallet.proto.NanoWalletEntities.PhysicalLocation) (obj));
        obj1.maxNumResultsRequested = Integer.valueOf(50);
        obj1.exitZonesSupported = Boolean.valueOf(true);
        obj1 = geofencingNotificationClient.geofencedZones(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesRequest) (obj1)));
        obj = ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesResponse) (obj1)).refreshZone;
        List list = Arrays.asList(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedZonesResponse) (obj1)).zone);
        Geofence geofence = buildCachedAreaGeofence(((com.google.wallet.proto.api.NanoWalletLocation.Zone) (obj)));
        obj1 = Lists.newArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            ((List) (obj1)).add(buildGeofence((new StringBuilder(20)).append("geofence_").append(i).toString(), (com.google.wallet.proto.api.NanoWalletLocation.Zone)list.get(i)));
        }

        serviceMonitor.onUpdateGeofences(location, list, ((List) (obj1)), ((com.google.wallet.proto.api.NanoWalletLocation.Zone) (obj)));
        ((List) (obj1)).add(geofence);
        synchronizedLocationClient.connect(this);
        location = getGeofenceTransitionPendingIntent();
        synchronizedLocationClient.removeGeofences(location);
        synchronizedLocationClient.addGeofences(((List) (obj1)), location);
        synchronizedLocationClient.disconnect();
        return;
        location;
        synchronizedLocationClient.disconnect();
        throw location;
    }

    private void updateGeofencingNotifications(Location location, boolean flag)
        throws RpcException, InterruptedException, LocationClientException
    {
        boolean flag1 = true;
        if (!networkInformationProvider.hasNetworkAccess())
        {
            WLog.e(SERVICE_NAME, "No network access when fetching notifications.");
            serviceMonitor.noNetworkAccess("No network access when fetching notifications.");
            errorProcessor.noNetworkAccess();
            return;
        }
        Object obj = new com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageRequest();
        obj.currentPosition = convertLocation(location);
        obj.dwellingSupported = Boolean.valueOf(true);
        obj.exitZonesSupported = Boolean.valueOf(true);
        obj.exitZoneTripped = Boolean.valueOf(flag);
        GeofencingServiceDebugMonitor geofencingservicedebugmonitor;
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        obj.richNotificationsSupported = Boolean.valueOf(flag);
        if (location.hasSpeed())
        {
            obj.speedMetersPerSecond = Double.valueOf(location.getSpeed());
        }
        serviceMonitor.log("Call geofencedMessage");
        obj = geofencingNotificationClient.geofencedMessage(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageRequest) (obj)));
        geofencingservicedebugmonitor = serviceMonitor;
        i = ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse) (obj)).message.length;
        geofencingservicedebugmonitor.log((new StringBuilder(40)).append("Number of geofenced messages=").append(i).toString());
        geofencingNotificationHandlerManager.process(Arrays.asList(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse) (obj)).message));
        setUpGeofencesForExitZones(location, ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessageResponse) (obj)));
    }

    protected final void doOnHandleIntent(Intent intent)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        obj = intent.getAction();
        WLog.dfmt(SERVICE_NAME, "Process intent action: %s", new Object[] {
            obj
        });
        flag3 = true;
        flag2 = true;
        flag = flag2;
        flag1 = flag3;
        if ("com.google.android.apps.wallet.services.geofencing.STOP_GEOFENCING_NOTIFICATION".equals(obj))
        {
            flag1 = false;
            flag = false;
            try
            {
                disableGeofencing();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Thread.currentThread().interrupt();
                throw Throwables.propagate(intent);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                WLog.w(SERVICE_NAME, "Caught exception", ((Throwable) (obj)));
                intent = serviceMonitor;
                obj = String.valueOf(obj);
                intent.log((new StringBuilder(String.valueOf(obj).length() + 18)).append("Caught exception: ").append(((String) (obj))).toString());
                if (flag)
                {
                    errorProcessor.scheduleDelayedServiceStart();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                WLog.w(SERVICE_NAME, "Caught exception", ((Throwable) (obj)));
                intent = serviceMonitor;
                obj = String.valueOf(obj);
                intent.log((new StringBuilder(String.valueOf(obj).length() + 18)).append("Caught exception: ").append(((String) (obj))).toString());
                if (flag1)
                {
                    errorProcessor.scheduleDelayedServiceStart();
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_549;
        }
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_NOTIFICATION_SETTINGS_CHANGED".equals(obj))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        flag = flag2;
        flag1 = flag3;
        if (!geofencingNotificationHandlerManager.isEnabled())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = flag2;
        flag1 = flag3;
        enableGeofencing();
        return;
        flag1 = false;
        flag = false;
        disableGeofencing();
        return;
        flag = flag2;
        flag1 = flag3;
        if (geofencingNotificationHandlerManager.isEnabled())
        {
            break MISSING_BLOCK_LABEL_303;
        }
        flag = flag2;
        flag1 = flag3;
        WLog.wfmt(SERVICE_NAME, "Invalid intent action when geofencing is disabled: %s", new Object[] {
            intent.getAction()
        });
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.START_GEOFENCING_NOTIFICATION".equals(obj))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        flag = flag2;
        flag1 = flag3;
        enableGeofencing();
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_LOCATION_READY".equals(obj))
        {
            break MISSING_BLOCK_LABEL_376;
        }
        flag = flag2;
        flag1 = flag3;
        handleLocationReadyIntent(intent);
        flag = flag2;
        flag1 = flag3;
        errorProcessor.clearError();
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_CROSS_BOUNDARY".equals(obj))
        {
            break MISSING_BLOCK_LABEL_420;
        }
        flag = flag2;
        flag1 = flag3;
        handleCrossBoundaryIntent(intent);
        flag = flag2;
        flag1 = flag3;
        errorProcessor.clearError();
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_LEAVE_EXIT_ZONE".equals(obj))
        {
            break MISSING_BLOCK_LABEL_464;
        }
        flag = flag2;
        flag1 = flag3;
        handleLeaveExitZoneIntent(intent);
        flag = flag2;
        flag1 = flag3;
        errorProcessor.clearError();
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_ZONE_DATA_CHANGED".equals(obj))
        {
            break MISSING_BLOCK_LABEL_493;
        }
        flag = flag2;
        flag1 = flag3;
        handleZoneDataChangedIntent();
        return;
        flag = flag2;
        flag1 = flag3;
        if (!"com.google.android.apps.wallet.services.geofencing.ON_REQUEST_LOCATION".equals(obj))
        {
            break MISSING_BLOCK_LABEL_522;
        }
        flag = flag2;
        flag1 = flag3;
        handleRequestLocationIntent();
        return;
        flag = flag2;
        flag1 = flag3;
        WLog.efmt(SERVICE_NAME, "Invalid intent action: %s", new Object[] {
            intent.getAction()
        });
    }

    static 
    {
        MAX_LOCATION_AGE_MILLIS = TimeUnit.MINUTES.toMillis(1L);
        MAX_LOCATION_RESOLUTION_TIME_MILLIS = TimeUnit.SECONDS.toMillis(30L);
    }
}
