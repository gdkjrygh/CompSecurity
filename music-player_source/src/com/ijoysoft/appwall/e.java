// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.ijoysoft.appwall:
//            h, g, d

final class e extends Handler
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 30;
           goto _L1 _L2
_L1:
        super.handleMessage(message);
        return;
_L2:
        h h1 = (h)message.obj;
        h.a(h1).a(h.b(h1), h.c(h1));
        if (true) goto _L1; else goto _L3
_L3:
    }
}
