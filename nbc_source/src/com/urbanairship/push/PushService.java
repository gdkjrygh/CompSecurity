// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Application;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.restclient.AppAuthenticatedRequest;
import com.urbanairship.restclient.Response;
import com.urbanairship.util.IntentUtils;
import com.urbanairship.util.UAStringUtil;
import java.io.UnsupportedEncodingException;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.push:
//            PushPreferences, PushManager, GCMRegistrar, PushRegistrationBuilder, 
//            PushRegistrationPayload, GCMMessageHandler

public class PushService extends IntentService
{

    protected static final String ACTION_DELETE_APID = "com.urbanairship.push.DELETE_APID";
    protected static final String ACTION_GCM_REGISTRATION = "com.urbanairship.push.GCM_REGISTRATION";
    protected static final String ACTION_START_PUSH_SERVICE = "com.urbanairship.push.START_SERVICE";
    protected static final String ACTION_UPDATE_APID = "com.urbanairship.push.UPDATE_APID";
    private static final long API_RETRY_INTERVAL_MS = 0x927c0L;
    protected static final String EXTRA_WAKE_LOCK_ID = "com.urbanairship.push.WAKE_LOCK_ID";
    private static final long WAKE_LOCK_TIMEOUT_MS = 60000L;
    private static int nextWakeLockID = 0;
    private static final SparseArray wakeLocks = new SparseArray();
    private PushPreferences preferences;

    public PushService()
    {
        this("PushService");
    }

    public PushService(String s)
    {
        super(s);
    }

