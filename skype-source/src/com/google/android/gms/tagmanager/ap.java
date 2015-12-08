// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            by

class ap extends BroadcastReceiver
{

    static final String a = com/google/android/gms/tagmanager/ap.getName();
    private final by b;

    ap(by by1)
    {
        b = by1;
    }

    public static void a(Context context)
    {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(a, true);
        context.sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            Bundle bundle = intent.getExtras();
            context = Boolean.FALSE;
            if (bundle != null)
            {
                context = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            intent = b;
            boolean flag;
            if (!context.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.a(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(a))
        {
            b.b();
            return;
        }
    }

}
