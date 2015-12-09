// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.c.b:
//            d, aj, a, aw, 
//            bj

final class ak extends Handler
{

    ak(Looper looper)
    {
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 3: default 40
    //                   3: 117
    //                   8: 67
    //                   13: 163;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(message.what).toString());
_L3:
        message = (List)message.obj;
        int k = message.size();
        for (int i = 0; i < k; i++)
        {
            d d1 = (d)message.get(i);
            d1.b.a(d1);
        }

        break; /* Loop/switch isn't completed */
_L2:
        message = (a)message.obj;
        if (((a) (message)).a.l)
        {
            bj.a("Main", "canceled", ((a) (message)).b.a(), "target got garbage collected");
        }
        aj.a(((a) (message)).a, message.c());
_L6:
        return;
_L4:
        message = (List)message.obj;
        int l = message.size();
        int j = 0;
        while (j < l) 
        {
            a a1 = (a)message.get(j);
            a1.a.b(a1);
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
