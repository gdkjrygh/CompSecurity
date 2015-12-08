// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.tagmanager:
//            s, InstallReferrerService

public final class InstallReferrerReceiver extends BroadcastReceiver
{

    public InstallReferrerReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s1 = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || s1 == null)
        {
            return;
        } else
        {
            s.a(s1);
            intent = new Intent(context, com/google/android/gms/tagmanager/InstallReferrerService);
            intent.putExtra("referrer", s1);
            context.startService(intent);
            return;
        }
    }
}
