// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nokia.push;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.nokia.push:
//            b, c, a

public abstract class PushBaseIntentService extends IntentService
{

    private static final Object LOCK = com/nokia/push/PushBaseIntentService;
    private static final int MAX_BACKOFF_MS;
    private static final String WAKELOCK_KEY = "NPN_LIB";
    private static int sCounter = 0;
    private static final Random sRandom = new Random();
    private static android.os.PowerManager.WakeLock sWakeLock;
    private final b mLogger;
    private final String mSenderIds[];

    protected PushBaseIntentService()
    {
        this(getName("DynamicSenderIds"), null);
    }

    private PushBaseIntentService(String s, String as[])
    {
        super(s);
        mLogger = new b("PushBaseIntentService", (new StringBuilder("[")).append(getClass().getName()).append("]: ").toString());
        mSenderIds = as;
        mLogger.a(2, "Intent service name: %s", new Object[] {
            s
        });
    }

    protected transient PushBaseIntentService(String as[])
    {
        this(getName(as), as);
    }

    private static String getName(String s)
    {
        s = (new StringBuilder("PushIntentService-")).append(s).append("-");
        int i = sCounter + 1;
        sCounter = i;
        return s.append(i).toString();
    }

    private static String getName(String as[])
    {
        return getName(c.a(as));
    }

    private void handleRegistration(Context context, Intent intent)
    {
        c.a();
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        mLogger.a(3, "handleRegistration: registrationId = %s, error = %s, unregistered = %s", new Object[] {
            s, s1, intent
        });
        if (s != null)
        {
            c.h(context);
            c.b(context, s);
            onRegistered(context, s);
        } else
        {
            if (intent != null)
            {
                c.h(context);
                onUnregistered(context, c.g(context));
                return;
            }
            if ("SERVICE_NOT_AVAILABLE".equals(s1))
            {
                if (onRecoverableError(context, s1))
                {
                    int i = c.i(context);
                    int j = i / 2 + sRandom.nextInt(i);
                    mLogger.a(3, "Scheduling registration retry, backoff = %d (%d)", new Object[] {
                        Integer.valueOf(j), Integer.valueOf(i)
                    });
                    intent = new Intent("com.nokia.push.intent.RETRY");
                    intent.setPackage(context.getPackageName());
                    intent = PendingIntent.getBroadcast(context, 0, intent, 0);
                    ((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)j, intent);
                    if (i < MAX_BACKOFF_MS)
                    {
                        c.a(context, i * 2);
                        return;
                    }
                } else
                {
                    mLogger.a(2, "Not retrying failed operation", new Object[0]);
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
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "NPN_LIB");
            }
        }
        sWakeLock.acquire();
        intent.setClassName(context, s);
        context.startService(intent);
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    protected String[] getSenderIds(Context context)
    {
        if (mSenderIds == null)
        {
            throw new IllegalStateException("sender id not set on constructor");
        } else
        {
            return mSenderIds;
        }
    }

    protected void onDeletedMessages(Context context, int i)
    {
    }

    protected abstract void onError(Context context, String s);

    public final void onHandleIntent(Intent intent)
    {
        int i = 1;
        Object obj;
        String s;
        obj = getApplicationContext();
        s = intent.getAction();
        if (!s.equals(a.e)) goto _L2; else goto _L1
_L1:
        c.e(((Context) (obj)));
        handleRegistration(((Context) (obj)), intent);
_L17:
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null) goto _L4; else goto _L3
_L3:
        sWakeLock.release();
_L14:
        return;
_L2:
        if (!s.equals(a.f)) goto _L6; else goto _L5
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
            i = Integer.parseInt(intent);
            mLogger.a(2, "Received notification for %d deleted messages", new Object[] {
                Integer.valueOf(i)
            });
            onDeletedMessages(((Context) (obj)), i);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            intent = ((Intent) (LOCK));
        }
        mLogger.a(6, "Push Notifications returned invalid number of deleted messages (%d)", new Object[] {
            intent
        });
        continue; /* Loop/switch isn't completed */
        JVM INSTR monitorenter ;
        if (sWakeLock == null) goto _L12; else goto _L11
_L11:
        sWakeLock.release();
_L15:
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        mLogger.a(6, "Received unknown special message: %s", new Object[] {
            s
        });
        continue; /* Loop/switch isn't completed */
_L8:
        onMessage(((Context) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L6:
        if (!s.equals("com.nokia.push.intent.RETRY"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getPackage();
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (intent.equals(getApplicationContext().getPackageName()))
        {
            break MISSING_BLOCK_LABEL_313;
        }
        mLogger.a(6, "Ignoring retry intent from another package (%s)", new Object[] {
            intent
        });
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        sWakeLock.release();
_L13:
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        mLogger.a(6, "Wakelock reference is null", new Object[0]);
          goto _L13
        Exception exception;
        if (c.f(((Context) (obj))).length() <= 0)
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        c.d(((Context) (obj)));
        continue; /* Loop/switch isn't completed */
        c.b(((Context) (obj)), getSenderIds(((Context) (obj))));
        continue; /* Loop/switch isn't completed */
_L4:
        mLogger.a(6, "Wakelock reference is null", new Object[0]);
          goto _L14
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L12:
        mLogger.a(6, "Wakelock reference is null", new Object[0]);
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
        MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
    }
}
