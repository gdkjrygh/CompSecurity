// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

class a extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 59
    //                   2 79
    //                   3 87;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(message).toString());
_L2:
        a(a).a(a(a));
_L6:
        return;
_L3:
        a(a);
        return;
_L4:
        if (a(a) != null)
        {
            if (!a(a))
            {
                a(a).a(a(a));
                return;
            } else
            {
                a(a, true);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ( )
    {
        a = ;
        super();
    }

    a(a a1, Handler handler)
    {
        a = a1;
        super(handler.getLooper());
    }
}
