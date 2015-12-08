// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p.bz.j;
import p.cw.c;
import p.df.a;

public class b
{

    public static volatile b a = new b();
    BroadcastReceiver b;

    private b()
    {
    }

    public void a()
    {
        com.pandora.android.provider.b b1 = com.pandora.android.provider.b.a;
        b = new BroadcastReceiver(b1) {

            final com.pandora.android.provider.b a;
            final b b;

            public void onReceive(Context context, Intent intent)
            {
                boolean flag = true;
                context = a.b().d();
                if (context.u() == p.cw.a.a)
                {
                    return;
                }
                if (intent.getExtras().getInt("state", 0) < 1)
                {
                    flag = false;
                }
                p.df.a.c("HeadsetMonitor", (new StringBuilder()).append("headset plug state changed. plugged = ").append(flag).toString());
                if (!flag && !com.pandora.android.provider.b.a.c().h())
                {
                    context.b(p.cw.c.a);
                }
                a.e().a(new j(flag));
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        };
        b1.h().registerReceiver(b, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void b()
    {
        if (b != null)
        {
            com.pandora.android.provider.b.a.h().unregisterReceiver(b);
            b = null;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

}
