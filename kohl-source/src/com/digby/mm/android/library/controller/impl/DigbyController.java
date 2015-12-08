// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.controller.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.digby.localpoint.sdk.core.ILPVersion;
import com.digby.localpoint.sdk.core.impl.LPVersion;
import com.digby.mm.android.library.comparator.impl.MessageIDComparator;
import com.digby.mm.android.library.comparator.impl.NullComparator;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.db.impl.MessageDBHelper;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.events.impl.AbstractEventResponseHandler;
import com.digby.mm.android.library.events.impl.DeviceRegistrationEvent;
import com.digby.mm.android.library.events.impl.EventSender;
import com.digby.mm.android.library.exception.DigbyException;
import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.filter.impl.NullFilter;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.geofence.impl.GetGeoFencesTask;
import com.digby.mm.android.library.location.IDownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.IGeofenceManager;
import com.digby.mm.android.library.location.impl.DownloadGeofenceAlarmManager;
import com.digby.mm.android.library.location.impl.GeofenceManager;
import com.digby.mm.android.library.utils.GCMUtil;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.impl.LocationHelper;
import com.digby.mm.android.library.utils.impl.Settings;
import com.digby.mm.android.library.utils.impl.SharedPrefsManager;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DigbyController
    implements IDigbyController
{

    private static final String DEFAULT_DEVICE_TOKEN = "73696d756c61746f72";
    private static final String GCM_RECEIVER_CLASS = "com.digby.mm.android.library.receivers.impl.DigbyGCMBroadcastReceiver";
    public static final String GCM_SENDER_ID = "882426900285";
    private static DigbyController theController = null;
    private Context mContext;
    private DigbyDBHelper mDBHelper;

    private DigbyController(Context context)
    {
        try
        {
            mDBHelper = new DigbyDBHelper(context);
            mContext = context;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("DigbyController", context);
        }
    }

    private void getGeoFencesImpl(IGeoFenceListReceiver igeofencelistreceiver, IFilter ifilter, Comparator comparator)
        throws IllegalStateException
    {
        boolean flag = false;
        if (!getSharedPrefsManager().getUseLocationServices()) goto _L2; else goto _L1
_L1:
        if (ifilter != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ifilter = new NullFilter();
        if (comparator != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        comparator = new NullComparator();
        (new GetGeoFencesTask(ifilter, comparator, igeofencelistreceiver, new GeoFenceDBHelper(mDBHelper), mContext)).execute(new Object[0]);
_L3:
        if (flag)
        {
            throw new IllegalStateException("Cannot get a GeoFence List before startLocationServices has been called");
        } else
        {
            return;
        }
_L2:
        flag = true;
          goto _L3
        igeofencelistreceiver;
        Logger.Error("getGeoFencesImpl", igeofencelistreceiver);
          goto _L3
    }

    public static final IDigbyController getInstance(Context context)
    {
        com/digby/mm/android/library/controller/impl/DigbyController;
        JVM INSTR monitorenter ;
        if (theController == null) goto _L2; else goto _L1
_L1:
        context = theController;
_L4:
        com/digby/mm/android/library/controller/impl/DigbyController;
        JVM INSTR monitorexit ;
        return context;
_L2:
        Context context1;
        context1 = null;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        context1 = context.getApplicationContext();
        Context context2;
        context2 = context1;
        if (context1 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        System.out.println("WARNING Application Context is null");
        context2 = context;
        theController = new DigbyController(context2);
        context = theController;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    private List getMessagesImpl(IFilter ifilter, Comparator comparator)
    {
        Object obj1;
        Object obj2 = new ArrayList();
        Object obj = ifilter;
        if (ifilter == null)
        {
            ifilter = ((IFilter) (obj2));
            try
            {
                obj = new NullFilter();
            }
            // Misplaced declaration of an exception variable
            catch (Comparator comparator)
            {
                Logger.Error("getMessagesImpl", comparator);
                return ifilter;
            }
        }
        obj1 = comparator;
        if (comparator != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ifilter = ((IFilter) (obj2));
        obj1 = new MessageIDComparator();
        ifilter = ((IFilter) (obj2));
        comparator = (new MessageDBHelper(mDBHelper)).getMessages();
        ifilter = comparator;
        obj2 = comparator.iterator();
_L2:
        ifilter = comparator;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ifilter = comparator;
        if (((IFilter) (obj)).matches(((Iterator) (obj2)).next()))
        {
            continue; /* Loop/switch isn't completed */
        }
        ifilter = comparator;
        ((Iterator) (obj2)).remove();
        if (true) goto _L2; else goto _L1
_L1:
        ifilter = comparator;
        Collections.sort(comparator, ((Comparator) (obj1)));
        return comparator;
    }

    private void initGCM()
    {
        Logger.Debug("Start to check if Google Play Service is available.", mContext.getApplicationContext());
        boolean flag1 = GCMUtil.checkPlayServices(mContext.getApplicationContext());
        boolean flag = true;
        try
        {
            mContext.getApplicationContext().getPackageManager().getReceiverInfo(new ComponentName(mContext, "com.digby.mm.android.library.receivers.impl.DigbyGCMBroadcastReceiver"), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            flag = false;
            Logger.Debug("Localpoint SDK GCM receiver(com.digby.mm.android.library.receivers.impl.DigbyGCMBroadcastReceiver) isn't configured in manifest.xml", mContext.getApplicationContext());
        }
        catch (Exception exception)
        {
            Logger.Debug("Unknown exception to check Localpoint SDK GCM receiver(com.digby.mm.android.library.receivers.impl.DigbyGCMBroadcastReceiver)", mContext.getApplicationContext());
        }
        if (!flag1 || !flag)
        {
            Logger.Warn("Google Play is not configured in the Manifest File. ");
            Logger.Warn("I will send simulator as token to register this client.");
            try
            {
                getInstance(mContext).sendEvent(new DeviceRegistrationEvent(mContext.getApplicationContext(), "73696d756c61746f72"), null);
                return;
            }
            catch (Exception exception1)
            {
                Logger.Error("sendDeviceRegistrationEvent", exception1);
            }
            return;
        } else
        {
            Logger.Debug("Start to initialize GCMRegistrar.", mContext.getApplicationContext());
            GCMUtil.register(mContext.getApplicationContext(), "882426900285");
            return;
        }
    }

    public void getGeoFences(IFilter ifilter, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException
    {
        getGeoFencesImpl(igeofencelistreceiver, ifilter, null);
    }

    public void getGeoFences(IFilter ifilter, Comparator comparator, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException
    {
        getGeoFencesImpl(igeofencelistreceiver, ifilter, comparator);
    }

    public void getGeoFences(IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException
    {
        getGeoFencesImpl(igeofencelistreceiver, null, null);
    }

    public void getGeoFences(Comparator comparator, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException
    {
        getGeoFencesImpl(igeofencelistreceiver, null, comparator);
    }

    public ILocationHelper getLocationHelper()
    {
        return new LocationHelper(mContext);
    }

    public List getMessages()
    {
        return getMessagesImpl(null, null);
    }

    public List getMessages(IFilter ifilter)
    {
        return getMessagesImpl(ifilter, null);
    }

    public List getMessages(IFilter ifilter, Comparator comparator)
    {
        return getMessagesImpl(ifilter, comparator);
    }

    public List getMessages(Comparator comparator)
    {
        return getMessagesImpl(null, comparator);
    }

    public ILPVersion getSDKVersion()
    {
        return LPVersion.getInstance();
    }

    public ISettings getSettings()
    {
        return Settings.getInstance(mContext);
    }

    public ISharedPrefsManager getSharedPrefsManager()
    {
        return new SharedPrefsManager(mContext);
    }

    public boolean isDeviceRegistered()
    {
        return getSharedPrefsManager().getDeviceRegistered();
    }

    public void sendEvent(IEvent ievent, IEventResponseHandler ieventresponsehandler)
    {
        EventSender eventsender = new EventSender();
        Object obj = ieventresponsehandler;
        if (ieventresponsehandler == null)
        {
            obj = new AbstractEventResponseHandler() {

                final DigbyController this$0;

                public void onError(DigbyException digbyexception)
                {
                }

                public void onResponse(IEventResponse ieventresponse)
                {
                }

            
            {
                this$0 = DigbyController.this;
                super();
            }
            };
        }
        eventsender.send(ievent, ((IEventResponseHandler) (obj)));
    }

    public boolean startLocationServices()
    {
        ISharedPrefsManager isharedprefsmanager = getSharedPrefsManager();
        isharedprefsmanager.setUseLocationServices(true);
        if (!isharedprefsmanager.getDeviceRegistered())
        {
            isharedprefsmanager.setIsRegistering(true);
            isharedprefsmanager.getLastDownloadInfo().setState(com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.DOWNLOADING);
            Logger.Debug("Registering with GCM", mContext.getApplicationContext());
            initGCM();
            (new DownloadGeofenceAlarmManager(mContext)).setDailyDownloadGeofenceAlarm();
        }
        return false;
    }

    public void stopLocationServices()
    {
        try
        {
            getSharedPrefsManager().setUseLocationServices(false);
            GeofenceManager.getInstance(mContext).removeAllGeofences();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("stopLocationServices", exception);
        }
    }

}
