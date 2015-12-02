// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.mobvista.sdk.m.a.c:
//            a, d

final class b extends Handler
{

    final a a;

    b(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 5: default 56
    //                   100: 62
    //                   101: 131
    //                   110: 218
    //                   111: 260
    //                   112: 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        super.handleMessage(message);
        return;
_L2:
        if (com.mobvista.sdk.m.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.c.a.a(a).a(com.mobvista.sdk.m.a.c.a.b(a), com.mobvista.sdk.m.a.c.a.c(a), (new StringBuilder()).append(com.mobvista.sdk.m.a.c.a.d(a)).append(com.mobvista.sdk.m.a.c.a.e(a)).toString());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        int i = message.arg1;
        if (com.mobvista.sdk.m.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.c.a.a(a).a(com.mobvista.sdk.m.a.c.a.b(a), com.mobvista.sdk.m.a.c.a.c(a), i);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (com.mobvista.sdk.m.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.c.a.a(a).a(a.b, com.mobvista.sdk.m.a.c.a.b(a), com.mobvista.sdk.m.a.c.a.c(a));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (com.mobvista.sdk.m.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.c.a.a(a).a(a.c, com.mobvista.sdk.m.a.c.a.b(a), com.mobvista.sdk.m.a.c.a.c(a));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (com.mobvista.sdk.m.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.c.a.a(a).a(a.a, com.mobvista.sdk.m.a.c.a.b(a), com.mobvista.sdk.m.a.c.a.c(a));
        }
        if (true) goto _L1; else goto _L7
_L7:
    }
}
