// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmReceiver, c

public abstract class GcmListenerService extends Service
{

    private final Object a = new Object();
    private int b;
    private int c;

    public GcmListenerService()
    {
        c = 0;
    }

    private final void a(Intent intent)
    {
        boolean flag = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
        if (!flag)
        {
            GcmReceiver.completeWakefulIntent(intent);
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
        JVM INSTR lookupswitch 4: default 276
    //                   -2062414158: 165
    //                   102161: 150
    //                   814694033: 195
    //                   814800675: 180;
           goto _L1 _L2 _L3 _L4 _L5
_L7:
        Log.w("GcmListenerService", (new StringBuilder()).append("Received message with unknown type: ").append(((String) (obj))).toString());
_L6:
        synchronized (a)
        {
            c = c - 1;
            if (c == 0)
            {
                a(b);
            }
        }
        GcmReceiver.completeWakefulIntent(intent);
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
_L8:
        a(intent.getExtras());
          goto _L6
        obj;
        GcmReceiver.completeWakefulIntent(intent);
        throw obj;
_L9:
        a();
          goto _L6
_L10:
        a(intent.getStringExtra("google.message_id"));
          goto _L6
_L11:
        a(intent.getStringExtra("google.message_id"), intent.getStringExtra("error"));
          goto _L6
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 308
    //                   0 210
    //                   1 229
    //                   2 236
    //                   3 249;
           goto _L7 _L8 _L9 _L10 _L11
    }

    private void a(Bundle bundle)
    {
        bundle.remove("message_type");
        bundle.remove("android.support.content.wakelockid");
        if (com.google.android.gms.gcm.c.a(bundle))
        {
            com.google.android.gms.gcm.c.a(this).b(bundle);
            return;
        } else
        {
            String s = bundle.getString("from");
            bundle.remove("from");
            a(s, bundle);
            return;
        }
    }

    static void a(GcmListenerService gcmlistenerservice, Intent intent)
    {
        gcmlistenerservice.a(intent);
    }

    public void a()
    {
    }

    public void a(String s)
    {
    }

    public void a(String s, Bundle bundle)
    {
    }

    public void a(String s, String s1)
    {
    }

    boolean a(int i)
    {
        return stopSelfResult(i);
    }

    // Unreferenced inner class com/google/android/gms/gcm/GcmListenerService$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final Intent a;
        final GcmListenerService b;

        public void run()
        {
            GcmListenerService.a(b, a);
        }
    }

}
