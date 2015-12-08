// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.urbanairship.location:
//            LocationRequestOptions, UALocationManager, UALocationProvider

public class LocationService extends Service
{
    protected class IncomingHandler extends Handler
    {

        final LocationService this$0;

        public void handleMessage(Message message)
        {
            Logger.verbose((new StringBuilder()).append("Location service received message: ").append(message).toString());
            switch (message.what)
            {
            case 3: // '\003'
            case 4: // '\004'
            default:
                Logger.error((new StringBuilder()).append("Unexpected message sent to location service: ").append(message).toString());
                return;

            case 2: // '\002'
                onUnsubscribeUpdates(message);
                return;

            case 1: // '\001'
                onSubscribeUpdates(message);
                return;

            case 5: // '\005'
                onRequestSingleUpdate(message);
                return;

            case 6: // '\006'
                onCancelSingleUpdate(message);
                return;

            case 7: // '\007'
                onHandleIntent((Intent)message.obj);
                break;
            }
            stopSelf(message.arg1);
        }

        public IncomingHandler(Looper looper1)
        {
            this$0 = LocationService.this;
            super(looper1);
        }
    }


    static final String ACTION_LOCATION_UPDATE = "com.urbanairship.location.ACTION_LOCATION_UPDATE";
    static final String ACTION_START_UPDATES = "com.urbanairship.location.ACTION_START_UPDATES";
    static final String ACTION_STOP_UPDATES = "com.urbanairship.location.ACTION_STOP_UPDATES";
    static final String EXTRA_MIN_DISTANCE = "com.urbanairship.location.EXTRA_MIN_DISTANCE";
    static final String EXTRA_MIN_TIME = "com.urbanairship.location.EXTRA_MIN_TIME";
    static final String EXTRA_PRIORITY = "com.urbanairship.location.EXTRA_PRIORITY";
    static final int MSG_CANCEL_SINGLE_LOCATION_REQUEST = 6;
    private static final int MSG_HANDLE_INTENT = 7;
    static final int MSG_NEW_LOCATION_UPDATE = 3;
    static final int MSG_REQUEST_SINGLE_LOCATION = 5;
    static final int MSG_SINGLE_REQUEST_RESULT = 4;
    static final int MSG_SUBSCRIBE_UPDATES = 1;
    static final int MSG_UNSUBSCRIBE_UPDATES = 2;
    static boolean areUpdatesStopped = false;
    static LocationRequestOptions lastUpdateOptions = null;
    IncomingHandler handler;
    UALocationProvider locationProvider;
    Looper looper;
    private Messenger messenger;
    private HashMap pendingResultMap;
    private Set subscribedClients;

    public LocationService()
    {
        subscribedClients = new HashSet();
        pendingResultMap = new HashMap();
    }

    private void addPendingResult(Messenger messenger1, int i, PendingResult pendingresult)
    {
        HashMap hashmap = pendingResultMap;
        hashmap;
        JVM INSTR monitorenter ;
        if (messenger1 == null || i <= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!pendingResultMap.containsKey(messenger1))
        {
            pendingResultMap.put(messenger1, new SparseArray());
        }
        ((SparseArray)pendingResultMap.get(messenger1)).put(i, pendingresult);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        messenger1;
        hashmap;
        JVM INSTR monitorexit ;
        throw messenger1;
    }

    private PendingIntent createLocationUpdateIntent(LocationRequestOptions locationrequestoptions)
    {
        Intent intent = (new Intent(getApplicationContext(), com/urbanairship/location/LocationService)).setAction("com.urbanairship.location.ACTION_LOCATION_UPDATE");
        if (locationrequestoptions != null)
        {
            intent.putExtras(createRequestOptionsBundle(locationrequestoptions));
        }
        return PendingIntent.getService(getApplicationContext(), 0, intent, 0x8000000);
    }

