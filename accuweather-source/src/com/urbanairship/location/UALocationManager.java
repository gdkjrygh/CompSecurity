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
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import com.urbanairship.BaseManager;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.location:
//            LocationPreferences, LocationService, LocationListener, LocationRequestOptions, 
//            PendingLocationResult

public class UALocationManager extends BaseManager
{
    private static class IncomingHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            Object obj = UALocationManager.shared();
            message.what;
            JVM INSTR tableswitch 3 4: default 32
        //                       3 38
        //                       4 102;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
_L5:
            return;
_L2:
            Location location = (Location)message.obj;
            if (location == null) goto _L5; else goto _L4
_L4:
            message = ((UALocationManager) (obj)).locationListeners;
            message;
            JVM INSTR monitorenter ;
            for (obj = ((UALocationManager) (obj)).locationListeners.iterator(); ((Iterator) (obj)).hasNext(); ((LocationListener)((Iterator) (obj)).next()).onLocationChanged(location)) { }
              goto _L6
            obj;
            message;
            JVM INSTR monitorexit ;
            throw obj;
_L6:
            message;
            JVM INSTR monitorexit ;
            return;
_L3:
            int i;
            location = (Location)message.obj;
            i = message.arg1;
            message = ((UALocationManager) (obj)).singleLocationRequests;
            message;
            JVM INSTR monitorenter ;
            PendingLocationResult pendinglocationresult = (PendingLocationResult)((UALocationManager) (obj)).singleLocationRequests.get(i);
            if (pendinglocationresult == null) goto _L8; else goto _L7
_L7:
            pendinglocationresult.setResult(location);
            ((UALocationManager) (obj)).singleLocationRequests.remove(i);
            ((UALocationManager) (obj)).updateServiceConnection();
_L8:
            message;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
        }

        IncomingHandler(Looper looper)
        {
            super(looper);
        }
    }

    private class SingleLocationRequest extends PendingLocationResult
    {

        private LocationRequestOptions options;
        private int requestId;
        final UALocationManager this$0;

        protected void onCancel()
        {
            if (!isDone())
            {
                sendMessage(6, requestId, null);
            }
            synchronized (singleLocationRequests)
            {
                singleLocationRequests.remove(requestId);
            }
            return;
            exception;
            sparsearray;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void sendLocationRequest()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = isDone();
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Bundle bundle = LocationService.createRequestOptionsBundle(options);
            sendMessage(5, requestId, bundle);
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        SingleLocationRequest(int i, LocationRequestOptions locationrequestoptions)
        {
            this$0 = UALocationManager.this;
            super();
            requestId = i;
            options = locationrequestoptions;
        }
    }


    private boolean isBound;
    private boolean isSubscribed;
    private List locationListeners;
    private final Messenger messenger = new Messenger(new IncomingHandler(Looper.getMainLooper()));
    private int nextSingleLocationRequestId;
    LocationPreferences preferences;
    private ServiceConnection serviceConnection;
    private Messenger serviceMessenger;
    private SparseArray singleLocationRequests;

    public UALocationManager(Context context, PreferenceDataStore preferencedatastore)
    {
        nextSingleLocationRequestId = 1;
        singleLocationRequests = new SparseArray();
        locationListeners = new ArrayList();
        serviceConnection = new ServiceConnection() {

            final UALocationManager this$0;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                Logger.info("Location service connected.");
                UALocationManager.this.onServiceConnected(ibinder);
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                Logger.info("Location service disconnected.");
                UALocationManager.this.onServiceDisconnected();
            }

            
            {
                this$0 = UALocationManager.this;
                super();
            }
        };
        preferences = new LocationPreferences(preferencedatastore);
        preferences.setListener(new com.urbanairship.PreferenceDataStore.PreferenceChangeListener() {

            final UALocationManager this$0;

            public void onPreferenceChange(String s)
            {
                updateServiceConnection();
            }

            
            {
                this$0 = UALocationManager.this;
                super();
            }
        });
    }

    private void bindService()
    {
        this;
        JVM INSTR monitorenter ;
        if (isBound) goto _L2; else goto _L1
_L1:
        Context context;
        Logger.info("Binding to location service.");
        context = UAirship.getApplicationContext();
        if (!context.bindService(new Intent(context, com/urbanairship/location/LocationService), serviceConnection, 1)) goto _L4; else goto _L3
_L3:
        isBound = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Logger.error("Unable to bind to location service. Check that the location service is added to the manifest.");
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean isAppForegrounded()
    {
        Analytics analytics = UAirship.shared().getAnalytics();
        return analytics != null && analytics.isAppInForeground();
    }

    private void onServiceConnected(IBinder ibinder)
    {
        this;
        JVM INSTR monitorenter ;
        serviceMessenger = new Messenger(ibinder);
        ibinder = singleLocationRequests;
        ibinder;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= singleLocationRequests.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((SingleLocationRequest)singleLocationRequests.valueAt(i)).sendLocationRequest();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ibinder;
        JVM INSTR monitorexit ;
        updateServiceConnection();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        ibinder;
        JVM INSTR monitorexit ;
        throw exception;
        ibinder;
        this;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    private void onServiceDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        serviceMessenger = null;
        isSubscribed = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean sendMessage(int i, int j, Bundle bundle)
    {
        if (serviceMessenger == null)
        {
            return false;
        }
        Message message = Message.obtain(null, i, j, 0);
        if (bundle != null)
        {
            message.setData(bundle);
        }
        message.replyTo = messenger;
        try
        {
            serviceMessenger.send(message);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.info("Remote exception when sending message to location service");
            return false;
        }
        return true;
    }

    public static UALocationManager shared()
    {
        return UAirship.shared().getLocationManager();
    }

    private void subscribeUpdates()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isSubscribed && sendMessage(1, 0, null))
        {
            Logger.info("Subscribed to continuous location updates.");
            isSubscribed = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void unbindService()
    {
        this;
        JVM INSTR monitorenter ;
        if (isBound)
        {
            Logger.info("Unbinding to location service.");
            UAirship.getApplicationContext().unbindService(serviceConnection);
            isBound = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void unsubscribeUpdates()
    {
        this;
        JVM INSTR monitorenter ;
        if (isSubscribed)
        {
            Logger.info("Unsubscribed from continuous location updates.");
            sendMessage(2, 0, null);
            isSubscribed = false;
            updateServiceConnection();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void updateServiceConnection()
    {
        this;
        JVM INSTR monitorenter ;
        Context context;
        boolean flag;
        flag = isLocationUpdatesNeeded();
        context = UAirship.getApplicationContext();
        if (!flag) goto _L2; else goto _L1
_L1:
        Intent intent = new Intent(context, com/urbanairship/location/LocationService);
        intent.setAction("com.urbanairship.location.ACTION_START_UPDATES");
        if (context.startService(intent) == null)
        {
            Logger.error("Unable to start location service. Check that the location service is added to the manifest.");
        }
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (locationListeners.isEmpty())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (!isBound) goto _L4; else goto _L3
_L3:
        subscribeUpdates();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Intent intent1 = new Intent(context, com/urbanairship/location/LocationService);
        intent1.setAction("com.urbanairship.location.ACTION_STOP_UPDATES");
        context.startService(intent1);
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L4:
        bindService();
          goto _L6
        unsubscribeUpdates();
        if (singleLocationRequests.size() == 0)
        {
            unbindService();
        }
          goto _L6
    }

    public void addLocationListener(LocationListener locationlistener)
    {
        synchronized (locationListeners)
        {
            locationListeners.add(locationlistener);
            updateServiceConnection();
        }
        return;
        locationlistener;
        list;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public LocationRequestOptions getLocationRequestOptions()
    {
        LocationRequestOptions locationrequestoptions1 = preferences.getLocationRequestOptions();
        LocationRequestOptions locationrequestoptions = locationrequestoptions1;
        if (locationrequestoptions1 == null)
        {
            locationrequestoptions = (new LocationRequestOptions.Builder()).create();
        }
        return locationrequestoptions;
    }

    LocationPreferences getPreferences()
    {
        return preferences;
    }

    protected void init()
    {
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

            final UALocationManager this$0;

            public void run()
            {
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
                intentfilter.addAction(Analytics.ACTION_APP_BACKGROUND);
                intentfilter.addCategory(UAirship.getPackageName());
                UAirship.getApplicationContext().registerReceiver(new BroadcastReceiver() {

                    final _cls3 this$1;

                    public void onReceive(Context context, Intent intent)
                    {
                        Logger.info("App state changed");
                        updateServiceConnection();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, intentfilter);
                updateServiceConnection();
            }

            
            {
                this$0 = UALocationManager.this;
                super();
            }
        }, 1000L);
    }

    public boolean isBackgroundLocationAllowed()
    {
        return preferences.isBackgroundLocationAllowed();
    }

    public boolean isLocationUpdatesEnabled()
    {
        return preferences.isLocationUpdatesEnabled();
    }

    boolean isLocationUpdatesNeeded()
    {
        while (!isLocationUpdatesEnabled() || !isBackgroundLocationAllowed() && !isAppForegrounded()) 
        {
            return false;
        }
        return true;
    }

    public void removeLocationListener(LocationListener locationlistener)
    {
        synchronized (locationListeners)
        {
            locationListeners.remove(locationlistener);
            updateServiceConnection();
        }
        return;
        locationlistener;
        list;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public PendingResult requestSingleLocation()
    {
        return requestSingleLocation(getLocationRequestOptions());
    }

    public PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions)
    {
        if (locationrequestoptions == null)
        {
            throw new IllegalArgumentException("Location request options cannot be null or invalid");
        }
        synchronized (singleLocationRequests)
        {
            int i = nextSingleLocationRequestId;
            nextSingleLocationRequestId = i + 1;
            locationrequestoptions = new SingleLocationRequest(i, locationrequestoptions);
            singleLocationRequests.put(i, locationrequestoptions);
        }
        this;
        JVM INSTR monitorenter ;
        if (isBound)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        bindService();
_L1:
        this;
        JVM INSTR monitorexit ;
        return locationrequestoptions;
        locationrequestoptions;
        sparsearray;
        JVM INSTR monitorexit ;
        throw locationrequestoptions;
        locationrequestoptions.sendLocationRequest();
          goto _L1
        locationrequestoptions;
        this;
        JVM INSTR monitorexit ;
        throw locationrequestoptions;
    }

    public void setBackgroundLocationAllowed(boolean flag)
    {
        preferences.setBackgroundLocationAllowed(flag);
    }

    public void setLocationRequestOptions(LocationRequestOptions locationrequestoptions)
    {
        preferences.setLocationRequestOptions(locationrequestoptions);
    }

    public void setLocationUpdatesEnabled(boolean flag)
    {
        preferences.setLocationUpdatesEnabled(flag);
    }






}
