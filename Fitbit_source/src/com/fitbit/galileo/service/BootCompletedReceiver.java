// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.p;
import com.fitbit.widget.b;

public class BootCompletedReceiver extends BroadcastReceiver
{

    private static final String a = "BootCompletedReceiver";

    public BootCompletedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
        {
            com.fitbit.e.a.a("BootCompletedReceiver", "onReceive Intent.ACTION_BOOT_COMPLETED", new Object[0]);
            if (com.fitbit.galileo.a.a.b())
            {
                com.fitbit.e.a.a("BootCompletedReceiver", "Scheduling Galileo background sync after reboot...", new Object[0]);
                TrackerSyncPreferencesSavedState.o();
            }
            com.fitbit.multipledevice.a.a().b();
            if (p.l())
            {
                com.fitbit.e.a.a("BootCompletedReceiver", "Flushing soft tracker data after reboot...", new Object[0]);
                com.fitbit.pedometer.service.a.a(false);
            }
            b.b(context);
        }
    }
}