    static int acquireWakeLock()
    {
        com/urbanairship/push/PushService;
        JVM INSTR monitorenter ;
        int i;
        android.os.PowerManager.WakeLock wakelock = ((PowerManager)UAirship.shared().getApplicationContext().getSystemService("power")).newWakeLock(1, "UA_GCM_WAKE_LOCK");
        wakelock.setReferenceCounted(false);
        wakelock.acquire(60000L);
        SparseArray sparsearray = wakeLocks;
        i = nextWakeLockID + 1;
        nextWakeLockID = i;
        sparsearray.append(i, wakelock);
        i = nextWakeLockID;
        com/urbanairship/push/PushService;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private void deleteApid(String s)
    {
        if (preferences.isPushEnabled() && s.equals(preferences.getPushId()))
        {
            return;
        }
        Object obj = UAirship.shared().getAirshipConfigOptions();
        obj = (new StringBuilder()).append(((AirshipConfigOptions) (obj)).hostURL).append("api/apids/").append(s).toString();
        Logger.verbose((new StringBuilder()).append("URL: ").append(((String) (obj))).toString());
        obj = (new AppAuthenticatedRequest("DELETE", ((String) (obj)))).execute();
        if (obj == null)
        {
            Logger.info("Error deleting APID. Scheduling retry.");
            scheduleAction("com.urbanairship.push.DELETE_APID", s);
            return;
        }
        int i = ((Response) (obj)).status();
        Logger.info((new StringBuilder()).append("Delete APID status code: ").append(i).toString());
        if (i == 204 || i == 404)
        {
            Logger.info((new StringBuilder()).append("Delete request succeeded with status: ").append(i).toString());
            return;
        }
        if (i >= 500 && i < 600)
        {
            Logger.info((new StringBuilder()).append("Delete request failed. Response status: ").append(i).append(" (will retry).").toString());
            scheduleAction("com.urbanairship.push.DELETE_APID", s);
            return;
        } else
        {
            Logger.info((new StringBuilder()).append("Delete request failed. Response status: ").append(i).toString());
            return;
        }
    }

    static void releaseWakeLock(int i)
    {
        com/urbanairship/push/PushService;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)wakeLocks.get(i);
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        wakeLocks.remove(i);
        if (wakelock.isHeld())
        {
            wakelock.release();
        }
        com/urbanairship/push/PushService;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void runGcmIntentInService(Context context, Intent intent)
    {
        Logger.debug("PushService startService");
        intent.setClass(context, com/urbanairship/push/PushService);
        intent.putExtra("com.urbanairship.push.WAKE_LOCK_ID", acquireWakeLock());
        context.startService(intent);
    }

    private void scheduleAction(String s, String s1)
    {
        Intent intent = new Intent();
        intent.setClass(UAirship.shared().getApplicationContext(), com/urbanairship/push/PushService);
        intent.setAction(s);
        intent.putExtra("com.urbanairship.push.APID", s1);
        IntentUtils.scheduleIntent(UAirship.shared().getApplicationContext(), intent, 0x927c0L);
    }

    private void startPushService()
    {
        Object obj = PushManager.shared().getPreferences();
        Logger.debug((new StringBuilder()).append("Push enabled: ").append(((PushPreferences) (obj)).isPushEnabled()).toString());
        if (!((PushPreferences) (obj)).isPushEnabled())
        {
            Logger.verbose("Push is disabled.  Not starting Push Service.");
            return;
        }
        AirshipConfigOptions airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        long l = ((PushPreferences) (obj)).getLastApidRegistrationTime();
        long l1 = System.currentTimeMillis();
        if (l > l1 || 0x5265c00L + l < l1)
        {
            ((PushPreferences) (obj)).setApidUpdateNeeded(true);
        }
        obj = airshipconfigoptions.getTransport();
        if (obj == com.urbanairship.AirshipConfigOptions.TransportType.HELIUM)
        {
            Logger.error("The Helium transport is no longer supported.");
            return;
        }
        if (obj == com.urbanairship.AirshipConfigOptions.TransportType.HYBRID)
        {
            Logger.error("The Hybrid transport is no longer supported. Using GCM.");
        }
        Logger.debug("Starting GCM");
        GCMRegistrar.register();
    }

    private void updateApid()
    {
        Object obj = preferences.getPushId();
        if (!preferences.isPushEnabled())
        {
            Logger.debug("Push is not enabled, so skipping stale APID update.");
            return;
        }
        Logger.debug((new StringBuilder()).append("Updating APID: ").append(((String) (obj))).toString());
        if (UAStringUtil.isEmpty(((String) (obj))))
        {
            Logger.error("No APID. Cannot update.");
            return;
        }
        Object obj1 = UAirship.shared().getAirshipConfigOptions();
        Object obj2 = (new StringBuilder()).append(((AirshipConfigOptions) (obj1)).hostURL).append("api/apids/").append(((String) (obj))).toString();
        Logger.verbose((new StringBuilder()).append("URL: ").append(((String) (obj2))).toString());
        obj1 = PushRegistrationBuilder.buildWithCurrentPreferences();
        try
        {
            obj1 = ((PushRegistrationPayload) (obj1)).asJSON();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.error("Error creating JSON Registration body.", ((Throwable) (obj)));
            return;
        }
        obj2 = new AppAuthenticatedRequest("PUT", ((String) (obj2)));
        try
        {
            StringEntity stringentity = new StringEntity(((JSONObject) (obj1)).toString(), "UTF-8");
            stringentity.setContentType("application/json");
            ((AppAuthenticatedRequest) (obj2)).setEntity(stringentity);
            Logger.verbose((new StringBuilder()).append("Body: ").append(((JSONObject) (obj1)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Logger.error("Error setting registrationRequest entity.");
        }
        obj1 = ((AppAuthenticatedRequest) (obj2)).execute();
        if (obj1 == null)
        {
            Logger.info("Error registering APID. Scheduling a retry.");
            scheduleAction("com.urbanairship.push.UPDATE_APID", ((String) (obj)));
            return;
        }
        obj2 = ((Response) (obj1)).body();
        int i = ((Response) (obj1)).status();
        Logger.info((new StringBuilder()).append("Registration status code: ").append(i).toString());
        Logger.verbose((new StringBuilder()).append("Registration result ").append(((String) (obj2))).toString());
        if (i == 200)
        {
            Logger.info("Registration request succeeded.");
            preferences.setApidUpdateNeeded(false);
            preferences.setLastApidRegistrationTime(System.currentTimeMillis());
            PushManager.shared().sendRegistrationFinishedBroadcast(true);
            return;
        }
        if (i >= 500 && i < 600)
        {
            Logger.info((new StringBuilder()).append("Registration request response status: ").append(((Response) (obj1)).status()).append(" (will retry)").toString());
            scheduleAction("com.urbanairship.push.UPDATE_APID", ((String) (obj)));
            return;
        } else
        {
            Logger.info((new StringBuilder()).append("Registration request response status: ").append(((Response) (obj1)).status()).toString());
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        preferences = PushManager.shared().getPreferences();
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        Logger.verbose("PushService started with a null intent. Ending task.");
_L10:
        return;
_L2:
        String s;
        int i;
        s = intent.getAction();
        i = intent.getIntExtra("com.urbanairship.push.WAKE_LOCK_ID", -1);
        intent.removeExtra("com.urbanairship.push.WAKE_LOCK_ID");
        if (!"com.urbanairship.push.DELETE_APID".equals(s)) goto _L4; else goto _L3
_L3:
        intent = intent.getStringExtra("com.urbanairship.push.APID");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        deleteApid(intent);
_L5:
        if (i >= 0)
        {
            releaseWakeLock(i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!"com.urbanairship.push.UPDATE_APID".equals(s))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        updateApid();
          goto _L5
        intent;
        if (i >= 0)
        {
            releaseWakeLock(i);
        }
        throw intent;
label0:
        {
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(s))
            {
                break label0;
            }
            GCMRegistrar.handleRegistrationIntent(intent);
        }
          goto _L5
label1:
        {
            if (!"com.google.android.c2dm.intent.RECEIVE".equals(s))
            {
                break label1;
            }
            GCMMessageHandler.handleIntentMessage(intent);
        }
          goto _L5
        if (!"com.urbanairship.push.GCM_REGISTRATION".equals(s)) goto _L7; else goto _L6
_L6:
        GCMRegistrar.register();
          goto _L5
_L7:
        if (!"com.urbanairship.push.START_SERVICE".equals(s)) goto _L5; else goto _L8
_L8:
        startPushService();
          goto _L5
        if (true) goto _L10; else goto _L9
_L9:
    }

}
