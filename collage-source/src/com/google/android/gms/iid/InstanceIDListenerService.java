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
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import com.google.android.gms.gcm.a;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat, e, d, a

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
        zzaAV = new MessengerCompat(new Handler(Looper.getMainLooper()) {

            final InstanceIDListenerService a;

            public void handleMessage(Message message)
            {
                InstanceIDListenerService.zza(a, message, com.google.android.gms.iid.MessengerCompat.a(message));
            }

            
            {
                a = InstanceIDListenerService.this;
                super(looper);
            }
        });
        zzaAW = new BroadcastReceiver() {

            final InstanceIDListenerService a;

            public void onReceive(Context context, Intent intent)
            {
                if (Log.isLoggable("InstanceID", 3))
                {
                    intent.getStringExtra("registration_id");
                    Log.d("InstanceID", (new StringBuilder()).append("Received GSF callback using dynamic receiver: ").append(intent.getExtras()).toString());
                }
                a.zzn(intent);
                a.stop();
            }

            
            {
                a = InstanceIDListenerService.this;
                super();
            }
        };
    }

    static void zza(Context context, e e1)
    {
        e1.b();
        e1 = new Intent("com.google.android.gms.iid.InstanceID");
        e1.putExtra(zzaAY, "RST");
        e1.setPackage(context.getPackageName());
        context.startService(e1);
    }

    private void zza(Message message, int i)
    {
        com.google.android.gms.iid.d.a(this);
        getPackageManager();
        if (i != d.c && i != d.b)
        {
            Log.w("InstanceID", (new StringBuilder()).append("Message from unexpected caller ").append(i).append(" mine=").append(d.b).append(" appid=").append(d.c).toString());
            return;
        } else
        {
            zzn((Intent)message.obj);
            return;
        }
    }

    static void zza(InstanceIDListenerService instanceidlistenerservice, Message message, int i)
    {
        instanceidlistenerservice.zza(message, i);
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

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzgz(j);
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
            Log.d("InstanceID", (new StringBuilder()).append("Stop ").append(zzaAZ).append(" ").append(zzaBa).toString());
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

    void zzgz(int i)
    {
        this;
        JVM INSTR monitorenter ;
        zzaAZ = zzaAZ + 1;
        if (i > zzaBa)
        {
            zzaBa = i;
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
        String s1;
        s1 = intent.getStringExtra("subtype");
        if (s1 == null)
        {
            obj = a.b(this);
        } else
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("subtype", s1);
            obj = com.google.android.gms.iid.a.a(this, ((Bundle) (obj)));
        }
        s = intent.getStringExtra(zzaAY);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder()).append("Register result in service ").append(s1).toString());
        }
        ((com.google.android.gms.iid.a) (obj)).d().d(intent);
_L4:
        return;
_L2:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder()).append("Service command ").append(s1).append(" ").append(s).append(" ").append(intent.getExtras()).toString());
        }
        if (intent.getStringExtra("unregistered") != null)
        {
            e e1 = ((com.google.android.gms.iid.a) (obj)).c();
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
            e1.e(s);
            ((com.google.android.gms.iid.a) (obj)).d().d(intent);
            return;
        }
        if (zzazM.equals(intent.getStringExtra("from")))
        {
            ((com.google.android.gms.iid.a) (obj)).c().e(s1);
            zzaf(false);
            return;
        }
        if ("RST".equals(s))
        {
            ((com.google.android.gms.iid.a) (obj)).b();
            zzaf(true);
            return;
        }
        if (!"RST_FULL".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((com.google.android.gms.iid.a) (obj)).c().a())
        {
            ((com.google.android.gms.iid.a) (obj)).c().b();
            zzaf(true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("SYNC".equals(s))
        {
            ((com.google.android.gms.iid.a) (obj)).c().e(s1);
            zzaf(false);
            return;
        }
        if ("PING".equals(s))
        {
            try
            {
                a.a(this).a(zzaAX, d.b(), 0L, intent.getExtras());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.w("InstanceID", "Failed to send ping response");
            }
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
