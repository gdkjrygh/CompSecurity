// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.taplytics:
//            ao

final class ap extends Handler
{

    final ao a;

    ap(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 56
    //                   2 76
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
        ao.b(a).onShowPress(ao.a(a));
_L6:
        return;
_L3:
        ao.c(a);
        return;
_L4:
        if (ao.d(a) != null)
        {
            if (!ao.e(a))
            {
                ao.d(a).onSingleTapConfirmed(ao.a(a));
                return;
            } else
            {
                ao.f(a);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
