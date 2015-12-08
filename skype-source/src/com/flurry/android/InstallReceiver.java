// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.cy;
import com.flurry.sdk.eo;
import com.flurry.sdk.fe;

public final class InstallReceiver extends BroadcastReceiver
{

    static final String a = com/flurry/android/InstallReceiver.getSimpleName();

    public InstallReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        eo.a(4, a, (new StringBuilder("Received an Install nofication of ")).append(intent.getAction()).toString());
        String s = intent.getExtras().getString("referrer");
        eo.a(4, a, (new StringBuilder("Received an Install referrer of ")).append(s).toString());
        if (s == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            eo.a(5, a, "referrer is null");
            return;
        }
        intent = s;
        if (!s.contains("="))
        {
            eo.a(4, a, (new StringBuilder("referrer is before decoding: ")).append(s).toString());
            intent = fe.c(s);
            eo.a(4, a, (new StringBuilder("referrer is: ")).append(intent).toString());
        }
        (new cy(context)).a(intent);
    }

}
