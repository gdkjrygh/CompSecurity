// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NetworkChangeReceiver extends BroadcastReceiver
{

    public NetworkChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.sendBroadcast(new Intent("INTERNET_LOST"));
    }
}
