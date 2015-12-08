// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.roidapp.baselib.c.aj;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            e

final class f extends Handler
{

    final e a;

    f(e e1, Looper looper)
    {
        a = e1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 41
    //                   1 49
    //                   2 57
    //                   3 89;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        e.a(a);
        return;
_L3:
        e.b(a);
        return;
_L4:
        if (message.obj instanceof Long)
        {
            e.a(a, ((Long)message.obj).longValue(), message.arg1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (message.obj instanceof Intent)
        {
            aj.a().startService((Intent)message.obj);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
