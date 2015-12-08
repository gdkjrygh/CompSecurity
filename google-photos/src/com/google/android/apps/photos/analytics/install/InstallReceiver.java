// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.analytics.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dtq;
import mtj;

public final class InstallReceiver extends BroadcastReceiver
{

    public InstallReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            mtj.a(context, new dtq(intent.getStringExtra("referrer")));
        }
    }
}
