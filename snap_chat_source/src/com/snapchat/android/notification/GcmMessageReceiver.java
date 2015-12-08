// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.snapchat.android.Timber;
import lo;

// Referenced classes of package com.snapchat.android.notification:
//            GcmIntentService

public class GcmMessageReceiver extends WakefulBroadcastReceiver
{

    public GcmMessageReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        StringBuilder stringbuilder = (new StringBuilder("onReceive intent=")).append(intent).append(", extras=");
        android.os.Bundle bundle;
        if (intent == null)
        {
            bundle = null;
        } else
        {
            bundle = intent.getExtras();
        }
        Timber.c("GcmMessageReceiver", stringbuilder.append(bundle).toString(), new Object[0]);
        a(context, intent.setComponent(new ComponentName(context.getPackageName(), com/snapchat/android/notification/GcmIntentService.getName())));
        setResultCode(-1);
        context = intent.getStringExtra("type");
        lo.a();
        lo.b(context);
    }
}
