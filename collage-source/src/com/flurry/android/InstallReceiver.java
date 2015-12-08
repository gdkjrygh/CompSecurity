// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.er;
import com.flurry.sdk.gd;
import com.flurry.sdk.hp;

public final class InstallReceiver extends BroadcastReceiver
{

    static final String a = com/flurry/android/InstallReceiver.getSimpleName();

    public InstallReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        gd.a(4, a, (new StringBuilder()).append("Received an Install nofication of ").append(intent.getAction()).toString());
        String s = intent.getExtras().getString("referrer");
        gd.a(4, a, (new StringBuilder()).append("Received an Install referrer of ").append(s).toString());
        if (s == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            gd.a(5, a, "referrer is null");
            return;
        }
        intent = s;
        if (!s.contains("="))
        {
            gd.a(4, a, (new StringBuilder()).append("referrer is before decoding: ").append(s).toString());
            intent = hp.d(s);
            gd.a(4, a, (new StringBuilder()).append("referrer is: ").append(intent).toString());
        }
        (new er(context)).a(intent);
    }

}
