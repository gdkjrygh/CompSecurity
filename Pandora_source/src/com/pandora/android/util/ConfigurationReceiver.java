// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.e;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import p.cw.c;
import p.dd.an;

public class ConfigurationReceiver extends BroadcastReceiver
{

    public ConfigurationReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("com.pandora.android.intent.action.RECEIVE_CONFIG") || intent.getExtras() == null)
        {
            return;
        } else
        {
            (new e(b.a.h())).a(intent.getExtras());
            context = b.a.b().k();
            context.c(null);
            context.d(null);
            b.a.b().b(this);
            b.a.b().m().a(true);
            return;
        }
    }

    public void onSignInState(an an1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[an1.b.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        default:
            return;

        case 4: // '\004'
            b.a.b().c(this);
            break;
        }
        an1 = b.a.h();
        PendingIntent pendingintent = PendingIntent.getActivity(an1, 0x1e240, an1.getPackageManager().getLaunchIntentForPackage(an1.getPackageName()), 0x10000000);
        ((AlarmManager)an1.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1500L, pendingintent);
        b.a.C().a(new PandoraIntent("cmd_shutdown"));
    }
}
