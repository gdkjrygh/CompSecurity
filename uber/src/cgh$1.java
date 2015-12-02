// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

final class d.os.Looper extends Handler
{

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
            cfh cfh1 = (cfh)message.get(i);
            cfh1.b.a(cfh1);
        }

        break; /* Loop/switch isn't completed */
_L2:
        message = (cfe)message.obj;
        if (message.j().l)
        {
            chf.a("Main", "canceled", ((cfe) (message)).b.a(), "target got garbage collected");
        }
        cgh.a(((cfe) (message)).a, message.d());
_L6:
        return;
_L4:
        message = (List)message.obj;
        int l = message.size();
        int j = 0;
        while (j < l) 
        {
            cfe cfe1 = (cfe)message.get(j);
            cfe1.a.b(cfe1);
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    (Looper looper)
    {
        super(looper);
    }
}
