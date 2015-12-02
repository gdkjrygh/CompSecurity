// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.receiver:
//            a

private class <init> extends BroadcastReceiver
{

    final a a;
    private String b;

    public void onReceive(Context context, Intent intent)
    {
        b = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(b))
        {
            com.qihoo.security.receiver.a.a(a).b();
        } else
        {
            if ("android.intent.action.SCREEN_OFF".equals(b))
            {
                com.qihoo.security.receiver.a.a(a).c();
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(b))
            {
                com.qihoo.security.receiver.a.a(a).a();
                return;
            }
        }
    }

    private r(a a1)
    {
        a = a1;
        super();
        b = null;
    }

    b(a a1, b b1)
    {
        this(a1);
    }
}
