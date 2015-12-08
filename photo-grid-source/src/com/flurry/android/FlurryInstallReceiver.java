// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.hj;
import com.flurry.sdk.kc;
import com.flurry.sdk.lp;

public final class FlurryInstallReceiver extends BroadcastReceiver
{

    static final String a = com/flurry/android/FlurryInstallReceiver.getSimpleName();

    public FlurryInstallReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        kc.a(4, a, (new StringBuilder("Received an Install nofication of ")).append(intent.getAction()).toString());
        String s = intent.getExtras().getString("referrer");
        kc.a(4, a, (new StringBuilder("Received an Install referrer of ")).append(s).toString());
        if (s == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
        {
            kc.a(5, a, "referrer is null");
            return;
        }
        intent = s;
        if (!s.contains("="))
        {
            kc.a(4, a, (new StringBuilder("referrer is before decoding: ")).append(s).toString());
            intent = lp.d(s);
            kc.a(4, a, (new StringBuilder("referrer is: ")).append(intent).toString());
        }
        (new hj(context)).a(intent);
    }

}
