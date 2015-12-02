// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.baidu.android.pushservice:
//            RegistrationReceiver

class ab
    implements Runnable
{

    final String a;
    final Intent b;
    final Context c;
    final RegistrationReceiver d;

    ab(RegistrationReceiver registrationreceiver, String s, Intent intent, Context context)
    {
        d = registrationreceiver;
        a = s;
        b = intent;
        c = context;
        super();
    }

    public void run()
    {
        if (!"com.baidu.android.pushservice.action.BIND_SYNC".equals(a)) goto _L2; else goto _L1
_L1:
        if (!b.hasExtra("r_sync_type")) goto _L4; else goto _L3
_L3:
        b.getIntExtra("r_sync_type", 0);
        JVM INSTR tableswitch 0 3: default 64
    //                   0 65
    //                   1 77
    //                   2 89
    //                   3 101;
           goto _L2 _L5 _L6 _L7 _L8
_L2:
        return;
_L5:
        RegistrationReceiver.access$000(c, b);
        return;
_L6:
        RegistrationReceiver.access$100(c, b);
        return;
_L7:
        RegistrationReceiver.access$200(c, b);
        return;
_L8:
        RegistrationReceiver.access$300(c, b);
        return;
_L4:
        RegistrationReceiver.access$000(c, b);
        return;
    }
}
