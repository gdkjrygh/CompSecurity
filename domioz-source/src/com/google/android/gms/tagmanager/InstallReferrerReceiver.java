// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.tagmanager:
//            x, InstallReferrerService

public final class InstallReferrerReceiver extends BroadcastReceiver
{

    public InstallReferrerReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || s == null)
        {
            return;
        } else
        {
            x.a(s);
            intent = new Intent(context, com/google/android/gms/tagmanager/InstallReferrerService);
            intent.putExtra("referrer", s);
            context.startService(intent);
            return;
        }
    }
}
