// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.push;

import android.content.Context;
import android.content.Intent;

public class WLBroadcastReceiver extends com.worklight.wlclient.push.WLBroadcastReceiver
{

    public WLBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        setServiceName((new StringBuilder()).append(context.getPackageName()).append(".GCMIntentService").toString());
        super.onReceive(context, intent);
    }
}
