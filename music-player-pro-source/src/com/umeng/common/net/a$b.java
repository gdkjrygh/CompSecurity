// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;

// Referenced classes of package com.umeng.common.net:
//            a, k

class  extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        Log.c(com.umeng.common.net.a.b(), (new StringBuilder("DownloadAgent.handleMessage(")).append(message.what).append("): ").toString());
        message.what;
        JVM INSTR tableswitch 3 5: default 220
    //                   3 66
    //                   4 60
    //                   5 136;
           goto _L1 _L2 _L1 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        try
        {
            if (com.umeng.common.net.a.a(a) != null)
            {
                com.umeng.common.net.a.a(a).a(message.arg1);
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            Log.c(com.umeng.common.net.a.b(), (new StringBuilder("DownloadAgent.handleMessage(")).append(message.what).append("): ").append(exception.getMessage()).toString());
            return;
        }
_L3:
        com.umeng.common.net.a.h(a).unbindService(com.umeng.common.net.a.i(a));
        if (com.umeng.common.net.a.a(a) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (message.arg1 == 1)
        {
            com.umeng.common.net.a.a(a).a(message.arg1, message.getData().getString("filename"));
            return;
        }
        com.umeng.common.net.a.a(a).a(0, null);
        Log.c(com.umeng.common.net.a.b(), "DownloadAgent.handleMessage(DownloadingService.DOWNLOAD_COMPLETE_FAIL): ");
        return;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
