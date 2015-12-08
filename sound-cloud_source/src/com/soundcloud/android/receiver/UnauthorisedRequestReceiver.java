// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.api.UnauthorisedRequestRegistry;
import com.soundcloud.android.dialog.TokenExpiredDialogFragment;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

public class UnauthorisedRequestReceiver extends BroadcastReceiver
{
    public static class LightCycle extends DefaultActivityLightCycle
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
            appcompatactivity.registerReceiver(unauthoriedRequestReceiver, new IntentFilter(com.soundcloud.android.Consts.GeneralIntents.UNAUTHORIZED));
        }

        public LightCycle()
        {
        }
    }


    private final FragmentManager fragmentManager;
    private final UnauthorisedRequestRegistry requestRegistry;
    private final TokenExpiredDialogFragment tokenExpiredDialog;

    public UnauthorisedRequestReceiver(Context context, FragmentManager fragmentmanager)
    {
        this(UnauthorisedRequestRegistry.getInstance(context), fragmentmanager, new TokenExpiredDialogFragment());
    }

    protected UnauthorisedRequestReceiver(UnauthorisedRequestRegistry unauthorisedrequestregistry, FragmentManager fragmentmanager, TokenExpiredDialogFragment tokenexpireddialogfragment)
    {
        requestRegistry = unauthorisedrequestregistry;
        fragmentManager = fragmentmanager;
        tokenExpiredDialog = tokenexpireddialogfragment;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (requestRegistry.timeSinceFirstUnauthorisedRequestIsBeyondLimit().booleanValue())
        {
            requestRegistry.clearObservedUnauthorisedRequestTimestamp();
            if (fragmentManager.findFragmentByTag("TokenExpiredDialog") == null)
            {
                tokenExpiredDialog.show(fragmentManager, "TokenExpiredDialog");
            }
        }
    }
}
