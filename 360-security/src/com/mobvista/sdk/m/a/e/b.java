// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.a.e:
//            c, a, d

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
        c c1;
        d d1;
        c1 = (c)message.obj;
        if (c1 == null || !c1.c)
        {
            return;
        }
        d1 = (d)com.mobvista.sdk.m.a.e.a.a(a).get(Integer.valueOf(c1.b()));
        message.what;
        JVM INSTR tableswitch 1 2: default 68
    //                   1 74
    //                   2 88;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        if (d1 != null)
        {
            d1.a(c1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (d1 != null)
        {
            d1.b(c1);
        }
        com.mobvista.sdk.m.a.e.a.a(a).remove(Integer.valueOf(c1.b()));
        if (true) goto _L1; else goto _L4
_L4:
    }
}
