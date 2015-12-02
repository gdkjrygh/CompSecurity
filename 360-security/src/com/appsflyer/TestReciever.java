// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TestReciever extends BroadcastReceiver
{

    public TestReciever()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i("AppsFlyer_1.5.3", "test dummy receiver - in onReceive");
        try
        {
            Thread.sleep(2000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }
}
