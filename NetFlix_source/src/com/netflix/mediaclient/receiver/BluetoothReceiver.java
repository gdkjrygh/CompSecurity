// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;

public class BluetoothReceiver extends BroadcastReceiver
{

    private static final String TAG = "nf_bluetooth";

    public BluetoothReceiver()
    {
    }

    private void handleBluetoothConnectionStateChange(Context context)
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()))
        {
            intent = intent.getExtras();
            if (intent != null)
            {
                if (intent.getInt("android.bluetooth.adapter.extra.CONNECTION_STATE") == 2 || intent.getInt("android.bluetooth.adapter.extra.CONNECTION_STATE") == 0)
                {
                    Log.d("nf_bluetooth", (new StringBuilder()).append("ACTION_STATE_CHANGED - EXTRA_CONNECTION_STATE = ").append(intent.getInt("android.bluetooth.adapter.extra.CONNECTION_STATE")).toString());
                    handleBluetoothConnectionStateChange(context);
                }
                return;
            } else
            {
                Log.d("nf_bluetooth", "extras null - ignoring event");
                return;
            }
        } else
        {
            Log.w("nf_bluetooth", (new StringBuilder()).append("We received action that we were not expecting: ").append(intent.getAction()).toString());
            return;
        }
    }
}
