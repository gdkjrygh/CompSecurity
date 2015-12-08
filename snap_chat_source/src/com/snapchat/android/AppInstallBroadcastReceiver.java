// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ko;

// Referenced classes of package com.snapchat.android:
//            Timber

public class AppInstallBroadcastReceiver extends BroadcastReceiver
{

    private final ko a;

    public AppInstallBroadcastReceiver()
    {
        this(ko.a());
    }

    AppInstallBroadcastReceiver(ko ko1)
    {
        a = ko1;
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("referrer");
        Timber.c("AppInstallBroadcastReceiver", (new StringBuilder("Referrer received! ")).append(context).toString(), new Object[0]);
        a.a = context;
    }
}
