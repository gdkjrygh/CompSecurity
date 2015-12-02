// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.DaemonMain;
import com.qihoo.security.support.b;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.receiver:
//            BootReceiver

public class DaemonReceiver extends BootReceiver
{

    private final Handler a = new Handler() {

        final DaemonReceiver a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 25;
               goto _L1 _L2
_L1:
            return;
_L2:
            int i = message.arg1;
            if (DaemonMain.a())
            {
                com.qihoo.security.receiver.DaemonReceiver.a(a);
                return;
            }
            if (i > 0)
            {
                message = com.qihoo.security.receiver.DaemonReceiver.b(a).obtainMessage(0);
                message.arg1 = i - 1;
                com.qihoo.security.receiver.DaemonReceiver.b(a).sendMessageDelayed(message, 100L);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                a = DaemonReceiver.this;
                super();
            }
    };

    public DaemonReceiver()
    {
    }

    private void a()
    {
        if (c.a(SecurityApplication.a()))
        {
            com.qihoo.security.support.b.b(29001);
            com.qihoo.security.support.b.b();
        }
        a.removeCallbacksAndMessages(null);
    }

    static void a(DaemonReceiver daemonreceiver)
    {
        daemonreceiver.a();
    }

    static Handler b(DaemonReceiver daemonreceiver)
    {
        return daemonreceiver.a;
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        while (intent == null || !"com.qihoo.security.action.DAEMON".equals(intent.getAction())) 
        {
            return;
        }
        com.qihoo360.mobilesafe.b.a.f(context);
        a.removeCallbacksAndMessages(null);
        context = a.obtainMessage(0);
        context.arg1 = 3;
        a.sendMessage(context);
    }
}
