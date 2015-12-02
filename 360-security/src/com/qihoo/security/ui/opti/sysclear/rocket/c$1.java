// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            c

class a extends Handler
{

    final c a;

    public void handleMessage(Message message)
    {
        if (!c.e(a)) goto _L2; else goto _L1
_L1:
        int i = message.what;
        i;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 41
    //                   2 73;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        c.f(a);
        sendEmptyMessageDelayed(i, (long)((float)c.a(a) / (float)c.g(a)));
        return;
_L4:
        if (c.h(a))
        {
            sendEmptyMessageDelayed(i, 1000 / c.i(a));
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
