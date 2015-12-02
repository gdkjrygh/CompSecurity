// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.booster.a;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.notify:
//            a

class a extends Handler
{

    final com.qihoo.security.notify.a a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 38
    //                   2 48
    //                   3 91;
           goto _L1 _L2 _L3 _L4
_L1:
        super.handleMessage(message);
        return;
_L2:
        com.qihoo.security.notify.a.a(a);
        continue; /* Loop/switch isn't completed */
_L3:
        com.qihoo.security.ui.exam.MainAnim.ExamStatus examstatus = com.qihoo.security.booster.a.a(message.arg1);
        com.qihoo.utils.notice.a a1 = com.qihoo.utils.notice.a.a();
        a1.b(4102);
        a1.a(examstatus);
        SharedPref.a(com.qihoo.security.notify.a.b(a), "sp_key_last_nofity_booster", System.currentTimeMillis());
        continue; /* Loop/switch isn't completed */
_L4:
        SharedPref.a(com.qihoo.security.notify.a.b(a), "sp_key_last_nofity_booster", System.currentTimeMillis());
        if (true) goto _L1; else goto _L5
_L5:
    }

    SharedPref(com.qihoo.security.notify.a a1)
    {
        a = a1;
        super();
    }
}
