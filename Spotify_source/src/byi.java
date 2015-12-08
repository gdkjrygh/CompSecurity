// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.io.IOException;

public final class byi extends Service
{

    private static String a = "google.com/iid";
    private static String b = "CMD";
    private static String c = "gcm.googleapis.com/refresh";
    private int d;
    private int e;

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = d - 1;
        if (d == 0)
        {
            stopSelf(e);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder("Stop ")).append(d).append(" ").append(e).toString());
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

    static void a(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(b, "SYNC");
        context.startService(intent);
    }

    static void a(Context context, byo byo1)
    {
        byo1.b();
        byo1 = new Intent("com.google.android.gms.iid.InstanceID");
        byo1.putExtra(b, "RST");
        byo1.setPackage(context.getPackageName());
        context.startService(byo1);
    }

    public final IBinder onBind(Intent intent)
    {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            throw new NullPointerException();
        } else
        {
            return null;
        }
    }

    public final void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentfilter.addCategory(getPackageName());
        registerReceiver(null, intentfilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public final void onDestroy()
    {
        unregisterReceiver(null);
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        d = d + 1;
        if (j > e)
        {
            e = j;
        }
        this;
        JVM INSTR monitorexit ;
        if (intent == null)
        {
            a();
            return 2;
        }
        break MISSING_BLOCK_LABEL_42;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        Object obj;
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = (Intent)intent.getParcelableExtra("GSF");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        startService(((Intent) (obj)));
        a();
        return 1;
        Object obj1 = intent.getStringExtra("subtype");
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = byh.b(this);
_L7:
        Object obj2 = intent.getStringExtra(b);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L6; else goto _L5
_L5:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder("Register result in service ")).append(((String) (obj1))).toString());
        }
        byh.b().b(intent);
_L2:
        a();
        if (intent.getStringExtra("from") != null)
        {
            byf.a(intent);
        }
        return 2;
_L4:
        obj = new Bundle();
        ((Bundle) (obj)).putString("subtype", ((String) (obj1)));
        obj = byh.a(this, ((Bundle) (obj)));
          goto _L7
_L6:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder("Service command ")).append(((String) (obj1))).append(" ").append(((String) (obj2))).append(" ").append(intent.getExtras()).toString());
        }
        if (intent.getStringExtra("unregistered") == null)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        obj2 = byh.a();
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        ((byo) (obj2)).c(((String) (obj)));
        byh.b().b(intent);
          goto _L2
        intent;
        a();
        throw intent;
label0:
        {
            if (!c.equals(intent.getStringExtra("from")))
            {
                break label0;
            }
            byh.a().c(((String) (obj1)));
        }
          goto _L2
label1:
        {
            if (!"RST".equals(obj2))
            {
                break label1;
            }
            obj.d = 0L;
            obj1 = byh.a;
            obj2 = ((byh) (obj)).c;
            ((byo) (obj1)).b((new StringBuilder()).append(((String) (obj2))).append("|").toString());
            obj.b = null;
        }
          goto _L2
label2:
        {
            if (!"RST_FULL".equals(obj2))
            {
                break label2;
            }
            if (!byh.a().a())
            {
                byh.a().b();
            }
        }
          goto _L2
label3:
        {
            if (!"SYNC".equals(obj2))
            {
                break label3;
            }
            byh.a().c(((String) (obj1)));
        }
          goto _L2
        boolean flag = "PING".equals(obj2);
        if (!flag) goto _L2; else goto _L8
_L8:
        byg.a(this).a(a, byn.a(), intent.getExtras());
          goto _L2
        IOException ioexception;
        ioexception;
        Log.w("InstanceID", "Failed to send ping response");
          goto _L2
    }

}
