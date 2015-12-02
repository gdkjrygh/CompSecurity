// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.facebook.widget.a:
//            c, a, i

class d extends Handler
{

    final a a;

    public d(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        int j = message.what;
        j;
        JVM INSTR lookupswitch 2: default 36
    //                   -791613427: 37
    //                   -559038737: 209;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        message = (c)message.obj;
        message.c = a.b(((c) (message)).a);
        Message message1 = com.facebook.widget.a.a.a(a).obtainMessage(j);
        message1.obj = message;
        message1.sendToTarget();
_L5:
        synchronized (com.facebook.widget.a.a.b(a))
        {
            if (com.facebook.widget.a.a.c(a) != null)
            {
                Message message2 = com.facebook.widget.a.a.c(a).obtainMessage(0xdeadbeef);
                com.facebook.widget.a.a.c(a).sendMessageDelayed(message2, 3000L);
            }
        }
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj;
        message.c = new i();
        Log.w("Filter", "An exception occured during performFiltering()!", ((Throwable) (obj)));
        Message message3 = com.facebook.widget.a.a.a(a).obtainMessage(j);
        message3.obj = message;
        message3.sendToTarget();
        if (true) goto _L5; else goto _L4
_L4:
        message3;
        Message message4 = com.facebook.widget.a.a.a(a).obtainMessage(j);
        message4.obj = message;
        message4.sendToTarget();
        throw message3;
_L3:
        synchronized (com.facebook.widget.a.a.b(a))
        {
            if (com.facebook.widget.a.a.c(a) != null)
            {
                com.facebook.widget.a.a.c(a).getLooper().quit();
                com.facebook.widget.a.a.a(a, null);
            }
        }
        return;
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
