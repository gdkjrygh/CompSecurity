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
//            b

public abstract class GCMBaseIntentService extends IntentService
{

    public static final String a = "GCMBaseIntentService";
    private static final String b = "GCM_LIB";
    private static android.os.PowerManager.WakeLock c;
    private static final Object d = com/google/android/gcm/GCMBaseIntentService;
    private static int f = 0;
    private static final Random g;
    private static final int h;
    private static final String i;
    private static final String j = "token";
    private final String e[];

    protected GCMBaseIntentService()
    {
        this(a("DynamicSenderIds"), null);
    }

    private GCMBaseIntentService(String s, String as[])
    {
        super(s);
        e = as;
    }

    protected transient GCMBaseIntentService(String as[])
    {
        this(a(as), as);
    }

    private static String a(String s)
    {
        s = (new StringBuilder()).append("GCMIntentService-").append(s).append("-");
        int k = f + 1;
        f = k;
        s = s.append(k).toString();
        Log.v("GCMBaseIntentService", (new StringBuilder()).append("Intent service name: ").append(s).toString());
        return s;
    }

    private static String a(String as[])
    {
        return a(com.google.android.gcm.b.a(as));
    }

    static void a(Context context, Intent intent, String s)
    {
        synchronized (d)
        {
            if (c == null)
            {
                c = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        Log.v("GCMBaseIntentService", "Acquiring wakelock");
        c.acquire();
        intent.setClassName(context, s);
        context.startService(intent);
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void b(Context context, Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        Log.d("GCMBaseIntentService", (new StringBuilder()).append("handleRegistration: registrationId = ").append(s).append(", error = ").append(s1).append(", unregistered = ").append(intent).toString());
        if (s != null)
        {
            com.google.android.gcm.b.l(context);
            com.google.android.gcm.b.a(context, s);
            b(context, s);
        } else
        {
            if (intent != null)
            {
                com.google.android.gcm.b.l(context);
                c(context, com.google.android.gcm.b.i(context));
                return;
            }
            Log.d("GCMBaseIntentService", (new StringBuilder()).append("Registration error: ").append(s1).toString());
            if ("SERVICE_NOT_AVAILABLE".equals(s1))
            {
                if (d(context, s1))
                {
                    int k = com.google.android.gcm.b.m(context);
                    int l = k / 2;
                    l = g.nextInt(k) + l;
                    Log.d("GCMBaseIntentService", (new StringBuilder()).append("Scheduling registration retry, backoff = ").append(l).append(" (").append(k).append(")").toString());
                    intent = new Intent("com.google.android.gcm.intent.RETRY");
                    intent.putExtra("token", i);
                    intent = PendingIntent.getBroadcast(context, 0, intent, 0);
                    ((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)l, intent);
                    if (k < h)
                    {
                        com.google.android.gcm.b.a(context, k * 2);
                        return;
                    }
                } else
                {
                    Log.d("GCMBaseIntentService", "Not retrying failed operation");
                    return;
                }
            } else
            {
                a(context, s1);
                return;
            }
        }
    }

    protected void a(Context context, int k)
    {
    }

    protected abstract void a(Context context, Intent intent);

    protected abstract void a(Context context, String s);

    protected String[] a(Context context)
    {
        if (e == null)
        {
            throw new IllegalStateException("sender id not set on constructor");
        } else
        {
            return e;
        }
    }

    protected abstract void b(Context context, String s);

    protected abstract void c(Context context, String s);

    protected boolean d(Context context, String s)
    {
        return true;
    }

    public final void onHandleIntent(Intent intent)
    {
        Object obj;
        String s;
        obj = getApplicationContext();
        s = intent.getAction();
        if (!s.equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
_L1:
        com.google.android.gcm.b.f(((Context) (obj)));
        b(((Context) (obj)), intent);
_L17:
        intent = ((Intent) (d));
        intent;
        JVM INSTR monitorenter ;
        if (c == null) goto _L4; else goto _L3
_L3:
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        c.release();
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
            int k = Integer.parseInt(intent);
            Log.v("GCMBaseIntentService", (new StringBuilder()).append("Received deleted messages notification: ").append(k).toString());
            a(((Context) (obj)), k);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            intent = ((Intent) (d));
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("GCM returned invalid number of deleted messages: ").append(intent).toString());
        continue; /* Loop/switch isn't completed */
        JVM INSTR monitorenter ;
        if (c == null) goto _L12; else goto _L11
_L11:
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        c.release();
_L15:
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received unknown special message: ").append(s).toString());
        continue; /* Loop/switch isn't completed */
_L8:
        a(((Context) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L6:
        if (!s.equals("com.google.android.gcm.intent.RETRY"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("token");
        if (i.equals(intent))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received invalid token: ").append(intent).toString());
        intent = ((Intent) (d));
        intent;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        Log.v("GCMBaseIntentService", "Releasing wakelock");
        c.release();
_L13:
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
          goto _L13
        if (com.google.android.gcm.b.h(((Context) (obj))))
        {
            com.google.android.gcm.b.e(((Context) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        com.google.android.gcm.b.b(((Context) (obj)), a(((Context) (obj))));
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

    static 
    {
        f = 0;
        g = new Random();
        h = (int)TimeUnit.SECONDS.toMillis(3600L);
        i = Long.toBinaryString(g.nextLong());
    }
}
