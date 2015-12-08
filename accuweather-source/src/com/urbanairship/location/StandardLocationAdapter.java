// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import com.urbanairship.util.UAStringUtil;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.location:
//            LocationAdapter, LocationRequestOptions, PendingLocationResult

class StandardLocationAdapter
    implements LocationAdapter
{
    private static class AndroidLocationListener
        implements LocationListener
    {

        public void onLocationChanged(Location location)
        {
        }

        public void onProviderDisabled(String s)
        {
        }

        public void onProviderEnabled(String s)
        {
        }

        public void onStatusChanged(String s, int i, Bundle bundle)
        {
        }

        private AndroidLocationListener()
        {
        }

    }

    private class SingleLocationRequest extends PendingLocationResult
    {

        private Criteria criteria;
        private String currentProvider;
        private AndroidLocationListener currentProviderListener;
        private LocationRequestOptions options;
        private AndroidLocationListener providerEnabledListeners;
        final StandardLocationAdapter this$0;

        private void listenForLocationChanges()
        {
            if (currentProvider != null)
            {
                locationManager.removeUpdates(currentProviderListener);
            }
            String s = getBestProvider(criteria, options);
            currentProvider = s;
            if (s != null)
            {
                Logger.verbose((new StringBuilder()).append("Standard Android location single request using provider: ").append(s).toString());
                locationManager.requestLocationUpdates(s, 0L, 0.0F, currentProviderListener);
            }
        }

        private void listenForProvidersEnabled()
        {
            Object obj = locationManager.getProviders(criteria, false);
            if (obj != null)
            {
                String s;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); locationManager.requestLocationUpdates(s, 0x7fffffffffffffffL, 3.402823E+38F, providerEnabledListeners))
                {
                    s = (String)((Iterator) (obj)).next();
                    Logger.verbose((new StringBuilder()).append("Standard Android location single location request listening provider enable/disabled for: ").append(s).toString());
                }

            }
        }

        private void stopUpdates()
        {
            locationManager.removeUpdates(currentProviderListener);
            locationManager.removeUpdates(providerEnabledListeners);
        }

        protected void onCancel()
        {
            Logger.verbose("Standard Android location canceling single request.");
            stopUpdates();
        }





        SingleLocationRequest(LocationRequestOptions locationrequestoptions)
        {
            this.this$0 = StandardLocationAdapter.this;
            super();
            currentProvider = null;
            options = locationrequestoptions;
            criteria = createCriteria(locationrequestoptions);
            currentProviderListener = new _cls1();
            providerEnabledListeners = locationrequestoptions. new _cls2();
            if (locationrequestoptions.getPriority() != 4)
            {
                listenForProvidersEnabled();
            }
            listenForLocationChanges();
        }
    }


    private static final String PASSIVE_PROVIDER = "passive";
    private final LocationManager locationManager;

    StandardLocationAdapter(Context context)
    {
        locationManager = (LocationManager)context.getSystemService("location");
    }

    private Criteria createCriteria(LocationRequestOptions locationrequestoptions)
    {
        Criteria criteria = new Criteria();
        switch (locationrequestoptions.getPriority())
        {
        default:
            return criteria;

        case 1: // '\001'
            criteria.setAccuracy(1);
            criteria.setPowerRequirement(3);
            return criteria;

        case 2: // '\002'
            criteria.setAccuracy(2);
            criteria.setPowerRequirement(2);
            return criteria;

        case 3: // '\003'
        case 4: // '\004'
            criteria.setAccuracy(0);
            break;
        }
        criteria.setPowerRequirement(1);
        return criteria;
    }

    private String getBestProvider(Criteria criteria, LocationRequestOptions locationrequestoptions)
    {
        if (locationrequestoptions.getPriority() == 4)
        {
            for (criteria = locationManager.getProviders(criteria, true); criteria == null || !criteria.contains("passive");)
            {
                return null;
            }

            return "passive";
        } else
        {
            return locationManager.getBestProvider(criteria, true);
        }
    }

    public void cancelLocationUpdates(PendingIntent pendingintent)
    {
        Logger.verbose("Standard Android location canceling location updates.");
        locationManager.removeUpdates(pendingintent);
    }

    public boolean connect()
    {
        return true;
    }

    public void disconnect()
    {
    }

    public void requestLocationUpdates(LocationRequestOptions locationrequestoptions, PendingIntent pendingintent)
    {
        Object obj = createCriteria(locationrequestoptions);
        Object obj1 = locationManager.getProviders(((Criteria) (obj)), false);
        if (obj1 != null)
        {
            String s;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); locationManager.requestLocationUpdates(s, 0x7fffffffffffffffL, 3.402823E+38F, pendingintent))
            {
                s = (String)((Iterator) (obj1)).next();
                Logger.verbose((new StringBuilder()).append("Standard Android location update listening provider enable/disabled for: ").append(s).toString());
            }

        }
        obj = getBestProvider(((Criteria) (obj)), locationrequestoptions);
        if (!UAStringUtil.isEmpty(((String) (obj))))
        {
            Logger.verbose((new StringBuilder()).append("Standard Android location requesting location updates from provider: ").append(((String) (obj))).toString());
            locationManager.requestLocationUpdates(((String) (obj)), locationrequestoptions.getMinTime(), locationrequestoptions.getMinDistance(), pendingintent);
        }
    }

    public PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions)
    {
        return new SingleLocationRequest(locationrequestoptions);
    }




    // Unreferenced inner class com/urbanairship/location/StandardLocationAdapter$SingleLocationRequest$1

/* anonymous class */
    class SingleLocationRequest._cls1 extends AndroidLocationListener
    {

        final SingleLocationRequest this$1;
        final StandardLocationAdapter val$this$0;

        public void onLocationChanged(Location location)
        {
            stopUpdates();
            setResult(location);
        }

        public void onProviderDisabled(String s)
        {
            Logger.verbose((new StringBuilder()).append("Standard Android location provider disabled: ").append(s).toString());
            this;
            JVM INSTR monitorenter ;
            if (!isDone())
            {
                listenForLocationChanges();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

            
            {
                this$1 = final_singlelocationrequest;
                this$0 = StandardLocationAdapter.this;
                super();
            }
    }


    // Unreferenced inner class com/urbanairship/location/StandardLocationAdapter$SingleLocationRequest$2

/* anonymous class */
    class SingleLocationRequest._cls2 extends AndroidLocationListener
    {

        final SingleLocationRequest this$1;
        final LocationRequestOptions val$options;
        final StandardLocationAdapter val$this$0;

        public void onProviderEnabled(String s)
        {
            Logger.verbose((new StringBuilder()).append("Standard Android location provider enabled: ").append(s).toString());
            this;
            JVM INSTR monitorenter ;
            if (isDone())
            {
                break MISSING_BLOCK_LABEL_81;
            }
            s = getBestProvider(criteria, options);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            if (!s.equals(currentProvider))
            {
                listenForLocationChanges();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

            
            {
                this$1 = final_singlelocationrequest;
                this$0 = standardlocationadapter;
                options = LocationRequestOptions.this;
                super();
            }
    }

}
