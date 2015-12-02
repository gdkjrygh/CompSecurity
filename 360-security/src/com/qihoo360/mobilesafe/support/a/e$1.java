// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            e, c

class a extends Handler
{

    final e a;

    public void handleMessage(Message message)
    {
        a a1 = (a)message.obj;
        message.what;
        JVM INSTR tableswitch 200 204: default 48
    //                   200 62
    //                   201 121
    //                   202 135
    //                   203 152
    //                   204 61;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        a1;
        JVM INSTR monitorenter ;
        a1.d = false;
        a1.notify();
        a1;
        JVM INSTR monitorexit ;
_L6:
        return;
_L2:
        if (e.a(a) != null && e.a(a).a() || e.b(a) != null)
        {
            a1.c = true;
        } else
        {
            a1.c = e.a(a, a1.a);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a1.c = e.c(a);
        continue; /* Loop/switch isn't completed */
_L4:
        a1.b = c.a(e.d(a));
        continue; /* Loop/switch isn't completed */
_L5:
        a1.b = c.a(e.e(a));
        if (true) goto _L1; else goto _L7
_L7:
        message;
        a1;
        JVM INSTR monitorexit ;
        throw message;
    }

    (e e1, Looper looper)
    {
        a = e1;
        super(looper);
    }
}
