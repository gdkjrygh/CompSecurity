// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.a.a;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.qihoo.security.a.a:
//            a

class a extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        com.qihoo.security.a.a.a.a(a);
        JVM INSTR tableswitch 1 3: default 32
    //                   1 76
    //                   2 93
    //                   3 122;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!com.qihoo.security.a.a.a.b(a).isEmpty())
        {
            com.qihoo.security.a.a.a.c(a).sendMessageDelayed(com.qihoo.security.a.a.a.c(a).obtainMessage(), com.qihoo.security.a.a.a.d(a));
        }
        return;
_L2:
        com.qihoo.security.a.a.a.a(a, com.qihoo.security.a.a.a.b(a));
        continue; /* Loop/switch isn't completed */
_L3:
        com.qihoo.security.a.a.a.a(a, com.qihoo.security.a.a.a.b(a), com.qihoo.security.a.a.a.b(a).size());
        continue; /* Loop/switch isn't completed */
_L4:
        com.qihoo.security.a.a.a.b(a, com.qihoo.security.a.a.a.b(a), com.qihoo.security.a.a.a.b(a).size());
        if (true) goto _L1; else goto _L5
_L5:
    }

    ngQueue(a a1)
    {
        a = a1;
        super();
    }
}
