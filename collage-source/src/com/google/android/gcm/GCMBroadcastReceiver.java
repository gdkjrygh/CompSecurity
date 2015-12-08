// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.gcm:
//            a, GCMBaseIntentService

public class GCMBroadcastReceiver extends BroadcastReceiver
{

    private static boolean a = false;

    public GCMBroadcastReceiver()
    {
    }

    static final String b(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(".GCMIntentService").toString();
    }

    protected String a(Context context)
    {
        return b(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("onReceive: ").append(intent.getAction()).toString());
        if (!a)
        {
            a = true;
            com.google.android.gcm.a.a(getClass().getName());
        }
        String s = a(context);
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("GCM IntentService class: ").append(s).toString());
        GCMBaseIntentService.a(context, intent, s);
        setResult(-1, null, null);
    }

}
