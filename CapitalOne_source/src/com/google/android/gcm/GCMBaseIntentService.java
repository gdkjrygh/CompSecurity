// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gcm:
//            GCMRegistrar

public abstract class GCMBaseIntentService extends IntentService
{

    private static final String EXTRA_TOKEN = "token";
    private static final Object LOCK = com/google/android/gcm/GCMBaseIntentService;
    private static final int MAX_BACKOFF_MS;
    public static final String TAG = "GCMBaseIntentService";
    private static final String TOKEN;
    private static final String WAKELOCK_KEY = "GCM_LIB";
    private static int sCounter = 0;
    private static final Random sRandom;
    private static android.os.PowerManager.WakeLock sWakeLock;
    private final String mSenderId;

    protected GCMBaseIntentService(String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("GCMIntentService-").append(s).append("-");
        int i = sCounter + 1;
        sCounter = i;
        super(stringbuilder.append(i).toString());
        mSenderId = s;
    }

    private void handleRegistration(Context context, Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        Log.d("GCMBaseIntentService", (new StringBuilder()).append("handleRegistration: registrationId = ").append(s).append(", error = ").append(s1).append(", unregistered = ").append(intent).toString());
        if (s != null)
        {
            GCMRegistrar.resetBackoff(context);
            GCMRegistrar.setRegistrationId(context, s);
            onRegistered(context, s);
        } else
        {
            if (intent != null)
            {
                GCMRegistrar.resetBackoff(context);
                onUnregistered(context, GCMRegistrar.clearRegistrationId(context));
                return;
            }
            Log.d("GCMBaseIntentService", (new StringBuilder()).append("Registration error: ").append(s1).toString());
            if ("SERVICE_NOT_AVAILABLE".equals(s1))
            {
                if (onRecoverableError(context, s1))
                {
                    int i = GCMRegistrar.getBackoff(context);
                    int j = i / 2 + sRandom.nextInt(i);
                    Log.d("GCMBaseIntentService", (new StringBuilder()).append("Scheduling registration retry, backoff = ").append(j).append(" (").append(i).append(")").toString());
                    intent = new Intent("com.google.android.gcm.intent.RETRY");
                    intent.putExtra("token", TOKEN);
                    intent = PendingIntent.getBroadcast(context, 0, intent, 0);
                    ((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)j, intent);
                    if (i < MAX_BACKOFF_MS)
                    {
                        GCMRegistrar.setBackoff(context, i * 2);
                        return;
                    }
                } else
                {
                    Log.d("GCMBaseIntentService", "Not retrying failed operation");
                    return;
                }
            } else
            {
                onError(context, s1);
                return;
            }
        }
    }

    static void runIntentInService(Context context, Intent intent, String s)
    {
        synchronized (LOCK)
        {
            if (sWakeLock == null)
            {
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        Log.v("GCMBaseIntentService", "Acquiring wakelock");
        sWakeLock.acquire();
        intent.setClassName(context, s);
        context.startService(intent);
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    protected void onDeletedMessages(Context context, int i)
    {
    }

    protected abstract void onError(Context context, String s);

    public final void onHandleIntent(Intent intent)
    {
        Object obj;
        String s;
        obj = getApplicationContext();
        s = intent.getAction();
        if (!s.equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
_L1:
        handleRegistration(((Context) (obj)), intent);
_L17:
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null) goto _L4; else goto _L3
_L3:
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        sWakeLock.release();
_L14:
        return;
_L2:
        if (!s.equals("com.google.android.c2dm.intent.RECEIVE")) goto _L6; else goto _L5
_L5:
        s = intent.getStringExtra("message_type");
        if (s == null) goto _L8; else goto _L7
_L7:
        if (!s.equals("deleted_messages")) goto _L10; else goto _L9
_L9:
        intent = intent.getStringExtra("total_deleted");
        if (intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            int i = Integer.parseInt(intent);
            Log.v("GCMBaseIntentService", (new StringBuilder()).append("Received deleted messages notification: ").append(i).toString());
            onDeletedMessages(((Context) (obj)), i);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            intent = ((Intent) (LOCK));
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("GCM returned invalid number of deleted messages: ").append(intent).toString());
        continue; /* Loop/switch isn't completed */
        JVM INSTR monitorenter ;
        if (sWakeLock == null) goto _L12; else goto _L11
_L11:
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        sWakeLock.release();
_L15:
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received unknown special message: ").append(s).toString());
        continue; /* Loop/switch isn't completed */
_L8:
        onMessage(((Context) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L6:
        if (!s.equals("com.google.android.gcm.intent.RETRY"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("token");
        if (TOKEN.equals(intent))
        {
            break MISSING_BLOCK_LABEL_338;
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received invalid token: ").append(intent).toString());
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        sWakeLock.release();
_L13:
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
          goto _L13
        if (GCMRegistrar.isRegistered(((Context) (obj))))
        {
            GCMRegistrar.internalUnregister(((Context) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        GCMRegistrar.internalRegister(((Context) (obj)), new String[] {
            mSenderId
        });
        continue; /* Loop/switch isn't completed */
_L4:
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
          goto _L14
        Exception exception;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L12:
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
          goto _L15
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected abstract void onMessage(Context context, Intent intent);

    protected boolean onRecoverableError(Context context, String s)
    {
        return true;
    }

    protected abstract void onRegistered(Context context, String s);

    protected abstract void onUnregistered(Context context, String s);

    static 
    {
        sRandom = new Random();
        MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
        TOKEN = Long.toBinaryString(sRandom.nextLong());
    }
}
