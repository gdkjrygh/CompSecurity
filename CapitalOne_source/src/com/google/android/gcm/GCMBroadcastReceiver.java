// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.gcm:
//            GCMBaseIntentService

public class GCMBroadcastReceiver extends BroadcastReceiver
{

    private static final String TAG = "GCMBroadcastReceiver";

    public GCMBroadcastReceiver()
    {
    }

    protected String getGCMIntentServiceClassName(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(".GCMIntentService").toString();
    }

    public final void onReceive(Context context, Intent intent)
    {
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("onReceive: ").append(intent.getAction()).toString());
        String s = getGCMIntentServiceClassName(context);
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("GCM IntentService class: ").append(s).toString());
        GCMBaseIntentService.runIntentInService(context, intent, s);
        setResult(-1, null, null);
    }
}
