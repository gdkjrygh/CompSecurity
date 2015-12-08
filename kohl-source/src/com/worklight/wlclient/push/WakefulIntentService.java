// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class WakefulIntentService extends IntentService
{

    private static final String INTENT_SERVICE_TAG = "com.worklight.push.WakefulIntentService";
    private static volatile android.os.PowerManager.WakeLock lockStatic = null;

    public WakefulIntentService(String s)
    {
        super(s);
        setIntentRedelivery(true);
    }

    private static android.os.PowerManager.WakeLock getLock(Context context)
    {
        com/worklight/wlclient/push/WakefulIntentService;
        JVM INSTR monitorenter ;
        if (lockStatic == null)
        {
            lockStatic = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "com.worklight.push.WakefulIntentService");
            lockStatic.setReferenceCounted(true);
        }
        context = lockStatic;
        com/worklight/wlclient/push/WakefulIntentService;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void sendWakefulWork(Context context, Intent intent)
    {
        getLock(context.getApplicationContext()).acquire();
        context.startService(intent);
    }

    public static void sendWakefulWork(Context context, Class class1)
    {
        sendWakefulWork(context, class1, null);
    }

    public static void sendWakefulWork(Context context, Class class1, Map map)
    {
        class1 = new Intent(context, class1);
        if (map != null)
        {
            Bundle bundle = new Bundle();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); bundle.putString(s, (String)map.get(s)))
            {
                s = (String)iterator.next();
            }

            class1.putExtra("com.worklight.push.WakefulIntentService", bundle);
        }
        sendWakefulWork(context, ((Intent) (class1)));
    }

    protected abstract void doWakefulWork(Intent intent, Map map);

    protected final void onHandleIntent(Intent intent)
    {
        Bundle bundle = intent.getBundleExtra("com.worklight.push.WakefulIntentService");
        Object obj = null;
        if (bundle == null) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        Iterator iterator;
        hashmap = new HashMap();
        iterator = ((Bundle)bundle).keySet().iterator();
_L3:
        obj = hashmap;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        hashmap.put(obj, ((Bundle)bundle).getString(((String) (obj))));
        if (true) goto _L3; else goto _L2
        intent;
        obj = getLock(getApplicationContext());
        if (((android.os.PowerManager.WakeLock) (obj)).isHeld())
        {
            ((android.os.PowerManager.WakeLock) (obj)).release();
        }
        throw intent;
_L2:
        doWakefulWork(intent, ((Map) (obj)));
        intent = getLock(getApplicationContext());
        if (((android.os.PowerManager.WakeLock)intent).isHeld())
        {
            ((android.os.PowerManager.WakeLock)intent).release();
        }
        intent = getLock(getApplicationContext());
        if (intent.isHeld())
        {
            intent.release();
        }
        return;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        android.os.PowerManager.WakeLock wakelock = getLock(getApplicationContext());
        if (!wakelock.isHeld() || (i & 1) != 0)
        {
            wakelock.acquire();
        }
        super.onStartCommand(intent, i, j);
        return 3;
    }

}
