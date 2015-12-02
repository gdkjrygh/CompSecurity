// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.support.a;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.AdvData;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            AdvLoadingActivity

static class a extends Handler
{

    final WeakReference a;

    public void handleMessage(Message message)
    {
        Object obj;
        AdvLoadingActivity advloadingactivity;
        int i;
        advloadingactivity = (AdvLoadingActivity)a.get();
        if (advloadingactivity == null)
        {
            return;
        }
        i = -1;
        obj = null;
        message.what;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 95
    //                   1 104;
           goto _L1 _L2 _L3
_L1:
        message = obj;
_L5:
        b.a(25011, advloadingactivity.c.adid, String.valueOf(i), message);
        com.qihoo.security.support.a.b(advloadingactivity.getApplicationContext(), advloadingactivity.c.pkg, advloadingactivity.c.openUrl);
        advloadingactivity.finish();
        return;
_L2:
        i = 0;
        message = "30s timeout";
        continue; /* Loop/switch isn't completed */
_L3:
        i = message.arg1;
        message = (String)message.obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    (AdvLoadingActivity advloadingactivity)
    {
        a = new WeakReference(advloadingactivity);
    }
}
