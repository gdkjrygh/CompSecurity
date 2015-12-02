// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.app.DaemonMain;

// Referenced classes of package com.qihoo.security.receiver:
//            DaemonReceiver

class a extends Handler
{

    final DaemonReceiver a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        int i = message.arg1;
        if (DaemonMain.a())
        {
            DaemonReceiver.a(a);
            return;
        }
        if (i > 0)
        {
            message = DaemonReceiver.b(a).obtainMessage(0);
            message.arg1 = i - 1;
            DaemonReceiver.b(a).sendMessageDelayed(message, 100L);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (DaemonReceiver daemonreceiver)
    {
        a = daemonreceiver;
        super();
    }
}
