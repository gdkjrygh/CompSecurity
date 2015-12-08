// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            o

final class a extends Handler
{

    private o a;

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
        o.b(a).onShowPress(o.a(a));
_L6:
        return;
_L3:
        o.c(a);
        return;
_L4:
        if (o.d(a) != null && !o.e(a))
        {
            o.d(a).onSingleTapConfirmed(o.a(a));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    leTapListener(o o1)
    {
        a = o1;
        super();
    }
}
