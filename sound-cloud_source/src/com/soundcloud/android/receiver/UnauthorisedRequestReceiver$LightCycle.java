// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.receiver:
//            UnauthorisedRequestReceiver

public static class  extends DefaultActivityLightCycle
{

    private UnauthorisedRequestReceiver unauthoriedRequestReceiver;

    private void safeUnregisterReceiver(AppCompatActivity appcompatactivity, BroadcastReceiver broadcastreceiver)
    {
        try
        {
            appcompatactivity.unregisterReceiver(broadcastreceiver);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AppCompatActivity appcompatactivity)
        {
            ErrorUtils.handleSilentException("Couldnt unregister receiver", appcompatactivity);
        }
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        unauthoriedRequestReceiver = new UnauthorisedRequestReceiver(appcompatactivity.getApplicationContext(), appcompatactivity.getSupportFragmentManager());
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        safeUnregisterReceiver(appcompatactivity, unauthoriedRequestReceiver);
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        appcompatactivity.registerReceiver(unauthoriedRequestReceiver, new IntentFilter(com.soundcloud.android.ghtCycle.unauthoriedRequestReceiver));
    }

    public ()
    {
    }
}
