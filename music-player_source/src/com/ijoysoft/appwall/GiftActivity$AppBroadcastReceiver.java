// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

// Referenced classes of package com.ijoysoft.appwall:
//            GiftActivity

public class a extends BroadcastReceiver
{

    final GiftActivity a;
    private final String b = "android.intent.action.PACKAGE_ADDED";
    private final String c = "android.intent.action.PACKAGE_REMOVED";

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(context))
        {
            Log.i("changle-rece", "add");
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(context))
        {
            Log.i("changle-rece", intent.getDataString());
            context = a.getSharedPreferences("settings", 0).edit();
            context.n("packageName", true);
            context.n();
        }
    }

    public (GiftActivity giftactivity)
    {
        a = giftactivity;
        super();
    }
}
