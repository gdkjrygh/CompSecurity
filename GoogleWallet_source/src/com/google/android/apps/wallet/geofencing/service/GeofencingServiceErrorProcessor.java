// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.geofencing.service:
//            GeofencingReceiver

public class GeofencingServiceErrorProcessor
{

    public static final long INTERVAL_MS;
    public static final long MAX_RETRY_INTERVAL_MS;
    private static final String TAG = com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor.getSimpleName();
    private final AlarmManager alarmManager;
    private final AppControl appControl;
    private final Application application;
    private final SharedPreferences sharedPreferences;

    GeofencingServiceErrorProcessor(Application application1, AppControl appcontrol, AlarmManager alarmmanager, SharedPreferences sharedpreferences)
    {
        application = application1;
        appControl = appcontrol;
        alarmManager = alarmmanager;
        sharedPreferences = sharedpreferences;
    }

    public final void clearError()
    {
        SharedPreference.PROXIMITY_ALERT_ERROR_NO_NETWORK.put(sharedPreferences, Boolean.valueOf(false));
        SharedPreference.PROXIMITY_ALERT_RETRY_INTERVAL.put(sharedPreferences, Long.valueOf(-1L));
    }

    public final void noNetworkAccess()
    {
        SharedPreference.PROXIMITY_ALERT_ERROR_NO_NETWORK.put(sharedPreferences, Boolean.valueOf(true));
    }

    public final void scheduleDelayedServiceStart()
    {
        long l;
        if (!appControl.getBoolean(AppControlKey.GEOFENCING_NOTIFICATIONS_RETRY_SERVER_CALL))
        {
            WLog.d(TAG, "Retry server call disabled.");
            return;
        }
        l = ((Long)SharedPreference.PROXIMITY_ALERT_RETRY_INTERVAL.get(sharedPreferences)).longValue();
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        l = INTERVAL_MS;
_L4:
        SharedPreference.PROXIMITY_ALERT_RETRY_INTERVAL.put(sharedPreferences, Long.valueOf(l));
        WLog.dfmt(TAG, "Schedule a request location intent in %d minutes", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(l))
        });
        Object obj = GeofencingReceiver.createRequestLocationBroadcastIntent(application);
        obj = PendingIntent.getBroadcast(application, 0, ((android.content.Intent) (obj)), 0x10000000);
        long l1 = SystemClock.elapsedRealtime();
        alarmManager.set(2, l1 + l, ((PendingIntent) (obj)));
        return;
_L2:
        long l2 = l << 1;
        l = l2;
        if (l2 > MAX_RETRY_INTERVAL_MS)
        {
            l = MAX_RETRY_INTERVAL_MS;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        MAX_RETRY_INTERVAL_MS = TimeUnit.DAYS.toMillis(1L);
        INTERVAL_MS = TimeUnit.MINUTES.toMillis(5L);
    }
}
