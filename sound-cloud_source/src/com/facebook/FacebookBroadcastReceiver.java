// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.N;

public class FacebookBroadcastReceiver extends BroadcastReceiver
{

    public FacebookBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String s = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        if (context != null && s != null)
        {
            intent.getExtras();
            N.d(intent);
        }
    }
}
