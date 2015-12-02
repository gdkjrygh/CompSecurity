// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            e, c

class a extends Handler
{

    final e a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 127;
           goto _L1 _L2
_L1:
        e.b(a);
        if (e.c(a) != null)
        {
            e.c(a).setColor(e.d(a));
        }
        if (e.a(a) > 20) goto _L4; else goto _L3
_L3:
        message = a.a.obtainMessage();
        message.arg1 = e.e(a);
        message.arg2 = e.f(a);
        message.what = 1;
        a.a.sendMessageDelayed(message, 50L);
_L6:
        return;
_L2:
        e.a(a, c.a((float)e.a(a) * 0.05F, new int[] {
            message.arg1, message.arg2
        }));
        continue; /* Loop/switch isn't completed */
_L4:
        if (e.c(a) == null) goto _L6; else goto _L5
_L5:
        e.c(a).a(e.d(a));
        return;
        if (true) goto _L1; else goto _L7
_L7:
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
