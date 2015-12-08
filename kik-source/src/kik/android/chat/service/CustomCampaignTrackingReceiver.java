// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import kik.a.h.j;
import org.c.b;
import org.c.c;

public class CustomCampaignTrackingReceiver extends BroadcastReceiver
{

    private static final b a = c.a("CampaignTracking");

    public CustomCampaignTrackingReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (context == null)
        {
            a.a("context unexpectedly null");
        } else
        {
            if (intent == null)
            {
                a.a("intent unexpectedly null");
                return;
            }
            intent = intent.getStringExtra("referrer");
            context = context.getSharedPreferences("KikUltraPersistence", 0);
            if (context.getLong("kik.install_date", -1L) == -1L)
            {
                context = context.edit();
                context.putLong("kik.install_date", j.b());
                if (intent != null)
                {
                    context.putString("kik.install_referrer", intent);
                }
                context.commit();
                return;
            }
        }
    }

}
