// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.wearable:
//            c, i, o, u, 
//            d, k, l

public abstract class WearableListenerService extends Service
    implements c, i, o
{

    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private String zzFO;
    private volatile int zzPm;
    private IBinder zzPp;
    private Handler zzaFF;
    private Object zzaFG;
    private boolean zzaFH;

    public WearableListenerService()
    {
        zzPm = -1;
        zzaFG = new Object();
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzFO;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
    {
        wearablelistenerservice.zzuZ();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaFG;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaFH;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaFF;
    }

    private void zzuZ()
    {
        int j = Binder.getCallingUid();
        if (j == zzPm)
        {
            return;
        }
        if (e.a(this, j))
        {
            zzPm = j;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzPp;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder("onCreate: ")).append(getPackageName()).toString());
        }
        zzFO = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaFF = new Handler(handlerthread.getLooper());
        zzPp = new u(this, (byte)0);
    }

    public void onDataChanged(d d)
    {
    }

    public void onDestroy()
    {
        synchronized (zzaFG)
        {
            zzaFH = true;
            zzaFF.getLooper().quit();
        }
        super.onDestroy();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onMessageReceived(k k)
    {
    }

    public void onPeerConnected(l l)
    {
    }

    public void onPeerDisconnected(l l)
    {
    }
}
