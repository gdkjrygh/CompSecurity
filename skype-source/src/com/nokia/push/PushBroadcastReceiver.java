// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nokia.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.nokia.push:
//            b, c, PushBaseIntentService

public class PushBroadcastReceiver extends BroadcastReceiver
{

    private static boolean mReceiverSet = false;
    private final b mLogger = new b("PushBroadcastReceiver", (new StringBuilder("[")).append(getClass().getName()).append("]: ").toString());

    public PushBroadcastReceiver()
    {
    }

    static final String getDefaultIntentServiceClassName(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(".PushIntentService").toString();
    }

    protected String getPushIntentServiceClassName(Context context)
    {
        return getDefaultIntentServiceClassName(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        mLogger.a(2, "onReceive: %s", new Object[] {
            intent.getAction()
        });
        if (!mReceiverSet)
        {
            mReceiverSet = true;
            c.a(context, getClass().getName());
        }
        String s = getPushIntentServiceClassName(context);
        mLogger.a(2, "Push Notifications IntentService class: %s", new Object[] {
            s
        });
        PushBaseIntentService.runIntentInService(context, intent, s);
        setResult(-1, null, null);
    }

}
