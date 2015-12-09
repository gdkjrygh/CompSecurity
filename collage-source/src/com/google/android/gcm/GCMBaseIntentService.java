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
//            a

public abstract class GCMBaseIntentService extends IntentService
{

    private static android.os.PowerManager.WakeLock a;
    private static final Object b = com/google/android/gcm/GCMBaseIntentService;
    private static int d = 0;
    private static final Random e;
    private static final int f;
    private static final String g;
    private final String c[];

    protected GCMBaseIntentService()
    {
        this(a("DynamicSenderIds"), null);
    }

    private GCMBaseIntentService(String s, String as[])
    {
        super(s);
        c = as;
    }

    protected transient GCMBaseIntentService(String as[])
    {
        this(a(as), as);
    }

    private static String a(String s)
    {
        s = (new StringBuilder()).append("GCMIntentService-").append(s).append("-");
        int i = d + 1;
        d = i;
        s = s.append(i).toString();
        Log.v("GCMBaseIntentService", (new StringBuilder()).append("Intent service name: ").append(s).toString());
        return s;
    }

    private static String a(String as[])
    {
        return a(com.google.android.gcm.a.a(as));
    }

    static void a(Context context, Intent intent, String s)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        a.acquire();
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
        com.google.android.gcm.a.a();
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        Log.d("GCMBaseIntentService", (new StringBuilder()).append("handleRegistration: registrationId = ").append(s).append(", error = ").append(s1).append(", unregistered = ").append(intent).toString());
        if (s != null)
        {
            com.google.android.gcm.a.i(context);
            com.google.android.gcm.a.a(context, s);
            a(context, s);
        } else
        {
            if (intent != null)
            {
                com.google.android.gcm.a.i(context);
                b(context, com.google.android.gcm.a.g(context));
                return;
            }
            Log.d("GCMBaseIntentService", (new StringBuilder()).append("Registration error: ").append(s1).toString());
            if ("SERVICE_NOT_AVAILABLE".equals(s1))
            {
                if (d(context, s1))
                {
                    int i = com.google.android.gcm.a.j(context);
                    int j = i / 2;
                    j = e.nextInt(i) + j;
                    Log.d("GCMBaseIntentService", (new StringBuilder()).append("Scheduling registration retry, backoff = ").append(j).append(" (").append(i).append(")").toString());
                    intent = new Intent("com.google.android.gcm.intent.RETRY");
                    intent.putExtra("token", g);
                    intent = PendingIntent.getBroadcast(context, 0, intent, 0);
                    ((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)j, intent);
                    if (i < f)
                    {
                        com.google.android.gcm.a.a(context, i * 2);
                        return;
                    }
                } else
                {
                    Log.d("GCMBaseIntentService", "Not retrying failed operation");
                    return;
                }
            } else
            {
                c(context, s1);
                return;
            }
        }
    }

    protected void a(Context context, int i)
    {
    }

    protected abstract void a(Context context, Intent intent);

    protected abstract void a(Context context, String s);

    protected String[] a(Context context)
    {
        if (c == null)
        {
            throw new IllegalStateException("sender id not set on constructor");
        } else
        {
            return c;
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
        if (intent == null)
        {
            return;
        }
        Object obj;
        Object obj1;
        obj = getApplicationContext();
        obj1 = intent.getAction();
        if (!((String) (obj1)).equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
_L1:
        com.google.android.gcm.a.d(((Context) (obj)));
        b(((Context) (obj)), intent);
_L14:
        intent = ((Intent) (b));
        intent;
        JVM INSTR monitorenter ;
        obj = a;
        if (obj == null) goto _L4; else goto _L3
_L3:
        Exception exception;
        try
        {
            a.release();
        }
        catch (Throwable throwable) { }
        intent;
        JVM INSTR monitorexit ;
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (!((String) (obj1)).equals("com.google.android.c2dm.intent.RECEIVE")) goto _L6; else goto _L5
_L5:
        obj1 = intent.getStringExtra("message_type");
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (!((String) (obj1)).equals("deleted_messages")) goto _L10; else goto _L9
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
            a(((Context) (obj)), i);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            intent = ((Intent) (b));
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("GCM returned invalid number of deleted messages: ").append(intent).toString());
        continue; /* Loop/switch isn't completed */
        JVM INSTR monitorenter ;
        obj1 = a;
        if (obj1 == null) goto _L12; else goto _L11
_L11:
        try
        {
            a.release();
        }
        catch (Throwable throwable2) { }
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received unknown special message: ").append(((String) (obj1))).toString());
        continue; /* Loop/switch isn't completed */
_L8:
        a(((Context) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L6:
        if (!((String) (obj1)).equals("com.google.android.gcm.intent.RETRY"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("token");
        if (g.equals(intent))
        {
            break MISSING_BLOCK_LABEL_335;
        }
        Log.e("GCMBaseIntentService", (new StringBuilder()).append("Received invalid token: ").append(intent).toString());
        intent = ((Intent) (b));
        intent;
        JVM INSTR monitorenter ;
        obj = a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        try
        {
            a.release();
        }
        catch (Throwable throwable1) { }
        intent;
        JVM INSTR monitorexit ;
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
        break MISSING_BLOCK_LABEL_315;
        if (com.google.android.gcm.a.f(((Context) (obj))))
        {
            com.google.android.gcm.a.b(((Context) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        com.google.android.gcm.a.b(((Context) (obj)), a(((Context) (obj))));
        continue; /* Loop/switch isn't completed */
_L4:
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
        break MISSING_BLOCK_LABEL_55;
_L12:
        Log.e("GCMBaseIntentService", "Wakelock reference is null");
        break MISSING_BLOCK_LABEL_201;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static 
    {
        e = new Random();
        f = (int)TimeUnit.SECONDS.toMillis(3600L);
        g = Long.toBinaryString(e.nextLong());
    }
}
