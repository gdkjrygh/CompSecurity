// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class PartnerReceiver extends BroadcastReceiver
{

    private static final String EXTRA_LOGGEDIN = "loggedIn";
    private static final String TAG = "nf_receiver";
    private static final String USER_STATUS_REQUEST = "com.netflix.mediaclient.intent.action.USER_STATUS";
    private static final String USER_STATUS_RESPONSE = "com.netflix.mediaclient.intent.action.USER_STATUS_RESPONSE";

    public PartnerReceiver()
    {
    }

    static void broadcastUserStatus(Context context, boolean flag)
    {
        Log.d("nf_receiver", "broadcastUserStatus");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.USER_STATUS_RESPONSE");
        intent.putExtra("loggedIn", flag);
        context.sendBroadcast(intent);
    }

    private void handleUsertatus(Context context, Intent intent)
    {
        Log.d("nf_receiver", "Received user status request");
        boolean flag = PreferenceUtils.getBooleanPref(context, "nf_user_status_loggedin", false);
        if (Log.isLoggable("nf_receiver", 3))
        {
            Log.d("nf_receiver", (new StringBuilder()).append("User is logged in: ").append(flag).toString());
        }
        broadcastUserStatus(context, flag);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_receiver", 3))
        {
            Log.d("nf_receiver", (new StringBuilder()).append("Received an action: ").append(intent.getAction()).toString());
        }
        if ("com.netflix.mediaclient.intent.action.USER_STATUS".equals(intent.getAction()))
        {
            handleUsertatus(context, intent);
            return;
        } else
        {
            Log.w("nf_receiver", (new StringBuilder()).append("Received Unintented action : ").append(intent.getAction()).toString());
            return;
        }
    }
}