    static Bundle createRequestOptionsBundle(LocationRequestOptions locationrequestoptions)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.urbanairship.location.EXTRA_PRIORITY", Integer.valueOf(locationrequestoptions.getPriority()));
        bundle.putFloat("com.urbanairship.location.EXTRA_MIN_DISTANCE", locationrequestoptions.getMinDistance());
        bundle.putLong("com.urbanairship.location.EXTRA_MIN_TIME", locationrequestoptions.getMinTime());
        return bundle;
    }

    private void onCancelSingleUpdate(Message message)
    {
        int i = message.arg1;
        message = message.replyTo;
        PendingResult pendingresult = removePendingResult(message, i);
        if (pendingresult != null)
        {
            Logger.info((new StringBuilder()).append("Location service canceled single request for client: ").append(message).append(" id: ").append(i).toString());
            pendingresult.cancel();
        }
    }

    private void onHandleIntent(Intent intent)
    {
        String s;
        if (intent == null)
        {
            s = null;
        } else
        {
            s = intent.getAction();
        }
        Logger.verbose((new StringBuilder()).append("Location service received intent action: ").append(s).toString());
        if ("com.urbanairship.location.ACTION_START_UPDATES".equals(s))
        {
            onStartLocationUpdates();
        } else
        {
            if ("com.urbanairship.location.ACTION_STOP_UPDATES".equals(s))
            {
                onStopLocationUpdates();
                return;
            }
            if ("com.urbanairship.location.ACTION_LOCATION_UPDATE".equals(s))
            {
                onLocationUpdate(intent);
                return;
            }
        }
    }

    private void onLocationUpdate(Intent intent)
    {
        if (UALocationManager.shared().isLocationUpdatesNeeded() && !areUpdatesStopped)
        {
            Object obj = parseRequestOptions(intent.getExtras());
            if (lastUpdateOptions == null)
            {
                lastUpdateOptions = ((LocationRequestOptions) (obj));
            }
            if (intent.hasExtra("providerEnabled"))
            {
                Logger.info("Location service will restart location updates. One of the location providers was enabled or disabled.");
                intent = UALocationManager.shared().getLocationRequestOptions();
                obj = createLocationUpdateIntent(intent);
                locationProvider.connect();
                locationProvider.cancelRequests(((PendingIntent) (obj)));
                locationProvider.requestLocationUpdates(intent, ((PendingIntent) (obj)));
                return;
            }
            if (intent.hasExtra("location"))
            {
                intent = intent.getParcelableExtra("location");
            } else
            {
                intent = intent.getParcelableExtra("com.google.android.location.LOCATION");
            }
            intent = (Location)(Location)intent;
            if (intent != null)
            {
                Logger.verbose((new StringBuilder()).append("Location service received location update: ").append(intent).toString());
                UAirship.shared().getAnalytics().recordLocation(intent, ((LocationRequestOptions) (obj)), com.urbanairship.analytics.LocationEvent.UpdateType.CONTINUOUS);
                obj = (new ArrayList(subscribedClients)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Messenger messenger1 = (Messenger)((Iterator) (obj)).next();
                    if (!sendClientMessage(messenger1, 3, 0, intent))
                    {
                        subscribedClients.remove(messenger1);
                    }
                }
            }
        }
    }

    private void onRequestSingleUpdate(final Message options)
    {
        final int requestId = options.arg1;
        final Messenger client = options.replyTo;
        options = parseRequestOptions(options.getData());
        if (options == null)
        {
            Logger.warn("Location service unable to perform single location request. Invalid request options.");
            sendClientMessage(client, 4, requestId, null);
            return;
        }
        Logger.info((new StringBuilder()).append("Location service requesting single location request for client: ").append(client).append(" id: ").append(requestId).toString());
        locationProvider.connect();
        PendingResult pendingresult = locationProvider.requestSingleLocation(options);
        if (pendingresult == null)
        {
            Logger.warn("Location service unable to perform single location request. UALocationProvider failed to request a location.");
            sendClientMessage(client, 4, requestId, null);
            return;
        } else
        {
            addPendingResult(client, requestId, pendingresult);
            pendingresult.onResult(new com.urbanairship.PendingResult.ResultCallback() {

                final LocationService this$0;
                final Messenger val$client;
                final LocationRequestOptions val$options;
                final int val$requestId;

                public void onResult(Location location)
                {
                    Logger.info((new StringBuilder()).append("Location service received single location: ").append(location).append(" for client:").append(client).append(" id: ").append(requestId).toString());
                    UAirship.shared().getAnalytics().recordLocation(location, options, com.urbanairship.analytics.LocationEvent.UpdateType.SINGLE);
                    sendClientMessage(client, 4, requestId, location);
                    removePendingResult(client, requestId);
                }

                public volatile void onResult(Object obj)
                {
                    onResult((Location)obj);
                }

            
            {
                this$0 = LocationService.this;
                client = messenger1;
                requestId = i;
                options = locationrequestoptions;
                super();
            }
            });
            return;
        }
    }

    private void onStartLocationUpdates()
    {
        LocationRequestOptions locationrequestoptions = UALocationManager.shared().getLocationRequestOptions();
        if (lastUpdateOptions != null && lastUpdateOptions.equals(locationrequestoptions))
        {
            Logger.verbose("Location service updates already started.");
            return;
        } else
        {
            Logger.info("Location service starting updates.");
            lastUpdateOptions = locationrequestoptions;
            areUpdatesStopped = false;
            PendingIntent pendingintent = createLocationUpdateIntent(locationrequestoptions);
            locationProvider.connect();
            locationProvider.cancelRequests(pendingintent);
            locationProvider.requestLocationUpdates(locationrequestoptions, pendingintent);
            return;
        }
    }

    private void onStopLocationUpdates()
    {
        if (!areUpdatesStopped)
        {
            Logger.info("Location service stopping updates.");
            locationProvider.cancelRequests(createLocationUpdateIntent(null));
            lastUpdateOptions = null;
            areUpdatesStopped = true;
        }
    }

    private void onSubscribeUpdates(Message message)
    {
        if (message.replyTo != null)
        {
            Logger.debug("Location service added client from updates");
            subscribedClients.add(message.replyTo);
        }
    }

    private void onUnsubscribeUpdates(Message message)
    {
        if (subscribedClients.remove(message.replyTo))
        {
            Logger.debug("Location service removed client from updates");
        }
    }

    private static LocationRequestOptions parseRequestOptions(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        try
        {
            bundle = (new LocationRequestOptions.Builder()).setPriority(bundle.getInt("com.urbanairship.location.EXTRA_PRIORITY")).setMinDistance(bundle.getFloat("com.urbanairship.location.EXTRA_MIN_DISTANCE")).setMinTime(bundle.getLong("com.urbanairship.location.EXTRA_MIN_TIME"), TimeUnit.MILLISECONDS).create();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.error((new StringBuilder()).append("Invalid LocationRequestOptions from Bundle. ").append(bundle.getMessage()).toString());
            return null;
        }
        return bundle;
    }

    private PendingResult removePendingResult(Messenger messenger1, int i)
    {
        PendingResult pendingresult = null;
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = pendingResultMap;
        hashmap;
        JVM INSTR monitorenter ;
        if (pendingResultMap.containsKey(messenger1)) goto _L2; else goto _L1
_L1:
        messenger1 = pendingresult;
_L4:
        this;
        JVM INSTR monitorexit ;
        return messenger1;
_L2:
        SparseArray sparsearray = (SparseArray)pendingResultMap.get(messenger1);
        if (sparsearray == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        pendingresult = (PendingResult)sparsearray.get(i);
        sparsearray.remove(i);
        if (sparsearray.size() == 0)
        {
            pendingResultMap.remove(messenger1);
        }
        hashmap;
        JVM INSTR monitorexit ;
        messenger1 = pendingresult;
        continue; /* Loop/switch isn't completed */
        messenger1;
        hashmap;
        JVM INSTR monitorexit ;
        throw messenger1;
        messenger1;
        this;
        JVM INSTR monitorexit ;
        throw messenger1;
        hashmap;
        JVM INSTR monitorexit ;
        messenger1 = pendingresult;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean sendClientMessage(Messenger messenger1, int i, int j, Object obj)
    {
        if (messenger1 == null)
        {
            return false;
        }
        try
        {
            messenger1.send(Message.obtain(null, i, j, 0, obj));
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger1)
        {
            return false;
        }
        return true;
    }

    public IBinder onBind(Intent intent)
    {
        return messenger.getBinder();
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        HandlerThread handlerthread = new HandlerThread("LocationService");
        handlerthread.start();
        looper = handlerthread.getLooper();
        handler = new IncomingHandler(looper);
        messenger = new Messenger(handler);
        locationProvider = new UALocationProvider(getApplicationContext());
        Logger.verbose("Location service created.");
    }

    public void onDestroy()
    {
        locationProvider.disconnect();
        looper.quit();
        super.onDestroy();
        Logger.verbose("Location service destroyed.");
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Message message = handler.obtainMessage();
        message.arg1 = j;
        message.obj = intent;
        message.what = 7;
        handler.sendMessage(message);
        return 2;
    }








}
