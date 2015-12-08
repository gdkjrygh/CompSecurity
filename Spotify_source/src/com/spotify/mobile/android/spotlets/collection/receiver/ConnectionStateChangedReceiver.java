// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;

public class ConnectionStateChangedReceiver extends BroadcastReceiver
{

    public ConnectionStateChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = intent.getBooleanExtra("connected", false);
        if (flag)
        {
            AnnotateService.a(context);
        }
    }
}
