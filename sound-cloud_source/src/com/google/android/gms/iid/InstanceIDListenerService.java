// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat, b, c, i, 
//            g, a

public class InstanceIDListenerService extends Service
{

    static String ACTION = "action";
    private static String zzaAX = "google.com/iid";
    private static String zzaAY = "CMD";
    private static String zzazM = "gcm.googleapis.com/refresh";
    MessengerCompat zzaAV;
    BroadcastReceiver zzaAW;
    int zzaAZ;
    int zzaBa;

    public InstanceIDListenerService()
    {
        zzaAV = new MessengerCompat(new b(this, Looper.getMainLooper()));
        zzaAW = new c(this);
    }

    static void zza(Context context, i j)
    {
        j.b();
        j = new Intent("com.google.android.gms.iid.InstanceID");
        j.putExtra(zzaAY, "RST");
        j.setPackage(context.getPackageName());
        context.startService(j);
    }

    private void zza(Message message, int j)
    {
        g.a(this);
        getPackageManager();
        if (j != g.c && j != g.b)
        {
            (new StringBuilder("Message from unexpected caller ")).append(j).append(" mine=").append(g.b).append(" appid=").append(g.c);
            return;
        } else
        {
            zzn((Intent)message.obj);
            return;
        }
    }

    static void zza(InstanceIDListenerService instanceidlistenerservice, Message message, int j)
    {
        instanceidlistenerservice.zza(message, j);
    }

    static void zzaC(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(zzaAY, "SYNC");
        context.startService(intent);
    }

    public IBinder onBind(Intent intent)
    {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            return zzaAV.a();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentfilter.addCategory(getPackageName());
        registerReceiver(zzaAW, intentfilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy()
    {
        unregisterReceiver(zzaAW);
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        zzgz(k);
        if (intent == null)
        {
            stop();
            return 2;
        }
        Intent intent1;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        intent1 = (Intent)intent.getParcelableExtra("GSF");
        if (intent1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        startService(intent1);
        stop();
        return 1;
        zzn(intent);
        stop();
        if (intent.getStringExtra("from") != null)
        {
            GcmReceiver.completeWakefulIntent(intent);
        }
        return 2;
        intent;
        stop();
        throw intent;
    }

    public void onTokenRefresh()
    {
    }

    void stop()
    {
        this;
        JVM INSTR monitorenter ;
        zzaAZ = zzaAZ - 1;
        if (zzaAZ == 0)
        {
            stopSelf(zzaBa);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
            (new StringBuilder("Stop ")).append(zzaAZ).append(" ").append(zzaBa);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzaf(boolean flag)
    {
        onTokenRefresh();
    }

    void zzgz(int j)
    {
        this;
        JVM INSTR monitorenter ;
        zzaAZ = zzaAZ + 1;
        if (j > zzaBa)
        {
            zzaBa = j;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzn(Intent intent)
    {
        Object obj;
        String s;
        Object obj1;
        s = intent.getStringExtra("subtype");
        if (s == null)
        {
            obj = a.b(this);
        } else
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("subtype", s);
            obj = a.a(this, ((Bundle) (obj)));
        }
        obj1 = intent.getStringExtra(zzaAY);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L2; else goto _L1
_L1:
        Log.isLoggable("InstanceID", 3);
        a.c().b(intent);
_L4:
        return;
_L2:
        if (Log.isLoggable("InstanceID", 3))
        {
            (new StringBuilder("Service command ")).append(s).append(" ").append(((String) (obj1))).append(" ").append(intent.getExtras());
        }
        if (intent.getStringExtra("unregistered") != null)
        {
            obj1 = a.b();
            if (s == null)
            {
                obj = "";
            } else
            {
                obj = s;
            }
            ((i) (obj1)).c(((String) (obj)));
            a.c().b(intent);
            return;
        }
        if (zzazM.equals(intent.getStringExtra("from")))
        {
            a.b().c(s);
            zzaf(false);
            return;
        }
        if ("RST".equals(obj1))
        {
            ((a) (obj)).a();
            zzaf(true);
            return;
        }
        if (!"RST_FULL".equals(obj1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a.b().a())
        {
            a.b().b();
            zzaf(true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("SYNC".equals(obj1))
        {
            a.b().c(s);
            zzaf(false);
            return;
        }
        if ("PING".equals(obj1))
        {
            try
            {
                GoogleCloudMessaging.getInstance(this).send(zzaAX, g.a(), 0L, intent.getExtras());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
