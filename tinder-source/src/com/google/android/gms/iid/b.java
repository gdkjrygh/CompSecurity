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
import java.io.IOException;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat, f, e, a

public class b extends Service
{

    static String a = "action";
    private static String f = "google.com/iid";
    private static String g = "CMD";
    private static String h = "gcm.googleapis.com/refresh";
    MessengerCompat b;
    BroadcastReceiver c;
    int d;
    int e;

    public b()
    {
        b = new MessengerCompat(new Handler(Looper.getMainLooper()) {

            final b a;

            public final void handleMessage(Message message)
            {
                b.a(a, message, MessengerCompat.a(message));
            }

            
            {
                a = b.this;
                super(looper);
            }
        });
        c = new BroadcastReceiver() {

            final b a;

            public final void onReceive(Context context, Intent intent)
            {
                if (Log.isLoggable("InstanceID", 3))
                {
                    intent.getStringExtra("registration_id");
                    Log.d("InstanceID", (new StringBuilder("Received GSF callback using dynamic receiver: ")).append(intent.getExtras()).toString());
                }
                a.a(intent);
                a.a();
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    static void a(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(g, "SYNC");
        context.startService(intent);
    }

    static void a(Context context, f f1)
    {
        f1.b();
        f1 = new Intent("com.google.android.gms.iid.InstanceID");
        f1.putExtra(g, "RST");
        f1.setPackage(context.getPackageName());
        context.startService(f1);
    }

    static void a(b b1, Message message, int i)
    {
        com.google.android.gms.iid.e.a(b1);
        b1.getPackageManager();
        if (i != e.c && i != e.b)
        {
            Log.w("InstanceID", (new StringBuilder("Message from unexpected caller ")).append(i).append(" mine=").append(e.b).append(" appid=").append(e.c).toString());
            return;
        } else
        {
            b1.a((Intent)message.obj);
            return;
        }
    }

    final void a()
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

    public final void a(Intent intent)
    {
        Object obj;
        String s;
        Object obj1;
        s = intent.getStringExtra("subtype");
        if (s == null)
        {
            obj = com.google.android.gms.iid.a.b(this);
        } else
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("subtype", s);
            obj = com.google.android.gms.iid.a.a(this, ((Bundle) (obj)));
        }
        obj1 = intent.getStringExtra(g);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder("Register result in service ")).append(s).toString());
        }
        com.google.android.gms.iid.a.d().b(intent);
_L4:
        return;
_L2:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder("Service command ")).append(s).append(" ").append(((String) (obj1))).append(" ").append(intent.getExtras()).toString());
        }
        if (intent.getStringExtra("unregistered") != null)
        {
            obj1 = com.google.android.gms.iid.a.c();
            if (s == null)
            {
                obj = "";
            } else
            {
                obj = s;
            }
            ((f) (obj1)).c(((String) (obj)));
            com.google.android.gms.iid.a.d().b(intent);
            return;
        }
        if (h.equals(intent.getStringExtra("from")))
        {
            com.google.android.gms.iid.a.c().c(s);
            b();
            return;
        }
        if ("RST".equals(obj1))
        {
            ((a) (obj)).b();
            b();
            return;
        }
        if (!"RST_FULL".equals(obj1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.google.android.gms.iid.a.c().a())
        {
            com.google.android.gms.iid.a.c().b();
            b();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("SYNC".equals(obj1))
        {
            com.google.android.gms.iid.a.c().c(s);
            b();
            return;
        }
        if ("PING".equals(obj1))
        {
            try
            {
                com.google.android.gms.gcm.b.a(this).a(f, com.google.android.gms.iid.e.a(), intent.getExtras());
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

    public void b()
    {
    }

    public IBinder onBind(Intent intent)
    {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            return b.a();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentfilter.addCategory(getPackageName());
        registerReceiver(c, intentfilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy()
    {
        unregisterReceiver(c);
    }

    public int onStartCommand(Intent intent, int i, int j)
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
        Intent intent1;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        intent1 = (Intent)intent.getParcelableExtra("GSF");
        if (intent1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        startService(intent1);
        a();
        return 1;
        a(intent);
        a();
        if (intent.getStringExtra("from") != null)
        {
            GcmReceiver.a(intent);
        }
        return 2;
        intent;
        a();
        throw intent;
    }

}
