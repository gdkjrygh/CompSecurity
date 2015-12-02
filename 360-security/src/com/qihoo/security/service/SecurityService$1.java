// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.security.opti.b.a;

// Referenced classes of package com.qihoo.security.service:
//            SecurityService

class a extends BroadcastReceiver
{

    final SecurityService a;

    public void onReceive(Context context, Intent intent)
    {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()))
        {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                com.qihoo.security.opti.b.a.b(true);
                com.qihoo.security.opti.b.a.a();
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                com.qihoo.security.opti.b.a.b(false);
                com.qihoo.security.opti.b.a.a();
                com.qihoo.security.opti.b.a.b();
                return;
            }
        }
    }

    (SecurityService securityservice)
    {
        a = securityservice;
        super();
    }
}
