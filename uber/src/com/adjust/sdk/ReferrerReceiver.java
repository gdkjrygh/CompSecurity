// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ReferrerReceiver extends BroadcastReceiver
{

    protected static final String REFERRER_KEY = "AdjustInstallReferrer";

    public ReferrerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        if (intent == null)
        {
            return;
        }
        try
        {
            intent = URLDecoder.decode(intent, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = "malformed";
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("AdjustInstallReferrer", intent).commit();
    }
}
