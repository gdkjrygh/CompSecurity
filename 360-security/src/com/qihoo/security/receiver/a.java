// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

public class com.qihoo.security.receiver.a
{
    private class a extends BroadcastReceiver
    {

        final com.qihoo.security.receiver.a a;
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

        private a()
        {
            a = com.qihoo.security.receiver.a.this;
            super();
            b = null;
        }

    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    private Context a;
    private a b;
    private b c;

    public com.qihoo.security.receiver.a(Context context)
    {
        a = context;
        b = new a();
    }

    static b a(com.qihoo.security.receiver.a a1)
    {
        return a1.c;
    }

    private void a()
    {
        if (((PowerManager)a.getSystemService("power")).isScreenOn())
        {
            if (c != null)
            {
                c.b();
            }
        } else
        if (c != null)
        {
            c.c();
            return;
        }
    }

    private void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("android.intent.action.USER_PRESENT");
        a.registerReceiver(b, intentfilter);
    }

    public void a(b b1)
    {
        c = b1;
        b();
        a();
    }
}
