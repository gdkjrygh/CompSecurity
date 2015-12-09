// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.home.ui:
//            HomeActivity

class <init> extends BroadcastReceiver
{

    final HomeActivity a;

    public void onReceive(Context context, Intent intent)
    {
        LocalBroadcastManager.getInstance(a).unregisterReceiver(HomeActivity.b(a));
        context = a.getString(0x7f080286);
        s.a(a, context, 1).i();
    }

    oadcastManager(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
