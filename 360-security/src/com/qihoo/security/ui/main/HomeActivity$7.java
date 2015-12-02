// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qihoo.security.adv.a.a;
import com.qihoo.security.appbox.core.d;
import com.qihoo360.mobilesafe.b.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a extends Handler
{

    final HomeActivity a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 32
    //                   1 32
    //                   2 33;
           goto _L1 _L1 _L1 _L2
_L1:
        return;
_L2:
        b.a();
        com.qihoo.security.adv.a.a.a().b();
        com.qihoo.security.adv.a.a.a().a(com.qihoo.security.adv.AdvType.FaceBookAdvData);
        if (d.a().b())
        {
            com.qihoo.security.ui.main.HomeActivity.b(a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ype(HomeActivity homeactivity, Looper looper)
    {
        a = homeactivity;
        super(looper);
    }
}
