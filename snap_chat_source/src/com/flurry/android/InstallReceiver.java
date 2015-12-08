// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.cy;
import com.flurry.sdk.el;
import com.flurry.sdk.fb;

public final class InstallReceiver extends BroadcastReceiver
{

    static final String a = com/flurry/android/InstallReceiver.getSimpleName();

    public InstallReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        el.a(4, a, (new StringBuilder("Received an Install nofication of ")).append(intent.getAction()).toString());
        String s = intent.getExtras().getString("referrer");
        el.a(4, a, (new StringBuilder("Received an Install referrer of ")).append(s).toString());
        if (s == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            el.a(5, a, "referrer is null");
            return;
        }
        intent = s;
        if (!s.contains("="))
        {
            el.a(4, a, (new StringBuilder("referrer is before decoding: ")).append(s).toString());
            intent = fb.c(s);
            el.a(4, a, (new StringBuilder("referrer is: ")).append(intent).toString());
        }
        (new cy(context)).a(intent);
    }

}
