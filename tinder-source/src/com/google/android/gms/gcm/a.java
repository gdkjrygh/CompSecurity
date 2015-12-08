// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmReceiver, zza

public abstract class a extends Service
{

    private final Object a = new Object();
    private int b;
    private int c;

    public a()
    {
        c = 0;
    }

    static void a(a a1, Intent intent)
    {
        boolean flag = true;
        boolean flag1 = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
        if (!flag1)
        {
            GcmReceiver.a(intent);
            return;
        }
        obj = intent.getStringExtra("message_type");
        byte byte0;
        if (obj == null)
        {
            obj = "gcm";
        }
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 4: default 329
    //                   -2062414158: 166
    //                   102161: 151
    //                   814694033: 196
    //                   814800675: 181;
           goto _L1 _L2 _L3 _L4 _L5
_L9:
        Log.w("GcmListenerService", (new StringBuilder("Received message with unknown type: ")).append(((String) (obj))).toString());
_L8:
        synchronized (a1.a)
        {
            a1.c = a1.c - 1;
            if (a1.c == 0)
            {
                a1.stopSelfResult(a1.b);
            }
        }
        GcmReceiver.a(intent);
        return;
_L3:
        if (((String) (obj)).equals("gcm"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("deleted_messages"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("send_event"))
        {
            byte0 = 2;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("send_error"))
        {
            byte0 = 3;
        }
          goto _L1
_L10:
        obj = intent.getExtras();
        ((Bundle) (obj)).remove("message_type");
        ((Bundle) (obj)).remove("android.support.content.wakelockid");
        if (zza.a(((Bundle) (obj)), "gcm.n.icon") != null)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        if (byte0 == 0) goto _L7; else goto _L6
_L6:
        zza.a(a1).a(((Bundle) (obj)));
          goto _L8
        a1;
        GcmReceiver.a(intent);
        throw a1;
_L7:
        String s = ((Bundle) (obj)).getString("from");
        ((Bundle) (obj)).remove("from");
        a1.a(s, ((Bundle) (obj)));
          goto _L8
_L11:
        intent.getStringExtra("google.message_id");
          goto _L8
_L12:
        intent.getStringExtra("google.message_id");
        intent.getStringExtra("error");
          goto _L8
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 211
    //                   1 110
    //                   2 294
    //                   3 304;
           goto _L9 _L10 _L8 _L11 _L12
    }

    public void a(String s, Bundle bundle)
    {
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        synchronized (a)
        {
            b = j;
            c = c + 1;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable(intent) {

                final Intent a;
                final a b;

                public final void run()
                {
                    a.a(b, a);
                }

            
            {
                b = a.this;
                a = intent;
                super();
            }
            });
        } else
        {
            (new AsyncTask(intent) {

                final Intent a;
                final a b;

                protected final Object doInBackground(Object aobj[])
                {
                    a.a(b, a);
                    return null;
                }

            
            {
                b = a.this;
                a = intent;
                super();
            }
            }).execute(new Void[0]);
        }
        return 3;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }
}
