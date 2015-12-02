// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.qihoo.security.service:
//            SecurityService

class a extends Handler
{

    final SecurityService a;

    public void handleMessage(Message message)
    {
        SecurityService.a(a, message);
    }

    (SecurityService securityservice, Looper looper)
    {
        a = securityservice;
        super(looper);
    }
}
