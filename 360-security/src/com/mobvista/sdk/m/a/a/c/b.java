// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.mobvista.sdk.m.a.a.c:
//            a, d

final class b extends Handler
{

    final a a;

    b(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (a.a)
        {
            if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
            {
                com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadCanceled(message.arg1);
            }
            return;
        }
        message.what;
        JVM INSTR tableswitch 100 114: default 116
    //                   100 122
    //                   101 155
    //                   102 116
    //                   103 116
    //                   104 116
    //                   105 116
    //                   106 116
    //                   107 116
    //                   108 116
    //                   109 116
    //                   110 237
    //                   111 268
    //                   112 184
    //                   113 332
    //                   114 395;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L4 _L5 _L6 _L7 _L8
_L1:
        super.handleMessage(message);
        return;
_L2:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadFinish(message.arg1, message.obj);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadStart(message.arg1);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadError(message.arg1, (new StringBuilder("[")).append(message.arg2).append("] Http error.").toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadError(message.arg1, "Connect timeout.");
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            if (message.obj != null)
            {
                com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadError(message.arg1, message.obj.toString());
            } else
            {
                com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadError(message.arg1, "http connect error!");
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadError(message.arg1, (new StringBuilder("[")).append(message.arg2).append("]request api error ! ").append(message.obj.toString()).toString());
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (com.mobvista.sdk.m.a.a.c.a.a(a) != null)
        {
            com.mobvista.sdk.m.a.a.c.a.a(a).OnLoadCanceled(message.arg1);
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}
