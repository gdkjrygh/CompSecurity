// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class ks extends Handler
{

    private kr a;

    ks(kr kr1)
    {
        a = kr1;
        super();
    }

    ks(kr kr1, Handler handler)
    {
        a = kr1;
        super(handler.getLooper());
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
        kr.b(a).onShowPress(kr.a(a));
_L6:
        return;
_L3:
        kr.c(a);
        return;
_L4:
        if (kr.d(a) != null)
        {
            if (!kr.e(a))
            {
                kr.d(a).onSingleTapConfirmed(kr.a(a));
                return;
            } else
            {
                kr.a(a, true);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
