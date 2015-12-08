// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.squareup.a:
//            d, ak, a, ax, 
//            bm

final class al extends Handler
{

    al(Looper looper)
    {
        super(looper);
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 3: default 40
    //                   3: 120
    //                   8: 70
    //                   13: 166;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(message.what).toString());
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
        if (message.j().l)
        {
            bm.a("Main", "canceled", ((a) (message)).b.a(), "target got garbage collected");
        }
        ak.a(((a) (message)).a, message.d());
_L6:
        return;
_L4:
        message = (List)message.obj;
        int l = message.size();
        int j = 0;
        while (j < l) 
        {
            a a1 = (a)message.get(j);
            a1.a.c(a1);
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
