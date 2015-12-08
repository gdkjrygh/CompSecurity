// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.google.analytics.tracking.android:
//            bd

final class t extends BroadcastReceiver
{

    private final bd a;

    t(bd bd1)
    {
        a = bd1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            Bundle bundle = intent.getExtras();
            context = Boolean.FALSE;
            if (bundle != null)
            {
                context = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            intent = a;
            boolean flag;
            if (!context.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.a(flag);
        }
    }
}
