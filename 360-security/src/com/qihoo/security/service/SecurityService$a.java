// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;

// Referenced classes of package com.qihoo.security.service:
//            SecurityService, b, c

private final class a extends Handler
{

    final SecurityService a;

    public void a(int i, Object obj)
    {
        sendMessage(obtainMessage(i, obj));
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 50
    //                   1 90
    //                   2 119
    //                   3 159
    //                   4 188
    //                   5 284;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        super.handleMessage(message);
_L9:
        return;
_L2:
        if (!SecurityService.a(a).register((b)message.obj)) goto _L9; else goto _L8
_L8:
        SecurityService.b(a);
        a(SecurityService.c(a), true);
        return;
_L3:
        if (!SecurityService.a(a).unregister((b)message.obj)) goto _L9; else goto _L10
_L10:
        SecurityService.d(a);
        return;
_L4:
        if (!SecurityService.e(a).register((c)message.obj)) goto _L9; else goto _L11
_L11:
        SecurityService.f(a);
        b(SecurityService.c(a), true);
        return;
_L5:
        if (!SecurityService.e(a).unregister((c)message.obj)) goto _L9; else goto _L12
_L12:
        SecurityService.g(a);
        return;
_L6:
        int i = SecurityService.e(a).beginBroadcast();
        SecurityService.a(a, i);
        while (i > 0) 
        {
            i--;
            try
            {
                ((c)SecurityService.e(a).getBroadcastItem(i)).a(SecurityService.h(a), SecurityService.i(a), SecurityService.j(a), b(SecurityService.c(a)));
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
        }
        SecurityService.e(a).finishBroadcast();
        return;
_L7:
        int j = SecurityService.a(a).beginBroadcast();
        SecurityService.b(a, j);
        while (j > 0) 
        {
            j--;
            try
            {
                ((b)SecurityService.a(a).getBroadcastItem(j)).a(SecurityService.k(a));
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
        }
        SecurityService.a(a).finishBroadcast();
        return;
    }

    public (SecurityService securityservice, Looper looper)
    {
        a = securityservice;
        super(looper);
    }
}
