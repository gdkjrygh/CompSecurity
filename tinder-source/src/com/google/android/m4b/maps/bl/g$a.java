// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            g

final class a extends Handler
{

    private g a;

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 74
    //                   2 94
    //                   3 102;
           goto _L1 _L2 _L3 _L4
_L1:
        message = String.valueOf(message);
        throw new RuntimeException((new StringBuilder(String.valueOf(message).length() + 16)).append("Unknown message ").append(message).toString());
_L2:
        g.b(a).onShowPress(g.a(a));
_L6:
        return;
_L3:
        g.c(a);
        return;
_L4:
        if (g.d(a) != null && !g.e(a))
        {
            g.d(a).onSingleTapConfirmed(g.a(a));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    leTapListener(g g1, Handler handler)
    {
        a = g1;
        super(handler.getLooper());
    }
}
