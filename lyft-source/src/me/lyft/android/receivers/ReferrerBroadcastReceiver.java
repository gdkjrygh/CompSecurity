// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.common.Strings;

public class ReferrerBroadcastReceiver extends BroadcastReceiver
{

    ILyftPreferences preferences;

    public ReferrerBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        LyftApplication.getInstance(context).inject(this);
        if (Strings.isNullOrEmpty(preferences.getInstallReferrer()))
        {
            context = intent.getStringExtra("referrer");
            if (!Strings.isNullOrEmpty(context))
            {
                preferences.setInstallReferrer(context);
            }
        }
    }
}
